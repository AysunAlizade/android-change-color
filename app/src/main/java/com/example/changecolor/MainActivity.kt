package com.example.changecolor

import android.graphics.Color
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {

    private lateinit var view: View
    private lateinit var button: FloatingActionButton

    // Ağ və qara rəngləri çıxarırıq ki, ekranda itməsinlər
    private val colors = arrayOf(
        Color.RED,
        Color.GRAY,
        Color.GREEN,
        Color.MAGENTA,
        Color.YELLOW,
        Color.CYAN,
        Color.BLUE
    )

    private var currentIndex = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        view = findViewById(R.id.view)
        button = findViewById(R.id.button_change)

        button.setOnClickListener {
            // Hər klikdə siyahıdakı növbəti rəngə keçir
            view.setBackgroundColor(colors[currentIndex])

            // Siyahının sonuna çatanda yenidən başa qayıdır
            currentIndex = (currentIndex + 1) % colors.size
        }
    }
}