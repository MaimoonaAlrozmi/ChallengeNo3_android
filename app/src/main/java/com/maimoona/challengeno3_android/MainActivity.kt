package com.maimoona.challengeno3_android

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*



class MainActivity : AppCompatActivity() {

    private lateinit var trueButton: Button;
    private lateinit var falseButton: Button;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        trueButton = findViewById(R.id.true_button);
        falseButton = findViewById(R.id.false_button);

        true_button.setOnClickListener {

            var t= Toast.makeText(this,R.string.correct_toast,Toast.LENGTH_LONG)
            t.setGravity(Gravity.TOP,0,250)
            t.show()

        }
        false_button.setOnClickListener {

            var t= Toast.makeText(this,R.string.incorrect_toast,Toast.LENGTH_LONG)
            t.setGravity(Gravity.TOP,0,250)
            t.show()
        }
    }

}