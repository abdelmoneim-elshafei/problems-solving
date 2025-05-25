package com.noob;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class CommonProblems {
    // [2,7,11,15] -> 9
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {

            if (map.containsKey(target - nums[i]))
                return new int[]{map.get(target - nums[i]), i};
            else
                map.put(nums[i], i);
        }
        return null;
    }

    public int[] twoSum2(int[] nums, int target) {
        for (int i = 0, j = nums.length - 1; i < nums.length && j > 0; ) {
            if (nums[i] + nums[j] == target)
                return new int[]{i + 1, j + 1};
            else if (nums[i] + nums[j] > target)
                j--;
            else
                i++;
        }
        return new int[]{0, 0};
    }

    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        int longest = 1;
        for (int e : set) {
            if (!set.contains(e - 1)) {
                int count = 1;
                while (set.contains(e + count)) {
                    count++;
                }
                longest = Math.max(longest, count);
            }
        }
        return longest;
    }

    public void reverseString(char[] s) {
        for (int i = 0, j = s.length - 1; i < s.length / 2 + 1 && j > s.length / 2 - 1; i++, j--) {
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
        }
    }

    public int trappingRainWater(int[] height) {
        int right = height.length - 1;
        int left = 0;
        int maxRight = height[right];
        int maxLeft = height[left];
        int water = 0;
        while (left < right) {
            if (maxLeft < maxRight) {
                left++;
                maxLeft = Math.max(maxLeft, height[left]);
                water += maxLeft - height[left];
            } else {
                right--;
                maxRight = Math.max(maxRight, height[right]);
                water += maxRight - height[right];
            }
        }
        return water;
    }

    public int bestTimeToBuyAndSellStock(int[] prices) {
        int min = prices[0];
        int max = 0;
        for (int i = 1; i < prices.length; i++) {
            min = Math.min(min, prices[i]);
            max = Math.max(max, prices[i] - min);
        }
        return max;
    }

    public int characterReplacement(String s, int k) {




/*        int[] count = new int[26];
        int left = 0;
        int right = 0;
        int max = 0;
        while (right < s.length()) {
            count[s.charAt(right) - 'A']++;
            max = Math.max(max, count[s.charAt(right) - 'A']);
            while (right - left + 1 - max > k) {
                count[s.charAt(left) - 'A']--;
                left++;
            }
            right++;
        }
        return right - left;*/
        return 0;
    }


}
