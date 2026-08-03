package p000;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Locale;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: CD */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0100CD {
    static {
        Pattern.compile("^projects/([0-9a-zA-Z\\-\\.\\_~])+/locations/([0-9a-zA-Z\\-\\.\\_~])+/keyRings/([0-9a-zA-Z\\-\\.\\_~])+/cryptoKeys/([0-9a-zA-Z\\-\\.\\_~])+$", 2);
        Pattern.compile("^projects/([0-9a-zA-Z\\-\\.\\_~])+/locations/([0-9a-zA-Z\\-\\.\\_~])+/keyRings/([0-9a-zA-Z\\-\\.\\_~])+/cryptoKeys/([0-9a-zA-Z\\-\\.\\_~])+/cryptoKeyVersions/([0-9a-zA-Z\\-\\.\\_~])+$", 2);
    }

    /* JADX INFO: renamed from: a */
    public static void m146a(int r2) {
        if (r2 != 16) goto L5;
        return;
    L5:
        if (r2 != 32) goto L8;
        return;
    L8:
        throw new InvalidAlgorithmParameterException(String.format("invalid key size %d; only 128-bit and 256-bit AES keys are supported", new Object[]{Integer.valueOf(r2 * 8)}));
    }

    /* JADX INFO: renamed from: b */
    public static String m147b(String r2) {
        if (r2.toLowerCase(Locale.US).startsWith("android-keystore://") == false) goto L7;
        return r2.substring(19);
    L7:
        throw new IllegalArgumentException("key URI must start with android-keystore://");
    }

    /* JADX INFO: renamed from: c */
    public static void m148c(int r2) {
        if (r2 < 0) goto L6;
        if (r2 > 0) goto L6;
        return;
    L6:
        throw new GeneralSecurityException(String.format("key has version %d; only keys with version in range [0..%d] are supported", new Object[]{Integer.valueOf(r2), 0}));
    }
}
