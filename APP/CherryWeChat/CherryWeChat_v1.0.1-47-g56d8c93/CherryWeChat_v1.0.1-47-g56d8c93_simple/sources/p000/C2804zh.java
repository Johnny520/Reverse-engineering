package p000;

import android.graphics.Bitmap;
import java.security.MessageDigest;

/* JADX INFO: renamed from: zh */
/* JADX INFO: loaded from: classes.dex */
public final class C2804zh extends AbstractC0651P5 {

    /* JADX INFO: renamed from: b */
    public static final byte[] f9477b = null;

    static {
        f9477b = "com.bumptech.glide.load.resource.bitmap.FitCenter".getBytes(InterfaceC0802Sm.f2524a);
    }

    @Override // p000.InterfaceC0802Sm
    /* JADX INFO: renamed from: b */
    public final void mo172b(MessageDigest r2) {
        r2.update(f9477b);
    }

    @Override // p000.AbstractC0651P5
    /* JADX INFO: renamed from: c */
    public final Bitmap mo1317c(InterfaceC0565N5 r1, Bitmap r2, int r3, int r4) {
        return AbstractC0184EB.m385b(r1, r2, r3, r4);
    }

    @Override // p000.InterfaceC0802Sm
    public final boolean equals(Object r1) {
        return r1 instanceof C2804zh;
    }

    @Override // p000.InterfaceC0802Sm
    public final int hashCode() {
        return 1572326941;
    }
}
