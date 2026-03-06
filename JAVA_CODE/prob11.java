class prob11{
    public static void main(String[] args){
        int[] arr = {34 , 32 , 23 , 71 , 44};
        int check = -1;
        int x = arr.length;
        for(int i = 0 ; i < x ; i++)
        {
            if(check < arr[i])
            {
                check = arr[i];
            }
        }
        System.out.println(check);
    }
}