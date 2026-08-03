package com.bumptech.glide.signature;

import Yue.InterfaceC6391;
import android.content.Context;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.util.Util;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes.dex */
public final class AndroidResourceSignature implements Key {
    private final Key applicationVersion;
    private final int nightMode;

    private AndroidResourceSignature(int i, Key key) {
        this.nightMode = i;
        this.applicationVersion = key;
    }

    @InterfaceC6391
    public static Key obtain(@InterfaceC6391 Context context) {
        return new AndroidResourceSignature(context.getResources().getConfiguration().uiMode & 48, ApplicationVersionSignature.obtain(context));
    }

    @Override // com.bumptech.glide.load.Key
    public boolean equals(Object obj) {
        if (!(obj instanceof AndroidResourceSignature)) {
            return false;
        }
        AndroidResourceSignature androidResourceSignature = (AndroidResourceSignature) obj;
        return this.nightMode == androidResourceSignature.nightMode && this.applicationVersion.equals(androidResourceSignature.applicationVersion);
    }

    @Override // com.bumptech.glide.load.Key
    public int hashCode() {
        return Util.hashCode(this.applicationVersion, this.nightMode);
    }

    @Override // com.bumptech.glide.load.Key
    public void updateDiskCacheKey(@InterfaceC6391 MessageDigest messageDigest) {
        this.applicationVersion.updateDiskCacheKey(messageDigest);
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.nightMode).array());
    }
}
