package tz.co.asoft.interview

class Greeting {
    private val platform = getPlatform()

    fun greet(name: String = platform.name): String {
        return "Hello, ${name}!,\nWelcome to the aSoft Dev Interview"
    }
}