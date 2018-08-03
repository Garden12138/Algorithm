package com.garden.sort;
/**
 * 选择排序
 * @author Garden
 * 2018年8月3日
 */
public class Selection<T extends Comparable<T>> extends Sort<T>{

	@Override
	public void sort(T[] nums) {
		// TODO Auto-generated method stub
		int N = nums.length;
		for(int i = 0; i < N; i++){
			int min = i;
			for(int j = i + 1; j < N; j++){
				if(less(nums[min],nums[j])){
					continue;
				}
				min = j;
			}
			swap(nums,i,min);
		}
	}

}
