package com.garden.test;

import java.util.Scanner;

import com.garden.sort.Bubble;
import com.garden.sort.Insertion;
import com.garden.sort.QuickSort;
import com.garden.sort.Selection;
import com.garden.sort.Shell;
import com.garden.sort.Up2DownMergeSort;

/**
 * 排序算法测试类
 * @author Garden
 * 2018年8月3日
 */
public class SortTest {
	
	private static Integer[] getNumberInput(){
		Scanner in = new Scanner(System.in);
		String strArr[] = in.nextLine().split(",");
		Integer[] intArr = new Integer[strArr.length];
		for(int i = 0; i < strArr.length; i++){
			intArr[i] = Integer.valueOf((strArr[i]));
		}
		return intArr;
	}
	
	private static void output(Integer[] intArr){
		for(int i = 0; i < intArr.length; i++){
			if(i == intArr.length - 1){
				System.out.println(intArr[i]);
				break;
			}
			System.out.print(intArr[i]+",");
		}
	}
	
	public static void main(String[] args){
		//以"4,3,2,1"格式输入
		Integer[] intArr = getNumberInput();
		
		//排序算法...
		//选择排序
//		Selection selection = new Selection();
//		selection.sort(intArr);
		
		//冒泡算法
//		Bubble bubble = new Bubble();
//		bubble.sort(intArr);
		
		//插入排序
//		Insertion insertion = new Insertion();
//		insertion.sort(intArr);
		
		//希尔排序
//		Shell shell = new Shell();
//		shell.sort(intArr);
		
		//快速排序
//		QuickSort quickSort = new QuickSort();
//		quickSort.sort(intArr);
		
		Up2DownMergeSort up2DownMergeSort = new Up2DownMergeSort();
		up2DownMergeSort.sort(intArr);
		
		//以"1,2,3,4"格式输出
		output(intArr);
	}
	
}
