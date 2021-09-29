/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phien23;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Phien23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int y;
        
        Scanner sc = new Scanner(System.in);
        y = sc.nextInt();
        
        if (y % 400 ==0 || (y %4==0 && y % 100 !=0))
        {
            System.out.println(y + " is a leap year");
        }else System.out.println(y +" not is a leap year");
    
    }
}
