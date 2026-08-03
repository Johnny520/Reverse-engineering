package p249qg;

import vg.C4559h;

/* JADX INFO: renamed from: qg.w0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3606w0 extends AbstractC3602u0 {

    /* JADX INFO: renamed from: k */
    public final C3610y0 f11632k;

    /* JADX INFO: renamed from: l */
    public final C3608x0 f11633l;

    /* JADX INFO: renamed from: m */
    public final C3576k f11634m;

    /* JADX INFO: renamed from: n */
    public final Object f11635n;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3606w0(C3610y0 c3610y0, C3608x0 c3608x0, C3576k c3576k, Object obj) {
        this.f11632k = c3610y0;
        this.f11633l = c3608x0;
        this.f11634m = c3576k;
        this.f11635n = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p249qg.AbstractC3602u0
    /* JADX INFO: renamed from: k */
    public final boolean mo7495k() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p249qg.AbstractC3602u0
    /* JADX INFO: renamed from: l */
    public final void mo7496l(Throwable th2) {
        C3576k c3576k = this.f11634m;
        C3576k c3576kM7577Q = C3610y0.m7577Q(c3576k);
        C3610y0 c3610y0 = this.f11632k;
        C3608x0 c3608x0 = this.f11633l;
        Object obj = this.f11635n;
        if (c3576kM7577Q == null || !c3610y0.m7594Z(c3608x0, c3576kM7577Q, obj)) {
            c3608x0.f11640g.m8999e(new C4559h(2), 2);
            C3576k c3576kM7577Q2 = C3610y0.m7577Q(c3576k);
            if (c3576kM7577Q2 == null || !c3610y0.m7594Z(c3608x0, c3576kM7577Q2, obj)) {
                c3610y0.mo7474r(c3610y0.m7581E(c3608x0, obj));
            }
        }
    }
}
