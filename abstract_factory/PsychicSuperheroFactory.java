package abstract_factory;


public class PsychicSuperheroFactory extends SuperheroAbstractFactory {

    public PsychicSuperhero getPsychicHero(String hero) {
        if(hero.equalsIgnoreCase("Jean Gray"))
            return new JeanGray();
        else if(hero.equalsIgnoreCase("Psylocke"))
            return new Psylocke();
        else if(hero.equalsIgnoreCase("Cable"));
            return new Cable();
    }

    public StrongSuperhero getStrongHero(String brawn) {
        return null;
    }

    public FastSuperhero getFastHero(String speedster) {
        return null;
    }
}
