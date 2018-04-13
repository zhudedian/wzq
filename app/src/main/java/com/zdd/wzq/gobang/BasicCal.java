package com.zdd.wzq.gobang;

import java.lang.Math;
public class BasicCal{
    String[][] board;
    private static int boardSize=15;
    public BasicCal(){
        this.board = new String[boardSize][boardSize];
    }
    /*
    *电脑攻击四个子的时候
    */
    public String basicComputerMustAttack4s4(String[][] newboard){
        board=newboard;
        String[] judge = new String[4];
        for(int i=0; i<boardSize; i++){
            for(int j=0; j<boardSize;j++){
                if((j+3)<boardSize){
                    int s=0;
                    for(int k=0; k<4;k++){
                        judge[k]=board[i][j+s];
                        s++;
                    }
                    int o=0;
                    for(String jud:judge){
                        if(jud=="○")o++;
                    }
                    if(o==4){
                        if((j+4)<boardSize&&board[i][j+4]!="●"&&board[i][j+4]!="○"){return i+" "+(j+4);}
                        else if((j-1)>=0&&board[i][j-1]!="●"&&board[i][j-1]!="○"){return i+" "+(j-1);}
                    }
                }
                if((i+3)<boardSize){
                    int s=0;
                    for(int k=0; k<4;k++){
                        judge[k]=board[i+s][j];
                        s++;
                    }
                    int o=0;
                    for(String jud:judge){
                        if(jud=="○")o++;
                    }
                    if(o==4){
                        if((i+4)<boardSize&&board[i+4][j]!="●"&&board[i+4][j]!="○"){return (i+4)+" "+j;}
                        else if((i-1)>=0&&board[i-1][j]!="●"&&board[i-1][j]!="○"){return (i-1)+" "+j;}
                    }
                }
                if((i+3)<boardSize&&(j+3)<boardSize){
                    int s=0;
                    for(int k=0; k<4;k++){
                        judge[k]=board[i+s][j+s];
                        s++;
                    }
                    int o=0;
                    for(String jud:judge){
                        if(jud=="○")o++;
                    }
                    if(o==4){
                        if((i+4)<boardSize&&(j+4)<boardSize&&board[i+4][j+4]!="●"&&board[i+4][j+4]!="○"){return (i+4)+" "+(j+4);}
                        else if((i-1)>=0&&(j-1)>=0&&board[i-1][j-1]!="●"&&board[i-1][j-1]!="○"){return (i-1)+" "+(j-1);}
                    }
                }
                if((i-3)>0&&(j+3)<boardSize){
                    int s=0;
                    for(int k=0; k<4;k++){
                        judge[k]=board[i-s][j+s];
                        s++;
                    }
                    int o=0;
                    for(String jud:judge){
                        if(jud=="○")o++;
                    }
                    if(o==4){
                        if((i-4)>=0&&(j+4)<15&&board[i-4][j+4]!="●"&&board[i-4][j+4]!="○"){return (i-4)+" "+(j+4);}
                        else if((i+1)<15&&(j-1)>=0&&board[i+1][j-1]!="●"&&board[i+1][j-1]!="○"){return (i+1)+" "+(j-1);}
                    }
                }
            }}
        return null;
    }

