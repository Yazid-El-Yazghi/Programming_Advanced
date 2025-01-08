package be.ehb.module4;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        String path = "C:\\Users\\yazid\\Desktop\\Poject\\Programming Project\\Programming-Project\\src\\Resources\\netflix_titles.csv";
//        String line = "";
//        try {
//            BufferedReader br = new BufferedReader(new FileReader(path));
//
//            while((line = br.readLine()) != null) {
//                String[] data = line.split(",");
//                System.out.println(data[2] + " " + data[3] + " " + data[7]);
//                break;
//            }
//
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

        String test = "\"70065112,Movie,Cézanne et moi,Daniele Thompson,\"\"Guillaume Canet, Guillaume Gallienne, Alice Pol, Déborah François, Sabine Azéma, Freya Mavor, Isabelle Candelier, Laurent Stocker\"\",\"\"Belgium, France\"\",\"\"September 7, 2017\"\",2016,R,114 min,\"\"Dramas, Independent Movies, International Movies\"\",\"\"This historical drama explores the long and often volatile friendship of painter Paul Cézanne and writer Émile Zola, who first met as schoolboys.\"\"\";;";

        boolean inQuotes = false;
        boolean inComas = false;
        String[] data = new String[24];
        char[] character = new char[250];
        character[0] = ' ';
        char space = ' ';
        int added = 0;
        int count = 1;

        for (int i = 1; i < test.length(); i++) {
            if(test.charAt(i) == '\"' && test.charAt(i + 1) == '\"') {
                inQuotes = !inQuotes;
            }
            if ((!inQuotes && test.charAt(i) == ',') || (test.charAt(i) == ';')) {
                inComas = !inComas;
                if(character != null) {
                    int k = 0;
                    character[count + 1] = space;
                    while(character[k] != '\u0000') {
                        k++;
                    }
                    char[] temp = new char[k];
                    for (int t = 0; t < k; t++) {
                        temp[t] = character[t];
                    }
                    data[added] = new String(temp);
                    character = new char[250];
                    character[0] = ' ';
                    count = 1;
                    added++;
                }
            }

            if(test.charAt(i) != ',' && test.charAt(i) != '\"') {
                character[count] = test.charAt(i);
                count++;
            } else if (test.charAt(i) == ',' && inQuotes) {
                character[count] = test.charAt(i);
                count++;
            }
        }
        System.out.println(data[0] + data[1] + data[2] + data[3] + data[4] + data[5] + data[6] + data[7] + data[8] + data[9] + data[10] + data[11]);
    }
}