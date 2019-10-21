package players;

public abstract class Hero extends GameEntity
        implements HavingSuperAbility{
    private Ability ability;

    public Hero(int health, int damage, Ability ability) {
        super(health, damage);
        this.ability = ability;
    }

    public Ability getAbility() {
        return ability;
    }

    public void setAbility(Ability ability) {
        this.ability = ability;
    }
}
