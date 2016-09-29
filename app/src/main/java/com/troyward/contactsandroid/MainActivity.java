package com.troyward.contactsandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, AdapterView.OnItemLongClickListener {
    ListView list;
    EditText editName;
    EditText editPhone;
    Button addButton;

    ArrayAdapter<Contact> contacts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list = (ListView) findViewById(R.id.list);
        editName = (EditText) findViewById(R.id.editName);
        editPhone = (EditText) findViewById(R.id.editPhone);
        addButton = (Button) findViewById(R.id.addButton);

        contacts = new ArrayAdapter<Contact>(this,android.R.layout.simple_list_item_1);
        list.setAdapter(contacts);

        addButton.setOnClickListener(this);
        list.setOnItemLongClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String t = editName.getText().toString();
        String t2 = editPhone.getText().toString();
        if(!t.isEmpty() || !t2.isEmpty()) {
            Contact contact = new Contact(t,t2);
            contacts.add(contact);
            editName.setText("");
            editPhone.setText("");
        }
    }

    @Override
    public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
        Contact contact = contacts.getItem(position);
        contacts.remove(contact);
        return true;
    }
}
