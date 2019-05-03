package decorator;

public abstract class CharacterDecorator implements Character {

    protected Character character;

    public CharacterDecorator(Character character) {
        this.character = character;
    }
}
