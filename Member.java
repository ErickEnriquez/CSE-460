//BEGIN
import java.util.List;
import java.util.ArrayList;
//END
/**
 * Member class is the implementation class of the ISubsciber interface , it is what will recieve messages from the broker, subscribe and unsubscribe from keywords. and store the log_entries it recieves
 */
public class Member implements ISubscriber {

	/**
	 * This attribute store the name of the member object which is used when creating log entries
	 */
	private String name;

	/**
	 * This is a list of keywords that the member object is subscribed to that is also on the broker
	 */
	private List<String> keywords;

	/**
	 * messages is a list of the messages that the member has recieved
	 */
	private List<String> messages;

	/**
	 * this is a reference to the singleton object that the member uses to be notified of the changes 
	 */
	private Broker broker;

	/**
	 * this is the constuctor that takes in the name of the member and initializes the broker , if needed
	 * 
	 *  
	 */
	public Member(String name) {

	}

	/**
	 * this method takes in a keyword a member wants to subscribe to and adds it to the Broker list of keywords if its not there already
	 */
	public void subscribe(String keyword) {

	}

	/**
	 * this method takes a keyword string and removes it from the keywords that the member has subscribed to 
	 */
	public void unsubscrbe(String keyword) {

	}

	/**
	 * this method returns a list of the messages that the user has received if it is empty it returns an empty list , 
	 */
	public List<String> get_log_entries() {
		return null;
	}

}
