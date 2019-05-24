package com.sumpower;

public class SumPower {
	public static final int N = 10;
	public static double power(int n) {
		int i = n;
		double power = 1;
		do {
			power *= n;
			i--;
		} while(i > 0);
		return power;
	}
	public static double sumPower(int n) {
		int i = 1;
		double sum = 0 ;
		do {
			sum += power(i++);
		} while(i <= n);
		return sum;
	}
	public static void main(String[] args) {
		/*���������*/
		System.out.println("��������" + sumPower(SumPower.N));
	}

}
