package org.demo.birds.store;
import org.demo.birds.entities.Bird;

import javax.naming.Name;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/**
 * Отнаследоваться от AbstractBirdStore.
 *
 * Реализовать паттерн Singleton.
 */
public class BirdStore extends AbstractBirdStore{
//    public final static BirdStore BIRD_STORE = new BirdStore();

    private ArrayList bird = new ArrayList();
    private Map<Name, Bird> allBird;

//    public static BirdStore birdStore() {
//        return BIRD_STORE;
//    }

    @Override
    public void addBird(Bird b) {
        if (b.equals(bird)) {
            System.out.println("Bird With name .... already exists");
        } else bird.add(b);
    }

    @Override
    public Bird searchByName(String nameToSearch) {
        if(allBird.keySet().equals(nameToSearch)){
            return new Bird();
        }

        return null;
    }

    @Override
    public List searchByLivingArea(String livingAreaToFind) {
        return null;
    }

}
