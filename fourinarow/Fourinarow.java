/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fourinarow;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 *
 * @author CMD
 */
public class Fourinarow {  //replace the default null with _
    static int full=0;
    static int count=0;
    static String [][] board=new String[7][7];
    public static void four(int x){
        int r=6;
        while(board[r][x].equals("_  ")==false){
            if(r>0){
            r--;
            }
            else{
                full=1;
                break;
            }
        }
        if(full==1){   //react when the colume is full
            System.out.println("this colume is full already");
            count--;
            full=0;
        }
        else{     //check who has the move
            if(count%2==0){
                board[r][x]="X  ";
            }
            else{
                board[r][x]="O  ";
            }
        for(int outer=0;outer<board.length;outer++){  //show the move on the board
           for(int inner=0;inner<board[outer].length;inner++){
               System.out.print(board[outer][inner]);
           }
           System.out.println();
        }
       }      
    }
    public static void main(String[] args) {
        for(int outer=0;outer<board.length;outer++){
           for(int inner=0;inner<board[outer].length;inner++){
                    board[outer][inner]="_  ";
           }
       }
        Scanner input = new Scanner(System.in); //input
        while(true){
        try{
        if(count%2==0){
        System.out.print("O will have next move ");
        }
        else{
            System.out.print("X will have next move: ");
        }
        int x = input.nextInt()-1;
        while(0>x||x>6){   //make the the input integer is in range
            System.out.print("please input a integer between 1 to 7 ");
             x = input.nextInt()-1;
        }
        count++;
        Fourinarow.four(x);
        }
        catch(InputMismatchException e) {   //avoid wrong data type inputs
            System.out.println("Error: You did not enter a valid integer.");
            // Clear the scanner buffer
            input.next();
        }
        System.out.println();
        wincondition.towin();   //call subclasses
        wincondition2.towin2();
        wincondition3.towin3();
        wincondition4.towin4();
        tie.tie();
    }       
}
}