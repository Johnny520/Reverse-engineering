package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ag1 extends gx0 {

    /* JADX INFO: renamed from: j */
    public final m30 f191j;

    public ag1(m30 m30Var) {
        super(m30Var.f6455h);
        this.f191j = m30Var;
    }

    @Override // p000.f21
    /* JADX INFO: renamed from: c */
    public final int mo70c() {
        return 8;
    }

    @Override // p000.f21
    /* JADX INFO: renamed from: d */
    public final void mo71d(z70 z70Var, C0929yn c0929yn) {
        b42 b42Var = (b42) z70Var.f13758i;
        b42 b42Var2 = (b42) z70Var.f13757h;
        m30 m30Var = this.f191j;
        o30 o30Var = m30Var.f6456i;
        int iM401m = b42Var.m401m(this.f3733i);
        int iM400l = b42Var2.m400l(o30Var.f7459h);
        int iMo163h = mo163h(z70Var);
        if (c0929yn.m6293d()) {
            c0929yn.m6292c(m2416f() + ' ' + m30Var.mo23b(), 0);
            c0929yn.m6292c("  class_idx: ".concat(pp0.m3898J(iM401m)), 2);
            c0929yn.m6292c(String.format("  %-10s %s", mo164i().concat(":"), pp0.m3898J(iMo163h)), 2);
            c0929yn.m6292c("  name_idx:  ".concat(pp0.m3899K(iM400l)), 4);
        }
        c0929yn.m6299k(iM401m);
        c0929yn.m6299k(iMo163h);
        c0929yn.m6298j(iM400l);
    }

    /* JADX INFO: renamed from: h */
    public abstract int mo163h(z70 z70Var);

    /* JADX INFO: renamed from: i */
    public abstract String mo164i();
}
