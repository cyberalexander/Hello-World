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
     * Variable stores the name of the user account, who executed the application.
     */
    private String userName;

    /**
     * Variable stores the host name of the environment, where application is running, or was executed.
     */
    private String host;

    /**
     * Variable stores the unique ip address given to the machine, where application is running, or was executed.
     */
    private String ipAddress;

    private Identity(final String name, final String hostName, final String address) {
        this.userName = name;
        this.host = hostName;
        this.ipAddress = address;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String getUserName() {
        return userName;
    }

    public String getHost() {
        return host;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    @Override
    public String toString() {
        return "Identity{"
                + "userName='" + userName + '\''
                + ", host='" + host + '\''
                + ", ipAddress='" + ipAddress + '\''
                + '}';
    }

    //TODO Implement hashCode, equals and toString methods here

    public static final class Builder {

        /**
         * Variable stores the name of the user account, who executed the application.
         */
        private String userName;

        /**
         * Variable stores the host name of the environment, where application is running, or was executed.
         */
        private String host;

        /**
         * Variable stores the unique ip address given to the machine, where application is running, or was executed.
         */
        private String ipAddress;

        Builder() {
        }

        public Builder userName(final String name) {
            this.userName = name;
            return this;
        }

        public Builder host(final String hostName) {
            this.host = hostName;
            return this;
        }

        public Builder ipAddress(final String address) {
            this.ipAddress = address;
            return this;
        }

        public Identity build() {
            return new Identity(userName, host, ipAddress);
        }
    }

}
