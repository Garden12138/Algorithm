package com.garden.sort;
/**
 * 冒泡排序
 * @author Garden
 * 2018年8月4日
 */
public class Bubble<T extends Comparable<T>> extends Sort<T>{

	@Override
	public void sort(T[] nums) {
		// TODO Auto-generated method stub
		int N = nums.length;
		boolean hasSorted = false;
		for(int i = 0; i < N && !hasSorted; i++){
			hasSorted = true;
			for(int j = 0; j < N - 1 -i; j++){
				if(less(nums[j+1],nums[j])){
					swap(nums,j,j+1);
					hasSorted = false;
				}
			}
		}
	}

}
