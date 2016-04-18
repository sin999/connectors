package ru.ttk.samara.sin.ejb;

import javax.ejb.*;
import java.util.Date;

/**
 * Created by 1 on 09.04.2016.
 */
@Stateless
@LocalBean
public class TestServiceImpl implements TestService {
    @EJB
    private  TestEAO testEAO;

    @Override
    public Date getDate() {
//        return new Date();
        return testEAO.getDate();
    }
}
