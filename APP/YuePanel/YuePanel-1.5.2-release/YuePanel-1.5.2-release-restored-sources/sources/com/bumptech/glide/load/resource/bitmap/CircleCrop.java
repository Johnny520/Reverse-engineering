package com.bumptech.glide.load.resource.bitmap;

import Yue.InterfaceC6391;
import android.graphics.Bitmap;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes.dex */
public class CircleCrop extends BitmapTransformation {

    /* JADX INFO: renamed from: ID */
    private static final String f4055ID = "com.bumptech.glide.load.resource.bitmap.CircleCrop.1";
    private static final byte[] ID_BYTES = f4055ID.getBytes(Key.CHARSET);
    private static final int VERSION = 1;

    @Override // com.bumptech.glide.load.Key
    public boolean equals(Object obj) {
        return obj instanceof CircleCrop;
    }

    @Override // com.bumptech.glide.load.Key
    public int hashCode() {
        return 1101716364;
    }

    @Override // com.bumptech.glide.load.resource.bitmap.BitmapTransformation
    public Bitmap transform(@InterfaceC6391 BitmapPool bitmapPool, @InterfaceC6391 Bitmap bitmap, int i, int i2) {
        return TransformationUtils.circleCrop(bitmapPool, bitmap, i, i2);
    }

    @Override // com.bumptech.glide.load.Key
    public void updateDiskCacheKey(@InterfaceC6391 MessageDigest messageDigest) {
        messageDigest.update(ID_BYTES);
    }
}
