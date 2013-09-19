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

package org.apache.hadoop.hive.ql.plan;

import java.util.List;

import org.apache.hadoop.hive.metastore.api.PrincipalType;

@Explain(displayName="grant or revoke roles")
public class GrantRevokeRoleDDL {
  
  private boolean grant;
  
  private List<PrincipalDesc> principalDesc;
  
  private List<String> roles;
  
  private String grantor;
  
  private PrincipalType grantorType;
  
  private boolean grantOption;
  
  public GrantRevokeRoleDDL() {
  }

  public GrantRevokeRoleDDL(boolean grant, List<String> roles,
      List<PrincipalDesc> principalDesc, String grantor,
      PrincipalType grantorType, boolean grantOption) {
    super();
    this.grant = grant;
    this.principalDesc = principalDesc;
    this.roles = roles;
    this.grantor = grantor;
    this.grantorType = grantorType;
    this.grantOption = grantOption;
  }

  /**
   * @return grant or revoke privileges
   */
  @Explain(displayName="grant (or revoke)")
  public boolean getGrant() {
    return grant;
  }

  public void setGrant(boolean grant) {
    this.grant = grant;
  }

  /**
   * @return a list of principals
   */
  @Explain(displayName="principals")
  public List<PrincipalDesc> getPrincipalDesc() {
    return principalDesc;
  }

  public void setPrincipalDesc(List<PrincipalDesc> principalDesc) {
    this.principalDesc = principalDesc;
  }

  /**
   * @return a list of roles
   */
  @Explain(displayName="roles")
  public List<String> getRoles() {
    return roles;
  }

  public void setRoles(List<String> roles) {
    this.roles = roles;
  }

  public String getGrantor() {
    return grantor;
  }

  public void setGrantor(String grantor) {
    this.grantor = grantor;
  }

  public PrincipalType getGrantorType() {
    return grantorType;
  }

  public void setGrantorType(PrincipalType grantorType) {
    this.grantorType = grantorType;
  }

  public boolean isGrantOption() {
    return grantOption;
  }

  public void setGrantOption(boolean grantOption) {
    this.grantOption = grantOption;
  }  

}
