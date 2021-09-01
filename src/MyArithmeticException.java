public class MyArithmeticException extends Exception {
    String s;
    MyArithmeticException(String s){
        this.s=s;
    }
    public void printError(){
        System.out.println(s);
    }
}
