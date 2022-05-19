package com.company;

public class Main {

    public static void main(String[] args) {
        /** 1. Уй-булолор квартирада, общежитиеде жана гостиницада жашашат

         2. Квартирада жашагандар ком услуга толошот
         3. Общежитие менен гостиницада жашагандар аренда толошот

         4. Уй-булолор бир канча адамдан турушат

         5. Кайсы жерде канча адам жашаганын консольго чыгарыныз

         6. Жашoo демек озунун адресин корсотуу
         Hint: кыймыл аракеттерди интерфейс аркылуу реализация кыласыздар,
         квартира бул класстар,
         уй-було бул массив, адам бул класс */

        Person person1 = new Person("Nurs");
        Person person2 = new Person("Aziza");
        Person person3 = new Person("Ayzada");
        Person person4 = new Person("Maksat");
        Person person5 = new Person("Ayjan");
        Person person6 = new Person("Aruke");
        Person person7 = new Person("Marsel");
        Person person8 = new Person("Daniel");
        Person person9 = new Person("Kalis");
        Person person10 = new Person("Azamat");

        Person[] kvartir = {person1,person2,person3};
        Person[] gostin = {person4,person5,person6,person7};
        Person[] obshag = {person8,person9,person10};

        int count = 0;
        for (Person person : kvartir) {
            count++;
        }

        int count1 = 0;

        for (Person person : gostin) {
            count1++;
        }

        int count2 = 0;
        for (Person person : obshag) {
            count2++;
        }

        Kvartira kvartira = new Kvartira(kvartir, "Нарын!", 3000);
        System.out.println(kvartira);
        System.out.println("Проживают: " + count + " человека");
        kvartira.zaKvartiru();
        System.out.println("-------------------------");

        Gostinica gostinica = new Gostinica(gostin, "Бишкек!", 12000);
        System.out.println(gostinica);
        System.out.println("Проживают: " + count1 + " человека");
        gostinica.comUslugi();
        System.out.println("-------------------------");

        Obshejitie obshejitie = new Obshejitie(obshag, "Талас!", 6000);
        System.out.println(obshejitie);
        System.out.println("Проживают: " + count2 + " человека");
        obshejitie.comUslugi();
    }
}
