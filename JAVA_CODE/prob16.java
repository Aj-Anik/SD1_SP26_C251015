class prob16{
    public static void main(String[] args){
        int[] arr = {1 , 6 , 23 , 45 , 67 , 88 , 109 , 107 , 54 , 44 , 33 , 76};
        int x = arr.length;
        for(int i = 0 ; i < x ; i++)
        {
            for(int j = 0 ; j < x ; j++)
            {
                if(arr[i] < arr[j])
                {
                    int swap = arr[i];
                    arr[i] = arr[j];
                    arr[j] = swap;
                }
            }
        }


        for(int i = 0 ; i < x ; i++)
        {
            System.out.println(arr[i]);
        }
    }
}