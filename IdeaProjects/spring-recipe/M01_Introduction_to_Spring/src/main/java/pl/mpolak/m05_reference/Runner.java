package pl.mpolak.m05_reference;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pl.mpolak.m05_reference.sequence.SequenceGenerator;

/**
 * Created by Mariola on 2015-02-23.
 */
public class Runner {

    public static void main(String[] args) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("m05/beans.xml");

        SequenceGenerator sequenceGenerator =
                context.getBean("sequenceGenerator1", SequenceGenerator.class);

        String sequence = sequenceGenerator.getSequence();
        System.out.println(sequence);

    }
}
