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
public class wincondition2 extends Fourinarow {
    public static void towin2(){  //check vertically
        for(int r=6;r>2;r--){
            for(int x=0;x<7;x++){
                int check=0;
                int checkk=0;
                int remember=r;
                while(board[r][x].equals("O  ")&&r>-1){
                 check++;
                 r--;
                 if(check==4){
                     System.out.println("O has won");
                     System.exit(0);
            }
            }
                r=remember;
                while(board[r][x].equals("X  ")&&r>-1){
                 checkk++;
                 r--;
                 if(checkk==4){
                     System.out.println("X has won");
                     System.exit(0);
            }
            }
                r=remember;
            }
        }
        }
}