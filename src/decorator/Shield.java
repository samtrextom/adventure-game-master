package decorator;

public class Shield extends CharacterDecorator {

    public Shield(Character character) {
        super(character);
    }

    @Override
    public String getName() {
        return character.getName() + ", The Immovable Object";
    }

    @Override
    public double getMight() {
        return character.getMight();
    }

    @Override
    public double getToughness() {
        return  character.getToughness() + 5;
    }

    @Override
    public double getIntellect() {
        return character.getIntellect();
    }


}
