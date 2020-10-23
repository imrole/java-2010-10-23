package cn.campsg.java.experiment;

//人才市场
public class HrMarketer {

    public String seekJob(SeekJob seekJob){
        if(seekJob.getSeekerAverage()>SeekJob.SEEKER_AVERAGE_SCORE){
            return seekJob.getName()+"被本公司录用";
        }
        else {
            return seekJob.getName()+"成绩未达标，不予录用";
        }
    }
}
