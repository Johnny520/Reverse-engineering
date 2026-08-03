package p000;

import java.security.GeneralSecurityException;

/* JADX INFO: renamed from: Jk */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0414Jk {

    /* JADX INFO: renamed from: a */
    public static final C0380It f1386a = null;

    /* JADX INFO: renamed from: b */
    public static final C0337Ht f1387b = null;

    /* JADX INFO: renamed from: c */
    public static final C1228bn f1388c = null;

    /* JADX INFO: renamed from: d */
    public static final C1148an f1389d = null;

    static {
        C2787z6 r0 = AbstractC2751yD.m5333b("type.googleapis.com/google.crypto.tink.HmacKey");
        f1386a = new C0380It(C0285Gk.class);
        f1387b = new C0337Ht(r0);
        f1388c = new C1228bn(C0156Dk.class);
        f1389d = new C1148an(r0, new C2438r1(10));
    }

    /* JADX INFO: renamed from: a */
    public static C2610v1 m863a(EnumC2463rk r3) {
        int r0 = r3.ordinal();
        if (r0 == 1) goto L23;
        if (r0 == 2) goto L21;
        if (r0 == 3) goto L19;
        if (r0 == 4) goto L17;
        if (r0 != 5) goto L15;
        return C2610v1.f9019t;
    L15:
        throw new GeneralSecurityException("Unable to parse HashType: " + r3.m4953a());
    L17:
        return C2610v1.f9022w;
    L19:
        return C2610v1.f9020u;
    L21:
        return C2610v1.f9021v;
    L23:
        return C2610v1.f9018s;
    }

    /* JADX INFO: renamed from: b */
    public static C2610v1 m864b(EnumC2773yt r3) {
        int r0 = r3.ordinal();
        if (r0 == 1) goto L19;
        if (r0 == 2) goto L17;
        if (r0 == 3) goto L15;
        if (r0 != 4) goto L13;
        return C2610v1.f9024y;
    L13:
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + r3.m5345b());
    L15:
        return C2610v1.f8995A;
    L17:
        return C2610v1.f9025z;
    L19:
        return C2610v1.f9023x;
    }
}
