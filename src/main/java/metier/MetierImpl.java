package metier;

import dao.iDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("metier")
public class MetierImpl implements iMetier {
    @Autowired

    private iDao dao; //couplage faible
    @Override
    public double calcul() {
        double tmp= dao.getData();
        double res=tmp*540/Math.cos(tmp*Math.PI);
        return res;
    }
    //injecter dans la var dao un objet d'une classe qui implemente l'interface iDao
    public void setDao(iDao dao) {
        this.dao = dao;
    }
}
