package p000;

import android.security.keystore.KeyGenParameterSpec;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.util.Arrays;
import javax.crypto.KeyGenerator;

/* JADX INFO: renamed from: E2 */
/* JADX INFO: loaded from: classes.dex */
public final class C0175E2 {

    /* JADX INFO: renamed from: b */
    public static final Object f455b = null;

    /* JADX INFO: renamed from: a */
    public KeyStore f456a;

    static {
        f455b = new Object();
    }

    public C0175E2() {
        KeyStore r0 = KeyStore.getInstance("AndroidKeyStore");     // Catch: IOException -> L5 Throwable -> L7
        r0.load(null);     // Catch: IOException -> L5 Throwable -> L7
        this.f456a = r0;
        return;
    L7:
        e = move-exception;
        throw new IllegalStateException(e);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m326a(String r2) {
        C0175E2 r0 = new C0175E2();
        Object r1 = f455b;
        monitor-enter(r1);
    L9:
        th = move-exception;
        throw th;
    L5:
        if (r0.m329d(r2) == true) goto L12;
        m327b(r2);     // Catch: Throwable -> L9
        monitor-exit(r1);     // Catch: Throwable -> L9
        return true;
    L12:
        monitor-exit(r1);     // Catch: Throwable -> L9
        return false;
    }

    /* JADX INFO: renamed from: b */
    public static void m327b(String r3) {
        String r32 = AbstractC0100CD.m147b(r3);
        KeyGenerator r0 = KeyGenerator.getInstance("AES", "AndroidKeyStore");
        r0.init(new KeyGenParameterSpec.Builder(r32, 3).setKeySize(256).setBlockModes(new String[]{"GCM"}).setEncryptionPaddings(new String[]{"NoPadding"}).build());
        r0.generateKey();
    }

    /* JADX INFO: renamed from: c */
    public final synchronized C0947W1 m328c(String r4) {
        monitor-enter(this);
        C0947W1 r0 = new C0947W1(AbstractC0100CD.m147b(r4), this.f456a);     // Catch: Throwable -> L9
        byte[] r42 = AbstractC1192av.m2297a(10);     // Catch: Throwable -> L9
        byte[] r1 = new byte[0];     // Catch: Throwable -> L9
        if (Arrays.equals(r42, r0.mo1003b(r0.mo1002a(r42, r1), r1)) == false) goto L8;
        monitor-exit(this);
        return r0;
    L8:
        throw new KeyStoreException("cannot use Android Keystore: encryption/decryption of non-empty message and empty aad returns an incorrect result");     // Catch: Throwable -> L9
    L9:
        th = move-exception;
        throw th;
    }

    /* JADX INFO: renamed from: d */
    public final synchronized boolean m329d(String r5) {
        monitor-enter(this);
        String r52 = AbstractC0100CD.m147b(r5);     // Catch: Throwable -> L7
        boolean r53 = this.f456a.containsAlias(r52);     // Catch: Throwable -> L7 NullPointerException -> L9
        monitor-exit(this);
        return r53;
    L16:
        e = move-exception;
        throw new GeneralSecurityException(e);     // Catch: Throwable -> L7
    L25:
        Thread.sleep((int) (Math.random() * 40.0d));     // Catch: Throwable -> L7 InterruptedException -> L21 IOException -> L16
    L12:
        KeyStore r0 = KeyStore.getInstance("AndroidKeyStore");     // Catch: Throwable -> L7 IOException -> L16
        this.f456a = r0;     // Catch: Throwable -> L7 IOException -> L16
        r0.load(null);     // Catch: Throwable -> L7 IOException -> L16
    L15:
        return this.f456a.containsAlias(r52);
    L7:
        th = move-exception;
        throw th;
    }
}
