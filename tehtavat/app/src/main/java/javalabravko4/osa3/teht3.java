package javalabravko3.osa3;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class teht3 {
    public static void main(String[] args) {
        Map<Integer,String> teht3 = new HashMap<>();
        teht3.put(1, "punainen");
        teht3.put(2, "valkoinen");
        teht3.put(3, "keltainen");
        for(Integer i : teht3.keySet()){
        System.out.print(i + " ");

        }
            }
     
}