import java.util.Scanner;

public class Missing_1083 {
    private static int findMissingNumber(int n, int[] nums){
        long mathSum = n;
        if(n%2==0){
            mathSum/=2;
            mathSum*=n+1;
        } else {
            mathSum *= (n+1)/2;
        }
        long sum = 0;
        for(int num:nums){
            sum += num;
        }
        return (int)(mathSum - sum);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n-1];
        for(int i =0;i<n-1;i++){
            arr[i] = sc.nextInt();
        }
        int ans = findMissingNumber(n, arr);
        System.out.println(ans);
        sc.close();
    }
}
