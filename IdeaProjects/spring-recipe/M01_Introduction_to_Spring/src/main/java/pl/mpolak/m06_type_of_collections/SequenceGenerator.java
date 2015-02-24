package pl.mpolak.m06_type_of_collections;

import java.text.DecimalFormat;
import java.util.List;

/**
 * Created by Mariola on 2015-02-24.
 */
public class SequenceGenerator {

    private String prefix;
    private List<Integer> suffixes;
    private int initial;
    private int counter;

    public SequenceGenerator() {}

    public SequenceGenerator(String prefix, List<Integer> suffixes, int initial) {
        this.prefix = prefix;
        this.suffixes = suffixes;
        this.initial = initial;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public void setSuffixes(List<Integer> suffixes) {
        this.suffixes = suffixes;
    }

    public void setInitial(int initial) {
        this.initial = initial;
    }

    public synchronized String getSequence() {
        StringBuffer buffer = new StringBuffer();
        buffer.append(prefix);
        buffer.append(initial + counter++);
        DecimalFormat formatter = new DecimalFormat("0000");
        for (int suffix : suffixes) {
            buffer.append("-");
            buffer.append(formatter.format(suffix));
        }
        return buffer.toString();
    }
}
