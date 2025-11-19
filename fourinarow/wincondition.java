/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fourinarow;

/**
 *
 * @author CMD
 */
public class wincondition extends Fourinarow {
    public static void towin(){  //check horizontally
        
        for(int r=6;r>-1;r--){
            for(int x=0;x<4;x++){
                int check=0;
                int checkk=0;
                int remembex=x;
                while(board[r][x].equals("O  ")&&x<7){
                 check++;
                 x++;
                 if(check==4){
                     System.out.println("O has won");
                     System.exit(0);
            }
            } 
                x=remembex;
                while(board[r][x].equals("X  ")&&x<7){
                 checkk++;
                 x++;
                 if(checkk==4){
                     System.out.println("X has won");
                     System.exit(0);
            }
            }
                x=remembex;
        }
}
    }
}

