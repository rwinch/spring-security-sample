/*
 * Copyright 2002-2013 the original author or authors.
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
package org.springframework.security.sample.config.broke;

import javax.servlet.Filter;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.security.DelegatingWebSecurityConfiguration;
import org.springframework.security.WebSecurityConfigurerAdapter;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.sample.CustomFilter;
import org.springframework.security.sample.CustomAuthenticationManager;

/**
 * @author Rob Winch
 *
 */
@Import(DelegatingWebSecurityConfiguration.class)
@Configuration
public class BrokeWebSecurityConfig extends WebSecurityConfigurerAdapter {
    public AuthenticationManager getAuthenticationManager() {
        return new CustomAuthenticationManager();
    }

    public Filter getCustomFilter() {
        return new CustomFilter();
    }
}
