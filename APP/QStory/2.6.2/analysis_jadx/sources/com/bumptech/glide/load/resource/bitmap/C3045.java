package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.util.Log;
import com.bumptech.glide.load.engine.bitmap_recycle.InterfaceC2978;
import java.security.MessageDigest;
import p286.InterfaceC8392;

/* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3045 extends AbstractC3024 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final byte[] f9692 = "com.bumptech.glide.load.resource.bitmap.CenterInside".getBytes(InterfaceC8392.f23271);

    @Override // p286.InterfaceC8392
    public final boolean equals(Object obj) {
        return obj instanceof C3045;
    }

    @Override // p286.InterfaceC8392
    public final int hashCode() {
        return -670243078;
    }

    @Override // com.bumptech.glide.load.resource.bitmap.AbstractC3024
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final Bitmap mo6471(InterfaceC2978 interfaceC2978, Bitmap bitmap, int i, int i2) {
        Paint paint = AbstractC3018.f9624;
        if (bitmap.getWidth() > i || bitmap.getHeight() > i2) {
            if (Log.isLoggable("TransformationUtils", 2)) {
                Log.v("TransformationUtils", "requested target size too big for input, fit centering instead");
            }
            return AbstractC3018.m6469(interfaceC2978, bitmap, i, i2);
        }
        if (Log.isLoggable("TransformationUtils", 2)) {
            Log.v("TransformationUtils", "requested target size larger or equal to input, returning input");
        }
        return bitmap;
    }

    @Override // p286.InterfaceC8392
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo6410(MessageDigest messageDigest) {
        messageDigest.update(f9692);
    }
}
