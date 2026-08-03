package p000;

import java.security.GeneralSecurityException;

/* JADX INFO: renamed from: z1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2782z1 {

    /* JADX INFO: renamed from: a */
    public static final C0380It f9442a;

    /* JADX INFO: renamed from: b */
    public static final C0337Ht f9443b;

    /* JADX INFO: renamed from: c */
    public static final C1228bn f9444c;

    /* JADX INFO: renamed from: d */
    public static final C1148an f9445d;

    static {
        C2787z6 c2787z6M5333b = AbstractC2751yD.m5333b("type.googleapis.com/google.crypto.tink.AesCmacKey");
        f9442a = new C0380It(C2653w1.class);
        f9443b = new C0337Ht(c2787z6M5333b);
        f9444c = new C1228bn(C2301o1.class);
        f9445d = new C1148an(c2787z6M5333b, new C2438r1(1));
    }

    /* JADX INFO: renamed from: a */
    public static C2610v1 m5354a(EnumC2773yt enumC2773yt) throws GeneralSecurityException {
        int iOrdinal = enumC2773yt.ordinal();
        if (iOrdinal == 1) {
            return C2610v1.f9002c;
        }
        if (iOrdinal == 2) {
            return C2610v1.f9004e;
        }
        if (iOrdinal == 3) {
            return C2610v1.f9005f;
        }
        if (iOrdinal == 4) {
            return C2610v1.f9003d;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + enumC2773yt.m5345b());
    }
}
