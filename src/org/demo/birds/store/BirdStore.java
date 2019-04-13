package org.demo.birds.store;

import org.demo.birds.entities.Bird;

import java.util.*;

/**
 * Отнаследоваться от AbstractBirdStore.
 * <p>
 * Реализовать паттерн Singleton.
 */
public class BirdStore extends AbstractBirdStore {
    public final static BirdStore BIRD_STORE = new BirdStore();

    private Map<String, Bird> birdByName = new HashMap<>();
    private Map<String, List<Bird>> birdByArea = new HashMap<>();

    public static BirdStore birdStore() {
        return BIRD_STORE;
    }

    private BirdStore() {

    }

    @Override
    public void addBird(Bird b) {
        if (birdByName.containsKey(b.getName())) {
            System.out.println("Bird With name .... already exists");
        } else {
            birdByName.putIfAbsent(b.getName(), b);
            //если ареал существует в хранилище, то добавляем птицу в список
            if (birdByArea.containsKey(b.getLivingArea())) {
                List<Bird> birds = birdByArea.get(b.getLivingArea());
                birds.add(b);
            } else {
                birdByArea.put(b.getLivingArea(), new ArrayList<Bird>(Collections.singletonList(b)));
            }

        }
    }

    @Override
    public Bird searchByName(String nameToSearch) {
        return birdByName.get(nameToSearch);
    }

    @Override
    public List searchByLivingArea(String livingAreaToFind) {
        return birdByArea.get(livingAreaToFind);
    }

}
