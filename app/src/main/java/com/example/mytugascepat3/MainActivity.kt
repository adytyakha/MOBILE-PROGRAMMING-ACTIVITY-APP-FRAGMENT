package com.example.mytugascepat3

import android.os.Bundle
import android.support.v4.view.ViewPager
import android.support.v7.app.AppCompatActivity
import com.ogaclejapan.smarttablayout.SmartTabLayout
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItemAdapter
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItems
import kotlinx.android.synthetic.main.activity_main.*



class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val adapter = FragmentPagerItemAdapter(
            supportFragmentManager, FragmentPagerItems.with(this)
                .add( "Home", FirstFragment::class.java)
                .add("Nene Holidayg", SecondFragment::class.java)
                .add( "Puisiku", ThirdkFragment::class.java)
                .add("Rumah Mewah", FounthFragment::class.java)
                .create()
        )

        val viewPager = findViewById(R.id.viewpager) as ViewPager
        viewpager.adapter = adapter

        val viewPagerTab = findViewById(R.id.viewpagertab) as SmartTabLayout
        viewPagerTab.setViewPager(viewPager)
    }
}
