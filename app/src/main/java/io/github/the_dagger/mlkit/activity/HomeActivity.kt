package io.github.the_dagger.mlkit.activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import io.github.the_dagger.mlkit.adapter.HomeAdapter
import io.github.the_dagger.mlkit.model.PojoApi
import io.github.the_dagger.mlkit.R
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity() {

    private val apiList by lazy {
        ArrayList<PojoApi>()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        with(apiList) {
            //this list is for create different menus with differents Activities. If you want to load one new activity
            //  1- Add the new ID on the Homeadapter after the ID creditCard
            //  2- Copy and paste last Button line here below the last one added
            //  3- Modify the copied line with the new parameters(IMAGE,TITLE,DESCRIPTION,ID)
            add(PojoApi(R.drawable.tarjetas_credito, getString(R.string.title_text), getString(R.string.desc_text), 0))
           // add(PojoApi(R.drawable.barcode_scanning, getString(R.string.title_barcode), getString(R.string.desc_barcode), 1))

        }

        rvHome.layoutManager = LinearLayoutManager(this)
        rvHome.adapter = HomeAdapter(apiList)
    }
}
