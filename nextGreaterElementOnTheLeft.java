import java.util.Scanner;
import java.util.Stack;

public class nextGreaterElementOnTheLeft {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("input Array");
            int n=sc.nextInt();
            int[] arr=new int[n];
            System.out.println("Input array elements");
            for (int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            int[] ans=ngetl(arr);
            for (int val:ans){
                System.out.print(val+" ");
            }
        }


    public static int[] ngetl(int[] arr) {
        int[] ngetl = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        st.push(0);
        ngetl[0] = -1;
        for (int i = 1; i < arr.length; i++) {
            while (st.size() > 0 && arr[i] >= arr[st.peek()]) {
                st.pop();
            }
            if (st.isEmpty()) {
                ngetl[i] = -1;
            }
        else
        {
//meaning arr[i]<arr[st.peek()
ngetl[i]=arr[st.peek()];
        }
        st.push(i);
    }

        return ngetl;
    }
}
