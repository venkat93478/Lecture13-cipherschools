package accessmodifiers2;

import accessmodifiers.A;

public class D {
	public static void main(String [] args) {
		A obj = new A();
		C childobj = new C();
		//System.out.println(obj.x);
		//System.out.println(childobj.y);//not accessible outside the class
		System.out.println(obj.z);
		System.out.println(childobj.w);

}
