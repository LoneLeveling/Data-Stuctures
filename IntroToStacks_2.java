import java.util.Stack;

public class IntroToStacks_2 {
    public static void main(String[] args) {
        Stack<Integer> st= new Stack<>();
        st.push(10);
        System.out.println(st +" --> "+st.peek()+" "+st.size());
        st.push(20);
        System.out.println(st +" --> "+st.peek()+" "+st.size());
        st.push(30);
        System.out.println(st +" --> "+st.peek()+" "+st.size());
        st.push(40);
        st.pop(); //40 kicked from top of stack
        System.out.println(st +" --> "+st.peek()+" "+st.size());
        st.pop(); //30 kicked from top of stack
        System.out.println(st +" --> "+st.peek()+" "+st.size());
        st.pop(); //20 kicked from top of stack
        System.out.println(st +" --> "+st.peek()+" "+st.size());
        st.pop(); //10 kicked from top of stack
      //  System.out.println(st +" --> "+st.peek()+" "+st.size());
        System.out.println(st +" --> "+st.size()); //above line will throw run time exception
        //cuz of st.peek() as there is no element left to look at in the stack.
    }
}
