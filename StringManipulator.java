public class StringManipulator {
    
    public String trimAndConcat(String inOne, String inTwo) {
       inOne = inOne.trim();
       inTwo = inTwo.trim();
       String inThree = inOne + " " + inTwo;
       return inThree;
    }
    public java.lang.Integer getIndexOrNull(String str, char c) {
        int val = str.indexOf(c);
        if (val > -1) {
        return val;
        } else {
            return null;
        }
    }
}