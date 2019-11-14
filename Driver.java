import java.util.ArrayList;
import java.util.List;

class Driver{
    public static void main(String[] args){
        Author a = new Author("Erick");
        Member b = new Member("Siriah");
        Member c = new Member("Bob");
       // b.subscribe("Key2");
        c.subscribe("Key1");
        System.out.println(c.getKeywords().size());
        List<String> keywords = new ArrayList<String>();
        keywords.add("Key1");
        keywords.add("Key2");
        keywords.add("Key3");
        a.publish("THIS IS A MESSAGE", keywords);
        keywords.add("Key4");
        c.subscribe("Key4");
        a.publish("This is another message",keywords);
        List<String> log = b.get_log_entries();
        for(int i = 0 ; i < log.size();  i++){
            System.out.println(log.get(i));
        }
    }
}