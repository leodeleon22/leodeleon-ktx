package com.leodeleon.ktx

import android.util.Log

val String.Companion.empty: String get() = ""

fun Any.logd(msg: String = "", tag: String = this.javaClass.simpleName) {
    Log.d(tag, msg)
}

fun Any.loge(msg: String = "", t: Throwable? = null, tag: String = this.javaClass
    .simpleName) {
    Log.e(tag, msg, t)
}
