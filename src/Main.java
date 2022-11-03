public class Main {

    // polymorphism - greek word - poly = "many" , morph = "form
    //                The ability of an object to identify as more than one type


    public static void main(String[] args) {

        Airliner airliner = new Airliner();
        PrivateJet privateJet = new PrivateJet();
        FighterJet fighterJet = new FighterJet();

        //all objects identify as aircraft
        Aircraft[] flyers = {airliner, privateJet, fighterJet};

        //enhanced for loop to print array
        for (Aircraft x : flyers) {
            x.takeOff();
        }

    }


}
