package p277t2;

import p117i.C3076o0;

/* JADX INFO: renamed from: t2.s */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8090s {
    /* JADX INFO: renamed from: a */
    public static final C8087p m31263a(InterfaceC8089r interfaceC8089r) {
        C8087p c8087pMo17919c = interfaceC8089r.mo17919c();
        if (c8087pMo17919c != null && c8087pMo17919c.m31258v() && !c8087pMo17919c.m31257u()) {
            c8087pMo17919c = c8087pMo17919c.m31251o();
            C3076o0 c3076o0 = new C3076o0(interfaceC8089r.mo17943l().size());
            c3076o0.m11465r(interfaceC8089r.mo17943l());
            while (c3076o0.m11590h()) {
                InterfaceC8089r interfaceC8089r2 = (InterfaceC8089r) c3076o0.m11454B(c3076o0.f8236b - 1);
                C8087p c8087pMo17919c2 = interfaceC8089r2.mo17919c();
                if (c8087pMo17919c2 != null && !c8087pMo17919c2.m31258v()) {
                    c8087pMo17919c.m31259w(c8087pMo17919c2);
                    if (!c8087pMo17919c2.m31257u()) {
                        c3076o0.m11465r(interfaceC8089r2.mo17943l());
                    }
                }
            }
        }
        return c8087pMo17919c;
    }
}
