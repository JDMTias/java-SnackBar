package snackBarApp;

public class Vmachine {

    // fields
    private static int maxId = 0;
    private int machineId;
    private String machineName;

    // constructors

    public Vmachine(String machineName) {
        maxId++;
        machineId = maxId;
        this.machineName = machineName;

    }

    // getters

    public int getMachineId() {
        return machineId;
    }

    public String getMachinename() {
        return machineName;
    }
    // setters

    public void setMachineName(String machineName) {
        this.machineName = machineName;
    }

}