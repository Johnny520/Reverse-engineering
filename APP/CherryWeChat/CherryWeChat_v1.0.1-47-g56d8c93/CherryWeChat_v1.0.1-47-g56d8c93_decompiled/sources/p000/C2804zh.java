package p000;

import android.graphics.Bitmap;
import java.security.MessageDigest;

/* JADX INFO: renamed from: zh */
/* JADX INFO: loaded from: classes.dex */
public final class C2804zh extends AbstractC0651P5 {

    /* JADX INFO: renamed from: b */
    public static final byte[] f9477b = "com.bumptech.glide.load.resource.bitmap.FitCenter".getBytes(InterfaceC0802Sm.f2524a);

    @Override // p000.InterfaceC0802Sm
    /* JADX INFO: renamed from: b */
    public final void mo172b(MessageDigest messageDigest) {
        messageDigest.update(f9477b);
    }

    @Override // p000.AbstractC0651P5
    /* JADX INFO: renamed from: c */
    public final Bitmap mo1317c(InterfaceC0565N5 interfaceC0565N5, Bitmap bitmap, int i, int i2) {
        return AbstractC0184EB.m385b(interfaceC0565N5, bitmap, i, i2);
    }

    @Override // p000.InterfaceC0802Sm
    public final boolean equals(Object obj) {
        return obj instanceof C2804zh;
    }

    @Override // p000.InterfaceC0802Sm
    public final int hashCode() {
        return 1572326941;
    }
}
