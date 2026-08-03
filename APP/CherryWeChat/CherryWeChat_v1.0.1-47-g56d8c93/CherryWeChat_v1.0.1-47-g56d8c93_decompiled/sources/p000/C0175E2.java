package p000;

import android.security.keystore.KeyGenParameterSpec;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.util.Arrays;
import javax.crypto.KeyGenerator;

/* JADX INFO: renamed from: E2 */
/* JADX INFO: loaded from: classes.dex */
public final class C0175E2 {

    /* JADX INFO: renamed from: b */
    public static final Object f455b = new Object();

    /* JADX INFO: renamed from: a */
    public KeyStore f456a;

    public C0175E2() {
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            this.f456a = keyStore;
        } catch (IOException | GeneralSecurityException e) {
            throw new IllegalStateException(e);
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m326a(String str) {
        C0175E2 c0175e2 = new C0175E2();
        synchronized (f455b) {
            try {
                if (c0175e2.m329d(str)) {
                    return false;
                }
                m327b(str);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m327b(String str) throws NoSuchAlgorithmException, NoSuchProviderException, InvalidAlgorithmParameterException {
        String strM147b = AbstractC0100CD.m147b(str);
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
        keyGenerator.init(new KeyGenParameterSpec.Builder(strM147b, 3).setKeySize(256).setBlockModes("GCM").setEncryptionPaddings("NoPadding").build());
        keyGenerator.generateKey();
    }

    /* JADX INFO: renamed from: c */
    public final synchronized C0947W1 m328c(String str) {
        C0947W1 c0947w1;
        c0947w1 = new C0947W1(AbstractC0100CD.m147b(str), this.f456a);
        byte[] bArrM2297a = AbstractC1192av.m2297a(10);
        byte[] bArr = new byte[0];
        if (!Arrays.equals(bArrM2297a, c0947w1.mo1003b(c0947w1.mo1002a(bArrM2297a, bArr), bArr))) {
            throw new KeyStoreException("cannot use Android Keystore: encryption/decryption of non-empty message and empty aad returns an incorrect result");
        }
        return c0947w1;
    }

    /* JADX INFO: renamed from: d */
    public final synchronized boolean m329d(String str) {
        String strM147b;
        strM147b = AbstractC0100CD.m147b(str);
        try {
            try {
            } catch (NullPointerException unused) {
                try {
                    Thread.sleep((int) (Math.random() * 40.0d));
                } catch (InterruptedException unused2) {
                }
                KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                this.f456a = keyStore;
                keyStore.load(null);
                return this.f456a.containsAlias(strM147b);
            }
        } catch (IOException e) {
            throw new GeneralSecurityException(e);
        }
        return this.f456a.containsAlias(strM147b);
    }
}
