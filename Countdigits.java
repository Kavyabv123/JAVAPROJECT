/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package countdigits;

/**
 *
 * @author Hp
 */
public class Countdigits {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num =1234456;
        int count =0;
        while (num!=0){
            num = num/10;
            count ++;
            
        }
        // TODO code application logic heresou
        System.out.println("no of counts ="+count);
    }
    
}
