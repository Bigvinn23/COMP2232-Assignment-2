/*
ClassName: ZooManager
Author: Jamaine Drakes & Evan Leacock
Purpose: 
Start Date: Mar 12, 2022
Last Edit: Mar 12, 2022
*/

//========================================================================================//
//                                     LIBRARIES                                          //
//========================================================================================//
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import java.awt.Image;

public class ZooManager
{
    static String name = "";
    public static void main(String[] args) throws FileNotFoundException
    {
        //========================================================================================//
        //                                 VARIABLES AND OBJECTS                                  //
        //========================================================================================//
       // new Welcome();

        ImageIcon logo = new ImageIcon("../Images/logo.png");
        Image alteredLogo = logo.getImage(); //get the imageicon as an image  to scale it
        Image newLogo =  alteredLogo.getScaledInstance(60, 60, Image.SCALE_SMOOTH); //transform it
        logo = new ImageIcon(newLogo); //convertit back to imageIcon

        String[] options = {"Yes I am!! ", "No I would like to quit"};

       int start = JOptionPane.showOptionDialog(
                                    null,
                                    "Welcome to Your Zoo Program!!\n Are you ready to start", 
                                    "Welcome", 
                                    JOptionPane.YES_NO_OPTION, 
                                    JOptionPane.INFORMATION_MESSAGE,
                                    logo,
                                    options, 
                                    0);

        if(start == 1)
        {
            System.exit(0);
        }

        name = JOptionPane.showInputDialog("Before we begin, please enter your name.");

        while(name.equals("") )
        {
            name = JOptionPane.showInputDialog("Please enter your name in the text box below");
        }

        //Object for zookeeper
        ZooKeeper zooKeeper = new ZooKeeper();

        zooKeeper.setName(name );

        
        System.out.println("Name of keeper: " + name);

        //Object for Zoo
        Zoo zoo = new Zoo();

        

        //Oject used for file reading and updating zoo
        File animalFile = new File("Animals.txt");
        Scanner animalFileReader = new Scanner(animalFile);
        Animal animalToAdd;

        //This variable will hold the animal species and remove any "-"" 
        String animalSpecies = "";
        
        //Doesn't work as hoped
        //zooKeeper.setName(Welcome.getUsername() );

        
        
       


        //========================================================================================//
        //                           READING FROM FILE AND UPDATING ZOO                           //
        //========================================================================================//
        while(animalFileReader.hasNextLine() )
        {
            animalToAdd = new Animal();

            //Getting animal information from the file
            animalToAdd.setCageID(animalFileReader.next() );
            animalToAdd.setName( animalFileReader.next() );
            animalSpecies = animalFileReader.next();              //This piece will remove any 
            String newSpecies = animalSpecies.replace("-", " ");  //"-" from the animal spcies
            animalToAdd.setSpecies(newSpecies);
            animalToAdd.setAge(animalFileReader.nextInt());
            animalToAdd.setHungerStatus(animalFileReader.nextInt() );
            animalToAdd.setHealthStatus(animalFileReader.nextInt() );
            animalToAdd.setCategory(animalFileReader.next());

            //Adding animal to file after all of its information has been gathered
            zoo.addAnimal(animalToAdd);
        }//end while


        //Remember to change show Animals back to void and not string
        //System.out.println(zoo.showAnimals());

        animalFileReader.close();
       // System.out.println("Name of keeper: " + zooKeeper.getName() );

        

    }// main


    

}// ZooManager