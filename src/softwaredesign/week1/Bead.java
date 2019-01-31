/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor. I am adding a date to this comment, Jan 31, 2019
 */
package bead;

/**
 *
 * @author mehta
 */
public class Bead {

    /**Model Class for Bead.
     * Bead has color and a single letter on it
     * @param args the command line arguments
     */
        private String color;
        private char letter;

        //Overloaded Constructor taking both fields color and letter
        public Bead(String givenColor,char givenLetter)
        {
            color=givenColor;
            letter=givenLetter;
        }
    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param givenColor the color to set
     */
    public void setColor(String givenColor) {
            color = givenColor;
    }

    /**
     * @return the letter
     */
    public char getLetter() {
        return letter;
    }

    /**
     * @param givenLetter the letter to set
     */
    public void setLetter(char givenLetter) {
            letter = givenLetter;
    }
        
        
    
}
