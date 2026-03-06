import java.util.Scanner;

class prob19{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        String s = input.nextLine();

        String upc ;
        String lowc;

        lowc = s.toLowerCase();
        upc = s.toUpperCase();

        System.out.println(upc);
        System.out.println(lowc);
    }
}