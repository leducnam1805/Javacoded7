package pk2;

public class Books {
	private int id;
	private String name;
	private int year;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public Books(int id, String name, int year) {
		super();
		this.id = id;
		this.name = name;
		this.year = year;
	}
	public Books() {
		super();
	}
	@Override
	public String toString() {
		return "id: " + this.id + " - Tên: " + this.name + " - Năm: " + this.year;
	}
	
}
