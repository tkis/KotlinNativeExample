package com.example

import platform.Foundation.*

// And here's where you put implementation that requires you to access some native APIs. Best practice
// is obviously to keep those parts as small as possible and have most of the logic in common part
actual class DateUtils {
    actual fun currentDateToString() : String {
        val date = NSDate()
        val formatter = NSDateFormatter()
        formatter.dateFormat = "yyyy/MM/dd HH:mm"
        return formatter.stringFromDate(date)
    }
}