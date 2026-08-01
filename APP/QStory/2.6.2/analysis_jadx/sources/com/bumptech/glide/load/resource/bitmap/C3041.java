package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Paint;
import com.bumptech.glide.load.engine.bitmap_recycle.InterfaceC2978;
import java.security.MessageDigest;
import p286.InterfaceC8392;

/* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3041 extends AbstractC3024 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final byte[] f9686 = "com.bumptech.glide.load.resource.bitmap.CenterCrop".getBytes(InterfaceC8392.f23271);

    @Override // p286.InterfaceC8392
    public final boolean equals(Object obj) {
        return obj instanceof C3041;
    }

    @Override // p286.InterfaceC8392
    public final int hashCode() {
        return -599754482;
    }

    @Override // com.bumptech.glide.load.resource.bitmap.AbstractC3024
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final Bitmap mo6471(InterfaceC2978 interfaceC2978, Bitmap bitmap, int i, int i2) {
        float width;
        float height;
        Paint paint = AbstractC3018.f9624;
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
        Bitmap bitmapMo6401 = interfaceC2978.mo6401(i, i2, bitmap.getConfig() != null ? bitmap.getConfig() : Bitmap.Config.ARGB_8888);
        bitmapMo6401.setHasAlpha(bitmap.hasAlpha());
        AbstractC3018.m6470(bitmap, bitmapMo6401, matrix);
        return bitmapMo6401;
    }

    @Override // p286.InterfaceC8392
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo6410(MessageDigest messageDigest) {
        messageDigest.update(f9686);
    }
}
