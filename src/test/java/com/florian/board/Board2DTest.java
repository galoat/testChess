package com.florian.board;


import com.florian.line.box.BlackBox;
import com.florian.line.box.WhiteBox;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class Board2DTest {
    private Board2D board;
    int nbBox = 8;
    int nbColumn = 8;
    @Before
    public void generateBox(){
      board = new Board2D();
        board.generateChessBoard();
    }


    @Test
    public void testGenerateChessBoardLineAndColumn() throws Exception {

        int nbCasePeerLine = 8;
        Assert.assertEquals("the line have not 8 column ", this.nbColumn , board.getBoard().size());
        for(int i = 0; i < nbBox; i++) {
            Assert.assertEquals(" The line "+ i + " have not 8 box", nbCasePeerLine,board.getBoard().get(i).size());
        }
    }

    @Test
    public void testColorBox(){
        Assert.assertTrue("first case mut be white", board.getBoxAtPosition(0, 0) instanceof WhiteBox );
        boolean isBlack = true;
        for(int i =0; i < nbColumn ; i++){
            for(int j = 0; j < nbColumn; j++){
                if( isBlack){
                    Assert.assertTrue("case "+ i+ "-"+j+" mut be white", board.getBoxAtPosition(i,j) instanceof WhiteBox);
                    isBlack =false;
                }else{
                    Assert.assertTrue("case "+ i+ "-"+j+" mut be black", board.getBoxAtPosition(i,j)  instanceof  BlackBox);
                    isBlack = true;
                }
            }
            if(i % 2 ==0){
                isBlack = true;
            }
        }

    }


}