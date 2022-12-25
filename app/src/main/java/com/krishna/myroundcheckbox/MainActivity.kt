package com.krishna.myroundcheckbox

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var checkBox:CheckBox
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


         checkBox = findViewById(R.id.roundCheckBox)


        checkBox.setOnClickListener(View.OnClickListener {
            if (checkBox.isChecked) {
                message(checkBox.text.toString() + " Checked")
            } else {
                message(checkBox.text.toString() + " UnChecked")
            }
        })

    }
    fun message(str: String) {
        Toast.makeText(this, str, Toast.LENGTH_SHORT).show()
    }
}