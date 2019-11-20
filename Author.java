// Posting ID: 1804-110 , ASU ID: 1208001804
//BEGIN
import java.util.List;
//END
/**
 * The Author class is an implementation of the IPublisher interface where the implementation is defined. it is what posts messages and keywords to the broker object
 * 
 */
public class Author implements IPublisher {

	/**
	 * name is a string that contains the author name which is needed for the log entries method of the member object
	 * 
	 */
	private String name;

	/**
	 * This is a refernce to the singleton Broker object which is used by the Author to publish messages
	 * 
	 */
	private Broker broker;

	/**
	 * Constructor of the Author class that takes in the name of the author an initializes the broker if needed
	 * 
	 * 
	 *  
	 */
	public Author(String name) {
		//BEGIN
		//initialzie the name , the keywords list and the broker refernce
		this.name = name;
		broker = Broker.getInstance();
		//END
	}

	/**
	 * implemenation based on the definition of the Ipublisher interface. takes a List of keywords and a String message and pushes the info to broker singleton object refernce
	 *  
	 */
	public void publish(String text, List<String> keywords) {
			//BEGIN
		broker.add_messages(text);
		broker.notify_members(keywords,this);//call the broker's notify method
		//END
	}

	/**
	 * the function gets the name of the author object
	 */
	public String getName() {
			//BEGIN
			return this.name;
			//END
			//return null;
	}

}
