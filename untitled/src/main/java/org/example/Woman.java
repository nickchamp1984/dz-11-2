package org.example;

public class Woman extends Person{
    public Woman(String firstName, String lastName, int age) {
        super(firstName, lastName, age);
    }

    @Override
    public boolean isRetired() {
        if (age >= 60) {
            return true;
        } else {
            return false;
        }
    }
}
