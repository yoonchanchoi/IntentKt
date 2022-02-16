package com.example.view.intentkt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SubActivity2 : AppCompatActivity() {

    private lateinit var tv_getmsg:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sub2)


        tv_getmsg=findViewById(R.id.tv_getmsg)

        if (intent.hasExtra("msg")){
            tv_getmsg.text = intent.getStringExtra("msg")   // 서브 액티비티의 존재하는 텍스트뷰에다가 Helloworld가 넘겨져 옴

        }

    }
}