package vn.udn.vku.pvdat.thigk
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import java.text.DecimalFormat


class AdapterMain(val context: Context?, val userList: ArrayList<User>): RecyclerView.Adapter<AdapterMain.ViewHolder>() {

    inner class ViewHolder(view: View): RecyclerView.ViewHolder(view) {
        val nameUser: TextView = view.findViewById<TextView>(R.id.item_name)
        val phoneUser: TextView = view.findViewById<TextView>(R.id.item_phone)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.item,parent,false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.nameUser.text = userList[position].nameUser
        holder.phoneUser.text = userList[position].phoneUser
    }

    override fun getItemCount(): Int {
        return userList.size
    }
}