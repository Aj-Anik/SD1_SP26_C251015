import java.util.Scanner;

class prob18{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        String s = input.nextLine();
        int vow = 0;
        int con = 0;
        for(int i = 0 ; i < s.length() ; i++)
        {
            if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u'){
                vow++;
            }
            else if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z') con++;
        }
        System.out.println("Total Vowel : " + vow);
        System.out.println("Total Consonent : " + con);
        input.close();
    }
}