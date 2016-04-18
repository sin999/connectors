package ru.ttk.samara.sin.radius;

import javax.resource.ResourceException;
import javax.resource.spi.ActivationSpec;
import javax.resource.spi.BootstrapContext;
import javax.resource.spi.ResourceAdapter;
import javax.resource.spi.ResourceAdapterInternalException;
import javax.resource.spi.endpoint.MessageEndpointFactory;
import javax.transaction.xa.XAResource;

/**
 * Created by 1 on 14.04.2016.
 */
public class LogResourceAdapter implements ResourceAdapter {
    @Override
    public void start(BootstrapContext bootstrapContext) throws ResourceAdapterInternalException {
        
    }

    @Override
    public void stop() {

    }

    @Override
    public void endpointActivation(MessageEndpointFactory messageEndpointFactory, ActivationSpec activationSpec) throws ResourceException {

    }

    @Override
    public void endpointDeactivation(MessageEndpointFactory messageEndpointFactory, ActivationSpec activationSpec) {

    }

    @Override
    public XAResource[] getXAResources(ActivationSpec[] activationSpecs) throws ResourceException {
        return new XAResource[0];
    }
}
