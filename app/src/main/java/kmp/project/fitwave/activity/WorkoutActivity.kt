package kmp.project.fitwave.activity

import android.os.Bundle
import android.view.WindowManager
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.bumptech.glide.Glide
import kmp.project.fitwave.adapter.LessonAdapter
import kmp.project.fitwave.databinding.ActivityWorkoutBinding
import kmp.project.fitwave.domain.Workout

class WorkoutActivity : AppCompatActivity() {

    private lateinit var binding: ActivityWorkoutBinding
    private var workout: Workout? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityWorkoutBinding.inflate(layoutInflater)
        setContentView(binding.root)

        enableEdgeToEdge()

        window.setFlags(
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
        )

        getObject()
        setVariable()
    }

    private fun getObject() {
        workout = intent.getSerializableExtra("object") as? Workout
    }

    private fun setVariable() {
        workout?.let { workout ->
            val resId = resources.getIdentifier(workout.picPath, "drawable", packageName)
            Glide.with(this)
                .load(resId)
                .into(binding.pic)

            binding.backBtn.setOnClickListener { finish() }
            binding.titleText.text = workout.title
            binding.exerciseText.text = "${workout.lessons.size} Exercise"
            binding.kcalText.text = "${workout.kcal} Kcal"
            binding.durationText.text = workout.durationAll
            binding.descrptionText.text = workout.description

            binding.view3.layoutManager =
                LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
            binding.view3.adapter = LessonAdapter(workout.lessons)
        }
    }
}
