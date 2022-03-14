package pres;

import metier.iMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.applet.AppletContext;

public class PresSpringXML {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        iMetier metier = (iMetier) context.getBean("metier");
        System.out.println(metier.calcul());
    }
}
