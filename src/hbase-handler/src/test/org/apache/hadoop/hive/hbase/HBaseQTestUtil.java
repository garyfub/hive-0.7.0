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

package org.apache.hadoop.hive.hbase;

import org.apache.hadoop.hive.ql.QTestUtil;

/**
 * HBaseQTestUtil initializes HBase-specific test fixtures.
 */
public class HBaseQTestUtil extends QTestUtil {
  public HBaseQTestUtil(
    String outDir, String logDir, boolean miniMr, HBaseTestSetup setup)
    throws Exception {

    super(outDir, logDir, miniMr, null);
    setup.preTest(conf);
    super.init();
  }

  public void init() throws Exception {
    // defer
  }
}
