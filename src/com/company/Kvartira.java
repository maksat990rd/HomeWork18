package com.company;

import java.util.Arrays;

public class Kvartira implements PlataZaKvartiru{

    private Person[] people;
    private String adress;
    private int price;

    public Kvartira() {}

    public Kvartira(Person[] people, String adress, int price) {
        this.people = people;
        this.adress = adress;
        this.price = price;
    }

    public Person[] getPeople() {
        return people;
    }

    public void setPeople(Person[] people) {
        this.people = people;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public void zaKvartiru() {
        System.out.println("Платят за кваритиру: " + getPrice() + " $");
    }

    @Override
    public String toString() {
        return "Kvartira people: \n" + Arrays.toString(people) +
                ", adress: " + adress +
                ", price: " + price + " $";
    }
}
