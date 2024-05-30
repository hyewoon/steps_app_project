package com.example.steps_app_project

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.get
import androidx.databinding.DataBindingUtil
import androidx.viewpager2.widget.ViewPager2
import com.example.steps_app_project.databinding.FragmentHomeBinding
import com.example.steps_app_project.home.DailyFragment
import com.example.steps_app_project.home.HomeFragmentAdapter
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator


class HomeFragment : Fragment() {
    private lateinit var binding: FragmentHomeBinding
    private lateinit var homeFragmentAdapter : HomeFragmentAdapter
    private lateinit var viewPager2 : ViewPager2
    private lateinit var tabLayout : TabLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        binding =DataBindingUtil.inflate(inflater,R.layout.fragment_home, container, false)



        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewPager2 = binding.viewPager2
        tabLayout = binding.tabLayout
        homeFragmentAdapter = HomeFragmentAdapter(this)
        viewPager2.adapter = homeFragmentAdapter


        TabLayoutMediator(tabLayout, viewPager2){tab, position ->
            when(position) {
                0 -> tab.text = "주"
                1 -> tab.text = "일"
                2 -> tab.text = "월"
            }

        }.attach()

        binding.viewPager2.setCurrentItem(1, false)

    }

}