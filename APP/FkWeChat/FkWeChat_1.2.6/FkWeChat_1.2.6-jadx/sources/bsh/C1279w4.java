package bsh;

import okhttp3.internal.url._UrlKt;

/* JADX INFO: renamed from: bsh.w4 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public class C1279w4 extends Exception {
    public C1279w4(String str) {
        super(str);
    }

    /* JADX INFO: renamed from: a */
    public C1163d2 mo5167a(InterfaceC1188h3 interfaceC1188h3, C1174f1 c1174f1) {
        return mo5168b(null, interfaceC1188h3, c1174f1);
    }

    /* JADX INFO: renamed from: b */
    public C1163d2 mo5168b(String str, InterfaceC1188h3 interfaceC1188h3, C1174f1 c1174f1) {
        if (((Boolean) RunnableC1205k2.f3633D.get()).booleanValue()) {
            printStackTrace();
        }
        return new C1163d2((str == null ? _UrlKt.FRAGMENT_ENCODE_SET : str.concat(": ")) + getMessage(), interfaceC1188h3, c1174f1, this);
    }

    /* JADX INFO: renamed from: c */
    public C1169e2 m5169c(String str, InterfaceC1188h3 interfaceC1188h3, C1174f1 c1174f1) {
        if (((Boolean) RunnableC1205k2.f3633D.get()).booleanValue()) {
            printStackTrace();
        }
        return new C1169e2((str == null ? _UrlKt.FRAGMENT_ENCODE_SET : str.concat(": ")) + getMessage(), interfaceC1188h3, c1174f1, this);
    }

    public C1279w4(String str, Throwable th) {
        super(str, th);
    }
}
