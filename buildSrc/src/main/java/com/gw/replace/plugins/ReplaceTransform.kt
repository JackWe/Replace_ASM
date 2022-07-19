package com.gw.replace.plugins

import com.gw.replace.base.BaseTransform
import org.objectweb.asm.ClassReader
import org.objectweb.asm.ClassWriter
import org.objectweb.asm.Opcodes

/**
 * @Copyright (C), 2020, Great Wall Motors
 * @FileName: ReplaceTransform
 * @Author: 魏滋珑
 * @Date: 2022/7/6 17:17
 * @Description:
 * @History:
 * <author> <time> <version> <desc>
 *
 */
class ReplaceTransform : BaseTransform() {

    override fun modifyClass(byteArray: ByteArray): ByteArray {
        val classReader = ClassReader(byteArray)

        val classWriter = ClassWriter(classReader, ClassWriter.COMPUTE_MAXS)

        val replaceClassVisitor = ReplaceClassVisitor(Opcodes.ASM7, classWriter)

        classReader.accept(replaceClassVisitor, ClassReader.EXPAND_FRAMES)

        return classWriter.toByteArray()
    }

}