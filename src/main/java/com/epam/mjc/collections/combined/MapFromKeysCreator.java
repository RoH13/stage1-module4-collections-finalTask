package com.epam.mjc.collections.combined;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapFromKeysCreator {
    public  Map<Integer, Set<String>> createMap(Map<String, Integer> sourceMap) {
        Map <Integer, Set<String>> m = new HashMap<Integer, Set<String>>();
        for (String k : sourceMap.keySet()) {
            int l = k.length();
            if (!m.containsKey(l)) {
                m.put(l, new HashSet<String>(Set.of(k)));
            } else {
                m.get(l).add(k);
            }
        }
        return m;
    }
   /*  public static void main(String[] args) {
        Map <String, Integer> m = new HashMap<String, Integer>(Map.of("one", 1, "two", 2, "three" , 3,
"five" , 4, "ten" , 10));
        System.out.println(createMap(m));
    }*/
}
