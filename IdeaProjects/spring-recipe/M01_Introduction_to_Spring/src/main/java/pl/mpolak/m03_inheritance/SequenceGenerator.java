package pl.mpolak.m03_inheritance;

import java.util.List;
import java.util.Map;

/**
 * Created by Mariola on 2015-02-22.
 */
public class SequenceGenerator {

    private PrefixGenerator prefixGenerator;

    private List<String> suffixes;

    private int initial;

    private int counter;

    public SequenceGenerator() {
    }

    public SequenceGenerator(PrefixGenerator prefixGenerator, List<String> suffixes, int initial) {
        this.prefixGenerator = prefixGenerator;
        this.suffixes = suffixes;
        this.initial = initial;
    }

    public void setPrefixGenerator(PrefixGenerator prefixGenerator) {
        this.prefixGenerator = prefixGenerator;
    }

    public void setSuffixes(List<String> suffixes) {
        this.suffixes = suffixes;
    }

    public void setInitial(int initial) {
        this.initial = initial;
    }

    public synchronized String getSequence() {
        StringBuilder sBuffer = new StringBuilder();
        sBuffer.append(prefixGenerator.generate());
        sBuffer.append(initial + counter++);
        for (Object suffix : suffixes) {
            sBuffer.append("-");
            sBuffer.append(suffix);
        }
        return sBuffer.toString();
    }
}
