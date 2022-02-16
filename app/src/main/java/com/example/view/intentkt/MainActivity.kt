package com.example.view.intentkt

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var btn_a:Button
    private lateinit var tv_sendmsg:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tv_sendmsg=findViewById(R.id.tv_sendmsg)
        btn_a=findViewById(R.id.btn_a)
        btn_a.setOnClickListener{
            // var : 변수 값이 언제든지 변경 될 수 있음.
            // val : 자바에서는 final와 같이 값이 변경되지 못하는 변수.

            val intent = Intent(this, SubActivity2::class.java)  // 다음 화면으로 이동하기위한 Intent객체 생성
            intent.putExtra("msg", tv_sendmsg.text.toString())          // HelloWorld라는 텍스틀 값을 담은 뒤 msg라는 키로 잠궜다.
            startActivity(intent)   //intent에 저장되어 있는 액티비티 쪽으로 이동한다.
            // finish()                //자기 자신의 액티비티를 파괴한다.
        }
    }
}