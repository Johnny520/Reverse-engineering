package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class p21 extends n21 {

    /* JADX INFO: renamed from: l */
    public final r21 f7932l;

    /* JADX INFO: renamed from: m */
    public final q21 f7933m;

    /* JADX INFO: renamed from: n */
    public final C0511ns f7934n;

    /* JADX INFO: renamed from: o */
    public final Object f7935o;

    public p21(r21 r21Var, q21 q21Var, C0511ns c0511ns, Object obj) {
        this.f7932l = r21Var;
        this.f7933m = q21Var;
        this.f7934n = c0511ns;
        this.f7935o = obj;
    }

    @Override // p000.n21
    /* JADX INFO: renamed from: k */
    public final boolean mo1214k() {
        return false;
    }

    @Override // p000.n21
    /* JADX INFO: renamed from: l */
    public final void mo1215l(Throwable th) {
        C0511ns c0511ns = this.f7934n;
        C0511ns c0511nsM4306W = r21.m4306W(c0511ns);
        r21 r21Var = this.f7932l;
        q21 q21Var = this.f7933m;
        Object obj = this.f7935o;
        if (c0511nsM4306W == null || !r21Var.m4325f0(q21Var, c0511nsM4306W, obj)) {
            q21Var.f8710h.m3556e(new qb1(2), 2);
            C0511ns c0511nsM4306W2 = r21.m4306W(c0511ns);
            if (c0511nsM4306W2 == null || !r21Var.m4325f0(q21Var, c0511nsM4306W2, obj)) {
                r21Var.mo1937x(r21Var.m4311J(q21Var, obj));
            }
        }
    }
}
