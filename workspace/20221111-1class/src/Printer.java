
public class Printer {
	private char name;
	
	public Printer (char name) {
		
		this.name = name;
	}
	


	public char getName() {
		return name;
	}
	public void setName(char name) {
		this.name = name;
	}
	

	public void printRowCol(int c,int d) {
		for(int i =0;i<d;i++) {
		for(int j =0;j<c;j++) {
			System.out.print(name);
						}
		System.out.println();
				}
	}
}
