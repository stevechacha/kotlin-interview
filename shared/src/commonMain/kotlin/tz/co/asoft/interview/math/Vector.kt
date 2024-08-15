package tz.co.asoft.interview.math

interface Vector {
    val x: Double
    val y: Double

    val magnitude: Double

    fun add(other: Vector): Vector

    fun sub(other: Vector) : Vector

    fun dot(other: Vector): Double
}