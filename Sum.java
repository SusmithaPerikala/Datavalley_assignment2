import java.util.Arrays;

public class Sum{
    public static void main(String[] args) {
        int[] arr = {10, 51, 53, 39, 47, 44, 21};
        Arrays.sort(arr);
        
        int sum = arr[arr.length-2] + arr[arr.length-3];
        System.out.println("The sum of second and third largest numbers is: " + sum);
    }
}
