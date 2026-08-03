package p000;

import io.sentry.util.C2035g;
import java.security.GeneralSecurityException;
import java.security.SecureRandom;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.Random;
import javax.crypto.Cipher;

/* JADX INFO: renamed from: E1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0174E1 extends ThreadLocal {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f454a;

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        switch (this.f454a) {
            case 0:
                try {
                    return (Cipher) C1369eg.f4898b.f4900a.m2582a("AES/CTR/NoPadding");
                } catch (GeneralSecurityException e) {
                    throw new IllegalStateException(e);
                }
            case 1:
                try {
                    return (Cipher) C1369eg.f4898b.f4900a.m2582a("AES/ECB/NOPADDING");
                } catch (GeneralSecurityException e2) {
                    throw new IllegalStateException(e2);
                }
            case 2:
                try {
                    return (Cipher) C1369eg.f4898b.f4900a.m2582a("AES/CTR/NOPADDING");
                } catch (GeneralSecurityException e3) {
                    throw new IllegalStateException(e3);
                }
            case 3:
                try {
                    return (Cipher) C1369eg.f4898b.f4900a.m2582a("AES/GCM-SIV/NoPadding");
                } catch (GeneralSecurityException e4) {
                    throw new IllegalStateException(e4);
                }
            case 4:
                return new Random();
            case 5:
                try {
                    return (Cipher) C1369eg.f4898b.f4900a.m2582a("AES/GCM/NoPadding");
                } catch (GeneralSecurityException e5) {
                    throw new IllegalStateException(e5);
                }
            case 6:
                SecureRandom secureRandom = new SecureRandom();
                secureRandom.nextLong();
                return secureRandom;
            case 7:
                return new DecimalFormat("#.################", DecimalFormatSymbols.getInstance(Locale.ROOT));
            default:
                return new C2035g();
        }
    }
}
