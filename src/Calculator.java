import java.util.Scanner;

public class Calculator {


    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        float n1;
        float n2;
        String e="n";
        while(e.compareTo("n")==0){
            System.out.println("Enter 2 numbers");
            n1=input.nextFloat();
            n2=input.nextFloat();
            System.out.println("Enter the symbol of the operation");
            String s= input.next();
            switch(s){
                case "+" :
                    addNum(n1,n2);
                    break;
                case "-" :
                    subNum(n1,n2);
                    break;
                case "*" :
                    multiplyNum(n1,n2);
                    break;
                case "/" :
                    divideNum(n1,n2);
                    break;
                case "%" :
                    modNum(n1,n2);
                    break;
                default:
                    System.out.println("Enter a valid operation");

            }
            System.out.println("Do you want to exit? \n[y/n]");
            e=input.next();
        }
    }
    public static void addNum(float n1,float n2){
        System.out.println(n1+n2);
    }
    public static void subNum(float n1,float n2){
        System.out.println(n1-n2);
    }
    public static void multiplyNum(float n1,float n2){
        System.out.println(n1*n2);
    }
    public static void divideNum(float n1,float n2){
        try{
            if(!Float.isFinite(n1/n2)){
                throw new MyArithmeticException("Can't divide by zero!");
            }
            System.out.println(n1/n2);
        }
        catch(MyArithmeticException ex){
            ex.printError();
        }
    }
    public static void modNum(float n1,float n2){
        System.out.println(n1%n2);
    }
}
