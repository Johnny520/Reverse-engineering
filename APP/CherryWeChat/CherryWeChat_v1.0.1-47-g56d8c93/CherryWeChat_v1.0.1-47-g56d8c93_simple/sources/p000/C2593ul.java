package p000;

import android.os.Build;
import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Objects;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: renamed from: ul */
/* JADX INFO: loaded from: classes.dex */
public final class C2593ul {

    /* JADX INFO: renamed from: c */
    public static final C0174E1 f8967c = null;

    /* JADX INFO: renamed from: a */
    public final SecretKeySpec f8968a;

    /* JADX INFO: renamed from: b */
    public final boolean f8969b;

    static {
        f8967c = new C0174E1(5);
    }

    public C2593ul(byte[] r3) {
        if (AbstractC2374ph.m4806c(2) == false) goto L7;
        AbstractC0100CD.m146a(r3.length);
        this.f8968a = new SecretKeySpec(r3, "AES");
        this.f8969b = true;
        return;
    L7:
        throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
    }

    /* JADX INFO: renamed from: a */
    public static AlgorithmParameterSpec m5101a(byte[] r5) {
        int r0 = r5.length;
        if ("The Android Project".equals(System.getProperty("java.vendor")) == false) goto L16;
        int r2 = AbstractC2751yD.f9382a;
        if (Objects.equals(System.getProperty("java.vendor"), "The Android Project") == true) goto L7;
        Integer r1 = null;
    L8:
        if (r1 == null) goto L10;
        int r12 = r1.intValue();
    L12:
        if (r12 > 19) goto L16;
        return new IvParameterSpec(r5, 0, r0);
    L10:
        r12 = -1;
        goto L12
    L7:
        r1 = Integer.valueOf(Build.VERSION.SDK_INT);
    L16:
        return new GCMParameterSpec(128, r5, 0, r0);
    }
}
