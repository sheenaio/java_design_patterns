package factory;


public class AvengerFactory {

    public Avenger getAvenger(String avenger) {

        if(avenger.equalsIgnoreCase("Red Skull")) {
            return new CaptainAmerica();
        }
        else if(avenger.equalsIgnoreCase("Doc Ock")){
            return new Spiderman();
        }
        else if(avenger.equalsIgnoreCase("The Mandarin")) {
            return new IronMan();
        }
        else {
            return new BlackWidow();
        }
    }
}
