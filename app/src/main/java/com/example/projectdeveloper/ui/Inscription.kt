package com.example.projectdeveloper.ui

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.projectdeveloper.R

class Inscription : AppCompatActivity() {
    private var editName: EditText? =
        null
     lateinit  var editPrenom:EditText
    lateinit  var editPhone:EditText
    lateinit  var editMail:EditText
    lateinit  var editPassword:EditText
    lateinit var checkBox: CheckBox
    lateinit var submit: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inscription)
        editName = findViewById(R.id.editName)
        editPrenom = findViewById(R.id.editPrenom)
        editPhone = findViewById(R.id.editPhone)
        editMail = findViewById(R.id.editMail)
        editPassword = findViewById(R.id.editPassword)
        checkBox = findViewById(R.id.checkbox)

        submit = findViewById(R.id.inscrire)
        submit.setOnClickListener{
            //fonction de validation des champs
            valideChamps()

            //transfert les informations en page profile

            /*var intent = Intent(this,FragmentProfile::class.java)
            var data = HashMap<String,String>()
            data.put("name",editName?.text.toString())
            data.put("prenom",editPrenom?.text.toString())
            data.put("numberPhone",editPhone?.text.toString())
            data.put("email",editMail?.text.toString())
            data.put("password",editPassword?.text.toString())
            intent.putExtra("data",data)
            startActivity(intent)*/
        }
    }
    //fonction de validation des champs
    public fun valideChamps() {
        val name = editName!!.text.toString()
        val prenom = editPrenom.text.toString()
        val phone = editPhone.text.toString()
        val mail = editMail.text.toString()
        val password = editPassword.text.toString()
        if (name.isEmpty() || prenom.isEmpty() || phone.isEmpty()
            || mail.isEmpty() || password.isEmpty() || !checkBox.isChecked
        ) {
            Toast.makeText(this, "Champs invalide ", Toast.LENGTH_SHORT).show()
        } else {
            val intent = Intent(this, PageHome::class.java)
            startActivity(intent)

        }
    }
}