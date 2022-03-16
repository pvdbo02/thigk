package vn.udn.vku.pvdat.thigk

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {

    private lateinit var btnAdd: FloatingActionButton
    private lateinit var rcvMain: RecyclerView
    private lateinit var adapterMain: AdapterMain
    private lateinit var userList: ArrayList<User>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnAdd = findViewById(R.id.btn_add)
        rcvMain = findViewById(R.id.rcv_main)
        userList = ArrayList()
        for (i in 1..3) {
            userList.add(User("Dat", "0333726518"))
        }
        setupRcv()

    }

    private fun setupRcv() {
        adapterMain = AdapterMain(applicationContext, userList)
        rcvMain.layoutManager = GridLayoutManager(this,1)
        rcvMain.adapter = adapterMain
    }
}