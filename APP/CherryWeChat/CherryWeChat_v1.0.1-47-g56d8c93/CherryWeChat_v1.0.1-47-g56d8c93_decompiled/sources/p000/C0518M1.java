package p000;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.AEADBadTagException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: renamed from: M1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0518M1 implements InterfaceC1435g1 {

    /* JADX INFO: renamed from: e */
    public static final C0174E1 f1686e = new C0174E1(1);

    /* JADX INFO: renamed from: f */
    public static final C0174E1 f1687f = new C0174E1(2);

    /* JADX INFO: renamed from: a */
    public final byte[] f1688a;

    /* JADX INFO: renamed from: b */
    public final byte[] f1689b;

    /* JADX INFO: renamed from: c */
    public final SecretKeySpec f1690c;

    /* JADX INFO: renamed from: d */
    public final int f1691d;

    public C0518M1(int i, byte[] bArr) throws GeneralSecurityException {
        if (!AbstractC2374ph.m4805b(1)) {
            throw new GeneralSecurityException("Can not use AES-EAX in FIPS-mode.");
        }
        if (i != 12 && i != 16) {
            throw new IllegalArgumentException("IV size should be either 12 or 16 bytes");
        }
        this.f1691d = i;
        AbstractC0100CD.m146a(bArr.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        this.f1690c = secretKeySpec;
        Cipher cipher = (Cipher) f1686e.get();
        cipher.init(1, secretKeySpec);
        byte[] bArrM1000c = m1000c(cipher.doFinal(new byte[16]));
        this.f1688a = bArrM1000c;
        this.f1689b = m1000c(bArrM1000c);
    }

    /* JADX INFO: renamed from: c */
    public static byte[] m1000c(byte[] bArr) {
        byte[] bArr2 = new byte[16];
        int i = 0;
        while (i < 15) {
            int i2 = i + 1;
            bArr2[i] = (byte) (((bArr[i] << 1) ^ ((bArr[i2] & 255) >>> 7)) & 255);
            i = i2;
        }
        bArr2[15] = (byte) (((bArr[0] >> 7) & 135) ^ (bArr[15] << 1));
        return bArr2;
    }

    /* JADX INFO: renamed from: e */
    public static byte[] m1001e(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        byte[] bArr3 = new byte[length];
        for (int i = 0; i < length; i++) {
            bArr3[i] = (byte) (bArr[i] ^ bArr2[i]);
        }
        return bArr3;
    }

    @Override // p000.InterfaceC1435g1
    /* JADX INFO: renamed from: a */
    public final byte[] mo1002a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        int i = this.f1691d;
        if (length > 2147483631 - i) {
            throw new GeneralSecurityException("plaintext too long");
        }
        byte[] bArr3 = new byte[bArr.length + i + 16];
        byte[] bArrM2297a = AbstractC1192av.m2297a(i);
        System.arraycopy(bArrM2297a, 0, bArr3, 0, i);
        Cipher cipher = (Cipher) f1686e.get();
        SecretKeySpec secretKeySpec = this.f1690c;
        cipher.init(1, secretKeySpec);
        byte[] bArrM1004d = m1004d(cipher, 0, bArrM2297a, 0, bArrM2297a.length);
        byte[] bArr4 = bArr2 == null ? new byte[0] : bArr2;
        byte[] bArrM1004d2 = m1004d(cipher, 1, bArr4, 0, bArr4.length);
        Cipher cipher2 = (Cipher) f1687f.get();
        cipher2.init(1, secretKeySpec, new IvParameterSpec(bArrM1004d));
        cipher2.doFinal(bArr, 0, bArr.length, bArr3, this.f1691d);
        byte[] bArrM1004d3 = m1004d(cipher, 2, bArr3, this.f1691d, bArr.length);
        int length2 = bArr.length + i;
        for (int i2 = 0; i2 < 16; i2++) {
            bArr3[length2 + i2] = (byte) ((bArrM1004d2[i2] ^ bArrM1004d[i2]) ^ bArrM1004d3[i2]);
        }
        return bArr3;
    }

    @Override // p000.InterfaceC1435g1
    /* JADX INFO: renamed from: b */
    public final byte[] mo1003b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        int i = this.f1691d;
        int i2 = (length - i) - 16;
        if (i2 < 0) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        Cipher cipher = (Cipher) f1686e.get();
        SecretKeySpec secretKeySpec = this.f1690c;
        cipher.init(1, secretKeySpec);
        byte[] bArrM1004d = m1004d(cipher, 0, bArr, 0, this.f1691d);
        byte[] bArr3 = bArr2 == null ? new byte[0] : bArr2;
        byte[] bArrM1004d2 = m1004d(cipher, 1, bArr3, 0, bArr3.length);
        byte[] bArrM1004d3 = m1004d(cipher, 2, bArr, this.f1691d, i2);
        int length2 = bArr.length - 16;
        byte b = 0;
        for (int i3 = 0; i3 < 16; i3++) {
            b = (byte) (b | (((bArr[length2 + i3] ^ bArrM1004d2[i3]) ^ bArrM1004d[i3]) ^ bArrM1004d3[i3]));
        }
        if (b != 0) {
            throw new AEADBadTagException("tag mismatch");
        }
        Cipher cipher2 = (Cipher) f1687f.get();
        cipher2.init(1, secretKeySpec, new IvParameterSpec(bArrM1004d));
        return cipher2.doFinal(bArr, i, i2);
    }

    /* JADX INFO: renamed from: d */
    public final byte[] m1004d(Cipher cipher, int i, byte[] bArr, int i2, int i3) throws BadPaddingException, IllegalBlockSizeException {
        byte[] bArrCopyOf;
        byte[] bArr2 = new byte[16];
        bArr2[15] = (byte) i;
        byte[] bArr3 = this.f1688a;
        if (i3 == 0) {
            return cipher.doFinal(m1001e(bArr2, bArr3));
        }
        byte[] bArrDoFinal = cipher.doFinal(bArr2);
        int i4 = 0;
        while (i3 - i4 > 16) {
            for (int i5 = 0; i5 < 16; i5++) {
                bArrDoFinal[i5] = (byte) (bArrDoFinal[i5] ^ bArr[(i2 + i4) + i5]);
            }
            bArrDoFinal = cipher.doFinal(bArrDoFinal);
            i4 += 16;
        }
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i4 + i2, i2 + i3);
        if (bArrCopyOfRange.length == 16) {
            bArrCopyOf = m1001e(bArrCopyOfRange, bArr3);
        } else {
            bArrCopyOf = Arrays.copyOf(this.f1689b, 16);
            for (int i6 = 0; i6 < bArrCopyOfRange.length; i6++) {
                bArrCopyOf[i6] = (byte) (bArrCopyOf[i6] ^ bArrCopyOfRange[i6]);
            }
            bArrCopyOf[bArrCopyOfRange.length] = (byte) (bArrCopyOf[bArrCopyOfRange.length] ^ 128);
        }
        return cipher.doFinal(m1001e(bArrDoFinal, bArrCopyOf));
    }
}
