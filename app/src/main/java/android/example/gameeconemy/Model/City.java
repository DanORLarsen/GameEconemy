package android.example.gameeconemy.Model;
//TODO - Make Swordprice match iron price better so, its not top price for iron but lowest place for swords in the same city.
public class City implements CityInterface{
    private String name;
    private int population;
    private int ironPrice;
    private int swordPrice;

    public City(String name, int population){
        this.name = name;
        this.population = population;
        double ironPirce = Math.random()*50 + 100;
        this.ironPrice = (int) ironPirce;
        double swordPrice = Math.random()*100 + 120;
        this.swordPrice = (int) swordPrice;
    }


    @Override
    public int getPopulation() {
        return this.population;
    }

    @Override
    public int getIronPrice() {
        return this.ironPrice;
    }

    @Override
    public int getSwordPrice() {
        return this.swordPrice;
    }

    @Override
    public void buySword() {
        //if money - price = left>0 buy, else cant buy toast
        //Money might be in Player.getMoney.
    }

    @Override
    public void buyIron() {
    }
}
