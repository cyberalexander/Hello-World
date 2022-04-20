/*
 * MIT License
 *
 * Copyright (c) 2022 Einarr-Maximus. All rights reserved.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NON-INFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY,
 * WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR
 * IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
package com.einarr.maximus.helloworld.service;

import com.einarr.maximus.helloworld.model.Identity;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class IdentityServiceImplTests {

    /**
     * The instance of the {@link IdentityService} to be tested.
     */
    private final IdentityService service = new IdentityServiceImpl();

    @Test
    void testIdentifyReturnsNotNull() {
        Identity identify = service.identify();
        Assertions.assertNotNull(identify);
    }

    @Test
    void testIdentityUserName() {
        String expected = System.getProperty("user.name");
        String actual = service.identify().getUserName();
        Assertions.assertEquals(expected, actual);
    }

    //@Test
    void testIdentityEnvironmentId() {
        String environmentId = service.identify().getEnvironmentId();
        Assertions.assertNotNull(environmentId);
    }
}
