//책
//제목
//저자명
//가격

//필드들을 private로 선언
//필드에 get.set만들기
// 모든 필드를 초기화할 수 있는 생성자
public class Book {
	
	private String name;
	private String make;
	private int price;
	
	public Book() {
		
	}
	
	
	public Book(String name, String make,int price ) {
		this.name =name;
		this.make = make;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

}
