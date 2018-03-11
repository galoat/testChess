package com.florian.board;

import com.florian.line.Line;
import com.florian.line.box.BlackBox;
import com.florian.line.box.WhiteBox;

public class Board2D extends Board {

    public void generateChessBoard(){
        int nbLine = 8;
        int nbColumn = 8;
        for(int line = 1; line <= nbLine; line++){
            Line chessLine = new Line();
            for(int column= 1; column <= nbColumn; column++){
                if(column % 2 == 0){
                    chessLine.add(column-1, new BlackBox());
                }else{
                    chessLine.add(column-1, new WhiteBox());
                }
            }
            board.add(line-1, chessLine);
        }
    }
}
