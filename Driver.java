import java.util.ArrayList;
import java.util.List;

class Driver{
    public static void main(String[] args){
        Author a = new Author("Erick");
        List<String> keywords = new ArrayList<String>();
        keywords.add("TEST");
        keywords.add("NUMBER");
        keywords.add("TEST2");
        a.publish("THIS IS A MESSAGE", keywords);
    }
}