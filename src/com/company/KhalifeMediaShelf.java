/**
 * Description: This is a the main class of the program. It is a shelf that stores media
 *
 * @author John Khalife
 * @version 2021-05-28
 */

//importing packages
package com.company;

import java.util.ArrayList;
import java.util.Scanner;

//declaring main class KhalifeMediaShelf
public class KhalifeMediaShelf {

    //this is the arraylist that contains all of the instances of KhalifeSong
    static ArrayList<KhalifeSong> songList = new ArrayList<KhalifeSong>();

    //this is the arraylist that contains all of the instances of KhalifeSong
    static ArrayList<KhalifeMovie> movieList = new ArrayList<KhalifeMovie>();

    //main method
    public static void main(String[] args) {

        //creating boolean for while loop
        boolean doWhileLoop = false;

        //boolean from input loop
        boolean doInputLoop = false;

        //byte that holds input from the user
        byte getInput = 0;

        //integer that holds input from the user

        //greeting the user
        System.out.println("Welcome to the media shelf!");

        //while loop for input
        while (!doWhileLoop) {


            //asking the user what they would like to do

            //listing options
            System.out.println("What would you like to do?");
            System.out.println("1: Insert");
            System.out.println("2: Delete");
            System.out.println("3: View");
            System.out.println("4: Quit");

            //reseting input loop
            doInputLoop = false;

            //starting input loop
            while (doInputLoop == false) {

                //getting the choice of the user
                getInput = userChoice("Choose your action", "Select using the numbers beside the options");
                doInputLoop = true;


                //checking if getInput is not equal to one or two
                if (getInput < 1 || getInput > 4) {
                    System.out.println("That was out of range. Please try again");
                    doInputLoop = false;
                }

            }



            //switch statement to check value of getInput
            switch (getInput) {
                case 1:
                    //inserting an item into the list
                    insert();
                    break;

                case 2:
                    //deleteing an item from a list
                    remove();
                    break;
                case 3:
                    //viewing all the entries in the media lists
                    printMedia();
                    break;
                case 4:
                    //breaking out of the loop and ending the program
                    System.out.println("Goodbye!");
                    doWhileLoop = true;
                    break;
            }


        }


    }

    //insert method - ask the user if they want to enter a song or movie and create an instance of it
    public static void insert() {

        //boolean for while loop input
        boolean doWhileLoop = false;

        //variable that holds userinput
        byte getInput = 0;

        //variable that holds the name of the work of art
        String strTitle;

        //variable that hollds the lgnth of the work of art (in seconds)
        int length;

        //variable that holds the artist of a song
        String strArtist;

        //variable that holds the genre of a song
        String strGenre;

        //variable that holds the Director of a movie
        String strDirector;

        //variable that holds the rating of a movbie
        String strRating;

        //asking the user what instance they would like to create


        //starting input loop
        doWhileLoop = false;

        while (doWhileLoop == false) {

            //getting the item that the user wants to update
            getInput = userChoice("Would you like to enter a movie or a song", "Press one for movie and two for song");
            doWhileLoop = true;


            //checking if getInput is not equal to one or two
            if (getInput != 2 && getInput != 1) {
                System.out.println("That was incorrect input. Please try again");
                doWhileLoop = false;
            }

        }


        //a switch statement to check the result of getinput
        switch (getInput) {

            //if get input is equal to one
            case 1:

                //getting the title from the user
                strTitle = strUserChoice("What is the title of the movie?");

                //getting the length from the user
                length = intUserChoice("What is the length of the movie (in seconds)");

                //getting the Director from the user
                strDirector = strUserChoice("Who is the director of this movie?");

                //getting the rating from the user
                strRating = strUserChoice("What is the rating of this movie");

                System.out.println("Added a movie to the list");

                movieList.add(new KhalifeMovie(strTitle, length, strDirector, strRating));

                break;

            //if getinput is equal to two
            case 2:


                //getting the title from the user
                strTitle = strUserChoice("What is the title of the song?");

                //getting the length from the user
                length = intUserChoice("What is the length of the song (in seconds)");

                //getting the Artist from the user
                strArtist = strUserChoice("Who is the artist of this song?");

                //getting the genre from the user
                strGenre = strUserChoice("What is the genre of this song");

                System.out.println("Added a song to the list");

                songList.add(new KhalifeSong(strTitle, length, strArtist, strGenre));
                break;
        }

    }

