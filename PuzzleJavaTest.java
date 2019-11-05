import java.util.ArrayList;
import java.util.Arrays;
public class PuzzleJavaTest {
    public static void main (String[] args){

    PuzzleJava puzzle1 = new PuzzleJava();
    int[] puzzlearray = { 3, 5, 1, 2, 7, 9, 8, 13, 25, 32};
    ArrayList<Object> p1 = puzzle1.puzzleOne(puzzlearray);
    System.out.println(p1);

    PuzzleJava puzzle2 = new PuzzleJava();
    String[] namearray = {"Nancy", "Jinichi", "Fujibayashi", "Momochi", "Ishikawa"};
    ArrayList<Object> p2 = puzzle2.puzzleTwo(namearray);
    System.out.println(p2);

    PuzzleJava puzzle3 = new PuzzleJava();
    String[] alpharray = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z" };
    ArrayList<Object> p3 = puzzle3.puzzleThree(alpharray);
    System.out.println(p3);

    PuzzleJava puzzle4 = new PuzzleJava();
    int boundone = 55;
    int boundtwo = 100;
    int boundthree = 10;
    ArrayList<Object> p4 = puzzle4.puzzleFour(boundone, boundtwo, boundthree);
    System.out.println(p4);
    
    PuzzleJava puzzle5 = new PuzzleJava();
    boundone = 55;
    boundtwo = 100;
    boundthree = 10;
    ArrayList<Object> p5 = puzzle4.puzzleFive(boundone, boundtwo, boundthree);
    System.out.println(p5);
}
}
