package Mobile;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        MobilePhone phone = new MobilePhone("65648415");
        Contact ahmet = new Contact("Ahmet", "12545431");
        phone.addNewContact(new Contact("Gozde", "54189865"));
        phone.addNewContact(ahmet);
        phone.addNewContact(new Contact("Cemre", "125512"));
        phone.addNewContact(new Contact("Aslı", "14548232"));
        phone.addNewContact(new Contact("Ege", "1285484"));
        phone.printContact();

        System.out.println("Index: " + phone.findContact(ahmet));
        System.out.println("Index with String: " + phone.findContact(ahmet.getName()));
        System.out.println("Query Contact: " + phone.queryContact("Ayse"));
        phone.removeContact(ahmet);
        phone.printContact();

        //int x = 011;

        List<String> fruits = new LinkedList<>();
        fruits.add("Banana".toLowerCase());
        fruits.add("Apple".toLowerCase());


    }

}