import java.util.ArrayList;
import java.util.List;

class Driver{
    public static void main(String[] args){
        Author a = new Author("Erick");
        Author Dillon = new Author("Dillon");
        List<String> Dillon_list = new ArrayList<String>();
        Member b = new Member("Siriah");
        Member c = new Member("Bob");
        Member d = new Member("Rick");
        b.subscribe("Key2");
        c.subscribe("Key1");
        //System.out.println(c.getKeywords().size());
        List<String> keywords = new ArrayList<String>();
        keywords.add("Key1");
        keywords.add("Key2");
        keywords.add("Key3");
        a.publish("THIS IS A MESSAGE", keywords);
        keywords.add("Key4");
        c.subscribe("Key4");
        d.subscribe("Key4");

       // b.unsubscrbe("Key10");
        a.publish("This is another message",keywords);

        Dillon_list.add("Key4");
        Dillon.publish("DILLONS MESSAGE.", Dillon_list);




        List<String> log = b.get_log_entries();
        List<String> logc = c.get_log_entries();
        List<String> logd = d.get_log_entries();
        System.out.println("/////////////////////////////////////////");
        System.out.println(b.getName()+ " recieved " + log.size());
        System.out.println(c.getName()+ " recieved " + logc.size());
        System.out.println(d.getName()+ " recieved " + logd.size());
        System.out.println("/////////////////////////////////////////");

        for(int i = 0 ; i < log.size();  i++){
            System.out.println(log.get(i));
        }
        System.out.println("/////////////////////////////////////////");
        for(int i = 0 ; i < logc.size();  i++){
            System.out.println(logc.get(i));
        }
        System.out.println("/////////////////////////////////////////");                                                                                                                                                                                                                                     
        for(int i = 0 ; i< logd.size() ; i++){
            System.out.println(logd.get(i));
        }
    }
}