/*На шахматной доске расставить 8 ферзей так, чтобы они не били друг друга. 
И вывести Доску. Пример вывода доски 8x8
0x000000
0000x000
00x00000
*/

public class Task3 {    

    static int[] chessboard = {0,0,0,0,0,0,0,0};
    static int index = 0;
    static int version = 0;
    public static void main(String[] args) {
        do {
            if (checking()){
                if (index == 7) {
                    System.out.println(version++ + " [0]=" + chessboard[0] + " [1]=" + chessboard[1] + " [2]=" 
                    + chessboard[2] + " [3]=" + chessboard[3] + " [4]=" + chessboard[4] + " [5]=" + chessboard[5] + " [6]=" 
                    + chessboard[6] + " [7]=" + chessboard[7]);
                    printBoard();
                    chessboard[index]++;
                }
                else {
                    index++;
                }
            }
            else {
                chessboard[index]++;
            }
        } while (chessboard[0]<8);
    }

    static boolean checking() {
        int i;

        if (index == 0) {
            return true;
        }

        if (chessboard[index]>7){
            chessboard[index] = 0;
            index--;
            return false;
        }

        for (i=0;i<index;i++){
            if ((chessboard[index] == chessboard[i])|((Math.abs(chessboard[index] - chessboard[i])) == (index-i))){
                return false;
            }
        }

        return true;
   }

   static void printBoard() {
        for(int i=0;i<8;i++) {
            for(int j=0;j<8;j++) {
                if(chessboard[i] == j) {
                    System.out.print("X ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
        System.out.println();
   }
}

