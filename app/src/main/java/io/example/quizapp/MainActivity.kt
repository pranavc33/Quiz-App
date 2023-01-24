package io.example.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val buttonStart: Button = findViewById(R.id.btn_start)
        val etName : EditText = findViewById(R.id.et_name)
        buttonStart.setOnClickListener{

            if(etName.text.toString().isEmpty()){
                Toast.makeText(this,"Please enter your name", Toast.LENGTH_SHORT).show()


            } else {
                val intent = Intent(this, QuizQuestionsActivity::class.java)
            startActivity(intent)
finish()
            }
        }
    }
}