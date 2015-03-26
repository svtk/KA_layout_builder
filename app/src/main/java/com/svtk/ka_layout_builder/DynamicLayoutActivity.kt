package com.svtk.ka_layout_builder

import android.support.v7.app.ActionBarActivity
import android.os.Bundle
import kotlinx.android.koan.*


public class DynamicLayoutActivity : ActionBarActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        tableLayout {
            layoutParams(matchParent, matchParent)
            for (location in locations) {
                tableRow {
                    textView(text = location.name) {
                        layoutParams(column = 1)
                    }

                    val textClock = textClock {
                        id = location.id
                        layoutParams(column = 2) {
                            leftMargin = dip(20)
                        }
                    }
                    textClock.setTimeZone(location.timeZone)
                }
            }
        }
    }
}

