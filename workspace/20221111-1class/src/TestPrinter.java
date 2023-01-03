public class TestPrinter {
	public static void main(String[] args) {
		Printer printer = new Printer('@');
		
		printer.printRowCol(4,3);
		//골뱅이로 행열 만들기
		printer.setName('o');
		
		printer.printRowCol(2,2);
		
	}

}
