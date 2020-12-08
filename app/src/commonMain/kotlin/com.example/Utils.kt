package com.example

class Utils {
    fun helloWorld() : String {
        val dateUtils = DateUtils()
        // Get current date from utils since it's platform-specific
        val currentDateToString = dateUtils.currentDateToString()
        // Use common logic to process the data received from calls to platform-specific parts
        return "Hello! Current time is: $currentDateToString"
    }
}