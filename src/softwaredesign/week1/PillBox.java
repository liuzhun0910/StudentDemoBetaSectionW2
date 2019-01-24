/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pillbox;

/**
 *
 * @author mehta
 */
public class PillBox {

    /**To populate the array with a word and 
     * print it on Console
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char[] PillBox=new char[7];
        PillBox[0]='s';
        PillBox[1]='t';
        PillBox[2]='u';
        PillBox[3]='d';
        PillBox[4]='e';
        PillBox[5]='n';
        PillBox[6]='t';
        
        for(int i=0;i<PillBox.length;i++)
        {
            System.out.println(PillBox[i]);
        }
    }
    
}
