package p000;

import java.security.SecureRandom;

/* JADX INFO: renamed from: av */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1192av {

    /* JADX INFO: renamed from: a */
    public static final C0174E1 f4078a = null;

    static {
        f4078a = new C0174E1(6);
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m2297a(int r1) {
        byte[] r12 = new byte[r1];
        ((SecureRandom) f4078a.get()).nextBytes(r12);
        return r12;
    }
}
