package tz.co.asoft.interview.math

interface Vector {
    val x: Double
    val y: Double

    val magnitude: Double

    operator fun plus(other: Vector): Vector

    operator fun minus(other: Vector) : Vector

    operator fun unaryMinus(): Vector

    fun dot(other: Vector): Double
}