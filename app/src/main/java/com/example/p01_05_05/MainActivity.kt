package com.example.p01_05_05

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.reusable_layout.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onButtonClick(view: View)
    {
        if(checkBox.isChecked)
        {
            if(checkBox2.isChecked)
            {
                imageView.setImageLevel(3)
            } else {
                imageView.setImageLevel(1)
            }
        } else {
            if(checkBox2.isChecked)
            {
                imageView.setImageLevel(2)
            } else
            {
                imageView.setImageLevel(0)
            }
        }
    }
}