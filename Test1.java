import java.util.*;

class Test1{
    public static void main(String[] args) {
        Scanner myScanner=new Scanner(System.in);
        System.out.println("Enter the numbers:");
        int num1=myScanner.nextInt();
        int num2=myScanner.nextInt();
        System.out.println("enter the operator:");
        myScanner.nextLine();
        String op=myScanner.nextLine();
        if(op.equals("+")){
            System.out.println(num1+"+"+num2+"="+(num1+num2));
        }
        else if(op.equals("-")){
            System.out.println(num1+"-"+num2+"="+(num1-num2));
        }
        else if(op.equals("*")){
            System.out.println(num1+"*"+num2+"="+(num1*num2));
        }
        else if(op.equals("/")){
            if(num2==0){
                System.out.println("Division by Zero error");
            }
            else{
            System.out.println(num1+"/"+num2+"="+(num1/num2));
            }
        }
        else{
            System.out.println("invlaid operator");
        }
        
    }
}
