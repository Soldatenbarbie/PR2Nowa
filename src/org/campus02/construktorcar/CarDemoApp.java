package org.campus02.construktorcar;

public class CarDemoApp {

    public static void main(String[] args) {
        System.out.println("Program CarDemo started");

        Car p = new Car("Porsche",
                "Porsche 911", "green");
        p.owner = "Stephan Kochauf";

        Car golf = new Car("Volkswagen", "Golf VIII", "red");
        golf.owner = "Max Muster";
        //....

        golf.owner = "Susi Sorglos";
        golf.setColor("yellow");
        golf.setColor("black");

        BlankClass bc = new BlankClass();
    }

    public static void doSomething()
    {
        System.out.println("I did something...");
    }
}
