package com.svtk.ka_layout_builder

import android.app.Activity
import org.jetbrains.anko.*

fun Activity.showAreYouSureAlert(process: () -> Unit) {
    alert("Are you sure you really need another location?", "Are you sure?") {
        positiveButton("Yes") { process() }
        negativeButton("No") { }
    }.show()
}

fun Activity.showAddLocationAlert() {
    alert {
        customView {
            verticalLayout {
                val location = editText { hint = "Location" }
                val timeZone = editText { hint = "Time Zone" }

                positiveButton("Add location") {
                    val result = addLocation(location.text, timeZone.text)
                    if (!result) toast("Location was not added")
                    recreate()
                }
            }
        }
    }.show()
}
