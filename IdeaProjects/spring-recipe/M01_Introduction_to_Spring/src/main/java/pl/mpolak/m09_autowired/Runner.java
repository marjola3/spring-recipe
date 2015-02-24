package pl.mpolak.m09_autowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pl.mpolak.m09_autowired.sequence.SequenceGenerator;

/**
 * Created by Mariola on 2015-02-24.
 */
public class Runner {

    public static void main(String[] args) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("m09/beans.xml");

        SequenceGenerator sequenceGenerator =
                context.getBean("sequenceGenerator", SequenceGenerator.class);

        String sequence = sequenceGenerator.getSequence();
        System.out.println(sequence);
    }
}
