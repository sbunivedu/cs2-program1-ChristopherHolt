public class Main
{
  public static boolean isOperand(char c){
    if(
      (c>='a' && c<='z') ||
      (c>='A' && c<='Z') ||
      (c>='0' && c<='9')){
        return true;
      }else{
        return false;
      }
  }
  public static boolean isOperator(char c){
    return c=='+' || c=='-' || c=='*' || c=='/';
  }
  public static int precedenceOrder(char c){
    if(c == '*' || c == '/' ){
      return 2;
    }else {
      return 1;
    }
  }
  while (!stack.isEmpty() &&
    precedenceOrder(stack.peek()) >= precedenceOrder(current)){
    System.out.print(stack.pop());
  }
  stack.push(current);  
