package ru.ttk.samara.sin.ejb;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import java.util.Date;

/**
 * Created by 1 on 09.04.2016.
 */
@Stateless
@LocalBean
public class TestEAO {

    public Date getDate(){
        return new Date();
    }
}
