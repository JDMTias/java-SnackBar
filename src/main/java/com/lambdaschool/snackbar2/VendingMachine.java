package com.lambdaschool.snackbar2;

public class VendingMachine {
    private static int maxId = 0;
    private int vmId;
    private String vmName;

    public VendingMachine(String vmName) {
        maxId++;
        this.vmId = maxId;
        this.vmName = vmName;
    }

    public static int getMaxId() {
        return maxId;
    }


    public int getVmId() {
        return vmId;
    }

    public void setVmId(int vmId) {
        this.vmId = vmId;
    }

    public String getVmName() {
        return vmName;
    }

    public void setVmName(String vmName) {
        this.vmName = vmName;
    }
}
