package com.example.myprogressbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.example.myprogressbar.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var dataBinding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        dataBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        dataBinding.ControlButton.setOnClickListener {
            startorstopProgressBar()
        }


    }



        private fun startorstopProgressBar() {
            dataBinding.apply {
                if (progressBar.visibility == View.GONE) {
                    progressBar.visibility = View.VISIBLE
                    ControlButton.text = "Stop"
                } else {
                    progressBar.visibility = View.GONE
                    ControlButton.text = "start"
                }
            }
        }
    }
