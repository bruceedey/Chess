import javax.swing.*;

public class Rook extends Piece
{
    public Rook(boolean pieceColor)
    {
        super(pieceColor);
        if(isBlackPlayer)
        {
            image = new ImageIcon("brook.gif");
        }
        else {
            image = new ImageIcon("wrook.gif");
        }
    }

    public boolean Move(int startx, int starty, int endx, int endy)
    {
        if(starty>endy)
        {
            for (int y=starty-1; y>endy; y--)
            {
                // can't jump over pieces
                if(Chess.position[startx][y]!=null)
                {
                    return false;
                }
            }
        }
        else if(starty<endy)
        {
            for (int y=starty+1; y<endy; y++)
            {
                if (Chess.position[startx][y]!=null)
                {
                    return false;
                }
            }
        }
        else if(startx>endx)
        {
            for (int x=startx-1; x>endx; x--)
            {
                if (Chess.position[x][endy]!=null)
                {
                    return false;
                }
            }
        }
        else if(startx<endx)
        {
            for (int x=startx+1; x<endx; x++)
            {
                if (Chess.position[x][endy]!=null)
                {
                    return false;
                }
            }
        }
        if(starty==endy || startx==endx)
        {
            return true;
        }
        return false;
    }
}