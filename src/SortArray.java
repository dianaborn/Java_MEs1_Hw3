import java.util.Arrays;

public class SortArray {

    public static void main(String[] arg) {
        double[] nums = {-7.4, -4.7, 7.6, -6.8, 6.2, -9.6, 8.5, -4.7, 3.5, -5.6, 4.3, -5.8, 6.2, -3.5, 6.3};
        int i = 0;
        System.out.println("Arrays in original order: " + Arrays.toString(nums));

        Arrays.sort(nums);

        System.out.println("Sorted arrays in ascending order: " + Arrays.toString(nums));
        double sum = 0;
        double j;
        for (i = 0; i < nums.length; i++) {
            sum = sum + nums[(int) i];
        }
        System.out.println(sum);

    }
}