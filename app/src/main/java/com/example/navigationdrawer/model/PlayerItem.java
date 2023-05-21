package com.example.navigationdrawer.model;

public class PlayerItem {

    String namePlayer;
    int imgPlayer;

    public PlayerItem() {
    }

    public PlayerItem(String namePlayer, int imgPlayer) {
        this.namePlayer = namePlayer;
        this.imgPlayer = imgPlayer;
    }

    public String getNamePlayer() {
        return namePlayer;
    }

    public void setNamePlayer(String namePlayer) {
        this.namePlayer = namePlayer;
    }

    public int getImgPlayer() {
        return imgPlayer;
    }

    public void setImgPlayer(int imgPlayer)  {
        this.imgPlayer = imgPlayer;
    }
}
