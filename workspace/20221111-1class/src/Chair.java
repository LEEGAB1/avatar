//의자
//제조사
//모델명
//가격
//높이조절여부

public class Chair {

	private String name;
	private String maker;
	private int price;
	int position;
	
	
	public Chair () {
		
	}
	
	public Chair(String name,String maker,int price) {
			this.maker=maker;
			this.name=name;
			this.price=price;
		}
	
	public void  positionUp() {
		position++;
	}
	
	public void  position() {
		position++;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMaker() {
		return maker;
	}

	public void setMaker(String maker) {
		this.maker = maker;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
}
