import java.util.Scanner;
import java.util.Stack;

//Greatest Integer to left
public class stockSpan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
int n=sc.nextInt();
        int[] arr=new int [n];
        System.out.println("Enter array");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int[] ans=nextGreatestIntegertoLeft(arr);
        for(int val: ans){
            System.out.print(val+" ");
        }
    }

    public static int[] nextGreatestIntegertoLeft(int[] arr){
        int[] span = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        st.push(0);
        span[0]=1;
        for (int i=1;i<arr.length;i++){
while (st.size()>0&&arr[i]>arr[st.peek()]){
    st.pop();
}
if(st.size()==0)//means you popped everything when you cam out of abov eloop , i.e., no element is > than you
{
span[i]=i+1;
}else {
  span[i]=i-st.peek();

}

            st.push(i);
        }



        return span;

    }
}
