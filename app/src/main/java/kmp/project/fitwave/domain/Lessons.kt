package kmp.project.fitwave.domain

import java.io.Serializable

data class Lessons(
    val title: String,
    val duration: String,
    val link: String,
    val picPath: String
) : Serializable
