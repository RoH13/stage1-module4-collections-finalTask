package com.epam.mjc.collections.combined;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class LessonsGetter {
    public Set<String> getLessons(Map<String, List<String>> timetable) {
        Set<String>res = new HashSet<String>();
        for (Map.Entry<String, List<String>> entry : timetable.entrySet()) {
            res.addAll(entry.getValue());
        }
    
        return res;
    }
   /*  public static void main(String[] args) {
        Map<String, List<String>> m = new HashMap<String,List<String>>();
        m.put("Wendsday", List.of("fds", "fdsf"));
        m.put("thursday", List.of("fds"));
        System.out.println(getLessons(m));
    }*/
}
