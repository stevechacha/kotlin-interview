package tz.co.asoft.interview.math

fun Vector(x: Number, y: Number): Vector = TODO()

inline val Number.i get() = Vector(toDouble(), 0)

inline val Number.j get() = Vector(0, toDouble())