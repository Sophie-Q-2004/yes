import java.util.Scanner;

public class Main
{  
    static String a = "hey uhhhh gimme your number (not like that, the 1 to 5 number)";
    static String z = "";
    static Scanner y = new Scanner(System.in);
    static public int x;
    public static void main(String args[]){
        System.out.println(a);
        x = y.nextInt();
        if (x == 1 || x == 2 || x == 3 || x == 4 || x == 5){
            z += Integer.toString(meth_i_mean_math(meth_i_mean_math(x)));
            System.out.println("you are getting a gift for " + z);
        }
    }
    
   
    public static int meth_i_mean_math (int x) {
       
        int y = x;
        y ++;
        y = y^2 + y^3;
        y = y % 13;
        y = y*7 + 3;
        y = y*x;
        y = y^x;
        if (x == 3){
            y = y-2;
        }
        if (x == 4){
            y = y^4 + 1;
        }
        if (x == 5){
            y = y^x + 6;
        }
        y = y^x;
        y = (x+3)^y;
        y = y%5;
        if (y == 0){
           
            y = y + 5;
           
        }
        if (x == 5){
            y--;
        }
       
       
       
        return y;
       
       
    } 
}
