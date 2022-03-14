package pres;

import metier.iMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PresSpringAnnotations {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("dao", "metier");

        iMetier metier =context.getBean(iMetier.class);

        System.out.println(metier.calcul());

    }
}
