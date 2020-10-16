package com.shenjies88.jdkfeature.jdk9;


import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 集合 Stream Optional示例
 *
 * @author shenjies88
 * @since 2020/10/16/11:45
 */
public class CollectionExample {

    public static void main(String[] args) {
        collectionFun();
        streamFun();
        optionalFun();

    }

    static void collectionFun() {
        //创建不可变集合
        System.err.println("创建不可变集合Test");
        System.err.println(List.of());
        System.err.println(List.of("Hello", "World"));
        System.err.println(List.of(1, 2, 3));
        System.err.println(Set.of());
        System.err.println(Set.of("Hello", "World"));
        System.err.println(Set.of(1, 2, 3));
        System.err.println(Map.of());
        System.err.println(Map.of("Hello", 1, "World", 2));
    }

    static void streamFun() {
        //有序元素则删除掉一个后立即返回
        final long ocount = Stream.of(1, 2, 3, 4, 5)
                .dropWhile(i -> i % 2 != 0)
                .count();
        System.err.println("dropWhile有序元素" + ocount);
        //无序元素完整遍历
        final long unocount = Stream.of(1, 1, 1, 0, 4, 5)
                .dropWhile(i -> i % 2 != 0)
                .count();
        System.err.println("dropWhile无序元素" + unocount);

        final long otcount = Stream.of(1, 2, 3, 4, 5)
                .takeWhile(i -> i % 2 != 0)
                .count();
        System.err.println("takeWhile有序元素" + otcount);
        final long unotcount = Stream.of(1, 1, 1, 0, 4, 5)
                .takeWhile(i -> i % 2 != 0)
                .count();
        System.err.println("takeWhile无序元素" + unotcount);

        final List<Integer> result = Stream.of("a", "ab", "abc")
                .collect(Collectors.flatMapping(v -> v.chars().boxed(),
                        Collectors.toList()));
        System.err.println("Collectors.flatMapping" + result);
    }

    static void optionalFun() {
        final long count = Stream.of(
                Optional.of(1),
                Optional.empty(),
                Optional.of(2)
        ).flatMap(Optional::stream).count();
        System.err.println("Optional " + count);
    }

}
