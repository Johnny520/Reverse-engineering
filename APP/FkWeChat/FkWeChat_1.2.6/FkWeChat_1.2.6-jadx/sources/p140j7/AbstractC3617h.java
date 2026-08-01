package p140j7;

import java.util.Locale;
import okhttp3.internal.url._UrlKt;
import p024b9.AbstractC1061t;
import p299ub.AbstractC8621f0;

/* JADX INFO: renamed from: j7.h */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3617h {

    /* JADX INFO: renamed from: a */
    public static final String f10069a;

    static {
        String property = System.getProperty("os.name", _UrlKt.FRAGMENT_ENCODE_SET);
        property.getClass();
        String lowerCase = property.toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        f10069a = lowerCase;
    }

    /* JADX INFO: renamed from: a */
    public static final String m13547a(String str) {
        str.getClass();
        return (AbstractC8621f0.m33126a0(f10069a, "windows", false, 2, null) && AbstractC1061t.m3842c(str, "0.0.0.0")) ? "127.0.0.1" : str;
    }
}
