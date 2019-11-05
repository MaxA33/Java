import java.util.ArrayList;
public class BasicJava {
    public int print1255(int num1, int num2){
        for(int i= num1; i<num2; i++){
            System.out.println(i);
        }
        return num2;
    }

    public int negative255(int num3, int num4) {
        for(int i= num3; i<num4; i+=2){
            System.out.println(i);
        }
        return num4;
    }
    public int printsum(int input1, int input2, int input3) {
        for(int i=input1; i<input2; i++){
            System.out.println("New Number is " + i);
            input3+= i;
            System.out.println("Running sum is " + input3);
        }
        return input3;
    }
    public int[] itarray(int[] inputx) {
    for (int i=0; i<inputx.length-1; i++){
            System.out.println(inputx[i]);
        }
    return inputx;
    }
    public int maxarray(int[] inputt) {
        int max = inputt[0];
        for (int i=1; i<inputt.length-1; i++) {
            if (inputt[i] > max){
                max = inputt[i];
            }
        }
        return max;
    }
    public int avgarray(int[] inputs) {
        int sum = 0;
        for (int i=0; i<inputs.length; i++){
            sum += inputs[i];
        }
        int avg = sum/inputs.length;
        return avg;
    }
    public ArrayList<Object> arrayOddNumbers(int inOne, int inTwo){
        ArrayList<Object> arr = new ArrayList<Object>();
        for (int i = inOne; i<= inTwo; i++){
            if(i % 2 == 1) {
                arr.add(i);
            }
        }
        return arr;
    }
    public int arrayGreater(int[] numbers, int yvalue){
        int count = 0;
        for (int i = 0; i< numbers.length; i++){
            if( numbers[i] > yvalue){
                count ++;
            }
        }
        return count;
    }
    public int[] valueSquare(int[] numberset){
       for (int i =0; i < numberset.length; i++){
           numberset[i] = numberset[i] * numberset[i];
       }
       return numberset;
    }
    public int[] elimNegative(int[] numbersets){
        for (int i=0; i<numbersets.length; i++){
            if( numbersets[i] < 0 ){
                numbersets[i] = 0;
            }
        }
        return numbersets;
    }
    public ArrayList<Object>  maxminavg(int[] numbersett){
        ArrayList<Object> arrt = new ArrayList<Object>();
        int maximum = numbersett[0];
        int minimum = numbersett[0];
        int summation = 0;
        int average = 0;
        for (int i=0; i<numbersett.length; i++){
            summation += numbersett[i];
            if(numbersett[i] > maximum) {
                maximum = numbersett[i];
            }
            if(numbersett[i] < minimum){
                minimum = numbersett[i];
            }
        } 
        average = summation/numbersett.length;
        arrt.add(maximum);
        arrt.add(minimum);
        arrt.add(average);
        return arrt;
    }
    public ArrayList<Object> shiftyOne(int[] arrayfinal){
        ArrayList<Object> arrx = new ArrayList<Object>();
        for (int i=1; i < arrayfinal.length; i++){
            arrx.add(arrayfinal[i]);
        }
        arrx.add(0);
        return arrx;
    }
}
