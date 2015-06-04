package com.svtk.ka_layout_builder

object TimeZone {
    val BERLIN = "Etc/GMT-2"
    val SPB = "Etc/GMT-3"
}

fun parseTimeZone(timeZone: String): String? {
    if (!timeZone.startsWith("GMT")) return null
    val c = if (timeZone.length() > 4) timeZone.charAt(3) else return null
    if (c != '+' && c != '-') return null
    val shift = timeZone.substring(4)
    try {
        shift.toInt()
    }
    catch (e: NumberFormatException) {
        return null
    }
    return "Etc/GMT${if (c == '+') '-' else '+'}$shift"
}

val timeZones = listOf("GMT+2", "GMT+3")