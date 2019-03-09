package com.mrunal.simplerecyclerview;

public class SimpleViewModel {

    private String simpleText;

    public SimpleViewModel(String simpleText) {
        setSimpleText(simpleText);
    }

    private void setSimpleText(String simpleText){
        this.simpleText = simpleText;
    }

    public String getSimpleText() {
        return simpleText;
    }
}
