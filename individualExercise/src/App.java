public class App {
    public static void main(String[] args) throws Exception {
        int[] my_array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; 

        //Output Average of the values in the array
        System.out.println("Average: " + avgArray(my_array));
        //Output Sum of the values in the array
        System.out.println("Sum: " + sumArray(my_array));
    }

    //This averages the values of the input array
    public static double avgArray(int[] x){
        //calculate sum of all array elements
        double sum = 0;
        for(int i=0; i < x.length ; i++)
         sum = sum + x[i];
        //calculate average value
         double avg = sum / x.length;

        return avg;    
    }
    
    //This summs the values of the array
    public static int sumArray(int[] x){
        int sum = 0;
        for (int i: x)
            sum += i;
        return sum;
    }
}
