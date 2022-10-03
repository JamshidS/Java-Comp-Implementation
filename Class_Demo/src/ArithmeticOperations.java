public class ArithmeticOperations {

    public int addition(int num1,int num2){
        return num1+num2;
    }

    public int subtraction(int num1,int num2){
        return num1-num2;
    }

    public int multiplication(int num1,int num2){
        return num1*num2;
    }

    public int division(int num1,int num2){
        if(num2>0){
            return num1/num2;
        }else{
            return 0;
        }
    }

}
