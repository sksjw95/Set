package set;

import com.sun.source.tree.Tree;

import java.util.TreeSet;

public class Main2 {
    public static void main(String[] args){
        // TreeSet 생성
        TreeSet<String> worker = new TreeSet<>();

        // TreeSet에 요소 추가
        worker.add("Lee Java");
        worker.add("Park Hacker");
        worker.add("Kim Coding");

        System.out.println(worker);
        System.out.println(worker.first());
        System.out.println(worker.last());
        System.out.println(worker.higher("Lee"));
        System.out.println(worker.lower("Lee"));
        System.out.println(worker.subSet("Kim","Park"));
    }
}
