package org.example;

public class Main {
    public static void main(String[] args) {

        Medication medication1 = new Medication("Escitalopram", 14.99,true);
        Medication medication2 = new Medication("Ritalin", 34.99,true);
        Medication medication3 = new Medication("Paracetamol", 4.99,true);

        Apotheke apotheke = new Apotheke();
        apotheke.save(medication1);
        apotheke.save(medication2);
        apotheke.save(medication3);

        System.out.println(apotheke);
        apotheke.displayApotheke();
        apotheke.delete("Ritalin");
        apotheke.displayApotheke();
        System.out.println(apotheke.find("Paracetamol"));
    }
}