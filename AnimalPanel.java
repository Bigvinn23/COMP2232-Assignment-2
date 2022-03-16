/*
ClassName: AnimalPanel.java
Author: Jamaine Drakes
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


public class AnimalPanel  extends JPanel //implements ActionListener
{
    //========================================================================================//
    //                                    DATA MEMBERS                                        //
    //========================================================================================//
    //Panels
    JPanel top;
    JPanel center;
    JPanel bot;
    
    //Labels
    JLabel titleLabel;

    JLabel cageIDLabel;
    JLabel nameLabel;
    JLabel speciesLabel;
    JLabel categoryLabel;
    JLabel hungerLabel;
    JLabel healthLabel;

    JLabel animalCageID;
    JLabel animalName;
    JLabel animalSpecies;
    JLabel animalCategory;
    JLabel animalHunger;
    JLabel animalHealth;
   

    JLabel zoneImageJLabel;


    
    
    //Button
    JButton nextButton;


    //ImagesIcon
    ImageIcon africanSavanna;
    ImageIcon amazonianJungle;
    ImageIcon eurasianWilds;
    ImageIcon frozenTundra;


    

    //========================================================================================//
    //                                    CONSTRUCTOR                                         //
    //========================================================================================//
    public AnimalPanel()
    {
        this.setLayout(new BorderLayout() );
        //========================================================================================//
        //                                     INSTANTIATION                                      //
        //========================================================================================//
        //Top Panel
        top = new JPanel();
        top.setLayout(new FlowLayout() );

        //Center Panel
        center = new JPanel();
        
        center.setLayout(new GridLayout(6,2,20,10) ); //PLace items in a grid with 6 rows and 2 columns


        //Bot Panel
        bot = new JPanel();
        bot.setLayout(new BoxLayout(bot, BoxLayout.LINE_AXIS) );

        //Labels
        titleLabel = new JLabel("Animal");
        
        cageIDLabel = new JLabel("Cage ID:");
        nameLabel = new JLabel("Name:");
        speciesLabel = new JLabel("Species");
        categoryLabel= new JLabel("Category:");
        hungerLabel = new JLabel("Hunger:");
        healthLabel= new JLabel("Health:");
        
        animalCageID = new JLabel("A1");
        animalName = new JLabel("Jack");
        animalSpecies = new JLabel("Joe");
        animalCategory = new JLabel("Herb");
        animalHunger = new JLabel("3");
        animalHealth = new JLabel("4");

        zoneImageJLabel = new JLabel();

        //Button
        nextButton = new JButton("Next");
        
        
        //========================================================================================//
        //                                  ADDING COMPONENTS                                     //
        //========================================================================================//
        //Top Panel
        top.add(titleLabel);

        //Center Panel
        center.add(cageIDLabel);
        center.add(animalCageID);

        center.add(nameLabel);
        center.add(animalName);

        center.add(speciesLabel);
        center.add(animalSpecies);

        center.add(categoryLabel);
        center.add(animalCategory);

        center.add(hungerLabel);
        center.add(animalHunger);

        center.add(healthLabel);
        center.add(animalHealth);
        
        
        //Bottom Panel
        bot.add(nextButton);

        this.add("North",top);
        this.add("Center",center);
        this.add("South",bot);


        //========================================================================================//
        //                                ADDING ACTION LISTENERS                                 //
        //========================================================================================//




        //this.setVisible(true);
    }// end AnimalPanel

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
    public void styleComponents()
    {

    }

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

}// end AnimalPanel