package com.olivadevelop.coreutils.media;

import androidx.annotation.NonNull;

import com.olivadevelop.coreutils.security.PermissionContract;

public interface CameraPermissionProvider {
    @NonNull
    PermissionContract getCameraPermission();
    @NonNull
    PermissionContract getReadStoragePermission();
}
