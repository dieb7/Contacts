package com.example.diebm.contacts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;

public class ContactsActivity extends AppCompatActivity {

    private ListView my_contacts;
    private ArrayAdapter<String> listAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacts);

        // Find the listView resource
        my_contacts = (ListView) findViewById(R.id.contactsListView);

        // Create and populate a list of user names.
        String[] usernames = new String[] {"Fulanito", "Menganito", "Sutanito"};

        ArrayList<String> usernameList = new ArrayList<String>();

        usernameList.addAll(Arrays.asList(usernames));

        listAdapter = new UserAdapter(this, usernameList);

        my_contacts.setAdapter(listAdapter);
    }
}
