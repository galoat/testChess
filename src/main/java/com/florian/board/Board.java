package com.florian.board;

import com.florian.line.Line;
import com.florian.line.box.BlackBox;
import com.florian.line.box.Box;
import com.florian.line.box.WhiteBox;


import java.util.ArrayList;
import java.util.Map;

public abstract class Board {
    protected ArrayList<Line> board;

    public Board(){
        board = new ArrayList();
    }



    public ArrayList<Line> getBoard() {
        return board;
    }

    public Box getBoxAtPosition(int line, int column){
        return board.get(line).get(column);
    }

    public void setBoard(ArrayList<Line> board) {
        this.board = board;
    }
}
