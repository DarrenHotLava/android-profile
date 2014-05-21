/*
 * Copyright (C) 2012 Soomla Inc.
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */

package com.soomla.social.model;

import java.util.HashSet;
import java.util.Set;

// todo: come back when doing more user management work
public class GameUser {
    private String mId;

    private String mEmail; // optional

    // todo: figure out best way to link social ids
    private SocialAccount mPrimarySocialAccount;
    private Set<SocialAccount> mLinkedSocialAccounts = new HashSet<SocialAccount>();
}
