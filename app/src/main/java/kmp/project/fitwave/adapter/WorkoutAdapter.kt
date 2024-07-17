import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.annotation.NonNull
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import kmp.project.fitwave.activity.WorkoutActivity
import kmp.project.fitwave.databinding.ViewholderWorkoutBinding
import kmp.project.fitwave.domain.Workout

class WorkoutAdapter(private val list: ArrayList<Workout>) :
    RecyclerView.Adapter<WorkoutAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding =
            ViewholderWorkoutBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(@NonNull holder: ViewHolder, position: Int) {
        val workout = list[position]
        holder.binding.titleText.text = workout.title

        val context = holder.itemView.context

        val resId = context.resources.getIdentifier(
            workout.picPath, "drawable", context.packageName
        )

        Glide.with(context)
            .load(resId)
            .into(holder.binding.pic)

        holder.binding.exerciseText.text = workout.lessons.size.toString() + " Exercise"
        holder.binding.kcalText.text = workout.kcal.toString() + " Kcal"
        holder.binding.durationText.text = workout.durationAll

        holder.binding.root.setOnClickListener { view ->
            val intent = Intent(context, WorkoutActivity::class.java)
            intent.putExtra("object", list[position])
            context.startActivity(intent)
        }

    }

    override fun getItemCount(): Int {
        return list.size
    }

    class ViewHolder(val binding: ViewholderWorkoutBinding) : RecyclerView.ViewHolder(binding.root)
}
