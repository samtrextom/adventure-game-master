package decorator;

public class Starving extends CharacterDecorator {

    public Starving(Character character) {
        super(character);
    }

    @Override
    public String getName() {
        return character.getName() + ", The Starved";
    }

    @Override
    public double getMight() {
        return character.getMight() + 5;
    }

    @Override
    public double getToughness() {
        return character.getToughness() - 5;
    }

    @Override
    public double getIntellect() {
        return character.getIntellect();
    }
}
