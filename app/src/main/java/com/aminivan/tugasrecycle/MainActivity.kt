package com.aminivan.tugasrecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.aminivan.tugasrecycle.adapter.AdapterProvinsi
import com.aminivan.tugasrecycle.adapter.DataProvinsi
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        cvSumatra.setOnClickListener(){
            setSumatra()
        }

        cvKalimantan.setOnClickListener(){
            setKalimantan()
        }
        cvJawa.setOnClickListener(){
            setJawa()
        }
        cvNusa.setOnClickListener(){
            setBali()
        }
        cvSulawesi.setOnClickListener(){
            setSulawesi()
        }
        cvMaluku.setOnClickListener(){
            setMaluku()
        }
        cvPapua.setOnClickListener(){
            setPapua()
        }
    }


    fun setSumatra(){
        val listProvinsi = arrayListOf(
            DataProvinsi("Nanggroe Aceh Darussalam","Banda Aceh",R.drawable.banda_aceh),
            DataProvinsi("Sumatera Utara","Medan",R.drawable.sumatera_utara_medan),
            DataProvinsi("Sumatera Selatan","Palembang",R.drawable.sumatera_selatan_palembang),
            DataProvinsi("Sumatera Barat","Padang",R.drawable.sumatera_barat_padang),
            DataProvinsi("Bengkulu","Bengkulu",R.drawable.bengkulu),
            DataProvinsi("Riau","Pekanbaru",R.drawable.riau_pekanbaru),
            DataProvinsi("Kepulauan Riau","Tanjung Pinang",R.drawable.kepulauan_riau),
            DataProvinsi("Jambi","Jambi",R.drawable.jambi),
            DataProvinsi("Lampung","Bandar Lampung",R.drawable.lampung),
            DataProvinsi("Bangka Belitung","Pangkal Pinang",R.drawable.bangka_belitung),
        )
        val adapter = AdapterProvinsi(listProvinsi)
        val layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false)
        val recyclerView = findViewById<RecyclerView>(R.id.recycleMain)
        recyclerView.layoutManager = layoutManager
        recyclerView.adapter = adapter
    }

    fun setKalimantan(){
        val listProvinsi = arrayListOf(
            DataProvinsi("Kalimantan Timur","Samarinda",R.drawable.kalimantan_timur),
            DataProvinsi("Kalimantan Barat","Pontianak",R.drawable.kalimantan_barat),
            DataProvinsi("Kalimantan Tengah","Palangkaraya",R.drawable.kalimantan_tengah),
            DataProvinsi("Kalimantan Selatan","Banjarbaru",R.drawable.kalimantan_selatan),
        )
        val adapter = AdapterProvinsi(listProvinsi)
        val layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false)
        val recyclerView = findViewById<RecyclerView>(R.id.recycleMain)
        recyclerView.layoutManager = layoutManager
        recyclerView.adapter = adapter
    }

    fun setJawa(){
        val listProvinsi = arrayListOf(
            DataProvinsi("DKI Jakarta","Jakarta",R.drawable.dki_jakarta),
            DataProvinsi("Banten","Serang",R.drawable.banten_serang),
            DataProvinsi("Jawa Barat","Bandung",R.drawable.jawa_barat_bandung),
            DataProvinsi("Jawa Tengah","Semarang",R.drawable.jawa_tengah),
            DataProvinsi("DI Yogyakarta","Yogyakarta",R.drawable.diy_yogyakarta),
            DataProvinsi("Jawa Timur","Surabaya",R.drawable.jawa_timur),
            DataProvinsi("Jawa Tengah","Semarang",R.drawable.jawa_tengah),

            )
        val adapter = AdapterProvinsi(listProvinsi)
        val layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false)
        val recyclerView = findViewById<RecyclerView>(R.id.recycleMain)
        recyclerView.layoutManager = layoutManager
        recyclerView.adapter = adapter
    }

    fun setBali(){
        val listProvinsi = arrayListOf(
            DataProvinsi("Bali","Denpasar",R.drawable.bali_denpasar),
            DataProvinsi("Nusa Tenggara Barat","Mataram",R.drawable.nusa_tenggara_barat),
            DataProvinsi("Nusa Tenggara Timur","Kupang",R.drawable.nusa_tenggara_timur),

            )
        val adapter = AdapterProvinsi(listProvinsi)
        val layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false)
        val recyclerView = findViewById<RecyclerView>(R.id.recycleMain)
        recyclerView.layoutManager = layoutManager
        recyclerView.adapter = adapter
    }

    fun setSulawesi(){
        val listProvinsi = arrayListOf(
            DataProvinsi("Sulawesi Utara","Manado",R.drawable.sulawesi_utara),
            DataProvinsi("Sulawesi Barat","Mamuju",R.drawable.sulawesi_barat),
            DataProvinsi("Sulawesi Tengah","Kupang",R.drawable.sulawesi_tengah),
            DataProvinsi("Gorontalo","Gorontalo",R.drawable.gorontalo),
            DataProvinsi("Sulawesi Tenggara","Makasar",R.drawable.sulawesi_selatan),

            )
        val adapter = AdapterProvinsi(listProvinsi)
        val layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false)
        val recyclerView = findViewById<RecyclerView>(R.id.recycleMain)
        recyclerView.layoutManager = layoutManager
        recyclerView.adapter = adapter
    }

    fun setMaluku(){
        val listProvinsi = arrayListOf(
            DataProvinsi("Maluku Utara","Sofifi",R.drawable.maluku_utara),
            DataProvinsi("Maluku","Ambon",R.drawable.maluku_ambon),

            )
        val adapter = AdapterProvinsi(listProvinsi)
        val layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false)
        val recyclerView = findViewById<RecyclerView>(R.id.recycleMain)
        recyclerView.layoutManager = layoutManager
        recyclerView.adapter = adapter
    }

    fun setPapua(){
        val listProvinsi = arrayListOf(
            DataProvinsi("Papua Barat","Manokwari",R.drawable.papua_barat),
            DataProvinsi("Papua","Jayapura",R.drawable.papua_jayapura),
            DataProvinsi("Papua Selatan","Kabupaten Merauke",R.drawable.papua_selatan),
            DataProvinsi("Papua Tengah","Kabupaten Nabire",R.drawable.papua_pegunungan),
            DataProvinsi("Papua Pegunungan","Kabupaten Jayawijaya",R.drawable.papua_tengah),

            )
        val adapter = AdapterProvinsi(listProvinsi)
        val layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false)
        val recyclerView = findViewById<RecyclerView>(R.id.recycleMain)
        recyclerView.layoutManager = layoutManager
        recyclerView.adapter = adapter
    }

}