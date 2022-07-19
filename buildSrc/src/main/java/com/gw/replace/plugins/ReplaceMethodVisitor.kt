package com.gw.replace.plugins

import com.gw.replace.util.Log
import org.objectweb.asm.MethodVisitor
import org.objectweb.asm.Opcodes
import org.objectweb.asm.commons.GeneratorAdapter

/**
 * @Copyright (C), 2020, Great Wall Motors
 * @FileName: ReplaceMethodVisitor
 * @Author: 魏滋珑
 * @Date: 2022/7/14 17:17
 * @Description:
 * @History:
 * <author> <time> <version> <desc>
 *
 */
class ReplaceMethodVisitor(
    api: Int,
    methodVisitor: MethodVisitor?,
    access: Int,
    name: String?,
    descriptor: String?
) : GeneratorAdapter(api, methodVisitor, access, name, descriptor) {

    override fun visitMethodInsn(
        opcode: Int,
        owner: String?,
        name: String?,
        descriptor: String?,
        isInterface: Boolean
    ) {
        if (owner.equals("android/util/Log") && descriptor.equals("(Ljava/lang/String;Ljava/lang/String;)I")) {
            super.visitMethodInsn(
                Opcodes.INVOKESTATIC,
                "com/gw/replace/util/MyLogUtil",
                "v",
                "(Ljava/lang/String;Ljava/lang/String;)I",
                false
            )
            Log.log("wei== ${this.name}")
            return
        }
        super.visitMethodInsn(opcode, owner, name, descriptor, isInterface)
    }

}