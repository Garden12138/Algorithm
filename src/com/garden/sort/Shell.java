package com.garden.sort;
/**
 * 希尔算法
 * @author Garden
 * 2018年8月4日
 */
public class Shell<T extends Comparable<T>> extends Sort<T>{

	@Override
	public void sort(T[] nums) {
		// TODO Auto-generated method stub
		int N = nums.length;
		int h = 1;
		while(h < N/3){
			h = h * 3 + 1;
		}
		while(h >= 1){
			for(int i = h; i < N; i++){
				for(int j = i; j >= h; j -= h){
					if(less(nums[j],nums[j-h])){
						swap(nums,j,j-h);
					}
				}
			}
			h = h / 3;
		}
	}

}
