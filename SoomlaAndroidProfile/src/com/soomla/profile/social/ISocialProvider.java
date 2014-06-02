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

package com.soomla.profile.social;

import com.soomla.profile.auth.IAuthProvider;

public interface ISocialProvider extends IAuthProvider {

    void updateStatus(String status, SocialCallbacks.SocialActionListener socialActionListener);

    void updateStory(String message, String name, String caption, String description,
                     String link, String picture,
                     SocialCallbacks.SocialActionListener socialActionListener);

    void getContacts(SocialCallbacks.ContactsListener contactsListener);

    public enum SocialActionType {
        UpdateStatus
        , PublishFeed
        , UploadImage
        , UploadVideo
    }
}