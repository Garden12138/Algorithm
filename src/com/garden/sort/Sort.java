package com.garden.sort;
/**
 * 排序抽象类
 * @author Garden
 * 2018年8月3日
 */
public abstract class Sort<T extends Comparable<T>> {
	
	/*抽象排序方法*/
	public abstract void sort(T[] nums);
	
	/*具体比较方法*/
	protected boolean less(T t1 , T t2){
		return t1.compareTo(t2) < 0;
	}
	
	/*具体交换方法*/
	protected void swap(T[] arr, int i , int j){
		T t = arr[i];
		arr[i] = arr[j];
		arr[j] = t;
	}
}
