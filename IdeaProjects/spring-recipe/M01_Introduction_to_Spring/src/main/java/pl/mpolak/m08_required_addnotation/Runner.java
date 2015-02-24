package pl.mpolak.m08_required_addnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pl.mpolak.m08_required_addnotation.sequence.SequenceGenerator;

/**
 * Created by Mariola on 2015-02-24.
 */
public class Runner {

    public static void main(String[] args) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("m08/beans.xml");

        SequenceGenerator sequenceGenerator =
                context.getBean("sequenceGenerator1", SequenceGenerator.class);

        String sequence = sequenceGenerator.getSequence();
        System.out.println(sequence);
    }
}
