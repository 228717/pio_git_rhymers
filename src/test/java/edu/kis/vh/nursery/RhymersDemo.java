package edu.kis.vh.nursery;

import edu.kis.vh.nursery.factory.DefaultRhymersFactory;
import edu.kis.vh.nursery.factory.RhymersFactory;

class RhymersDemo {

	public static final int START_LOOP_VALUE = 0;
	public static final int START_LOOP_SECOND_VALUE = 1;
	public static final int INDEX = 3;
	public static final int END_LOOP_VALUE = 15;
	public static final int BOUND = 20;

	public static void main(String[] args) {
		RhymersFactory factory = new DefaultRhymersFactory();

		testRhymers(factory);

	}

	private static void testRhymers(RhymersFactory factory) {
		DefaultCountingOutRhymer[] rhymers = { factory.getStandardRhymer(), factory.getFalseRhymer(),
				factory.getFIFORhymer(), factory.getHanoiRhymer()};

		for (int i = START_LOOP_SECOND_VALUE; i < END_LOOP_VALUE; i++)
			for (int j = START_LOOP_VALUE; j < INDEX; j++)
				rhymers[j].countIn(i);

		java.util.Random rn = new java.util.Random();
		for (int i = START_LOOP_SECOND_VALUE; i < END_LOOP_VALUE; i++)
			rhymers[INDEX].countIn(rn.nextInt(BOUND));

		for (int i = START_LOOP_VALUE; i < rhymers.length; i++) {
			while (!rhymers[i].callCheck())
				System.out.print(rhymers[i].countOut() + "  ");
			System.out.println();
		}

		System.out.println("total rejected is "
				+ ((HanoiRhymer) rhymers[INDEX]).reportRejected());
	}

}