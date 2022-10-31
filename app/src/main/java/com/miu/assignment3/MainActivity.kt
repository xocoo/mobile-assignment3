package com.miu.assignment3

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.widget.TableRow
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    @SuppressLint("ResourceAsColor")
    fun add(view: View) {
        if (et_version.text.isEmpty() || et_codename.text.isEmpty())
            Toast.makeText(this, "Enter Android version or Code name", Toast.LENGTH_LONG).show()
        else {
            val tableRow = TableRow(this)
            val layoutParams = TableRow.LayoutParams(TableRow.LayoutParams.WRAP_CONTENT)
            tableRow.layoutParams = layoutParams
            tableRow.setPadding(0, 10, 0, 0)

            val androidVersion = TextView(this)
            androidVersion.text = et_version.text.toString()
            androidVersion.setBackgroundColor(R.color.teal_700)

            val androidCodeName = TextView(this)
            androidCodeName.text = et_codename.text.toString()
            androidCodeName.setBackgroundColor(R.color.teal_700)

            tableRow.addView(androidVersion)
            tableRow.addView(androidCodeName)
            tabMode.addView(tableRow)

            et_version.text.clear()
            et_codename.text.clear()
        }
    }
}