package com.example.controlemental

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.controlemental.ui.theme.ControleMentalTheme

class MainActivity3 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.desenvolvimento)

        val btn1 = findViewById<Button>(R.id.button3)
        val btn2 = findViewById<Button>(R.id.button4)

        btn1.setOnClickListener {
            val intent = Intent(this, MainActivity4::class.java)
            startActivity(intent)

        }

        btn2.setOnClickListener {
            val intent = Intent(this , MainActivity5::class.java)
            startActivity(intent)
        }



    }
}