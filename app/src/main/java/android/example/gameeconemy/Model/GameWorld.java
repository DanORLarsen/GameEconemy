package android.example.gameeconemy.Model;
//TODO - Combine x iron into sword for a fee. change sword and iron to match the combine value.
public class GameWorld {
    public Player player = new Player("Hans");
    public City city = new City("Hometown", 500);
//TODO - Add moneyCheck if statement to ensure the player has more than it cost to buy the stuff before getting the stuff
    public void buySwords(int amount){
        int totalprice = city.getSwordPrice()*amount;
        player.spendMoney(totalprice);
        player.addSwords(amount);
        System.out.println("price of swords: " + city.getSwordPrice());
        System.out.println("Swords in players inventory: " + player.getSwordAmount());
        System.out.println("Money left: " + player.getMoney());
    }
//TODO - Add check if player.getSwords is less or equal to amount of swords selling.
    public void sellSwords(int amount){
        int moneyReceived = (city.getSwordPrice()-10)*amount;
        player.receiveMoney(moneyReceived);
        player.addSwords(-amount);
        System.out.println(player.getMoney());
        System.out.println(player.getSwordAmount());
    }
//TODO - Add goToNewCity method, changing city and displaying costs + fee for travel to new city.
}
