package com.bumptech.glide.load.resource.bitmap;

/* JADX INFO: loaded from: classes.dex */
public class CircleCrop extends com.bumptech.glide.load.resource.bitmap.BitmapTransformation {
    private static final java.lang.String ID = "com.bumptech.glide.load.resource.bitmap.CircleCrop.1";
    private static final byte[] ID_BYTES = null;
    private static final int VERSION = 1;

    static {
            java.lang.String r0 = "com.bumptech.glide.load.resource.bitmap.CircleCrop.1"
            java.nio.charset.Charset r1 = com.bumptech.glide.load.Key.CHARSET
            byte[] r0 = r0.getBytes(r1)
            com.bumptech.glide.load.resource.bitmap.CircleCrop.ID_BYTES = r0
            return
    }

    public CircleCrop() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.bumptech.glide.load.Key
    public boolean equals(java.lang.Object r1) {
            r0 = this;
            boolean r1 = r1 instanceof com.bumptech.glide.load.resource.bitmap.CircleCrop
            return r1
    }

    @Override // com.bumptech.glide.load.Key
    public int hashCode() {
            r1 = this;
            r0 = 1101716364(0x41aadb8c, float:21.3572)
            return r0
    }

    @Override // com.bumptech.glide.load.resource.bitmap.BitmapTransformation
    public android.graphics.Bitmap transform(@Yue.InterfaceC4410 com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool r1, @Yue.InterfaceC4410 android.graphics.Bitmap r2, int r3, int r4) {
            r0 = this;
            android.graphics.Bitmap r1 = com.bumptech.glide.load.resource.bitmap.TransformationUtils.circleCrop(r1, r2, r3, r4)
            return r1
    }

    @Override // com.bumptech.glide.load.Key
    public void updateDiskCacheKey(@Yue.InterfaceC4410 java.security.MessageDigest r2) {
            r1 = this;
            byte[] r0 = com.bumptech.glide.load.resource.bitmap.CircleCrop.ID_BYTES
            r2.update(r0)
            return
    }
}
