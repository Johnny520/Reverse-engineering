package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class jt1 extends hm1 {

    /* JADX INFO: renamed from: d */
    public final C0205fj f5207d;

    /* JADX INFO: renamed from: e */
    public boolean f5208e;

    public jt1(C0205fj c0205fj, kt1 kt1Var) {
        boolean z = c0205fj.f3012b;
        this.f4077a = kt1Var;
        this.f4078b = z;
        this.f5207d = c0205fj;
        this.f5208e = true;
    }

    @Override // p000.hm1
    /* JADX INFO: renamed from: a */
    public final void mo1356a() {
        C0205fj c0205fj = this.f5207d;
        switch (c0205fj.f3014d) {
            case 0:
                ((AbstractC0796v3) c0205fj.f3015e).mo5615e();
                break;
        }
    }

    @Override // p000.hm1
    /* JADX INFO: renamed from: b */
    public final void mo1357b() {
        C0205fj c0205fj = this.f5207d;
        switch (c0205fj.f3014d) {
            case 0:
                ((AbstractC0796v3) c0205fj.f3015e).mo5005f();
                break;
            default:
                ((C0231g8) c0205fj.f3015e).mo5j(c0205fj);
                break;
        }
    }

    @Override // p000.hm1
    /* JADX INFO: renamed from: c */
    public final void mo1358c(em1 em1Var) {
        C0132dj c0132dj = new C0132dj(em1Var);
        C0205fj c0205fj = this.f5207d;
        switch (c0205fj.f3014d) {
            case 0:
                ((AbstractC0796v3) c0205fj.f3015e).mo5616g(c0132dj);
                break;
        }
    }

    @Override // p000.hm1
    /* JADX INFO: renamed from: d */
    public final void mo1359d(em1 em1Var) {
        em1Var.getClass();
        new C0132dj(em1Var);
        C0205fj c0205fj = this.f5207d;
        switch (c0205fj.f3014d) {
            case 0:
                ((AbstractC0796v3) c0205fj.f3015e).mo5617h();
                break;
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m2563g(boolean z) {
        this.f5208e = z;
        m2221f(z && this.f5207d.f3012b);
    }
}
