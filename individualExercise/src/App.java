public class App {
    public static void main(String[] args) throws Exception {
        int[] my_array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; 

        //Output Sum of the values in the array
        System.out.println("Sum: " + sumArray(my_array));
    }

    public static int sumArray(int[] x){
        int sum = 0;
        for (int i: x)
            sum += i;
        return sum;
    }
}
