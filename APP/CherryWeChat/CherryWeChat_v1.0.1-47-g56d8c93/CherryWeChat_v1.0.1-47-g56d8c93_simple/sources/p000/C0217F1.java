package p000;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: renamed from: F1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0217F1 implements InterfaceC1506hl {

    /* JADX INFO: renamed from: d */
    public static final C0174E1 f641d = null;

    /* JADX INFO: renamed from: a */
    public final SecretKeySpec f642a;

    /* JADX INFO: renamed from: b */
    public final int f643b;

    /* JADX INFO: renamed from: c */
    public final int f644c;

    static {
        f641d = new C0174E1(0);
    }

    public C0217F1(int r3, byte[] r4) {
        if (AbstractC2374ph.m4806c(2) == false) goto L12;
        AbstractC0100CD.m146a(r4.length);
        this.f642a = new SecretKeySpec(r4, "AES");
        int r42 = ((Cipher) f641d.get()).getBlockSize();
        this.f644c = r42;
        if (r3 < 12) goto L10;
        if (r3 > r42) goto L10;
        this.f643b = r3;
        return;
    L10:
        throw new GeneralSecurityException("invalid IV size");
    L12:
        throw new GeneralSecurityException("Can not use AES-CTR in FIPS-mode, as BoringCrypto module is not available.");
    }

    /* JADX INFO: renamed from: a */
    public final void m434a(byte[] r5, int r6, int r7, byte[] r8, int r9, byte[] r10, boolean r11) {
        Cipher r0 = (Cipher) f641d.get();
        byte[] r1 = new byte[this.f644c];
        System.arraycopy(r10, 0, r1, 0, this.f643b);
        IvParameterSpec r102 = new IvParameterSpec(r1);
        SecretKeySpec r12 = this.f642a;
        if (r11 == false) goto L6;
        r0.init(1, r12, r102);
    L8:
        if (r0.doFinal(r5, r6, r7, r8, r9) != r7) goto L11;
        return;
    L11:
        throw new GeneralSecurityException("stored output's length does not match input's length");
    L6:
        r0.init(2, r12, r102);
        goto L8
    }
}
