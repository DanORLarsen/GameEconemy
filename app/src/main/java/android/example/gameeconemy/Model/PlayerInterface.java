package android.example.gameeconemy.Model;

public interface PlayerInterface {
    int getMoney();

    void spendMoney(int amount);

    void receiveMoney(int amount);

    int getIronAmount();

    int getSwordAmount();

    void addSwords(int amount);

    void addIron(int amount);
}
