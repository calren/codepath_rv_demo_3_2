package com.example.contactsrvdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val contacts = populateContacts()

        // Lookup the recyclerview in activity layout
        val rvContacts = findViewById<RecyclerView>(R.id.rv)

        // Create adapter passing in the sample user data
        val adapter = ContactsAdapter(contacts)

        // Attach the adapter to the recyclerview to populate items
        rvContacts.adapter = adapter

        // Set layout manager to position the items
        rvContacts.layoutManager = LinearLayoutManager(this)
    }

    fun populateContacts(): List<Contact> {
        var contacts = ArrayList<Contact>()

        contacts.add(Contact("Carmy", ContextCompat.getDrawable(this, R.drawable.man_icon)))
        contacts.add(Contact("Marcus", ContextCompat.getDrawable(this, R.drawable.man_icon)))
        contacts.add(Contact("Richard", ContextCompat.getDrawable(this, R.drawable.man_icon)))
        contacts.add(Contact("Sydney", ContextCompat.getDrawable(this, R.drawable.woman_icon)))
        contacts.add(Contact("Tina", ContextCompat.getDrawable(this, R.drawable.woman_icon)))
        return contacts
    }
}