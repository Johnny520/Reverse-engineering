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

    public C0584Ni(String str, SecretKeySpec secretKeySpec) throws GeneralSecurityException {
        C1471gu c1471gu = new C1471gu(this);
        this.f1893b = c1471gu;
        if (!AbstractC2374ph.m4806c(2)) {
            throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        this.f1894c = str;
        this.f1895d = secretKeySpec;
        if (secretKeySpec.getEncoded().length < 16) {
            throw new InvalidAlgorithmParameterException("key size too small, need at least 16 bytes");
        }
        switch (str) {
            case "HMACSHA1":
                this.f1892a = 20;
                break;
            case "HMACSHA224":
                this.f1892a = 28;
                break;
            case "HMACSHA256":
                this.f1892a = 32;
                break;
            case "HMACSHA384":
                this.f1892a = 48;
                break;
            case "HMACSHA512":
                this.f1892a = 64;
                break;
            default:
                throw new NoSuchAlgorithmException("unknown Hmac algorithm: ".concat(str));
        }
        c1471gu.get();
    }

    /* JADX INFO: renamed from: a */
    public static void m1120a(SparseIntArray sparseIntArray, long j) {
        if (sparseIntArray != null) {
            int i = (int) ((500000 + j) / 1000000);
            if (j >= 0) {
                sparseIntArray.put(i, sparseIntArray.get(i) + 1);
            }
        }
    }

    @Override // p000.InterfaceC1427fu
    /* JADX INFO: renamed from: b */
    public byte[] mo1121b(int i, byte[] bArr) throws InvalidAlgorithmParameterException {
        C1471gu c1471gu = (C1471gu) this.f1893b;
        if (i > this.f1892a) {
            throw new InvalidAlgorithmParameterException("tag size too big");
        }
        ((Mac) c1471gu.get()).update(bArr);
        return Arrays.copyOf(((Mac) c1471gu.get()).doFinal(), i);
    }

    public C0584Ni(int i) {
        this.f1893b = new SparseIntArray[9];
        this.f1894c = new ArrayList();
        this.f1895d = new WindowOnFrameMetricsAvailableListenerC0541Mi(this);
        this.f1892a = i;
    }
}
