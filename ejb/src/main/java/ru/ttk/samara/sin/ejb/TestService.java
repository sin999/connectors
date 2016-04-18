package ru.ttk.samara.sin.ejb;

import javax.ejb.Local;
import javax.ejb.Remote;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by 1 on 09.04.2016.
 */
@Local
public interface TestService extends Serializable {
    Date getDate();
}
