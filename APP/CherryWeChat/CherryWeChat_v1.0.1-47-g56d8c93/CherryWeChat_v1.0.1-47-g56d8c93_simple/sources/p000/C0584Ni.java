package p000;

import android.os.Handler;
import android.os.HandlerThread;
import android.util.SparseIntArray;
import java.io.Serializable;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: renamed from: Ni */
/* JADX INFO: loaded from: classes.dex */
public final class C0584Ni implements InterfaceC1427fu {

    /* JADX INFO: renamed from: e */
    public static HandlerThread f1890e;

    /* JADX INFO: renamed from: f */
    public static Handler f1891f;

    /* JADX INFO: renamed from: a */
    public final int f1892a;

    /* JADX INFO: renamed from: b */
    public Object f1893b;

    /* JADX INFO: renamed from: c */
    public final Serializable f1894c;

    /* JADX INFO: renamed from: d */
    public final Object f1895d;

    public C0584Ni(String r4, SecretKeySpec r5) {
        C1471gu r0 = new C1471gu(this);
        this.f1893b = r0;
        byte r1 = 2;
        if (AbstractC2374ph.m4806c(2) == false) goto L41;
        this.f1894c = r4;
        this.f1895d = r5;
        if (r5.getEncoded().length < 16) goto L39;
        switch(r4.hashCode()) {
            case -1823053428: goto L25;
            case 392315023: goto L21;
            case 392315118: goto L18;
            case 392316170: goto L14;
            case 392317873: goto L10;
            default: goto L8;
        };
    L8:
        r1 = -1;
    L28:
        switch(r1) {
            case 0: goto L35;
            case 1: goto L34;
            case 2: goto L33;
            case 3: goto L32;
            case 4: goto L31;
            default: goto L30;
        };
    L31:
        this.f1892a = 64;
    L36:
        r0.get();
        return;
    L32:
        this.f1892a = 48;
        goto L36
    L33:
        this.f1892a = 32;
        goto L36
    L34:
        this.f1892a = 28;
        goto L36
    L35:
        this.f1892a = 20;
        goto L36
    L30:
        throw new NoSuchAlgorithmException("unknown Hmac algorithm: ".concat(r4));
    L10:
        if (r4.equals("HMACSHA512") == false) goto L42;
        r1 = 4;
        goto L28
    L42:
        r1 = -1;
        goto L28
    L14:
        if (r4.equals("HMACSHA384") == false) goto L43;
        r1 = 3;
        goto L28
    L43:
        r1 = -1;
        goto L28
    L18:
        if (r4.equals("HMACSHA256") == true) goto L28;
        r1 = -1;
        goto L28
    L21:
        if (r4.equals("HMACSHA224") == false) goto L45;
        r1 = 1;
        goto L28
    L45:
        r1 = -1;
        goto L28
    L25:
        if (r4.equals("HMACSHA1") == false) goto L46;
        r1 = 0;
        goto L28
    L46:
        r1 = -1;
        goto L28
    L39:
        throw new InvalidAlgorithmParameterException("key size too small, need at least 16 bytes");
    L41:
        throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
    }

    /* JADX INFO: renamed from: a */
    public static void m1120a(SparseIntArray r4, long r5) {
        if (r4 == null) goto L7;
        int r0 = (int) ((500000 + r5) / 1000000);
        if (r5 < 0) goto L8;
        r4.put(r0, r4.get(r0) + 1);
        return;
    L8:
        return;
    }

    @Override // p000.InterfaceC1427fu
    /* JADX INFO: renamed from: b */
    public byte[] mo1121b(int r3, byte[] r4) {
        C1471gu r0 = (C1471gu) this.f1893b;
        if (r3 > this.f1892a) goto L7;
        ((Mac) r0.get()).update(r4);
        return Arrays.copyOf(((Mac) r0.get()).doFinal(), r3);
    L7:
        throw new InvalidAlgorithmParameterException("tag size too big");
    }

    public C0584Ni(int r2) {
        this.f1893b = new SparseIntArray[9];
        this.f1894c = new ArrayList();
        this.f1895d = new WindowOnFrameMetricsAvailableListenerC0541Mi(this);
        this.f1892a = r2;
    }
}
