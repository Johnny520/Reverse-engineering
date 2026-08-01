package p121Y1;

import android.graphics.Bitmap;
import java.security.MessageDigest;
import p078P1.InterfaceC1144f;
import p093S1.InterfaceC1289a;

/* JADX INFO: renamed from: Y1.w */
/* JADX INFO: loaded from: classes.dex */
public final class C1762w extends AbstractC1744e {

    /* JADX INFO: renamed from: b */
    public static final byte[] f6055b = "com.bumptech.glide.load.resource.bitmap.FitCenter".getBytes(InterfaceC1144f.f3779a);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p078P1.InterfaceC1144f
    /* JADX INFO: renamed from: b */
    public final void mo2199b(MessageDigest messageDigest) {
        messageDigest.update(f6055b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p121Y1.AbstractC1744e
    /* JADX INFO: renamed from: c */
    public final Bitmap mo3100c(InterfaceC1289a interfaceC1289a, Bitmap bitmap, int i5, int i6) {
        return AbstractC1735C.m3093b(interfaceC1289a, bitmap, i5, i6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p078P1.InterfaceC1144f
    public final boolean equals(Object obj) {
        return obj instanceof C1762w;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p078P1.InterfaceC1144f
    public final int hashCode() {
        return 1572326941;
    }
}
