package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.util.Log;
import com.bumptech.glide.load.engine.bitmap_recycle.InterfaceC3811;
import java.security.MessageDigest;
import p302.InterfaceC9222;

/* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3878 extends AbstractC3857 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final byte[] f10039 = "com.bumptech.glide.load.resource.bitmap.CenterInside".getBytes(InterfaceC9222.f23615);

    @Override // p302.InterfaceC9222
    public final boolean equals(Object obj) {
        return obj instanceof C3878;
    }

    @Override // p302.InterfaceC9222
    public final int hashCode() {
        return -670243078;
    }

    @Override // com.bumptech.glide.load.resource.bitmap.AbstractC3857
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final Bitmap mo7091(InterfaceC3811 interfaceC3811, Bitmap bitmap, int i, int i2) {
        Paint paint = AbstractC3851.f9971;
        if (bitmap.getWidth() > i || bitmap.getHeight() > i2) {
            if (Log.isLoggable("TransformationUtils", 2)) {
                Log.v("TransformationUtils", "requested target size too big for input, fit centering instead");
            }
            return AbstractC3851.m7089(interfaceC3811, bitmap, i, i2);
        }
        if (Log.isLoggable("TransformationUtils", 2)) {
            Log.v("TransformationUtils", "requested target size larger or equal to input, returning input");
        }
        return bitmap;
    }

    @Override // p302.InterfaceC9222
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo7028(MessageDigest messageDigest) {
        messageDigest.update(f10039);
    }
}
