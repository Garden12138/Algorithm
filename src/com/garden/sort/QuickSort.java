package com.garden.sort;
/**
 * 快速排序
 * @author Garden
 * 2018年8月5日
 */
public class QuickSort<T extends Comparable<T>> extends Sort<T> {

	@Override
	public void sort(T[] nums) {
		// TODO Auto-generated method stub
		int N = nums.length;
		sort(nums,0,N-1);
	}
	
	private void sort(T[] nums, int l, int h){
		if(l >= h){
			return;
		}
		int j = partition(nums,l,h);
		sort(nums,l,j-1);
		sort(nums,j+1,h);
	}
	
	private int partition(T[] nums, int l, int h){
		int i = l;
		int j = h + 1;
		T v = nums[l];
		while(true){
			while(less(nums[++i],v) && i != h);
			while(less(v,nums[--j]) && j != l);
			if(i >= j){
				break;
			}
			swap(nums,i,j);
		}
		swap(nums,l,j);
		return j;
	}
}
