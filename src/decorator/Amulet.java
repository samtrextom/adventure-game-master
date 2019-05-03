package decorator;

public class Amulet extends CharacterDecorator {

    public Amulet(Character character) {
        super(character);
    }

    @Override
    public String getName() {
        return character.getName() + ", Wielder of Power";
    }

    @Override
    public double getMight() {
        return character.getMight() + 9000;
    }

    @Override
    public double getToughness() {
        return character.getToughness();
    }

    @Override
    public double getIntellect() {
        return character.getIntellect();
    }


}
