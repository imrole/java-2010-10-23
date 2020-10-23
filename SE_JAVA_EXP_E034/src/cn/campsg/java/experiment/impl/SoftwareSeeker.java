package cn.campsg.java.experiment.impl;

import cn.campsg.java.experiment.SeekJob;

//软件专业
public class SoftwareSeeker implements SeekJob {

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

    public SoftwareSeeker(){

    }

    public SoftwareSeeker(String name,float[] scores){
        this.name=name;
        this.scores=scores;
    }

    @Override
    public float getSeekerAverage(){
        return (scores[0]*0.6f)+(scores[1]*0.4f);
    }

}
