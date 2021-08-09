import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class BoardMouseListener implements MouseListener
{
    private int startx, starty;

    public void mouseClicked(MouseEvent e)
    {
    }
    public void mousePressed(MouseEvent e)
    {
        startx = e.getX()/Chess.PIECESIZE;
        starty = e.getY()/Chess.PIECESIZE;
    }

    public void mouseReleased(MouseEvent e)
    {

        int endx = e.getX()/Chess.PIECESIZE;
        int endy = e.getY()/Chess.PIECESIZE;

        if(startx<0 || startx>=8 || starty<0 || starty>=8 || endx<0 || endx>=8 || endy<0 || endy>=8)
        {
            return;
        }
        if(Chess.position[startx][starty]!=null && Chess.position[endx][endy]!=null && Chess.position[endx][endy].isBlackPlayer==Chess.position[startx][starty].isBlackPlayer)
        {
            return;
        }

        if(startx==endx && starty==endy)
        {
            return;
        }
        if(Chess.position[startx][starty]==null)
        {
            return;
        }
        if(Chess.position[startx][starty].isBlackPlayer)
        {
            return;
        }
        if(!Chess.position[startx][starty].Move(startx, starty, endx, endy))
        {
            return;
        }
        Chess.position[endx][endy] = Chess.position[startx][starty];
        Chess.position[startx][starty] = null;
        Chess.boardcomponent.repaint();

        while(true)
        {
            startx = (int)(Math.random()*8);
            starty = (int)(Math.random()*8);
            endx = (int)(Math.random()*8);
            endy = (int)(Math.random()*8);

            if(Chess.position[startx][starty]==null)
            {
                continue;
            }
            if(startx==endx && starty==endy)
            {
                continue;
            }
            if(!Chess.position[startx][starty].isBlackPlayer)
            {
                continue;
            }
            if(Chess.position[startx][starty]!=null && Chess.position[endx][endy]!=null && Chess.position[endx][endy].isBlackPlayer==Chess.position[startx][starty].isBlackPlayer)
            {
                continue;
            }
            if(!Chess.position[startx][starty].Move(startx, starty, endx, endy))
            {
                continue;
            }

            Chess.position[endx][endy] = Chess.position[startx][starty];
            Chess.position[startx][starty] = null;
            Chess.boardcomponent.repaint();
            break;
        }
    }

    public void mouseEntered(MouseEvent e) {
    }

    public void mouseExited(MouseEvent e) {
    }
}