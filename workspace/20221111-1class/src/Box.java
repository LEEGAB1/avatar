//박스
//가로
//세로
///높이
//필드를 private하게 선언하고
//각필들에 대한 public 한 접근 설정자 작성하기
public class Box {
	private int width;
	private int length;
	private int height;
	
	public int  getWidth() {
		return width;
	}
	public void  setWidth(int num){
		width = num;
	}
		
	public int  getLength(){
		return length;
	}
	public void  setLength(int num1){
		length = num1;
	}
	public int getHeiht() {
		return height;
	}
	public void setHeight(int num2){
		height = num2;
	}
	public int getVolume() {
		return width * length * height; 
	}
		
}

	

