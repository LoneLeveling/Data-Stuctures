import java.util.Scanner;
import java.util.Stack;

//Given an expression, need to print true if each bracket is closed with proper bracket, i.e., curly bracket
//should be closed only by a curly bracket and not by square and vice versa.
//2. No. of closing and opening brackets must be same.
//So there should not be any bracket mismatch,
//so if expression is balanced print true else print false.
public class balanacedBrackets {
    //Approach: Keep pushing only opening brackets to the stack (Ignore other characters),
    // when a closing bracket is encountered ,
    //check(peek()) do we have its proper counterpart or not, If yes pop it --->if stack empty print true,
    // else false(this means proper counterpart was not encountered).

    //2. If opening brackets are more : If after going through entire exsprsn i.e,. after doing push n pop for
    //all the brackets, if we are left with opening brackets then it means we had more opening brackets then closing one's
    //so in this case i.e,. if at last stack size is not null then we have to print false, as exprsn is unbalanced.

    //3. If closing brackets are more: In this case stack size will be empty and we will still have closing brackets left,
    //so if we get a closing bracket even after the stack size is empty (as all balanced ones were pop'd already)
//then this means exprsn is not balanced and we print 'false'.
    // if stack size is 0 and still we have closing brackets left then false, this means extra closing brackets.
     public static void main(String[] args) {
               Scanner sc = new Scanner(System.in);
                 String str = sc.nextLine();
                    Stack<Character> st = new Stack<>();
                   for (int i=0;i<str.length();i++){
                    char ch= str.charAt(i);
                      if(ch=='('||ch=='{'||ch=='['){
                           st.push(ch);
              }
                   else if (ch==')'){
                  boolean val=  handleClosingBrackets(st,'(');
                if(val==false){
                    System.out.println(val);
                    return;
                }
                   } else if (ch=='}'){
                   boolean val= handleClosingBrackets(st,'{');
                          if(val==false){
                              System.out.println(val);
                              return;
                          }
                   } else if (ch==']') {
                      boolean val =handleClosingBrackets(st,'[');
                          if(val==false){
                              System.out.println(val);
                              return;
                          }
                  }
               }
                   if (st.size()==0) //means all brackets were balanced
                   {
                       System.out.println(true);
                   }
                   else//means extra opng brackets
                   {
                       System.out.println(false);
                   }
         }

         public static boolean handleClosingBrackets(Stack<Character> st ,char corresOpngBracket){
             if (st.size()==0) //extra closing brackets
             {
                 return false;
             }
             else if (st.peek()!=corresOpngBracket) //counterpart mismatch
             {

                 return false;
             }
             else {
                 st.pop();
                 return  true;
             }

         }

}
