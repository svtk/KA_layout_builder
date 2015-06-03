package com.svtk.ka_layout_builder

import android.app.Activity
import android.os.Bundle
import kotlinx.android.synthetic.activity_main.berlinClock
import kotlinx.android.synthetic.activity_main.spbClock

public class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        berlinClock.setTimeZone(TimeZone.BERLIN)
        spbClock.setTimeZone(TimeZone.SPB)
    }
}