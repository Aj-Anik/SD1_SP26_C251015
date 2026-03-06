class prob13{
    public static void main(String[] args){
        double[] arr = {34 , 32 , 23 , 71 , 44};
        double sum = 0;
        for(int i = 0 ; i < arr.length ; i++)
        {
            sum+= arr[i];
        }
        sum /= arr.length;
        System.out.println(sum);
    }
}