package com.example.projectdeveloper.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ListView
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.projectdeveloper.R
import com.example.projectdeveloper.model.CustomAdapter

class ProjetsJava : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, avedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        var view:View = inflater.inflate(R.layout.fragment_projets_java, container, false)

        return view

    }
    companion object {
        @JvmStatic
        fun newInstance() = ProjetsJava().apply {
                arguments = Bundle().apply {
                }
            }
    }
}