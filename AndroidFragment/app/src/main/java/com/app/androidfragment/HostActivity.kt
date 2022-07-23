package com.app.androidfragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class HostActivity : AppCompatActivity() , ThirdFragment.Communicator{

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_host)
    }

    override fun sendValue(name: String, message: String) {

        var fragment = supportFragmentManager.findFragmentById(R.id.fourth_fragment)

        if(fragment is FourthFragment){
            fragment.updateResult(name, message)
        }

        //Toast.makeText(this, "Name : $name\nMessage : $message", Toast.LENGTH_SHORT).show()
    }
}