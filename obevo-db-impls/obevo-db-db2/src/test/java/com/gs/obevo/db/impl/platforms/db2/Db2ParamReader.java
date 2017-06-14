/**
 * Copyright 2017 Goldman Sachs.
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.gs.obevo.db.impl.platforms.db2;

import com.gs.obevo.db.testutil.ParamReader;
import com.typesafe.config.ConfigFactory;
import org.eclipse.collections.impl.factory.Maps;

public class Db2ParamReader {
    public static ParamReader getParamReader() {
        return new ParamReader(ConfigFactory.parseResources("db2-creds.properties"), "db2", ConfigFactory.parseMap(Maps.mutable.<String, Object>of(
                "sysattrs.type", "DB2",
                "sysattrs.autoReorgEnabled", "true",
                "sysattrs.metadataLineReaderVersion", "3",
                "logicalSchemas.schema1", "DEPLOY_TRACKER"
        )));
    }
}