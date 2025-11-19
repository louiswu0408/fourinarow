/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fourinarow;

import static fourinarow.Fourinarow.board;

/**
 *
 * @author CMD
 */

public class tie extends Fourinarow{
    public static void tie(){  //check if it's a tie
        int t=0;
        for(int outer=0;outer<board.length;outer++){
           for(int inner=0;inner<board[outer].length;inner++){
               if(board[outer][inner].equals("_  ")){
                   t++;
               }
           }
        }
        if(t==0){
            System.out.println("it's a tie");
            System.exit(0);
        }
}
}
