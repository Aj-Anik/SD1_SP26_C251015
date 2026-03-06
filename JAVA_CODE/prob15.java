import java.util.*;

class prob15{
    public static void main(String[] args){
        int[] arr = {1 , 6 , 23 , 45 , 67 , 88 , 109 , 107 , 54 , 44 , 33 , 76};
        System.out.println("Find a Number : ");
        int x;
        Scanner input = new Scanner(System.in);
        x = input.nextInt();
        boolean check = false;
        for(int i = 0 ; i < arr.length ; i++)
        {
            if(arr[i] == x) check = true;
        }

        if(check) System.out.println("Found");
        else System.out.println("Not Found`");
        input.close();
    }
}