package de.jensklingenberg.basickmm.shared

import de.jensklingenberg.basickmm.shared.test.TestEnvironment

expect class Platform() {
    val platform: String
}

expect object Testgedöns{
    fun getTestEnvironment() : TestEnvironment
}

data class Movie(val title: String, val year: Int, val image: String)
