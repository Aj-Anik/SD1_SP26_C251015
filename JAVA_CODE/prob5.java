import java.util.Scanner;

class prob5{
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first value : ");
        int val1 = input.nextInt();
        System.out.println("Enter the Operator(+ - * /) : ");
        String s = input.next();
        System.out.println("Enter the second value : ");
        int val2 = input.nextInt();

        System.out.print("The Answer is : ");
        if(s.equals("+")) System.out.println(val1 + val2);
        else if(s.equals("-")) System.out.println(val1 - val2);
        else if(s.equals("*")) System.out.println(val1 * val2);
        else if(s.equals("/")) System.out.println(val1 / val2);
    }
}