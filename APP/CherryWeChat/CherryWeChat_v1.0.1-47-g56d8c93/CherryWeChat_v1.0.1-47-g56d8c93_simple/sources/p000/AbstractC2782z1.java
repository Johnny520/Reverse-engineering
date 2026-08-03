package p000;

import java.security.GeneralSecurityException;

/* JADX INFO: renamed from: z1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2782z1 {

    /* JADX INFO: renamed from: a */
    public static final C0380It f9442a = null;

    /* JADX INFO: renamed from: b */
    public static final C0337Ht f9443b = null;

    /* JADX INFO: renamed from: c */
    public static final C1228bn f9444c = null;

    /* JADX INFO: renamed from: d */
    public static final C1148an f9445d = null;

    static {
        C2787z6 r0 = AbstractC2751yD.m5333b("type.googleapis.com/google.crypto.tink.AesCmacKey");
        f9442a = new C0380It(C2653w1.class);
        f9443b = new C0337Ht(r0);
        f9444c = new C1228bn(C2301o1.class);
        f9445d = new C1148an(r0, new C2438r1(1));
    }

    /* JADX INFO: renamed from: a */
    public static C2610v1 m5354a(EnumC2773yt r3) {
        int r0 = r3.ordinal();
        if (r0 == 1) goto L19;
        if (r0 == 2) goto L17;
        if (r0 == 3) goto L15;
        if (r0 != 4) goto L13;
        return C2610v1.f9003d;
    L13:
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + r3.m5345b());
    L15:
        return C2610v1.f9005f;
    L17:
        return C2610v1.f9004e;
    L19:
        return C2610v1.f9002c;
    }
}
