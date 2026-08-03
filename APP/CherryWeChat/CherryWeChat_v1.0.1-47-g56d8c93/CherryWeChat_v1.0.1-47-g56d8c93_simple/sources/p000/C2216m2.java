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
    public static final List f7707c = null;

    /* JADX INFO: renamed from: d */
    public static final byte[] f7708d = null;

    /* JADX INFO: renamed from: e */
    public static final byte[] f7709e = null;

    /* JADX INFO: renamed from: a */
    public final C2656w4 f7710a;

    /* JADX INFO: renamed from: b */
    public final byte[] f7711b;

    static {
        f7707c = Arrays.asList(new Integer[]{64});
        f7708d = new byte[16];
        f7709e = new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1};
    }

    public C2216m2(byte[] r4) {
        if (AbstractC2374ph.m4805b(1) == false) goto L11;
        Integer r0 = Integer.valueOf(r4.length);
        if (f7707c.contains(r0) == false) goto L9;
        byte[] r02 = Arrays.copyOfRange(r4, 0, r4.length / 2);
        this.f7711b = Arrays.copyOfRange(r4, r4.length / 2, r4.length);
        this.f7710a = new C2656w4(r02);
        return;
    L9:
        throw new InvalidKeyException(AbstractC0213Ey.m409g(new StringBuilder("invalid key size: "), r4.length, " bytes; key must have 64 bytes"));
    L11:
        throw new GeneralSecurityException("Can not use AES-SIV in FIPS-mode.");
    }

    @Override // p000.InterfaceC2714xd
    /* JADX INFO: renamed from: a */
    public final byte[] mo4458a(byte[] r6, byte[] r7) {
        if (r6.length > 2147483631) goto L7;
        Cipher r0 = (Cipher) C1369eg.f4898b.f4900a.m2582a("AES/CTR/NoPadding");
        byte[] r72 = m4460c(new byte[][]{r7, r6});
        byte[] r1 = (byte[]) r72.clone();
        r1[8] = (byte) (r1[8] & 127);
        r1[12] = (byte) (r1[12] & 127);
        r0.init(1, new SecretKeySpec(this.f7711b, "AES"), new IvParameterSpec(r1));
        return AbstractC0295Gu.m612e(new byte[][]{r72, r0.doFinal(r6)});
    L7:
        throw new GeneralSecurityException("plaintext too long");
    }

    @Override // p000.InterfaceC2714xd
    /* JADX INFO: renamed from: b */
    public final byte[] mo4459b(byte[] r9, byte[] r10) {
        if (r9.length < 16) goto L16;
        Cipher r0 = (Cipher) C1369eg.f4898b.f4900a.m2582a("AES/CTR/NoPadding");
        byte[] r3 = Arrays.copyOfRange(r9, 0, 16);
        byte[] r4 = (byte[]) r3.clone();
        r4[8] = (byte) (r4[8] & 127);
        r4[12] = (byte) (r4[12] & 127);
        r0.init(2, new SecretKeySpec(this.f7711b, "AES"), new IvParameterSpec(r4));
        byte[] r92 = Arrays.copyOfRange(r9, 16, r9.length);
        byte[] r02 = r0.doFinal(r92);
        if (r92.length != 0) goto L11;
        if (r02 != null) goto L11;
        if ("The Android Project".equals(System.getProperty("java.vendor")) == false) goto L11;
        r02 = new byte[0];
    L11:
        if (MessageDigest.isEqual(r3, m4460c(new byte[][]{r10, r02})) == false) goto L14;
        return r02;
    L14:
        throw new AEADBadTagException("Integrity check failed.");
    L16:
        throw new GeneralSecurityException("Ciphertext too short.");
    }

    /* JADX INFO: renamed from: c */
    public final byte[] m4460c(byte[]... r9) {
        int r0 = r9.length;
        C2656w4 r1 = this.f7710a;
        if (r0 == 0) goto L5;
        byte[] r02 = r1.mo1121b(16, f7708d);
        int r3 = 0;
        int r4 = 0;
    L8:
        if (r4 >= (r9.length - 1)) goto L13;
        byte[] r5 = r9[r4];
        if (r5 != null) goto L12;
        r5 = new byte[0];
    L12:
        r02 = AbstractC0295Gu.m607H(AbstractC1293cr.m2556u(r02), r1.mo1121b(16, r5));
        r4 = r4 + 1;
        goto L8
    L13:
        byte[] r92 = r9[r9.length - 1];
        if (r92.length < 16) goto L24;
        if (r92.length < r02.length) goto L22;
        int r42 = r92.length - r02.length;
        byte[] r93 = Arrays.copyOf(r92, r92.length);
    L19:
        if (r3 >= r02.length) goto L27;
        int r52 = r42 + r3;
        r93[r52] = (byte) (r93[r52] ^ r02[r3]);
        r3 = r3 + 1;
    L27:
        return r1.mo1121b(16, r93);
    L22:
        throw new IllegalArgumentException("xorEnd requires a.length >= b.length");
    L24:
        if (r92.length >= 16) goto L29;
        byte[] r32 = Arrays.copyOf(r92, 16);
        r32[r92.length] = -128;
        r93 = AbstractC0295Gu.m607H(r32, AbstractC1293cr.m2556u(r02));
        goto L27
    L29:
        throw new IllegalArgumentException("x must be smaller than a block.");
    L5:
        return r1.mo1121b(16, f7709e);
    }
}
