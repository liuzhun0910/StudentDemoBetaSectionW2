/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayreverse;
import java.util.Scanner;

/**
 *
 * @author mehta
 */
public class ArrayReverse {

    /**A class to take in a word from the user
     * and print reverse of the word using array
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please Enter a Word");
        String word=sc.nextLine();
        
        //create array
        char c[]=new char[word.length()];
        
        //Populate array c
        for(int i=0;i<word.length();i++)
        {
            c[i]=word.charAt(i);
        }
        
        //to iterate backward
        for(int i=c.length-1;i>=0;i--)
        {
            System.out.println(c[i]);
        }
    }
    
}
