package be.ehb.module1;

public class Easy {
    public static void main(String[] args) {
        for (int i = 36; i <= 60; i++) {
            if(i%2 == 0){
                System.out.println(i);
            }
        }
        System.out.println("Now the while loop.");
        int j = 36;
        while(j <= 60){
            System.out.println(j);
            j++;
        }
    }
}
