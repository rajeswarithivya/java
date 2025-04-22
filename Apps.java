import java.awt.*;
class Apps
{
       public static void main(String args[])
       {
             Frame f=new Frame();
             f.setTitle("Applications");
             f.setSize(350,700);
             f.setVisible(true);

             Panel p1=new Panel();
             p1.setBackground(Color.CYAN);
             Label l0=new Label("APPLICATION");
             p1.add(l0);
            
             Panel p2=new Panel();
             Label l1=new Label("Register No");
             p2.add(l1);
             TextField t1=new TextField(20);
             p2.add(t1);

             Label l2=new Label("Student Name");
             p2.add(l2);
             TextField t2=new  TextField(20);
             p2.add(t2);
 
             f.add(p1,BorderLayout.NORTH);
             f.add(p2);
         }
}