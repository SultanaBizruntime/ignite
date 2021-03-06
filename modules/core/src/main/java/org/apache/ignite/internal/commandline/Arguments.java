/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.ignite.internal.commandline;

/**
 * Bean with all parsed and validated arguments.
 */
public class Arguments {
    /** Command. */
    private Command cmd;

    /** Host. */
    private String host;

    /** Port. */
    private String port;

    /** User. */
    private String user;

    /** Password. */
    private String pwd;

    /** Force option is used for auto confirmation. */
    private boolean force;

    /**
     * Action for baseline command.
     */
    private String baselineAct;

    /**
     * Arguments for baseline command.
     */
    private String baselineArgs;

    /**
     * @param cmd Command.
     * @param host Host.
     * @param port Port.
     * @param user User.
     * @param pwd Password.
     * @param baselineAct Baseline action.
     * @param baselineArgs Baseline args.
     * @param force Force flag.
     */
    public Arguments(Command cmd, String host, String port, String user, String pwd,
        String baselineAct, String baselineArgs,
        boolean force
    ) {
        this.cmd = cmd;
        this.host = host;
        this.port = port;
        this.user = user;
        this.pwd = pwd;
        this.baselineAct = baselineAct;
        this.baselineArgs = baselineArgs;
        this.force = force;
    }

    /**
     * @return command
     */
    public Command command() {
        return cmd;
    }

    /**
     * @return host name
     */
    public String host() {
        return host;
    }

    /**
     * @return port number
     */
    public String port() {
        return port;
    }

    /**
     * @return user name
     */
    public String user() {
        return user;
    }

    /**
     * @return password
     */
    public String password() {
        return pwd;
    }

    /**
     * @return baseline action
     */
    public String baselineAction() {
        return baselineAct;
    }

    /**
     * @return baseline arguments
     */
    public String baselineArguments() {
        return baselineArgs;
    }

    /**
     * @return Force option.
     */
    public boolean force() {
        return force;
    }
}
