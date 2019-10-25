import java.util.*;

public class Switch {
String name;
int ports;
int currentPort = 0;
LinkedHashSet<Device> linkedset = new LinkedHashSet<>();
LinkedHashSet<Device> linkedset2 = new LinkedHashSet<>();
Switch(String name, int ports) {
	this.name = name;
	this.ports = ports;
}

public void addDevice(Device a) {
	linkedset.add(a);
	System.out.println("Device " + a.getName() + " added to " + getName());
	a.assignPort(currentPort);
	currentPort++;
}
public void removeDevice(Device a) {
	linkedset.remove(a);
	System.out.println(a.getName() + "was removed");
}

public String getName() {
	return name;
}
public void addForwarding(Device SA, Device DA) {
	linkedset2.add(SA);
	linkedset2.add(DA);
}
}
