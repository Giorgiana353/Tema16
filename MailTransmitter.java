import java.util.ArrayList;

public class MailTransmitter implements Transmitter{

	@Override
	public void store(Message message) {
		
	}

	@Override
	public Message retrieve(Person receiver) {
		return null;
	}

	private ArrayList <Message> buffer;
	private int dim;
	final static String TYPE ="MAIL";
}
