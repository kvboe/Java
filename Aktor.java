package Slab1;

public class Aktor {
    String name;
    String lastname;
    int oscars;

    Aktor(String name, String lastname){
        this.name = name;
        this.lastname = lastname;
    }
    Aktor(String name, String lastname, int oscars){
        this(name, lastname);
        this.oscars = oscars;
    }

    void getInfo(){
        System.out.println("Slab1.Aktor " + name + lastname + " otrzymał " + oscars + " Oscarów!");
    }



}
