public class App {
    public static void main(String[] args) throws Exception {
        int[] my_array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; 

        //Output Average of the values in the array
        System.out.println("Average: " + avgArray(my_array));
    }

    public static int avgArray(int[] x){
        int avg = 0;
        
        int i = 0;
        while(i<x.length)
            avg += i;
        avg = avg/i;

        return avg;
    }
}
