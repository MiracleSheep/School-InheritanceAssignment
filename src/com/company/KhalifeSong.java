/**
 *
 * Description: This is a media subclass that stores songs
 *
 * @author John Khalife
 *
 * @version 2021-05-28
 *
 */

//importing packages
package com.company;

//declaring the KhalifeSong class
public class KhalifeSong extends KhalifeMedia {

    //each KhalifeSong instance shall have a artist name
    private String strArtist;

    //each KhalifeSong instance shall also have a genre
    private String strGenre;

    //methods

    //constructor
    public KhalifeSong(String strTitle, int length, String strArtist, String strGenre) {

        //calling the superclass constructor
        super(strTitle,length);

        //assigning subclass variables
        this.strArtist = strArtist;
        this.strGenre = strGenre;

    }

    //default constructor
    public KhalifeSong() {
        //callning the superclass constructor
        super();

        //assignning values to subclass variables
        this.strArtist = "Undefined";
        this.strGenre = "Undefined";

    }

    @Override
    //toString method returns object as a string
    public String toString() {

        return("Title: " + super.getTitle() + " by " + this.strArtist + "\n Length: "  +  (((super.getLength() % 86400 ) % 3600 ) / 60) + ":" + (((super.getLength() % 86400 ) % 3600 ) % 60) + "\n Genre: " + this.strGenre);

    }



}
