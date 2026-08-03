package p000;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.List;
import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: renamed from: m2 */
/* JADX INFO: loaded from: classes.dex */
public final class C2216m2 implements InterfaceC2714xd {

    /* JADX INFO: renamed from: c */
    public static final List f7707c = Arrays.asList(64);

    /* JADX INFO: renamed from: d */
    public static final byte[] f7708d = new byte[16];

    /* JADX INFO: renamed from: e */
    public static final byte[] f7709e = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1};

    /* JADX INFO: renamed from: a */
    public final C2656w4 f7710a;

    /* JADX INFO: renamed from: b */
    public final byte[] f7711b;

    public C2216m2(byte[] bArr) throws GeneralSecurityException {
        if (!AbstractC2374ph.m4805b(1)) {
            throw new GeneralSecurityException("Can not use AES-SIV in FIPS-mode.");
        }
        if (!f7707c.contains(Integer.valueOf(bArr.length))) {
            throw new InvalidKeyException(AbstractC0213Ey.m409g(new StringBuilder("invalid key size: "), bArr.length, " bytes; key must have 64 bytes"));
        }
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, bArr.length / 2);
        this.f7711b = Arrays.copyOfRange(bArr, bArr.length / 2, bArr.length);
        this.f7710a = new C2656w4(bArrCopyOfRange);
    }

    @Override // p000.InterfaceC2714xd
    /* JADX INFO: renamed from: a */
    public final byte[] mo4458a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length > 2147483631) {
            throw new GeneralSecurityException("plaintext too long");
        }
        Cipher cipher = (Cipher) C1369eg.f4898b.f4900a.m2582a("AES/CTR/NoPadding");
        byte[] bArrM4460c = m4460c(bArr2, bArr);
        byte[] bArr3 = (byte[]) bArrM4460c.clone();
        bArr3[8] = (byte) (bArr3[8] & 127);
        bArr3[12] = (byte) (bArr3[12] & 127);
        cipher.init(1, new SecretKeySpec(this.f7711b, "AES"), new IvParameterSpec(bArr3));
        return AbstractC0295Gu.m612e(bArrM4460c, cipher.doFinal(bArr));
    }

    @Override // p000.InterfaceC2714xd
    /* JADX INFO: renamed from: b */
    public final byte[] mo4459b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length < 16) {
            throw new GeneralSecurityException("Ciphertext too short.");
        }
        Cipher cipher = (Cipher) C1369eg.f4898b.f4900a.m2582a("AES/CTR/NoPadding");
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, 16);
        byte[] bArr3 = (byte[]) bArrCopyOfRange.clone();
        bArr3[8] = (byte) (bArr3[8] & 127);
        bArr3[12] = (byte) (bArr3[12] & 127);
        cipher.init(2, new SecretKeySpec(this.f7711b, "AES"), new IvParameterSpec(bArr3));
        byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr, 16, bArr.length);
        byte[] bArrDoFinal = cipher.doFinal(bArrCopyOfRange2);
        if (bArrCopyOfRange2.length == 0 && bArrDoFinal == null && "The Android Project".equals(System.getProperty("java.vendor"))) {
            bArrDoFinal = new byte[0];
        }
        if (MessageDigest.isEqual(bArrCopyOfRange, m4460c(bArr2, bArrDoFinal))) {
            return bArrDoFinal;
        }
        throw new AEADBadTagException("Integrity check failed.");
    }

    /* JADX INFO: renamed from: c */
    public final byte[] m4460c(byte[]... bArr) throws GeneralSecurityException {
        byte[] bArrM607H;
        int length = bArr.length;
        C2656w4 c2656w4 = this.f7710a;
        if (length == 0) {
            return c2656w4.mo1121b(16, f7709e);
        }
        byte[] bArrMo1121b = c2656w4.mo1121b(16, f7708d);
        for (int i = 0; i < bArr.length - 1; i++) {
            byte[] bArr2 = bArr[i];
            if (bArr2 == null) {
                bArr2 = new byte[0];
            }
            bArrMo1121b = AbstractC0295Gu.m607H(AbstractC1293cr.m2556u(bArrMo1121b), c2656w4.mo1121b(16, bArr2));
        }
        byte[] bArr3 = bArr[bArr.length - 1];
        if (bArr3.length >= 16) {
            if (bArr3.length < bArrMo1121b.length) {
                throw new IllegalArgumentException("xorEnd requires a.length >= b.length");
            }
            int length2 = bArr3.length - bArrMo1121b.length;
            bArrM607H = Arrays.copyOf(bArr3, bArr3.length);
            for (int i2 = 0; i2 < bArrMo1121b.length; i2++) {
                int i3 = length2 + i2;
                bArrM607H[i3] = (byte) (bArrM607H[i3] ^ bArrMo1121b[i2]);
            }
        } else {
            if (bArr3.length >= 16) {
                throw new IllegalArgumentException("x must be smaller than a block.");
            }
            byte[] bArrCopyOf = Arrays.copyOf(bArr3, 16);
            bArrCopyOf[bArr3.length] = -128;
            bArrM607H = AbstractC0295Gu.m607H(bArrCopyOf, AbstractC1293cr.m2556u(bArrMo1121b));
        }
        return c2656w4.mo1121b(16, bArrM607H);
    }
}
