package mh;

import bsh.C0353j;

/* JADX INFO: renamed from: mh.b */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC2844b {
    /* JADX INFO: renamed from: a */
    void mo6247a(Object obj, String str);

    /* JADX INFO: renamed from: b */
    void mo6248b();

    /* JADX INFO: renamed from: c */
    boolean mo6249c();

    /* JADX INFO: renamed from: d */
    boolean mo6250d();

    /* JADX INFO: renamed from: e */
    void mo6251e(String str, Throwable th2);

    /* JADX INFO: renamed from: f */
    void mo6252f(Integer num, Object obj);

    /* JADX INFO: renamed from: g */
    boolean mo6253g();

    String getName();

    /* JADX INFO: renamed from: h */
    void mo6254h(Object obj, String str);

    /* JADX INFO: renamed from: i */
    void mo6255i(String str, Object... objArr);

    /* JADX INFO: renamed from: j */
    boolean mo6256j();

    /* JADX INFO: renamed from: k */
    void mo6257k(String str, Long l10);

    /* JADX INFO: renamed from: l */
    void mo6258l(String str);

    /* JADX INFO: renamed from: m */
    boolean mo6259m();

    /* JADX INFO: renamed from: n */
    void mo6260n(Object obj, String str, Object obj2);

    /* JADX INFO: renamed from: o */
    void mo6261o(String str, Object... objArr);

    /* JADX INFO: renamed from: p */
    void mo6262p(Object obj, String str, Object obj2);

    /* JADX INFO: renamed from: q */
    void mo6263q(Object... objArr);

    /* JADX INFO: renamed from: r */
    void mo6264r(Object obj, String str);

    /* JADX INFO: renamed from: s */
    void mo6265s(Object obj, String str, Object obj2);

    /* JADX INFO: renamed from: t */
    void mo6266t(String str, Throwable th2);

    /* JADX INFO: renamed from: u */
    void mo6267u(Exception exc);

    /* JADX INFO: renamed from: v */
    void mo6268v(String str);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: w */
    default boolean mo6269w(int i9) {
        char c10;
        if (i9 == 1) {
            c10 = '(';
        } else if (i9 == 2) {
            c10 = 30;
        } else if (i9 == 3) {
            c10 = 20;
        } else if (i9 == 4) {
            c10 = '\n';
        } else {
            if (i9 != 5) {
                throw null;
            }
            c10 = 0;
        }
        if (c10 == 0) {
            return mo6259m();
        }
        if (c10 == '\n') {
            return mo6250d();
        }
        if (c10 == 20) {
            return mo6256j();
        }
        if (c10 == 30) {
            return mo6249c();
        }
        if (c10 == '(') {
            return mo6253g();
        }
        C0353j.m1304b(i9 != 1 ? i9 != 2 ? i9 != 3 ? i9 != 4 ? i9 != 5 ? "null" : "TRACE" : "DEBUG" : "INFO" : "WARN" : "ERROR", "Level [", "] not recognized.");
        return false;
    }

    /* JADX INFO: renamed from: x */
    void mo6270x(Object obj, String str);

    /* JADX INFO: renamed from: y */
    void mo6271y(Object obj, String str, Object obj2);

    /* JADX INFO: renamed from: z */
    void mo6272z(Object... objArr);
}
