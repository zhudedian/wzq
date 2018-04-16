package com.zdd.wzq.gobang;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yd on 2018/4/16.
 */

public class History {

    private int position = 0;
    private List<Step> stepList = new ArrayList<>();

    public void write(int x,int y,String piece){
        stepList.add(position,new Step(x,y,piece));
        position++;
        for (int i = position;i<stepList.size();i++){
            stepList.remove(i);
        }
    }
    public void forward(){

    }

    public class Step{

        private String piece;
        private int x;
        private int y;

        public Step(int x,int y,String piece){
            this.x = x;
            this.y = y;
            this.piece = piece;
        }
    }
}
