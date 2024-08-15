package tz.co.asoft.interview

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform