package com.zdd.wzq.gobang;

import java.lang.Math;
public class Calculate{
    String[][] board;
    private static int boardSize=15;
    int endGo;
    public Calculate(){
        this.board = new String[boardSize][boardSize];
    }


    /*
*推算电脑下该位置接下来两步会不会赢
*/
    public int demoComputer2(String[][] newboard,int coordinatesX,int coordinatesY){
        board = newboard;
        Calculate cal= new Calculate();
        board[coordinatesX][coordinatesY]= "○";
        for(int dep=0;dep<2;dep++){
            String signal;
            signal =cal.ifPlayerDefense(board);
            if(signal==null)return 0;
            if(signal!=null){
                String[] signalxy = signal.split(" ");
                int x = Integer.parseInt(signalxy[0]);
                int y = Integer.parseInt(signalxy[1]);
                board[x][y] = "●";}
            //cal.printBoard();
            endGo=cal.whoWin(board);
            if(endGo==1){break;}    //1表示玩家赢了
            if(endGo==2){return 1;}//2表示电脑赢了
            signal =cal.ifComputerAttack(board);
            if(signal==null)return 0;
            if(signal!=null){
                String[] signalxy = signal.split(" ");
                int x = Integer.parseInt(signalxy[0]);
                int y = Integer.parseInt(signalxy[1]);
                board[x][y] = "☆";}
            //cal.printBoard();
            cal.change();
            endGo=cal.whoWin(board);
            if(endGo==1){break;}
            if(endGo==2){return 1;}
        }
        return 2;
    }
    /*
    *推算玩家下该位置接下来两步会不会赢
    */
    public int demoPlayer2(String[][] newboard,int coordinatesX,int coordinatesY){
        board = newboard;
        Calculate cal= new Calculate();
        board[coordinatesX][coordinatesY]= "○";
        for(int dep=0;dep<2;dep++){
            String signal;
            signal =cal.ifPlayerAttack(board);
            if(signal==null)return 0;
            if(signal!=null){
                String[] signalxy = signal.split(" ");
                int x = Integer.parseInt(signalxy[0]);
                int y = Integer.parseInt(signalxy[1]);
                board[x][y] = "●";}
            //cal.printBoard();
            endGo=cal.whoWin(board);
            if(endGo==2){break;}    //2表示电脑赢了
            if(endGo==1){return 1;}//1表示玩家赢了
            signal =cal.ifComputerDefense(board);
            if(signal==null)return 0;
            if(signal!=null){
                String[] signalxy = signal.split(" ");
                int x = Integer.parseInt(signalxy[0]);
                int y = Integer.parseInt(signalxy[1]);
                board[x][y] = "☆";}
            //cal.printBoard();
            cal.change();
            endGo=cal.whoWin(board);
            if(endGo==2){break;}
            if(endGo==1){return 1;}
        }

        return 2;
    }
    /*
*推算电脑下该位置接下来三步会不会赢
*/
    public int demoComputer3(String[][] newboard,int coordinatesX,int coordinatesY){
        board = newboard;
        Calculate cal= new Calculate();
        board[coordinatesX][coordinatesY]= "○";
        for(int dep=0;dep<3;dep++){
            String signal;
            signal =cal.ifPlayerDefense(board);
            if(signal==null)return 0;
            if(signal!=null){
                String[] signalxy = signal.split(" ");
                int x = Integer.parseInt(signalxy[0]);
                int y = Integer.parseInt(signalxy[1]);
                board[x][y] = "●";}
            //cal.printBoard();
            endGo=cal.whoWin(board);
            if(endGo==1){break;}    //1表示玩家赢了
            if(endGo==2){return 1;}//2表示电脑赢了
            signal =cal.ifComputerAttack(board);
            if(signal==null)return 0;
            if(signal!=null){
                String[] signalxy = signal.split(" ");
                int x = Integer.parseInt(signalxy[0]);
                int y = Integer.parseInt(signalxy[1]);
                board[x][y] = "☆";}
            //cal.printBoard();
            cal.change();
            endGo=cal.whoWin(board);
            if(endGo==1){break;}
            if(endGo==2){return 1;}
        }
        return 2;
    }
    /*
    *推算玩家下该位置接下来三步会不会赢
    */
    public int demoPlayer3(String[][] newboard,int coordinatesX,int coordinatesY){
        board = newboard;
        Calculate cal= new Calculate();
        board[coordinatesX][coordinatesY]= "○";
        for(int dep=0;dep<3;dep++){
            String signal;
            signal =cal.ifPlayerAttack(board);
            if(signal==null)return 0;
            if(signal!=null){
                String[] signalxy = signal.split(" ");
                int x = Integer.parseInt(signalxy[0]);
                int y = Integer.parseInt(signalxy[1]);
                board[x][y] = "●";}
            //cal.printBoard();
            endGo=cal.whoWin(board);
            if(endGo==2){break;}    //2表示电脑赢了
            if(endGo==1){return 1;}//1表示玩家赢了
            signal =cal.ifComputerDefense(board);
            if(signal==null)return 0;
            if(signal!=null){
                String[] signalxy = signal.split(" ");
                int x = Integer.parseInt(signalxy[0]);
                int y = Integer.parseInt(signalxy[1]);
                board[x][y] = "☆";}
            //cal.printBoard();
            cal.change();
            endGo=cal.whoWin(board);
            if(endGo==2){break;}
            if(endGo==1){return 1;}
        }

        return 2;
    }
    /*
    *推算电脑下该位置接下来四步会不会赢
    */
    public int demoComputer4(String[][] newboard,int coordinatesX,int coordinatesY){
        board = newboard;
        Calculate cal= new Calculate();
        board[coordinatesX][coordinatesY]= "○";
        for(int dep=0;dep<4;dep++){
            String signal;
            signal =cal.ifPlayerDefense(board);
            if(signal==null)return 0;
            if(signal!=null){
                String[] signalxy = signal.split(" ");
                int x = Integer.parseInt(signalxy[0]);
                int y = Integer.parseInt(signalxy[1]);
                board[x][y] = "●";}
            //cal.printBoard();
            endGo=cal.whoWin(board);
            if(endGo==1){break;}    //1表示玩家赢了
            if(endGo==2){return 1;}//2表示电脑赢了
            signal =cal.ifComputerAttack(board);
            if(signal==null)return 0;
            if(signal!=null){
                String[] signalxy = signal.split(" ");
                int x = Integer.parseInt(signalxy[0]);
                int y = Integer.parseInt(signalxy[1]);
                board[x][y] = "☆";}
            //cal.printBoard();
            cal.change();
            endGo=cal.whoWin(board);
            if(endGo==1){break;}
            if(endGo==2){return 1;}
        }
        return 2;
    }
    /*
    *推算玩家下该位置接下来四步会不会赢
    */
    public int demoPlayer4(String[][] newboard,int coordinatesX,int coordinatesY){
        board = newboard;
        Calculate cal= new Calculate();
        board[coordinatesX][coordinatesY]= "○";
        for(int dep=0;dep<4;dep++){
            String signal;
            signal =cal.ifPlayerAttack(board);
            if(signal==null)return 0;
            if(signal!=null){
                String[] signalxy = signal.split(" ");
                int x = Integer.parseInt(signalxy[0]);
                int y = Integer.parseInt(signalxy[1]);
                board[x][y] = "●";}
            //cal.printBoard();
            endGo=cal.whoWin(board);
            if(endGo==2){break;}    //2表示电脑赢了
            if(endGo==1){return 1;}//1表示玩家赢了
            signal =cal.ifComputerDefense(board);
            if(signal==null)return 0;
            if(signal!=null){
                String[] signalxy = signal.split(" ");
                int x = Integer.parseInt(signalxy[0]);
                int y = Integer.parseInt(signalxy[1]);
                board[x][y] = "☆";}
            //cal.printBoard();
            cal.change();
            endGo=cal.whoWin(board);
            if(endGo==2){break;}
            if(endGo==1){return 1;}
        }

        return 2;
    }
    /*
    *推算电脑下该位置接下来五步会不会赢
    */
    public int demoComputer5(String[][] newboard,int coordinatesX,int coordinatesY){
        board = newboard;
        Calculate cal= new Calculate();
        board[coordinatesX][coordinatesY]= "○";
        for(int dep=0;dep<5;dep++){
            String signal;
            signal =cal.ifPlayerDefense(board);
            if(signal==null)return 0;
            if(signal!=null){
                String[] signalxy = signal.split(" ");
                int x = Integer.parseInt(signalxy[0]);
                int y = Integer.parseInt(signalxy[1]);
                board[x][y] = "●";}
            //cal.printBoard();
            endGo=cal.whoWin(board);
            if(endGo==1){break;}    //1表示玩家赢了
            if(endGo==2){return 1;}//2表示电脑赢了
            signal =cal.ifComputerAttack(board);
            if(signal==null)return 0;
            if(signal!=null){
                String[] signalxy = signal.split(" ");
                int x = Integer.parseInt(signalxy[0]);
                int y = Integer.parseInt(signalxy[1]);
                board[x][y] = "☆";}
            //cal.printBoard();
            cal.change();
            endGo=cal.whoWin(board);
            if(endGo==1){break;}
            if(endGo==2){return 1;}
        }
        return 2;
    }
    /*
    *推算玩家下该位置接下来五步会不会赢
    */
    public int demoPlayer5(String[][] newboard,int coordinatesX,int coordinatesY){
        board = newboard;
        Calculate cal= new Calculate();
        board[coordinatesX][coordinatesY]= "○";
        for(int dep=0;dep<5;dep++){
            String signal;
            signal =cal.ifPlayerAttack(board);
            if(signal==null)return 0;
            if(signal!=null){
                String[] signalxy = signal.split(" ");
                int x = Integer.parseInt(signalxy[0]);
                int y = Integer.parseInt(signalxy[1]);
                board[x][y] = "●";}
            //cal.printBoard();
            endGo=cal.whoWin(board);
            if(endGo==2){break;}    //2表示电脑赢了
            if(endGo==1){return 1;}//1表示玩家赢了
            signal =cal.ifComputerDefense(board);
            if(signal==null)return 0;
            if(signal!=null){
                String[] signalxy = signal.split(" ");
                int x = Integer.parseInt(signalxy[0]);
                int y = Integer.parseInt(signalxy[1]);
                board[x][y] = "☆";}
            //cal.printBoard();
            cal.change();
            endGo=cal.whoWin(board);
            if(endGo==2){break;}
            if(endGo==1){return 1;}
        }

        return 2;
    }
    /*
    *推算电脑下该位置接下来六步会不会赢
    */
    public int demoComputer6(String[][] newboard,int coordinatesX,int coordinatesY){
        board = newboard;
        Calculate cal= new Calculate();
        board[coordinatesX][coordinatesY]= "○";
        for(int dep=0;dep<6;dep++){
            String signal;
            signal =cal.ifPlayerDefense(board);
            if(signal==null)return 0;
            if(signal!=null){
                String[] signalxy = signal.split(" ");
                int x = Integer.parseInt(signalxy[0]);
                int y = Integer.parseInt(signalxy[1]);
                board[x][y] = "●";}
            //cal.printBoard();
            endGo=cal.whoWin(board);
            if(endGo==1){break;}    //1表示玩家赢了
            if(endGo==2){return 1;}//2表示电脑赢了
            signal =cal.ifComputerAttack(board);
            if(signal==null)return 0;
            if(signal!=null){
                String[] signalxy = signal.split(" ");
                int x = Integer.parseInt(signalxy[0]);
                int y = Integer.parseInt(signalxy[1]);
                board[x][y] = "☆";}
            //cal.printBoard();
            cal.change();
            endGo=cal.whoWin(board);
            if(endGo==1){break;}
            if(endGo==2){return 1;}
        }
        return 2;
    }
    /*
    *推算玩家下该位置接下来六步会不会赢
    */
    public int demoPlayer6(String[][] newboard,int coordinatesX,int coordinatesY){
        board = newboard;
        Calculate cal= new Calculate();
        board[coordinatesX][coordinatesY]= "○";
        for(int dep=0;dep<6;dep++){
            String signal;
            signal =cal.ifPlayerAttack(board);
            if(signal==null)return 0;
            if(signal!=null){
                String[] signalxy = signal.split(" ");
                int x = Integer.parseInt(signalxy[0]);
                int y = Integer.parseInt(signalxy[1]);
                board[x][y] = "●";}
            //cal.printBoard();
            endGo=cal.whoWin(board);
            if(endGo==2){break;}    //2表示电脑赢了
            if(endGo==1){return 1;}//1表示玩家赢了
            signal =cal.ifComputerDefense(board);
            if(signal==null)return 0;
            if(signal!=null){
                String[] signalxy = signal.split(" ");
                int x = Integer.parseInt(signalxy[0]);
                int y = Integer.parseInt(signalxy[1]);
                board[x][y] = "☆";}
            //cal.printBoard();
            cal.change();
            endGo=cal.whoWin(board);
            if(endGo==2){break;}
            if(endGo==1){return 1;}
        }

        return 2;
    }
    /*
    *推算电脑下该位置接下来七步会不会赢
    */
    public int demoComputer7(String[][] newboard,int coordinatesX,int coordinatesY){
        board = newboard;
        Calculate cal= new Calculate();
        board[coordinatesX][coordinatesY]= "○";
        for(int dep=0;dep<7;dep++){
            String signal;
            signal =cal.ifPlayerDefense(board);
            if(signal==null)return 0;
            if(signal!=null){
                String[] signalxy = signal.split(" ");
                int x = Integer.parseInt(signalxy[0]);
                int y = Integer.parseInt(signalxy[1]);
                board[x][y] = "●";}
            //cal.printBoard();
            endGo=cal.whoWin(board);
            if(endGo==1){break;}    //1表示玩家赢了
            if(endGo==2){return 1;}//2表示电脑赢了
            signal =cal.ifComputerAttack(board);
            if(signal==null)return 0;
            if(signal!=null){
                String[] signalxy = signal.split(" ");
                int x = Integer.parseInt(signalxy[0]);
                int y = Integer.parseInt(signalxy[1]);
                board[x][y] = "☆";}
            //cal.printBoard();
            cal.change();
            endGo=cal.whoWin(board);
            if(endGo==1){break;}
            if(endGo==2){return 1;}
        }
        return 2;
    }
    /*
    *推算玩家下该位置接下来七步会不会赢
    */
    public int demoPlayer7(String[][] newboard,int coordinatesX,int coordinatesY){
        board = newboard;
        Calculate cal= new Calculate();
        board[coordinatesX][coordinatesY]= "○";
        for(int dep=0;dep<7;dep++){
            String signal;
            signal =cal.ifPlayerAttack(board);
            if(signal==null)return 0;
            if(signal!=null){
                String[] signalxy = signal.split(" ");
                int x = Integer.parseInt(signalxy[0]);
                int y = Integer.parseInt(signalxy[1]);
                board[x][y] = "●";}
            //cal.printBoard();
            endGo=cal.whoWin(board);
            if(endGo==2){break;}    //2表示电脑赢了
            if(endGo==1){return 1;}//1表示玩家赢了
            signal =cal.ifComputerDefense(board);
            if(signal==null)return 0;
            if(signal!=null){
                String[] signalxy = signal.split(" ");
                int x = Integer.parseInt(signalxy[0]);
                int y = Integer.parseInt(signalxy[1]);
                board[x][y] = "☆";}
            //cal.printBoard();
            cal.change();
            endGo=cal.whoWin(board);
            if(endGo==2){break;}
            if(endGo==1){return 1;}
        }

        return 2;
    }
    /*
    *推算电脑下该位置接下来八步会不会赢
    */
    public int demoComputer8(String[][] newboard,int coordinatesX,int coordinatesY){
        board = newboard;
        Calculate cal= new Calculate();
        board[coordinatesX][coordinatesY]= "○";
        for(int dep=0;dep<8;dep++){
            String signal;
            signal =cal.ifPlayerDefense(board);
            if(signal==null)return 0;
            if(signal!=null){
                String[] signalxy = signal.split(" ");
                int x = Integer.parseInt(signalxy[0]);
                int y = Integer.parseInt(signalxy[1]);
                board[x][y] = "●";}
            //cal.printBoard();
            endGo=cal.whoWin(board);
            if(endGo==1){break;}    //1表示玩家赢了
            if(endGo==2){return 1;}//2表示电脑赢了
            signal =cal.ifComputerAttack(board);
            if(signal==null)return 0;
            if(signal!=null){
                String[] signalxy = signal.split(" ");
                int x = Integer.parseInt(signalxy[0]);
                int y = Integer.parseInt(signalxy[1]);
                board[x][y] = "☆";}
            //cal.printBoard();
            cal.change();
            endGo=cal.whoWin(board);
            if(endGo==1){break;}
            if(endGo==2){return 1;}
        }
        return 2;
    }
    /*
    *推算玩家下该位置接下来八步会不会赢
    */
    public int demoPlayer8(String[][] newboard,int coordinatesX,int coordinatesY){
        board = newboard;
        Calculate cal= new Calculate();
        board[coordinatesX][coordinatesY]= "○";
        for(int dep=0;dep<8;dep++){
            String signal;
            signal =cal.ifPlayerAttack(board);
            if(signal==null)return 0;
            if(signal!=null){
                String[] signalxy = signal.split(" ");
                int x = Integer.parseInt(signalxy[0]);
                int y = Integer.parseInt(signalxy[1]);
                board[x][y] = "●";}
            //cal.printBoard();
            endGo=cal.whoWin(board);
            if(endGo==2){break;}    //2表示电脑赢了
            if(endGo==1){return 1;}//1表示玩家赢了
            signal =cal.ifComputerDefense(board);
            if(signal==null)return 0;
            if(signal!=null){
                String[] signalxy = signal.split(" ");
                int x = Integer.parseInt(signalxy[0]);
                int y = Integer.parseInt(signalxy[1]);
                board[x][y] = "☆";}
            //cal.printBoard();
            cal.change();
            endGo=cal.whoWin(board);
            if(endGo==2){break;}
            if(endGo==1){return 1;}
        }

        return 2;
    }
    /*
    *推算电脑下该位置接下来九步会不会赢
    */
    public int demoComputer9(String[][] newboard,int coordinatesX,int coordinatesY){
        board = newboard;
        Calculate cal= new Calculate();
        board[coordinatesX][coordinatesY]= "○";
        for(int dep=0;dep<9;dep++){
            String signal;
            signal =cal.ifPlayerDefense(board);
            if(signal==null)return 0;
            if(signal!=null){
                String[] signalxy = signal.split(" ");
                int x = Integer.parseInt(signalxy[0]);
                int y = Integer.parseInt(signalxy[1]);
                board[x][y] = "●";}
            //cal.printBoard();
            endGo=cal.whoWin(board);
            if(endGo==1){break;}    //1表示玩家赢了
            if(endGo==2){return 1;}//2表示电脑赢了
            signal =cal.ifComputerAttack(board);
            if(signal==null)return 0;
            if(signal!=null){
                String[] signalxy = signal.split(" ");
                int x = Integer.parseInt(signalxy[0]);
                int y = Integer.parseInt(signalxy[1]);
                board[x][y] = "☆";}
            //cal.printBoard();
            cal.change();
            endGo=cal.whoWin(board);
            if(endGo==1){break;}
            if(endGo==2){return 1;}
        }
        return 2;
    }
    /*
    *推算玩家下该位置接下来九步会不会赢
    */
    public int demoPlayer9(String[][] newboard,int coordinatesX,int coordinatesY){
        board = newboard;
        Calculate cal= new Calculate();
        board[coordinatesX][coordinatesY]= "○";
        for(int dep=0;dep<9;dep++){
            String signal;
            signal =cal.ifPlayerAttack(board);
            if(signal==null)return 0;
            if(signal!=null){
                String[] signalxy = signal.split(" ");
                int x = Integer.parseInt(signalxy[0]);
                int y = Integer.parseInt(signalxy[1]);
                board[x][y] = "●";}
            //cal.printBoard();
            endGo=cal.whoWin(board);
            if(endGo==2){break;}    //2表示电脑赢了
            if(endGo==1){return 1;}//1表示玩家赢了
            signal =cal.ifComputerDefense(board);
            if(signal==null)return 0;
            if(signal!=null){
                String[] signalxy = signal.split(" ");
                int x = Integer.parseInt(signalxy[0]);
                int y = Integer.parseInt(signalxy[1]);
                board[x][y] = "☆";}
            //cal.printBoard();
            cal.change();
            endGo=cal.whoWin(board);
            if(endGo==2){break;}
            if(endGo==1){return 1;}
        }

        return 2;
    }
    /*
    *推算电脑下该位置接下来十步会不会赢
    */
    public int demoComputer10(String[][] newboard,int coordinatesX,int coordinatesY){
        board = newboard;
        Calculate cal= new Calculate();
        board[coordinatesX][coordinatesY]= "○";
        for(int dep=0;dep<10;dep++){
            String signal;
            signal =cal.ifPlayerDefense(board);
            if(signal==null)return 0;
            if(signal!=null){
                String[] signalxy = signal.split(" ");
                int x = Integer.parseInt(signalxy[0]);
                int y = Integer.parseInt(signalxy[1]);
                board[x][y] = "●";}
            //cal.printBoard();
            endGo=cal.whoWin(board);
            if(endGo==1){break;}    //1表示玩家赢了
            if(endGo==2){return 1;}//2表示电脑赢了
            signal =cal.ifComputerAttack(board);
            if(signal==null)return 0;
            if(signal!=null){
                String[] signalxy = signal.split(" ");
                int x = Integer.parseInt(signalxy[0]);
                int y = Integer.parseInt(signalxy[1]);
                board[x][y] = "☆";}
            //cal.printBoard();
            cal.change();
            endGo=cal.whoWin(board);
            if(endGo==1){break;}
            if(endGo==2){return 1;}
        }
        return 2;
    }
    /*
    *推算玩家下该位置接下来十步会不会赢
    */
    public int demoPlayer10(String[][] newboard,int coordinatesX,int coordinatesY){
        board = newboard;
        Calculate cal= new Calculate();
        board[coordinatesX][coordinatesY]= "○";
        for(int dep=0;dep<10;dep++){
            String signal;
            signal =cal.ifPlayerAttack(board);
            if(signal==null)return 0;
            if(signal!=null){
                String[] signalxy = signal.split(" ");
                int x = Integer.parseInt(signalxy[0]);
                int y = Integer.parseInt(signalxy[1]);
                board[x][y] = "●";}
            //cal.printBoard();
            endGo=cal.whoWin(board);
            if(endGo==2){break;}    //2表示电脑赢了
            if(endGo==1){return 1;}//1表示玩家赢了
            signal =cal.ifComputerDefense(board);
            if(signal==null)return 0;
            if(signal!=null){
                String[] signalxy = signal.split(" ");
                int x = Integer.parseInt(signalxy[0]);
                int y = Integer.parseInt(signalxy[1]);
                board[x][y] = "☆";}
            //cal.printBoard();
            cal.change();
            endGo=cal.whoWin(board);
            if(endGo==2){break;}
            if(endGo==1){return 1;}
        }

        return 2;
    }
    /*
    *假设电脑攻击
    */
    public String ifComputerAttack(String[][] newboard){
        board =newboard;
        BasicCal basic = new BasicCal();
        String signal;
        signal=basic.basicComputerMustAttack4s4(board);//用电脑必须攻击的思路进行攻击
        if(signal!=null){return signal;}
        signal=basic.basicComputerMustAttack5s4(board);//用电脑必须攻击的思路进行攻击
        if(signal!=null){return signal;}

        signal=basic.basicPlayerMustAttack4s4(board);//用玩家必须攻击的思路进行防守
        if(signal!=null){return signal;}
        signal=basic.basicPlayerMustAttack5s4(board);//用玩家必须攻击的思路进行防守
        if(signal!=null){return signal;}

        signal=basic.basicComputerMustAttack4s3(board);//用电脑必须攻击的思路进行攻击
        if(signal!=null){return signal;}
        signal=basic.basicComputerMustAttack7s4(board);//用电脑必须攻击的思路进行攻击
        if(signal!=null){return signal;}
        signal=basic.basicComputerMustAttack33(board);//用电脑必须攻击的思路进行攻击
        if(signal!=null){return signal;}
        signal=basic.basicComputerMustAttack3s3(board);//用电脑必须攻击的思路进行攻击
        if(signal!=null){return signal;}

        signal=basic.basicPlayerMustAttack4s3(board);//用玩家必须攻击的思路进行防守
        if(signal!=null){return signal;}
        signal=basic.basicPlayerMustAttack7s4(board);//用玩家必须攻击的思路进行防守
        if(signal!=null){return signal;}
        signal=basic.basicPlayerMustAttack33(board);//用玩家必须攻击的思路进行防守
        if(signal!=null){return signal;}
        signal=basic.basicPlayerMustAttack3s3(board);//用玩家必须攻击的思路进行防守
        if(signal!=null){return signal;}

        signal=basic.basicComputerMustAttack22(board);//用电脑必须攻击的思路进行攻击
        if(signal!=null){return signal;}
        signal=basic.basicPlayerMustAttack22(board);//用玩家必须攻击的思路进行防守
        if(signal!=null){return signal;}



        signal=basic.basicComputerAttack12s23(board);//电脑攻击独立两子一头空一个
        if(signal!=null){return signal;}
        signal=basic.basicComputerAttack4s2(board);//电脑攻击四子中间隔两个
        if(signal!=null){return signal;}
        signal=basic.basicComputerAttack3s2(board);//电脑攻击三缺一
        if(signal!=null){return signal;}
        signal=basic.basicComputerAttack03s32(board);//电脑攻击延伸三个成四个
        if(signal!=null){return signal;}
        signal=basic.basicComputerAttack04s31(board);//电脑攻击补四缺一成四个
        if(signal!=null){return signal;}
        signal=basic.basicComputerAttack05s30(board);//电脑攻击补四缺一成四个
        if(signal!=null){return signal;}


        return null;
    }
    /*
    *假设电脑防守
    */
    public String ifComputerDefense(String[][] newboard){
        board =newboard;
        BasicCal basic = new BasicCal();
        String signal;
        signal=basic.basicComputerMustAttack4s4(board);//用电脑必须攻击的思路进行攻击
        if(signal!=null){return signal;}
        signal=basic.basicComputerMustAttack5s4(board);//用电脑必须攻击的思路进行攻击
        if(signal!=null){return signal;}

        signal=basic.basicPlayerMustAttack4s4(board);//用玩家必须攻击的思路进行防守
        if(signal!=null){return signal;}
        signal=basic.basicPlayerMustAttack5s4(board);//用玩家必须攻击的思路进行防守
        if(signal!=null){return signal;}

        signal=basic.basicComputerMustAttack4s3(board);//用电脑必须攻击的思路进行攻击
        if(signal!=null){return signal;}
        signal=basic.basicComputerMustAttack7s4(board);//用电脑必须攻击的思路进行攻击
        if(signal!=null){return signal;}
        signal=basic.basicComputerMustAttack33(board);//用电脑必须攻击的思路进行攻击
        if(signal!=null){return signal;}
        signal=basic.basicComputerMustAttack3s3(board);//用电脑必须攻击的思路进行攻击
        if(signal!=null){return signal;}

        signal=basic.basicPlayerMustAttack4s3(board);//用玩家必须攻击的思路进行防守
        if(signal!=null){return signal;}
        signal=basic.basicPlayerMustAttack7s4(board);//用玩家必须攻击的思路进行防守
        if(signal!=null){return signal;}
        signal=basic.basicPlayerMustAttack33(board);//用玩家必须攻击的思路进行防守
        if(signal!=null){return signal;}
        signal=basic.basicPlayerMustAttack3s3(board);//用玩家必须攻击的思路进行防守
        if(signal!=null){return signal;}

        signal=basic.basicComputerMustAttack22(board);//用电脑必须攻击的思路进行攻击
        if(signal!=null){return signal;}
        signal=basic.basicPlayerMustAttack22(board);//用玩家必须攻击的思路进行防守
        if(signal!=null){return signal;}





        return null;
    }
    /*
    *假设玩家攻击
    */
    public String ifPlayerAttack(String[][] newboard){
        board =newboard;
        BasicCal basic = new BasicCal();
        String signal;
        signal=basic.basicPlayerMustAttack4s4(board);//用玩家必须攻击的思路进行攻击
        if(signal!=null){return signal;}
        signal=basic.basicPlayerMustAttack5s4(board);//用玩家必须攻击的思路进行攻击
        if(signal!=null){return signal;}

        signal=basic.basicComputerMustAttack4s4(board);//用电脑必须攻击的思路进行防守
        if(signal!=null){return signal;}
        signal=basic.basicComputerMustAttack5s4(board);//用电脑必须攻击的思路进行防守
        if(signal!=null){return signal;}

        signal=basic.basicPlayerMustAttack4s3(board);//用玩家必须攻击的思路进行攻击
        if(signal!=null){return signal;}
        signal=basic.basicPlayerMustAttack7s4(board);//用玩家必须攻击的思路进行攻击
        if(signal!=null){return signal;}
        signal=basic.basicPlayerMustAttack33(board);//用玩家必须攻击的思路进行攻击
        if(signal!=null){return signal;}
        signal=basic.basicPlayerMustAttack3s3(board);//用玩家必须攻击的思路进行攻击
        if(signal!=null){return signal;}

        signal=basic.basicComputerMustAttack4s3(board);//用电脑必须攻击的思路进行防守
        if(signal!=null){return signal;}
        signal=basic.basicComputerMustAttack7s4(board);//用电脑必须攻击的思路进行防守
        if(signal!=null){return signal;}
        signal=basic.basicComputerMustAttack33(board);//用电脑必须攻击的思路进行防守
        if(signal!=null){return signal;}
        signal=basic.basicComputerMustAttack3s3(board);//用电脑必须攻击的思路进行防守
        if(signal!=null){return signal;}

        signal=basic.basicPlayerMustAttack22(board);//用玩家必须攻击的思路进行攻击
        if(signal!=null){return signal;}
        signal=basic.basicComputerMustAttack22(board);//用电脑必须攻击的思路进行防守
        if(signal!=null){return signal;}


        signal=basic.basicPlayerAttack12s23(board);//玩家攻击独立两子一头空一个
        if(signal!=null){return signal;}
        signal=basic.basicPlayerAttack4s2(board);//玩家攻击四子中间隔两个
        if(signal!=null){return signal;}
        signal=basic.basicPlayerAttack3s2(board);//玩家攻击三缺一
        if(signal!=null){return signal;}
        signal=basic.basicPlayerAttack03s32(board);//玩家攻击延伸三个成四个
        if(signal!=null){return signal;}
        signal=basic.basicPlayerAttack04s31(board);//玩家攻击补四缺一成四个
        if(signal!=null){return signal;}
        signal=basic.basicPlayerAttack05s30(board);//玩家攻击补五缺二
        if(signal!=null){return signal;}





        return null;
    }
    /*
    *假设玩家防守
    */
    public String ifPlayerDefense(String[][] newboard){
        board =newboard;
        BasicCal basic = new BasicCal();
        String signal;
        signal=basic.basicPlayerMustAttack4s4(board);//用玩家必须攻击的思路进行攻击
        if(signal!=null){return signal;}
        signal=basic.basicPlayerMustAttack5s4(board);//用玩家必须攻击的思路进行攻击
        if(signal!=null){return signal;}

        signal=basic.basicComputerMustAttack4s4(board);//用电脑必须攻击的思路进行防守
        if(signal!=null){return signal;}
        signal=basic.basicComputerMustAttack5s4(board);//用电脑必须攻击的思路进行防守
        if(signal!=null){return signal;}

        signal=basic.basicPlayerMustAttack4s3(board);//用玩家必须攻击的思路进行攻击
        if(signal!=null){return signal;}
        signal=basic.basicPlayerMustAttack7s4(board);//用玩家必须攻击的思路进行攻击
        if(signal!=null){return signal;}
        signal=basic.basicPlayerMustAttack33(board);//用玩家必须攻击的思路进行攻击
        if(signal!=null){return signal;}
        signal=basic.basicPlayerMustAttack3s3(board);//用玩家必须攻击的思路进行攻击
        if(signal!=null){return signal;}

        signal=basic.basicComputerMustAttack4s3(board);//用电脑必须攻击的思路进行防守
        if(signal!=null){return signal;}
        signal=basic.basicComputerMustAttack7s4(board);//用电脑必须攻击的思路进行防守
        if(signal!=null){return signal;}
        signal=basic.basicComputerMustAttack33(board);//用电脑必须攻击的思路进行防守
        if(signal!=null){return signal;}
        signal=basic.basicComputerMustAttack3s3(board);//用电脑必须攻击的思路进行防守
        if(signal!=null){return signal;}

        signal=basic.basicPlayerMustAttack22(board);//用玩家必须攻击的思路进行攻击
        if(signal!=null){return signal;}
        signal=basic.basicComputerMustAttack22(board);//用电脑必须攻击的思路进行防守
        if(signal!=null){return signal;}





        return null;
    }
    public String ifNormalGetPieces(String[][] newboard){

        board =newboard;
        BasicCal basic = new BasicCal();
        String signal;

        signal =basic.basicComputerMustAttack4s4(board); //四个子的时候
        if(signal!=null){return signal;}

        signal =basic.basicComputerMustAttack5s4(board); //五缺一的时候
        if(signal!=null){return signal;}

        signal =basic.basicPlayerMustAttack4s4(board); //堵四个子的时候
        if(signal!=null){return signal;}

        signal =basic.basicPlayerMustAttack5s4(board); //堵五缺一的时候
        if(signal!=null){return signal;}

        signal =basic.basicComputerMustAttack4s3(board); //四缺一的时候
        if(signal!=null){return signal;}

        signal =basic.basicComputerMustAttack7s4(board); //七中有四的时候
        if(signal!=null){return signal;}

        signal =basic.basicComputerMustAttack33(board); //两列三个的时候
        if(signal!=null){return signal;}

        signal =basic.basicComputerMustAttack22(board); //两列两个以上
        if(signal!=null){return signal;}

        signal =basic.basicComputerMustAttack3s3(board); //独立三个的时候
        if(signal!=null){return signal;}

        signal =basic.basicPlayerMustAttack4s3(board); //堵四缺一的时候
        if(signal!=null){return signal;}

        signal =basic.basicPlayerMustAttack7s4(board); //堵七中有四的时候
        if(signal!=null){return signal;}

        signal =basic.basicPlayerMustAttack33(board); //堵两列三个的时候
        if(signal!=null){return signal;}

        signal =basic.basicPlayerMustAttack22(board); //堵两列两个以上
        if(signal!=null){return signal;}

        signal =basic.basicPlayerMustAttack3s3(board); //堵独立三个的时候
        if(signal!=null){return signal;}

        signal =basic.basicComputerAttack32s23(board); //独立两子随机下
        if(signal!=null){return signal;}

        signal =basic.basicComputerAttack22s23(board); //独立两子
        if(signal!=null){return signal;}

        signal =basic.basicComputerAttack12s23(board); //独立两子一头空一个
        if(signal!=null){return signal;}

        signal =basic.basicComputerAttack4s2(board); //四子中间隔两个
        if(signal!=null){return signal;}

        signal =basic.basicComputerAttack3s2(board); //三缺一
        if(signal!=null){return signal;}

        signal =basic.basicComputerAttack03s32(board); //延伸三个成四个
        if(signal!=null){return signal;}

        signal =basic.basicComputerAttack04s31(board); //补四缺一成四个
        if(signal!=null){return signal;}

        signal =basic.basicComputerAttack05s30(board); //补五缺二
        if(signal!=null){return signal;}

        signal =basic.basicComputerAttack31s13(board); //独立一子随机
        if(signal!=null){return signal;}

        signal =basic.basicPlayerAttack31s13(board); //堵独立一子随机
        if(signal!=null){return signal;}

        if(board[7][7]!="●"&&board[7][7]!="○"){return 7+" "+7;}

        signal =basic.basicComputerAttack21s13(board); //独立一子一边空两个
        if(signal!=null){return signal;}

        signal =basic.basicComputerAttack11s13(board); //独立一子一边空一个
        if(signal!=null){return signal;}

        if(board[11][3]!="●"&&board[11][3]!="○"){return 7+" "+7;}
        if(board[11][11]!="●"&&board[11][11]!="○"){return 11+" "+11;}
        if(board[3][11]!="●"&&board[3][11]!="○"){return 3+" "+11;}
        if(board[3][3]!="●"&&board[3][3]!="○"){return 3+" "+3;}

        signal =basic.basicComputerAttack11s11(board); //空地方挨着白子下一子
        if(signal!=null){return signal;}

        signal =basic.basicPlayerAttack11s11(board); //空地方挨着黑子下一子
        if(signal!=null){return signal;}


        return null;

    }
    /*
    *判断谁赢了方法
    */
    public int whoWin(String[][] newboard){
        board= newboard;
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
                    int g=0;
                    for(String jud:judge){
                        if(jud=="●")o++;
                        if(jud=="○")g++;
                    }
                    if(o==5){
                        return 1;
                    }
                    if(g==5){
                        return 2;
                    }
                }
            }
        }
        for(int i=0; i<boardSize; i++){
            for(int j=0; j<boardSize;j++){
                if((i+4)<boardSize){
                    int s=0;
                    for(int k=0; k<5;k++){
                        judge[k]=board[i+s][j];
                        s++;
                    }
                    int o=0;
                    int g=0;
                    for(String jud:judge){
                        if(jud=="●")o++;
                        if(jud=="○")g++;
                    }
                    if(o==5){
                        return 1;
                    }
                    if(g==5){
                        return 2;
                    }
                }
            }
        }
        for(int i=0; i<boardSize; i++){
            for(int j=0; j<boardSize;j++){
                if((i+4)<boardSize&&(j+4)<boardSize){
                    int s=0;
                    for(int k=0; k<5;k++){
                        judge[k]=board[i+s][j+s];
                        s++;
                    }
                    int o=0;
                    int g=0;
                    for(String jud:judge){
                        if(jud=="●")o++;
                        if(jud=="○")g++;
                    }
                    if(o==5){
                        return 1;
                    }
                    if(g==5){
                        return 2;
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
                        if(jud=="○")g++;
                    }
                    if(o==5){
                        return 1;
                    }
                    if(g==5){
                        return 2;
                    }
                }
            }
        }
        return 0;
    }
    public void printBoard(){
        for(int i=boardSize-1; i>=0; i--){
            for(int j=0; j<boardSize; j++){
                System.out.print(board[j][i]);
            }
            System.out.println();
        }
        System.out.println();
    }
    public void change(){
        for(int i=0; i<boardSize; i++){
            for(int j=0; j<boardSize;j++){
                if(board[i][j]=="☆")board[i][j]="○";
            }
        }
    }



}