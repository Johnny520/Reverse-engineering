package p241q7;

import okhttp3.internal.url._UrlKt;
import p024b9.AbstractC1061t;
import p299ub.AbstractC8611a0;
import p299ub.AbstractC8621f0;
import p299ub.AbstractC8625h0;
import p376zd.C9987e;

/* JADX INFO: renamed from: q7.g */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C6289g {

    /* JADX INFO: renamed from: a */
    public static final C6289g f19710a = new C6289g();

    /* JADX INFO: renamed from: a */
    public final AbstractC6299l m24889a(String str) {
        str.getClass();
        return AbstractC1061t.m3842c(str, "*") ? C6293i.f19724a : new C6283d(str);
    }

    /* JADX INFO: renamed from: b */
    public final AbstractC6299l m24890b(String str) {
        str.getClass();
        int iM33150m0 = AbstractC8621f0.m33150m0(str, '{', 0, false, 6, null);
        int iM33164t0 = AbstractC8621f0.m33164t0(str, '}', 0, false, 6, null);
        String strSubstring = iM33150m0 == 0 ? null : str.substring(0, iM33150m0);
        String strSubstring2 = iM33164t0 == str.length() - 1 ? null : str.substring(iM33164t0 + 1);
        String strSubstring3 = str.substring(iM33150m0 + 1, iM33164t0);
        if (AbstractC8611a0.m33060E(strSubstring3, "?", false, 2, null)) {
            return new C6285e(AbstractC8625h0.m33177w1(strSubstring3, 1), strSubstring, strSubstring2);
        }
        if (!AbstractC8611a0.m33060E(strSubstring3, "...", false, 2, null)) {
            return new C6287f(strSubstring3, strSubstring, strSubstring2);
        }
        if (strSubstring2 != null && strSubstring2.length() != 0) {
            C9987e.m38645a("Suffix after tailcard is not supported");
            return null;
        }
        String strM33177w1 = AbstractC8625h0.m33177w1(strSubstring3, 3);
        if (strSubstring == null) {
            strSubstring = _UrlKt.FRAGMENT_ENCODE_SET;
        }
        return new C6291h(strM33177w1, strSubstring);
    }
}
