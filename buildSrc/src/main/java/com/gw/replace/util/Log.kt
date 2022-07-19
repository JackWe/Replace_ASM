package com.gw.replace.util

import java.util.concurrent.Executors

/**
 * @Copyright (C), 2020, Great Wall Motors
 * @FileName: ReplaceTransform
 * @Author: 魏滋珑
 * @Date: 2022/7/6 17:56
 * @Description:
 * @History:
 * <author> <time> <version> <desc>
 *
 */
object Log {

    private val logThreadExecutor = Executors.newSingleThreadExecutor()

    fun log(log: Any?) {
        logThreadExecutor.submit {
            println("ASM: $log")
        }
    }


    fun v(tag: String?, msg: String?): Int {
//        Log.e("wei=====wei","Replace Success!");
        return 0
    }

}