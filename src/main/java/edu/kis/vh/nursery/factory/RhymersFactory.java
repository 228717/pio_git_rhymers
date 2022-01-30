package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.DefaultCountingOutRhymer;

public interface RhymersFactory {

    public DefaultCountingOutRhymer getStandardRhymer(); //TODO: public jest tu zbędne

    public DefaultCountingOutRhymer getFalseRhymer(); //TODO: public jest tu zbędne

    public DefaultCountingOutRhymer getFIFORhymer(); //TODO: public jest tu zbędne

    public DefaultCountingOutRhymer getHanoiRhymer(); //TODO: public jest tu zbędne

}
