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
public class wincondition3 extends Fourinarow {
    public static void towin3(){  //check diagonally
        for(int r=6;r>2;r--){
            for(int x=3;x<7;x++){
                int check=0;
                int checkk=0;
                int remember=r;
                int remembex=x;
                while(board[r][x].equals("O  ")&&r>-1){
                 check++;
                 r--;
                 x--;
                 if(check==4){
                     System.out.println("O has won");
                     System.exit(0);
            }
            }
                x=remembex;
                r=remember;
                while(board[r][x].equals("X  ")&&r>-1){
                 checkk++;
                 r--;
                 x--;
                 if(checkk==4){
                     System.out.println("X has won");
                     System.exit(0);
            }
            }
                x=remembex;
                r=remember;
            }
        }
        }
}