public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setHealth(500);
        boss.setDamage(50);
        boss.setDefence("kinetic");
        System.out.println("жизньБосса: " + boss.getHealth() + " уронБосса: "
        + boss.getDamage() + " защитаБосса: " + boss.getDefence());
        for (int i = 0; i < createHeroes().length; i++) {
            System.out.println((i + 1) + " "  +  "xp" + " " +  " " + createHeroes()[i].getHealth()+ "damage" +" " + createHeroes()[i].getDamage()+ "супер спасобность "  + "" + createHeroes()[i].getAttackType());

        }
    }
    public static Hero[] createHeroes () {
        Hero Physical = new Hero(400,40,"Physic");
        Hero Magical = new Hero(350,20,"Magic");
        Hero Kinetic = new Hero(450,25,"kinetic");

        Hero[] heroes = {Physical, Magical,Kinetic};
         return heroes;
    }


}