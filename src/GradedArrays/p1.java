package GradedArrays;

public class p1 {
    
    static int[] run(){
        int turn = 0;
        int won = 0;

        int d1,d2;
        int point = 0;
        boolean first = true;

        while(true){
            d1 = (int)(Math.random()*6)+1;
            d2 = (int)(Math.random()*6)+1;
            int roll = d1 + d2;

            if(first){
                if(roll == 7 || roll == 11){
                    won = 1;
                    break;
                }
                else if(roll == 2 || roll == 3 || roll == 12){
                    break;
                }
                else{
                    point = roll;
                }
                first = false;
            }
            else{
                if(roll == point){
                    won = 1;
                    break;
                }
                else if(roll == 7){
                    break;
                }
            }
            turn += 1;
        }
        int[] ret = {turn, won};
        return ret;
    }
    public static void main (String args[]){
        
    }
}
