package com.batch.itarchkadai2

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        activityButton.setOnClickListener {
            // kadai 2-3
            // "com.batch.ACTION"という独自インテントに対して暗黙的インテントでstartActivityする
            val intent = Intent("com.batch.ACTION")
            // intentにputExtraでメッセージを含める
            intent.putExtra("gotoSubActivity", "send SubActivity")
            startActivity(intent)

            // kadai2-1
            // 明示的インテントでSubActivityに遷移
//            val intent = Intent(this, SubActivity::class.java)
//            startActivity(intent)
        }
    }
}
