package com.chameleoncompany.chameleon;

/**
 * Created by Isaac on 9/24/2015.
 */
public class Palette {
    private String name;
    private String hexValue;
    private int intValue;
    private int val, s3, s4,s5;

    public Palette(String name, String hexValue, int intValue, int val, int s3, int s4, int s5)
    {
        this.name = name;
        this.hexValue = hexValue;
        this.intValue = intValue;
        this.val = val;
        this.s3 = s3;
        this.s4 = s4;
        this.s5 = s5;
    }

    public String getName(){
        return name;
    }


    public String getHexValue(){
        return hexValue;
    }


    public int getIntValue(){
        return intValue;
    }

    public int getVal(){
        return val;
    }

    public int getS3(){
        return s3;
    }

    public int getS4(){
        return s4;
    }

    public int getS5(){
        return s5;
    }
}
