package br.com.mirabilis.tab

import android.util.Log
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

@Suppress("DEPRECATION")
class SampleAdapter(fm: FragmentManager, coba: ArrayList<String>) : FragmentPagerAdapter(fm) {

    val data : ArrayList<String> = coba

//    override fun getItem(position: Int): Fragment = when (position) {
//        0 -> FragmentGeneric.newInstance("jahat")
//        1 -> FragmentGeneric.newInstance("gogon")
//        else -> null
//    }!!

//    override fun getPageTitle(position: Int): CharSequence = when (position) {
//        0 -> "Tab 1 Item"
//        1 -> "Tab 2 Item"
//        else -> ""
//    }

//    override fun getCount(): Int = 2

//--------------

    override fun getItem(position: Int): Fragment {
        return FragmentGeneric.newInstance()
    }

    override fun getPageTitle(position: Int): CharSequence{
       return data[position]
    }

    override fun getCount(): Int {
        return data.size
    }


}