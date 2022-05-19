package com.company;

import java.util.Arrays;

public class Gostinica implements PlataZaComUslugi {
    private Person[] people;
    private String adress;
    private int price;

    public Gostinica() {}

    public Gostinica(Person[] people, String adress, int price) {
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
    public void comUslugi() {
        System.out.println("Платят за комУслуги за гостиницу!: " + getPrice() + " $");
    }

    @Override
    public String toString() {
        return "Gostinica people: \n" + Arrays.toString(people) +
                ", adress: " + adress +
                ", price: " + price + " $";
    }
}
