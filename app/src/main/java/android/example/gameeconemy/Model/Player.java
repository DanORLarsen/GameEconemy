package android.example.gameeconemy.Model;

public class Player implements PlayerInterface {
    private String name;
    private int money;
    private int ironAmount;
    private int swordAmount;

    public Player(String name){
        this.name = name;
        this.money = 1000;
        this.ironAmount = 0;
        this.swordAmount = 0;
    }
    @Override
    public int getMoney() {
        return this.money;
    }

    @Override
    public void spendMoney(int amount) {
        this.money-= amount;
    }

    @Override
    public void receiveMoney(int amount) {
        this.money+= amount;
    }

    @Override
    public int getIronAmount() {
        return this.ironAmount;
    }

    @Override
    public int getSwordAmount() {
        return this.swordAmount;
    }

    @Override
    public void addSwords(int amount) {
        this.swordAmount+=amount;
    }

    @Override
    public void addIron(int amount) {
        this.ironAmount+=amount;
    }


}
