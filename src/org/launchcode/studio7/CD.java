package org.launchcode.studio7;

public class CD extends BaseDisc implements Player {
    public CD(String dataContents, String name, int spinningSpeed, double storageCapacity) {
        super(dataContents, name, spinningSpeed, storageCapacity);
    }

    @Override
    public void playTheDisc() {
        System.out.println("The CD is now playing.");
    }

    @Override
    public void stopTheDisc() {
        System.out.println("You have stopped the CD.");
    }

    @Override
    public void ejectTheDisc() {
        System.out.println("The CD has been ejected");
    }

    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
