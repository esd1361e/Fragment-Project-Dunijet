package com.example.fragments

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.viewpager2.widget.ViewPager2
import com.example.fragments.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var myAdapter = MyViewPagerAdapter(this)
        binding.viewPagerMain.adapter = myAdapter
        binding.viewPagerMain.offscreenPageLimit = 3
        var mediator = TabLayoutMediator(
            binding.tablayoutMain ,
            binding.viewPagerMain ,
            object :TabLayoutMediator.TabConfigurationStrategy {
                override fun onConfigureTab(p0: TabLayout.Tab, p1: Int) {

                    when(p1){

                        0->{p0.text = "frag1"}
                        1->{p0.text = "frag2"}
                        2->{p0.text = "frag3"}


                    }

                }


            })
        mediator.attach()





        //حرکت بصورت عمودی صفحه فرگمنت
//        binding.viewPagerMain.orientation = ViewPager2.ORIENTATION_VERTICAL

    }
}