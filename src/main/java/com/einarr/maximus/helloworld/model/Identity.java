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

package com.einarr.maximus.helloworld.model;

public final class Identity {
    /**
     * Variable stores the unique identifier of the environment, where application is running, or was executed.
     */
    private String environmentId;
    /**
     * Variable stores the name of the user account, who executed the application.
     */
    private String userName;

    private Identity() {
    }

    private Identity(final String envId, final String name) {
        this.environmentId = envId;
        this.userName = name;
    }

    public static Identity of(final String environmentId, final String userName) {
        return new Identity(environmentId, userName);
    }

    public String getEnvironmentId() {
        return environmentId;
    }

    public void setEnvironmentId(final String envId) {
        this.environmentId = envId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(final String name) {
        this.userName = name;
    }

    //TODO Implement hashCode, equals and toString methods here
}
