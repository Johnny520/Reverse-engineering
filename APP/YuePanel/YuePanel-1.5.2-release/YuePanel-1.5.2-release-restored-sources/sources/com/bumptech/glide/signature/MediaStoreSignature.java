package com.bumptech.glide.signature;

import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import com.bumptech.glide.load.Key;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes.dex */
public class MediaStoreSignature implements Key {
    private final long dateModified;

    @InterfaceC6391
    private final String mimeType;
    private final int orientation;

    public MediaStoreSignature(@InterfaceC6490 String str, long j, int i) {
        this.mimeType = str == null ? "" : str;
        this.dateModified = j;
        this.orientation = i;
    }

    @Override // com.bumptech.glide.load.Key
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MediaStoreSignature mediaStoreSignature = (MediaStoreSignature) obj;
        return this.dateModified == mediaStoreSignature.dateModified && this.orientation == mediaStoreSignature.orientation && this.mimeType.equals(mediaStoreSignature.mimeType);
    }

    @Override // com.bumptech.glide.load.Key
    public int hashCode() {
        int iHashCode = this.mimeType.hashCode() * 31;
        long j = this.dateModified;
        return ((iHashCode + ((int) (j ^ (j >>> 32)))) * 31) + this.orientation;
    }

    @Override // com.bumptech.glide.load.Key
    public void updateDiskCacheKey(@InterfaceC6391 MessageDigest messageDigest) {
        messageDigest.update(ByteBuffer.allocate(12).putLong(this.dateModified).putInt(this.orientation).array());
        messageDigest.update(this.mimeType.getBytes(Key.CHARSET));
    }
}
