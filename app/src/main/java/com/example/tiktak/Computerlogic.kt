package com.example.tiktak
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.tiktak.R.layout.activity_computerlogic
import com.example.tiktak.databinding.ActivityComputerlogicBinding

class Computerlogic : AppCompatActivity() {
    lateinit var databinding:ActivityComputerlogicBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        databinding=DataBindingUtil.setContentView(this, activity_computerlogic)
        super.onCreate(savedInstanceState)
        setContentView(activity_computerlogic)
    }
}