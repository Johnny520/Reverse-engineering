package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class ci0 implements InterfaceC0798uc, yc1 {

    /* JADX INFO: renamed from: d */
    public final C0884wc f817d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ di0 f818e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ci0(di0 di0Var, C0884wc c0884wc) {
        this.f818e = di0Var;
        this.f817d = c0884wc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.yc1
    /* JADX INFO: renamed from: a */
    public final void mo539a(nz0 nz0Var, int i) {
        this.f817d.mo539a(nz0Var, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0322ik
    /* JADX INFO: renamed from: e */
    public final InterfaceC0618pk mo540e() {
        return this.f817d.f7077h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0322ik
    /* JADX INFO: renamed from: i */
    public final void mo541i(Object obj) {
        this.f817d.mo541i(obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0798uc
    /* JADX INFO: renamed from: j */
    public final C1014zr mo542j(Object obj, InterfaceC0941xw interfaceC0941xw) {
        di0 di0Var = this.f818e;
        C0835vc c0835vc = new C0835vc(di0Var, this);
        C1014zr c1014zrM4983J = this.f817d.m4983J((na1) obj, c0835vc);
        if (c1014zrM4983J != null) {
            di0.f1112i.set(di0Var, null);
        }
        return c1014zrM4983J;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0798uc
    /* JADX INFO: renamed from: k */
    public final boolean mo543k(Throwable th) {
        return this.f817d.mo543k(th);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0798uc
    /* JADX INFO: renamed from: x */
    public final void mo544x(Object obj) {
        this.f817d.mo544x(obj);
    }
}
