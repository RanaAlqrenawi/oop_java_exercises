package com.techreturners.cats;

public class AbstractCat implements Cat {
    private boolean isSleep;
    private String catSetting;
    private int aveHeight;
    private String eatingSound;

    public AbstractCat(boolean isSleep, String catSetting, int aveHeight, String eatingSound){
        this.isSleep = isSleep;
        this.catSetting = catSetting;
        this.aveHeight = aveHeight;
        this.eatingSound = eatingSound;
    }

    public String eat(){
        return this.eatingSound;
    }

    public void wakeUp(){
        this.isSleep = false;
    }

    public boolean isAsleep(){
        return this.isSleep;
    }

    public void goToSleep() {
        this.isSleep=true;
    }

    public int getAverageHeight(){
        return this.aveHeight;
    }

    public String getSetting(){
        return this.catSetting;
    }

}
