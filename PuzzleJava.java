import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
public class PuzzleJava {
        public ArrayList<Object> puzzleOne(int[] arraypuzzle){
            ArrayList<Object> newarr = new ArrayList<Object>();
            int sum = 0;
            Collections.shuffle(newarr);
            for (int i=0; i < arraypuzzle.length; i++){
                sum += arraypuzzle[i];
                    if(arraypuzzle[i] > 10){
                        newarr.add(arraypuzzle[i]);
                    }
            }
            return newarr;
        }
    
        public ArrayList<Object> puzzleTwo(String[] namepuzzle){
            ArrayList<Object> namearr = new ArrayList<Object>();
            for (int i = 0; i < namepuzzle.length; i++){
                if(namepuzzle[i].length() > 5){
                    namearr.add(namepuzzle[i]);
                }
            }
            Collections.shuffle(namearr);
            return namearr;
        }
        
        public ArrayList<Object> puzzleThree(String[] alphpuzzle){
            ArrayList<Object> alpharr = new ArrayList<Object>();
            for(int i=0; i<alphpuzzle.length; i++){
                alpharr.add(alphpuzzle[i]);
            }
            Collections.shuffle(alpharr);
            return alpharr;
        }
        //public int nextInt(int bound)
        public ArrayList<Object> puzzleFour(int firstbound, int lastbound, int countbound){
            ArrayList<Object> numarray = new ArrayList<Object>();
            Random r = new Random();
            for (int i=0; i < countbound; i++ ){
                numarray.add(r.ints(firstbound, (lastbound +1)).limit(1).findFirst().getAsInt());
            }
            return numarray;
        }
        public ArrayList<Object> puzzleFive(int firstbound, int lastbound, int countbound){
            ArrayList<Object> numsarray = new ArrayList<Object>();
            Random r = new Random();
            for (int i=0; i < countbound; i++){
                numsarray.add(r.ints(firstbound, (lastbound +1)).limit(1).findFirst().getAsInt());
            }
            System.out.println("First value is " + numsarray.get(0)  + " Last Value is " + numsarray.get(numsarray.size() -1));
            return numsarray;
        }
    }