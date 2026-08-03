package p000;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: renamed from: e2 */
/* JADX INFO: loaded from: classes.dex */
public final class C1348e2 implements InterfaceC1435g1 {

    /* JADX INFO: renamed from: b */
    public static final C0174E1 f4845b = new C0174E1(3);

    /* JADX INFO: renamed from: a */
    public final SecretKeySpec f4846a;

    public C1348e2(byte[] bArr) throws InvalidAlgorithmParameterException {
        AbstractC0100CD.m146a(bArr.length);
        this.f4846a = new SecretKeySpec(bArr, "AES");
    }

    /* JADX INFO: renamed from: c */
    public static AlgorithmParameterSpec m2599c(int i, byte[] bArr) throws GeneralSecurityException {
        try {
            Class.forName("javax.crypto.spec.GCMParameterSpec");
            return new GCMParameterSpec(128, bArr, 0, i);
        } catch (ClassNotFoundException unused) {
            if ("The Android Project".equals(System.getProperty("java.vendor"))) {
                return new IvParameterSpec(bArr, 0, i);
            }
            throw new GeneralSecurityException("cannot use AES-GCM: javax.crypto.spec.GCMParameterSpec not found");
        }
    }

    @Override // p000.InterfaceC1435g1
    /* JADX INFO: renamed from: a */
    public final byte[] mo1002a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length > 2147483619) {
            throw new GeneralSecurityException("plaintext too long");
        }
        byte[] bArr3 = new byte[bArr.length + 28];
        byte[] bArrM2297a = AbstractC1192av.m2297a(12);
        System.arraycopy(bArrM2297a, 0, bArr3, 0, 12);
        AlgorithmParameterSpec algorithmParameterSpecM2599c = m2599c(bArrM2297a.length, bArrM2297a);
        C0174E1 c0174e1 = f4845b;
        ((Cipher) c0174e1.get()).init(1, this.f4846a, algorithmParameterSpecM2599c);
        if (bArr2 != null && bArr2.length != 0) {
            ((Cipher) c0174e1.get()).updateAAD(bArr2);
        }
        int iDoFinal = ((Cipher) c0174e1.get()).doFinal(bArr, 0, bArr.length, bArr3, 12);
        if (iDoFinal == bArr.length + 16) {
            return bArr3;
        }
        throw new GeneralSecurityException(AbstractC2374ph.m4813j(iDoFinal - bArr.length, "encryption failed; GCM tag must be 16 bytes, but got only ", " bytes"));
    }

    @Override // p000.InterfaceC1435g1
    /* JADX INFO: renamed from: b */
    public final byte[] mo1003b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length < 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        AlgorithmParameterSpec algorithmParameterSpecM2599c = m2599c(12, bArr);
        C0174E1 c0174e1 = f4845b;
        ((Cipher) c0174e1.get()).init(2, this.f4846a, algorithmParameterSpecM2599c);
        if (bArr2 != null && bArr2.length != 0) {
            ((Cipher) c0174e1.get()).updateAAD(bArr2);
        }
        return ((Cipher) c0174e1.get()).doFinal(bArr, 12, bArr.length - 12);
    }
}
