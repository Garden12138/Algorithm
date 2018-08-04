package com.garden.sort;
/**
 * 插入算法
 * @author Garden
 * 2018年8月4日
 */
public class Insertion<T extends Comparable<T>> extends Sort<T>{

	@Override
	public void sort(T[] nums) {
		// TODO Auto-generated method stub
		int N = nums.length;
		for(int i = 1; i < N; i++){
			for(int j = i; j > 0; j--){
				if(less(nums[j],nums[j-1])){
					swap(nums,j-1,j);
				}
			}
		}
	}

}
