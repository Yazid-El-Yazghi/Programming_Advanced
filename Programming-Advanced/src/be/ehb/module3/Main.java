package be.ehb.module3;

import java.util.ArrayList;
import java.util.TreeMap;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeMap < String, String > woordenboek = new TreeMap <>();
        woordenboek.put("Algoritme","Woord gebruikt door programmeurs die hun code niet kunnen uitleggen");
        woordenboek.put("Programmeren","Het schrijven van code");
        woordenboek.put("Programmeren","Het schrijven van shit code");


        System.out.println(woordenboek.get("Programmeren"));
    }
}
