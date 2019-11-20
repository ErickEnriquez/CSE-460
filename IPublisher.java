// Posting ID: 1804-110 , ASU ID: 1208001804
//BEGIN
import java.util.List;
//END
/**
 * IPublisher is an interface that that is used to define the behavior publish , which will be realized by an Author object
 * 
 */
public interface IPublisher {

	/**
	 * publish is a function that is defined here taking 2 parameters of String and List. to be implemented in the Author class
	 * 
	 * 
	 *  
	 */
	public abstract void publish(String text, List<String> keywords);

}
