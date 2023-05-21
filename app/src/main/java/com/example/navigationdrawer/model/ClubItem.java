package com.example.navigationdrawer.model;

public class ClubItem {
    String tvNamaClub;
    String detailTeam;
    int imgClub, tvJuara;



    public ClubItem(String tvNamaClub, String detailTeam, int imgClub,int tvJuara) {
        this.tvNamaClub = tvNamaClub;
        this.detailTeam = detailTeam;
        this.imgClub = imgClub;
        this.tvJuara =tvJuara;
    }
    public ClubItem(String detailTeam) {
        this.detailTeam = detailTeam;
    }

    public String getTvNamaClub() {
        return tvNamaClub;
    }

    public void setTvNamaClub(String tvNamaClub) {
        this.tvNamaClub = tvNamaClub;
    }


    public int getImgClub() {
        return imgClub;
    }

    public void setImgClub(int imgClub) {
        this.imgClub = imgClub;
    }

    public int getTvJuara() {
        return tvJuara;
    }
    public String getDetailTeam() {
        return detailTeam;
    }

    public void setDetailTeam(String detailTeam) {
        this.detailTeam = detailTeam;
    }

    public void setTvJuara(int tvJuara) {
        this.tvJuara = tvJuara;
    }
}
