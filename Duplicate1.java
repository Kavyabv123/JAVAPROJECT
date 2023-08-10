/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package duplicate1;

/**
 *
 * @author Hp
 */
import java.util.*;
public class Duplicate1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int i,count=0;
        System.out.println("enter the inputs");
        int n;
        n=sc.nextInt();
        int[] a= new int[n];
        System.out.println("enter the array elements");
        for(i=0;i<=a.length-1;i++){
            a[i]= sc .nextInt();
        }
        Arrays.sort(a);
        if(a[i]!=a[i+1]){
            count++;
        }
        
        System.out.println("duplicate array count are:");
        for(i=0;i<a.length-1;i++){
            System.out.println(count);
        }
        
    }
     
    
}
