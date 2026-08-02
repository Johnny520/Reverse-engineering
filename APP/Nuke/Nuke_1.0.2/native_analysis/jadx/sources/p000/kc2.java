package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class kc2 implements fa1, AutoCloseable {

    /* JADX INFO: renamed from: h */
    public final String f5456h;

    /* JADX INFO: renamed from: i */
    public final jc2 f5457i;

    /* JADX INFO: renamed from: j */
    public boolean f5458j;

    public kc2(String str, jc2 jc2Var) {
        this.f5456h = str;
        this.f5457i = jc2Var;
    }

    @Override // p000.fa1
    /* JADX INFO: renamed from: g */
    public final void mo533g(ia1 ia1Var, z91 z91Var) {
        if (z91Var == z91.ON_DESTROY) {
            this.f5458j = false;
            ia1Var.getLifecycle().mo506b(this);
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m2628h(ba1 ba1Var, qc2 qc2Var) {
        qc2Var.getClass();
        ba1Var.getClass();
        if (this.f5458j) {
            C0676s.m4653l("Already attached to lifecycleOwner");
            return;
        }
        this.f5458j = true;
        ba1Var.mo505a(this);
        qc2Var.m4135c(this.f5456h, (C0787uv) this.f5457i.f4963a.f1583e);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
    }
}
