import java.util.Scanner;
public class Incr_1094 {
    private static long findOpr(int n, int[] nums){
        long count =0;
        for(int  i=1; i<n;i++){
            if(nums[i]<nums[i-1]){
                count += nums[i-1]- nums[i];
                nums[i] = nums[i-1];
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];
        for(int i =0;i<n;i++){
            nums[i] = sc.nextInt();
        }
        long ans = findOpr(n, nums);
        System.out.println(ans);
        sc.close();
    }
}
