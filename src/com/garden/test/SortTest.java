package com.garden.test;

import java.util.Scanner;

/**
 * 排序算法测试类
 * @author Garden
 * 2018年8月3日
 */
public class SortTest {
	
	private static int[] getNumberInput(){
		Scanner in = new Scanner(System.in);
		String strArr[] = in.nextLine().split(",");
		int intArr[] = new int[strArr.length];
		for(int i = 0; i < strArr.length; i++){
			intArr[i] = Integer.parseInt(strArr[i]);
		}
		return intArr;
	}
	
	private static void output(int[] intArr){
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
		int[] intArr = getNumberInput();
		//排序算法...
		
		//以"1,2,3,4"格式输出
		output(intArr);
	}
	
}