    /*
    *玩家攻击四个子的时候
    */
    public String basicPlayerMustAttack4s4(String[][] newboard){
        board=newboard;
        String[] judge = new String[4];
        for(int i=0; i<boardSize; i++){
            for(int j=0; j<boardSize;j++){
                if((j+3)<boardSize){
                    int s=0;
                    for(int k=0; k<4;k++){
                        judge[k]=board[i][j+s];
                        s++;
                    }
                    int o=0;
                    for(String jud:judge){
                        if(jud=="●")o++;
                    }
                    if(o==4){
                        if((j+4)<boardSize&&board[i][j+4]!="●"&&board[i][j+4]!="○"){return i+" "+(j+4);}
                        else if((j-1)>=0&&board[i][j-1]!="●"&&board[i][j-1]!="○"){return i+" "+(j-1);}
                    }
                }
                if((i+3)<boardSize){
                    int s=0;
                    for(int k=0; k<4;k++){
                        judge[k]=board[i+s][j];
                        s++;
                    }
                    int o=0;
                    for(String jud:judge){
                        if(jud=="●")o++;
                    }
                    if(o==4){
                        if((i+4)<boardSize&&board[i+4][j]!="●"&&board[i+4][j]!="○"){return (i+4)+" "+j;}
                        else if((i-1)>=0&&board[i-1][j]!="●"&&board[i-1][j]!="○"){return (i-1)+" "+j;}
                    }
                }
                if((i+3)<boardSize&&(j+3)<boardSize){
                    int s=0;
                    for(int k=0; k<4;k++){
                        judge[k]=board[i+s][j+s];
                        s++;
                    }
                    int o=0;
                    for(String jud:judge){
                        if(jud=="●")o++;
                    }
                    if(o==4){
                        if((i+4)<boardSize&&(j+4)<boardSize&&board[i+4][j+4]!="●"&&board[i+4][j+4]!="○"){return (i+4)+" "+(j+4);}
                        else if((i-1)>=0&&(j-1)>=0&&board[i-1][j-1]!="●"&&board[i-1][j-1]!="○"){return (i-1)+" "+(j-1);}
                    }
                }
                if((i-3)>0&&(j+3)<boardSize){
                    int s=0;
                    for(int k=0; k<4;k++){
                        judge[k]=board[i-s][j+s];
                        s++;
                    }
                    int o=0;
                    for(String jud:judge){
                        if(jud=="●")o++;
                    }
                    if(o==4){
                        if((i-4)>=0&&(j+4)<15&&board[i-4][j+4]!="●"&&board[i-4][j+4]!="○"){return (i-4)+" "+(j+4);}
                        else if((i+1)<15&&(j-1)>=0&&board[i+1][j-1]!="●"&&board[i+1][j-1]!="○"){return (i+1)+" "+(j-1);}
                    }
                }
            }}
        return null;
    }
    /*
    *电脑攻击五个中间缺一个
    */
    public String basicComputerMustAttack5s4(String[][] newboard){
        board=newboard;
        String[] judge = new String[5];
        for(int i=0; i<boardSize; i++){
            for(int j=0; j<boardSize;j++){
                if((j+4)<boardSize){
                    int s=0;
                    for(int k=0; k<5;k++){
                        judge[k]=board[i][j+s];
                        s++;
                    }
                    int o=0;
                    for(String jud:judge){
                        if(jud=="○")o++;
                    }
                    if(o==4){
                        if(board[i][j+1]!="●"&&board[i][j+1]!="○"){return i+" "+(j+1);}
                        if(board[i][j+2]!="●"&&board[i][j+2]!="○"){return i+" "+(j+2);}
                        if(board[i][j+3]!="●"&&board[i][j+3]!="○"){return i+" "+(j+3);}
                    }
                }
                if((i+4)<boardSize){
                    int s=0;
                    for(int k=0; k<5;k++){
                        judge[k]=board[i+s][j];
                        s++;
                    }
                    int o=0;
                    for(String jud:judge){
                        if(jud=="○")o++;
                    }
                    if(o==4){
                        if(board[i+1][j]!="●"&&board[i+1][j]!="○"){return (i+1)+" "+j;}
                        if(board[i+2][j]!="●"&&board[i+2][j]!="○"){return (i+2)+" "+j;}
                        if(board[i+3][j]!="●"&&board[i+3][j]!="○"){return (i+3)+" "+j;}
                    }
                }
                if((i+4)<boardSize&&(j+4)<boardSize){
                    int s=0;
                    for(int k=0; k<5;k++){
                        judge[k]=board[i+s][j+s];
                        s++;
                    }
                    int o=0;
                    for(String jud:judge){
                        if(jud=="○")o++;
                    }
                    if(o==4){
                        if(board[i+1][j+1]!="●"&&board[i+1][j+1]!="○"){return (i+1)+" "+(j+1);}
                        if(board[i+2][j+2]!="●"&&board[i+2][j+2]!="○"){return (i+2)+" "+(j+2);}
                        if(board[i+3][j+3]!="●"&&board[i+3][j+3]!="○"){return (i+3)+" "+(j+3);}
                    }
                }
                if((i-4)>0&&(j+4)<boardSize){
                    int s=0;
                    for(int k=0; k<5;k++){
                        judge[k]=board[i-s][j+s];
                        s++;
                    }
                    int o=0;
                    for(String jud:judge){
                        if(jud=="○")o++;
                    }
                    if(o==4){
                        if(board[i-1][j+1]!="●"&&board[i-1][j+1]!="○"){return (i-1)+" "+(j+1);}
                        if(board[i-2][j+2]!="●"&&board[i-2][j+2]!="○"){return (i-2)+" "+(j+2);}
                        if(board[i-3][j+3]!="●"&&board[i-3][j+3]!="○"){return (i-3)+" "+(j+3);}
                    }
                }
            }}
        return null;
    }
    /*
    *玩家攻击五个中间缺一个
    */
    public String basicPlayerMustAttack5s4(String[][] newboard){
        board=newboard;
        String[] judge = new String[5];
        for(int i=0; i<boardSize; i++){
            for(int j=0; j<boardSize;j++){
                if((j+4)<boardSize){
                    int s=0;
                    for(int k=0; k<5;k++){
                        judge[k]=board[i][j+s];
                        s++;
                    }
                    int o=0;
                    for(String jud:judge){
                        if(jud=="●")o++;
                    }
                    if(o==4){
                        if(board[i][j+1]!="●"&&board[i][j+1]!="○"){return i+" "+(j+1);}
                        if(board[i][j+2]!="●"&&board[i][j+2]!="○"){return i+" "+(j+2);}
                        if(board[i][j+3]!="●"&&board[i][j+3]!="○"){return i+" "+(j+3);}
                    }
                }
                if((i+4)<boardSize){
                    int s=0;
                    for(int k=0; k<5;k++){
                        judge[k]=board[i+s][j];
                        s++;
                    }
                    int o=0;
                    for(String jud:judge){
                        if(jud=="●")o++;
                    }
                    if(o==4){
                        if(board[i+1][j]!="●"&&board[i+1][j]!="○"){return (i+1)+" "+j;}
                        if(board[i+2][j]!="●"&&board[i+2][j]!="○"){return (i+2)+" "+j;}
                        if(board[i+3][j]!="●"&&board[i+3][j]!="○"){return (i+3)+" "+j;}
                    }
                }
                if((i+4)<boardSize&&(j+4)<boardSize){
                    int s=0;
                    for(int k=0; k<5;k++){
                        judge[k]=board[i+s][j+s];
                        s++;
                    }
                    int o=0;
                    for(String jud:judge){
                        if(jud=="●")o++;
                    }
                    if(o==4){
                        if(board[i+1][j+1]!="●"&&board[i+1][j+1]!="○"){return (i+1)+" "+(j+1);}
                        if(board[i+2][j+2]!="●"&&board[i+2][j+2]!="○"){return (i+2)+" "+(j+2);}
                        if(board[i+3][j+3]!="●"&&board[i+3][j+3]!="○"){return (i+3)+" "+(j+3);}
                    }
                }
                if((i-4)>0&&(j+4)<boardSize){
                    int s=0;
                    for(int k=0; k<5;k++){
                        judge[k]=board[i-s][j+s];
                        s++;
                    }
                    int o=0;
                    for(String jud:judge){
                        if(jud=="●")o++;
                    }
                    if(o==4){
                        if(board[i-1][j+1]!="●"&&board[i-1][j+1]!="○"){return (i-1)+" "+(j+1);}
                        if(board[i-2][j+2]!="●"&&board[i-2][j+2]!="○"){return (i-2)+" "+(j+2);}
                        if(board[i-3][j+3]!="●"&&board[i-3][j+3]!="○"){return (i-3)+" "+(j+3);}
                    }
                }
            }}
        return null;
    }
    /*
    *电脑攻击四子中间隔一个
    */
    public String basicComputerMustAttack4s3(String[][] newboard){
        board=newboard;
        String[] judge = new String[4];
        for(int i=0; i<boardSize; i++){
            for(int j=0; j<boardSize;j++){
                if((j+3)<boardSize){
                    int s=0;
                    for(int k=0; k<4;k++){
                        judge[k]=board[i][j+s];
                        s++;
                    }
                    int o=0;
                    for(String jud:judge){
                        if(jud=="○")o++;
                    }
                    if(o==3){
                        if((j+4)<boardSize&&(j-1)>=0&&board[i][j-1]!="●"&&board[i][j+4]!="●")
                        {if(board[i][j+1]!="●"&&board[i][j+1]!="○"){return i+" "+(j+1);}
                            if(board[i][j+2]!="●"&&board[i][j+2]!="○"){return i+" "+(j+2);}}
                    }
                }
                if((i+3)<boardSize){
                    int s=0;
                    for(int k=0; k<4;k++){
                        judge[k]=board[i+s][j];
                        s++;
                    }
                    int o=0;
                    for(String jud:judge){
                        if(jud=="○")o++;
                    }
                    if(o==3){
                        if((i-1)>=0&&(i+4)<boardSize&&board[i-1][j]!="●"&&board[i+4][j]!="●")
                        {if(board[i+1][j]!="●"&&board[i+1][j]!="○"){return (i+1)+" "+j;}
                            if(board[i+2][j]!="●"&&board[i+2][j]!="○"){return (i+2)+" "+j;}}
                    }
                }
                if((i+3)<boardSize&&(j+3)<boardSize){
                    int s=0;
                    for(int k=0; k<4;k++){
                        judge[k]=board[i+s][j+s];
                        s++;
                    }
                    int o=0;
                    for(String jud:judge){
                        if(jud=="○")o++;
                    }
                    if(o==3){
                        if((i+4)<boardSize &&(j+4)<boardSize&&(i-1)>=0&&(j-1)>=0&&board[i+4][j+4]!="●"&&board[i-1][j-1]!="●")
                        {if(board[i+1][j+1]!="●"&&board[i+1][j+1]!="○"){return (i+1)+" "+(j+1);}
                            if(board[i+2][j+2]!="●"&&board[i+2][j+2]!="○"){return (i+2)+" "+(j+2);}}
                    }
                }
                if((i-3)>0&&(j+3)<boardSize){
                    int s=0;
                    for(int k=0; k<4;k++){
                        judge[k]=board[i-s][j+s];
                        s++;
                    }
                    int o=0;
                    for(String jud:judge){
                        if(jud=="○")o++;
                    }
                    if(o==3){
                        if((i+1)<boardSize&&(j-1)>=0&&(i-4)>=0&&(j+4)<boardSize&&board[i+1][j-1]!="●"&&board[i-4][j+4]!="●")
                        {if(board[i-1][j+1]!="●"&&board[i-1][j+1]!="○"){return (i-1)+" "+(j+1);}
                            if(board[i-2][j+2]!="●"&&board[i-2][j+2]!="○"){return (i-2)+" "+(j+2);}}
                    }
                }
            }}
        return null;
    }
    /*
    *玩家攻击四子中间隔一个
    */
    public String basicPlayerMustAttack4s3(String[][] newboard){
        board=newboard;
        String[] judge = new String[4];
        for(int i=0; i<boardSize; i++){
            for(int j=0; j<boardSize;j++){
                if((j+3)<boardSize){
                    int s=0;
                    for(int k=0; k<4;k++){
                        judge[k]=board[i][j+s];
                        s++;
                    }
                    int o=0;
                    for(String jud:judge){
                        if(jud=="●")o++;
                    }
                    if(o==3){
                        if((j+4)<boardSize&&(j-1)>=0&&board[i][j-1]!="○"&&board[i][j+4]!="○")
                        {if(board[i][j+1]!="●"&&board[i][j+1]!="○"){return i+" "+(j+1);}
                            if(board[i][j+2]!="●"&&board[i][j+2]!="○"){return i+" "+(j+2);}}
                    }
                }
                if((i+3)<boardSize){
                    int s=0;
                    for(int k=0; k<4;k++){
                        judge[k]=board[i+s][j];
                        s++;
                    }
                    int o=0;
                    for(String jud:judge){
                        if(jud=="●")o++;
                    }
                    if(o==3){
                        if((i-1)>=0&&(i+4)<boardSize&&board[i-1][j]!="○"&&board[i+4][j]!="○")
                        {if(board[i+1][j]!="●"&&board[i+1][j]!="○"){return (i+1)+" "+j;}
                            if(board[i+2][j]!="●"&&board[i+2][j]!="○"){return (i+2)+" "+j;}}
                    }
                }
                if((i+3)<boardSize&&(j+3)<boardSize){
                    int s=0;
                    for(int k=0; k<4;k++){
                        judge[k]=board[i+s][j+s];
                        s++;
                    }
                    int o=0;
                    for(String jud:judge){
                        if(jud=="●")o++;
                    }
                    if(o==3){
                        if((i+4)<boardSize &&(j+4)<boardSize&&(i-1)>=0&&(j-1)>=0&&board[i+4][j+4]!="○"&&board[i-1][j-1]!="○")
                        {if(board[i+1][j+1]!="●"&&board[i+1][j+1]!="○"){return (i+1)+" "+(j+1);}
                            if(board[i+2][j+2]!="●"&&board[i+2][j+2]!="○"){return (i+2)+" "+(j+2);}}
                    }
                }
                if((i-3)>0&&(j+3)<boardSize){
                    int s=0;
                    for(int k=0; k<4;k++){
                        judge[k]=board[i-s][j+s];
                        s++;
                    }
                    int o=0;
                    for(String jud:judge){
                        if(jud=="●")o++;
                    }
                    if(o==3){
                        if((i+1)<boardSize&&(j-1)>=0&&(i-4)>=0&&(j+4)<boardSize&&board[i+1][j-1]!="○"&&board[i-4][j+4]!="○")
                        {if(board[i-1][j+1]!="●"&&board[i-1][j+1]!="○"){return (i-1)+" "+(j+1);}
                            if(board[i-2][j+2]!="●"&&board[i-2][j+2]!="○"){return (i-2)+" "+(j+2);}}
                    }
                }
            }}
        return null;
    }
    /*
    *电脑攻击七子中四个的时候
    */
    public String basicComputerMustAttack7s4(String[][] newboard){
        board=newboard;
        for(int i=0; i<boardSize; i++){
            for(int j=0; j<boardSize;j++){
                if((j+3)<boardSize&&(j-3)>=0&&board[i][j]!="●"&&board[i][j]!="○"){
                    if(board[i][j+3]=="○"&&board[i][j+1]=="○"&&board[i][j-1]=="○"&&board[i][j-3]=="○")
                    {if(board[i][j+2]!="●"&&board[i][j-2]!="●")
                    {return i+" "+j;}
                    }
                }
                if((i+3)<boardSize&&(i-3)>=0&&board[i][j]!="●"&&board[i][j]!="○"){
                    if(board[i+3][j]=="○"&&board[i+1][j]=="○"&&board[i-1][j]=="○"&&board[i-3][j]=="○")
                    {if(board[i+2][j]!="●"&&board[i-2][j]!="●")
                    {return i+" "+j;}
                    }
                }
                if((i+3)<boardSize&&(i-3)>=0&&(j+3)<boardSize&&(j-3)>=0&&board[i][j]!="●"&&board[i][j]!="○"){
                    if(board[i+3][j+3]=="○"&&board[i+1][j+1]=="○"&&board[i-1][j-1]=="○"&&board[i-3][j-3]=="○")
                    {if(board[i+2][j+2]!="●"&&board[i-2][j-2]!="●")
                    {return i+" "+j;}
                    }
                }
                if((i+3)<boardSize&&(i-3)>=0&&(j+3)<boardSize&&(j-3)>=0&&board[i][j]!="●"&&board[i][j]!="○"){
                    if(board[i-3][j+3]=="○"&&board[i-1][j+1]=="○"&&board[i+1][j-1]=="○"&&board[i+3][j-3]=="○")
                    {if(board[i-2][j+2]!="●"&&board[i+2][j-2]!="●")
                    {return i+" "+j;}
                    }
                }
            }}
        return null;
    }
    /*
    *玩家攻击七子中四个的时候
    */
    public String basicPlayerMustAttack7s4(String[][] newboard){
        board=newboard;
        for(int i=0; i<boardSize; i++){
            for(int j=0; j<boardSize;j++){
                if((j+3)<boardSize&&(j-3)>=0&&board[i][j]!="●"&&board[i][j]!="○"){
                    if(board[i][j+3]=="●"&&board[i][j+1]=="●"&&board[i][j-1]=="●"&&board[i][j-3]=="●")
                    {if(board[i][j+2]!="○"&&board[i][j-2]!="○")
                    {return i+" "+j;}
                    }
                }
                if((i+3)<boardSize&&(i-3)>=0&&board[i][j]!="●"&&board[i][j]!="○"){
                    if(board[i+3][j]=="●"&&board[i+1][j]=="●"&&board[i-1][j]=="●"&&board[i-3][j]=="●")
                    {if(board[i+2][j]!="○"&&board[i-2][j]!="○")
                    {return i+" "+j;}
                    }
                }
                if((i+3)<boardSize&&(i-3)>=0&&(j+3)<boardSize&&(j-3)>=0&&board[i][j]!="●"&&board[i][j]!="○"){
                    if(board[i+3][j+3]=="●"&&board[i+1][j+1]=="●"&&board[i-1][j-1]=="●"&&board[i-3][j-3]=="●")
                    {if(board[i+2][j+2]!="○"&&board[i-2][j-2]!="○")
                    {return i+" "+j;}
                    }
                }
                if((i+3)<boardSize&&(i-3)>=0&&(j+3)<boardSize&&(j-3)>=0&&board[i][j]!="●"&&board[i][j]!="○"){
                    if(board[i-3][j+3]=="●"&&board[i-1][j+1]=="●"&&board[i+1][j-1]=="●"&&board[i+3][j-3]=="●")
                    {if(board[i-2][j+2]!="○"&&board[i+2][j-2]!="○")
                    {return i+" "+j;}
                    }
                }
            }}
        return null;
    }
    /*
    *电脑攻击特殊两列三个一起考虑
    */
    public String basicComputerMustAttack33(String[][] newboard){
        board=newboard;
        for(int i=0; i<boardSize; i++){
            for(int j=0; j<boardSize;j++){
                if(board[i][j]!="●"&&board[i][j]!="○"){
                    int line=0;
                    //-----------1------------
                    if((j+3)<boardSize&&board[i][j+1]=="○"&&board[i][j+2]=="○"&&board[i][j+3]=="○"){
                        if((j+4)<boardSize&&board[i][j+4]!="●")line++;
                        else if((j-1)>=0&&board[i][j-1]!="●")line++;

                    }
                    if((j-1)>=0&&(j+2)<boardSize&&board[i][j+1]=="○"&&board[i][j+2]=="○"&&board[i][j-1]=="○"){
                        if((j+3)<boardSize&&board[i][j+3]!="●")line++;
                        else if((j-2)>=0&&board[i][j-2]!="●")line++;

                    }
                    if((j-2)>=0&&(j+1)<boardSize&&board[i][j+1]=="○"&&board[i][j-2]=="○"&&board[i][j-1]=="○"){
                        if((j+2)<boardSize&&board[i][j+2]!="●")line++;
                        else if((j-3)>=0&&board[i][j-3]!="●")line++;

                    }
                    if((j-3)>=0&&board[i][j-3]=="○"&&board[i][j-2]=="○"&&board[i][j-1]=="○"){
                        if((j+1)<boardSize&&board[i][j+1]!="●")line++;
                        else if((j-4)>=0&&board[i][j-4]!="●")line++;

                    }
                    //------------2-----------
                    if((i+3)<boardSize&&board[i+1][j]=="○"&&board[i+2][j]=="○"&&board[i+3][j]=="○"){
                        if((i+4)<boardSize&&board[i+4][j]!="●")line++;
                        else if((i-1)>=0&&board[i-1][j]!="●")line++;

                    }
                    if((i-1)>=0&&(i+2)<boardSize&&board[i+1][j]=="○"&&board[i+2][j]=="○"&&board[i-1][j]=="○"){
                        if((i+3)<boardSize&&board[i+3][j]!="●")line++;
                        else if((i-2)>=0&&board[i-2][j]!="●")line++;

                    }
                    if((i-2)>=0&&(i+1)<boardSize&&board[i+1][j]=="○"&&board[i-2][j]=="○"&&board[i-1][j]=="○"){
                        if((i+2)<boardSize&&board[i+2][j]!="●")line++;
                        else if((i-3)>=0&&board[i-3][j]!="●")line++;

                    }
                    if((i-3)>=0&&board[i-3][j]=="○"&&board[i-2][j]=="○"&&board[i-1][j]=="○"){
                        if((i+1)<boardSize&&board[i+1][j]!="●")line++;
                        else if((i-4)>=0&&board[i-4][j]!="●")line++;

                    }
                    //------------3-----------
                    if((i+3)<boardSize&&(j+3)<boardSize&&board[i+1][j+1]=="○"&&board[i+2][j+2]=="○"&&board[i+3][j+3]=="○"){
                        if((i+4)<boardSize&&(j+4)<boardSize&&board[i+4][j+4]!="●")line++;
                        else if((i-1)>=0&&(j-1)>=0&&board[i-1][j-1]!="●")line++;

                    }
                    if((i-1)>=0&&(i+2)<boardSize&&(j-1)>=0&&(j+2)<boardSize&&board[i+1][j+1]=="○"&&board[i+2][j+2]=="○"&&board[i-1][j-1]=="○"){
                        if((i+3)<boardSize&&(j+3)<boardSize&&board[i+3][j+3]!="●")line++;
                        else if((i-2)>=0&&(j-2)>=0&&board[i-2][j-2]!="●")line++;

                    }
                    if((i-2)>=0&&(i+1)<boardSize&&(j-2)>=0&&(j+1)<boardSize&&board[i+1][j+1]=="○"&&board[i-2][j-2]=="○"&&board[i-1][j-1]=="○"){
                        if((i+2)<boardSize&&(j+2)<boardSize&&board[i+2][j+2]!="●")line++;
                        else if((i-3)>=0&&(j-3)>=0&&board[i-3][j-3]!="●")line++;

                    }
                    if((i-3)>=0&&(j-3)>=0&&board[i-3][j-3]=="○"&&board[i-2][j-2]=="○"&&board[i-1][j-1]=="○"){
                        if((i+1)<boardSize&&(j+1)<boardSize&&board[i+1][j+1]!="●")line++;
                        else if((i-4)>=0&&(j-4)>=0&&board[i-4][j-4]!="●")line++;

                    }
                    //------------4-----------
                    if((i+3)<boardSize&&(j-3)>=0&&board[i+1][j-1]=="○"&&board[i+2][j-2]=="○"&&board[i+3][j-3]=="○"){
                        if((i+4)<boardSize&&(j-4)>=0&&board[i+4][j-4]!="●")line++;
                        else if((i-1)>=0&&(j+1)<boardSize&&board[i-1][j+1]!="●")line++;

                    }
                    if((i-1)>=0&&(i+2)<boardSize&&(j+1)<boardSize&&(j-2)>=0&&board[i+1][j-1]=="○"&&board[i+2][j-2]=="○"&&board[i-1][j+1]=="○"){
                        if((i+3)<boardSize&&(i-3)>=0&&board[i+3][j-3]!="●")line++;
                        else if((i-2)>=0&&(j+2)<boardSize&&board[i-2][j+2]!="●")line++;

                    }
                    if((i-2)>=0&&(i+1)<boardSize&&(j+2)<boardSize&&(j-1)>=0&&board[i+1][j-1]=="○"&&board[i-2][j+2]=="○"&&board[i-1][j+1]=="○"){
                        if((i+2)<boardSize&&(j-2)>=0&&board[i+2][j-2]!="●")line++;
                        else if((i-3)>=0&&(j+3)<boardSize&&board[i-3][j+3]!="●")line++;

                    }
                    if((i-3)>=0&&(j+3)<boardSize&&board[i-3][j+3]=="○"&&board[i-2][j+2]=="○"&&board[i-1][j+1]=="○"){
                        if((i+1)<boardSize&&(j-1)>=0&&board[i+1][j-1]!="●")line++;
                        else if((i-4)>=0&&(j+4)<boardSize&&board[i-4][j+4]!="●")line++;

                    }

                    if(line>=2){return i+" "+j;}

                }
            }
        }
        return null;
    }
    /*
    *玩家攻击特殊两列三个一起考虑
    */
    public String basicPlayerMustAttack33(String[][] newboard){
        board=newboard;
        for(int i=0; i<boardSize; i++){
            for(int j=0; j<boardSize;j++){
                if(board[i][j]!="●"&&board[i][j]!="○"){
                    int line=0;
                    //-----------1------------
                    if((j+3)<boardSize&&board[i][j+1]=="●"&&board[i][j+2]=="●"&&board[i][j+3]=="●"){
                        if((j+4)<boardSize&&board[i][j+4]!="○")line++;
                        else if((j-1)>=0&&board[i][j-1]!="○")line++;

                    }
                    if((j-1)>=0&&(j+2)<boardSize&&board[i][j+1]=="●"&&board[i][j+2]=="●"&&board[i][j-1]=="●"){
                        if((j+3)<boardSize&&board[i][j+3]!="○")line++;
                        else if((j-2)>=0&&board[i][j-2]!="○")line++;

                    }
                    if((j-2)>=0&&(j+1)<boardSize&&board[i][j+1]=="●"&&board[i][j-2]=="●"&&board[i][j-1]=="●"){
                        if((j+2)<boardSize&&board[i][j+2]!="○")line++;
                        else if((j-3)>=0&&board[i][j-3]!="○")line++;

                    }
                    if((j-3)>=0&&board[i][j-3]=="●"&&board[i][j-2]=="●"&&board[i][j-1]=="●"){
                        if((j+1)<boardSize&&board[i][j+1]!="○")line++;
                        else if((j-4)>=0&&board[i][j-4]!="○")line++;

                    }
                    //------------2-----------
                    if((i+3)<boardSize&&board[i+1][j]=="●"&&board[i+2][j]=="●"&&board[i+3][j]=="●"){
                        if((i+4)<boardSize&&board[i+4][j]!="○")line++;
                        else if((i-1)>=0&&board[i-1][j]!="○")line++;

                    }
                    if((i-1)>=0&&(i+2)<boardSize&&board[i+1][j]=="●"&&board[i+2][j]=="●"&&board[i-1][j]=="●"){
                        if((i+3)<boardSize&&board[i+3][j]!="○")line++;
                        else if((i-2)>=0&&board[i-2][j]!="○")line++;

                    }
                    if((i-2)>=0&&(i+1)<boardSize&&board[i+1][j]=="●"&&board[i-2][j]=="●"&&board[i-1][j]=="●"){
                        if((i+2)<boardSize&&board[i+2][j]!="○")line++;
                        else if((i-3)>=0&&board[i-3][j]!="○")line++;

                    }
                    if((i-3)>=0&&board[i-3][j]=="●"&&board[i-2][j]=="●"&&board[i-1][j]=="●"){
                        if((i+1)<boardSize&&board[i+1][j]!="○")line++;
                        else if((i-4)>=0&&board[i-4][j]!="○")line++;

                    }
                    //------------3-----------
                    if((i+3)<boardSize&&(j+3)<boardSize&&board[i+1][j+1]=="●"&&board[i+2][j+2]=="●"&&board[i+3][j+3]=="●"){
                        if((i+4)<boardSize&&(j+4)<boardSize&&board[i+4][j+4]!="○")line++;
                        else if((i-1)>=0&&(j-1)>=0&&board[i-1][j-1]!="○")line++;

                    }
                    if((i-1)>=0&&(i+2)<boardSize&&(j-1)>=0&&(j+2)<boardSize&&board[i+1][j+1]=="●"&&board[i+2][j+2]=="●"&&board[i-1][j-1]=="●"){
                        if((i+3)<boardSize&&(j+3)<boardSize&&board[i+3][j+3]!="○")line++;
                        else if((i-2)>=0&&(j-2)>=0&&board[i-2][j-2]!="○")line++;

                    }
                    if((i-2)>=0&&(i+1)<boardSize&&(j-2)>=0&&(j+1)<boardSize&&board[i+1][j+1]=="●"&&board[i-2][j-2]=="●"&&board[i-1][j-1]=="●"){
                        if((i+2)<boardSize&&(j+2)<boardSize&&board[i+2][j+2]!="○")line++;
                        else if((i-3)>=0&&(j-3)>=0&&board[i-3][j-3]!="○")line++;

                    }
                    if((i-3)>=0&&(j-3)>=0&&board[i-3][j-3]=="●"&&board[i-2][j-2]=="●"&&board[i-1][j-1]=="●"){
                        if((i+1)<boardSize&&(j+1)<boardSize&&board[i+1][j+1]!="○")line++;
                        else if((i-4)>=0&&(j-4)>=0&&board[i-4][j-4]!="○")line++;

                    }
                    //------------4-----------
                    if((i+3)<boardSize&&(j-3)>=0&&board[i+1][j-1]=="●"&&board[i+2][j-2]=="●"&&board[i+3][j-3]=="●"){
                        if((i+4)<boardSize&&(j-4)>=0&&board[i+4][j-4]!="○")line++;
                        else if((i-1)>=0&&(j+1)<boardSize&&board[i-1][j+1]!="○")line++;

                    }
                    if((i-1)>=0&&(i+2)<boardSize&&(j+1)<boardSize&&(j-2)>=0&&board[i+1][j-1]=="●"&&board[i+2][j-2]=="●"&&board[i-1][j+1]=="●"){
                        if((i+3)<boardSize&&(i-3)>=0&&board[i+3][j-3]!="○")line++;
                        else if((i-2)>=0&&(j+2)<boardSize&&board[i-2][j+2]!="○")line++;

                    }
                    if((i-2)>=0&&(i+1)<boardSize&&(j+2)<boardSize&&(j-1)>=0&&board[i+1][j-1]=="●"&&board[i-2][j+2]=="●"&&board[i-1][j+1]=="●"){
                        if((i+2)<boardSize&&(j-2)>=0&&board[i+2][j-2]!="○")line++;
                        else if((i-3)>=0&&(j+3)<boardSize&&board[i-3][j+3]!="○")line++;

                    }
                    if((i-3)>=0&&(j+3)<boardSize&&board[i-3][j+3]=="●"&&board[i-2][j+2]=="●"&&board[i-1][j+1]=="●"){
                        if((i+1)<boardSize&&(j-1)>=0&&board[i+1][j-1]!="○")line++;
                        else if((i-4)>=0&&(j+4)<boardSize&&board[i-4][j+4]!="○")line++;

                    }

                    if(line>=2){return i+" "+j;}

                }
            }
        }
        return null;
    }
    /*
    *电脑攻击独立三子
    */
    public String basicComputerMustAttack3s3(String[][] newboard){
        board=newboard;
        String[] judge = new String[3];
        for(int i=0; i<boardSize; i++){
            for(int j=0; j<boardSize;j++){
                if((j+2)<boardSize){
                    int s=0;
                    for(int k=0; k<3;k++){
                        judge[k]=board[i][j+s];
                        s++;
                    }
                    int o=0;
                    for(String jud:judge){
                        if(jud=="○")o++;
                    }
                    if(o==3){
                        if((j-1)>=0&&(j+3)<boardSize&&board[i][j+3]!="●"&&board[i][j+3]!="○"&&board[i][j-1]!="●"&&board[i][j-1]!="○")
                        {if((j+4)<boardSize&&board[i][j+4]!="●")
                        {return i+" "+(j+3);}
                        else if((j-2)>=0&&board[i][j-2]!="●"){return i+" "+(j-1);}
                        }
                    }
                }
                if((i+2)<boardSize){
                    int s=0;
                    for(int k=0; k<3;k++){
                        judge[k]=board[i+s][j];
                        s++;
                    }
                    int o=0;
                    for(String jud:judge){
                        if(jud=="○")o++;
                    }
                    if(o==3){
                        if((i-1)>=0&&(i+3)<boardSize&&board[i+3][j]!="●"&&board[i+3][j]!="○"&&board[i-1][j]!="●"&&board[i-1][j]!="○")
                        {if((i+4)<boardSize&&board[i+4][j]!="●")
                        {return (i+3)+" "+j;}
                        else if((i-2)>=0&&board[i-2][j]!="●")
                        {return (i-1)+" "+j;}
                        }
                    }
                }
                if((i+2)<boardSize&&(j+2)<boardSize){
                    int s=0;
                    for(int k=0; k<3;k++){
                        judge[k]=board[i+s][j+s];
                        s++;
                    }
                    int o=0;
                    for(String jud:judge){
                        if(jud=="○")o++;
                    }
                    if(o==3){
                        if((i-1)>=0&&(j-1)>=0&&(i+3)<boardSize&&(j+3)<boardSize &&board[i+3][j+3]!="●"&&board[i+3][j+3]!="○"&&board[i-1][j-1]!="●"&&board[i-1][j-1]!="○")
                        {if((i+4)<boardSize &&(j+4)<boardSize &&board[i+4][j+4]!="●")
                        {return (i+3)+" "+(j+3);}
                        else if((i-2)>=0&&(j-2)>=0&&board[i-2][j-2]!="●")
                        {return (i-1)+" "+(j-1);}
                        }
                    }
                }
                if((i-2)>0&&(j+2)<boardSize){
                    int s=0;
                    for(int k=0; k<3;k++){
                        judge[k]=board[i-s][j+s];
                        s++;
                    }
                    int o=0;
                    for(String jud:judge){
                        if(jud=="○")o++;
                    }
                    if(o==3){
                        if((i+1)<boardSize &&(j-1)>=0&&(i-3)>=0&&(j+3)<boardSize &&board[i-3][j+3]!="●"&&board[i-3][j+3]!="○"&&board[i+1][j-1]!="●"&&board[i+1][j-1]!="○")
                        {if((i-4)>=0&&(j+4)<boardSize &&board[i-4][j+4]!="●")
                        {return (i-3)+" "+(j+3);}
                        else if((i+2)<boardSize &&(j-2)>=0&&board[i+2][j-2]!="●")
                        {return (i+1)+" "+(j-1);}
                        }
                    }
                }
            }}
        return null;
    }
    /*
    *玩家攻击独立三子
    */
    public String basicPlayerMustAttack3s3(String[][] newboard){
        board=newboard;
        String[] judge = new String[3];
        for(int i=0; i<boardSize; i++){
            for(int j=0; j<boardSize;j++){
                if((j+2)<boardSize){
                    int s=0;
                    for(int k=0; k<3;k++){
                        judge[k]=board[i][j+s];
                        s++;
                    }
                    int o=0;
                    for(String jud:judge){
                        if(jud=="●")o++;
                    }
                    if(o==3){
                        if((j-1)>=0&&(j+3)<boardSize&&board[i][j+3]!="●"&&board[i][j+3]!="○"&&board[i][j-1]!="●"&&board[i][j-1]!="○")
                        {if((j+4)<boardSize&&board[i][j+4]!="○")
                        {return i+" "+(j+3);}
                        else if((j-2)>=0&&board[i][j-2]!="○"){return i+" "+(j-1);}
                        }
                    }
                }
                if((i+2)<boardSize){
                    int s=0;
                    for(int k=0; k<3;k++){
                        judge[k]=board[i+s][j];
                        s++;
                    }
                    int o=0;
                    for(String jud:judge){
                        if(jud=="●")o++;
                    }
                    if(o==3){
                        if((i-1)>=0&&(i+3)<boardSize&&board[i+3][j]!="●"&&board[i+3][j]!="○"&&board[i-1][j]!="●"&&board[i-1][j]!="○")
                        {if((i+4)<boardSize&&board[i+4][j]!="○")
                        {return (i+3)+" "+j;}
                        else if((i-2)>=0&&board[i-2][j]!="○")
                        {return (i-1)+" "+j;}
                        }
                    }
                }
                if((i+2)<boardSize&&(j+2)<boardSize){
                    int s=0;
                    for(int k=0; k<3;k++){
                        judge[k]=board[i+s][j+s];
                        s++;
                    }
                    int o=0;
                    for(String jud:judge){
                        if(jud=="●")o++;
                    }
                    if(o==3){
                        if((i-1)>=0&&(j-1)>=0&&(i+3)<boardSize&&(j+3)<boardSize &&board[i+3][j+3]!="●"&&board[i+3][j+3]!="○"&&board[i-1][j-1]!="●"&&board[i-1][j-1]!="○")
                        {if((i+4)<boardSize &&(j+4)<boardSize &&board[i+4][j+4]!="○")
                        {return (i+3)+" "+(j+3);}
                        else if((i-2)>=0&&(j-2)>=0&&board[i-2][j-2]!="○")
                        {return (i-1)+" "+(j-1);}
                        }
                    }
                }
                if((i-2)>0&&(j+2)<boardSize){
                    int s=0;
                    for(int k=0; k<3;k++){
                        judge[k]=board[i-s][j+s];
                        s++;
                    }
                    int o=0;
                    for(String jud:judge){
                        if(jud=="●")o++;
                    }
                    if(o==3){
                        if((i+1)<boardSize &&(j-1)>=0&&(i-3)>=0&&(j+3)<boardSize &&board[i-3][j+3]!="●"&&board[i-3][j+3]!="○"&&board[i+1][j-1]!="●"&&board[i+1][j-1]!="○")
                        {if((i-4)>=0&&(j+4)<boardSize &&board[i-4][j+4]!="○")
                        {return (i-3)+" "+(j+3);}
                        else if((i+2)<boardSize &&(j-2)>=0&&board[i+2][j-2]!="○")
                        {return (i+1)+" "+(j-1);}
                        }
                    }
                }
            }}
        return null;
    }
    /*
    *电脑攻击特殊两列一起考虑
    */
    public String basicComputerMustAttack22(String[][] newboard){
        board=newboard;
        String[] judge2 = new String[3];
        for(int i=0; i<boardSize; i++){
            for(int j=0; j<boardSize;j++){
                if(board[i][j]!="●"&&board[i][j]!="○"){
                    int line=0;
                    for(int n=1;n>0;n--){
                        if((j-1)>=0&&(j+3)<boardSize&&board[i][j-1]!="●"){
                            int s=0;
                            for(int k=0; k<3;k++){
                                judge2[k]=board[i][j+s+1];
                                s++;
                            }
                            int o=0;
                            for(String jud:judge2){
                                if(jud=="○")o++;
                            }
                            if(o>=2){
                                if((j+4)<boardSize&&board[i][j+1]!="●"&&board[i][j+2]!="●"&&board[i][j+3]!="●"&&board[i][j+4]!="●"){line++;break;}
                                else if ((j-2)>=0&&(j+3)<boardSize&&board[i][j+1]=="○"&&board[i][j+2]=="○"&&board[i][j-2]!="●"&&board[i][j+3]!="●"){line++;break;}

                            }
                        }
                        if((j-3)>=0&&(j+1)<boardSize&&board[i][j+1]!="●"){
                            int s=0;
                            for(int k=0; k<3;k++){
                                judge2[k]=board[i][j-s-1];
                                s++;
                            }
                            int o=0;
                            for(String jud:judge2){
                                if(jud=="○")o++;
                            }
                            if(o>=2){
                                if((j-4)>=0&&board[i][j-1]!="●"&&board[i][j-2]!="●"&&board[i][j-3]!="●"&&board[i][j-4]!="●"){line++;break;}
                                else if ((j+2)<boardSize&&(j-3)<boardSize&&board[i][j-1]=="○"&&board[i][j-2]=="○"&&board[i][j-3]!="●"&&board[i][j+2]!="●"){line++;break;}

                            }
                        }}
                    for(int n=1;n>0;n--){
                        if((i-1)>=0&&(i+3)<boardSize&&board[i-1][j]!="●"){
                            int s=0;
                            for(int k=0; k<3;k++){
                                judge2[k]=board[i+s+1][j];
                                s++;
                            }
                            int o=0;
                            for(String jud:judge2){
                                if(jud=="○")o++;
                            }
                            if(o>=2){
                                if((i+4)<boardSize&&board[i+1][j]!="●"&&board[i+2][j]!="●"&&board[i+3][j]!="●"&&board[i+4][j]!="●"){line++;break;}
                                else if ((i-2)>=0&&(i+3)<boardSize&&board[i+1][j]=="○"&&board[i+2][j]=="○"&&board[i-2][j]!="●"&&board[i+3][j]!="●"){line++;break;}

                            }
                        }
                        if((i-3)>=0&&(i+1)<boardSize&&board[i+1][j]!="●"){
                            int s=0;
                            for(int k=0; k<3;k++){
                                judge2[k]=board[i-s-1][j];
                                s++;
                            }
                            int o=0;
                            for(String jud:judge2){
                                if(jud=="○")o++;
                            }
                            if(o>=2){
                                if((i-4)>=0&&board[i-1][j]!="●"&&board[i-2][j]!="●"&&board[i-3][j]!="●"&&board[i-4][j]!="●"){line++;break;}
                                else if ((i+2)<boardSize&&(i-3)>=0&&board[i-1][j]=="○"&&board[i-2][j]=="○"&&board[i-3][j]!="●"&&board[i+2][j]!="●"){line++;break;}

                            }
                        }}
                    for(int n=1;n>0;n--){
                        if((i-1)>=0&&(j-1)>=0&&(i+3)<boardSize&&(j+3)<boardSize&&board[i-1][j-1]!="●"){
                            int s=0;
                            for(int k=0; k<3;k++){
                                judge2[k]=board[i+s+1][j+s+1];
                                s++;
                            }
                            int o=0;
                            for(String jud:judge2){
                                if(jud=="○")o++;
                            }
                            if(o>=2){
                                if((i+4)<boardSize&&(j+4)<boardSize&&board[i+1][j+1]!="●"&&board[i+2][j+2]!="●"&&board[i+3][j+3]!="●"&&board[i+4][j+4]!="●"){line++;break;}
                                else if ((i-2)>=0&&(j-2)>=0&&(i+3)<boardSize&&(j+3)<boardSize&&board[i+1][j+1]=="○"&&board[i+2][j+2]=="○"&&board[i-2][j-2]!="●"&&board[i+3][j+3]!="●"){line++;break;}

                            }
                        }
                        if((i+1)<boardSize&&(j+1)<boardSize&&(i-3)>=0&&(j-3)>=0&&board[i+1][j+1]!="●"){
                            int s=0;
                            for(int k=0; k<3;k++){
                                judge2[k]=board[i-s-1][j-s-1];
                                s++;
                            }
                            int o=0;
                            for(String jud:judge2){
                                if(jud=="○")o++;
                            }
                            if(o>=2){
                                if((i-4)>=0&&(j-4)>=0&&board[i-1][j-1]!="●"&&board[i-2][j-2]!="●"&&board[i-3][j-3]!="●"&&board[i-4][j-4]!="●"){line++;break;}
                                else if ((i+2)<boardSize&&(j+2)<boardSize&&(i-3)>=0&&(j-3)>=0&&board[i-1][j-1]=="○"&&board[i-2][j-2]=="○"&&board[i+2][j+2]!="●"&&board[i-3][j-3]!="●"){line++;break;}

                            }
                        }}
                    for(int n=1;n>0;n--){
                        if((i+1)<boardSize&&(j-1)>=0&&(i-3)>=0&&(j+3)<boardSize&&board[i+1][j-1]!="●"){
                            int s=0;
                            for(int k=0; k<3;k++){
                                judge2[k]=board[i-s-1][j+s+1];
                                s++;
                            }
                            int o=0;
                            for(String jud:judge2){
                                if(jud=="○")o++;
                            }
                            if(o>=2){
                                if((i-4)>=0&&(j+4)<boardSize&&board[i-1][j+1]!="●"&&board[i-2][j+2]!="●"&&board[i-3][j+3]!="●"&&board[i-4][j+4]!="●"){line++;break;}
                                else if ((i+2)<boardSize&&(j-2)>=0&&(i-3)>=0&&(j+3)<boardSize&&board[i-1][j+1]=="○"&&board[i-2][j+2]=="○"&&board[i+2][j-2]!="●"&&board[i-3][j+3]!="●"){line++;break;}

                            }
                        }
                        if((i-1)>=0&&(j+1)<boardSize&&(i+3)<boardSize&&(j-3)>=0&&board[i-1][j+1]!="●"){
                            int s=0;
                            for(int k=0; k<3;k++){
                                judge2[k]=board[i+s+1][j-s-1];
                                s++;
                            }
                            int o=0;
                            for(String jud:judge2){
                                if(jud=="○")o++;
                            }
                            if(o>=2){
                                if((i+4)<boardSize&&(j-4)>=0&&board[i+1][j-1]!="●"&&board[i+2][j-2]!="●"&&board[i+3][j-3]!="●"&&board[i+4][j-4]!="●"){line++;break;}
                                else if ((i-2)>=0&&(j+2)<boardSize&&(i+3)<boardSize&&(j-3)>=0&&board[i+1][j-1]=="○"&&board[i+2][j-2]=="○"&&board[i-2][j+2]!="●"&&board[i+3][j-3]!="●"){line++;break;}

                            }
                        }}
                    if(line>=2){return i+" "+j;}

                }}}
        return null;
    }
    /*
    *玩家攻击特殊两列一起考虑
    */
    public String basicPlayerMustAttack22(String[][] newboard){
        board=newboard;
        String[] judge2 = new String[3];
        for(int i=0; i<boardSize; i++){
            for(int j=0; j<boardSize;j++){
                if(board[i][j]!="●"&&board[i][j]!="○"){
                    int line=0;
                    for(int n=1;n>0;n--){
                        if((j-1)>=0&&(j+3)<boardSize&&board[i][j-1]!="○"){
                            int s=0;
                            for(int k=0; k<3;k++){
                                judge2[k]=board[i][j+s+1];
                                s++;
                            }
                            int o=0;
                            for(String jud:judge2){
                                if(jud=="●")o++;
                            }
                            if(o>=2){
                                if((j+4)<boardSize&&board[i][j+1]!="○"&&board[i][j+2]!="○"&&board[i][j+3]!="○"&&board[i][j+4]!="○"){line++;break;}
                                else if ((j-2)>=0&&(j+3)<boardSize&&board[i][j+1]=="●"&&board[i][j+2]=="●"&&board[i][j-2]!="○"&&board[i][j+3]!="○"){line++;break;}

                            }
                        }
                        if((j-3)>=0&&(j+1)<boardSize&&board[i][j+1]!="○"){
                            int s=0;
                            for(int k=0; k<3;k++){
                                judge2[k]=board[i][j-s-1];
                                s++;
                            }
                            int o=0;
                            for(String jud:judge2){
                                if(jud=="●")o++;
                            }
                            if(o>=2){
                                if((j-4)>=0&&board[i][j-1]!="○"&&board[i][j-2]!="○"&&board[i][j-3]!="○"&&board[i][j-4]!="○"){line++;break;}
                                else if ((j+2)<boardSize&&(j-3)<boardSize&&board[i][j-1]=="●"&&board[i][j-2]=="●"&&board[i][j-3]!="○"&&board[i][j+2]!="○"){line++;break;}

                            }
                        }}
                    for(int n=1;n>0;n--){
                        if((i-1)>=0&&(i+3)<boardSize&&board[i-1][j]!="○"){
                            int s=0;
                            for(int k=0; k<3;k++){
                                judge2[k]=board[i+s+1][j];
                                s++;
                            }
                            int o=0;
                            for(String jud:judge2){
                                if(jud=="●")o++;
                            }
                            if(o>=2){
                                if((i+4)<boardSize&&board[i+1][j]!="○"&&board[i+2][j]!="○"&&board[i+3][j]!="○"&&board[i+4][j]!="○"){line++;break;}
                                else if ((i-2)>=0&&(i+3)<boardSize&&board[i+1][j]=="●"&&board[i+2][j]=="●"&&board[i-2][j]!="○"&&board[i+3][j]!="○"){line++;break;}

                            }
                        }
                        if((i-3)>=0&&(i+1)<boardSize&&board[i+1][j]!="○"){
                            int s=0;
                            for(int k=0; k<3;k++){
                                judge2[k]=board[i-s-1][j];
                                s++;
                            }
                            int o=0;
                            for(String jud:judge2){
                                if(jud=="●")o++;
                            }
                            if(o>=2){
                                if((i-4)>=0&&board[i-1][j]!="○"&&board[i-2][j]!="○"&&board[i-3][j]!="○"&&board[i-4][j]!="○"){line++;break;}
                                else if ((i+2)<boardSize&&(i-3)>=0&&board[i-1][j]=="●"&&board[i-2][j]=="●"&&board[i-3][j]!="○"&&board[i+2][j]!="○"){line++;break;}

                            }
                        }}
                    for(int n=1;n>0;n--){
                        if((i-1)>=0&&(j-1)>=0&&(i+3)<boardSize&&(j+3)<boardSize&&board[i-1][j-1]!="○"){
                            int s=0;
                            for(int k=0; k<3;k++){
                                judge2[k]=board[i+s+1][j+s+1];
                                s++;
                            }
                            int o=0;
                            for(String jud:judge2){
                                if(jud=="●")o++;
                            }
                            if(o>=2){
                                if((i+4)<boardSize&&(j+4)<boardSize&&board[i+1][j+1]!="○"&&board[i+2][j+2]!="○"&&board[i+3][j+3]!="○"&&board[i+4][j+4]!="○"){line++;break;}
                                else if ((i-2)>=0&&(j-2)>=0&&(i+3)<boardSize&&(j+3)<boardSize&&board[i+1][j+1]=="●"&&board[i+2][j+2]=="●"&&board[i-2][j-2]!="○"&&board[i+3][j+3]!="○"){line++;break;}

                            }
                        }
                        if((i+1)<boardSize&&(j+1)<boardSize&&(i-3)>=0&&(j-3)>=0&&board[i+1][j+1]!="○"){
                            int s=0;
                            for(int k=0; k<3;k++){
                                judge2[k]=board[i-s-1][j-s-1];
                                s++;
                            }
                            int o=0;
                            for(String jud:judge2){
                                if(jud=="●")o++;
                            }
                            if(o>=2){
                                if((i-4)>=0&&(j-4)>=0&&board[i-1][j-1]!="○"&&board[i-2][j-2]!="○"&&board[i-3][j-3]!="○"&&board[i-4][j-4]!="○"){line++;break;}
                                else if ((i+2)<boardSize&&(j+2)<boardSize&&(i-3)>=0&&(j-3)>=0&&board[i-1][j-1]=="●"&&board[i-2][j-2]=="●"&&board[i+2][j+2]!="○"&&board[i-3][j-3]!="○"){line++;break;}

                            }
                        }}
                    for(int n=1;n>0;n--){
                        if((i+1)<boardSize&&(j-1)>=0&&(i-3)>=0&&(j+3)<boardSize&&board[i+1][j-1]!="○"){
                            int s=0;
                            for(int k=0; k<3;k++){
                                judge2[k]=board[i-s-1][j+s+1];
                                s++;
                            }
                            int o=0;
                            for(String jud:judge2){
                                if(jud=="●")o++;
                            }
                            if(o>=2){
                                if((i-4)>=0&&(j+4)<boardSize&&board[i-1][j+1]!="○"&&board[i-2][j+2]!="○"&&board[i-3][j+3]!="○"&&board[i-4][j+4]!="○"){line++;break;}
                                else if ((i+2)<boardSize&&(j-2)>=0&&(i-3)>=0&&(j+3)<boardSize&&board[i-1][j+1]=="●"&&board[i-2][j+2]=="●"&&board[i+2][j-2]!="○"&&board[i-3][j+3]!="○"){line++;break;}

                            }
                        }
                        if((i-1)>=0&&(j+1)<boardSize&&(i+3)<boardSize&&(j-3)>=0&&board[i-1][j+1]!="○"){
                            int s=0;
                            for(int k=0; k<3;k++){
                                judge2[k]=board[i+s+1][j-s-1];
                                s++;
                            }
                            int o=0;
                            for(String jud:judge2){
                                if(jud=="●")o++;
                            }
                            if(o>=2){
                                if((i+4)<boardSize&&(j-4)>=0&&board[i+1][j-1]!="○"&&board[i+2][j-2]!="○"&&board[i+3][j-3]!="○"&&board[i+4][j-4]!="○"){line++;break;}
                                else if ((i-2)>=0&&(j+2)<boardSize&&(i+3)<boardSize&&(j-3)>=0&&board[i+1][j-1]=="●"&&board[i+2][j-2]=="●"&&board[i-2][j+2]!="○"&&board[i+3][j-3]!="○"){line++;break;}

                            }
                        }}
                    if(line>=2){return i+" "+j;}

                }}}
        return null;
    }
    /*
    *电脑攻击独立两子随机下
    */
    public String basicComputerAttack32s23(String[][] newboard){
        board=newboard;
        String[] judge = new String[2];
        for(int i=0; i<boardSize; i++){
            for(int j=0; j<boardSize;j++){
                if((j+1)<boardSize){
                    int s=0;
                    for(int k=0; k<2;k++){
                        judge[k]=board[i][j+s];
                        s++;
                    }
                    int o=0;
                    for(String jud:judge){
                        if(jud=="○")o++;
                    }
                    if(o==2){
                        if((j-1)>=0&&(j+2)<boardSize&&board[i][j+2]!="●"&&board[i][j+2]!="○"&&board[i][j-1]!="●"&&board[i][j-1]!="○")
                        {if((j-2)>=0&&(j+3)<boardSize&&board[i][j+3]!="●"&&board[i][j-2]!="●"){
                            if((j-3)>=0&&(j+4)<boardSize&&board[i][j+4]!="●"&&board[i][j-3]!="●"){
                                int ran = (int)(Math.random()*2);
                                switch(ran){
                                    case 0:
                                        return i+" "+(j+2);
                                    case 1:
                                        return i+" "+(j-1);}}}
                        }
                    }
                }
                if((i+1)<boardSize){
                    int s=0;
                    for(int k=0; k<2;k++){
                        judge[k]=board[i+s][j];
                        s++;
                    }
                    int o=0;
                    for(String jud:judge){
                        if(jud=="○")o++;
                    }
                    if(o==2){
                        if((i-1)>=0&&(i+2)<boardSize&&board[i+2][j]!="●"&&board[i+2][j]!="○"&&board[i-1][j]!="●"&&board[i-1][j]!="○")
                        {if((i-2)>=0&&(i+3)<boardSize&&board[i+3][j]!="●"&&board[i-2][j]!="●"){
                            if((i-3)>=0&&(i+4)<boardSize&&board[i+4][j]!="●"&&board[i-3][j]!="●"){
                                int ran = (int)(Math.random()*2);
                                switch(ran){
                                    case 0:
                                        return (i+2)+" "+j;
                                    case 1:
                                        return (i-1)+" "+j;}}}
                        }
                    }
                }
                if((i+1)<boardSize&&(j+1)<boardSize){
                    int s=0;
                    for(int k=0; k<2;k++){
                        judge[k]=board[i+s][j+s];
                        s++;
                    }
                    int o=0;
                    for(String jud:judge){
                        if(jud=="○")o++;
                    }
                    if(o==2){
                        if((i-1)>=0&&(j-1)>=0&&(i+2)<boardSize&&(j+2)<boardSize&&board[i+2][j+2]!="●"&&board[i+2][j+2]!="○"&&board[i-1][j-1]!="●"&&board[i-1][j-1]!="○")
                        {if((i-2)>=0&&(j-2)>=0&&(i+3)<boardSize&&(j+3)<boardSize&&board[i+3][j+3]!="●"&&board[i-2][j-2]!="●"){
                            if((i-3)>=0&&(j-3)>=0&&(i+4)<boardSize&&(j+4)<boardSize&&board[i+4][j+4]!="●"&&board[i-3][j-3]!="●"){
                                int ran = (int)(Math.random()*2);
                                switch(ran){
                                    case 0:
                                        return (i+2)+" "+(j+2);
                                    case 1:
                                        return (i-1)+" "+(j-1);}}}
                        }
                    }
                }
                if((i-1)>0&&(j+1)<boardSize){
                    int s=0;
                    for(int k=0; k<2;k++){
                        judge[k]=board[i-s][j+s];
                        s++;
                    }
                    int o=0;
                    for(String jud:judge){
                        if(jud=="○")o++;
                    }
                    if(o==2){
                        if((i+1)<boardSize &&(j-1)>=0&&(i-2)>=0&&(j+2)<boardSize &&board[i-2][j+2]!="●"&&board[i-2][j+2]!="○"&&board[i+1][j-1]!="●"&&board[i+1][j-1]!="○")
                        {if((i+2)<boardSize &&(j-2)>=0&&(i-3)>=0&&(j+3)<boardSize &&board[i-3][j+3]!="●"&&board[i+2][j-2]!="●"){
                            if((i+3)<boardSize &&(j-3)>=0&&(i-4)>=0&&(j+4)<boardSize &&board[i-4][j+4]!="●"&&board[i+3][j-3]!="●"){
                                int ran = (int)(Math.random()*2);
                                switch(ran){
                                    case 0:
                                        return (i+1)+" "+(j-1);
                                    case 1:
                                        return (i-2)+" "+(j+2);}}}
                        }
                    }
                }
            }}
        return null;
    }
    /*
    *玩家进攻独立两子随机下
    */
    public String basicPlayerAttack32s23(String[][] newboard){
        board=newboard;
        String[] judge = new String[2];
        for(int i=0; i<boardSize; i++){
            for(int j=0; j<boardSize;j++){
                if((j+1)<boardSize){
                    int s=0;
                    for(int k=0; k<2;k++){
                        judge[k]=board[i][j+s];
                        s++;
                    }
                    int o=0;
                    for(String jud:judge){
                        if(jud=="●")o++;
                    }
                    if(o==2){
                        if((j-1)>=0&&(j+2)<boardSize&&board[i][j+2]!="●"&&board[i][j+2]!="○"&&board[i][j-1]!="●"&&board[i][j-1]!="○")
                        {if((j-2)>=0&&(j+3)<boardSize&&board[i][j+3]!="○"&&board[i][j-2]!="○"){
                            if((j-3)>=0&&(j+4)<boardSize&&board[i][j+4]!="○"&&board[i][j-3]!="○"){
                                int ran = (int)(Math.random()*2);
                                switch(ran){
                                    case 0:
                                        return i+" "+(j+2);
                                    case 1:
                                        return i+" "+(j-1);}}}
                        }
                    }
                }
                if((i+1)<boardSize){
                    int s=0;
                    for(int k=0; k<2;k++){
                        judge[k]=board[i+s][j];
                        s++;
                    }
                    int o=0;
                    for(String jud:judge){
                        if(jud=="●")o++;
                    }
                    if(o==2){
                        if((i-1)>=0&&(i+2)<boardSize&&board[i+2][j]!="●"&&board[i+2][j]!="○"&&board[i-1][j]!="●"&&board[i-1][j]!="○")
                        {if((i-2)>=0&&(i+3)<boardSize&&board[i+3][j]!="○"&&board[i-2][j]!="○"){
                            if((i-3)>=0&&(i+4)<boardSize&&board[i+4][j]!="○"&&board[i-3][j]!="○"){
                                int ran = (int)(Math.random()*2);
                                switch(ran){
                                    case 0:
                                        return (i+2)+" "+j;
                                    case 1:
                                        return (i-1)+" "+j;}}}
                        }
                    }
                }
                if((i+1)<boardSize&&(j+1)<boardSize){
                    int s=0;
                    for(int k=0; k<2;k++){
                        judge[k]=board[i+s][j+s];
                        s++;
                    }
                    int o=0;
                    for(String jud:judge){
                        if(jud=="●")o++;
                    }
                    if(o==2){
                        if((i-1)>=0&&(j-1)>=0&&(i+2)<boardSize&&(j+2)<boardSize&&board[i+2][j+2]!="●"&&board[i+2][j+2]!="○"&&board[i-1][j-1]!="●"&&board[i-1][j-1]!="○")
                        {if((i-2)>=0&&(j-2)>=0&&(i+3)<boardSize&&(j+3)<boardSize&&board[i+3][j+3]!="○"&&board[i-2][j-2]!="○"){
                            if((i-3)>=0&&(j-3)>=0&&(i+4)<boardSize&&(j+4)<boardSize&&board[i+4][j+4]!="○"&&board[i-3][j-3]!="○"){
                                int ran = (int)(Math.random()*2);
                                switch(ran){
                                    case 0:
                                        return (i+2)+" "+(j+2);
                                    case 1:
                                        return (i-1)+" "+(j-1);}}}
                        }
                    }
                }
                if((i-1)>0&&(j+1)<boardSize){
                    int s=0;
                    for(int k=0; k<2;k++){
                        judge[k]=board[i-s][j+s];
                        s++;
                    }
                    int o=0;
                    for(String jud:judge){
                        if(jud=="●")o++;
                    }
                    if(o==2){
                        if((i+1)<boardSize &&(j-1)>=0&&(i-2)>=0&&(j+2)<boardSize &&board[i-2][j+2]!="●"&&board[i-2][j+2]!="○"&&board[i+1][j-1]!="●"&&board[i+1][j-1]!="○")
                        {if((i+2)<boardSize &&(j-2)>=0&&(i-3)>=0&&(j+3)<boardSize &&board[i-3][j+3]!="○"&&board[i+2][j-2]!="○"){
                            if((i+3)<boardSize &&(j-3)>=0&&(i-4)>=0&&(j+4)<boardSize &&board[i-4][j+4]!="○"&&board[i+3][j-3]!="○"){
                                int ran = (int)(Math.random()*2);
                                switch(ran){
                                    case 0:
                                        return (i+1)+" "+(j-1);
                                    case 1:
                                        return (i-2)+" "+(j+2);}}}
                        }
                    }
                }
            }}
        return null;
    }
    /*
    *电脑攻击独立两子
    */
    public String basicComputerAttack22s23(String[][] newboard){
        board=newboard;
        String[] judge = new String[2];
        for(int i=0; i<boardSize; i++){
            for(int j=0; j<boardSize;j++){
                if((j+1)<boardSize){
                    int s=0;
                    for(int k=0; k<2;k++){
                        judge[k]=board[i][j+s];
                        s++;
                    }
                    int o=0;
                    for(String jud:judge){
                        if(jud=="○")o++;
                    }
                    if(o==2){
                        if((j-1)>=0&&(j+2)<boardSize&&board[i][j+2]!="●"&&board[i][j+2]!="○"&&board[i][j-1]!="●"&&board[i][j-1]!="○")
                        {if((j-2)>=0&&(j+3)<boardSize&&board[i][j+3]!="●"&&board[i][j-2]!="●"){
                            if((j+4)<boardSize&&board[i][j+4]!="●"){
                                return i+" "+(j+2);}
                            if((j-3)>=0&&board[i][j-3]!="●"){
                                return i+" "+(j-1);}}
                        }
                    }
                }
                if((i+1)<boardSize){
                    int s=0;
                    for(int k=0; k<2;k++){
                        judge[k]=board[i+s][j];
                        s++;
                    }
                    int o=0;
                    for(String jud:judge){
                        if(jud=="○")o++;
                    }
                    if(o==2){
                        if((i-1)>=0&&(i+2)<boardSize&&board[i+2][j]!="●"&&board[i+2][j]!="○"&&board[i-1][j]!="●"&&board[i-1][j]!="○")
                        {if((i-2)>=0&&(i+3)<boardSize&&board[i+3][j]!="●"&&board[i-2][j]!="●"){
                            if((i+4)<boardSize&&board[i+4][j]!="●"){
                                return (i+2)+" "+j;}
                            if((i-3)>=0&&board[i-3][j]!="●"){
                                return (i-1)+" "+j;}}
                        }
                    }
                }
                if((i+1)<boardSize&&(j+1)<boardSize){
                    int s=0;
                    for(int k=0; k<2;k++){
                        judge[k]=board[i+s][j+s];
                        s++;
                    }
                    int o=0;
                    for(String jud:judge){
                        if(jud=="○")o++;
                    }
                    if(o==2){
                        if((i-1)>=0&&(j-1)>=0&&(i+2)<boardSize &&(j+2)<boardSize&&board[i+2][j+2]!="●"&&board[i+2][j+2]!="○"&&board[i-1][j-1]!="●"&&board[i-1][j-1]!="○")
                        {if((i-2)>=0&&(j-2)>=0&&(i+3)<boardSize&&(j+3)<boardSize &&board[i+3][j+3]!="●"&&board[i-2][j-2]!="●"){
                            if((i+4)<boardSize &&(j+4)<boardSize&&board[i+4][j+4]!="●"){
                                return (i+2)+" "+(j+2);}
                            if((i-3)>=0&&(j-3)>=0&&board[i-3][j-3]!="●"){
                                return (i-1)+" "+(j-1);}}
                        }
                    }
                }
                if((i-1)>0&&(j+1)<boardSize){
                    int s=0;
                    for(int k=0; k<2;k++){
                        judge[k]=board[i-s][j+s];
                        s++;
                    }
                    int o=0;
                    for(String jud:judge){
                        if(jud=="○")o++;
                    }
                    if(o==2){
                        if((i+1)<boardSize &&(j-1)>=0&&(i-2)>=0&&(j+2)<boardSize &&board[i-2][j+2]!="●"&&board[i-2][j+2]!="○"&&board[i+1][j-1]!="●"&&board[i+1][j-1]!="○")
                        {if((i+2)<boardSize &&(j-2)>=0&&(i-3)>=0&&(j+3)<boardSize &&board[i-3][j+3]!="●"&&board[i+2][j-2]!="●"){
                            if((i+3)<boardSize &&(j-3)>=0&&board[i+3][j-3]!="●"){
                                return (i+1)+" "+(j-1);}
                            if((i-4)>=0&&(j+4)<boardSize &&board[i-4][j+4]!="●"){
                                return (i-2)+" "+(j+2);}}
                        }
                    }
                }
            }}
        return null;
    }
    /*
    *玩家攻击独立两子
    */
    public String basicPlayerAttack22s23(String[][] newboard){
        board=newboard;
        String[] judge = new String[2];
        for(int i=0; i<boardSize; i++){
            for(int j=0; j<boardSize;j++){
                if((j+1)<boardSize){
                    int s=0;
                    for(int k=0; k<2;k++){
                        judge[k]=board[i][j+s];
                        s++;
                    }
                    int o=0;
                    for(String jud:judge){
                        if(jud=="●")o++;
                    }
                    if(o==2){
                        if((j-1)>=0&&(j+2)<boardSize&&board[i][j+2]!="●"&&board[i][j+2]!="○"&&board[i][j-1]!="●"&&board[i][j-1]!="○")
                        {if((j-2)>=0&&(j+3)<boardSize&&board[i][j+3]!="○"&&board[i][j-2]!="○"){
                            if((j+4)<boardSize&&board[i][j+4]!="○"){
                                return i+" "+(j+2);}
                            if((j-3)>=0&&board[i][j-3]!="○"){
                                return i+" "+(j-1);}}
                        }
                    }
                }
                if((i+1)<boardSize){
                    int s=0;
                    for(int k=0; k<2;k++){
                        judge[k]=board[i+s][j];
                        s++;
                    }
                    int o=0;
                    for(String jud:judge){
                        if(jud=="●")o++;
                    }
                    if(o==2){
                        if((i-1)>=0&&(i+2)<boardSize&&board[i+2][j]!="●"&&board[i+2][j]!="○"&&board[i-1][j]!="●"&&board[i-1][j]!="○")
                        {if((i-2)>=0&&(i+3)<boardSize&&board[i+3][j]!="○"&&board[i-2][j]!="○"){
                            if((i+4)<boardSize&&board[i+4][j]!="○"){
                                return (i+2)+" "+j;}
                            if((i-3)>=0&&board[i-3][j]!="○"){
                                return (i-1)+" "+j;}}
                        }
                    }
                }
                if((i+1)<boardSize&&(j+1)<boardSize){
                    int s=0;
                    for(int k=0; k<2;k++){
                        judge[k]=board[i+s][j+s];
                        s++;
                    }
                    int o=0;
                    for(String jud:judge){
                        if(jud=="●")o++;
                    }
                    if(o==2){
                        if((i-1)>=0&&(j-1)>=0&&(i+2)<boardSize &&(j+2)<boardSize&&board[i+2][j+2]!="●"&&board[i+2][j+2]!="○"&&board[i-1][j-1]!="●"&&board[i-1][j-1]!="○")
                        {if((i-2)>=0&&(j-2)>=0&&(i+3)<boardSize&&(j+3)<boardSize &&board[i+3][j+3]!="○"&&board[i-2][j-2]!="○"){
                            if((i+4)<boardSize &&(j+4)<boardSize&&board[i+4][j+4]!="○"){
                                return (i+2)+" "+(j+2);}
                            if((i-3)>=0&&(j-3)>=0&&board[i-3][j-3]!="○"){
                                return (i-1)+" "+(j-1);}}
                        }
                    }
                }
                if((i-1)>0&&(j+1)<boardSize){
                    int s=0;
                    for(int k=0; k<2;k++){
                        judge[k]=board[i-s][j+s];
                        s++;
                    }
                    int o=0;
                    for(String jud:judge){
                        if(jud=="●")o++;
                    }
                    if(o==2){
                        if((i+1)<boardSize &&(j-1)>=0&&(i-2)>=0&&(j+2)<boardSize &&board[i-2][j+2]!="●"&&board[i-2][j+2]!="○"&&board[i+1][j-1]!="●"&&board[i+1][j-1]!="○")
                        {if((i+2)<boardSize &&(j-2)>=0&&(i-3)>=0&&(j+3)<boardSize &&board[i-3][j+3]!="○"&&board[i+2][j-2]!="○"){
                            if((i+3)<boardSize &&(j-3)>=0&&board[i+3][j-3]!="○"){
                                return (i+1)+" "+(j-1);}
                            if((i-4)>=0&&(j+4)<boardSize &&board[i-4][j+4]!="○"){
                                return (i-2)+" "+(j+2);}}
                        }
                    }
                }
            }}
        return null;
    }
    /*
    *电脑攻击独立两子一头空一个
    */
    public String basicComputerAttack12s23(String[][] newboard){
        board=newboard;
        String[] judge = new String[2];
        for(int i=0; i<boardSize; i++){
            for(int j=0; j<boardSize;j++){
                if((j+1)<boardSize){
                    int s=0;
                    for(int k=0; k<2;k++){
                        judge[k]=board[i][j+s];
                        s++;
                    }
                    int o=0;
                    for(String jud:judge){
                        if(jud=="○")o++;
                    }
                    if(o==2){
                        if((j-1)>=0&&(j+2)<boardSize&&board[i][j+2]!="●"&&board[i][j+2]!="○"&&board[i][j-1]!="●"&&board[i][j-1]!="○")
                        {if((j+3)<boardSize&&(j+4)<boardSize&&board[i][j+3]!="●"&&board[i][j+4]!="●"){
                            return i+" "+(j+2);}
                            if((j-2)>=0&&(j-3)>=0&&board[i][j-2]!="●"&&board[i][j-3]!="●"){
                                return i+" "+(j-1);}
                        }
                    }
                }
                if((i+1)<boardSize){
                    int s=0;
                    for(int k=0; k<2;k++){
                        judge[k]=board[i+s][j];
                        s++;
                    }
                    int o=0;
                    for(String jud:judge){
                        if(jud=="○")o++;
                    }
                    if(o==2){
                        if((i-1)>=0&&(i+2)<boardSize&&board[i+2][j]!="●"&&board[i+2][j]!="○"&&board[i-1][j]!="●"&&board[i-1][j]!="○")
                        {if((i+3)<boardSize&&(i+4)<boardSize&&board[i+3][j]!="●"&&board[i+4][j]!="●"){
                            return (i+2)+" "+j;}
                            if((i-2)>=0&&(i-3)>=0&&board[i-2][j]!="●"&&board[i-3][j]!="●"){
                                return (i-1)+" "+j;}
                        }
                    }
                }
                if((i+1)<boardSize&&(j+1)<boardSize){
                    int s=0;
                    for(int k=0; k<2;k++){
                        judge[k]=board[i+s][j+s];
                        s++;
                    }
                    int o=0;
                    for(String jud:judge){
                        if(jud=="○")o++;
                    }
                    if(o==2){
                        if((i-1)>=0&&(j-1)>=0&&(i+2)<boardSize &&(j+2)<boardSize&&board[i+2][j+2]!="●"&&board[i+2][j+2]!="○"&&board[i-1][j-1]!="●"&&board[i-1][j-1]!="○")
                        {if((i+4)<boardSize &&(j+4)<boardSize&&board[i+3][j+3]!="●"&&board[i+4][j+4]!="●"){
                            return (i+2)+" "+(j+2);}
                            if((i-3)>=0&&(j-3)>=0&&board[i-2][j-2]!="●"&&board[i-3][j-3]!="●"){
                                return (i-1)+" "+(j-1);}
                        }
                    }
                }
                if((i-1)>0&&(j+1)<boardSize){
                    int s=0;
                    for(int k=0; k<2;k++){
                        judge[k]=board[i-s][j+s];
                        s++;
                    }
                    int o=0;
                    for(String jud:judge){
                        if(jud=="○")o++;
                    }
                    if(o==2){
                        if((i+1)<boardSize &&(j-1)>=0&&(i-2)>=0&&(j+2)<boardSize &&board[i-2][j+2]!="●"&&board[i-2][j+2]!="○"&&board[i+1][j-1]!="●"&&board[i+1][j-1]!="○")
                        {if((i+3)<boardSize&&(j-3)>=0&&board[i+2][j-2]!="●"&&board[i+3][j-3]!="●"){
                            return (i+1)+" "+(j-1);}
                            if((i-4)>=0&&(j+4)<boardSize&&board[i-3][j+3]!="●"&&board[i-4][j+4]!="●"){
                                return (i-2)+" "+(j+2);}
                        }
                    }
                }
            }}
        return null;
    }
    /*
    *玩家攻击独立两子一头空一个
    */
    public String basicPlayerAttack12s23(String[][] newboard){
        board=newboard;
        String[] judge = new String[2];
        for(int i=0; i<boardSize; i++){
            for(int j=0; j<boardSize;j++){
                if((j+1)<boardSize){
                    int s=0;
                    for(int k=0; k<2;k++){
                        judge[k]=board[i][j+s];
                        s++;
                    }
                    int o=0;
                    for(String jud:judge){
                        if(jud=="●")o++;
                    }
                    if(o==2){
                        if((j-1)>=0&&(j+2)<boardSize&&board[i][j+2]!="●"&&board[i][j+2]!="○"&&board[i][j-1]!="●"&&board[i][j-1]!="○")
                        {if((j+3)<boardSize&&(j+4)<boardSize&&board[i][j+3]!="○"&&board[i][j+4]!="○"){
                            return i+" "+(j+2);}
                            if((j-2)>=0&&(j-3)>=0&&board[i][j-2]!="○"&&board[i][j-3]!="○"){
                                return i+" "+(j-1);}
                        }
                    }
                }
                if((i+1)<boardSize){
                    int s=0;
                    for(int k=0; k<2;k++){
                        judge[k]=board[i+s][j];
                        s++;
                    }
                    int o=0;
                    for(String jud:judge){
                        if(jud=="●")o++;
                    }
                    if(o==2){
                        if((i-1)>=0&&(i+2)<boardSize&&board[i+2][j]!="●"&&board[i+2][j]!="○"&&board[i-1][j]!="●"&&board[i-1][j]!="○")
                        {if((i+3)<boardSize&&(i+4)<boardSize&&board[i+3][j]!="○"&&board[i+4][j]!="○"){
                            return (i+2)+" "+j;}
                            if((i-2)>=0&&(i-3)>=0&&board[i-2][j]!="○"&&board[i-3][j]!="○"){
                                return (i-1)+" "+j;}
                        }
                    }
                }
                if((i+1)<boardSize&&(j+1)<boardSize){
                    int s=0;
                    for(int k=0; k<2;k++){
                        judge[k]=board[i+s][j+s];
                        s++;
                    }
                    int o=0;
                    for(String jud:judge){
                        if(jud=="●")o++;
                    }
                    if(o==2){
                        if((i-1)>=0&&(j-1)>=0&&(i+2)<boardSize &&(j+2)<boardSize&&board[i+2][j+2]!="●"&&board[i+2][j+2]!="○"&&board[i-1][j-1]!="●"&&board[i-1][j-1]!="○")
                        {if((i+4)<boardSize &&(j+4)<boardSize&&board[i+3][j+3]!="○"&&board[i+4][j+4]!="○"){
                            return (i+2)+" "+(j+2);}
                            if((i-3)>=0&&(j-3)>=0&&board[i-2][j-2]!="○"&&board[i-3][j-3]!="○"){
                                return (i-1)+" "+(j-1);}
                        }
                    }
                }
                if((i-1)>0&&(j+1)<boardSize){
                    int s=0;
                    for(int k=0; k<2;k++){
                        judge[k]=board[i-s][j+s];
                        s++;
                    }
                    int o=0;
                    for(String jud:judge){
                        if(jud=="●")o++;
                    }
                    if(o==2){
                        if((i+1)<boardSize &&(j-1)>=0&&(i-2)>=0&&(j+2)<boardSize &&board[i-2][j+2]!="●"&&board[i-2][j+2]!="○"&&board[i+1][j-1]!="●"&&board[i+1][j-1]!="○")
                        {if((i+3)<boardSize&&(j-3)>=0&&board[i+2][j-2]!="○"&&board[i+3][j-3]!="○"){
                            return (i+1)+" "+(j-1);}
                            if((i-4)>=0&&(j+4)<boardSize&&board[i-3][j+3]!="○"&&board[i-4][j+4]!="○"){
                                return (i-2)+" "+(j+2);}
                        }
                    }
                }
            }}
        return null;
    }
    /*
    *电脑攻击四子中间隔两个
    */
    public String basicComputerAttack4s2(String[][] newboard){
        board=newboard;
        String[] judge = new String[4];
        for(int i=0; i<boardSize; i++){
            for(int j=0; j<boardSize;j++){
                if((j+3)<boardSize){
                    int s=0;
                    for(int k=0; k<4;k++){
                        judge[k]=board[i][j+s];
                        s++;
                    }
                    int o=0;
                    for(String jud:judge){
                        if(jud=="○")o++;
                    }
                    if(o==2){
                        if((j+4)<boardSize&&(j-1)>=0&&board[i][j-1]!="●"&&board[i][j+4]!="●"&&board[i][j+1]!="●"&&board[i][j+2]!="●")
                        {if(board[i][j]=="○"&&board[i][j+3]=="○"){
                            int ran = (int)(Math.random()*2);
                            switch(ran){
                                case 0:
                                    return i+" "+(j+1);
                                case 1:
                                    return i+" "+(j+2);}}}
                    }
                }
                if((i+3)<boardSize){
                    int s=0;
                    for(int k=0; k<4;k++){
                        judge[k]=board[i+s][j];
                        s++;
                    }
                    int o=0;
                    for(String jud:judge){
                        if(jud=="○")o++;
                    }
                    if(o==2){
                        if((i-1)>=0&&(i+4)<boardSize&&board[i-1][j]!="●"&&board[i+4][j]!="●"&&board[i+1][j]!="●"&&board[i+2][j]!="●")
                        {if(board[i][j]=="○"&&board[i+3][j]=="○"){
                            int ran = (int)(Math.random()*2);
                            switch(ran){
                                case 0:
                                    return (i+1)+" "+j;
                                case 1:
                                    return (i+2)+" "+j;}}}
                    }
                }
                if((i+3)<boardSize&&(j+3)<boardSize){
                    int s=0;
                    for(int k=0; k<4;k++){
                        judge[k]=board[i+s][j+s];
                        s++;
                    }
                    int o=0;
                    for(String jud:judge){
                        if(jud=="○")o++;
                    }
                    if(o==2){
                        if((i+4)<boardSize &&(j+4)<boardSize&&(i-1)>=0&&(j-1)>=0&&board[i+4][j+4]!="●"&&board[i-1][j-1]!="●"&&board[i+1][j+1]!="●"&&board[i+2][j+2]!="●")
                        {if(board[i][j]=="○"&&board[i+3][j+3]=="○"){
                            int ran = (int)(Math.random()*2);
                            switch(ran){
                                case 0:
                                    return (i+1)+" "+(j+1);
                                case 1:
                                    return (i+2)+" "+(j+2);}}}
                    }
                }
                if((i-3)>0&&(j+3)<boardSize){
                    int s=0;
                    for(int k=0; k<4;k++){
                        judge[k]=board[i-s][j+s];
                        s++;
                    }
                    int o=0;
                    for(String jud:judge){
                        if(jud=="○")o++;
                    }
                    if(o==2){
                        if((i+1)<boardSize&&(j-1)>=0&&(i-4)>=0&&(j+4)<boardSize&&board[i+1][j-1]!="●"&&board[i-4][j+4]!="●"&&board[i-1][j+1]!="●"&&board[i-2][j+2]!="●")
                        {if(board[i][j]=="○"&&board[i-3][j+3]=="○"){
                            int ran = (int)(Math.random()*2);
                            switch(ran){
                                case 0:
                                    return (i-1)+" "+(j+1);
                                case 1:
                                    return (i-2)+" "+(j+2);}}}
                    }
                }
            }}
        return null;
    }
    /*
    *玩家攻击四子中间隔两个
    */
    public String basicPlayerAttack4s2(String[][] newboard){
        board=newboard;
        String[] judge = new String[4];
        for(int i=0; i<boardSize; i++){
            for(int j=0; j<boardSize;j++){
                if((j+3)<boardSize){
                    int s=0;
                    for(int k=0; k<4;k++){
                        judge[k]=board[i][j+s];
                        s++;
                    }
                    int o=0;
                    for(String jud:judge){
                        if(jud=="●")o++;
                    }
                    if(o==2){
                        if((j+4)<boardSize&&(j-1)>=0&&board[i][j-1]!="○"&&board[i][j+4]!="○"&&board[i][j+1]!="○"&&board[i][j+2]!="○")
                        {if(board[i][j]=="●"&&board[i][j+3]=="●"){
                            int ran = (int)(Math.random()*2);
                            switch(ran){
                                case 0:
                                    return i+" "+(j+1);
                                case 1:
                                    return i+" "+(j+2);}}}
                    }
                }
                if((i+3)<boardSize){
                    int s=0;
                    for(int k=0; k<4;k++){
                        judge[k]=board[i+s][j];
                        s++;
                    }
                    int o=0;
                    for(String jud:judge){
                        if(jud=="●")o++;
                    }
                    if(o==2){
                        if((i-1)>=0&&(i+4)<boardSize&&board[i-1][j]!="○"&&board[i+4][j]!="○"&&board[i+1][j]!="○"&&board[i+2][j]!="○")
                        {if(board[i][j]=="●"&&board[i+3][j]=="●"){
                            int ran = (int)(Math.random()*2);
                            switch(ran){
                                case 0:
                                    return (i+1)+" "+j;
                                case 1:
                                    return (i+2)+" "+j;}}}
                    }
                }
                if((i+3)<boardSize&&(j+3)<boardSize){
                    int s=0;
                    for(int k=0; k<4;k++){
                        judge[k]=board[i+s][j+s];
                        s++;
                    }
                    int o=0;
                    for(String jud:judge){
                        if(jud=="●")o++;
                    }
                    if(o==2){
                        if((i+4)<boardSize &&(j+4)<boardSize&&(i-1)>=0&&(j-1)>=0&&board[i+4][j+4]!="○"&&board[i-1][j-1]!="○"&&board[i+1][j+1]!="○"&&board[i+2][j+2]!="○")
                        {if(board[i][j]=="●"&&board[i+3][j+3]=="●"){
                            int ran = (int)(Math.random()*2);
                            switch(ran){
                                case 0:
                                    return (i+1)+" "+(j+1);
                                case 1:
                                    return (i+2)+" "+(j+2);}}}
                    }
                }
                if((i-3)>0&&(j+3)<boardSize){
                    int s=0;
                    for(int k=0; k<4;k++){
                        judge[k]=board[i-s][j+s];
                        s++;
                    }
                    int o=0;
                    for(String jud:judge){
                        if(jud=="●")o++;
                    }
                    if(o==2){
                        if((i+1)<boardSize&&(j-1)>=0&&(i-4)>=0&&(j+4)<boardSize&&board[i+1][j-1]!="○"&&board[i-4][j+4]!="○"&&board[i-1][j+1]!="○"&&board[i-2][j+2]!="○")
                        {if(board[i][j]=="●"&&board[i-3][j+3]=="●"){
                            int ran = (int)(Math.random()*2);
                            switch(ran){
                                case 0:
                                    return (i-1)+" "+(j+1);
                                case 1:
                                    return (i-2)+" "+(j+2);}}}
                    }
                }
            }}
        return null;
    }
    /*
    *电脑攻击三缺一
    */
    public String basicComputerAttack3s2(String[][] newboard){
        board=newboard;
        String[] judge = new String[3];
        for(int i=0; i<boardSize; i++){
            for(int j=0; j<boardSize;j++){
                if((j+2)<boardSize&&board[i][j+1]!="●"&&board[i][j+1]!="○"){
                    int s=0;
                    for(int k=0; k<3;k++){
                        judge[k]=board[i][j+s];
                        s++;
                    }
                    int o=0;
                    for(String jud:judge){
                        if(jud=="○")o++;
                    }
                    if(o==2){
                        if((j-1)>=0&&(j+3)<boardSize&&board[i][j+3]!="●"&&board[i][j+3]!="○"&&board[i][j-1]!="●"&&board[i][j-1]!="○")
                        {if((j+4)<boardSize&&board[i][j+4]!="●")
                        {return i+" "+(j+1);}
                        else if((j-2)>=0&&board[i][j-2]!="●"){return i+" "+(j+1);}
                        }
                    }
                }
                if((i+2)<boardSize&&board[i+1][j]!="●"&&board[i+1][j]!="○"){
                    int s=0;
                    for(int k=0; k<3;k++){
                        judge[k]=board[i+s][j];
                        s++;
                    }
                    int o=0;
                    for(String jud:judge){
                        if(jud=="○")o++;
                    }
                    if(o==2){
                        if((i-1)>=0&&(i+3)<boardSize&&board[i+3][j]!="●"&&board[i+3][j]!="○"&&board[i-1][j]!="●"&&board[i-1][j]!="○")
                        {if((i+4)<boardSize&&board[i+4][j]!="●")
                        {return (i+1)+" "+j;}
                        else if((i-2)>=0&&board[i-2][j]!="●")
                        {return (i+1)+" "+j;}
                        }
                    }
                }
                if((i+2)<boardSize&&(j+2)<boardSize&&board[i+1][j+1]!="●"&&board[i+1][j+1]!="○"){
                    int s=0;
                    for(int k=0; k<3;k++){
                        judge[k]=board[i+s][j+s];
                        s++;
                    }
                    int o=0;
                    for(String jud:judge){
                        if(jud=="○")o++;
                    }
                    if(o==2){
                        if((i-1)>=0&&(j-1)>=0&&(i+3)<boardSize &&(j+3)<boardSize &&board[i+3][j+3]!="●"&&board[i+3][j+3]!="○"&&board[i-1][j-1]!="●"&&board[i-1][j-1]!="○")
                        {if((i+4)<boardSize &&(j+4)<boardSize &&board[i+4][j+4]!="●")
                        {return (i+1)+" "+(j+1);}
                        else if((i-2)>=0&&(j-2)>=0&&board[i-2][j-2]!="●")
                        {return (i+1)+" "+(j+1);}
                        }
                    }
                }
                if((i-2)>0&&(j+2)<boardSize&&board[i-1][j+1]!="●"&&board[i-1][j+1]!="○"){
                    int s=0;
                    for(int k=0; k<3;k++){
                        judge[k]=board[i-s][j+s];
                        s++;
                    }
                    int o=0;
                    for(String jud:judge){
                        if(jud=="○")o++;
                    }
                    if(o==2){
                        if((i+1)<boardSize &&(j-1)>=0&&(i-3)>=0&&(j+3)<boardSize &&board[i-3][j+3]!="●"&&board[i-3][j+3]!="○"&&board[i+1][j-1]!="●"&&board[i+1][j-1]!="○")
                        {if((i-4)>=0&&(j+4)<boardSize &&board[i-4][j+4]!="●")
                        {return (i-1)+" "+(j+1);}
                        else if((i+2)<boardSize &&(j-2)>=0&&board[i+2][j-2]!="●")
                        {return (i-1)+" "+(j+1);}
                        }
                    }
                }
            }}
        return null;
    }
    /*
    *玩家攻击三缺一
    */
    public String basicPlayerAttack3s2(String[][] newboard){
        board=newboard;
        String[] judge = new String[3];
        for(int i=0; i<boardSize; i++){
            for(int j=0; j<boardSize;j++){
                if((j+2)<boardSize&&board[i][j+1]!="●"&&board[i][j+1]!="○"){
                    int s=0;
                    for(int k=0; k<3;k++){
                        judge[k]=board[i][j+s];
                        s++;
                    }
                    int o=0;
                    for(String jud:judge){
                        if(jud=="●")o++;
                    }
                    if(o==2){
                        if((j-1)>=0&&(j+3)<boardSize&&board[i][j+3]!="●"&&board[i][j+3]!="○"&&board[i][j-1]!="●"&&board[i][j-1]!="○")
                        {if((j+4)<boardSize&&board[i][j+4]!="○")
                        {return i+" "+(j+1);}
                        else if((j-2)>=0&&board[i][j-2]!="○"){return i+" "+(j+1);}
                        }
                    }
                }
                if((i+2)<boardSize&&board[i+1][j]!="●"&&board[i+1][j]!="○"){
                    int s=0;
                    for(int k=0; k<3;k++){
                        judge[k]=board[i+s][j];
                        s++;
                    }
                    int o=0;
                    for(String jud:judge){
                        if(jud=="●")o++;
                    }
                    if(o==2){
                        if((i-1)>=0&&(i+3)<boardSize&&board[i+3][j]!="●"&&board[i+3][j]!="○"&&board[i-1][j]!="●"&&board[i-1][j]!="○")
                        {if((i+4)<boardSize&&board[i+4][j]!="○")
                        {return (i+1)+" "+j;}
                        else if((i-2)>=0&&board[i-2][j]!="○")
                        {return (i+1)+" "+j;}
                        }
                    }
                }
                if((i+2)<boardSize&&(j+2)<boardSize&&board[i+1][j+1]!="●"&&board[i+1][j+1]!="○"){
                    int s=0;
                    for(int k=0; k<3;k++){
                        judge[k]=board[i+s][j+s];
                        s++;
                    }
                    int o=0;
                    for(String jud:judge){
                        if(jud=="●")o++;
                    }
                    if(o==2){
                        if((i-1)>=0&&(j-1)>=0&&(i+3)<boardSize &&(j+3)<boardSize &&board[i+3][j+3]!="●"&&board[i+3][j+3]!="○"&&board[i-1][j-1]!="●"&&board[i-1][j-1]!="○")
                        {if((i+4)<boardSize &&(j+4)<boardSize &&board[i+4][j+4]!="○")
                        {return (i+1)+" "+(j+1);}
                        else if((i-2)>=0&&(j-2)>=0&&board[i-2][j-2]!="○")
                        {return (i+1)+" "+(j+1);}
                        }
                    }
                }
                if((i-2)>0&&(j+2)<boardSize&&board[i-1][j+1]!="●"&&board[i-1][j+1]!="○"){
                    int s=0;
                    for(int k=0; k<3;k++){
                        judge[k]=board[i-s][j+s];
                        s++;
                    }
                    int o=0;
                    for(String jud:judge){
                        if(jud=="●")o++;
                    }
                    if(o==2){
                        if((i+1)<boardSize &&(j-1)>=0&&(i-3)>=0&&(j+3)<boardSize &&board[i-3][j+3]!="●"&&board[i-3][j+3]!="○"&&board[i+1][j-1]!="●"&&board[i+1][j-1]!="○")
                        {if((i-4)>=0&&(j+4)<boardSize &&board[i-4][j+4]!="○")
                        {return (i-1)+" "+(j+1);}
                        else if((i+2)<boardSize &&(j-2)>=0&&board[i+2][j-2]!="○")
                        {return (i-1)+" "+(j+1);}
                        }
                    }
                }
            }}
        return null;
    }
    /*
    *电脑攻击延伸三个成四个
    */
    public String basicComputerAttack03s32(String[][] newboard){
        board=newboard;
        String[] judge = new String[3];
        for(int i=0; i<boardSize; i++){
            for(int j=0; j<boardSize;j++){
                if((j+2)<boardSize){
                    int s=0;
                    for(int k=0; k<3;k++){
                        judge[k]=board[i][j+s];
                        s++;
                    }
                    int o=0;
                    for(String jud:judge){
                        if(jud=="○")o++;
                    }
                    if(o==3){
                        if((j+3)<boardSize&&board[i][j+3]!="●"&&board[i][j+3]!="○")
                        {if((j+4)<boardSize&&board[i][j+4]!="●")
                        {return i+" "+(j+3);}}
                        if((j-1)>=0&&board[i][j-1]!="●"&&board[i][j-1]!="○")
                        {if((j-2)>=0&&board[i][j-2]!="●"){return i+" "+(j-1);}
                        }
                    }
                }
                if((i+2)<boardSize){
                    int s=0;
                    for(int k=0; k<3;k++){
                        judge[k]=board[i+s][j];
                        s++;
                    }
                    int o=0;
                    for(String jud:judge){
                        if(jud=="○")o++;
                    }
                    if(o==3){
                        if((i+3)<boardSize&&board[i+3][j]!="●"&&board[i+3][j]!="○")
                        {if((i+4)<boardSize&&board[i+4][j]!="●")
                        {return (i+3)+" "+j;}}
                        if((i-1)>=0&&board[i-1][j]!="●"&&board[i-1][j]!="○")
                        {if((i-2)>=0&&board[i-2][j]!="●")
                        {return (i-1)+" "+j;}
                        }
                    }
                }
                if((i+2)<boardSize&&(j+2)<boardSize){
                    int s=0;
                    for(int k=0; k<3;k++){
                        judge[k]=board[i+s][j+s];
                        s++;
                    }
                    int o=0;
                    for(String jud:judge){
                        if(jud=="○")o++;
                    }
                    if(o==3){
                        if((i+3)<boardSize &&(j+3)<boardSize &&board[i+3][j+3]!="●"&&board[i+3][j+3]!="○")
                        {if((i+4)<boardSize&&(j+4)<boardSize &&board[i+4][j+4]!="●")
                        {return (i+3)+" "+(j+3);}}
                        if((i-1)>=0&&(j-1)>=0&&board[i-1][j-1]!="●"&&board[i-1][j-1]!="○")
                        {if((i-2)>=0&&(j-2)>=0&&board[i-2][j-2]!="●")
                        {return (i-1)+" "+(j-1);}
                        }
                    }
                }
                if((i-2)>0&&(j+2)<boardSize){
                    int s=0;
                    for(int k=0; k<3;k++){
                        judge[k]=board[i-s][j+s];
                        s++;
                    }
                    int o=0;
                    for(String jud:judge){
                        if(jud=="○")o++;
                    }
                    if(o==3){
                        if((i-3)>=0&&(j+3)<boardSize&&board[i-3][j+3]!="●"&&board[i-3][j+3]!="○")
                        {if((i-4)>=0&&(j+4)<boardSize&&board[i-4][j+4]!="●")
                        {return (i-3)+" "+(j+3);}}
                        if((i+1)<boardSize &&(j-1)>=0&&board[i+1][j-1]!="●"&&board[i+1][j-1]!="○")
                        {if((i+2)<boardSize &&(j-2)>=0&&board[i+2][j-2]!="●")
                        {return (i+1)+" "+(j-1);}
                        }
                    }
                }
            }}
        return null;
    }
    /*
    *玩家攻击延伸三个成四个
    */
    public String basicPlayerAttack03s32(String[][] newboard){
        board=newboard;
        String[] judge = new String[3];
        for(int i=0; i<boardSize; i++){
            for(int j=0; j<boardSize;j++){
                if((j+2)<boardSize){
                    int s=0;
                    for(int k=0; k<3;k++){
                        judge[k]=board[i][j+s];
                        s++;
                    }
                    int o=0;
                    for(String jud:judge){
                        if(jud=="●")o++;
                    }
                    if(o==3){
                        if((j+3)<boardSize&&board[i][j+3]!="●"&&board[i][j+3]!="○")
                        {if((j+4)<boardSize&&board[i][j+4]!="○")
                        {return i+" "+(j+3);}}
                        if((j-1)>=0&&board[i][j-1]!="●"&&board[i][j-1]!="○")
                        {if((j-2)>=0&&board[i][j-2]!="○"){return i+" "+(j-1);}
                        }
                    }
                }
                if((i+2)<boardSize){
                    int s=0;
                    for(int k=0; k<3;k++){
                        judge[k]=board[i+s][j];
                        s++;
                    }
                    int o=0;
                    for(String jud:judge){
                        if(jud=="●")o++;
                    }
                    if(o==3){
                        if((i+3)<boardSize&&board[i+3][j]!="●"&&board[i+3][j]!="○")
                        {if((i+4)<boardSize&&board[i+4][j]!="○")
                        {return (i+3)+" "+j;}}
                        if((i-1)>=0&&board[i-1][j]!="●"&&board[i-1][j]!="○")
                        {if((i-2)>=0&&board[i-2][j]!="○")
                        {return (i-1)+" "+j;}
                        }
                    }
                }
                if((i+2)<boardSize&&(j+2)<boardSize){
                    int s=0;
                    for(int k=0; k<3;k++){
                        judge[k]=board[i+s][j+s];
                        s++;
                    }
                    int o=0;
                    for(String jud:judge){
                        if(jud=="●")o++;
                    }
                    if(o==3){
                        if((i+3)<boardSize &&(j+3)<boardSize &&board[i+3][j+3]!="●"&&board[i+3][j+3]!="○")
                        {if((i+4)<boardSize&&(j+4)<boardSize &&board[i+4][j+4]!="○")
                        {return (i+3)+" "+(j+3);}}
                        if((i-1)>=0&&(j-1)>=0&&board[i-1][j-1]!="●"&&board[i-1][j-1]!="○")
                        {if((i-2)>=0&&(j-2)>=0&&board[i-2][j-2]!="○")
                        {return (i-1)+" "+(j-1);}
                        }
                    }
                }
                if((i-2)>0&&(j+2)<boardSize){
                    int s=0;
                    for(int k=0; k<3;k++){
                        judge[k]=board[i-s][j+s];
                        s++;
                    }
                    int o=0;
                    for(String jud:judge){
                        if(jud=="●")o++;
                    }
                    if(o==3){
                        if((i-3)>=0&&(j+3)<boardSize&&board[i-3][j+3]!="●"&&board[i-3][j+3]!="○")
                        {if((i-4)>=0&&(j+4)<boardSize&&board[i-4][j+4]!="○")
                        {return (i-3)+" "+(j+3);}}
                        if((i+1)<boardSize &&(j-1)>=0&&board[i+1][j-1]!="●"&&board[i+1][j-1]!="○")
                        {if((i+2)<boardSize &&(j-2)>=0&&board[i+2][j-2]!="○")
                        {return (i+1)+" "+(j-1);}
                        }
                    }
                }
            }}
        return null;
    }
    /*
    *电脑攻击补四缺一成四个
    */
    public String basicComputerAttack04s31(String[][] newboard){
        board=newboard;
        String[] judge = new String[4];
        for(int i=0; i<boardSize; i++){
            for(int j=0; j<boardSize;j++){
                if((j+3)<boardSize){
                    int s=0;
                    for(int k=0; k<4;k++){
                        judge[k]=board[i][j+s];
                        s++;
                    }
                    int o=0;
                    for(String jud:judge){
                        if(jud=="○")o++;
                    }
                    if(o==3){
                        if(((j-1)>=0&&board[i][j-1]!="●")||((j+4)<boardSize&&board[i][j+4]!="●"))
                        {if(board[i][j+1]!="●"&&board[i][j+1]!="○"){return i+" "+(j+1);}
                            if(board[i][j+2]!="●"&&board[i][j+2]!="○"){return i+" "+(j+2);}}
                    }
                }
                if((i+3)<boardSize){
                    int s=0;
                    for(int k=0; k<4;k++){
                        judge[k]=board[i+s][j];
                        s++;
                    }
                    int o=0;
                    for(String jud:judge){
                        if(jud=="○")o++;
                    }
                    if(o==3){
                        if(((i-1)>=0&&board[i-1][j]!="●")||((i+4)<boardSize&&board[i+4][j]!="●"))
                        {if(board[i+1][j]!="●"&&board[i+1][j]!="○"){return (i+1)+" "+j;}
                            if(board[i+2][j]!="●"&&board[i+2][j]!="○"){return (i+2)+" "+j;}}
                    }
                }
                if((i+3)<boardSize&&(j+3)<boardSize){
                    int s=0;
                    for(int k=0; k<4;k++){
                        judge[k]=board[i+s][j+s];
                        s++;
                    }
                    int o=0;
                    for(String jud:judge){
                        if(jud=="○")o++;
                    }
                    if(o==3){
                        if(((i+4)<boardSize&&(j+4)<boardSize&&board[i+4][j+4]!="●")||((i-1)>=0&&(j-1)>=0&&board[i-1][j-1]!="●"))
                        {if(board[i+1][j+1]!="●"&&board[i+1][j+1]!="○"){return (i+1)+" "+(j+1);}
                            if(board[i+2][j+2]!="●"&&board[i+2][j+2]!="○"){return (i+2)+" "+(j+2);}}
                    }
                }
                if((i-3)>0&&(j+3)<boardSize){
                    int s=0;
                    for(int k=0; k<4;k++){
                        judge[k]=board[i-s][j+s];
                        s++;
                    }
                    int o=0;
                    for(String jud:judge){
                        if(jud=="○")o++;
                    }
                    if(o==3){
                        if(((i+1)<boardSize&&(j-1)>=0&&board[i+1][j-1]!="●")||((i-3)>=0&&(j+3)<boardSize&&board[i-3][j+3]!="●"))
                        {if(board[i-1][j+1]!="●"&&board[i-1][j+1]!="○"){return (i-1)+" "+(j+1);}
                            if(board[i-2][j+2]!="●"&&board[i-2][j+2]!="○"){return (i-2)+" "+(j+2);}}
                    }
                }
            }}
        return null;
    }
    /*
    *玩家攻击补四缺一成四个
    */
    public String basicPlayerAttack04s31(String[][] newboard){
        board=newboard;
        String[] judge = new String[4];
        for(int i=0; i<boardSize; i++){
            for(int j=0; j<boardSize;j++){
                if((j+3)<boardSize){
                    int s=0;
                    for(int k=0; k<4;k++){
                        judge[k]=board[i][j+s];
                        s++;
                    }
                    int o=0;
                    for(String jud:judge){
                        if(jud=="●")o++;
                    }
                    if(o==3){
                        if(((j-1)>=0&&board[i][j-1]!="○")||((j+4)<boardSize&&board[i][j+4]!="○"))
                        {if(board[i][j+1]!="●"&&board[i][j+1]!="○"){return i+" "+(j+1);}
                            if(board[i][j+2]!="●"&&board[i][j+2]!="○"){return i+" "+(j+2);}}
                    }
                }
                if((i+3)<boardSize){
                    int s=0;
                    for(int k=0; k<4;k++){
                        judge[k]=board[i+s][j];
                        s++;
                    }
                    int o=0;
                    for(String jud:judge){
                        if(jud=="●")o++;
                    }
                    if(o==3){
                        if(((i-1)>=0&&board[i-1][j]!="○")||((i+4)<boardSize&&board[i+4][j]!="○"))
                        {if(board[i+1][j]!="●"&&board[i+1][j]!="○"){return (i+1)+" "+j;}
                            if(board[i+2][j]!="●"&&board[i+2][j]!="○"){return (i+2)+" "+j;}}
                    }
                }
                if((i+3)<boardSize&&(j+3)<boardSize){
                    int s=0;
                    for(int k=0; k<4;k++){
                        judge[k]=board[i+s][j+s];
                        s++;
                    }
                    int o=0;
                    for(String jud:judge){
                        if(jud=="●")o++;
                    }
                    if(o==3){
                        if(((i+4)<boardSize&&(j+4)<boardSize&&board[i+4][j+4]!="○")||((i-1)>=0&&(j-1)>=0&&board[i-1][j-1]!="○"))
                        {if(board[i+1][j+1]!="●"&&board[i+1][j+1]!="○"){return (i+1)+" "+(j+1);}
                            if(board[i+2][j+2]!="●"&&board[i+2][j+2]!="○"){return (i+2)+" "+(j+2);}}
                    }
                }
                if((i-3)>0&&(j+3)<boardSize){
                    int s=0;
                    for(int k=0; k<4;k++){
                        judge[k]=board[i-s][j+s];
                        s++;
                    }
                    int o=0;
                    for(String jud:judge){
                        if(jud=="●")o++;
                    }
                    if(o==3){
                        if(((i+1)<boardSize&&(j-1)>=0&&board[i+1][j-1]!="○")||((i-3)>=0&&(j+3)<boardSize&&board[i-3][j+3]!="○"))
                        {if(board[i-1][j+1]!="●"&&board[i-1][j+1]!="○"){return (i-1)+" "+(j+1);}
                            if(board[i-2][j+2]!="●"&&board[i-2][j+2]!="○"){return (i-2)+" "+(j+2);}}
                    }
                }
            }}
        return null;
    }
    /*
    *电脑攻击补五缺二
    */
    public String basicComputerAttack05s30(String[][] newboard){
        board=newboard;
        String[] judge = new String[5];
        for(int i=0; i<boardSize; i++){
            for(int j=0; j<boardSize;j++){
                if((j+4)<boardSize&&board[i][j]=="○"&&board[i][j+4]=="○"){
                    int s=0;
                    for(int k=0; k<5;k++){
                        judge[k]=board[i][j+s];
                        s++;
                    }
                    int o=0;
                    for(String jud:judge){
                        if(jud=="○")o++;
                    }
                    if(o==3){
                        if(board[i][j+1]!="●"&&board[i][j+2]!="●"&&board[i][j+3]!="●")
                        {if(board[i][j+1]!="○"){return i+" "+(j+1);}
                            if(board[i][j+2]!="○"){return i+" "+(j+2);}
                            if(board[i][j+3]!="○"){return i+" "+(j+3);}}
                    }
                }
                if((i+4)<boardSize&&board[i][j]=="○"&&board[i+4][j]=="○"){
                    int s=0;
                    for(int k=0; k<5;k++){
                        judge[k]=board[i+s][j];
                        s++;
                    }
                    int o=0;
                    for(String jud:judge){
                        if(jud=="○")o++;
                    }
                    if(o==3){
                        if(board[i+1][j]!="●"&&board[i+2][j]!="●"&&board[i+3][j]!="●")
                        {if(board[i+1][j]!="○"){return (i+1)+" "+j;}
                            if(board[i+2][j]!="○"){return (i+2)+" "+j;}
                            if(board[i+3][j]!="○"){return (i+3)+" "+j;}}
                    }
                }
                if((i+4)<boardSize&&(j+4)<boardSize&&board[i][j]=="○"&&board[i+4][j+4]=="○"){
                    int s=0;
                    for(int k=0; k<5;k++){
                        judge[k]=board[i+s][j+s];
                        s++;
                    }
                    int o=0;
                    for(String jud:judge){
                        if(jud=="○")o++;
                    }
                    if(o==3){
                        if(board[i+1][j+1]!="●"&&board[i+2][j+2]!="●"&&board[i+3][j+3]!="●")
                        {if(board[i+1][j+1]!="○"){return (i+1)+" "+(j+1);}
                            if(board[i+2][j+2]!="○"){return (i+2)+" "+(j+2);}
                            if(board[i+3][j+3]!="○"){return (i+3)+" "+(j+3);}}
                    }
                }
                if((i-4)>0&&(j+4)<boardSize&&board[i][j]=="○"&&board[i-4][j+4]=="○"){
                    int s=0;
                    for(int k=0; k<5;k++){
                        judge[k]=board[i-s][j+s];
                        s++;
                    }
                    int o=0;
                    for(String jud:judge){
                        if(jud=="○")o++;
                    }
                    if(o==3){
                        if(board[i-1][j+1]!="●"&&board[i-2][j+2]!="●"&&board[i-3][j+3]!="●")
                        {if(board[i-1][j+1]!="○"){return (i-1)+" "+(j+1);}
                            if(board[i-2][j+2]!="○"){return (i-2)+" "+(j+2);}
                            if(board[i-3][j+3]!="○"){return (i-3)+" "+(j+3);}}
                    }
                }
            }}
        return null;
    }
    /*
    *玩家攻击补五缺二
    */
    public String basicPlayerAttack05s30(String[][] newboard){
        board=newboard;
        String[] judge = new String[5];
        for(int i=0; i<boardSize; i++){
            for(int j=0; j<boardSize;j++){
                if((j+4)<boardSize&&board[i][j]=="●"&&board[i][j+4]=="●"){
                    int s=0;
                    for(int k=0; k<5;k++){
                        judge[k]=board[i][j+s];
                        s++;
                    }
                    int o=0;
                    for(String jud:judge){
                        if(jud=="●")o++;
                    }
                    if(o==3){
                        if(board[i][j+1]!="○"&&board[i][j+2]!="○"&&board[i][j+3]!="○")
                        {if(board[i][j+1]!="●"){return i+" "+(j+1);}
                            if(board[i][j+2]!="●"){return i+" "+(j+2);}
                            if(board[i][j+3]!="●"){return i+" "+(j+3);}}
                    }
                }
                if((i+4)<boardSize&&board[i][j]=="●"&&board[i+4][j]=="●"){
                    int s=0;
                    for(int k=0; k<5;k++){
                        judge[k]=board[i+s][j];
                        s++;
                    }
                    int o=0;
                    for(String jud:judge){
                        if(jud=="●")o++;
                    }
                    if(o==3){
                        if(board[i+1][j]!="○"&&board[i+2][j]!="○"&&board[i+3][j]!="○")
                        {if(board[i+1][j]!="●"){return (i+1)+" "+j;}
                            if(board[i+2][j]!="●"){return (i+2)+" "+j;}
                            if(board[i+3][j]!="●"){return (i+3)+" "+j;}}
                    }
                }
                if((i+4)<boardSize&&(j+4)<boardSize&&board[i][j]=="●"&&board[i+4][j+4]=="●"){
                    int s=0;
                    for(int k=0; k<5;k++){
                        judge[k]=board[i+s][j+s];
                        s++;
                    }
                    int o=0;
                    for(String jud:judge){
                        if(jud=="●")o++;
                    }
                    if(o==3){
                        if(board[i+1][j+1]!="○"&&board[i+2][j+2]!="○"&&board[i+3][j+3]!="○")
                        {if(board[i+1][j+1]!="●"){return (i+1)+" "+(j+1);}
                            if(board[i+2][j+2]!="●"){return (i+2)+" "+(j+2);}
                            if(board[i+3][j+3]!="●"){return (i+3)+" "+(j+3);}}
                    }
                }
                if((i-4)>0&&(j+4)<boardSize&&board[i][j]=="●"&&board[i-4][j+4]=="●"){
                    int s=0;
                    for(int k=0; k<5;k++){
                        judge[k]=board[i-s][j+s];
                        s++;
                    }
                    int o=0;
                    for(String jud:judge){
                        if(jud=="●")o++;
                    }
                    if(o==3){
                        if(board[i-1][j+1]!="○"&&board[i-2][j+2]!="○"&&board[i-3][j+3]!="○")
                        {if(board[i-1][j+1]!="●"){return (i-1)+" "+(j+1);}
                            if(board[i-2][j+2]!="●"){return (i-2)+" "+(j+2);}
                            if(board[i-3][j+3]!="●"){return (i-3)+" "+(j+3);}}
                    }
                }
            }}
        return null;
    }

