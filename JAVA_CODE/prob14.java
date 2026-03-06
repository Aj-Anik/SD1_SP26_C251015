class prob14{
    public static void main(String[] args){
        int[] arr = {12 , 13 , 33 , 47 , 42 , 78 , 87 , 99 , 102};
        int odd = 0;
        int even = 0;
        for(int i = 0 ; i < arr.length ; i++)
        {
            if(arr[i] % 2 == 0) even++;
            else odd++;
        }
        System.out.println("Total Odd number : " + odd);
        System.out.println("Totla Even number : " + even);
    }
}