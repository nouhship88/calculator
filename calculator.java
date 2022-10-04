import java.util.Scanner;

class calculator {
    public static void main(String[] args) {

        int x=0;
        int y=0;
        double result=0;
char expression=' ';
        Scanner in = new Scanner(System.in);
System.out.println("Enter first number");
x=in.nextInt();

System.out.println("Enter second number");
y=in.nextInt();

System.out.println("choose expression -*/+");
expression=in.next().charAt(0);

switch(expression) {
    case '-':
result=x-y;
      break;
    case '+':
    result=x+y;
    break;
    case '*':
    result=x*y;
    break;
    case '/':
    result=x/y;
    break;
    default:
      System.out.println("Wrong entrance");
  }


        System.out.println(result); // Display the string.

        in.close();
    }
}