@file:Suppress("NULLABILITY_MISMATCH_BASED_ON_JAVA_ANNOTATIONS")

package com.gzeinnumer.mybaseutilskt.utils

import android.annotation.SuppressLint
import java.text.ParseException
import java.text.SimpleDateFormat
import java.util.*

var F_YEAR = "yyyy"
var F_MONTH_NUMBER = "MM" //01, 11
var F_MONTH_NAME = "MMM" //Jul, Jan, Jun
var F_MONTH_NAME_FULL = "MMMMM" //July, Juni
var F_DATE_NO_ZERO = "d" //01, 05, 10
var F_DATE = "dd" //01, 05, 10
var F_DAY_NAME = "EEE" //Wed Thu
var F_HOUR = "hh" //1-23
var F_MINUTES = "mm" //1-60
var F_SECOND = "ss" //1-60
var F_AM_PM = "a" //AM PM
var F_ZONE = "z" //GMT

@SuppressLint("SimpleDateFormat")
fun reformatDate(
    old: String,
    from: Array<String>,
    to: Array<String>
): String {
    val patternFrom = StringBuilder()
    for (s in from) patternFrom.append(s)
    var format = SimpleDateFormat(patternFrom.toString())
    var newDate: Date? = null
    try { newDate = format.parse(old) } catch (e: ParseException) { e.printStackTrace() }
    val patternTo = StringBuilder()
    for (s in to) patternTo.append(s)
    format = SimpleDateFormat(patternTo.toString())
    return if (newDate != null) format.format(newDate) else "Date formater error"
}

@SuppressLint("SimpleDateFormat")
fun reformatDate(old: String, from: String, to: String): String {
    var format = SimpleDateFormat(from)
    var newDate: Date? = null
    try { newDate = format.parse(old) } catch (e: ParseException) { e.printStackTrace() }
    format = SimpleDateFormat(to)
    return if (newDate != null) format.format(newDate) else "Date formater error"
}


@SuppressLint("SimpleDateFormat")
fun getCurrentTime(requestFormat: String?): String? {
    val format = SimpleDateFormat(requestFormat) //dd/MM/yyyy
    val now = Date()
    return format.format(now)
}