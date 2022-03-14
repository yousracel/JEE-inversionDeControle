package dao;

import org.springframework.stereotype.Component;

@Component("dao")
public class DaoImpl implements iDao {


    @Override
    public double getData() {
        // se connecter a la bd
        System.out.println("version BD");
        double temp=Math.random()*40;
        return temp;
    }
}
