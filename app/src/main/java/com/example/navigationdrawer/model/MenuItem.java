package com.example.navigationdrawer.model;

public class MenuItem {

    String txtMenu;
    int imgMenu;

    public MenuItem(){

    }

    public MenuItem(String txtMenu, int imgMenu){
        this.txtMenu = txtMenu;
        this.imgMenu = imgMenu;
    }

    public String getTxtMenu() {
        return txtMenu;
    }

    public void setTxtMenu(String txtMenu) {
        this.txtMenu = txtMenu;
    }

    public int getImgMenu() {
        return imgMenu;
    }

    public void setImgMenu(int imgMenu) {
        this.imgMenu = imgMenu;
    }





}
