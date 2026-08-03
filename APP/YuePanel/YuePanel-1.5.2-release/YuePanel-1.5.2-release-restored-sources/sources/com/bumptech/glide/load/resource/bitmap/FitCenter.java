package com.bumptech.glide.load.resource.bitmap;

import Yue.InterfaceC6391;
import android.graphics.Bitmap;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes.dex */
public class FitCenter extends BitmapTransformation {

    /* JADX INFO: renamed from: ID */
    private static final String f4057ID = "com.bumptech.glide.load.resource.bitmap.FitCenter";
    private static final byte[] ID_BYTES = f4057ID.getBytes(Key.CHARSET);

    @Override // com.bumptech.glide.load.Key
    public boolean equals(Object obj) {
        return obj instanceof FitCenter;
    }

    @Override // com.bumptech.glide.load.Key
    public int hashCode() {
        return 1572326941;
    }

    @Override // com.bumptech.glide.load.resource.bitmap.BitmapTransformation
    public Bitmap transform(@InterfaceC6391 BitmapPool bitmapPool, @InterfaceC6391 Bitmap bitmap, int i, int i2) {
        return TransformationUtils.fitCenter(bitmapPool, bitmap, i, i2);
    }

    @Override // com.bumptech.glide.load.Key
    public void updateDiskCacheKey(@InterfaceC6391 MessageDigest messageDigest) {
        messageDigest.update(ID_BYTES);
    }
}
