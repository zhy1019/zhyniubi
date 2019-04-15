package com.sp.service.vip;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
public class GebhTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GebhTest as=new GebhTest();
		Scanner sc=new Scanner(System.in);
		System.out.println("输入一个数");
		int sum=sc.nextInt();
		for(int i=2;i<sum;i++){
			if(as.suzhu(i)&&as.suzhu(sum-i)){
				System.out.println(sum+"="+i+"+"+(sum-i));
			}
		}
	
	
}
	/*
	 * 判断是否是素数
	 * */
	public static boolean suzhu(int s){
		for(int i=2;i<s;i++){
			if(s%i==0){
				return false;
			}
		}
		return true;
	}
	
}
