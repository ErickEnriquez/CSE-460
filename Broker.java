//BEGIN
import java.util.List;
import java.util.ArrayList;
//END
/**
 * Broker is a singleton object used by subscribers to post info and by members to retrieve info without having them have to know about each other directly
 * 
 * 
 */
public class Broker {

	/**
	 * Subscribers is a list of the Member objects so that the Broker can push to the members of subscribed keywords
	 * 
	 */
	private List<Member> subscribers;

	/**
	 * Keywords is a List of Strings that contains all of the keywords in the system 
	 */
	private List<String> keywords;

	/**
	 * messages is a List of Strings that contain all of messages send to the broker from author
	 */
	private List<String> messages;

	/**
	 * broker is refernce to the single instance of the Broker object shared by the author and member
	 */
	public static Broker broker = null;

	/**
	 * Authors is a list of the Authors that the broker knows about 
	 */
	private List<Author> Authors;

	/**
	 * notify members is function that will let the members that have subscribed to a keyword know about a message
	 * 
	 *  
	 */
	public void notify_members() {

	}

	/**
	 * Broker is the private constuctor to the singleton class 
	 * 
	 *  
	 */
	private Broker() {
			//BEGIN
		//INITIALIZE ALL OF THE LISTS
		this.Authors = new ArrayList<Author>();
		this.subscribers = new ArrayList<Member>();
		this.messages = new ArrayList<String>();
		this.keywords = new ArrayList<String>();
		//END
	}

	/**
	 * this method gets the instance of the singleton object if it hasn't been instantiated then it does that first
	 * 
	 *  
	 */
	public static Broker getInstance() {
			//BEGIN
			if(broker == null){//if we havent initialized it then initialized it and return reference to it
				broker = new Broker();
			}
			return broker;
			//END
			//return null;
	}

	/**
	 * method takes a keyword string and adds it to the list of keywords in broker object
	 * 
	 */
	public void add_keyword(String word) {
			//BEGIN
			if(keywords.isEmpty() == true){//if the list is empty just add the word
				keywords.add(word);
			}
			else{ 
					if(keywords.contains(word)){//if keyword is already in the list don't add it
						return;
					}
					else{
						keywords.add(word);
					}
	
			}
			//END
	}

	/**
	 * overloaded method that takes a list of keywords and adds the ones that havent been added previously into the keywords list
	 * 
	 * 
	 *  
	 */
	public void add_keyword(List<String> words) {
			//BEGIN
		//NOT DONW YET
		for(int i = 0 ; i < words.size();i++){
			System.out.println(words.get(i));
		}
		//END
	}

	/**
	 * this method will add the member object to the subscribers list if they haven't been added already
	 */
	public void add_member(Member member) {
		//BEGIN
		this.subscribers.add(member);//add the subscriber 
		//END
	}

	/**
	 * this method will add the Author object to the list of Authors if not already there, which will be called when an author publishes
	 * 
	 *  
	 */
	public void add_author(Author author) {
		//BEGIN
		this.Authors.add(author);
		//END
	}

	/**
	 * this function returns the list of the keywords that the broker has stored
	 * 
	 */
	public List<String> get_keywords() {
		//BEGIN
		return this.keywords;
		//return null;
		//END
		//return null;
	}

	/**
	 * this method allows a message to be added to a broker object
	 * 
	 * 
	 *  
	 */
	public void add_messages(String text) {
		//BEGIN
		messages.add(text);//add the message into the string list
		//END
	}

}
