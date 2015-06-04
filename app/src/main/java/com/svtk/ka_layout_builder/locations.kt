package com.svtk.ka_layout_builder

import org.jetbrains.anko.text

val locations = arrayListOf(
        Location("Berlin", TimeZone.BERLIN, R.id.berlin),
        Location("Saint Petersburg", TimeZone.SPB, R.id.spb)
//        Location("Kotlin (island)", TimeZone.SPB, R.id.kotlin)
)

fun addLocation(location: CharSequence, timeZone: CharSequence): Boolean {
    val l = location.toString()
    val t = parseTimeZone(timeZone.toString())
    if (l.isEmpty() || t == null) return false

    locations.add(Location(l, t, 0))
    return true
}