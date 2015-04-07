package com.svtk.ka_layout_builder

import android.app.Activity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import kotlinx.android.anko.*


public class DynamicLayoutActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        tableLayout {

            for (location in locations) {
                tableRow {

                    textView(text = location.name).layoutParams(column = 1)

                    textClock {
                        id = location.id
                    }.layoutParams(column = 2) {
                        leftMargin = dip(20)
                    }.setTimeZone(location.timeZone)
                }
            }
        }.style(textSize = 25F)
    }







    fun View.style(textSize: Float) {
        style {
            view: View ->

            when (view) {
                is TextView -> view.textSize = textSize
            }
        }
    }
}

