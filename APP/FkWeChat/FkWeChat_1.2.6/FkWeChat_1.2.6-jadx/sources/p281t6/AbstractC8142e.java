package p281t6;

import java.nio.charset.Charset;
import java.util.Locale;
import p024b9.AbstractC1061t;
import p048d8.AbstractC1921a;
import p299ub.C8614c;

/* JADX INFO: renamed from: t6.e */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8142e {
    /* JADX INFO: renamed from: a */
    public static final Charset m31614a(AbstractC8160n abstractC8160n) {
        abstractC8160n.getClass();
        String strM31647c = abstractC8160n.m31647c("charset");
        if (strM31647c == null) {
            return null;
        }
        try {
            return AbstractC1921a.m6971e(C8614c.f28651a, strM31647c);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static final C8140d m31615b(C8140d c8140d, Charset charset) {
        c8140d.getClass();
        charset.getClass();
        return c8140d.m31601i("charset", AbstractC1921a.m6973g(charset));
    }

    /* JADX INFO: renamed from: c */
    public static final C8140d m31616c(C8140d c8140d, Charset charset) {
        c8140d.getClass();
        charset.getClass();
        String lowerCase = c8140d.m31598f().toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        return !AbstractC1061t.m3842c(lowerCase, "text") ? c8140d : c8140d.m31601i("charset", AbstractC1921a.m6973g(charset));
    }
}
