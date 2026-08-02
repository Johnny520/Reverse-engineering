package p000;

import android.graphics.Bitmap;
import java.security.MessageDigest;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class gj0 extends AbstractC0059bl {

    /* JADX INFO: renamed from: b */
    public static final byte[] f3540b = "com.bumptech.glide.load.resource.bitmap.FitCenter".getBytes(a51.f64a);

    @Override // p000.a51
    /* JADX INFO: renamed from: b */
    public final void mo96b(MessageDigest messageDigest) {
        messageDigest.update(f3540b);
    }

    @Override // p000.AbstractC0059bl
    /* JADX INFO: renamed from: c */
    public final Bitmap mo258c(InterfaceC0965zk interfaceC0965zk, Bitmap bitmap, int i, int i2) {
        return p33.m3690b(interfaceC0965zk, bitmap, i, i2);
    }

    @Override // p000.a51
    public final boolean equals(Object obj) {
        return obj instanceof gj0;
    }

    @Override // p000.a51
    public final int hashCode() {
        return 1572326941;
    }
}
