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
package com.cola.libs.cache.management;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.cache.CacheManager;

/**
 * cola
 * Created by jiachen.shi on 8/26/2016.
 */
public class CacheManagerFactory implements DisposableBean {

    private static CacheManager cacheManager;

    public static CacheManager getCacheManager() {
        return cacheManager;
    }

    public void setCacheManager(CacheManager cacheManager) {
        this.cacheManager = cacheManager;
    }

    @Override
    public void destroy() throws Exception {
        cacheManager = null;
    }
}