package com.example.steps_app_project.home

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter

class HomeFragmentAdapter(fragment: Fragment): FragmentStateAdapter(fragment) {
    override fun getItemCount(): Int = 3

    override fun createFragment(position: Int): Fragment {

        return when (position) {
            0 -> WeeklyFragment()
            1 -> DailyFragment()
            else -> MonthlyFragment()

        }
    }
}
