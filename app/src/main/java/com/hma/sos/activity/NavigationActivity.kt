package com.hma.sos.activity

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.hma.sos.fragment.EmergencyNumbersFragment
import com.hma.sos.fragment.NavigationHomeFragment
import com.hma.sos.R
import kotlinx.android.synthetic.main.activity_navigation.*

class NavigationActivity:AppCompatActivity() {
    companion object{
        fun newIntent(context: Context): Intent {
            return Intent(context, NavigationActivity::class.java)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_navigation)

        botNavView.setOnNavigationItemSelectedListener {it->
            val fragment =when(it.itemId){
                R.id.bot_nav_home -> NavigationHomeFragment()
                R.id.bot_nav_emergency -> EmergencyNumbersFragment()
                else -> null
            }
            fragment?.let {
                replaceFragment(it)
            }
            return@setOnNavigationItemSelectedListener true
        }
        botNavView.selectedItemId= R.id.bot_nav_home
    }
    private fun replaceFragment(fragment: Fragment){
        supportFragmentManager.beginTransaction()
            .replace(R.id.containerMain,fragment)
            .commit()
    }
}