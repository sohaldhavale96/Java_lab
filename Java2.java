// Lab2
class Java2{
	public static void main(String[] args){
		// System.out.println("Hello");
		Maths op = new Maths();
		op.setA(10);
		op.setB(20);
		// Addition
		int ans = op.addition();
		System.out.println("Addition is "+ans+".");
		// Subtraction
		ans = op.subtraction();
		System.out.println("Subtraction is "+ans+".");
	}
}

// 

class Maths{
	private int a;
	private int b;
	Maths(){a=0;b=0;}
	public void setA(int x){a=x;}
	public void setB(int x){b=x;}
	
	public int getA(){return a;}
	public int getB(){return b;}

	public int addition(){
			return a+b;
	}
	public int subtraction(){
			return a-b;
	}

}