package p000;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.util.Log;
import java.security.MessageDigest;

/* JADX INFO: renamed from: bq */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0064bq extends AbstractC0059bl {

    /* JADX INFO: renamed from: b */
    public static final byte[] f983b = "com.bumptech.glide.load.resource.bitmap.CenterInside".getBytes(a51.f64a);

    @Override // p000.a51
    /* JADX INFO: renamed from: b */
    public final void mo96b(MessageDigest messageDigest) {
        messageDigest.update(f983b);
    }

    @Override // p000.AbstractC0059bl
    /* JADX INFO: renamed from: c */
    public final Bitmap mo258c(InterfaceC0965zk interfaceC0965zk, Bitmap bitmap, int i, int i2) {
        Paint paint = p33.f7960a;
        if (bitmap.getWidth() > i || bitmap.getHeight() > i2) {
            if (Log.isLoggable("TransformationUtils", 2)) {
                Log.v("TransformationUtils", "requested target size too big for input, fit centering instead");
            }
            return p33.m3690b(interfaceC0965zk, bitmap, i, i2);
        }
        if (Log.isLoggable("TransformationUtils", 2)) {
            Log.v("TransformationUtils", "requested target size larger or equal to input, returning input");
        }
        return bitmap;
    }

    @Override // p000.a51
    public final boolean equals(Object obj) {
        return obj instanceof C0064bq;
    }

    @Override // p000.a51
    public final int hashCode() {
        return -670243078;
    }
}
