import javax.swing.*;

public class King extends Piece
{
    public King(boolean pieceColor)
    {
        super(pieceColor);
        if(isBlackPlayer)
        {
            image = new ImageIcon("bking.gif");
        }
        else
        {
            image = new ImageIcon("wking.gif");
        }
    }

    public boolean Move(int startx, int starty, int endx, int endy)
    {
        if(startx-endx>=-1 && startx-endx<=1)
        {
            if(starty-endy>=-1 && starty-endy<=1)
            {
                return true;
            }
        }
        return false;
    }

}