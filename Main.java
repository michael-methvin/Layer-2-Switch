
public class Main {
	public static void main(String[] args) {
	Switch test = new Switch("switch", 8);
	Device A = new Device("A", 50, test);
	Device B = new Device("B", 51, test);
	Device C = new Device("C", 52, test);
	Device D = new Device("D", 53, test);
	
	test.addDevice(A);
	test.addDevice(B);
	test.addDevice(C);
	test.addDevice(D);
	System.out.println("DA = " + A.printMAC() + " SA = " + D.printMAC());
	D.sendPacket(A, "Hello");
	System.out.println("DA = " + D.printMAC() + " SA = " + C.printMAC());
	C.sendPacket(D, "Hello");
	System.out.println("DA = " + C.printMAC() + " SA = " + A.printMAC());
	A.sendPacket(C, "Hello");
	System.out.println("DA = " + A.printMAC() + " SA = " + B.printMAC());
	B.sendPacket(A, "Hello");
	
	
	}

}
