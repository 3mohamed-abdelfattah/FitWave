package kmp.project.fitwave.adapter

import android.content.ActivityNotFoundException
import android.content.Context
import android.content.Intent
import android.net.Uri
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import kmp.project.fitwave.databinding.ViewholderExerciseBinding
import kmp.project.fitwave.domain.Lessons

class LessonAdapter(private val list: ArrayList<Lessons>) :
    RecyclerView.Adapter<LessonAdapter.ViewHolder>() {
    private lateinit var context: Context

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        context = parent.context
        val binding =
            ViewholderExerciseBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: LessonAdapter.ViewHolder, position: Int) {
        with(holder.binding) {
            titleText.text = list[position].title
            durationText.text = list[position].duration

            val resId = context.resources.getIdentifier(
                list[position].picPath, "drawable", context.packageName
            )
            Glide.with(context)
                .load(resId)
                .into(pic)

            root.setOnClickListener {
                val appIntent =
                    Intent(Intent.ACTION_VIEW, Uri.parse("vnd.youtube:" + list[position].link))
                val webIntent = Intent(
                    Intent.ACTION_VIEW,
                    Uri.parse("http://www.youtube.com/watch?v=" + list[position].link)
                )
                try {
                    context.startActivity(appIntent)
                } catch (ex: ActivityNotFoundException) {
                    context.startActivity(webIntent)
                }
            }
        }
    }

    override fun getItemCount(): Int {
        return list.size
    }

    class ViewHolder(binding: ViewholderExerciseBinding) : RecyclerView.ViewHolder(binding.root) {
        val binding = binding
    }

}
