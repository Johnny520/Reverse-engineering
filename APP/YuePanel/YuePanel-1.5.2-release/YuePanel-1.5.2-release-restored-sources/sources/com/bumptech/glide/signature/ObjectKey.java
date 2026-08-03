package com.bumptech.glide.signature;

import Yue.C6193;
import Yue.InterfaceC6391;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.util.Preconditions;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes.dex */
public final class ObjectKey implements Key {
    private final Object object;

    public ObjectKey(@InterfaceC6391 Object obj) {
        this.object = Preconditions.checkNotNull(obj);
    }

    @Override // com.bumptech.glide.load.Key
    public boolean equals(Object obj) {
        if (obj instanceof ObjectKey) {
            return this.object.equals(((ObjectKey) obj).object);
        }
        return false;
    }

    @Override // com.bumptech.glide.load.Key
    public int hashCode() {
        return this.object.hashCode();
    }

    public String toString() {
        return "ObjectKey{object=" + this.object + C6193.f1885;
    }

    @Override // com.bumptech.glide.load.Key
    public void updateDiskCacheKey(@InterfaceC6391 MessageDigest messageDigest) {
        messageDigest.update(this.object.toString().getBytes(Key.CHARSET));
    }
}
