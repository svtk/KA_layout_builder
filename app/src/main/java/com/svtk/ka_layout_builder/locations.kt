package com.svtk.ka_layout_builder

val locations = arrayListOf(
        Location("Berlin", TimeZone.BERLIN),
        Location("Saint Petersburg", TimeZone.SPB)
//        Location("Kotlin (island)", TimeZone.SPB)
)

fun addLocation(location: CharSequence, timeZone: CharSequence): Boolean {
    val l = location.toString()
    val t = parseTimeZone(timeZone.toString())
    if (l.isEmpty() || t == null) return false

    locations.add(Location(l, t))
    return true
}