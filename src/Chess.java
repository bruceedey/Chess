import javax.swing.*;

public class Chess
{
    public static final int PIECESIZE = 44;
    public static final int WIDTH = PIECESIZE*17/2, HEIGHT = PIECESIZE*17/2;
    public static BoardComponent boardcomponent;
    public static Piece[][] position=new Piece[8][8];

    public static void main(String[] args)
    {

        position[0][0]=new Rook(true);
        position[1][0]=new Knight(true);
        position[2][0]=new Bishop(true);
        position[3][0]=new Queen(true);
        position[4][0]=new King(true);
        position[5][0]=new Bishop(true);
        position[6][0]=new Knight(true);
        position[7][0]=new Rook(true);
        for(int i=0; i<8; i++)
        {
            position[i][1]=new Pawn(true);
        }
        // whitepieces
        position[0][7]=new Rook(false);
        position[1][7]=new Knight(false);
        position[2][7]=new Bishop(false);
        position[3][7]=new Queen(false);
        position[4][7]=new King(false);
        position[5][7]=new Bishop(false);
        position[6][7]=new Knight(false);
        position[7][7]=new Rook(false);
        for(int i=0; i<8; i++)
        {
            position[i][6]=new Pawn(false);
        }
        for(int i=0; i<8; i++)
        {
            position[i][2] = null;
        }
        for(int i=0; i<8; i++)
        {
            position[i][3] = null;
        }
        for(int i=0; i<8; i++)
        {
            position[i][4] = null;
        }
        for(int i=0; i<8; i++)
        {
            position[i][5] = null;
        }

        JFrame window=new JFrame();

        window.setSize(WIDTH, HEIGHT+30);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        boardcomponent=new BoardComponent();
        window.add(boardcomponent);


        BoardMouseListener mouseListener=new BoardMouseListener();
        boardcomponent.addMouseListener(mouseListener);

        // make visible
        window.setVisible(true);
    }
}