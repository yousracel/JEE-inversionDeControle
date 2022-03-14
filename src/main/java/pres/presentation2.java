package pres;

import dao.iDao;
import metier.iMetier;

import java.io.File;
import java.lang.reflect.Method;
import java.util.Scanner;

public class presentation2 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(new File("config.txt"));
        String daoClassName =scanner.nextLine();
        Class cDao=Class.forName(daoClassName);
        iDao dao=(iDao) cDao.newInstance();
        //System.out.println(dao.getData());

        String metierClassName= scanner.nextLine();
        Class cMetier= Class.forName(metierClassName);
        iMetier metier=(iMetier) cMetier.newInstance();

        Method method= cMetier.getMethod("setDao",iDao.class);
        //metier.setDao(dao);=> statique
        method.invoke(metier,dao);

        System.out.println("resultat="+metier.calcul());
    }
}
