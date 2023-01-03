public class TestPerson1 {
	public static void main(String[] args) {
		//생성자라는 (constructor)호출
		//생성자는 필드를 초기화 해줌
		//기본 생성자는 기본값으로 초기화 해줌
		//기본값
		//참조형은 null
		//정수형 0
		//실수형0.0
		//논리형 false
		Person1 p1 = new Person1("길동",22);
		
		
		System.out.println(p1.getAge());
		System.out.println(p1.getName());
		
		Person1 p2 = new Person1("둘리",33);
		
		System.out.println(p2.getAge());
		System.out.println(p2.getName());
		
		Person1 p3 = new Person1();
		Person1 p4 = new Person1("희동");
		System.out.println(p4.getAge());
		System.out.println(p4.getName());
		
	}

}
