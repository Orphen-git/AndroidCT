package com.example.androidct.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.androidct.R
import com.example.androidct.adapters.AppAdapter
import com.example.androidct.models.AppModel
import com.example.androidct.models.listOfApps
import com.facebook.drawee.backends.pipeline.Fresco
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        _buttonGenre.setOnClickListener {
            val appList = listOfApps
            appList.sort()
            println(appList)
            Log.d("Debug1", listOfApps.toString())
        }

        _buttonAnnee.setOnClickListener {
            Log.e("Debug2", listOfApps.toString())
        }

        _searchButton.setOnClickListener {
            val intent = Intent(this, SearchActivity::class.java)
            startActivity(intent)
        }


        Fresco.initialize(this)

        _appRecyclerView.apply {

            layoutManager = LinearLayoutManager(context)
    //        refreshList()


        }
    }

    //  override fun refreshList() {
    //      _appRecyclerView.adapter = AppAdapter(
    //          AppModel.
    //      )


}

private fun <E> List<E>.sort() {
}

