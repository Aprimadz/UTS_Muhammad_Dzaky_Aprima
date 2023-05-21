package com.example.navigationdrawer.model;

public class ManagerItem {
    String managerName;
    int imgManager;

    public ManagerItem(String managerName, int imgManager) {
        this.managerName = managerName;
        this.imgManager = imgManager;
    }

    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }

    public int getImgManager() {
        return imgManager;
    }

    public void setImgManager(int imgManager) {
        this.imgManager = imgManager;
    }

}
