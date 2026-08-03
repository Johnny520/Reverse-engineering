package p000;

import io.sentry.util.C2035g;
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

    public /* synthetic */ C0174E1(int r1) {
        this.f454a = r1;
    }

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        switch(this.f454a) {
            case 0: goto L37;
            case 1: goto L39;
            case 2: goto L43;
            case 3: goto L45;
            case 4: goto L16;
            case 5: goto L41;
            case 6: goto L8;
            case 7: goto L7;
            default: goto L5;
        };
    L8:
        SecureRandom r0 = new SecureRandom();
        r0.nextLong();
        return r0;
    L37:
        return (Cipher) C1369eg.f4898b.f4900a.m2582a("AES/CTR/NoPadding");
    L34:
        e = move-exception;
        throw new IllegalStateException(e);
    L39:
        return (Cipher) C1369eg.f4898b.f4900a.m2582a("AES/ECB/NOPADDING");
    L29:
        e = move-exception;
        throw new IllegalStateException(e);
    L41:
        return (Cipher) C1369eg.f4898b.f4900a.m2582a("AES/GCM/NoPadding");
    L12:
        e = move-exception;
        throw new IllegalStateException(e);
    L43:
        return (Cipher) C1369eg.f4898b.f4900a.m2582a("AES/CTR/NOPADDING");
    L24:
        e = move-exception;
        throw new IllegalStateException(e);
    L45:
        return (Cipher) C1369eg.f4898b.f4900a.m2582a("AES/GCM-SIV/NoPadding");
    L19:
        e = move-exception;
        throw new IllegalStateException(e);
    L5:
        return new C2035g();
    L7:
        return new DecimalFormat("#.################", DecimalFormatSymbols.getInstance(Locale.ROOT));
    L16:
        return new Random();
    }
}
