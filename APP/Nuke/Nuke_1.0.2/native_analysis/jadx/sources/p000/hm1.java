package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class hm1 {

    /* JADX INFO: renamed from: a */
    public t11 f4077a;

    /* JADX INFO: renamed from: b */
    public boolean f4078b;

    /* JADX INFO: renamed from: c */
    public fm1 f4079c;

    /* JADX INFO: renamed from: a */
    public abstract void mo1356a();

    /* JADX INFO: renamed from: b */
    public abstract void mo1357b();

    /* JADX INFO: renamed from: c */
    public abstract void mo1358c(em1 em1Var);

    /* JADX INFO: renamed from: d */
    public abstract void mo1359d(em1 em1Var);

    /* JADX INFO: renamed from: e */
    public final void m2220e() {
        fm1 fm1Var = this.f4079c;
        if (fm1Var == null || !fm1Var.f3057c.remove(this)) {
            return;
        }
        km1 km1Var = fm1Var.f3056b;
        km1Var.getClass();
        if (equals(km1Var.f5642f)) {
            if (km1Var.f5643g == -1) {
                mo1356a();
            }
            km1Var.f5642f = null;
            km1Var.f5643g = 0;
            km1Var.f5644h = null;
        }
        km1Var.f5640d.remove(this);
        km1Var.f5641e.remove(this);
        this.f4079c = null;
        km1Var.m2724b();
    }

    /* JADX INFO: renamed from: f */
    public final void m2221f(boolean z) {
        km1 km1Var;
        if (this.f4078b == z) {
            return;
        }
        this.f4078b = z;
        fm1 fm1Var = this.f4079c;
        if (fm1Var == null || (km1Var = fm1Var.f3056b) == null) {
            return;
        }
        km1Var.m2724b();
    }
}
