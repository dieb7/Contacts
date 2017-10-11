package com.example.diebm.contacts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;

public class ContactsActivity extends AppCompatActivity {

    private ListView my_contacts;
    private ArrayAdapter<User> listAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacts);

        // Find the listView resource
        my_contacts = (ListView) findViewById(R.id.contactsListView);

        // Create and populate a list of users
        UserList userList = new UserList();

        userList.addUser(new User("Fulanito", "fulanito@gmail.com", "0"));
        userList.addUser(new User("Menganito", "menganito@gmail.com", "1"));

        listAdapter = new UserAdapter(this, userList.getUsers());

        my_contacts.setAdapter(listAdapter);
    }
}
