/*
ClassName: Main.java
Author: Jamaine Drakes and Evan Leacock
Purpose: 
Start Date: Mar 13, 2022
Last Edit: Mar 13, 2022
*/

//========================================================================================//
//                                     LIBRARIES                                          //
//========================================================================================//
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Main extends JFrame implements ActionListener
{
    //========================================================================================//
    //                                    DATA MEMBERS                                        //
    //========================================================================================//
    AnimalPanel animalPanel;

    //========================================================================================//
    //                                    CONSTRUCTOR                                         //
    //========================================================================================//
    public Main()
    {
        animalPanel = new AnimalPanel();
    
        setLayout(new BorderLayout());
        setSize(500, 400);
        setTitle("Animal Screen");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



        this.add("West",animalPanel);
        //maximiseFrame(this);
        
        
        //this.pack();
        setVisible(true);
        
        
        //========================================================================================//
        //                                  ADDING COMPONENTS                                     //
        //========================================================================================//



        //========================================================================================//
        //                                ADDING ACTION LISTENERS                                 //
        //========================================================================================//



    }// end Main

    //========================================================================================//
    //                                ACTION PERFORMED METHOD                                 //
    //========================================================================================//
    public void actionPerformed(ActionEvent e)
    {
        // Event Handlers
        
    }// actionPerformed


    //========================================================================================//
    //                                    OTHER METHODS                                       //
    //========================================================================================//



     //This function will maximise the frames
     private static void maximiseFrame(JFrame fr)
     {
 
         //Get the size of the screen
         Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
 
         //Determine the size of the screen
         int w = dimension.width;
         int h = dimension.height;
 
         //Make the frame the same size as the screen
         fr.setSize(w,h);
 
         //Ensure the window is in the top-left hand corner
         fr.setLocation(0,0);
     }//end maximiseFrame
 
     /*
     // This method will center the frame on the screen
     private static void centerFrame(JFrame fr)
     {
         // Get the size of the screen
         Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
 
         // Determine the new location of the window
         int w = fr.getSize().width;
         int h = fr.getSize().height;
         int x = (dim.width - w) / 2;
         int y = (dim.height - h) / 2;
         // Move the window
         fr.setLocation(x, y);
 
     }// end centerFrame
     */

}// end Main