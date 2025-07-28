package com.epam.mjc.collections.combined;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class DeveloperProjectFinder {
    public List<String> findDeveloperProject(Map<String, Set<String>> projects, String developer) {
        List<String> res = new ArrayList<String>();
        for (Map.Entry<String, Set<String>> s: projects.entrySet()) {
            if (s.getValue().contains(developer)) {
                res.add(s.getKey());
            }
        }
        Collections.sort(res, new Comparator<String>() {
            @Override
            public int compare(String str1, String str2) {
                int lengthcompare = Integer.compare(str1.length(), str2.length());
                if (lengthcompare != 0) {
                    return lengthcompare;
                } 
                return str1.compareTo(str2);
            }
        });
        return res;
    }
  /*   public static void main(String[] args) {
        Map<String, Set<String>> m = new HashMap<String, Set<String>>();
        m.put("CSO", Set.of("Ivan", "Anna", "Lidia", "Antony"));
        m.put("VVaS", Set.of("Mary", "Ben", "Max"));
        m.put("LJA", Set.of("Oleg", "Ivan", "Alex"));
        System.out.println(findDeveloperProject(m, "Ivan")); 
    }*/
}
