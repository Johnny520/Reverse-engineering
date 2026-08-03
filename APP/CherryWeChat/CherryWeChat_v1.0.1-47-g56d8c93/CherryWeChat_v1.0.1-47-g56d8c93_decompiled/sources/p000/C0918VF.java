package p000;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* JADX INFO: renamed from: VF */
/* JADX INFO: loaded from: classes.dex */
public final class C0918VF extends AbstractC1523i1 {
    /* JADX INFO: renamed from: N */
    public static C0918VF m1766N(C2610v1 c2610v1, C1017Xm c1017Xm, Integer num) throws GeneralSecurityException {
        C2787z6 c2787z6 = (C2787z6) c1017Xm.f3226b;
        C2610v1 c2610v12 = C2610v1.f9001G;
        if (c2610v1 != c2610v12 && num == null) {
            throw new GeneralSecurityException("For given Variant " + c2610v1 + " the value of idRequirement must be non-null");
        }
        if (c2610v1 == c2610v12 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (c2787z6.f9452a.length != 32) {
            throw new GeneralSecurityException("XChaCha20Poly1305 key must be constructed with key of length 32 bytes, not " + c2787z6.f9452a.length);
        }
        if (c2610v1 == c2610v12) {
            C2787z6.m5359a(new byte[0]);
        } else if (c2610v1 == C2610v1.f9000F) {
            C2787z6.m5359a(ByteBuffer.allocate(5).put((byte) 0).putInt(num.intValue()).array());
        } else {
            if (c2610v1 != C2610v1.f8999E) {
                throw new IllegalStateException("Unknown Variant: " + c2610v1);
            }
            C2787z6.m5359a(ByteBuffer.allocate(5).put((byte) 1).putInt(num.intValue()).array());
        }
        return new C0918VF();
    }
}
