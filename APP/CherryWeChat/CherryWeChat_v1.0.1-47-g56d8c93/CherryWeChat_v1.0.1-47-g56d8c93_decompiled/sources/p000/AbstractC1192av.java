package p000;

import java.security.SecureRandom;

/* JADX INFO: renamed from: av */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1192av {

    /* JADX INFO: renamed from: a */
    public static final C0174E1 f4078a = new C0174E1(6);

    /* JADX INFO: renamed from: a */
    public static byte[] m2297a(int i) {
        byte[] bArr = new byte[i];
        ((SecureRandom) f4078a.get()).nextBytes(bArr);
        return bArr;
    }
}
