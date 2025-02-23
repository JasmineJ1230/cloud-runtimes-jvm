/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package group.rxcloud.cloudruntimes.domain.core.state;

import java.util.Collections;
import java.util.List;
import java.util.Map;

public class ExecuteStateTransactionRequest {

    /**
     * Name of the state store.
     */
    private final String stateStoreName;

    /**
     * Transactional operations list.
     */
    private List<group.rxcloud.cloudruntimes.domain.core.state.TransactionalStateOperation<?>> operations;

    /**
     * Metadata used for transactional operations.
     */
    private Map<String, String> metadata;

    public ExecuteStateTransactionRequest(String stateStoreName) {
        this.stateStoreName = stateStoreName;
    }

    public String getStateStoreName() {
        return stateStoreName;
    }

    public ExecuteStateTransactionRequest setOperations(List<group.rxcloud.cloudruntimes.domain.core.state.TransactionalStateOperation<?>> operations) {
        this.operations = operations == null ? null : Collections.unmodifiableList(operations);
        return this;
    }

    public List<TransactionalStateOperation<?>> getOperations() {
        return operations;
    }

    public ExecuteStateTransactionRequest setMetadata(Map<String, String> metadata) {
        this.metadata = metadata == null ? null : Collections.unmodifiableMap(metadata);
        return this;
    }

    public Map<String, String> getMetadata() {
        return metadata;
    }
}
