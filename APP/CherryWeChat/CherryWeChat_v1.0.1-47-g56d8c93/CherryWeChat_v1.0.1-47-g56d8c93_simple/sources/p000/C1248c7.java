package p000;

import android.graphics.Bitmap;
import android.graphics.Paint;
import java.security.MessageDigest;

/* JADX INFO: renamed from: c7 */
/* JADX INFO: loaded from: classes.dex */
public final class C1248c7 extends AbstractC0651P5 {

    /* JADX INFO: renamed from: b */
    public static final byte[] f4242b = null;

    static {
        f4242b = "com.bumptech.glide.load.resource.bitmap.CenterInside".getBytes(InterfaceC0802Sm.f2524a);
    }

    @Override // p000.InterfaceC0802Sm
    /* JADX INFO: renamed from: b */
    public final void mo172b(MessageDigest r2) {
        r2.update(f4242b);
    }

    @Override // p000.AbstractC0651P5
    /* JADX INFO: renamed from: c */
    public final Bitmap mo1317c(InterfaceC0565N5 r2, Bitmap r3, int r4, int r5) {
        Paint r0 = AbstractC0184EB.f545a;
        if (r3.getWidth() > r4) goto L8;
        if (r3.getHeight() > r5) goto L8;
        return r3;
    L8:
        return AbstractC0184EB.m385b(r2, r3, r4, r5);
    }

    @Override // p000.InterfaceC0802Sm
    public final boolean equals(Object r1) {
        return r1 instanceof C1248c7;
    }

    @Override // p000.InterfaceC0802Sm
    public final int hashCode() {
        return -670243078;
    }
}
