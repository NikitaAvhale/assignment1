package CollectionFramework;

public class bookclass {

	private String id; 
	private String title; 
	private String author; 
	public bookclass(String id, String title, String author) { 
	this.id = id; 
	this.title = title; 
	this.author = author; 
	} 
	public String getId() { return id; } 
	public String getTitle() { return title; } 
	public String getAuthor() { return author; } 
	public void setTitle(String title) { this.title = title; } 
	public void setAuthor(String author) { this.author = author; } 
	@Override 
	public String toString() { 
	return "Book [ID=" + id + ", Title=" + title + ", Author=" + author + "]"; 
	} 
	@Override 
	
	public boolean equals(Object obj) { 
	if (this == obj) return true; 
	if (obj == null || getClass() != obj.getClass()) return false; 
	bookclass other = (bookclass) obj; 
	return id.equals(other.id); 
	} 
	@Override 
	public int hashCode() { 
	return id.hashCode(); 
	}   
	
}	