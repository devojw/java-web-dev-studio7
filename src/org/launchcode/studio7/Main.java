package org.launchcode.studio7;

public class Main {

    public static void main(String[] args){

        // TODO: Declare and initialize a CD and a DVD object.
        DVD myFaveDVD = new DVD("Movie","Cinderella",40,5);
        CD myFaveCd = new CD("Album", "Pop",50,20);

        // TODO: Call each CD and DVD method to verify that they work as expected.
        myFaveCd.ejectTheDisc();
        myFaveDVD.ejectTheDisc();

    }
}
