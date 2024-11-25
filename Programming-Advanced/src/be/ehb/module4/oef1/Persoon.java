package be.ehb.module4.oef1;

import be.ehb.module3.oef2.Adres;

public class Persoon {
    private String Voornaam;
    private String Achternaam;
    private String email;
    private Adres adres;
    private static int PersonCount = 0;

    public Persoon() {
        this.Voornaam = "Geen voornaam";
        this.Achternaam = "Geen achternaam";
        this.email = "no-email@nomail.com";
        this.adres = new Adres();
        PersonCount++;
    }

    public Persoon(String voornaam, String achternaam) {
        this.Voornaam = voornaam;
        this.Achternaam = achternaam;
        this.email = "no-email@nomail.com";
        this.adres = new Adres();
        PersonCount++;
    }

    public void PersonCount() {
        System.out.println("Aantal personen: " + PersonCount);
    }

    public void getAll(){
        System.out.println("Voornaam: " + Voornaam);
        System.out.println("Achternaam: " + Achternaam);
        System.out.println("Email: " + email);
        adres.getAll();
    }


}
