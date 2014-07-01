/*
 * Copyright (C) 2014 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License
 */

package com.android.services.telephony;

import android.telecomm.CallVideoProvider;
import android.telecomm.VideoCallProfile;
import android.view.Surface;


/**
 * Implements the CallVideoProvider.
 */
public class TelephonyCallVideoProvider extends CallVideoProvider {

    @Override
    public void setCamera(String cameraId) {
        // Stub, to be implemented.
    }

    @Override
    public void setPreviewSurface(Surface surface) {

    }

    @Override
    public void setDisplaySurface(Surface surface) {

    }

    @Override
    public void setDeviceOrientation(int rotation) {

    }

    @Override
    public void setZoom(float value) {

    }

    @Override
    public void sendSessionModifyRequest(VideoCallProfile requestProfile) {

    }

    @Override
    public void sendSessionModifyResponse(VideoCallProfile responseProfile) {

    }

    @Override
    public void requestCameraCapabilities() {

    }

    @Override
    public void requestCallDataUsage() {

    }

    @Override
    public void setPauseImage(String uri) {

    }
}