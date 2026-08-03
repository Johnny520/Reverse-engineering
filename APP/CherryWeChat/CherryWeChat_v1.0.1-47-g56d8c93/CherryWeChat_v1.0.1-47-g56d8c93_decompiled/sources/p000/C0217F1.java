package p000;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: renamed from: F1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0217F1 implements InterfaceC1506hl {

    /* JADX INFO: renamed from: d */
    public static final C0174E1 f641d = new C0174E1(0);

    /* JADX INFO: renamed from: a */
    public final SecretKeySpec f642a;

    /* JADX INFO: renamed from: b */
    public final int f643b;

    /* JADX INFO: renamed from: c */
    public final int f644c;

    public C0217F1(int i, byte[] bArr) throws GeneralSecurityException {
        if (!AbstractC2374ph.m4806c(2)) {
            throw new GeneralSecurityException("Can not use AES-CTR in FIPS-mode, as BoringCrypto module is not available.");
        }
        AbstractC0100CD.m146a(bArr.length);
        this.f642a = new SecretKeySpec(bArr, "AES");
        int blockSize = ((Cipher) f641d.get()).getBlockSize();
        this.f644c = blockSize;
        if (i < 12 || i > blockSize) {
            throw new GeneralSecurityException("invalid IV size");
        }
        this.f643b = i;
    }

    /* JADX INFO: renamed from: a */
    public final void m434a(byte[] bArr, int i, int i2, byte[] bArr2, int i3, byte[] bArr3, boolean z) throws GeneralSecurityException {
        Cipher cipher = (Cipher) f641d.get();
        byte[] bArr4 = new byte[this.f644c];
        System.arraycopy(bArr3, 0, bArr4, 0, this.f643b);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr4);
        SecretKeySpec secretKeySpec = this.f642a;
        if (z) {
            cipher.init(1, secretKeySpec, ivParameterSpec);
        } else {
            cipher.init(2, secretKeySpec, ivParameterSpec);
        }
        if (cipher.doFinal(bArr, i, i2, bArr2, i3) != i2) {
            throw new GeneralSecurityException("stored output's length does not match input's length");
        }
    }
}
