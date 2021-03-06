/*
 * Copyright 2014 Groupon, Inc
 *
 * Groupon licenses this file to you under the Apache License, version 2.0
 * (the "License"); you may not use this file except in compliance with the
 * License.  You may obtain a copy of the License at:
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

package org.killbill.billing.plugin.adyen.api;

import java.net.URISyntaxException;
import java.util.Map;
import java.util.UUID;

import org.killbill.billing.plugin.api.payment.PluginHostedPaymentPageFormDescriptor;

public class AdyenHostedPaymentPageFormDescriptor extends PluginHostedPaymentPageFormDescriptor {

    public AdyenHostedPaymentPageFormDescriptor(final UUID kbAccountId, final String formUrl, final Map<String, String> queryParams) throws URISyntaxException {
        super(kbAccountId, formUrl, queryParams);
    }
}
