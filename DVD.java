package Persewaan;

import java.util.Scanner;

public class DVD extends Product{
    private int lenght;
    private String rating;
    private String studio;

    public DVD() {
        number = 0;
        name = "DVD Malam Pertama";
        quantity = 0;
        price = 0;
        lenght = 140;
        rating = "NC-18";
        studio = "Rhoma Ryuichi";

    }
        public void DVDprint() {
            System.out.println("number: "+number);
            System.out.println("name: "+name);
            System.out.println("quantity "+quantity);
            System.out.println("price "+price);
            System.out.println("lenght "+lenght);
            System.out.println("rating "+rating);
            System.out.println("studio "+studio);
        }

    }

