package cn.campsg.java.experiment;

import cn.campsg.java.experiment.impl.BigDataSeeker;
import cn.campsg.java.experiment.impl.SoftwareSeeker;

public class MainClass {
    public static void main(String[] args) {
        HrMarketer hrMarketer=new HrMarketer();
        SoftwareSeeker soft1 = new SoftwareSeeker("张小龙",new float[]{10.0f,100.0f});

        SoftwareSeeker soft2 = new SoftwareSeeker("李小龙",new float[]{80.0f,100.0f});

        BigDataSeeker bdata1 = new BigDataSeeker("张彦宏",new float[]{10.0f,100.0f});

        BigDataSeeker bdata2 = new BigDataSeeker("李彦宏",new float[]{80.0f,100.0f});

        System.out.println(hrMarketer.seekJob(soft1));
        System.out.println(hrMarketer.seekJob(soft2));
        System.out.println(hrMarketer.seekJob(bdata1));
        System.out.println(hrMarketer.seekJob(bdata2));
    }
}
