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
		//BEGIN
		this.name  = name;
		this.keywords = new ArrayList<String>();
		this.messages = new ArrayList<String>();
		this.broker = Broker.getInstance();
		broker.add_member(this);//add the member to the brokers list of members
		//END
	}

	/**
	 * this method takes in a keyword a member wants to subscribe to and adds it to the Broker list of keywords if its not there already
	 */
	public void subscribe(String keyword) {
		//BEGIN
		if(this.keywords.contains(keyword) == false){//if the word isn't already in the list
			broker.add_keyword(keyword);//add it to the list the broker has as well 
		}
		//END
	}

	/**
	 * this method takes a keyword string and removes it from the keywords that the member has subscribed to 
	 */
	public void unsubscrbe(String keyword) {
		//BEGIN
		if(this.keywords.contains(keyword)){//if the member has the keyword then remove it from the list
			this.keywords.remove(keyword);
		}
		//END
	}

	/**
	 * this method returns a list of the messages that the user has received if it is empty it returns an empty list , 
	 */
	public List<String> get_log_entries() {
		//BEGIN
		//return this.messages
		//END
		return null;
	}
////////////////////////////////////
	public String getName(){
		return this.name;
	}
	public String getMessages(){
		return this.messages;
	}
////////////////////////////////////
}
