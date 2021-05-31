/**
 *
 * Description: This is a media subclass that stores movies
 *
 * @author John Khalife
 *
 * @version 2021-05-28
 *
 */

//importing packages
package com.company;


import java.util.ArrayList;

//declaring class KhalifeMovie
public class KhalifeMovie extends KhalifeMedia {

    //class variables

    //each KhalifeMovie must have a Director
    private String strDirector;

    //each KhalifeMovie must have a rating
    private String strRating;

    //Arraylist that contains all instances of KhalifeMovie
    public static ArrayList<KhalifeMovie> movieList = new ArrayList<KhalifeMovie>();

    //methods

    //constructor
    public KhalifeMovie(String strTitle, int length, String strDirector, String strRating) {

        //calling superclass constructor
        super(strTitle, length);

        //assigning subclass variables values
        this.strDirector = strDirector;
        this.strRating = strRating;

    }

    //default constructor
    public KhalifeMovie() {

        //calling superclass constructor
        super();

        //assigning values to subclass variables
        this.strDirector = "Undefined";
        this.strRating = "Undefined";

    }

    @Override
    //toString method that prints the object as a string
    public String toString() {
        return("Title: " + super.getTitle() + "\n     Length: "  + ((super.getLength() % 86400) / 3600) + ":" + (((super.getLength() % 86400 ) % 3600 ) / 60) + "\n     Rating: " + this.strRating + "\n     Director: " + this.strDirector);
    }



}
