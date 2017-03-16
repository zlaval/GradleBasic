package com.zlrx.javadevzed.gradlebasics;

import org.apache.commons.lang3.RandomStringUtils;

public class Main {

    public static void main(String[] args) {
        String randomString = RandomStringUtils.randomAlphabetic(8);
        System.out.println(randomString);
    }

}
