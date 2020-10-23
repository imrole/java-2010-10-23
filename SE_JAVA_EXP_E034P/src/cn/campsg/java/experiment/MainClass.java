package cn.campsg.java.experiment;

import cn.campsg.java.experiment.impl.SquareCalImpl;

public class MainClass {
    public static void main(String[] args) {
        //实例化正方形的接口对象
        SquareCalImpl sc = new SquareCalImpl();

        //设置正方形的边长
        sc.setLength(5.0f);

        //计算正方形的周长
        System.out.println("正方形的周长为："+sc.calcPerim());

        //计算正方形的面积
        System.out.println("正方形的面积为："+sc.calcArea());
    }
}
