package dto;

public class Producto {

	private Integer id;
	
	private String channel;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getChannel() {
		return channel;
	}

	public void setChannel(String channel) {
		this.channel = channel;
	}

	public Producto(Integer id, String channel) {
		super();
		this.id = id;
		this.channel = channel;
	}
	
	
	
}
