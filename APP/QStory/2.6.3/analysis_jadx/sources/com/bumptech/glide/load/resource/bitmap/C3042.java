package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Paint;
import com.bumptech.glide.load.engine.bitmap_recycle.InterfaceC2979;
import java.security.MessageDigest;
import p286.InterfaceC8393;

/* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3042 extends AbstractC3025 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final byte[] f9688 = "com.bumptech.glide.load.resource.bitmap.CenterCrop".getBytes(InterfaceC8393.f23270);

    @Override // p286.InterfaceC8393
    public final boolean equals(Object obj) {
        return obj instanceof C3042;
    }

    @Override // p286.InterfaceC8393
    public final int hashCode() {
        return -599754482;
    }

    @Override // com.bumptech.glide.load.resource.bitmap.AbstractC3025
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final Bitmap mo6531(InterfaceC2979 interfaceC2979, Bitmap bitmap, int i, int i2) {
        float width;
        float height;
        Paint paint = AbstractC3019.f9626;
        if (bitmap.getWidth() == i && bitmap.getHeight() == i2) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        float width2 = 0.0f;
        if (bitmap.getWidth() * i2 > bitmap.getHeight() * i) {
            width = i2 / bitmap.getHeight();
            width2 = (i - (bitmap.getWidth() * width)) * 0.5f;
            height = 0.0f;
        } else {
            width = i / bitmap.getWidth();
            height = (i2 - (bitmap.getHeight() * width)) * 0.5f;
        }
        matrix.setScale(width, width);
        matrix.postTranslate((int) (width2 + 0.5f), (int) (height + 0.5f));
        Bitmap bitmapMo6459 = interfaceC2979.mo6459(i, i2, bitmap.getConfig() != null ? bitmap.getConfig() : Bitmap.Config.ARGB_8888);
        bitmapMo6459.setHasAlpha(bitmap.hasAlpha());
        AbstractC3019.m6530(bitmap, bitmapMo6459, matrix);
        return bitmapMo6459;
    }

    @Override // p286.InterfaceC8393
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo6468(MessageDigest messageDigest) {
        messageDigest.update(f9688);
    }
}
