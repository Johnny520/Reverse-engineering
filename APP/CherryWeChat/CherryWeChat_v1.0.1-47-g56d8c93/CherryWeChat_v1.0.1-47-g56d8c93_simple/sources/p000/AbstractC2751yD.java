package p000;

import java.nio.charset.Charset;
import java.security.SecureRandom;

/* JADX INFO: renamed from: yD */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2751yD {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f9382a = 0;

    static {
        Charset.forName("UTF-8");
    }

    /* JADX INFO: renamed from: a */
    public static int m5332a() {
        SecureRandom r0 = new SecureRandom();
        byte[] r1 = new byte[4];
        int r3 = 0;
    L3:
        if (r3 != 0) goto L5;
        r0.nextBytes(r1);
        r3 = ((((r1[0] & 127) << 24) | ((r1[1] & 255) << 16)) | ((r1[2] & 255) << 8)) | (r1[3] & 255);
        goto L3
    L5:
        return r3;
    }

    /* JADX INFO: renamed from: b */
    public static final C2787z6 m5333b(String r4) {
        byte[] r0 = new byte[r4.length()];
        int r1 = 0;
    L4:
        if (r1 >= r4.length()) goto L13;
        char r2 = r4.charAt(r1);
        if (r2 < '!') goto L11;
        if (r2 > '~') goto L11;
        r0[r1] = (byte) r2;
        r1 = r1 + 1;
    L11:
        throw new C0232Fa("Not a printable ASCII character: " + r2);
    L13:
        return C2787z6.m5359a(r0);
    }
}
