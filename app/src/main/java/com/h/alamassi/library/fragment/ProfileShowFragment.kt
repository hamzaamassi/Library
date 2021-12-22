package com.h.alamassi.library.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.h.alamassi.library.R
import com.h.alamassi.library.databinding.FragmentProfileShowBinding
import com.h.alamassi.library.datasource.DatabaseHelper


class ProfileShowFragment : Fragment() {

    lateinit var databaseHelper: DatabaseHelper
    lateinit var profileShowFragment: FragmentProfileShowBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        profileShowFragment = FragmentProfileShowBinding.inflate(inflater)
        return profileShowFragment.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val userId = arguments?.getLong("user_id") ?: -1
        if (userId == -1L) {
        } else {
            val user = databaseHelper.getUser(userId)


        }
        profileShowFragment.ibEdit.setOnClickListener {
            requireActivity().supportFragmentManager.beginTransaction().replace(R.id.fragment_container,ProfileEditFragment()).commit()

        }
    }

}