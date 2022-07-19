package com.gw.replace.util

import java.io.File

/**
 * @Copyright (C), 2020, Great Wall Motors
 * @FileName: ReplaceTransform
 * @Author: 魏滋珑
 * @Date: 2022/7/6 18:17
 * @Description:
 * @History:
 * <author> <time> <version> <desc>
 *
 */
object ClassUtils {

    private fun isAndroidGeneratedClass(className: String): Boolean {
        return className.contains("R$") ||
                className.contains("R2$") ||
                className.contains("R.class") ||
                className.contains("R2.class") ||
                className.contains("BuildConfig.class") ||
                className.contains("META-INF/") ||
                className.startsWith("android/") ||
                className.startsWith("java/") ||
                className.startsWith("com/google/") ||
                className.startsWith("kotlin/") ||
                className.startsWith("org/intellij/") ||
                className.startsWith("org/jetbrains/") ||
                className == "BuildConfig.class"

//        return !className.endsWith("MainActivity.class")
    }

    fun isLegalJar(file: File): Boolean {
        return file.isFile &&
                file.length() > 0L &&
                file.name != "R.jar" &&
                file.name.endsWith(".jar")
    }

    fun isLegalClass(file: File): Boolean {
        return file.isFile && isLegalClass(file.name)
    }

    fun isLegalClass(fileName: String): Boolean {
        return fileName.endsWith(".class") && !isAndroidGeneratedClass(fileName)
    }

}