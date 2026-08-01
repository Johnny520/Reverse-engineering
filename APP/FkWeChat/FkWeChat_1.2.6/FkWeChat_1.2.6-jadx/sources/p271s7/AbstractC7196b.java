package p271s7;

import java.util.Iterator;
import okhttp3.internal.url._UrlKt;
import p299ub.C8632n;

/* JADX INFO: renamed from: s7.b */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7196b {

    /* JADX INFO: renamed from: a */
    public static final C8632n f23876a = new C8632n("\r\n|\r|\n");

    /* JADX INFO: renamed from: b */
    public static final void m28435b(StringBuilder sb2, String str, Object obj) {
        if (obj != null) {
            Iterator it = f23876a.m33220l(obj.toString(), 0).iterator();
            while (it.hasNext()) {
                sb2.append(str + ": " + ((String) it.next()) + "\r\n");
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static final String m28436c(String str, String str2, String str3, Long l10, String str4) {
        StringBuilder sb2 = new StringBuilder();
        m28435b(sb2, "event", str2);
        m28435b(sb2, "data", str);
        m28435b(sb2, "id", str3);
        m28435b(sb2, "retry", l10);
        m28435b(sb2, _UrlKt.FRAGMENT_ENCODE_SET, str4);
        return sb2.toString();
    }
}
