package com.example

import android.annotation.SuppressLint
import java.text.SimpleDateFormat
import java.util.Date

actual class DateUtils {
    actual fun currentDateToString() : String {
        val format = SimpleDateFormat("yyyy/MM/dd HH:mm")
        return "${format.format(Date())}"
    }
}