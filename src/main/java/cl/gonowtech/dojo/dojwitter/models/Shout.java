package cl.gonowtech.dojo.dojwitter.models;

@javax.persistence.Entity
public class Shout extends Entity {
	
	private String content;
	
	public void setContent(String content) {
		this.content = content;
	}
	
	public String getContent() {
		return content;
	}
	
}
