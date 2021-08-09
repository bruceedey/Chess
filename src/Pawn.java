import javax.swing.*;

public class Pawn extends Piece
{
    boolean isFirstMove = true;

    public Pawn(boolean pieceColor)
    {
        super(pieceColor);
        if(isBlackPlayer)
        {
            image = new ImageIcon("bpawn.gif");
        }
        else {
            image = new ImageIcon("wpawn.gif");
        }
    }

    public boolean Move(int startx, int starty, int endx, int endy)
    {
        if(!Chess.position[startx][starty].isBlackPlayer)
        {
            if(startx==endx && starty-endy==1 && Chess.position[endx][endy]==null)
            {
                isFirstMove = false;
                return true;
            }
            else if(startx==endx && starty-endy==2 && Chess.position[endx][endy]==null && Chess.position[startx][starty-1]==null && isFirstMove)
            {
                isFirstMove = false;
                return true;
            }

            else if((startx-endx==1 || startx-endx==-1) && starty-endy==1 && Chess.position[endx][endy]!=null)
            {
                if(Chess.position[endx][endy].isBlackPlayer)
                {
                    isFirstMove = false;
                    return true;
                }
            }
        }
        if(Chess.position[startx][starty].isBlackPlayer)
        {
            if (startx==endx && starty-endy==-1 && Chess.position[endx][endy]==null)
            {
                isFirstMove = false;
                return true;
            }
            else if (startx==endx && starty-endy==-2 && Chess.position[endx][endy]==null && Chess.position[startx][starty+1]==null && isFirstMove)
            {
                isFirstMove = false;
                return true;
            }
            else if ((startx-endx==1 || startx-endx==-1) && starty-endy==-1 && Chess.position[endx][endy]!=null)
            {
                if (!Chess.position[endx][endy].isBlackPlayer)
                {
                    isFirstMove = false;
                    return true;
                }
            }
        }
        return false;
    }
}