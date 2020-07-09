package com.gzeinnumer.mybaseutilskt

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.gzeinnumer.mybaseutilskt.utils.*

class MainActivity : AppCompatActivity() {

    private val TAG = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
        val value = "Wed, 18 Apr 2012 07:55:29 +0000"

        val reformatMultiArray: String = reformatDate(value, arrayOf(
                F_DAY_NAME, ", ",
                F_DATE, " ",
                F_MONTH_NAME, " ",
                F_YEAR, " ",
                F_HOUR, ":",
                F_MINUTES, ":",
                F_SECOND, " ",
                F_ZONE
        ), arrayOf(
                F_MONTH_NAME, " ",
                F_DATE, ",",
                F_YEAR, " ",
                F_HOUR, ":",
                F_MINUTES, " ",
                F_AM_PM))
        Log.d(TAG, "onCreate:reformatMultiArray $reformatMultiArray")

        val reformatOneString: String = reformatDate(value, "EEE, dd MMM yyyy hh:mm:ss Z", "MMM dd,yyyy hh:mm a")
        Log.d(TAG, "onCreate: $reformatOneString")
    }
}