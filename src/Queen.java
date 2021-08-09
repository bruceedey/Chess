import javax.swing.*;

public class Queen extends Piece
{
    public Queen(boolean pieceColor)
    {
        super(pieceColor);
        if(isBlackPlayer)
        {
            image = new ImageIcon("bqueen.gif");
        }
        else
        {
            image = new ImageIcon("wqueen.gif");
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

        if(starty>endy)
        {
            for (int y=starty-1; y>endy; y--)
            {
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