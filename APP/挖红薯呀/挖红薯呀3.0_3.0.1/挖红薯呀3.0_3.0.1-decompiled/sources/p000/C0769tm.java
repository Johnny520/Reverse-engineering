package p000;

/* JADX INFO: renamed from: tm */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0769tm implements InterfaceC0298hw {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f6013d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C0808um f6014e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0769tm(C0808um c0808um, int i) {
        this.f6013d = i;
        this.f6014e = c0808um;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0298hw
    public final Object invoke() {
        int i = this.f6013d;
        C0808um c0808um = this.f6014e;
        switch (i) {
            case 0:
                rv0 rv0Var = (rv0) pf1.m3058r(c0808um, uv0.f6312a);
                C0420l6 c0420l6 = c0808um.f6263x;
                if (rv0Var == null) {
                    if (c0420l6 != null) {
                        c0808um.m4087x0(c0420l6);
                    }
                    c0808um.f6263x = null;
                } else if (c0420l6 == null) {
                    C0910x1 c0910x1 = new C0910x1(7, c0808um);
                    C0769tm c0769tm = new C0769tm(c0808um, 1);
                    g30 g30Var = c0808um.f6259t;
                    boolean z = c0808um.f6260u;
                    float f = c0808um.f6261v;
                    p91 p91Var = vv0.f6829a;
                    C0420l6 c0420l62 = new C0420l6(g30Var, z, f, c0910x1, c0769tm);
                    c0808um.m4086w0(c0420l62);
                    c0808um.f6263x = c0420l62;
                }
                return na1.f4229a;
            default:
                return AbstractC0307i4.f2434o;
        }
    }
}
