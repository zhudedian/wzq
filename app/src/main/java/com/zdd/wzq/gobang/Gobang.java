package com.zdd.wzq.gobang;

import android.os.Bundle;
import android.os.Looper;
import android.os.Message;

import java.lang.Math;
import java.util.Scanner;
import java.io.*;
import android.os.Handler;

public class Gobang{
    String[][] board;
    String[][] board2=new String[boardSize][boardSize];
    private static int boardSize=15;
    static int judgeWhetherGo = 0;
    private ComputerPieceListener listener;

    public Gobang(ComputerPieceListener listener){
        this.listener = listener;
        initBoard();
        printBoard();
    }
    /*
    *创建一个棋盘
    */
    public void initBoard(){
        board = new String[boardSize][boardSize];
        for(int i = 0; i<boardSize; i++){
            for(int j =0; j<boardSize; j++){
                board[i][j] = "＋";

            }
        }
        int c=1;
        for(int i = 0; i<boardSize; i++){
            String g= c+"";
            if(c<10){g = c+" ";}
            if(c%5==0){
                board[0][i] = g;}
            c++;

        }
        c=1;
        for(int i = 0; i<boardSize; i++){
            String g= c+"";
            if(c<10){g = c+" ";}
            if(c%5==0){
                board[i][0] = g;}
            c++;

        }
        board[0][boardSize-1] = "y ";
        board[boardSize-1][0] = " x";
        board[0][0] = 1+" ";
    }
    /*
    *打印出整个棋盘
    */
    public void printBoard(){
        for(int i=boardSize-1; i>=0; i--){
            for(int j=0; j<boardSize; j++){
                System.out.print(board[j][i]);
            }
            System.out.println();
        }
        System.out.println();
    }
    /*
    *接收一个棋子
    */
    public boolean setAPiece(int x,int y){
        if(x<=15&&y<=15){
            if(board[x-1][y-1]!="●"&&board[x-1][y-1]!="○"){
                board[x-1][y-1]="●";
                return true;
            }
        }
        return false;
    }
    /*
    *电脑自动下一棋子
    */
    public void autoGetPieces(){
        BasicCal basic = new BasicCal();
        String signal;
        signal =basic.basicComputerMustAttack4s4(board); //四个子的时候
        if(signal!=null){
            String[] signalxy = signal.split(" ");
            int x = Integer.parseInt(signalxy[0]);
            int y = Integer.parseInt(signalxy[1]);
            board[x][y] = "☆";
            if (listener!=null){
                listener.result(x,y);
            }
            return;}

        signal =basic.basicComputerMustAttack5s4(board); //五缺一的时候
        if(signal!=null){
            String[] signalxy = signal.split(" ");
            int x = Integer.parseInt(signalxy[0]);
            int y = Integer.parseInt(signalxy[1]);
            board[x][y] = "☆";
            if (listener!=null){
                listener.result(x,y);
            }
            return;}

        signal =basic.basicPlayerMustAttack4s4(board); //堵四个子的时候
        if(signal!=null){
            String[] signalxy = signal.split(" ");
            int x = Integer.parseInt(signalxy[0]);
            int y = Integer.parseInt(signalxy[1]);
            board[x][y] = "☆";
            if (listener!=null){
                listener.result(x,y);
            }
            return;}

        signal =basic.basicPlayerMustAttack5s4(board); //堵五缺一的时候
        if(signal!=null){
            String[] signalxy = signal.split(" ");
            int x = Integer.parseInt(signalxy[0]);
            int y = Integer.parseInt(signalxy[1]);
            board[x][y] = "☆";
            if (listener!=null){
                listener.result(x,y);
            }
            return;}

        signal =basic.basicComputerMustAttack4s3(board); //四缺一的时候
        if(signal!=null){
            String[] signalxy = signal.split(" ");
            int x = Integer.parseInt(signalxy[0]);
            int y = Integer.parseInt(signalxy[1]);
            board[x][y] = "☆";
            if (listener!=null){
                listener.result(x,y);
            }
            return;}

        signal =basic.basicComputerMustAttack7s4(board); //七中有四的时候
        if(signal!=null){
            String[] signalxy = signal.split(" ");
            int x = Integer.parseInt(signalxy[0]);
            int y = Integer.parseInt(signalxy[1]);
            board[x][y] = "☆";
            if (listener!=null){
                listener.result(x,y);
            }
            return;}

        signal =basic.basicComputerMustAttack33(board); //两列三个的时候
        if(signal!=null){
            String[] signalxy = signal.split(" ");
            int x = Integer.parseInt(signalxy[0]);
            int y = Integer.parseInt(signalxy[1]);
            board[x][y] = "☆";
            if (listener!=null){
                listener.result(x,y);
            }
            return;}

        signal =basic.basicComputerMustAttack3s3(board); //独立三个的时候
        if(signal!=null){
            String[] signalxy = signal.split(" ");
            int x = Integer.parseInt(signalxy[0]);
            int y = Integer.parseInt(signalxy[1]);
            board[x][y] = "☆";
            if (listener!=null){
                listener.result(x,y);
            }
            return;}


/*
*特殊算法--------
*/
        Calculate calculate = new Calculate();
        for(int i=0; i<boardSize; i++){
            for(int j=0; j<boardSize;j++){
                if(board[i][j]!="○"&&board[i][j]!="●"){

                    for(int m=0; m<boardSize; m++){
                        for(int n=0; n<boardSize;n++){     //把游戏棋盘复制给推算盘
                            board2[m][n]=board[m][n];
                        }}
                    int computerWin=calculate.demoComputer(board2,i,j);
                    if(computerWin==1){board[i][j]="☆";
                        if (listener!=null){
                            listener.result(i,j);
                        }
                        return;}

                }}}
        int times = 0;
        for(int i=0; i<boardSize; i++){
            for(int j=0; j<boardSize;j++){
                if(board[i][j]!="○"&&board[i][j]!="●"){

                    for(int m=0; m<boardSize; m++){
                        for(int n=0; n<boardSize;n++){      //把游戏棋盘复制给推算盘
                            board2[m][n]=board[m][n];
                        }}
                    int playerWin=calculate.demoPlayer(board2,i,j);
                    if(playerWin==0)times++;


                }}}
        if((times<5)&&(times>0)){
            for(int i=0; i<boardSize; i++){
                for(int j=0; j<boardSize;j++){
                    if(board[i][j]!="○"&&board[i][j]!="●"){

                        for(int m=0; m<boardSize; m++){
                            for(int n=0; n<boardSize;n++){      //把游戏棋盘复制给推算盘
                                board2[m][n]=board[m][n];
                            }}
                        int playerWin=calculate.demoPlayer(board2,i,j);
                        if(playerWin==0){board[i][j]="☆";
                            if (listener!=null){
                                listener.result(i,j);
                            }
                            return;}


                    }}}}




        signal =basic.basicPlayerMustAttack4s3(board); //堵四缺一的时候
        if(signal!=null){
            String[] signalxy = signal.split(" ");
            int x = Integer.parseInt(signalxy[0]);
            int y = Integer.parseInt(signalxy[1]);
            board[x][y] = "☆";
            if (listener!=null){
                listener.result(x,y);
            }
            return;
        }

        signal =basic.basicPlayerMustAttack7s4(board); //堵七中有四的时候
        if(signal!=null){
            String[] signalxy = signal.split(" ");
            int x = Integer.parseInt(signalxy[0]);
            int y = Integer.parseInt(signalxy[1]);
            board[x][y] = "☆";
            if (listener!=null){
                listener.result(x,y);
            }
            return;
        }

        signal =basic.basicPlayerMustAttack33(board); //堵两列三个的时候
        if(signal!=null){
            String[] signalxy = signal.split(" ");
            int x = Integer.parseInt(signalxy[0]);
            int y = Integer.parseInt(signalxy[1]);
            board[x][y] = "☆";
            if (listener!=null){
                listener.result(x,y);
            }
            return;
        }

        signal =basic.basicPlayerMustAttack3s3(board); //堵独立三个的时候
        if(signal!=null){
            String[] signalxy = signal.split(" ");
            int x = Integer.parseInt(signalxy[0]);
            int y = Integer.parseInt(signalxy[1]);
            board[x][y] = "☆";
            if (listener!=null){
                listener.result(x,y);
            }
            return;
        }

        signal =basic.basicComputerMustAttack22(board); //两列两个以上
        if(signal!=null){
            String[] signalxy = signal.split(" ");
            int x = Integer.parseInt(signalxy[0]);
            int y = Integer.parseInt(signalxy[1]);
            board[x][y] = "☆";
            if (listener!=null){
                listener.result(x,y);
            }
            return;
        }

        signal =basic.basicPlayerMustAttack22(board); //堵两列两个以上
        if(signal!=null){
            String[] signalxy = signal.split(" ");
            int x = Integer.parseInt(signalxy[0]);
            int y = Integer.parseInt(signalxy[1]);
            board[x][y] = "☆";
            if (listener!=null){
                listener.result(x,y);
            }
            return;
        }




        signal =basic.basicComputerAttack32s23(board); //独立两子随机下
        if(signal!=null){
            String[] signalxy = signal.split(" ");
            int x = Integer.parseInt(signalxy[0]);
            int y = Integer.parseInt(signalxy[1]);
            board[x][y] = "☆";
            if (listener!=null){
                listener.result(x,y);
            }
            return;
        }

        signal =basic.basicComputerAttack22s23(board); //独立两子
        if(signal!=null){
            String[] signalxy = signal.split(" ");
            int x = Integer.parseInt(signalxy[0]);
            int y = Integer.parseInt(signalxy[1]);
            board[x][y] = "☆";
            if (listener!=null){
                listener.result(x,y);
            }
            return;
        }

        signal =basic.basicComputerAttack12s23(board); //独立两子一头空一个
        if(signal!=null){
            String[] signalxy = signal.split(" ");
            int x = Integer.parseInt(signalxy[0]);
            int y = Integer.parseInt(signalxy[1]);
            board[x][y] = "☆";
            if (listener!=null){
                listener.result(x,y);
            }
            return;
        }

        signal =basic.basicComputerAttack4s2(board); //四子中间隔两个
        if(signal!=null){
            String[] signalxy = signal.split(" ");
            int x = Integer.parseInt(signalxy[0]);
            int y = Integer.parseInt(signalxy[1]);
            board[x][y] = "☆";
            if (listener!=null){
                listener.result(x,y);
            }
            return;
        }

        signal =basic.basicComputerAttack3s2(board); //三缺一
        if(signal!=null){
            String[] signalxy = signal.split(" ");
            int x = Integer.parseInt(signalxy[0]);
            int y = Integer.parseInt(signalxy[1]);
            board[x][y] = "☆";
            if (listener!=null){
                listener.result(x,y);
            }
            return;
        }

        signal =basic.basicComputerAttack03s32(board); //延伸三个成四个
        if(signal!=null){
            String[] signalxy = signal.split(" ");
            int x = Integer.parseInt(signalxy[0]);
            int y = Integer.parseInt(signalxy[1]);
            board[x][y] = "☆";
            if (listener!=null){
                listener.result(x,y);
            }
            return;
        }

        signal =basic.basicComputerAttack04s31(board); //补四缺一成四个
        if(signal!=null){
            String[] signalxy = signal.split(" ");
            int x = Integer.parseInt(signalxy[0]);
            int y = Integer.parseInt(signalxy[1]);
            board[x][y] = "☆";
            if (listener!=null){
                listener.result(x,y);
            }
            return;
        }

        signal =basic.basicComputerAttack05s30(board); //补五缺二
        if(signal!=null){
            String[] signalxy = signal.split(" ");
            int x = Integer.parseInt(signalxy[0]);
            int y = Integer.parseInt(signalxy[1]);
            board[x][y] = "☆";
            if (listener!=null){
                listener.result(x,y);
            }
            return;

        }

        signal =basic.basicComputerAttack31s13(board); //独立一子随机
        if(signal!=null){
            String[] signalxy = signal.split(" ");
            int x = Integer.parseInt(signalxy[0]);
            int y = Integer.parseInt(signalxy[1]);
            board[x][y] = "☆";
            if (listener!=null){
                listener.result(x,y);
            }
            return;
        }

        signal =basic.basicPlayerAttack31s13(board); //堵独立一子随机
        if(signal!=null){
            String[] signalxy = signal.split(" ");
            int x = Integer.parseInt(signalxy[0]);
            int y = Integer.parseInt(signalxy[1]);
            board[x][y] = "☆";
            if (listener!=null){
                listener.result(x,y);
            }
            return;}

        if(board[7][7]!="●"&&board[7][7]!="○"){
            board[7][7] = "☆";
            if (listener!=null){
                listener.result(7,7);
            }
            return;
        }

        signal =basic.basicComputerAttack21s13(board); //独立一子一边空两个
        if(signal!=null){
            String[] signalxy = signal.split(" ");
            int x = Integer.parseInt(signalxy[0]);
            int y = Integer.parseInt(signalxy[1]);
            board[x][y] = "☆";
            if (listener!=null){
                listener.result(x,y);
            }
            return;
        }

        signal =basic.basicComputerAttack11s13(board); //独立一子一边空一个
        if(signal!=null){
            String[] signalxy = signal.split(" ");
            int x = Integer.parseInt(signalxy[0]);
            int y = Integer.parseInt(signalxy[1]);
            board[x][y] = "☆";
            if (listener!=null){
                listener.result(x,y);
            }
            return;
        }

        if(board[11][3]!="●"&&board[11][3]!="○"){
            board[11][3] = "☆";
            if (listener!=null){
                listener.result(11,3);
            }
            return;
        }
        if(board[11][11]!="●"&&board[11][11]!="○"){
            board[11][11] = "☆";
            if (listener!=null){
                listener.result(11,11);
            }
            return;
        }
        if(board[3][11]!="●"&&board[3][11]!="○"){
            board[3][11] = "☆";
            if (listener!=null){
                listener.result(3,11);
            }
            return;
        }
        if(board[3][3]!="●"&&board[3][3]!="○"){
            board[3][3] = "☆";
            if (listener!=null){
                listener.result(3,3);
            }
            return;
        }

        signal =basic.basicComputerAttack11s11(board); //空地方挨着白子下一子
        if(signal!=null){
            String[] signalxy = signal.split(" ");
            int x = Integer.parseInt(signalxy[0]);
            int y = Integer.parseInt(signalxy[1]);
            board[x][y] = "☆";
            if (listener!=null){
                listener.result(x,y);
            }
            return;
        }
        signal =basic.basicPlayerAttack11s11(board); //空地方挨着黑子下一子
        if(signal!=null){
            String[] signalxy = signal.split(" ");
            int x = Integer.parseInt(signalxy[0]);
            int y = Integer.parseInt(signalxy[1]);
            board[x][y] = "☆";
            if (listener!=null){
                listener.result(x,y);
            }
            return;
        }

    }
    /*
    *判断谁赢了方法
    */
    public void whoWin(){
        String[] judge = new String[5];
        int allPieces=0;//判断是否下满棋盘
        for(int i=0; i<boardSize; i++){
            for(int j=0; j<boardSize;j++){
                if(board[i][j]=="●"||board[i][j]=="○"||board[i][j]=="☆"){allPieces++;}//判断是否下满棋盘
                if((j+4)<boardSize){
                    int l=0;
                    for(int k=0; k<5;k++){
                        judge[k]=board[i][j+l];
                        l++;
                    }
                    int o=0;
                    int g=0;
                    for(String jud:judge){
                        if(jud=="●")o++;
                        if(jud=="○"||jud=="☆")g++;
                    }
                    if(o==5){
                        judgeWhetherGo = 1;
                        return;
                    }
                    if(g==5){
                        judgeWhetherGo = 1;
                        return;
                    }
                }
            }
        }
        if(allPieces==boardSize*boardSize){judgeWhetherGo = 2;}//判断是否下满棋盘
        for(int i=0; i<boardSize; i++){
            for(int j=0; j<boardSize;j++){
                if((i+4)<boardSize){
                    int l=0;
                    for(int k=0; k<5;k++){
                        judge[k]=board[i+l][j];
                        l++;
                    }
                    int o=0;
                    int g=0;
                    for(String jud:judge){
                        if(jud=="●")o++;
                        if(jud=="○"||jud=="☆")g++;
                    }
                    if(o==5){
                        judgeWhetherGo = 1;
                        return;
                    }
                    if(g==5){
                        judgeWhetherGo = 1;
                        return;
                    }
                }
            }
        }
        for(int i=0; i<boardSize; i++){
            for(int j=0; j<boardSize;j++){
                if((i+4)<boardSize&&(j+4)<boardSize){
                    int l=0;
                    for(int k=0; k<5;k++){
                        judge[k]=board[i+l][j+l];
                        l++;
                    }
                    int o=0;
                    int g=0;
                    for(String jud:judge){
                        if(jud=="●")o++;
                        if(jud=="○"||jud=="☆")g++;
                    }
                    if(o==5){
                        judgeWhetherGo = 1;
                        return;
                    }
                    if(g==5){
                        judgeWhetherGo = 1;
                        return;
                    }
                }
            }
        }

        for(int i=0; i<boardSize; i++){
            for(int j=0; j<boardSize;j++){
                if((i-4)>=0&&(j+4)<boardSize){
                    int l=0;
                    for(int k=0; k<5;k++){
                        judge[k]=board[i-l][j+l];
                        l++;
                    }
                    int o=0;
                    int g=0;
                    for(String jud:judge){
                        if(jud=="●")o++;
                        if(jud=="○"||jud=="☆")g++;
                    }
                    if(o==5){
                        judgeWhetherGo = 1;
                        return;
                    }
                    if(g==5){
                        judgeWhetherGo = 1;
                        return;
                    }
                }
            }
        }
    }
    /*
    *判断是否和棋
    */
    public void whetherDraw(){
        int mayPlayerWin=0; //玩家可能赢的机会
        int mayComputerWin=0;  //电脑可能赢的机会
        String[] judge = new String[5];
        int allPieces=0;//判断是否下满棋盘
        for(int i=0; i<boardSize; i++){
            for(int j=0; j<boardSize;j++){
                if((j+4)<boardSize){
                    int l=0;
                    for(int k=0; k<5;k++){
                        judge[k]=board[i][j+l];
                        l++;
                    }
                    int o=0;
                    int g=0;
                    for(String jud:judge){
                        if(jud!="●")o++;
                        if(jud!="○"&&jud!="☆")g++;
                    }
                    if(o==5){
                        mayPlayerWin++;
                    }
                    if(g==5){
                        mayComputerWin++;
                    }
                }
            }
        }

        for(int i=0; i<boardSize; i++){
            for(int j=0; j<boardSize;j++){
                if((i+4)<boardSize){
                    int l=0;
                    for(int k=0; k<5;k++){
                        judge[k]=board[i+l][j];
                        l++;
                    }
                    int o=0;
                    int g=0;
                    for(String jud:judge){
                        if(jud!="●")o++;
                        if(jud!="○"&&jud!="☆")g++;
                    }
                    if(o==5){
                        mayComputerWin++;
                    }
                    if(g==5){
                        mayPlayerWin++;
                    }
                }
            }
        }
        for(int i=0; i<boardSize; i++){
            for(int j=0; j<boardSize;j++){
                if((i+4)<boardSize&&(j+4)<boardSize){
                    int l=0;
                    for(int k=0; k<5;k++){
                        judge[k]=board[i+l][j+l];
                        l++;
                    }
                    int o=0;
                    int g=0;
                    for(String jud:judge){
                        if(jud!="●")o++;
                        if(jud!="○"&&jud!="☆")g++;
                    }
                    if(o==5){
                        mayComputerWin++;
                    }
                    if(g==5){
                        mayPlayerWin++;
                    }
                }
            }
        }

        for(int i=0; i<boardSize; i++){
            for(int j=0; j<boardSize;j++){
                if((i-4)>=0&&(j+4)<boardSize){
                    int l=0;
                    for(int k=0; k<5;k++){
                        judge[k]=board[i-l][j+l];
                        l++;
                    }
                    int o=0;
                    int g=0;
                    for(String jud:judge){
                        if(jud!="●")o++;
                        if(jud!="○"&&jud!="☆")g++;
                    }
                    if(o==5){
                        mayComputerWin++;
                    }
                    if(g==5){
                        mayPlayerWin++;
                    }
                }
            }
        }
        if(mayComputerWin==0&&mayPlayerWin==0)judgeWhetherGo=3;
    }
    /*
    *把☆改变成永久的○
    */
    public void change(){
        for(int i=0; i<boardSize; i++){
            for(int j=0; j<boardSize;j++){
                if(board[i][j]=="☆")board[i][j]="○";
            }
        }
    }


