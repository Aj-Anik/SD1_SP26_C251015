import java.util.Scanner;

class prob17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String s;
        s = input.next();
        int x = s.length();
        boolean check = true;
        for(int i = 0 ; i <  x/2 ; i++)
        {
            if(s.charAt(i) != s.charAt(x-1)) check = false;
            break;
        }   
        if(check) System.out.println("The string is Palindrom");
        else System.out.println("The string is not palindrom");
        input.close();
    }
}