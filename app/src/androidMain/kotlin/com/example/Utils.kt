package com.example

import android.annotation.SuppressLint
import java.text.SimpleDateFormat
import java.util.Date

// And here's where you put implementation that requires you to access some native APIs. Best practice
// is obviously to keep those parts as small as possible and have most of the logic in common part
actual class DateUtils {
    actual fun currentDateToString() : String {
        val format = SimpleDateFormat("yyyy/MM/dd HH:mm")
        return "${format.format(Date())}"
    }
}