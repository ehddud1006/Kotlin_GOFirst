package com.uzi98.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val image1 = findViewById<ImageView>(R.id.imageView)

        image1.setOnClickListener {

            Toast.makeText(this, "1번 출력 완료", Toast.LENGTH_SHORT).show()

            val intent = Intent(this, bts1::class.java)
            startActivity(intent)

        }

        val image2 = findViewById<ImageView>(R.id.imageView2)
        val image3 = findViewById<ImageView>(R.id.imageView3)
        val image4 = findViewById<ImageView>(R.id.imageView4)
        val image5 = findViewById<ImageView>(R.id.imageView5)
        val image6 = findViewById<ImageView>(R.id.imageView6)
        val image7 = findViewById<ImageView>(R.id.imageView8)

        image2.setOnClickListener {

            Toast.makeText(this,"2번 출력 완료", Toast.LENGTH_SHORT).show()

            val intent = Intent(this,bts2::class.java)
            startActivity(intent)

        }

        image3.setOnClickListener {

            Toast.makeText(this,"3번 출력 완료", Toast.LENGTH_SHORT).show()

            val intent = Intent(this,bts3::class.java)
            startActivity(intent)

        }

        image4.setOnClickListener {

            Toast.makeText(this,"4번 출력 완료", Toast.LENGTH_SHORT).show()

            val intent = Intent(this,bts4::class.java)
            startActivity(intent)

        }

        image5.setOnClickListener {

            Toast.makeText(this,"5번 출력 완료", Toast.LENGTH_SHORT).show()

            val intent = Intent(this,bts5::class.java)
            startActivity(intent)

        }

        image6.setOnClickListener {

            Toast.makeText(this,"6번 출력 완료", Toast.LENGTH_SHORT).show()

            val intent = Intent(this,bts6::class.java)
            startActivity(intent)

        }

        image7.setOnClickListener {

            Toast.makeText(this,"7번 출력 완료", Toast.LENGTH_SHORT).show()

            val intent = Intent(this,bts7::class.java)
            startActivity(intent)

        }

    }
}