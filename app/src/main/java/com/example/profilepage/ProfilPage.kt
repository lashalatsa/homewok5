package com.example.profilepage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_profil_page.*

class ProfilPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profil_page)
        init()
    }

    private fun init() {
        Glide.with(this)
            .load("https://www.setaswall.com/wp-content/uploads/2017/06/Just-Live-Facebook-Cover-851-x-315-768x284.jpg")
            .into(coverPicture)

        Glide.with(this)
            .load("https://i.pinimg.com/originals/7d/1a/3f/7d1a3f77eee9f34782c6f88e97a6c888.jpg")
            .into(profilePicture)
    }
}