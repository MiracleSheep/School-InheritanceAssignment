/**
 *
 * Description: This is a media superclass that stores media
 *
 * @author John Khalife
 *
 * @version 2021-05-28
 *
 */

//importing packages
package com.company;


//declaring class KhalifeMedia
public class KhalifeMedia {

    //Each instance of this class must have a title
    private String strTitle;

    //each instance must have a integer named length for seconds
    private int length;

    //methods


    //constructor
    public KhalifeMedia (String strTitle, int length) {
        //sets values of titile and length using parameters
        this.strTitle = strTitle;
        this.length = length;
    }

    //default constructor
    public KhalifeMedia() {
        //setting the values of title and length
        this.length = 0;
        this.strTitle = "Undefined";
    }

    //tostring method that returns the object as a string
    public String toString() {

        return("Title: " + this.strTitle + "/n Length: "  + ((this.length % 86400) / 3600) + ":" + (((this.length % 86400 ) % 3600 ) / 60) + ":" + (((this.length % 86400 ) % 3600 ) % 60));

    }

    //getmethods

    //get Title method
    public String getTitle() { return strTitle; }

    //get length method
    public int getLength() {return this.length;}









}
