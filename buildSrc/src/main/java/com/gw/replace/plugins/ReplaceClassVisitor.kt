package com.gw.replace.plugins

import org.objectweb.asm.ClassVisitor
import org.objectweb.asm.MethodVisitor
import org.objectweb.asm.Opcodes


/**
 * @Copyright (C), 2020, Great Wall Motors
 * @FileName: ReplaceClassVisitor
 * @Author: 魏滋珑
 * @Date: 2022/7/14 17:10
 * @Description:
 * @History:
 * <author> <time> <version> <desc>
 *
 */
class ReplaceClassVisitor(api: Int, classVisitor: ClassVisitor) : ClassVisitor(api, classVisitor) {

    override fun visitMethod(
        access: Int,
        name: String?,
        descriptor: String?,
        signature: String?,
        exceptions: Array<out String>?
    ): MethodVisitor {
        val methodVisitor = super.visitMethod(access, name, descriptor, signature, exceptions)
        return ReplaceMethodVisitor(api, methodVisitor, access, name, descriptor)
    }
}