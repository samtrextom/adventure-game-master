package decorator;

public class BasicCharacter implements Character {

    private String name;
    private double might;
    private double toughness;
    private double intellect;

    public BasicCharacter(String name) {
        this.name = name;
        this.might = 0;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getMight() {
        return might;
    }

    @Override
    public double getToughness() {
        return toughness;
    }

    @Override
    public double getIntellect() {
        return intellect;
    }
}
