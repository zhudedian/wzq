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
        for (int i = position;i<stepList.size();){
            stepList.remove(i);
        }
    }
    public void clean(){
        position = 0;
        stepList.clear();
    }
    public List<Step> getForwardList(){
        List<Step> list = new ArrayList<>();
        if (position<2){
            return list;
        }
        if (position>=2) {
            position -= 2;
        }
        for (int i = 0;i<position;i++){
            list.add(stepList.get(i));
        }
        return list;
    }
    public List<Step> getNextList(){
        List<Step> list = new ArrayList<>();
        if (position>(stepList.size()-2)){
            list.addAll(stepList);
            return list;
        }
        if (position<=(stepList.size()-2)) {
            position += 2;
        }
        for (int i = 0;i<position;i++){
            list.add(stepList.get(i));
        }
        return list;
    }
    public class Step{

        public String piece;
        public int x;
        public int y;

        public Step(int x,int y,String piece){
            this.x = x;
            this.y = y;
            this.piece = piece;
        }
    }
}
