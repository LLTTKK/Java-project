/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bmical2;
import java.util.Scanner;

public class BMICal2 {
    Scanner sc = new Scanner(System.in);

public static void main(String[] args) {
 Scanner sc = new Scanner(System.in) ; 
    Double n1 , n2 ; 

System.out.println("Enter your height (M) : "); 
        n1 = sc.nextDouble();

 System.out.println("Enter your weight (kg) : "); 
    n2 = sc.nextDouble(); 

    Double sq_n1 = Math.pow(n1 , 2);

System.out.println("Yout BMI is " + n2/sq_n1 );

if (n2/sq_n1 <18.5){ 
    System.out.println("Category: Underweight");}

else if (n2/sq_n1 >=18.5 & n2/sq_n1 <= 23 ){
    System.out.println("Category:  Normal");}

else if(n2/sq_n1 >=23 & n2/sq_n1 <= 25){
    System.out.println("Category: Overweight");}

else if(n2/sq_n1 >25){
    System.out.println("Category: Obese");}


}
}