    /*
    *电脑攻击独立一子随机下
    */
    public String basicComputerAttack31s13(String[][] newboard){
        board=newboard;
        for(int i=0; i<boardSize; i++){
            for(int j=0; j<boardSize;j++){

                if((j-3)>=0&&(j+3)<boardSize&&board[i][j]=="○"){
                    if(board[i][j+1]!="●"&&board[i][j+1]!="○"&&board[i][j-1]!="●"&&board[i][j-1]!="○")
                    {if(board[i][j+2]!="●"&&board[i][j-2]!="●")
                    {if(board[i][j+3]!="●"&&board[i][j-3]!="●"){
                        int ran = (int)(Math.random()*2);
                        switch(ran){
                            case 0:
                                return i+" "+(j+1);
                            case 1:
                                return i+" "+(j-1);
                        }}
                    }}}
                if((i-3)>=0&&(i+3)<boardSize&&board[i][j]=="○"){
                    if(board[i+1][j]!="●"&&board[i+1][j]!="○"&&board[i-1][j]!="●"&&board[i-1][j]!="○")
                    {if(board[i+2][j]!="●"&&board[i-2][j]!="●")
                    {if(board[i+3][j]!="●"&&board[i-3][j]!="●"){
                        int ran = (int)(Math.random()*2);
                        switch(ran){
                            case 0:
                                return (i+1)+" "+j;
                            case 1:
                                return (i-1)+" "+j;
                        }}
                    }}}
                if((i-3)>=0&&(j-3)>=0&&(j+3)<boardSize&&(i+3)<boardSize&&board[i][j]=="○"){
                    if(board[i+1][j+1]!="●"&&board[i+1][j+1]!="○"&&board[i-1][j-1]!="●"&&board[i-1][j-1]!="○")
                    {if(board[i+2][j+2]!="●"&&board[i-2][j-2]!="●")
                    {if(board[i+3][j+3]!="●"&&board[i-3][j-3]!="●"){
                        int ran = (int)(Math.random()*2);
                        switch(ran){
                            case 0:
                                return (i+1)+" "+(j+1);
                            case 1:
                                return (i-1)+" "+(j-1);
                        }}
                    }}}
                if((i-3)>=0&&(j-3)>=0&&(j+3)<boardSize&&(i+3)<boardSize&&board[i][j]=="○"){
                    if(board[i-1][j+1]!="●"&&board[i-1][j+1]!="○"&&board[i+1][j-1]!="●"&&board[i+1][j-1]!="○")
                    {if(board[i-2][j+2]!="●"&&board[i+2][j-2]!="●")
                    {if(board[i-3][j+3]!="●"&&board[i+3][j-3]!="●"){
                        int ran = (int)(Math.random()*2);
                        switch(ran){
                            case 0:
                                return (i-1)+" "+(j+1);
                            case 1:
                                return (i+1)+" "+(j-1);
                        }}
                    }}}
            }}
        return null;
    }
    /*
    *玩家攻击独立一子随机下
    */
    public String basicPlayerAttack31s13(String[][] newboard){
        board=newboard;
        for(int i=0; i<boardSize; i++){
            for(int j=0; j<boardSize;j++){
                int ran = (int)(Math.random()*4);
                switch(ran){
                    case 0:
                        if((j-3)>=0&&(j+3)<boardSize&&board[i][j]=="●"){
                            if(board[i][j+1]!="●"&&board[i][j+1]!="○"&&board[i][j-1]!="●"&&board[i][j-1]!="○")
                            {if(board[i][j+2]!="○"&&board[i][j-2]!="○")
                            {if(board[i][j+3]!="○"&&board[i][j-3]!="○"){
                                int ran2 = (int)(Math.random()*2);
                                switch(ran2){
                                    case 0:
                                        return i+" "+(j+1);
                                    case 1:
                                        return i+" "+(j-1);
                                }}
                            }}}
                    case 1:
                        if((i-3)>=0&&(i+3)<boardSize&&board[i][j]=="●"){
                            if(board[i+1][j]!="●"&&board[i+1][j]!="○"&&board[i-1][j]!="●"&&board[i-1][j]!="○")
                            {if(board[i+2][j]!="○"&&board[i-2][j]!="○")
                            {if(board[i+3][j]!="○"&&board[i-3][j]!="○"){
                                int ran2 = (int)(Math.random()*2);
                                switch(ran2){
                                    case 0:
                                        return (i+1)+" "+j;
                                    case 1:
                                        return (i-1)+" "+j;
                                }}
                            }}}
                    case 2:
                        if((i-3)>=0&&(j-3)>=0&&(j+3)<boardSize&&(i+3)<boardSize&&board[i][j]=="●"){
                            if(board[i+1][j+1]!="○"&&board[i+1][j+1]!="○"&&board[i-1][j-1]!="●"&&board[i-1][j-1]!="○")
                            {if(board[i+2][j+2]!="○"&&board[i-2][j-2]!="○")
                            {if(board[i+3][j+3]!="○"&&board[i-3][j-3]!="○"){
                                int ran2 = (int)(Math.random()*2);
                                switch(ran2){
                                    case 0:
                                        return (i+1)+" "+(j+1);
                                    case 1:
                                        return (i-1)+" "+(j-1);
                                }}
                            }}}
                    case 3:
                        if((i-3)>=0&&(j-3)>=0&&(j+3)<boardSize&&(i+3)<boardSize&&board[i][j]=="●"){
                            if(board[i-1][j+1]!="○"&&board[i-1][j+1]!="○"&&board[i+1][j-1]!="●"&&board[i+1][j-1]!="○")
                            {if(board[i-2][j+2]!="○"&&board[i+2][j-2]!="○")
                            {if(board[i-3][j+3]!="○"&&board[i+3][j-3]!="○"){
                                int ran2 = (int)(Math.random()*2);
                                switch(ran2){
                                    case 0:
                                        return (i-1)+" "+(j+1);
                                    case 1:
                                        return (i+1)+" "+(j-1);
                                }}
                            }}}

                }}}
        return null;
    }
    /*
    *电脑攻击独立一子一边空两个
    */
    public String basicComputerAttack21s13(String[][] newboard){
        board=newboard;
        for(int i=0; i<boardSize; i++){
            for(int j=0; j<boardSize;j++){

                if((j-2)>=0&&(j+2)<boardSize&&board[i][j]=="○"){
                    if(board[i][j+1]!="●"&&board[i][j+1]!="○"&&board[i][j-1]!="●"&&board[i][j-1]!="○")
                    {if(board[i][j+2]!="●"&&board[i][j-2]!="●")
                    {if((j+3)<boardSize&&board[i][j+3]!="●")
                    {return i+" "+(j+1);}
                        if((j-3)>=0&&board[i][j-3]!="●")
                        {return i+" "+(j-1);}
                    }}}
                if((i-2)>=0&&(i+2)<boardSize&&board[i][j]=="○"){
                    if(board[i+1][j]!="●"&&board[i+1][j]!="○"&&board[i-1][j]!="●"&&board[i-1][j]!="○")
                    {if(board[i+2][j]!="●"&&board[i-2][j]!="●")
                    {if((i+3)<boardSize&&board[i+3][j]!="●")
                    {return (i+1)+" "+j;}
                        if((i-3)>=0&&board[i-3][j]!="●")
                        {return (i-1)+" "+j;}
                    }}}
                if((i-2)>=0&&(j-2)>=0&&(j+2)<boardSize&&(i+2)<boardSize&&board[i][j]=="○"){
                    if(board[i+1][j+1]!="●"&&board[i+1][j+1]!="○"&&board[i-1][j-1]!="●"&&board[i-1][j-1]!="○")
                    {if(board[i+2][j+2]!="●"&&board[i-2][j-2]!="●")
                    {if((i+3)<boardSize&&(j+3)<boardSize&&board[i+3][j+3]!="●")
                    {return (i+1)+" "+(j+1);}
                        if((i-3)>=0&&(j-3)>=0&&board[i-3][j-3]!="●")
                        {return (i-1)+" "+(j-1);}
                    }}}
                if((i-2)>=0&&(j-2)>=0&&(j+2)<boardSize&&(i+2)<boardSize&&board[i][j]=="○"){
                    if(board[i-1][j+1]!="●"&&board[i-1][j+1]!="○"&&board[i+1][j-1]!="●"&&board[i+1][j-1]!="○")
                    {if(board[i-2][j+2]!="●"&&board[i+2][j-2]!="●")
                    {if((i-3)>=0&&(j+3)<boardSize&&board[i-3][j+3]!="●")
                    {return (i-1)+" "+(j+1);}
                        if((i+3)<boardSize&&(j-3)>=0&&board[i+3][j-3]!="●")
                        {return (i+1)+" "+(j-1);}
                    }}}

            }}
        return null;
    }
    /*
    *电脑攻击独立一子一边空一个
    */
    public String basicComputerAttack11s13(String[][] newboard){
        board=newboard;
        for(int i=0; i<boardSize; i++){
            for(int j=0; j<boardSize;j++){

                if((j-2)>=0&&(j+2)<boardSize&&board[i][j]=="○"){
                    if(board[i][j+1]!="●"&&board[i][j+1]!="○"&&board[i][j-1]!="●"&&board[i][j-1]!="○")
                    {if((j+3)<boardSize&&board[i][j+2]!="●"&&board[i][j+3]!="●")
                    {return i+" "+(j+1);}
                        if((j-3)>=0&&board[i][j-2]!="●"&&board[i][j-3]!="●")
                        {return i+" "+(j-1);}
                    }}
                if((i-2)>=0&&(i+2)<boardSize&&board[i][j]=="○"){
                    if(board[i+1][j]!="●"&&board[i+1][j]!="○"&&board[i-1][j]!="●"&&board[i-1][j]!="○")
                    {if((i+3)<boardSize&&board[i+2][j]!="●"&&board[i+3][j]!="●")
                    {return (i+1)+" "+j;}
                        if((i-3)>=0&&board[i-2][j]!="●"&&board[i-3][j]!="●")
                        {return (i-1)+" "+j;}
                    }}
                if((i-2)>=0&&(j-2)>=0&&(j+2)<boardSize&&(i+2)<boardSize&&board[i][j]=="○"){
                    if(board[i+1][j+1]!="●"&&board[i+1][j+1]!="○"&&board[i-1][j-1]!="●"&&board[i-1][j-1]!="○")
                    {if((i+3)<boardSize&&(j+3)<boardSize&&board[i+2][j+2]!="●"&&board[i+3][j+3]!="●")
                    {return (i+1)+" "+(j+1);}
                        if((i-3)>=0&&(j-3)>=0&&board[i-2][j-2]!="●"&&board[i-3][j-3]!="●")
                        {return (i-1)+" "+(j-1);}
                    }}
                if((i-2)>=0&&(j-2)>=0&&(j+2)<boardSize&&(i+2)<boardSize&&board[i][j]=="○"){
                    if(board[i-1][j+1]!="●"&&board[i-1][j+1]!="○"&&board[i+1][j-1]!="●"&&board[i+1][j-1]!="○")
                    {if((i-3)>=0&&(j+3)<boardSize&&board[i-2][j+2]!="●"&&board[i-3][j+3]!="●")
                    {return (i-1)+" "+(j+1);}
                        if((i+3)<boardSize&&(j-3)>=0&&board[i+2][j-2]!="●"&&board[i+3][j-3]!="●")
                        {return (i+1)+" "+(j-1);}
                    }}

            }}
        return null;
    }
    /*
    *电脑攻击空地方挨着白子下一子
    */
    public String basicComputerAttack11s11(String[][] newboard){
        board=newboard;
        for(int i=0; i<boardSize; i++){
            for(int j=0; j<boardSize;j++){

                if(board[i][j]=="○"){
                    if((j+1)<boardSize&&board[i][j+1]!="●"&&board[i][j+1]!="○")
                    {return i+" "+(j+1);}
                    if((j-1)>=0&&board[i][j-1]!="●"&&board[i][j-1]!="○")
                    {return i+" "+(j-1);}
                }
                if(board[i][j]=="○"){
                    if((i+1)<boardSize&&board[i+1][j]!="●"&&board[i+1][j]!="○")
                    {return (i+1)+" "+j;}
                    if((i-1)>=0&&board[i-1][j]!="●"&&board[i-1][j]!="○")
                    {return (i-1)+" "+j;}
                }
                if(board[i][j]=="○"){
                    if((i+1)<boardSize&&(j+1)<boardSize&&board[i+1][j+1]!="●"&&board[i+1][j+1]!="○")
                    {return (i+1)+" "+(j+1);}
                    if((i-1)>=0&&(j-1)>=0&&board[i-1][j-1]!="●"&&board[i-1][j-1]!="○")
                    {return (i-1)+" "+(j-1);}
                }
                if(board[i][j]=="○"){
                    if((i-1)>=0&&(j+1)<boardSize&&board[i-1][j+1]!="●"&&board[i-1][j+1]!="○")
                    {return (i-1)+" "+(j+1);}
                    if((i+1)<boardSize&&(j-1)>=0&&board[i+1][j-1]!="●"&&board[i+1][j-1]!="○")
                    {return (i+1)+" "+(j-1);}
                }

            }}
        return null;
    }
    /*
    *玩家攻击空地方挨着黑子下一子
    */
    public String basicPlayerAttack11s11(String[][] newboard){
        board=newboard;
        for(int i=0; i<boardSize; i++){
            for(int j=0; j<boardSize;j++){

                if(board[i][j]=="●"){
                    if((j+1)<boardSize&&board[i][j+1]!="●"&&board[i][j+1]!="○")
                    {return i+" "+(j+1);}
                    if((j-1)>=0&&board[i][j-1]!="●"&&board[i][j-1]!="○")
                    {return i+" "+(j-1);}
                }
                if(board[i][j]=="●"){
                    if((i+1)<boardSize&&board[i+1][j]!="●"&&board[i+1][j]!="○")
                    {return (i+1)+" "+j;}
                    if((i-1)>=0&&board[i-1][j]!="●"&&board[i-1][j]!="○")
                    {return (i-1)+" "+j;}
                }
                if(board[i][j]=="●"){
                    if((i+1)<boardSize&&(j+1)<boardSize&&board[i+1][j+1]!="●"&&board[i+1][j+1]!="○")
                    {return (i+1)+" "+(j+1);}
                    if((i-1)>=0&&(j-1)>=0&&board[i-1][j-1]!="●"&&board[i-1][j-1]!="○")
                    {return (i-1)+" "+(j-1);}
                }
                if(board[i][j]=="●"){
                    if((i-1)>=0&&(j+1)<boardSize&&board[i-1][j+1]!="●"&&board[i-1][j+1]!="○")
                    {return (i-1)+" "+(j+1);}
                    if((i+1)<boardSize&&(j-1)>=0&&board[i+1][j-1]!="●"&&board[i+1][j-1]!="○")
                    {return (i+1)+" "+(j-1);}
                }

            }}
        return null;
    }

}