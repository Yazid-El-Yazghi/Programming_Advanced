package be.ehb.module4;

import be.ehb.module4.oef1.Persoon;

public class Main {
    public static void main(String[] args) {
        Persoon persoon1 = new Persoon();
        Persoon persoon2 = new Persoon("Jan", "Janssens");
        Persoon persoon3 = new Persoon("Piet", "Peeters");
        persoon1.getAll();
        persoon1.PersonCount();
    }
}
