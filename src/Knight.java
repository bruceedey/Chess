import javax.swing.*;

public class Knight extends Piece
{
    public Knight(boolean pieceColor)
    {
        super(pieceColor);
        if(isBlackPlayer)
        {
            image = new ImageIcon("bknight.gif");
        }
        else
        {
            image = new ImageIcon("wknight.gif");
        }
    }

    public boolean Move(int startx, int starty, int endx, int endy)
    {
        if(Math.abs(startx-endx)==2 && Math.abs(starty-endy)==1)
        {
            return true;
        }
        else if(Math.abs(starty-endy)==2 && Math.abs(startx-endx)==1)
        {
            return true;
        }
        return false;
    }
}