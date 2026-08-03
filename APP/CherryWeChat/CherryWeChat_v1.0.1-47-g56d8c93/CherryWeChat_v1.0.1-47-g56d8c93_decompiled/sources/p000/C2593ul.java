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
    public static final C0174E1 f8967c = new C0174E1(5);

    /* JADX INFO: renamed from: a */
    public final SecretKeySpec f8968a;

    /* JADX INFO: renamed from: b */
    public final boolean f8969b;

    public C2593ul(byte[] bArr) throws GeneralSecurityException {
        if (!AbstractC2374ph.m4806c(2)) {
            throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        AbstractC0100CD.m146a(bArr.length);
        this.f8968a = new SecretKeySpec(bArr, "AES");
        this.f8969b = true;
    }

    /* JADX INFO: renamed from: a */
    public static AlgorithmParameterSpec m5101a(byte[] bArr) {
        int length = bArr.length;
        if ("The Android Project".equals(System.getProperty("java.vendor"))) {
            int i = AbstractC2751yD.f9382a;
            Integer numValueOf = !Objects.equals(System.getProperty("java.vendor"), "The Android Project") ? null : Integer.valueOf(Build.VERSION.SDK_INT);
            if ((numValueOf != null ? numValueOf.intValue() : -1) <= 19) {
                return new IvParameterSpec(bArr, 0, length);
            }
        }
        return new GCMParameterSpec(128, bArr, 0, length);
    }
}
