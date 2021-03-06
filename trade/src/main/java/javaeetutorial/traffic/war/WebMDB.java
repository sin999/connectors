/**
 * Copyright (c) 2014 Oracle and/or its affiliates. All rights reserved.
 *
 * You may not modify, use, reproduce, or distribute this software except in
 * compliance with  the terms of the License at:
 * http://java.net/projects/javaeetutorial/pages/BerkeleyLicense
 */
package javaeetutorial.traffic.war;

import javax.ejb.MessageDriven;
import javax.inject.Named;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import java.util.logging.Level;
import java.util.logging.Logger;

/* This bean asynchronously receives messages from a JMS
 * topic and calls a WebSocket server endpoint */
@Named
@MessageDriven(mappedName = "java:app/traffic-ejb/traffictopic")
public class WebMDB implements MessageListener {

    private static final Logger log = Logger.getLogger("WebSocketMDB");
    
    @Override
    public void onMessage(Message msg) {
        try {
            log.info("[WebMDB] onMessage()");
            String smsg = msg.getBody(String.class);
            log.log(Level.INFO, "[WebMDB] Received: {0}", smsg);
            TrafficEndpoint.sendAll(smsg);
        } catch (JMSException ex) {
            log.log(Level.INFO, "[WebMDB] Exception: {0}", ex.getMessage());
        }
    }

}
