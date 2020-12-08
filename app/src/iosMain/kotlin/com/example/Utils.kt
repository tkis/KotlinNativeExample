package com.example

import platform.Foundation.*

actual class DateUtils {
    actual fun currentDateToString() : String {
        val date = NSDate()
        val formatter = NSDateFormatter()
        formatter.dateFormat = "yyyy/MM/dd HH:mm"
        return formatter.stringFromDate(date)
    }
}