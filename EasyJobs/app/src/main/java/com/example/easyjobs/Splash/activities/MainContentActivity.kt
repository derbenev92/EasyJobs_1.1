package com.example.easyjobs.Splash.activities

import android.os.Bundle

import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.easyjobs.fragments.FragmentManager
import com.example.easyjobs.R
import com.example.easyjobs.databinding.ActivityMainContentBinding
import com.example.easyjobs.fragments.ChatFragment

class MainContentActivity : AppCompatActivity() {
    ///ddd
    private lateinit var binding: ActivityMainContentBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainContentBinding.inflate(layoutInflater)
        setContentView(binding.root)
//        setButNavView()
        binding.toolbar.title=getString(R.string.tinder_job)
    }

///
//    private fun setButNavView() =with(binding){
//        binding.bottomPanel.setOnItemSelectedListener {
//            when (it.itemId) {
//                R.id.id_tinder_job -> {
//                    showToast("tinder_job")
//                   toolbar.title=getString(R.string.tinder_job)
//                    true
//                }
//                R.id.id_search_job -> {
//                    showToast("search_job")
//                    toolbar.title=getString(R.string.search)
//                    true
//                }
//                R.id.id_favorite -> {
//                    showToast("favorite")
//                    toolbar.title=getString(R.string.favorite)
//                    true
//                }
//                R.id.id_chat -> {
//                    FragmentManager.setFragment(ChatFragment.newInstance(),this@MainContentActivity)
//                    true
//                }
//                R.id.id_account -> {
//                    showToast("account")
//                    toolbar.title=getString(R.string.account)
//                    true
//                }
//                else -> {
//                    true
//                }
//            }
//        }
//    }




    private fun showToast(text: String) {
        Toast.makeText(this, text, Toast.LENGTH_SHORT).show()
    }
}