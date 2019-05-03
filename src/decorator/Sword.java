package decorator;

public class Sword extends CharacterDecorator {

    public Sword(Character character) {
        super(character);
    }

    @Override
    public String getName() {
        return character.getName() + ", Sword-Wielder";
    }

    @Override
    public double getMight() {
        return character.getMight() + 10;
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
