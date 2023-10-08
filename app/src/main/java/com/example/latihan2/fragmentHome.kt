package com.example.latihan2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class fragmentHome : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fragment_home)

        val fragmentManager = supportFragmentManager
        val disiniFragment = DisiniFragment()
        val fragment =fragmentManager.findFragmentByTag(DisiniFragment::class.java.simpleName)

        if (fragment !is DisiniFragment) {
            fragmentManager
                .beginTransaction()
                .add(R.id.container, disiniFragment, DisiniFragment::class.java.simpleName)
                .commit()
        }


    }
}