package decorator;

public class Staff extends CharacterDecorator {

    public Staff(Character character) {
        super(character);
    }

    @Override
    public String getName() {
        return character.getName() + ", Archmage";
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
        return character.getIntellect() + 9000;
    }
}
