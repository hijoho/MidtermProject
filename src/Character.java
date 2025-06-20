public abstract class Character implements Creature {
    String name;
    int hp;
    public Character(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }
    public abstract void attack(Character target);
    public final boolean isAlive(){
        boolean alive = false;
        if(hp > 0){
            alive = true;
        }
        return alive;
    }
    public void showStatus(){
        System.out.println(this.name + ": HP " + this.hp);
    }
}
