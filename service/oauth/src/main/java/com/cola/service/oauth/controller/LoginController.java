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
package com.cola.service.oauth.controller;

import com.cola.lib.beans.web.restful.ResponseMessage;
import com.cola.lib.beans.vo.UserLogin;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * cola
 * Created by jiachen.shi on 6/21/2016.
 */
@RestController
public class LoginController {

    public @ResponseBody
    ResponseMessage login(@RequestBody UserLogin userLogin){
        return ResponseMessage.ok(null);
    }

}
