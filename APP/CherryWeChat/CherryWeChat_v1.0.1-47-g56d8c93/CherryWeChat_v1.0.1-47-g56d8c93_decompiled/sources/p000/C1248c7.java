package p000;

import android.graphics.Bitmap;
import android.graphics.Paint;
import java.security.MessageDigest;

/* JADX INFO: renamed from: c7 */
/* JADX INFO: loaded from: classes.dex */
public final class C1248c7 extends AbstractC0651P5 {

    /* JADX INFO: renamed from: b */
    public static final byte[] f4242b = "com.bumptech.glide.load.resource.bitmap.CenterInside".getBytes(InterfaceC0802Sm.f2524a);

    @Override // p000.InterfaceC0802Sm
    /* JADX INFO: renamed from: b */
    public final void mo172b(MessageDigest messageDigest) {
        messageDigest.update(f4242b);
    }

    @Override // p000.AbstractC0651P5
    /* JADX INFO: renamed from: c */
    public final Bitmap mo1317c(InterfaceC0565N5 interfaceC0565N5, Bitmap bitmap, int i, int i2) {
        Paint paint = AbstractC0184EB.f545a;
        return (bitmap.getWidth() > i || bitmap.getHeight() > i2) ? AbstractC0184EB.m385b(interfaceC0565N5, bitmap, i, i2) : bitmap;
    }

    @Override // p000.InterfaceC0802Sm
    public final boolean equals(Object obj) {
        return obj instanceof C1248c7;
    }

    @Override // p000.InterfaceC0802Sm
    public final int hashCode() {
        return -670243078;
    }
}
