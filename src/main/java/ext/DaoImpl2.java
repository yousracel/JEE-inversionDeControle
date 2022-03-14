package ext;

import dao.iDao;

public class DaoImpl2 implements iDao {

    @Override
    public double getData() {
        System.out.println("version capteur");
        double temp=1500;
        return temp;
    }
}
