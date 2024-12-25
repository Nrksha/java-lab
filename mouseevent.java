
import java.awt.*;
import java.applet.*;
import java.awt.event.*;
/*
<applet code="mouseevent" width=500 height=500>
</applet>
*/

public class mouseevent extends Applet implements MouseListener,MouseMotionListener {
    public void init(){
        addMouseListener(this); addMouseMotionListener(this);
    }
    public void mouseClicked(MouseEvent e) {
    showStatus("mouse clicked:"+e.getX()+","+e.getY());
}
    public void mouseEntered(MouseEvent e) {
    showStatus("mouse entered:"+e.getX()+","+e.getY());
    for(int i=0;i<100000;i++);
}
    public void mouseExited(MouseEvent e) {
    showStatus("mouse exited:"+e.getX()+","+e.getY());
}
    public void mousePressed(MouseEvent e) {
    showStatus("mouse pressed:"+e.getX()+","+e.getY());
    }

    public void mouseReleased(MouseEvent e)
    {
        showStatus("mouse released:"+e.getX()+","+e.getY());
    }
    public void mouseMoved(MouseEvent e)
    {
        showStatus("mouse moved:"+e.getX()+","+e.getY());
    }
    public void mouseDragged(MouseEvent e)
    {
        showStatus("mouse dragged:"+e.getX()+","+e.getY());
    }
}



