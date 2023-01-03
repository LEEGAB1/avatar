//사람
//이름
//나이

//이름알려주기
//이름 변경하기
//나이알려주기
//나이변경하기
public class Person1 {
	private String name;
	private int age;
	
	// overload
	//파라미터의 타입,개수,순서가 중요하다.
	
	public Person1() {
		
	}
	
	public Person1(String name) {
		this(name,2);
	}

	public Person1(String name, int age) {
		this.name =name;
		this.age=age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) 
	{this.name = name;}
	
	public int getAge() {//getter(접근자)
		return age;
	}
	public void setAge(int age) {//setter(설정자)
		this.age = age;
	}

}
