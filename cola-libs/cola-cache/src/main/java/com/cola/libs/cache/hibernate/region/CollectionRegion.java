/*
 * Copyright 2002-${Year} the original author or authors.
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
package com.cola.libs.cache.hibernate.region;

import com.cola.libs.cache.hibernate.strategy.AbstractRegionAccessStrategy;
import com.cola.libs.cache.hibernate.strategy.AccessStrategyAdapter;

import org.hibernate.cache.CacheException;
import org.hibernate.cache.spi.CacheDataDescription;
import org.hibernate.cache.spi.access.AccessType;
import org.hibernate.cache.spi.access.CollectionRegionAccessStrategy;
import org.hibernate.cfg.Settings;
import org.springframework.cache.Cache;

import java.util.Properties;

/**
 * cola
 * Created by jiachen.shi on 8/29/2016.
 */
public class CollectionRegion extends AbstractTransactionalDataRegion implements org.hibernate.cache.spi.CollectionRegion {

    public CollectionRegion(String regionName, Cache cache, Properties properties, Settings settings, CacheDataDescription metaData) {
        super(regionName, cache, properties, settings, metaData);
    }

    @Override
    public CollectionRegionAccessStrategy buildAccessStrategy(AccessType accessType) throws CacheException {
        return new CollectionRegion.AccessStrategy(this.createAccessStrategy(accessType));
    }

    private class AccessStrategy extends AbstractRegionAccessStrategy implements CollectionRegionAccessStrategy {
        private AccessStrategy(AccessStrategyAdapter stgy) {
            super(stgy);
        }

        public org.hibernate.cache.spi.CollectionRegion getRegion() {
            return CollectionRegion.this;
        }
    }

}