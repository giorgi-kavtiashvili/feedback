package com.example.shualeduristest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CheckBox
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.widget.AppCompatButton

class MainActivity : AppCompatActivity() {



    private lateinit var name: EditText
    private lateinit var surname: EditText
    private lateinit var Text: EditText
    private lateinit var check: CheckBox
    private lateinit var check2: CheckBox
    private lateinit var Finish: AppCompatButton






    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        name = findViewById(R.id.name)
        surname = findViewById(R.id.surname)
        Text = findViewById(R.id.Text)
        check = findViewById(R.id.check)
        check2 = findViewById(R.id.check2)
        Finish = findViewById(R.id.Finish)


        Finish.setOnClickListener{
            val firstName = name.text.toString().trim()
            val lastname = surname.text.toString().trim()
            val text = Text.text.toString().trim()
            val Check = check.text.toString().trim()
            val Check2 = check2.text.toString().trim()


            if (firstName.isEmpty()) {
                name.error = "გთხოვთ შეიყვანეთ სახელი"
                return@setOnClickListener
            } else if (firstName.length < 3) {
                name.error = "გთხოვთ შეიყვანეთ მინიმუმ სამი სიმბოლო"
                return@setOnClickListener
            } else if (lastname.isEmpty()) {
                surname.error = "გთხოვთ შეიყვანეთ გვარი"
                return@setOnClickListener
            } else if (lastname.length < 5) {
                surname.error = "გთხოვთ შეიყვანეთ მინიმუმ ხუთი სიმბოლო"
                return@setOnClickListener
            } else if (text.isEmpty()) {
                Text.error = "გთხოვთ შეიყვანეთ ტექსტი"
                return@setOnClickListener
            } else if (text.length < 10) {
                Text.error = "გთხოვთ შეიყვანეთ მინიმუმ 10 სიმბოლო"
                return@setOnClickListener
            } else if (!check.isChecked && !check2.isChecked) {
                Toast.makeText(this, "გთხოვთ შეავსეთ პირველი კითხვა", Toast.LENGTH_SHORT).show()
            } else if (check.isChecked && check2.isChecked) {
                Toast.makeText(this, "მონიშნეთ მხოლოდ კი ან არა", Toast.LENGTH_SHORT).show()

            } 

            else if (!check.isChecked && check2.isChecked) {
                Toast.makeText(this, "წარმატებით გაიგზავნა", Toast.LENGTH_SHORT).show()
            } else if (check.isChecked && !check2.isChecked) {
                Toast.makeText(this, "წარმატებით გაიგზავნა", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "წარმატებით გაიგზავნა", Toast.LENGTH_SHORT).show()


            }
        }
    }
}