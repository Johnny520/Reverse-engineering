package yyds;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.util.Log;
import java.security.MessageDigest;

/* JADX INFO: renamed from: yyds.ᛳᲀᛳᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0670 extends AbstractC2134 {

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public static final byte[] f3204 = "com.bumptech.glide.load.resource.bitmap.CenterCrop".getBytes(InterfaceC1410.f6680);

    @Override // yyds.InterfaceC1410
    public final boolean equals(Object obj) {
        return obj instanceof C0670;
    }

    @Override // yyds.InterfaceC1410
    public final int hashCode() {
        return -599754482;
    }

    @Override // yyds.InterfaceC1410
    /* JADX INFO: renamed from: ᛵᛸᛸᛷ */
    public final void mo1227(MessageDigest messageDigest) {
        messageDigest.update(f3204);
    }

    @Override // yyds.AbstractC2134
    /* JADX INFO: renamed from: ᲀᛲᛳᲀ */
    public final Bitmap mo1402(InterfaceC2587 interfaceC2587, Bitmap bitmap, int i, int i2) {
        float width;
        float height;
        Paint paint = AbstractC2663.f13067;
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
        Bitmap bitmapMo1861 = interfaceC2587.mo1861(i, i2, bitmap.getConfig() != null ? bitmap.getConfig() : Bitmap.Config.ARGB_8888);
        bitmapMo1861.setHasAlpha(bitmap.hasAlpha());
        AbstractC2663.m4752(bitmap, bitmapMo1861, matrix);
        if (!bitmapMo1861.equals(bitmap) && ((bitmapMo1861.getWidth() != bitmap.getWidth() || bitmapMo1861.getHeight() != bitmap.getHeight()) && Log.isLoggable("GlideMemoryTracking", 3))) {
            AbstractC0181.m740("TransformationUtils [centerCrop]", null, bitmapMo1861, bitmap.getWidth(), bitmap.getHeight());
        }
        return bitmapMo1861;
    }
}
