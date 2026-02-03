import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.examenkotlin.Categoria
import com.example.examenkotlin.R
import com.example.examenkotlin.Tasca
import com.example.examenkotlin.TasquesRepository.tasques

class TasquesAdapter(private val dataSet: Array<Tasca>) :
    RecyclerView.Adapter<TasquesAdapter.ViewHolder>() {

    /**
     * Provide a reference to the type of views that you are using
     * (custom ViewHolder)
     */
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        lateinit var tvNom: TextView
        lateinit var tvCategoria: TextView
        lateinit var tvData: TextView
        lateinit var tvEstat: TextView

        lateinit var tasques: Array<Tasca>

        init {
            // Define click listener for the ViewHolder's View
            tvNom = view.findViewById(R.id.tvNom)
            tvCategoria = view.findViewById(R.id.tvCategoria)
            tvData = view.findViewById(R.id.tvData)
            tvEstat = view.findViewById(R.id.tvEstat)
        }
    }
    fun setTasques(novesTasques: List<Tasca>) {

        tasques = novesTasques
    }

    // Create new views (invoked by the layout manager)
    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        // Create a new view, which defines the UI of the list item
        val view = LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.fragment_tasques, viewGroup, false)

        return ViewHolder(view)
    }


    // Replace the contents of a view (invoked by the layout manager)
    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {

        // Get element from your dataset at this position and replace the
        // contents of the view with that element
        val item = dataSet[position]
        viewHolder.tvNom.text
        viewHolder.tvCategoria.text
        viewHolder.tvData.text
        viewHolder.tvEstat.text
    }

    // Return the size of your dataset (invoked by the layout manager)
    override fun getItemCount() = dataSet.size

}