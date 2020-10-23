package cn.campsg.java.experiment.entity;

public abstract class AbstractSinger {

    public void introduce(){
        System.out.println("Hello，我是歌手。");
    }

    public abstract void sing();
}
