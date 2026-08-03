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
        SecureRandom secureRandom = new SecureRandom();
        byte[] bArr = new byte[4];
        int i = 0;
        while (i == 0) {
            secureRandom.nextBytes(bArr);
            i = ((bArr[0] & 127) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        }
        return i;
    }

    /* JADX INFO: renamed from: b */
    public static final C2787z6 m5333b(String str) {
        byte[] bArr = new byte[str.length()];
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt < '!' || cCharAt > '~') {
                throw new C0232Fa("Not a printable ASCII character: " + cCharAt);
            }
            bArr[i] = (byte) cCharAt;
        }
        return C2787z6.m5359a(bArr);
    }
}
