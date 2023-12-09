public class Priest extends Healer {

    public Priest(Pair damage, int armor, Pair abilityValueInterval) {
        super(damage, armor, abilityValueInterval);
        setHealth(baseHealth + 4);
    }

    @Override
    public void resetStats() {
        setHealth(baseHealth + 4);
        setArmor(initialArmor);
    }

    @Override
    public Pair getAbilityValueInterval() {
        return abilityValueInterval;
    }
}