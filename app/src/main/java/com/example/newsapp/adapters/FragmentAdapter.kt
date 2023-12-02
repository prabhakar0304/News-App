package com.example.newsapp.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.newsapp.fragmentClasses.*
import com.example.newsapp.utils.Constants.TOTAL_NEWS_TAB

class FragmentAdapter(fm: FragmentManager, lifecycle: Lifecycle) : FragmentStateAdapter(fm, lifecycle){

    override fun getItemCount(): Int = TOTAL_NEWS_TAB

    override fun createFragment(position: Int): Fragment {

        return when (position) {
            0 -> {GeneralFragment()}
            1 -> {BusinessFragment()}
            2 -> {EntertainmentFragment()}
            3 -> {ScienceFragment()}
            4 -> {SportsFragment()}
            5 -> {TechFragment()}
            6 -> {HealthFragment()}
            else -> BusinessFragment()
        }
    }
}