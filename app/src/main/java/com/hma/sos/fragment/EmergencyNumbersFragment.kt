package com.hma.sos.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.hma.sos.R
import com.hma.sos.contacts.ContactAdapter
import kotlinx.android.synthetic.main.fragment_emergencynumbers.*

class EmergencyNumbersFragment:Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_emergencynumbers,container,false)
    }

    private lateinit var contactAdapter: ContactAdapter

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        contactAdapter = ContactAdapter()
        rvContact.adapter = contactAdapter
        rvContact.layoutManager = LinearLayoutManager(context)
    }
}