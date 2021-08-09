import javax.swing.*;

public class Bishop extends Piece
{
    public Bishop(boolean pieceColor)
    {
        super(pieceColor);
        if(isBlackPlayer)
        {
            image = new ImageIcon("bbishop.gif");
        }
        else {
            image = new ImageIcon("wbishop.gif");
        }
    }

    public boolean Move(int startx, int starty, int endx, int endy)
    {
        if (startx>endx && starty>endy)
        {
            for (int x=startx-1, y=starty-1; x>endx && y>endy; x--, y--)
            {
                if (Chess.position[x][y]!=null)
                {
                    return false;
                }
            }
        }
        else if (startx<endx && starty<endy)
        {
            for (int x=startx+1, y=starty+1; x<endx && y<endy; x++, y++)
            {
                if (Chess.position[x][y]!=null)
                {
                    return false;
                }
            }
        }
        else if (startx<endx && starty>endy)
        {
            for (int x=startx+1, y=starty-1; x<endx && y>endy; x++, y--)
            {
                if (Chess.position[x][y]!=null)
                {
                    return false;
                }
            }
        }
        else if (startx>endx && starty<endy)
        {
            for (int x=startx-1, y=starty+1; x>endx && y<endy; x--, y++)
            {
                if (Chess.position[x][y]!=null)
                {
                    return false;
                }
            }
        }
        if(Math.abs(startx-endx)==Math.abs(starty-endy))
        {
            return true;
        }
        return false;
    }
}