package accessmodifiers;

public class B {
	public static void main(String [] args) {
		A obj = new A();
		System.out.println(obj.x);
		//System.out.println(obj.y);not accessible outside the class
		System.out.println(obj.z);
		System.out.println(obj.w);
		
	}

}
