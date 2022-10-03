package dto;

public class Producto {

	private int id;
	
	private String channel;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getChannel() {
		return channel;
	}

	public void setChannel(String channel) {
		this.channel = channel;
	}

	public Producto(int id, String channel) {
		super();
		this.id = id;
		this.channel = channel;
	}
	
	
	
}
