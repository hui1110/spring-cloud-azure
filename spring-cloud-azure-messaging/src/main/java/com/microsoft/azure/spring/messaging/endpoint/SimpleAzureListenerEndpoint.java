/*
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See LICENSE in the project root for
 * license information.
 */

package com.microsoft.azure.spring.messaging.endpoint;

import com.microsoft.azure.spring.messaging.container.MessageListenerContainer;
import com.microsoft.azure.spring.messaging.listener.AzureMessageHandler;
import lombok.Getter;
import lombok.Setter;
import org.springframework.lang.Nullable;

/**
 * A simple {@link AzureListenerEndpoint} simply providing the {@link AzureMessageHandler} to
 * invoke to process an incoming message for this endpoint.
 *
 * @author Warren Zhu
 */
@Getter
@Setter
public class SimpleAzureListenerEndpoint extends AbstractAzureListenerEndpoint {

    @Nullable
    private AzureMessageHandler azureMessageHandler;

    @Override
    protected AzureMessageHandler createMessageHandler(MessageListenerContainer container) {
        return this.azureMessageHandler;
    }
}