import java.util.Scanner;
public class Repetitions_1069 {
    private static int findLengthLongestRepitition(String str){
        int maxCount = 0;
        int count = 1;
        for(int i =1;i<str.length();i++){
            if(str.charAt(i)!=str.charAt(i-1)){
                maxCount = Math.max(maxCount, count);
                count = 0;
            } 
            count++;
        }

        return maxCount > count ? maxCount : count;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String dna = sc.nextLine();
        int ans = findLengthLongestRepitition(dna);
        System.out.println(ans);
        sc.close();
    }
}
