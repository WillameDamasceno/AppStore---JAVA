package com.example.willstore;

import java.io.Serializable;

public class MyEquipGamer implements Serializable {
    private String textDesc;
    private String textPreco;
    private String textDescProduto;
    private int gamerImg;

    public MyEquipGamer(String textDesc, String textPreco,String textDescProduto, int gamerImg) {
        this.textDesc = textDesc;
        this.textPreco = textPreco;
        this.textDescProduto = textDescProduto;
        this.gamerImg = gamerImg;
    }

    public MyEquipGamer() {
    }

    public String getTextDesc() {
        return textDesc;
    }

    public void setTextDesc(String textDesc) {
        this.textDesc = textDesc;
    }

    public String getTextPreco() {
        
        return textPreco;
    }

    public void setTextPreco(String textPreco) {
        this.textPreco = textPreco;
    }
    public  String gettextDescProduto() {

        return textDescProduto;
    }

    public void setTextDescProduto(String textDescProduto) {
        this.textDescProduto = textDescProduto;
    }

    public int getGamerImg() {
        return gamerImg;
    }

    public void setGamerImg(int gamerImg) {
        this.gamerImg = gamerImg;
    }
}
