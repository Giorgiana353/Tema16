
public class Person {
	
	private String nume;
	private Transmitter transmitter;
	
	public Person(String nume) {
		this.nume = nume;
		this.transmitter = transmitter;
	}
	public Transmitter getTransmitter() {
		return transmitter;
	}
	public void setTransmitter(Transmitter transmitter) {
		this.transmitter = transmitter;
	}
	public void send(Person reciver, String string) {
		Message message=new Message(this, reciver , sender);
		 transmitter.store(message);
	}
	

}
