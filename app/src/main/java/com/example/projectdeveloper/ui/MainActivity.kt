package com.example.projectdeveloper.ui

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

import com.example.projectdeveloper.R


class MainActivity : AppCompatActivity() {

   lateinit var editUser:EditText
    lateinit var editPassword:EditText
    lateinit var login:Button
    lateinit var signUp: Button
    lateinit var myToast:Toast

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

         editUser = findViewById(R.id.editUser)
         editPassword = findViewById(R.id.editPassword)
         login = findViewById(R.id.submit)
         signUp = findViewById(R.id.noveauCompte)

        login.setOnClickListener{
             valideChamps()
         }
        signUp.setOnClickListener{
            var intent = Intent(this, Inscription::class.java)
            startActivity(intent)
        }
    }
     fun valideChamps(){
        var user = editUser.text.toString()
        var password = editPassword.text.toString()
        if (user.isEmpty() || password.isEmpty()){
            myToast = Toast.makeText(this,"Champs invalide",Toast.LENGTH_SHORT)
            myToast.show()
        }
        else{
            val intent = Intent(this, PageHome::class.java)
            startActivity(intent)
        }
    }
}
