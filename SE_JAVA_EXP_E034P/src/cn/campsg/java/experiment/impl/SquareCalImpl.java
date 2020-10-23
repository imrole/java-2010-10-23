package cn.campsg.java.experiment.impl;

import cn.campsg.java.experiment.ShapeCalc;

public class SquareCalImpl implements ShapeCalc {
    private float length;
    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public SquareCalImpl(){

    }

    @Override
    public float calcPerim(){
        return 4*length;
    }

    @Override
    public float calcArea(){
        return length*length;
    }
}
