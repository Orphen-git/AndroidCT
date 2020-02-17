package com.example.androidct.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.androidct.R
import com.example.androidct.models.AppModel
import com.facebook.drawee.view.SimpleDraweeView
import kotlinx.android.synthetic.main.app_list.view.*

class AppAdapter(val list: List<AppModel>) :
    RecyclerView.Adapter<AppAdapter.StringViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StringViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(
            R.layout.app_list,
            parent,
            false
        )
        return StringViewHolder(view)
    }

    override fun getItemCount(): Int = list.size


    override fun onBindViewHolder(holder: StringViewHolder, position: Int) {
        holder.bind(list[position])
    }

    inner class StringViewHolder(val view: View) : RecyclerView.ViewHolder(view) {

        fun bind(apps: AppModel) {

            val titre = "${apps.nom}"
            view._nomApp.text = titre

            val genre = "${apps.genre}"
            view._genreApp.text = genre

            val annee = "${apps.anneeSortie}"
            view._anneeApp.text = annee

            val draweeView = view._imageApp as SimpleDraweeView
            draweeView.setImageURI("${apps.imageUrl}")

        }
    }
}