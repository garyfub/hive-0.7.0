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

package org.apache.hadoop.hive.serde2.objectinspector.primitive;

import org.apache.hadoop.io.IntWritable;

/**
 * A WritableIntObjectInspector inspects a IntWritable Object.
 */
public class WritableIntObjectInspector extends
    AbstractPrimitiveWritableObjectInspector implements
    SettableIntObjectInspector {

  WritableIntObjectInspector() {
    super(PrimitiveObjectInspectorUtils.intTypeEntry);
  }

  @Override
  public int get(Object o) {
    return ((IntWritable) o).get();
  }

  @Override
  public Object copyObject(Object o) {
    return o == null ? null : new IntWritable(((IntWritable) o).get());
  }

  @Override
  public Object getPrimitiveJavaObject(Object o) {
    return o == null ? null : Integer.valueOf(((IntWritable) o).get());
  }

  @Override
  public Object create(int value) {
    return new IntWritable(value);
  }

  @Override
  public Object set(Object o, int value) {
    ((IntWritable) o).set(value);
    return o;
  }
}
