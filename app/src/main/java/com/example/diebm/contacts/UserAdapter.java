package com.example.diebm.contacts;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by diebm on 10/10/17.
 */

public class UserAdapter extends ArrayAdapter<String> {
    private Context context;
    ArrayList<String> users;

    public UserAdapter(Context context, ArrayList<String> users) {
        super(context, 0, users);
        this.context = context;
        this.users = users;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.contactrow, parent, false);

        TextView textView = (TextView) rowView.findViewById(R.id.contactName);

        textView.setText(users.get(position));

        return rowView;
    }
}
