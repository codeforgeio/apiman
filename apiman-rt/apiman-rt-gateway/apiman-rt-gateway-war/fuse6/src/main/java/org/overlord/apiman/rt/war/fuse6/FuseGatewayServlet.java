/*
 * Copyright 2014 JBoss Inc
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.overlord.apiman.rt.war.fuse6;

import org.overlord.apiman.rt.api.rest.impl.IEngineAccessor;
import org.overlord.apiman.rt.engine.IEngine;
import org.overlord.apiman.rt.gateway.servlet.GatewayServlet;
import org.overlord.commons.services.ServiceRegistryUtil;

/**
 * Fuse version of the gateway servlet.
 *
 * @author eric.wittmann@redhat.com
 */
public class FuseGatewayServlet extends GatewayServlet {

    private static final long serialVersionUID = -2206325158260259252L;

    /**
     * Constructor.
     */
    public FuseGatewayServlet() {
    }

    /**
     * @see org.overlord.apiman.rt.gateway.servlet.GatewayServlet#getEngine()
     */
    @Override
    protected IEngine getEngine() {
        return ServiceRegistryUtil.getSingleService(IEngineAccessor.class).getEngine();
    }

}
