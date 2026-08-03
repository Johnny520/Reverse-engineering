package com.bumptech.glide.load.resource.bitmap;

import Yue.InterfaceC6391;
import android.graphics.Bitmap;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.util.Preconditions;
import com.bumptech.glide.util.Util;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes.dex */
public final class RoundedCorners extends BitmapTransformation {

    /* JADX INFO: renamed from: ID */
    private static final String f4060ID = "com.bumptech.glide.load.resource.bitmap.RoundedCorners";
    private static final byte[] ID_BYTES = f4060ID.getBytes(Key.CHARSET);
    private final int roundingRadius;

    public RoundedCorners(int i) {
        Preconditions.checkArgument(i > 0, "roundingRadius must be greater than 0.");
        this.roundingRadius = i;
    }

    @Override // com.bumptech.glide.load.Key
    public boolean equals(Object obj) {
        return (obj instanceof RoundedCorners) && this.roundingRadius == ((RoundedCorners) obj).roundingRadius;
    }

    @Override // com.bumptech.glide.load.Key
    public int hashCode() {
        return Util.hashCode(-569625254, Util.hashCode(this.roundingRadius));
    }

    @Override // com.bumptech.glide.load.resource.bitmap.BitmapTransformation
    public Bitmap transform(@InterfaceC6391 BitmapPool bitmapPool, @InterfaceC6391 Bitmap bitmap, int i, int i2) {
        return TransformationUtils.roundedCorners(bitmapPool, bitmap, this.roundingRadius);
    }

    @Override // com.bumptech.glide.load.Key
    public void updateDiskCacheKey(@InterfaceC6391 MessageDigest messageDigest) {
        messageDigest.update(ID_BYTES);
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.roundingRadius).array());
    }
}
