package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.util.Log;
import com.bumptech.glide.load.engine.bitmap_recycle.InterfaceC2979;
import java.security.MessageDigest;
import p286.InterfaceC8393;

/* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3046 extends AbstractC3025 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final byte[] f9694 = "com.bumptech.glide.load.resource.bitmap.CenterInside".getBytes(InterfaceC8393.f23270);

    @Override // p286.InterfaceC8393
    public final boolean equals(Object obj) {
        return obj instanceof C3046;
    }

    @Override // p286.InterfaceC8393
    public final int hashCode() {
        return -670243078;
    }

    @Override // com.bumptech.glide.load.resource.bitmap.AbstractC3025
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final Bitmap mo6531(InterfaceC2979 interfaceC2979, Bitmap bitmap, int i, int i2) {
        Paint paint = AbstractC3019.f9626;
        if (bitmap.getWidth() > i || bitmap.getHeight() > i2) {
            if (Log.isLoggable("TransformationUtils", 2)) {
                Log.v("TransformationUtils", "requested target size too big for input, fit centering instead");
            }
            return AbstractC3019.m6529(interfaceC2979, bitmap, i, i2);
        }
        if (Log.isLoggable("TransformationUtils", 2)) {
            Log.v("TransformationUtils", "requested target size larger or equal to input, returning input");
        }
        return bitmap;
    }

    @Override // p286.InterfaceC8393
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo6468(MessageDigest messageDigest) {
        messageDigest.update(f9694);
    }
}
