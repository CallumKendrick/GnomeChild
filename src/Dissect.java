import java.util.ArrayList;

/**
 * Created by Aaron on 10/10/2015.
 */
public class Dissect {
    private ArrayList<String> words;
    private String q;

    public Dissect(String q){
        words = new ArrayList<String>();
        this.q = q;

        process(q);
    }

    public void process(String q){
        String[] arr = q.split(" ");

        for ( String ss : arr) {
            if(ss.charAt(0) == "c") {
                System.out.println(ss);
            }
        }
    }

    public ArrayList<String> getWords() {
        return words;
    }
}
