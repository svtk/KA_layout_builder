package com.svtk.ka_layout_builder

import android.support.v7.app.ActionBarActivity
import android.os.Bundle
import android.widget.TextClock

import kotlinx.android.synthetic.activity_main.*

public class MainActivity : ActionBarActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        philadelphiaClock.setTimeZone(TimeZone.PHILADELPHIA)
        spbClock.setTimeZone(TimeZone.SPB)
    }
}