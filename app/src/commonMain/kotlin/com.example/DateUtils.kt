package com.example

// Date is probably too simple example, however this is how you'd declare interface for accessing
// stuff like Bluetooth, accelerometer etc, or wrappers for some things that might be still not supported
// by the multiplatform library so you need to have a custom iOS implementation
expect class DateUtils() {
    fun currentDateToString() : String
}