import java.util.Scanner;
import java.util.Stack;

public class b4949 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        str = sc.nextLine();
        while(!str.equals(".")){
            Stack<Character> stack = new Stack<>();
            for(int i=0; i<str.length(); i++){
                char c = str.charAt(i);
                if(c=='('||c=='['){
                    stack.push(c);
                }else{
                    if (c == ')') {
                        if(!stack.isEmpty()&&stack.peek()=='(')
                            stack.pop();
                        else
                            stack.push(c);
                    } else if  (c == ']') {
                        if (!stack.isEmpty() && stack.peek() == '[')
                            stack.pop();
                        else
                            stack.push(c);
                    }
                }

            }
            if(stack.isEmpty()){
                System.out.println("yes");
            }else {
                System.out.println("no");
            }
            str = sc.nextLine();


        }
    }

}
