/*
 * ***** BEGIN LICENSE BLOCK *****
 * Zimbra Collaboration Suite Server
 * Copyright (C) 2005, 2006, 2007, 2008, 2009, 2010 Zimbra, Inc.
 * 
 * The contents of this file are subject to the Zimbra Public License
 * Version 1.3 ("License"); you may not use this file except in
 * compliance with the License.  You may obtain a copy of the License at
 * http://www.zimbra.com/license.
 * 
 * Software distributed under the License is distributed on an "AS IS"
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or implied.
 * ***** END LICENSE BLOCK *****
 */
package com.zimbra.cs.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.zimbra.common.util.ZimbraLog;
import org.apache.commons.dbcp.DelegatingConnection;

class DebugConnection extends DelegatingConnection {
    protected final Connection mConn;

    DebugConnection(Connection conn) {
        super(conn);
        mConn = conn;
    }

    Connection getConnection() {
        return mConn;
    }
    
    public PreparedStatement prepareStatement(String sql) throws SQLException {
        return new DebugPreparedStatement(this, mConn.prepareStatement(sql), sql);
    }

    public void commit() throws SQLException {
        ZimbraLog.sqltrace.debug("commit, conn=" + mConn.hashCode());
        mConn.commit();
    }

    public void rollback() throws SQLException {
        ZimbraLog.sqltrace.debug("rollback, conn=" + mConn.hashCode());
        mConn.rollback();
    }

    public PreparedStatement prepareStatement(String sql, int resultSetType,
                                              int resultSetConcurrency)
    throws SQLException {
        return new DebugPreparedStatement(
            this, mConn.prepareStatement(sql, resultSetType, resultSetConcurrency), sql);
    }

    public PreparedStatement prepareStatement(String sql, int resultSetType,
                                              int resultSetConcurrency,
                                              int resultSetHoldability)
    throws SQLException {
        return new DebugPreparedStatement(
           this, mConn.prepareStatement(sql, resultSetType,
                    resultSetConcurrency, resultSetHoldability), sql);
    }

    public PreparedStatement prepareStatement(String sql, int autoGeneratedKeys)
    throws SQLException {
        return new DebugPreparedStatement(
            this, mConn.prepareStatement(sql, autoGeneratedKeys), sql);
    }

    public PreparedStatement prepareStatement(String sql, int[] columnIndexes)
    throws SQLException {
        return new DebugPreparedStatement(
            this, mConn.prepareStatement(sql, columnIndexes), sql);
    }

    public PreparedStatement prepareStatement(String sql, String[] columnNames)
        throws SQLException {
        return new DebugPreparedStatement(
            this, mConn.prepareStatement(sql, columnNames), sql);
    }
}
