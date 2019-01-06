package com.example.sanjeev.itchotels

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.RecyclerView
import android.widget.Button

class RecyclerViewActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view)
        val reclyclerView=findViewById<RecyclerView>(R.id.MyRecyclerView)
        var hotels=ArrayList<Hotels>()
        hotels.add(Hotels(R.drawable.gardenia,"ITC Gardenia","No.1 Residency Road, Bengaluru - 560 025, Karnataka, India","+918043455000","reservations@itchotels.in"))
        hotels.add(Hotels(R.drawable.gardenia,"ITC Gardenia","No.1 Residency Road, Bengaluru - 560 025, Karnataka, India","+918043455000","reservations@itchotels.in"))
        hotels.add(Hotels(R.drawable.itckohenur,"ITC Kohenur","Hyderabad Knowledge City, Madhapur (HITEC City), Hyderabad- 500081","+914067660101","reservations@itchotels.in"))
        hotels.add(Hotels(R.drawable.itckakatia,"ITC Kakatiya","No.1 Residency Road, Bengaluru - 560 025, Karnataka, India","+918043455000","reservations@itchotels.in"))
        hotels.add(Hotels(R.drawable.grandbharat,"ITC Grand Bharat","No.1 Residency Road, Bengaluru - 560 025, Karnataka, India","+918043455000","reservations@itchotels.in"))
        hotels.add(Hotels(R.drawable.grandgoa,"ITC Grand Goa Resort and Spa","No.1 Residency Road, Bengaluru - 560 025, Karnataka, India","+918043455000","reservations@itchotels.in"))
        hotels.add(Hotels(R.drawable.gardenia,"ITC Gardenia","No.1 Residency Road, Bengaluru - 560 025, Karnataka, India","+918043455000","reservations@itchotels.in"))
        hotels.add(Hotels(R.drawable.gardenia,"ITC Gardenia","No.1 Residency Road, Bengaluru - 560 025, Karnataka, India","+918043455000","reservations@itchotels.in"))
        hotels.add(Hotels(R.drawable.itckohenur,"ITC Kohenur","Hyderabad Knowledge City, Madhapur (HITEC City), Hyderabad- 500081","+914067660101","reservations@itchotels.in"))
        hotels.add(Hotels(R.drawable.itckakatia,"ITC Kakatiya","No.1 Residency Road, Bengaluru - 560 025, Karnataka, India","+918043455000","reservations@itchotels.in"))
        hotels.add(Hotels(R.drawable.grandbharat,"ITC Grand Bharat","No.1 Residency Road, Bengaluru - 560 025, Karnataka, India","+918043455000","reservations@itchotels.in"))
        hotels.add(Hotels(R.drawable.grandgoa,"ITC Grand Goa Resort and Spa","No.1 Residency Road, Bengaluru - 560 025, Karnataka, India","+918043455000","reservations@itchotels.in"))
        hotels.add(Hotels(R.drawable.gardenia,"ITC Gardenia","No.1 Residency Road, Bengaluru - 560 025, Karnataka, India","+918043455000","reservations@itchotels.in"))
        hotels.add(Hotels(R.drawable.gardenia,"ITC Gardenia","No.1 Residency Road, Bengaluru - 560 025, Karnataka, India","+918043455000","reservations@itchotels.in"))
        hotels.add(Hotels(R.drawable.itckohenur,"ITC Kohenur","Hyderabad Knowledge City, Madhapur (HITEC City), Hyderabad- 500081","+914067660101","reservations@itchotels.in"))
        hotels.add(Hotels(R.drawable.itckakatia,"ITC Kakatiya","No.1 Residency Road, Bengaluru - 560 025, Karnataka, India","+918043455000","reservations@itchotels.in"))
        hotels.add(Hotels(R.drawable.grandbharat,"ITC Grand Bharat","No.1 Residency Road, Bengaluru - 560 025, Karnataka, India","+918043455000","reservations@itchotels.in"))
        hotels.add(Hotels(R.drawable.grandgoa,"ITC Grand Goa Resort and Spa","No.1 Residency Road, Bengaluru - 560 025, Karnataka, India","+918043455000","reservations@itchotels.in"))
        hotels.add(Hotels(R.drawable.gardenia,"ITC Gardenia","No.1 Residency Road, Bengaluru - 560 025, Karnataka, India","+918043455000","reservations@itchotels.in"))
        hotels.add(Hotels(R.drawable.gardenia,"ITC Gardenia","No.1 Residency Road, Bengaluru - 560 025, Karnataka, India","+918043455000","reservations@itchotels.in"))
        hotels.add(Hotels(R.drawable.itckohenur,"ITC Kohenur","Hyderabad Knowledge City, Madhapur (HITEC City), Hyderabad- 500081","+914067660101","reservations@itchotels.in"))
        hotels.add(Hotels(R.drawable.itckakatia,"ITC Kakatiya","No.1 Residency Road, Bengaluru - 560 025, Karnataka, India","+918043455000","reservations@itchotels.in"))
        hotels.add(Hotels(R.drawable.grandbharat,"ITC Grand Bharat","No.1 Residency Road, Bengaluru - 560 025, Karnataka, India","+918043455000","reservations@itchotels.in"))
        hotels.add(Hotels(R.drawable.grandgoa,"ITC Grand Goa Resort and Spa","No.1 Residency Road, Bengaluru - 560 025, Karnataka, India","+918043455000","reservations@itchotels.in"))
        hotels.add(Hotels(R.drawable.gardenia,"ITC Gardenia","No.1 Residency Road, Bengaluru - 560 025, Karnataka, India","+918043455000","reservations@itchotels.in"))
        hotels.add(Hotels(R.drawable.gardenia,"ITC Gardenia","No.1 Residency Road, Bengaluru - 560 025, Karnataka, India","+918043455000","reservations@itchotels.in"))
        hotels.add(Hotels(R.drawable.itckohenur,"ITC Kohenur","Hyderabad Knowledge City, Madhapur (HITEC City), Hyderabad- 500081","+914067660101","reservations@itchotels.in"))
        hotels.add(Hotels(R.drawable.itckakatia,"ITC Kakatiya","No.1 Residency Road, Bengaluru - 560 025, Karnataka, India","+918043455000","reservations@itchotels.in"))
        hotels.add(Hotels(R.drawable.grandbharat,"ITC Grand Bharat","No.1 Residency Road, Bengaluru - 560 025, Karnataka, India","+918043455000","reservations@itchotels.in"))
        hotels.add(Hotels(R.drawable.grandgoa,"ITC Grand Goa Resort and Spa","No.1 Residency Road, Bengaluru - 560 025, Karnataka, India","+918043455000","reservations@itchotels.in"))
        hotels.add(Hotels(R.drawable.gardenia,"ITC Gardenia","No.1 Residency Road, Bengaluru - 560 025, Karnataka, India","+918043455000","reservations@itchotels.in"))
        hotels.add(Hotels(R.drawable.gardenia,"ITC Gardenia","No.1 Residency Road, Bengaluru - 560 025, Karnataka, India","+918043455000","reservations@itchotels.in"))
        hotels.add(Hotels(R.drawable.itckohenur,"ITC Kohenur","Hyderabad Knowledge City, Madhapur (HITEC City), Hyderabad- 500081","+914067660101","reservations@itchotels.in"))
        hotels.add(Hotels(R.drawable.itckakatia,"ITC Kakatiya","No.1 Residency Road, Bengaluru - 560 025, Karnataka, India","+918043455000","reservations@itchotels.in"))
        hotels.add(Hotels(R.drawable.grandbharat,"ITC Grand Bharat","No.1 Residency Road, Bengaluru - 560 025, Karnataka, India","+918043455000","reservations@itchotels.in"))
        hotels.add(Hotels(R.drawable.grandgoa,"ITC Grand Goa Resort and Spa","No.1 Residency Road, Bengaluru - 560 025, Karnataka, India","+918043455000","reservations@itchotels.in"))

    }
}
