package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class b63 extends gx0 {
    @Override // p000.f21
    /* JADX INFO: renamed from: a */
    public final void mo68a(z70 z70Var) {
        ((b42) z70Var.f13757h).m403o(this.f3733i.m4328g());
    }

    @Override // p000.f21
    /* JADX INFO: renamed from: b */
    public final g21 mo69b() {
        return g21.TYPE_TYPE_ID_ITEM;
    }

    @Override // p000.f21
    /* JADX INFO: renamed from: c */
    public final int mo70c() {
        return 4;
    }

    @Override // p000.f21
    /* JADX INFO: renamed from: d */
    public final void mo71d(z70 z70Var, C0929yn c0929yn) {
        q30 q30VarM4328g = this.f3733i.m4328g();
        int iM400l = ((b42) z70Var.f13757h).m400l(q30VarM4328g);
        if (c0929yn.m6293d()) {
            c0929yn.m6292c(m2416f() + ' ' + q30VarM4328g.mo23b(), 0);
            c0929yn.m6292c("  descriptor_idx: ".concat(pp0.m3899K(iM400l)), 4);
        }
        c0929yn.m6298j(iM400l);
    }
}
