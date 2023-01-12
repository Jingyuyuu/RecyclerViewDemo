package com.example.recyclerviewdemo.Model;

public class WebDataSource {
    static String [] product={
        "大麥克","雙層牛肉吉士堡","麥香雞","麥香魚"
    };
    static String [] img={
        "@drawable/big_mac","@drawable/cheese","@drawable/chicken","@drawable/fish"
    };
    static int [] price={
        200,100,150,120
    };

    public static String[] getProduct() {
        return product;
    }

    public static String[] getImg() {
        return img;
    }

    public static int[] getPrice() {
        return price;
    }

    public static String getProductName(int idx){
        return product[idx];
    }

}
