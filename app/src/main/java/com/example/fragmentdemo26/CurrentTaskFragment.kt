package com.example.fragmentdemo26

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment

class CurrentTaskFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_current_task, container, false)
        
        val weather = WeatherProvider.sampleWeather
        view.findViewById<TextView>(R.id.cityText).text = weather.city
        view.findViewById<TextView>(R.id.tempText).text = weather.temperature
        
        return view
    }
}