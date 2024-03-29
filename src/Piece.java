import javax.swing.*;
import java.awt.*;

public abstract class Piece
{
    protected ImageIcon image;
    protected boolean isBlackPlayer = true;

    public Piece(boolean pieceColor)
    {
        if(pieceColor)
        {
            isBlackPlayer = true;
        }
        else
        {
            isBlackPlayer = false;
        }
    }

    public static void drawPiece(int x, int y, Graphics g)
    {
        g.drawImage(Chess.position[x][y].image.getImage(),x*Chess.PIECESIZE, y*Chess.PIECESIZE, null);
    }

    public abstract boolean Move(int startx, int starty, int endx, int endy);
}