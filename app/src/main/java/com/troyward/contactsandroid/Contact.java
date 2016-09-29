package com.troyward.contactsandroid;

/**
 * Created by Troy on 9/29/16.
 */

public class Contact {
    String name;
    String phoneNumber;

    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return String.format("%s %s",name,phoneNumber);
    }
}
