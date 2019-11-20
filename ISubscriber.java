// Posting ID: 1804-110 , ASU ID: 1208001804
//BEGIN
import java.util.List;
//END
/**
 * This interface describes the operations that need to be implemented by the member class in order to use the interface
 */
public interface ISubscriber {

	/**
	 * subsribe is a method that takes a keyword and will add it the the list of the keywords list 
	 * 
	 *  
	 */
	public abstract void subscribe(String keyword);

	/**
	 * unsubscribe is the method signature that takes in a keyword sting and is implemented in the member class
	 * 
	 *  
	 */
	public abstract void unsubscribe(String keyword);

	/**
	 * get_log_entries is a method that returns List of Messages , implemented in the Member class
	 */
	public abstract List<String> get_log_entries();

}
