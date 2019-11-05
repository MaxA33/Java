import java.util.Set;
import java.util.HashMap;
public class HashMapFun {
    public static void main(String[] args) {
        HashMap<String, String> trackList = new HashMap<String, String>();
        trackList.put("Killing in the name of", "Some of those that work forces are the same that burn crosses");
        trackList.put("Barbie Girl", "I'm a Barbie Girl in a barbie world, life in plastic it's fantastic");
        trackList.put("How it Was", "Hit the block and sell drugs thats exactly how it was");
        trackList.put("Better off alone", "Do you think you're better off alone dodododododoo");

        // get one song
        String name = trackList.get("Killing in the name of");
        System.out.println("The First Song is " + name);
        // get the keys by using the keySet method
        Set<String> keys = trackList.keySet();
        for(String key : keys) {
            System.out.println(key);
            System.out.println(trackList.get(key));    
        }
    }
}
