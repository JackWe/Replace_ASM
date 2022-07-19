package com.gw.replace.util

import org.apache.commons.codec.binary.Hex
import java.io.File

/**
 * @Copyright (C), 2020, Great Wall Motors
 * @FileName: ReplaceTransform
 * @Author: 魏滋珑
 * @Date: 2022/7/6 17:47
 * @Description:
 * @History:
 * <author> <time> <version> <desc>
 *
 */
object DigestUtils {

    fun generateJarFileName(jarFile: File): String {
        return getMd5ByFilePath(jarFile) + "_" + jarFile.name
    }

    fun generateClassFileName(classFile: File): String {
        return getMd5ByFilePath(classFile) + "_" + classFile.name
    }

    private fun getMd5ByFilePath(file: File): String {
        return Hex.encodeHexString(file.absolutePath.toByteArray()).substring(0, 8)
    }

}