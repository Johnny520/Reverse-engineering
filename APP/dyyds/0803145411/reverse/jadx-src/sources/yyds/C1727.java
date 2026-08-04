package yyds;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.util.Log;
import java.security.MessageDigest;

/* JADX INFO: renamed from: yyds.ᛸᛲᲇᛱ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1727 extends AbstractC2134 {

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public static final byte[] f8727 = "com.bumptech.glide.load.resource.bitmap.CenterInside".getBytes(InterfaceC1410.f6680);

    @Override // yyds.InterfaceC1410
    public final boolean equals(Object obj) {
        return obj instanceof C1727;
    }

    @Override // yyds.InterfaceC1410
    public final int hashCode() {
        return -670243078;
    }

    @Override // yyds.InterfaceC1410
    /* JADX INFO: renamed from: ᛵᛸᛸᛷ */
    public final void mo1227(MessageDigest messageDigest) {
        messageDigest.update(f8727);
    }

    @Override // yyds.AbstractC2134
    /* JADX INFO: renamed from: ᲀᛲᛳᲀ */
    public final Bitmap mo1402(InterfaceC2587 interfaceC2587, Bitmap bitmap, int i, int i2) {
        Paint paint = AbstractC2663.f13067;
        if (bitmap.getWidth() > i || bitmap.getHeight() > i2) {
            if (Log.isLoggable("TransformationUtils", 2)) {
                Log.v("TransformationUtils", "requested target size too big for input, fit centering instead");
            }
            return AbstractC2663.m4753(interfaceC2587, bitmap, i, i2);
        }
        if (Log.isLoggable("TransformationUtils", 2)) {
            Log.v("TransformationUtils", "requested target size larger or equal to input, returning input");
        }
        return bitmap;
    }
}
