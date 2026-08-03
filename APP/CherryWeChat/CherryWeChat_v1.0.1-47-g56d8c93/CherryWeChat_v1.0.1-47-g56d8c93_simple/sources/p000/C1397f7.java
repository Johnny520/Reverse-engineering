package p000;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* JADX INFO: renamed from: f7 */
/* JADX INFO: loaded from: classes.dex */
public final class C1397f7 extends AbstractC1523i1 {
    /* JADX INFO: renamed from: N */
    public static C1397f7 m2673N(C2610v1 r3, C1017Xm r4, Integer r5) {
        C2787z6 r42 = (C2787z6) r4.f3226b;
        C2610v1 r0 = C2610v1.f9017r;
        if (r3 == r0) goto L8;
        if (r5 != null) goto L8;
        throw new GeneralSecurityException("For given Variant " + r3 + " the value of idRequirement must be non-null");
    L8:
        if (r3 != r0) goto L14;
        if (r5 == null) goto L14;
        throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
    L14:
        if (r42.f9452a.length != 32) goto L29;
        if (r3 != r0) goto L19;
        C2787z6.m5359a(new byte[0]);
    L25:
        return new C1397f7();
    L19:
        if (r3 != C2610v1.f9016q) goto L22;
        C2787z6.m5359a(ByteBuffer.allocate(5).put((byte) 0).putInt(r5.intValue()).array());
        goto L25
    L22:
        if (r3 != C2610v1.f9015p) goto L27;
        C2787z6.m5359a(ByteBuffer.allocate(5).put((byte) 1).putInt(r5.intValue()).array());
        goto L25
    L27:
        throw new IllegalStateException("Unknown Variant: " + r3);
    L29:
        throw new GeneralSecurityException("ChaCha20Poly1305 key must be constructed with key of length 32 bytes, not " + r42.f9452a.length);
    }
}
