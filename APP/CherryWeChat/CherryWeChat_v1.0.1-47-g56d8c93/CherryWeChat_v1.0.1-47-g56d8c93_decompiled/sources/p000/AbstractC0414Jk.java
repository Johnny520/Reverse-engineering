package p000;

import java.security.GeneralSecurityException;

/* JADX INFO: renamed from: Jk */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0414Jk {

    /* JADX INFO: renamed from: a */
    public static final C0380It f1386a;

    /* JADX INFO: renamed from: b */
    public static final C0337Ht f1387b;

    /* JADX INFO: renamed from: c */
    public static final C1228bn f1388c;

    /* JADX INFO: renamed from: d */
    public static final C1148an f1389d;

    static {
        C2787z6 c2787z6M5333b = AbstractC2751yD.m5333b("type.googleapis.com/google.crypto.tink.HmacKey");
        f1386a = new C0380It(C0285Gk.class);
        f1387b = new C0337Ht(c2787z6M5333b);
        f1388c = new C1228bn(C0156Dk.class);
        f1389d = new C1148an(c2787z6M5333b, new C2438r1(10));
    }

    /* JADX INFO: renamed from: a */
    public static C2610v1 m863a(EnumC2463rk enumC2463rk) throws GeneralSecurityException {
        int iOrdinal = enumC2463rk.ordinal();
        if (iOrdinal == 1) {
            return C2610v1.f9018s;
        }
        if (iOrdinal == 2) {
            return C2610v1.f9021v;
        }
        if (iOrdinal == 3) {
            return C2610v1.f9020u;
        }
        if (iOrdinal == 4) {
            return C2610v1.f9022w;
        }
        if (iOrdinal == 5) {
            return C2610v1.f9019t;
        }
        throw new GeneralSecurityException("Unable to parse HashType: " + enumC2463rk.m4953a());
    }

    /* JADX INFO: renamed from: b */
    public static C2610v1 m864b(EnumC2773yt enumC2773yt) throws GeneralSecurityException {
        int iOrdinal = enumC2773yt.ordinal();
        if (iOrdinal == 1) {
            return C2610v1.f9023x;
        }
        if (iOrdinal == 2) {
            return C2610v1.f9025z;
        }
        if (iOrdinal == 3) {
            return C2610v1.f8995A;
        }
        if (iOrdinal == 4) {
            return C2610v1.f9024y;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + enumC2773yt.m5345b());
    }
}
