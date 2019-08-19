package android.example.gameeconemy;

import android.example.gameeconemy.Model.City;
import android.example.gameeconemy.Model.GameWorld;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }

    public static void main(String[] args) {
        int d = 5;
        City city = new City("Town", 10000);
        System.out.println(city.getIronPrice());
        System.out.println(city.getSwordPrice());
        System.out.println(city.getPopulation());
        d-=-5;
        System.out.println(d);
        d+=-5;
        System.out.println(d);
        GameWorld gameWorld = new GameWorld();
        gameWorld.buySwords(2);
        gameWorld.sellSwords(2);

    }
}