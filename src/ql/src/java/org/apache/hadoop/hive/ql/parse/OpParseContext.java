/*!
* Copyright 2010 - 2013 Pentaho Corporation.  All rights reserved.
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
* http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*
*/

package org.apache.hadoop.hive.ql.parse;
import java.io.Serializable;
/**
 * Implementation of the Operator Parse Context. It maintains the parse context
 * that may be needed by an operator. Currently, it only maintains the row
 * resolver.
 **/

public class OpParseContext implements Serializable {
  private static final long serialVersionUID = 1L;
  private RowResolver rr; // row resolver for the operator

  public OpParseContext() {
  }

  /**
   * @param rr
   *          row resolver
   */
  public OpParseContext(RowResolver rr) {
    this.rr = rr;
  }

  /**
   * @return the row resolver
   */
  public RowResolver getRowResolver() {
    return rr;
  }

  /**
   * @param rr
   *          the row resolver to set
   */
  public void setRowResolver(RowResolver rr) {
    this.rr = rr;
  }
}
