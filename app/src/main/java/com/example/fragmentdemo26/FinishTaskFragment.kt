package com.example.fragmentdemo26

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment

class FinishTaskFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_finish_task, container, false)
        
        val weather = WeatherProvider.sampleWeather
        view.findViewById<TextView>(R.id.detailCity).text = "Город: ${weather.city}"
        view.findViewById<TextView>(R.id.detailTemp).text = "Температура: ${weather.temperature}"
        view.findViewById<TextView>(R.id.detailCond).text = "Состояние: ${weather.condition}"
        view.findViewById<TextView>(R.id.detailHumidity).text = "Влажность: ${weather.humidity}"
        view.findViewById<TextView>(R.id.detailWind).text = "Ветер: ${weather.windSpeed}"
        view.findViewById<TextView>(R.id.detailPressure).text = "Давление: ${weather.pressure}"
        
        return view
    }
}