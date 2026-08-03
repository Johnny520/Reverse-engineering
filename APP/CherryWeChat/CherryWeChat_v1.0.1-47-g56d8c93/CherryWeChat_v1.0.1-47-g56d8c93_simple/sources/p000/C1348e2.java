package p000;

import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: renamed from: e2 */
/* JADX INFO: loaded from: classes.dex */
public final class C1348e2 implements InterfaceC1435g1 {

    /* JADX INFO: renamed from: b */
    public static final C0174E1 f4845b = null;

    /* JADX INFO: renamed from: a */
    public final SecretKeySpec f4846a;

    static {
        f4845b = new C0174E1(3);
    }

    public C1348e2(byte[] r3) {
        AbstractC0100CD.m146a(r3.length);
        this.f4846a = new SecretKeySpec(r3, "AES");
    }

    /* JADX INFO: renamed from: c */
    public static AlgorithmParameterSpec m2599c(int r3, byte[] r4) {
        Class.forName("javax.crypto.spec.GCMParameterSpec");     // Catch: ClassNotFoundException -> L5
        return new GCMParameterSpec(128, r4, 0, r3);
    L6:
        if ("The Android Project".equals(System.getProperty("java.vendor")) == false) goto L10;
        return new IvParameterSpec(r4, 0, r3);
    L10:
        throw new GeneralSecurityException("cannot use AES-GCM: javax.crypto.spec.GCMParameterSpec not found");
    }

    @Override // p000.InterfaceC1435g1
    /* JADX INFO: renamed from: a */
    public final byte[] mo1002a(byte[] r8, byte[] r9) {
        if (r8.length > 2147483619) goto L15;
        byte[] r5 = new byte[r8.length + 28];
        byte[] r1 = AbstractC1192av.m2297a(12);
        System.arraycopy(r1, 0, r5, 0, 12);
        AlgorithmParameterSpec r0 = m2599c(r1.length, r1);
        C0174E1 r12 = f4845b;
        ((Cipher) r12.get()).init(1, this.f4846a, r0);
        if (r9 != null) goto L7;
    L9:
        int r82 = ((Cipher) r12.get()).doFinal(r8, 0, r8.length, r5, 12);
        if (r82 != (r8.length + 16)) goto L13;
        return r5;
    L13:
        throw new GeneralSecurityException(AbstractC2374ph.m4813j(r82 - r8.length, "encryption failed; GCM tag must be 16 bytes, but got only ", " bytes"));
    L7:
        if (r9.length == 0) goto L9;
        ((Cipher) r12.get()).updateAAD(r9);
        goto L9
    L15:
        throw new GeneralSecurityException("plaintext too long");
    }

    @Override // p000.InterfaceC1435g1
    /* JADX INFO: renamed from: b */
    public final byte[] mo1003b(byte[] r7, byte[] r8) {
        if (r7.length < 28) goto L12;
        AlgorithmParameterSpec r1 = m2599c(12, r7);
        C0174E1 r2 = f4845b;
        ((Cipher) r2.get()).init(2, this.f4846a, r1);
        if (r8 == null) goto L10;
        if (r8.length == 0) goto L10;
        ((Cipher) r2.get()).updateAAD(r8);
    L10:
        return ((Cipher) r2.get()).doFinal(r7, 12, r7.length - 12);
    L12:
        throw new GeneralSecurityException("ciphertext too short");
    }
}
