package tz.co.asoft.interview

import tz.co.asoft.interview.math.Vector
import tz.co.asoft.interview.math.i
import tz.co.asoft.interview.math.j
import kotlin.test.Test
import kotlin.test.assertEquals

class VectorTest {
    @Test
    fun should_be_able_to_construct_a_vector() {
        Vector(1, 3)
    }

    @Test
    fun should_be_able_to_equate_two_vectors() {
        assertEquals(Vector(1,2), Vector(1,2))
    }

    @Test
    fun should_be_able_to_add_two_vectors() {
        assertEquals(Vector(4,6), Vector(1,2) + Vector(3,4))
    }

    @Test
    fun should_be_able_to_subtract_two_vectors() {
        assertEquals(Vector(-2,-2), Vector(1,2) - Vector(3,4))
    }

    @Test
    fun should_be_able_to_calculate_the_dot_product_of_two_vectors() {
        assertEquals(10.0, Vector(1,2).dot(Vector(3,4)))
    }

    @Test
    fun should_be_able_to_use_the_normal_notation() {
        val v1 = 2.i - 4.j
        val v2 = -3.i + 5.j

        val v3 = v1 + v2
        assertEquals(Vector(-1,1), v3)
    }

    @Test
    fun should_be_able_to_calculate_the_magnitude_of_a_vector() {
        assertEquals(5.0, Vector(3,4).magnitude)
    }
}