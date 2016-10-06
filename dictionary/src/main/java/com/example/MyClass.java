package com.example;

import java.util.Scanner;
import java.util.Dictionary;
import java.util.Hashtable;

public class MyClass
{
    public static void main(String[] args)
    {
        String[] movieList = {"Action", "Comedy", "Animated", "Western", "Classic", "Horror"};
        for (int i = 0; i < movieList.length; i++)
        {
            System.out.println(movieList[i] + " ");
        }

        System.out.println("\n" + "What type of movie do you want to watch. Enter a genre from the list");

        Dictionary movies = new Hashtable();

        movies.put("Action", "James Bond");
        movies.put("Comedy","Airplane" );
        movies.put("Animated", "Toy Story");
        movies.put("Western", "Magnificent Seven");
        movies.put("Classic", "Gone With the Wind");
        movies.put("Horror", "Nightmare on Elm Street");

        Scanner input = new Scanner (System.in);
        String b = input.next();

        System.out.println("You should watch "+ movies.get(b));



    }
}