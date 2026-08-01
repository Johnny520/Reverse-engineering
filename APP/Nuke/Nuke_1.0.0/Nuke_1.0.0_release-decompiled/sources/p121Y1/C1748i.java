package p121Y1;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.util.Log;
import java.security.MessageDigest;
import p078P1.InterfaceC1144f;
import p093S1.InterfaceC1289a;

/* JADX INFO: renamed from: Y1.i */
/* JADX INFO: loaded from: classes.dex */
public final class C1748i extends AbstractC1744e {

    /* JADX INFO: renamed from: b */
    public static final byte[] f6023b = "com.bumptech.glide.load.resource.bitmap.CenterInside".getBytes(InterfaceC1144f.f3779a);

    @Override // p078P1.InterfaceC1144f
    /* JADX INFO: renamed from: b */
    public final void mo2199b(MessageDigest messageDigest) {
        messageDigest.update(f6023b);
    }

    @Override // p121Y1.AbstractC1744e
    /* JADX INFO: renamed from: c */
    public final Bitmap mo3100c(InterfaceC1289a interfaceC1289a, Bitmap bitmap, int i5, int i6) {
        Paint paint = AbstractC1735C.f5992a;
        if (bitmap.getWidth() > i5 || bitmap.getHeight() > i6) {
            if (Log.isLoggable("TransformationUtils", 2)) {
                Log.v("TransformationUtils", "requested target size too big for input, fit centering instead");
            }
            return AbstractC1735C.m3093b(interfaceC1289a, bitmap, i5, i6);
        }
        if (Log.isLoggable("TransformationUtils", 2)) {
            Log.v("TransformationUtils", "requested target size larger or equal to input, returning input");
        }
        return bitmap;
    }

    @Override // p078P1.InterfaceC1144f
    public final boolean equals(Object obj) {
        return obj instanceof C1748i;
    }

    @Override // p078P1.InterfaceC1144f
    public final int hashCode() {
        return -670243078;
    }
}
