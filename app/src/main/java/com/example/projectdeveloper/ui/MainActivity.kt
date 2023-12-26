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

    override fun onStart() {
        super.onStart()
        Toast.makeText(this,"L'application onStart",Toast.LENGTH_SHORT).show()
    }
    override fun onResume() {
        super.onResume()
        Toast.makeText(this,"L'application onResume",Toast.LENGTH_SHORT).show()
    }
    override fun onPause() {
        super.onPause()
        Toast.makeText(this,"L'application onPause",Toast.LENGTH_SHORT).show()
    }
    override fun onStop() {
        super.onStop()
        Toast.makeText(this,"L'application onStop",Toast.LENGTH_SHORT).show()
    }
    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(this,"L'application onDestroy",Toast.LENGTH_SHORT).show()
    }
    override fun onRestart() {
        super.onRestart()
        Toast.makeText(this,"L'application onRestart",Toast.LENGTH_SHORT).show()
    }
}
