package com.example.projectdeveloper.ui

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import com.example.projectdeveloper.R

class FragmentProfile : Fragment() {
    //declarer les variables
    lateinit var editName:EditText
    lateinit var editPrenom:EditText
    lateinit var editNumberPhone:EditText
    lateinit var editEmail:EditText
    lateinit var editPassword:EditText

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate  layout dans  fragment
        var view =inflater.inflate(R.layout.fragment_profile, container, false)
        //affecter les id dans les variables
        editName = view.findViewById(R.id.name)
        editPrenom = view.findViewById(R.id.prenom)
        editNumberPhone = view.findViewById(R.id.numberPhone)
        editEmail = view.findViewById(R.id.email)
        editPassword = view.findViewById(R.id.password)

        //recuperer les informations entrez dans page inscription

        /*var data = arguments?.getSerializable("data") as HashMap<String,String>?
        if (data != null){
            editName.setText(data["name"].toString())
            editPrenom.setText(data["prenom"].toString())
            editNumberPhone.setText(data["numberPhone"].toString())
            editEmail.setText(data["email"].toString())
            editPassword.setText(data["password"].toString())
        }*/

        return view
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }
    companion object {
        fun newInstance() = FragmentProfile().apply {
                arguments = Bundle().apply {

                }
            }
    }
}