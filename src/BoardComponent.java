import javax.swing.*;
import java.awt.*;

public class BoardComponent extends JComponent
{
    protected void paintComponent(Graphics g)
    {
        Color lightbrown=new Color(233,174,95);
        Color darkbrown=new Color(177,113,24);

        for(int x=0; x<8; x++)
        {
            for(int y=0; y<8; y++)
            {
                if(x%2==y%2)
                {
                    g.setColor(lightbrown);
                }
                else
                {
                    g.setColor(darkbrown);
                }
                g.fillRect(x*Chess.PIECESIZE, y*Chess.PIECESIZE, Chess.PIECESIZE, Chess.PIECESIZE);
            }
        }

        for(int x=0; x<8; x++)
        {
            for(int y=0; y<8; y++)
            {
                if(Chess.position[x][y]!=null)
                {
                    Piece.drawPiece(x, y, g);
                }
            }
        }
    }
}