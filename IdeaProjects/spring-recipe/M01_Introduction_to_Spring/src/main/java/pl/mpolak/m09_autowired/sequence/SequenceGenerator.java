package pl.mpolak.m09_autowired.sequence;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Mariola on 2015-02-23.
 */
public class SequenceGenerator {

    private PrefixGenerator prefixGenerator;

    private String suffix;

    private int initial;

    private int counter;

    public SequenceGenerator() {
    }

    public SequenceGenerator(PrefixGenerator prefixGenerator, String suffix, int initial) {
        this.prefixGenerator = prefixGenerator;
        this.suffix = suffix;
        this.initial = initial;
    }

    @Autowired
    public void setPrefixGenerator(PrefixGenerator prefixGenerator) {
        this.prefixGenerator = prefixGenerator;
    }


    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    public void setInitial(int initial) {
        this.initial = initial;
    }

    public synchronized String getSequence() {
        StringBuilder sBuffer = new StringBuilder();
        sBuffer.append(prefixGenerator.getPrefix());
        sBuffer.append(initial + counter++);
        sBuffer.append(suffix);
        return sBuffer.toString();
    }
}
