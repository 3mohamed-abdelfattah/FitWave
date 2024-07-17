package kmp.project.fitwave.activity

import WorkoutAdapter
import android.os.Bundle
import android.view.WindowManager
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kmp.project.fitwave.databinding.ActivityMainBinding
import kmp.project.fitwave.domain.Lessons
import kmp.project.fitwave.domain.Workout

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        binding = ActivityMainBinding.inflate(layoutInflater)

        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)

        window.setFlags(
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
        )

        binding.view1.setLayoutManager(
            LinearLayoutManager(
                this,
                LinearLayoutManager.HORIZONTAL,
                false
            )
        )
        binding.view1.setAdapter(WorkoutAdapter(getData()))

    }


    private fun getData(): ArrayList<Workout> {
        val list = ArrayList<Workout>()

        list.add(
            Workout(
                "Stretching",
                "Start your day with gentle stretching to awaken your body and mind. Take 21 minutes to cultivate a peaceful mind and strong body.",
                "pic_2",
                230,
                "85 min",
                getLessons_2()
            )
        )
        list.add(
            Workout(
                "Yoga",
                "Begin your morning with yoga to create balance and harmony within. Take 21 minutes to cultivate a peaceful mind and strong body.",
                "pic_3",
                180,
                "65 min",
                getLessons_3()
            )
        )
        list.add(
            Workout(
                "Running",
                "Kickstart your day with a refreshing run. Energize your body and clear your mind. Take 21 minutes to cultivate a peaceful mind and strong body.",
                "pic_0",
                160,
                "9 min",
                getLessons_1()
            )
        )
        list.add(
            Workout(
                "Pilates",
                "Awaken your core and build strength with Pilates. Take 21 minutes to cultivate a peaceful mind and strong body.",
                "pic_4",
                200,
                "50 min",
                getLessons_4()
            )
        )
        list.add(
            Workout(
                "HIIT",
                "Boost your metabolism and burn calories with a high-intensity interval training session. Take 21 minutes to cultivate a peaceful mind and strong body.",
                "pic_5",
                300,
                "30 min",
                getLessons_5()
            )
        )
        list.add(
            Workout(
                "Cycling",
                "Pedal your way to fitness and enjoy the ride. Take 21 minutes to cultivate a peaceful mind and strong body.",
                "pic_6",
                250,
                "45 min",
                getLessons_6()
            )
        )
        list.add(
            Workout(
                "Strength Training",
                "Build muscle and increase your strength with a focused workout. Take 21 minutes to cultivate a peaceful mind and strong body.",
                "pic_7",
                270,
                "70 min",
                getLessons_7()
            )
        )
        list.add(
            Workout(
                "Swimming",
                "Dive into a refreshing swimming session to invigorate your body. Take 21 minutes to cultivate a peaceful mind and strong body.",
                "pic_8",
                220,
                "55 min",
                getLessons_8()
            )
        )

        list.add(
            Workout(
                "Meditation",
                "Calm your mind and find inner peace with a meditation session. Take 21 minutes to cultivate a peaceful mind and strong body.",
                "pic_9",
                50,
                "20 min",
                getLessons_10()
            )
        )


        return list

    }

    private fun getLessons_1(): ArrayList<Lessons> {
        val list = ArrayList<Lessons>()
        list.add(Lessons("Lesson 1", "03:46", "HBPMvKfpgE", "pic_1_1"))
        list.add(Lessons("Lesson 2", "04:41", "K6J2WqiiPw", "pic_1_2"))
        list.add(Lessons("Lesson 3", "01:57", "Zc084YY0EA", "pic_1_3"))
        return list
    }

    private fun getLessons_2(): ArrayList<Lessons> {
        val list = ArrayList<Lessons>()
        list.add(Lessons("Lesson 1", "20:23", "lJeImBAXT7I", "pic_3_1"))
        list.add(Lessons("Lesson 2", "20:27", "47Exgz07FU", "pic_3_2"))
        list.add(Lessons("Lesson 3", "32:25", "OmLx8tmaqQ4", "pic_3_3"))
        list.add(Lessons("Lesson 4", "07:52", "w86EaIoFRY", "pic_3_4"))
        return list
    }

    private fun getLessons_3(): ArrayList<Lessons> {
        val list = ArrayList<Lessons>()
        list.add(Lessons("Lesson 1", "23:00", "v7AYKMP6rOE", "pic_3_1"))
        list.add(Lessons("Lesson 2", "27:00", "EmL2xnoLPYE", "pic_3_2"))
        list.add(Lessons("Lesson 3", "25:00", "v7SN-d4Qx0", "pic_3_3"))
        list.add(Lessons("Lesson 4", "21:00", "LqX628YNj4", "pic_3_4"))
        return list
    }


    private fun getLessons_4(): ArrayList<Lessons> {
        val list = ArrayList<Lessons>()
        list.add(Lessons("Lesson 1", "23:00", "v7AYKMP6rOE", "pic_3_1"))
        list.add(Lessons("Lesson 2", "27:00", "EmL2xnoLPYE", "pic_3_2"))
        list.add(Lessons("Lesson 3", "25:00", "v7SN-d4Qx0", "pic_3_3"))
        list.add(Lessons("Lesson 4", "21:00", "LqX628YNj4", "pic_3_4"))
        return list
    }


    private fun getLessons_5(): ArrayList<Lessons> {
        val list = ArrayList<Lessons>()
        list.add(Lessons("Lesson 1", "23:00", "v7AYKMP6rOE", "pic_3_1"))
        list.add(Lessons("Lesson 2", "27:00", "EmL2xnoLPYE", "pic_3_2"))
        list.add(Lessons("Lesson 3", "25:00", "v7SN-d4Qx0", "pic_3_3"))
        list.add(Lessons("Lesson 4", "21:00", "LqX628YNj4", "pic_3_4"))
        return list
    }


    private fun getLessons_6(): ArrayList<Lessons> {
        val list = ArrayList<Lessons>()
        list.add(Lessons("Lesson 1", "23:00", "v7AYKMP6rOE", "pic_3_1"))
        list.add(Lessons("Lesson 2", "27:00", "EmL2xnoLPYE", "pic_3_2"))
        list.add(Lessons("Lesson 3", "25:00", "v7SN-d4Qx0", "pic_3_3"))
        list.add(Lessons("Lesson 4", "21:00", "LqX628YNj4", "pic_3_4"))
        return list
    }


    private fun getLessons_7(): ArrayList<Lessons> {
        val list = ArrayList<Lessons>()
        list.add(Lessons("Lesson 1", "23:00", "v7AYKMP6rOE", "pic_3_1"))
        list.add(Lessons("Lesson 2", "27:00", "EmL2xnoLPYE", "pic_3_2"))
        list.add(Lessons("Lesson 3", "25:00", "v7SN-d4Qx0", "pic_3_3"))
        list.add(Lessons("Lesson 4", "21:00", "LqX628YNj4", "pic_3_4"))
        return list
    }


    private fun getLessons_8(): ArrayList<Lessons> {
        val list = ArrayList<Lessons>()
        list.add(Lessons("Lesson 1", "23:00", "v7AYKMP6rOE", "pic_3_1"))
        list.add(Lessons("Lesson 2", "27:00", "EmL2xnoLPYE", "pic_3_2"))
        list.add(Lessons("Lesson 3", "25:00", "v7SN-d4Qx0", "pic_3_3"))
        list.add(Lessons("Lesson 4", "21:00", "LqX628YNj4", "pic_3_4"))
        return list
    }


    private fun getLessons_9(): ArrayList<Lessons> {
        val list = ArrayList<Lessons>()
        list.add(Lessons("Lesson 1", "23:00", "v7AYKMP6rOE", "pic_3_1"))
        list.add(Lessons("Lesson 2", "27:00", "EmL2xnoLPYE", "pic_3_2"))
        list.add(Lessons("Lesson 3", "25:00", "v7SN-d4Qx0", "pic_3_3"))
        list.add(Lessons("Lesson 4", "21:00", "LqX628YNj4", "pic_3_4"))
        return list
    }


    private fun getLessons_10(): ArrayList<Lessons> {
        val list = ArrayList<Lessons>()
        list.add(Lessons("Lesson 1", "23:00", "v7AYKMP6rOE", "pic_3_1"))
        list.add(Lessons("Lesson 2", "27:00", "EmL2xnoLPYE", "pic_3_2"))
        list.add(Lessons("Lesson 3", "25:00", "v7SN-d4Qx0", "pic_3_3"))
        list.add(Lessons("Lesson 4", "21:00", "LqX628YNj4", "pic_3_4"))
        return list
    }
}