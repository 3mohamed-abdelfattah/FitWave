package kmp.project.fitwave.domain

import java.io.Serializable

class Workout(
    var title: String,
    var description: String,
    var picPath: String,
    var kcal: Int,
    var durationAll: String,
    var lessons: ArrayList<Lessons>

) : Serializable

