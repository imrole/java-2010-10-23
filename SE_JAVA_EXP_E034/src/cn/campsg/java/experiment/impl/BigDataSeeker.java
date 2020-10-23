package cn.campsg.java.experiment.impl;

import cn.campsg.java.experiment.SeekJob;

//大数据专业
public class BigDataSeeker implements SeekJob {
    private String name;
    private float[] scores;

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    public float[] getScores() {
        return scores;
    }

    public void setScores(float[] scores) {
        this.scores = scores;
    }

    public BigDataSeeker(){

    }

    public BigDataSeeker(String name,float[] scores){
        this.name=name;
        this.scores=scores;
    }

    @Override
    public float getSeekerAverage(){
        return (scores[0]+scores[1])/2;
    }
}
