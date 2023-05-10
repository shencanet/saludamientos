package com.example.saludamientos

import android.graphics.Color
import android.os.Bundle
import android.view.Gravity
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import nl.dionsegijn.konfetti.KonfettiView
import nl.dionsegijn.konfetti.models.Shape
import nl.dionsegijn.konfetti.models.Size
//import nl.dionsegijn.konfetti.models.KonfettiSource




class MainActivity : AppCompatActivity() {
    private lateinit var imageView: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val konfettiView = findViewById<KonfettiView>(R.id.konfettiView)
        var contador: Int = 0
        val botonpulsar = findViewById<Button>(R.id.botonpulsar)
        val tvsaludo = findViewById<TextView>(R.id.tvsaludo)

        botonpulsar.setOnClickListener {
            contador = (Math.random() * 100).toInt()
            if (contador < 10) {
                tvsaludo.text = "GANADOR"
                konfettiView.build()
                    .addColors(Color.YELLOW, Color.GREEN, Color.RED)
                    .setDirection(0.0, 359.0)
                    .setSpeed(1f, 5f)
                    .setFadeOutEnabled(true)
                    .setTimeToLive(2000L)
                    .addShapes(Shape.RECT, Shape.CIRCLE)
                    .addSizes(Size(12, 5f))
                    .setPosition(0f, konfettiView.width.toFloat(), 0f, konfettiView.height.toFloat())
                    .streamFor(300, 5000L)





            } else {
                tvsaludo.text = contador.toString()
            }
        }
    }
}