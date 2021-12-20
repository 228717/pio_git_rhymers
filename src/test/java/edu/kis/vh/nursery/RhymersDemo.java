package edu.kis.vh.nursery;

import edu.kis.vh.nursery.factory.DefaultRhymersFactory;
import edu.kis.vh.nursery.factory.RhymersFactory;

class RhymersDemo {

	public static final int LOOP_CONDITION = 15;
	public static final int TOTAL_REJECTED = 3;
	public static final int BOUND = 20;


	public static void main(String[] args) {
		RhymersFactory factory = new DefaultRhymersFactory();
		
		DefaultCountingOutRhymer[] rhymers = { factory.getStandardRhymer(), factory.getFalseRhymer(),
				factory.getFIFORhymer(), factory.getHanoiRhymer()};
		
		for (int i = 1; i <LOOP_CONDITION; i++)
			for (int j = 0; j <TOTAL_REJECTED; j++)
				rhymers[j].countIn(i);
		
		java.util.Random rn = new java.util.Random();
		for (int i = 1; i < LOOP_CONDITION; i++)
			rhymers[TOTAL_REJECTED].countIn(rn.nextInt(BOUND));
		
		for (int i = 0; i < rhymers.length; i++) {
			while (!rhymers[i].callCheck())
				System.out.print(rhymers[i].countOut() + "  ");
			System.out.println();
		}
		
		System.out.println("total rejected is "
				+ ((HanoiRhymer) rhymers[TOTAL_REJECTED]).reportRejected());
		
	}
	
}