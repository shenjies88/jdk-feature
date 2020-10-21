package com.shenjies88.jdkfeature.jdk10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.stream.Stream;

/**
 * @author shenjies88
 * @since 2020/10/21-9:14 PM
 */
public class VarExample {

    public static void main(String[] args) {
        var hashMap = new HashMap<String, String>();
        hashMap.put("微信", "wn8398");
        var string = "hello java 10";
        var stream = Stream.of(1, 2, 3, 4);
        var list = new ArrayList<String>();
    }
}