    //remove mehod - ask the user what they want to remove
    public static void remove() {

        //boolean for while loop
        boolean doWhileLoop = false;

        //integer that holds the spot in the araylist the user wants to remove
        int getUpdateitem = 0;

        // variable that holds input form the user
        byte getInput;

        if (movieList.size() == 0 || songList.size() == 0) {

        } else {



        //getting input from the user
        getInput = userChoice("Would you like to remove a song or movie from the list?", "Press one for movie and two for song");

        //checking what getInput is equal to
        switch (getInput) {
            //if the user chooses movie
            case 1:

                //creating a for loop that will run through the array
                for (int i = 0; i < movieList.size(); i++) {
                    KhalifeMovie movie = movieList.get(i);
                    //saying the name and the number in the array so the user can specify which on they want to modify
                    System.out.println("Movie number #" + (i + 1) + " is " + movie.getTitle() + ".");
                }

                //starting input loop
                doWhileLoop = false;

                while (doWhileLoop == false) {

                    //getting the item that the user wants to update
                    getUpdateitem = intUserChoice("What item would you like to remove? (pick a number)");
                    doWhileLoop = true;

                    //checking if the number given is a spot in the arraylist
                    if (getUpdateitem > movieList.size() || getUpdateitem < movieList.size()) {
                        //if not restart input
                        System.out.println("That number is outside of the range of the number of items you bought.");
                        doWhileLoop = false;
                    }

                }

                System.out.println("Removed item from list");
                movieList.remove(getUpdateitem - 1);

                break;
            //if the user chooses song
            case 2:

                //creating a for loop that will run through the array
                for (int i = 0; i < songList.size(); i++) {
                    KhalifeSong song = songList.get(i);
                    //saying the name and the number in the array so the user can specify which on they want to modify
                    System.out.println("Song number #" + (i + 1) + " is " + song.getTitle() + ".");
                }

                //starting input loop
                doWhileLoop = false;

                while (doWhileLoop == false) {

                    //getting the item that the user wants to update
                    getUpdateitem = intUserChoice("What item would you like to remove? (pick a number)");
                    doWhileLoop = true;

                    //checking if the number given is a spot in the arraylist
                    if (getUpdateitem > songList.size() || getUpdateitem < songList.size()) {
                        //if not restart input
                        System.out.println("That number is outside of the range of the number of items you bought.");
                        doWhileLoop = false;
                    }

                }

                System.out.println("Removed item from list");
                songList.remove(getUpdateitem - 1);

                break;


        }
        }


    }

    //print media method - output all movies and songs entered using their tostring methods
    public static void printMedia() {

        System.out.println("Here are all songs entered:");

        //creating a loop to display all bakery items bought
        for (KhalifeSong song : songList) {
            System.out.println(song.toString());
            System.out.println();
        }

        System.out.println();
        System.out.println();
        System.out.println();

        System.out.println("Here are all movies entered");

        //creating a loop to display all bakery items bought
        for (KhalifeMovie movie : movieList) {
            System.out.println(movie.toString());
            System.out.println();

        }


    }


    //This is a method that takes a string from the user with a question as a parameter, and returns the value (took it from grocery store assignment)
    static String strUserChoice(String strQuestion) {

        //creating a boolean for the user input loop
        boolean doWhileLoop = false;

        //creating a string for the user input
        String strResponse = "";

        //creating a loop for user input
        while (!doWhileLoop) {

            //prompting user for name
            System.out.println(strQuestion);

            //try catch for scanner input
            try {

                //getting input from the user (the name)
                strResponse = new Scanner(System.in).nextLine();
                doWhileLoop = true;

            } catch (Exception e) {
                //in case there is improper input
                System.out.println("Incorrect input. Try again");
                doWhileLoop = false;

            }

        }

        return (strResponse);

    }

    //This is a method that takes a question as a parameter, asks the user to pick between one or two, and will return the value (took it from my last assignment)
    public static byte userChoice(String strQuestion, String strOptions) {

        //declaring a variable called dowhileloop for a true/false while loop
        boolean doWhileLoop = false;

        //declaring a variable that will return the input
        byte getInput = 0;

        //Prompting the user whatever quiestion was spcified in the parameter
        System.out.println(strQuestion);
        //asking for input


        //creating loop for input
        while (!doWhileLoop) {

            System.out.println(strOptions);

            //making try catch statement
            try {

                //getting input
                getInput = new Scanner(System.in).nextByte();
                doWhileLoop = true;

            } catch (Exception e) {
                //asking user to try again
                doWhileLoop = false;

            }


        }

        return (getInput);


    }

    //This is a mehod that takes an integer value from the user. I took it from the grocery store assignment
    static int intUserChoice(String strQuestion) {

        //creating a boolean for the user input loop
        boolean doWhileLoop = false;

        //creating a string for the user input
        int response = 0;

        //creating a loop for user input
        while (doWhileLoop == false) {

            //prompting user for name
            System.out.println(strQuestion);

            //try catch for scanner input
            try {

                //getting input from the user (the name)
                response = new Scanner(System.in).nextInt();
                doWhileLoop = true;

            } catch (Exception e) {
                //in case there is improper input
                System.out.println("Incorrect input. Try again");
                doWhileLoop = false;

            }

        }

        return (response);

    }


}
