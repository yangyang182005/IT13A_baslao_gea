/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package LAB_EXERCISE2;


import java.util.Scanner;

public class Greatest_number {
    
    public static void main(String[] args){
        
  try (Scanner scanner = new Scanner(System.in)){ 
      System.out.println("enter the first number: ");
      int no1 = scanner.nextInt();
      
      System.out.println("enter the second number: ");
      int no2 = scanner.nextInt();
      
      System.out.println("enter the third number: ");
      int no3 = scanner.nextInt();
      
      int greatest = no1;
      
      if(no2 > greatest){
          greatest = no2;
      }
      if(no3 > greatest){
          greatest = no3;
      }
      
      System.out.println("the greatest number is: " + greatest);                
      }
  
    }
} 
   
     
    

