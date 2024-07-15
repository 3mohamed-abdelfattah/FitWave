package kmp.project.fitwave

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import kmp.project.fitwave.databinding.IntroMainBinding

class IntroActivity : AppCompatActivity() {

    lateinit var binding: IntroMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        binding = IntroMainBinding.inflate(layoutInflater)

        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)

        binding.startBtn.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }

    }
}