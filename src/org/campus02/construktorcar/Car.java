package org.campus02.construktorcar;

public class Car {

    // Attribute sind außerhalb von Methoden
    public final String manufacturer;
    public String type;
    private String color;
    public String owner;

    public Car(String mf, String ty, String co){
        manufacturer = mf;
        type = ty;
        color = co;
    }


    public void setColor(String newColor){
        if (newColor.equals("yellow")
                || newColor.equals("blue")
                || newColor.equals("green")
        ){
            color = newColor;
        }
        else {
            System.out.println("Die Polizei erlaubt diese Farbe nicht!");
        }
    }

}
