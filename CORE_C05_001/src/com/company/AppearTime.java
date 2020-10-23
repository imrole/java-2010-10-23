package com.company;

public class AppearTime {
    public static void main(String[] args) {
        MyClear myClear=new MyClear();
        myClear.clear();
    }

    interface IClear{
        public void clear();
    }

    static class MyClear implements IClear {

        @Override
        public void clear(){
            System.out.println("do clear...");
        }
    }
}
