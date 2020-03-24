package org.campus02.constructor;

public class Person {

    public String firstname;
    public String lastname;

    public Person(String fn, String ln){
        System.out.println("Konstruktor wurde aufgerufen!!");
        firstname = fn;
        lastname = ln;
    }


    public void print() {
        System.out.println(firstname + " " + lastname);
    }

}
