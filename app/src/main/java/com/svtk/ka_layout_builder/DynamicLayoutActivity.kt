package com.svtk.ka_layout_builder

import android.app.Activity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import org.jetbrains.anko.*


public class DynamicLayoutActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        verticalLayout {
            tableLayout {

                for (location in locations) {
                    tableRow {
                        textView(text = location.name)
                                .layoutParams(column = 1)

                        val textClock = textClock().layoutParams(column = 2) {
                            leftMargin = dip(20)
                        }

                        textClock.setTimeZone(location.timeZone)
                    }
                }
            }.style(textSize = 25F)

            button("Add location") {
                onClick { showAreYouSureAlert { showAddLocationAlert() } }
            }
        }
    }
}

