package io.github.dafinoer.task1;

import java.util.ArrayList;

import io.github.dafinoer.task1.model.Listing;

/**
 * Created by dafinoer on 10/01/18.
 */

public class IterateListing implements ListDao {
    @Override
    public ArrayList<String> iterateNumber(Listing p) {
        ArrayList<String> list = new ArrayList<>();

        int first = p.getFirst();
        int second = p.getSecond();
        for (int i = first; i <= second; i++) {
            if (i % 3 == 0 || i % 4 == 0) {
                if (i % 3 == 0 && i % 4 == 0) {

                    list.add("yey");

                } else{

                    list.add(String.valueOf(i));
                }
            }
        }

        return list;
    }
}
