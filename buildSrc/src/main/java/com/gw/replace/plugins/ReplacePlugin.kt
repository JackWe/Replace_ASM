package com.gw.replace.plugins

import com.android.build.gradle.AppExtension
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.getByType

/**
 * @Copyright (C), 2020, Great Wall Motors
 * @FileName: ReplacePlugin
 * @Author: 魏滋珑
 * @Date: 2022/7/6 16:54
 * @Description:
 * @History:
 * <author> <time> <version> <desc>
 *
 */
class ReplacePlugin : Plugin<Project>{

    override fun apply(target: Project) {

        println("I Am ReplacePlugin!")

        val appExtension: AppExtension = target.extensions.getByType()
        appExtension.registerTransform(ReplaceTransform())
    }

}