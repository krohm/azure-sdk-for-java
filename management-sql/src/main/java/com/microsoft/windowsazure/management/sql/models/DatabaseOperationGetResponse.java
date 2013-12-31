/**
 * 
 * Copyright (c) Microsoft and contributors.  All rights reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * 
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */

// Warning: This code was generated by a tool.
// 
// Changes to this file may cause incorrect behavior and will be lost if the
// code is regenerated.

package com.microsoft.windowsazure.management.sql.models;

import com.microsoft.windowsazure.core.OperationResponse;
import java.util.Calendar;

/**
* Response containing the database operation for a given operation Guid.
*/
public class DatabaseOperationGetResponse extends OperationResponse
{
    private String databaseName;
    
    /**
    * Gets or sets the name of the SQL Database on which the operation is
    * performed.
    */
    public String getDatabaseName() { return this.databaseName; }
    
    /**
    * Gets or sets the name of the SQL Database on which the operation is
    * performed.
    */
    public void setDatabaseName(String databaseName) { this.databaseName = databaseName; }
    
    private String error;
    
    /**
    * Gets or sets the description of the error that occurred during a failed
    * operation.
    */
    public String getError() { return this.error; }
    
    /**
    * Gets or sets the description of the error that occurred during a failed
    * operation.
    */
    public void setError(String error) { this.error = error; }
    
    private int errorCode;
    
    /**
    * Gets or sets the code indicating the error that occurred during a failed
    * operation.
    */
    public int getErrorCode() { return this.errorCode; }
    
    /**
    * Gets or sets the code indicating the error that occurred during a failed
    * operation.
    */
    public void setErrorCode(int errorCode) { this.errorCode = errorCode; }
    
    private int errorSeverity;
    
    /**
    * Gets or sets the severity level of the error that occurred during a
    * failed operation.
    */
    public int getErrorSeverity() { return this.errorSeverity; }
    
    /**
    * Gets or sets the severity level of the error that occurred during a
    * failed operation.
    */
    public void setErrorSeverity(int errorSeverity) { this.errorSeverity = errorSeverity; }
    
    private int errorState;
    
    /**
    * Gets or sets the error state.
    */
    public int getErrorState() { return this.errorState; }
    
    /**
    * Gets or sets the error state.
    */
    public void setErrorState(int errorState) { this.errorState = errorState; }
    
    private String id;
    
    /**
    * Gets or sets unique identifier of the operation.
    */
    public String getId() { return this.id; }
    
    /**
    * Gets or sets unique identifier of the operation.
    */
    public void setId(String id) { this.id = id; }
    
    private Calendar lastModifyTime;
    
    /**
    * Gets or sets the timestamp when the record was last modified for a long
    * running operation.
    */
    public Calendar getLastModifyTime() { return this.lastModifyTime; }
    
    /**
    * Gets or sets the timestamp when the record was last modified for a long
    * running operation.
    */
    public void setLastModifyTime(Calendar lastModifyTime) { this.lastModifyTime = lastModifyTime; }
    
    private String name;
    
    /**
    * Gets or sets the name of the operation.
    */
    public String getName() { return this.name; }
    
    /**
    * Gets or sets the name of the operation.
    */
    public void setName(String name) { this.name = name; }
    
    private String parentLink;
    
    /**
    * Gets or sets the ParentLink of the operation.
    */
    public String getParentLink() { return this.parentLink; }
    
    /**
    * Gets or sets the ParentLink of the operation.
    */
    public void setParentLink(String parentLink) { this.parentLink = parentLink; }
    
    private int percentComplete;
    
    /**
    * Gets or sets the percentage of operation that has completed.
    */
    public int getPercentComplete() { return this.percentComplete; }
    
    /**
    * Gets or sets the percentage of operation that has completed.
    */
    public void setPercentComplete(int percentComplete) { this.percentComplete = percentComplete; }
    
    private String selfLink;
    
    /**
    * Gets or sets the SelfLink of the operation.
    */
    public String getSelfLink() { return this.selfLink; }
    
    /**
    * Gets or sets the SelfLink of the operation.
    */
    public void setSelfLink(String selfLink) { this.selfLink = selfLink; }
    
    private String sessionActivityId;
    
    /**
    * Gets or sets session scoped ID of the operation.
    */
    public String getSessionActivityId() { return this.sessionActivityId; }
    
    /**
    * Gets or sets session scoped ID of the operation.
    */
    public void setSessionActivityId(String sessionActivityId) { this.sessionActivityId = sessionActivityId; }
    
    private Calendar startTime;
    
    /**
    * Gets or sets the timestamp when the operation started.
    */
    public Calendar getStartTime() { return this.startTime; }
    
    /**
    * Gets or sets the timestamp when the operation started.
    */
    public void setStartTime(Calendar startTime) { this.startTime = startTime; }
    
    private String state;
    
    /**
    * Gets or sets the state of the operation.
    */
    public String getState() { return this.state; }
    
    /**
    * Gets or sets the state of the operation.
    */
    public void setState(String state) { this.state = state; }
    
    private int stateId;
    
    /**
    * Gets or sets the current state of the long running operation in numeric
    * format.
    */
    public int getStateId() { return this.stateId; }
    
    /**
    * Gets or sets the current state of the long running operation in numeric
    * format.
    */
    public void setStateId(int stateId) { this.stateId = stateId; }
    
    private String type;
    
    /**
    * Gets or sets the type of resource.
    */
    public String getType() { return this.type; }
    
    /**
    * Gets or sets the type of resource.
    */
    public void setType(String type) { this.type = type; }
    
    /**
    * Initializes a new instance of the DatabaseOperationGetResponse class.
    *
    */
    public DatabaseOperationGetResponse()
    {
    }
}
