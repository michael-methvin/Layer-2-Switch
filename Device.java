import java.util.ArrayList;
import java.util.LinkedHashSet;

public class Device {
String name = "Default";
int MAC;
int portNumber;
LinkedHashSet<Device> macList = new LinkedHashSet<>();
Switch switch1;

Device(String name, int MAC, Switch switch1) {
	this.name = name;
	this.MAC = MAC;
	this.switch1 = switch1;
}
public void addMacTable(Device a) {
	macList.add(a);
}
public void assignPort(int a) {
	this.portNumber = a;
}
public String getName() {
	return name;
}
public int getPort() {
	return portNumber;
}
public boolean checkMacTable(Device a) {
	if(macList.contains(a) ) {
		return true;
	}
	else {
		return false;
	}
}
public void receivePacket(String packet) {
	System.out.println(packet);
}
public void sendPacket(Device a, String packet) {
	boolean isFound = checkMacTable(a);
	if(isFound) {
		System.out.println("Sending packet from Host " + this.getName() +  " to Host " + a.getName() + " at port " + a.getPort());
		a.receivePacket(packet);
	}
	else {
		this.macList.add(a);
		System.out.println("Sending packet from Host " + this.getName() +  " to Host " + a.getName() + " at port " + a.getPort());
		a.receivePacket(packet);
	}
}
public int printMAC() {
	return this.MAC;
}
public void sendAll(Device a) {
	LinkedHashSet<Device> temp = new LinkedHashSet<>();
	temp = (LinkedHashSet) switch1.linkedset.clone();
	temp.removeAll(this.macList);
	System.out.println(temp);
}


}

