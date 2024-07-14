import java.util.Scanner;

public class solution70 {
    /**
     * 70. Climbing Stairs
     *
     * You are climbing a staircase. It takes n steps to reach the top.
     * Each time you can either climb 1 or 2 steps.
     * In how many distinct ways can you climb to the top?
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(climbStairs(n));
    }

    public static int climbStairs(int n) {
        // dp로 처리
        int[] answer = new int[n + 1];
        answer[0] = 1;
        answer[1] = 1;

        for (int i = 2; i <= n; ++i) {
            answer[i] = answer[i - 1] + answer[i - 2];
        }

        return answer[n];
    }

}
