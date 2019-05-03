package decorator;

public class Spear extends CharacterDecorator {

    public Spear(Character character) {
        super(character);
    }

    @Override
    public String getName() {
        return character.getName() + ", Spear-Thrower";
    }

    @Override
    public double getMight() {
        return character.getMight() + 5;
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
