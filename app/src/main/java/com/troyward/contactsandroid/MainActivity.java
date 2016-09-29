package com.troyward.contactsandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
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
    }

//    @Override
//    public void onClick(View view) {
//        String t = editName.getText().toString();
//        if(!t.isEmpty()) {
//            ToDoItem item = new ToDoItem(t, false);
//            items.add(item);
//            text.setText("");
//        }
//    }
}
