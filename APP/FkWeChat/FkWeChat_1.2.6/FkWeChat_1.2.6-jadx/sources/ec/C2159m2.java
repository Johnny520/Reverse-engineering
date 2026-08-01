package ec;

import p172l8.AbstractC4713t;
import p172l8.C4712s;

/* JADX INFO: renamed from: ec.m2 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2159m2 extends AbstractC2113b2 {

    /* JADX INFO: renamed from: u */
    public final C2164o f5986u;

    public C2159m2(C2164o c2164o) {
        this.f5986u = c2164o;
    }

    @Override // ec.AbstractC2113b2
    /* JADX INFO: renamed from: w */
    public boolean mo7632w() {
        return false;
    }

    @Override // ec.AbstractC2113b2
    /* JADX INFO: renamed from: x */
    public void mo7633x(Throwable th) {
        Object objM7699p0 = m7631v().m7699p0();
        boolean z10 = objM7699p0 instanceof C2111b0;
        C2164o c2164o = this.f5986u;
        if (z10) {
            C4712s.a aVar = C4712s.f13928r;
            c2164o.resumeWith(C4712s.m18798b(AbstractC4713t.m18807a(((C2111b0) objM7699p0).f5913a)));
        } else {
            C4712s.a aVar2 = C4712s.f13928r;
            c2164o.resumeWith(C4712s.m18798b(AbstractC2123d2.m7737h(objM7699p0)));
        }
    }
}
