package site.cosmohosting.myapplication101

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textViewComencemos = findViewById<TextView>(R.id.textViewComencemos)
        val textViewHolaMundo = findViewById<TextView>(R.id.textViewHolaMundo)

        findViewById<Button>(R.id.buttonComenzar).setOnClickListener{
            textViewComencemos.visibility = View.VISIBLE
            textViewHolaMundo.text = "Felicitaciones. Esta es tu primera aplicación ;-)"
        }
    }
}