
package com.blueconnect.user

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Toast.makeText(this, "BlueConnect ROHD Loaded", Toast.LENGTH_LONG).show()
    }
}
