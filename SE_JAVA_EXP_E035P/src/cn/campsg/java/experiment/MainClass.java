package cn.campsg.java.experiment;

import cn.campsg.java.experiment.entity.AbstractSinger;
import cn.campsg.java.experiment.entity.PopSinger;

public class MainClass {
    public static void main(String[] args) {
        AbstractSinger abstractSinger = new PopSinger();
        abstractSinger.introduce();
        abstractSinger.sing();
    }
}
