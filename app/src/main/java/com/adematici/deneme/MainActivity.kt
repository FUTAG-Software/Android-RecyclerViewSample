package com.adematici.deneme

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.adematici.deneme.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var adapter: MemberAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        adapter = MemberAdapter()
        updateMemberList(memberListGeneral)
    }

    private fun updateMemberList(memberList: ArrayList<Member>) {
        adapter.memberList = memberList
        binding.recyclerView.adapter = adapter
    }

}