    public void setListener(ComputerPieceListener listener) {
        this.listener = listener;
    }
    public void play(){


//            printBoard();
            whoWin();
            if(judgeWhetherGo ==1){
//                printBoard();
                System.out.println("恭喜您赢了！");
                if (listener!=null){
                    listener.end("恭喜您赢了！");
                }
            }
            autoGetPieces();
//            printBoard();
            whoWin();
            whetherDraw();
            if(judgeWhetherGo ==1){
                System.out.println("这局您输了！");
                if (listener!=null){
                    listener.end("这局您输了！");
                }
            }
            if(judgeWhetherGo ==2){
                System.out.println("这局和棋！棋盘下满了！");
                if (listener!=null){
                    listener.end("这局和棋！棋盘下满了！");
                }
            }
            if(judgeWhetherGo ==3){
                System.out.println("这局和棋！双方都没有机会赢了！");
                if (listener!=null){
                    listener.end("这局和棋！双方都没有机会赢了！");
                }
            }
        change();
    }
    private Handler mHandler = new Handler(Looper.getMainLooper()){
        @Override
        public void handleMessage(Message msg){
            switch (msg.what) {
                case 0:

                    break;
                case 1:
                    Bundle data = msg.getData();
                    if (data == null) {
                        return;
                    }

                    if (listener!=null){
                        listener.end(data.getString("result"));
                    }
                    break;
            }
        }
    };
     public interface ComputerPieceListener{
        void result(int x,int y);
        void end(String info);
     }
}