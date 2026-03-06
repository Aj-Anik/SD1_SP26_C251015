import java.util.Scanner ;

class prob3{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int value = input.nextInt();
        if(value % 2 == 0) System.out.println("even");
        else System.out.println("odd");
        input.close();
    }
}