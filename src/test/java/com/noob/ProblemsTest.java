package com.noob;

import jakarta.enterprise.inject.se.SeContainer;
import jakarta.enterprise.inject.se.SeContainerInitializer;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class ProblemsTest {

    private static SeContainer container;
    private static CommonProblems commonProblems;
    @BeforeAll
    static void setUp() {
        container = SeContainerInitializer.newInstance().initialize();
        commonProblems = container.select(CommonProblems.class).get();
    }

    @Test
    void twoSum() {
        int[] result = commonProblems.twoSum(new int[]{3,12,13,8}, 11);
        System.out.println(result[0] + " " + result[1]);
        assert result[0] == 0 && result[1] == 3;
    }
    @Test
    void twoSum2() {
        int[] result = commonProblems.twoSum2(new int[]{-1,0}, -1);
        System.out.println(result[0] + " " + result[1]);
        assert result[0] == 0 && result[1] == 3;
    }

    @Test
    void longestConsecutive() {
        int result = commonProblems.longestConsecutive(new int[]{100,4,200,1,3,2});
        System.out.println(result);
        assert result == 4;
    }

    @Test
    void reverseString() {
       char[] problem = new char[]{'h','e','l','l','o'};
       commonProblems.reverseString(problem);
        System.out.println(problem);
        assert problem[0] == 'o' && problem[1] == 'l' && problem[2] == 'l' && problem[3] == 'e' && problem[4] == 'h';
    }

    @Test
    void trappingRainWater() {
        int result = commonProblems.trappingRainWater(new int[]{0,1,0,2,1,0,1,3,2,1,2,1});
        System.out.println(result);
        assert result == 6;
    }

    @Test
    void bestTimeToBuyAndSellStock() {
        int result = commonProblems.bestTimeToBuyAndSellStock(new int[]{7,1,5,3,6,4});
        System.out.println(result);
        assert result == 5;
    }

    @AfterAll
    static void tearDown() {
        container.close();
    }
}