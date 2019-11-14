import java.util.ArrayList;
import java.util.List;

class Driver{
    public static void main(String[] args){
        Author a = new Author("Erick");
        Author Dillon = new Author("Dillon");
        List<String> Dillon_list = new ArrayList<String>();
        Member Siriah = new Member("Siriah");
        Member Bob = new Member("Bob");
        Member Rick = new Member("Rick");
        Siriah.subscribe("Key2");
       // Bob.subscribe("Key1");
        //System.out.println(c.getKeywords().size());
        List<String> keywords = new ArrayList<String>();
        keywords.add("Key1");
        keywords.add("Key2");
        keywords.add("Key3");
        a.publish("THIS IS A MESSAGE", keywords);
        keywords.add("Key4");
        Bob.subscribe("Key4");
        Rick.subscribe("Key4");

        
        a.publish("This is another message",keywords);
        Bob.unsubscrbe("Key4");
        Dillon_list.add("Key4");
        Dillon.publish("DILLONS MESSAGE.", Dillon_list);




        List<String> log = Siriah.get_log_entries();
        List<String> logc = Bob.get_log_entries();
        List<String> logd = Rick.get_log_entries();
        System.out.println("/////////////////////////////////////////");
        System.out.println(Siriah.getName()+ " recieved " + log.size());
        System.out.println(Bob.getName()+ " recieved " + logc.size());
        System.out.println(Rick.getName()+ " recieved " + logd.size());
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