import java.util.Scanner;

class prob4{
    public static void main(String[] args){
        int[] value = new int[3];
        Scanner input = new Scanner(System.in);
        for(int i = 0 ; i < 3 ; i++){
            value[i] = input.nextInt();
        }
        System.out.println(Math.max(value[0],Math.max(value[1], value[2])));
        input.close();
    }
}
