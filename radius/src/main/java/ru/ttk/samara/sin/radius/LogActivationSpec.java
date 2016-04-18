package ru.ttk.samara.sin.radius;

import javax.resource.ResourceException;
import javax.resource.spi.ActivationSpec;
import javax.resource.spi.InvalidPropertyException;
import javax.resource.spi.ResourceAdapter;
import javax.resource.spi.work.Work;

/**
 * Created by 1 on 14.04.2016.
 */
class LogActivationSpec implements ActivationSpec {

    @Override
    public void validate() throws InvalidPropertyException {

    }

    @Override
    public ResourceAdapter getResourceAdapter() {
        return null;
    }

    @Override
    public void setResourceAdapter(ResourceAdapter resourceAdapter) throws ResourceException {

    }
}