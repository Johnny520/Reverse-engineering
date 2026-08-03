package p000;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: renamed from: M1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0518M1 implements InterfaceC1435g1 {

    /* JADX INFO: renamed from: e */
    public static final C0174E1 f1686e = null;

    /* JADX INFO: renamed from: f */
    public static final C0174E1 f1687f = null;

    /* JADX INFO: renamed from: a */
    public final byte[] f1688a;

    /* JADX INFO: renamed from: b */
    public final byte[] f1689b;

    /* JADX INFO: renamed from: c */
    public final SecretKeySpec f1690c;

    /* JADX INFO: renamed from: d */
    public final int f1691d;

    static {
        f1686e = new C0174E1(1);
        f1687f = new C0174E1(2);
    }

    public C0518M1(int r4, byte[] r5) {
        if (AbstractC2374ph.m4805b(1) == false) goto L13;
        if (r4 == 12) goto L10;
        if (r4 == 16) goto L10;
        throw new IllegalArgumentException("IV size should be either 12 or 16 bytes");
    L10:
        this.f1691d = r4;
        AbstractC0100CD.m146a(r5.length);
        SecretKeySpec r42 = new SecretKeySpec(r5, "AES");
        this.f1690c = r42;
        Cipher r52 = (Cipher) f1686e.get();
        r52.init(1, r42);
        byte[] r43 = m1000c(r52.doFinal(new byte[16]));
        this.f1688a = r43;
        this.f1689b = m1000c(r43);
        return;
    L13:
        throw new GeneralSecurityException("Can not use AES-EAX in FIPS-mode.");
    }

    /* JADX INFO: renamed from: c */
    public static byte[] m1000c(byte[] r6) {
        byte[] r0 = new byte[16];
        int r2 = 0;
    L4:
        if (r2 >= 15) goto L6;
        int r4 = r2 + 1;
        r0[r2] = (byte) (((r6[r2] << 1) ^ ((r6[r4] & 255) >>> 7)) & 255);
        r2 = r4;
        goto L4
    L6:
        r0[15] = (byte) (((r6[0] >> 7) & 135) ^ (r6[15] << 1));
        return r0;
    }

    /* JADX INFO: renamed from: e */
    public static byte[] m1001e(byte[] r5, byte[] r6) {
        int r0 = r5.length;
        byte[] r1 = new byte[r0];
        int r2 = 0;
    L3:
        if (r2 >= r0) goto L5;
        r1[r2] = (byte) (r5[r2] ^ r6[r2]);
        r2 = r2 + 1;
        goto L3
    L5:
        return r1;
    }

    @Override // p000.InterfaceC1435g1
    /* JADX INFO: renamed from: a */
    public final byte[] mo1002a(byte[] r18, byte[] r19) {
        int r1 = r18.length;
        int r7 = this.f1691d;
        if (r1 > (2147483631 - r7)) goto L13;
        byte[] r9 = new byte[(r18.length + r7) + 16];
        byte[] r3 = AbstractC1192av.m2297a(r7);
        int r10 = 0;
        System.arraycopy(r3, 0, r9, 0, r7);
        Cipher r12 = (Cipher) f1686e.get();
        SecretKeySpec r122 = this.f1690c;
        r12.init(1, r122);
        byte[] r13 = m1004d(r12, 0, r3, 0, r3.length);
        if (r19 != null) goto L7;
        byte[] r32 = new byte[0];
    L8:
        byte[] r14 = m1004d(r12, 1, r32, 0, r32.length);
        Cipher r0 = (Cipher) f1687f.get();
        r0.init(1, r122, new IvParameterSpec(r13));
        r0.doFinal(r18, 0, r18.length, r9, this.f1691d);
        byte[] r15 = m1004d(r12, 2, r9, this.f1691d, r18.length);
        int r02 = r18.length + r7;
    L9:
        if (r10 >= 16) goto L11;
        r9[r02 + r10] = (byte) ((r14[r10] ^ r13[r10]) ^ r15[r10]);
        r10 = r10 + 1;
        goto L9
    L11:
        return r9;
    L7:
        r32 = r19;
        goto L8
    L13:
        throw new GeneralSecurityException("plaintext too long");
    }

    @Override // p000.InterfaceC1435g1
    /* JADX INFO: renamed from: b */
    public final byte[] mo1003b(byte[] r15, byte[] r16) {
        int r1 = r15.length;
        int r6 = this.f1691d;
        int r8 = (r1 - r6) - 16;
        if (r8 < 0) goto L17;
        Cipher r12 = (Cipher) f1686e.get();
        SecretKeySpec r10 = this.f1690c;
        r12.init(1, r10);
        byte[] r11 = m1004d(r12, 0, r15, 0, this.f1691d);
        int r122 = 0;
        if (r16 != null) goto L7;
        byte[] r3 = new byte[0];
    L8:
        byte[] r13 = m1004d(r12, 1, r3, 0, r3.length);
        byte[] r14 = m1004d(r12, 2, r15, this.f1691d, r8);
        int r0 = r15.length - 16;
        byte r2 = 0;
    L9:
        if (r122 >= 16) goto L11;
        r2 = (byte) (r2 | (((r15[r0 + r122] ^ r13[r122]) ^ r11[r122]) ^ r14[r122]));
        r122 = r122 + 1;
        goto L9
    L11:
        if (r2 != 0) goto L15;
        Cipher r02 = (Cipher) f1687f.get();
        r02.init(1, r10, new IvParameterSpec(r11));
        return r02.doFinal(r15, r6, r8);
    L15:
        throw new AEADBadTagException("tag mismatch");
    L7:
        r3 = r16;
        goto L8
    L17:
        throw new GeneralSecurityException("ciphertext too short");
    }

    /* JADX INFO: renamed from: d */
    public final byte[] m1004d(Cipher r8, int r9, byte[] r10, int r11, int r12) {
        byte[] r1 = new byte[16];
        r1[15] = (byte) r9;
        byte[] r92 = this.f1688a;
        if (r12 == 0) goto L5;
        byte[] r13 = r8.doFinal(r1);
        int r2 = 0;
        int r3 = 0;
    L8:
        if ((r12 - r3) <= 16) goto L13;
        int r4 = 0;
    L10:
        if (r4 >= 16) goto L12;
        r13[r4] = (byte) (r13[r4] ^ r10[(r11 + r3) + r4]);
        r4 = r4 + 1;
        goto L10
    L12:
        r13 = r8.doFinal(r13);
        r3 = r3 + 16;
        goto L8
    L13:
        byte[] r102 = Arrays.copyOfRange(r10, r3 + r11, r11 + r12);
        if (r102.length != 16) goto L16;
        byte[] r93 = m1001e(r102, r92);
    L22:
        return r8.doFinal(m1001e(r13, r93));
    L16:
        r93 = Arrays.copyOf(this.f1689b, 16);
    L18:
        if (r2 >= r102.length) goto L20;
        r93[r2] = (byte) (r93[r2] ^ r102[r2]);
        r2 = r2 + 1;
        goto L18
    L20:
        r93[r102.length] = (byte) (r93[r102.length] ^ 128);
        goto L22
    L5:
        return r8.doFinal(m1001e(r1, r92));
    }
}
