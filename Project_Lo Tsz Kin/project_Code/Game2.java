package game2;

import java.util.Scanner;
import java.util.Random;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Game2 {

    public static int guess = 10; // chance
    
private static void Game(){
                Scanner input = new Scanner(System.in);

        int[] ans = new int[4]; //4 digits number
        Ran n = new Ran(); //randam array
        n.Createnum();

        int[] result = new int[4];
        for (int i = 0; i < 4; i++) {
            result[i] = n.ran[i];
        }
        //UI
        System.out.println("=========== Bulls and Cows ==============");
        while (guess > 0) {
            System.out.println("You have " + guess + " times to guess!");
            System.out.println("Please enter your guess: (E.g.1 2 3 4 )");
            System.out.println("Number should not be repeated~~~");
            Check s = new Check();
            for (int i = 0; i < 4; i++) {
                result[i] = n.ran[i];
                s.a1[i] = result[i];
            }
            for (int i = 0; i < 4; i++) {
                ans[i] = input.nextInt();
                s.b1[i] = ans[i];
            }
            s.Checknum();
            System.out.println(s.Aflag + "A" + s.Bflag + "B");
            if (s.Aflag == 4) {
                System.out.println("Congraduations!");
                System.exit(0);
            }
            guess--;
        }
        System.out.println("Game Over!");
        System.out.println("The Correct number is " + result[0] + result[1] + result[2] + result[3] + " ! " );
        System.out.println("Go back Menu ? (Y/N)");
        char GoMenu;
        GoMenu = input.next().charAt(0);
        if(GoMenu == 'Y' || GoMenu == 'y'){
            RealMenu();
        }
        else if (GoMenu == 'N' || GoMenu == 'n'){
        
        }
        
    }

private static void Date(){
                Date date = new Date();
        String DATE_FORMAT = "yyyy/MM/dd HH:mm:ss";
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
              String time = sdf.format(date);
        System.out.println("The Date and time now is : " + time );
    }

private static void GameRule(){
        System.out.println("----------------------------------------------------------------------");
        System.out.println("Game Rule : First , system will ramdome draw 4 different number from 0-9 , User need to guess one by one . User only have 10 chance ."  + "\n After first round , System will give out a 'XAXB' , the number in front of A mean the correct number , the number infront of B mean the total of correct number but incorrect place.");
        System.out.println("For example 5243 , you guess 5346 , it will be 1A2B , the 5 is correct , it will show 1A , and 3 and 4 is correct , but wrong place , so it will be 2B , total is 1A2B!");
        System.out.println("It will keep going until '4A0B' was show !");
        System.out.println("----------------------------------------------------------------------");
    }

private static void Menu(){
        System.out.println("==========================================================");
        System.out.println("The Menu is setting up please wait a few min ! ");
        System.out.println("The set up is finish , the programe is starting ! ");
        System.out.println("Welcome !");
        System.out.println("==========================================================");
}

public static void PrintExit(){
        System.out.println("BYE!");
        System.out.println("Thank you for using this programe !~~");
    }

private static void RealMenu(){     //Start with menu prototype** 
        Scanner sc = new Scanner(System.in); 
        System.out.println("----------------------------------------------------------------------");
        System.out.println("Please enter number ! ");
        System.out.println("Please select a function !");
        System.out.println("Function 1: Play Guess Number game  ");
        System.out.println("Function 2 : Calcuate Factorial game");
        System.out.println("Function 3 : Exit");
        System.out.println("----------------------------------------------------------------------");
        char userinput;
           userinput = sc.next().charAt(0); 
        if (userinput == '1'){
           Function1();
           GameRule();
           Game();        
           PrintExit();
           }
        else if(userinput == '2'){
               Function2();
               Factorial();
               PrintExit();
           }
        else if(userinput == '3'){
           PrintExit();
    }
        else{
               System.out.println("----------------------------------------------------------------------");
               System.out.println("Error !! Please enter the correct Number !! ");       
               RealMenu();
           }       
        
    }

private static void Function1(){
        Scanner sc = new Scanner(System.in); 
        System.out.println("==============================================");
        System.out.println(" You choose (Function 1:Play Guess Number game) "  );
        System.out.println("You are going to Guess Number ! ~ ~ ");
        System.out.println("==============================================");
}

private static void Function2(){
        Scanner sc = new Scanner(System.in);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(" You choose (Function 2 :Calcuate Factorial) ");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("You are going to calcuate  Factorial ! ~ ~ ");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
    }
    
private static void Factorial(){
        int fac = 1;
        Scanner sc = new Scanner (System.in);
        System.out.println("Please enter your number to calcuate factorial (Please input less than 16!!)");
        int x = sc.nextInt();
                
        for (int i = 1 ; i <= x ; i++){
            fac = fac*i;                
        }
        
        System.out.println("The factorial of  " + x +" is : " + fac );
        System.out.println("Is the System correct ? (Y/N) ");
        char correct;
        correct = sc.next().charAt(0); 
        if(correct == 'Y' || correct == 'y'){
            System.out.println("You are correct ! ");
        }
        else if (correct == 'N' || correct == 'n'){
            System.out.println("You are Wrong ! ");
        }
        
        System.out.println("Do you want to play again ? (y/n)");
        char playagain;
        playagain = sc.next().charAt(0);
        if(playagain == 'Y' || playagain == 'y'){
            Factorial();
        }
        else if (playagain == 'N' || playagain == 'n'){
            RealMenu();
        }
        }
         

    public static void main(String[] args) {
Scanner sc = new Scanner(System.in); 
           Date();           
           Menu();
           RealMenu();

    }
}

class Ran {

    int[] ran = new int[4];

    public void Createnum() {
        Random r = new Random();
        int flag = 0;
        for (int i = 0; i < 4; i++) {
            int ran1 = r.nextInt(10);
            if (i == 0) {
                ran[i] = ran1;
            }
            while (i != 0) {
                for (int j = i - 1; j >= 0; j--) {
                    if (ran1 == ran[j]) {
                        flag = 1;
                    }
                }
                if (flag == 1) {
                    ran1 = r.nextInt(10);
                    flag = 0;
                } else {
                    ran[i] = ran1;
                    break;
                }
            }
        }
    }
}

class Check {

    int Aflag = 0;
    int Bflag = 0;
    int[] a1 = new int[4];
    int[] b1 = new int[4];
    int an = 0;

    public void Checknum() {
        if (CheckRepeat(b1)) {
            System.out.println("Your number is repeated!");
            Game2.guess++;
        } else {
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    if (a1[j] == b1[i]) {
                        Bflag++;
                    }
                }
                if (a1[i] == b1[i]) {
                    Aflag++;
                }
            }
            Bflag -= Aflag;
        }
    }

    //stop user when the number repeat
    public boolean CheckRepeat(int[] b1) {
        boolean check = false;
        for (int i = 0; i < b1.length; i++) {
            for (int j = 0; i < b1.length; i++) {
                if ((b1[j] == b1[i]) && (i!=j)) {
                    check = true;
                }
            }
        }
        return check;
    }
}
