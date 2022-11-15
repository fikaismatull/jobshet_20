package com.example.jobshet20_fika

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    val list = ArrayList<Kelas>()
    val listNama = arrayOf(
        "CHELSIA ADITYA SUYATNO",
        "DIMAS ILHAMSYAH RAMADHAN",
        "DINA MUSTIKA",
        "DWI RANI SYARIFAH",
        "FIFIT SOLIKHATUN MUFALAH",
        "FIKA ISMATUL HAWA",
        "FIKI ZULKARNAIN",
        "HEYDARISTO ZHAHIR RAZAQ",
        "IKHA NUR ROCHAYATIN",
        "IMA AZKA ROSADAH",
        "KHAMILA NUR LUTFI AZZAHRA",
    )

    val listNis = arrayOf(
        "2980",
        "2983",
        "2984",
        "2986",
        "2989",
        "2990",
        "2991",
        "2996",
        "2998",
        "2999",
        "3001",
    )
    lateinit var kelasView: RecyclerView
    lateinit var kelasAdapter: KelasAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        kelasView = findViewById(R.id.kelasView)
        kelasView.layoutManager = LinearLayoutManager(this)

        for (i in listNama.indices) {
            list.add(Kelas(listNama[i],listNis[i]))
        }

        kelasAdapter = KelasAdapter(list)
        kelasAdapter.notifyDataSetChanged()
        kelasView.adapter = kelasAdapter
    }


}