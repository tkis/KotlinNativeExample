package com.example

// Date is probably too simple example, however here's where you'd declare interface for accessing
// stuff like Bluetooth, accelerometer etc.
expect class DateUtils() {
    fun currentDateToString() : String
}