package p000;

/* JADX INFO: renamed from: hb */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0271hb implements xm0 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f3936h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C0492nb f3937i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ ry2 f3938j;

    public /* synthetic */ C0271hb(C0492nb c0492nb, ry2 ry2Var, int i) {
        this.f3936h = i;
        this.f3937i = c0492nb;
        this.f3938j = ry2Var;
    }

    @Override // p000.xm0
    /* JADX INFO: renamed from: a */
    public final Object mo6a() {
        int i = this.f3936h;
        int i2 = 1;
        ry2 ry2Var = this.f3938j;
        C0492nb c0492nb = this.f3937i;
        switch (i) {
            case 0:
                C0234gb c0234gb = c0492nb.f7096f;
                C0727ta c0727ta = new C0727ta(i2, ry2Var);
                o72 o72Var = new o72();
                c0492nb.f7095e.m5436c("dataBuilder", c0234gb, new C0640r1(i2, o72Var, c0727ta));
                Object obj = o72Var.f7574i;
                if (obj != null) {
                    return (qy2) obj;
                }
                t11.m5067S("result");
                throw null;
            case 1:
                C0234gb c0234gb2 = c0492nb.f7097g;
                C0271hb c0271hb = new C0271hb(c0492nb, ry2Var, 2);
                o72 o72Var2 = new o72();
                c0492nb.f7095e.m5436c("positioner", c0234gb2, new C0640r1(i2, o72Var2, c0271hb));
                Object obj2 = o72Var2.f7574i;
                if (obj2 != null) {
                    return (o62) obj2;
                }
                t11.m5067S("result");
                throw null;
            default:
                Object objMo6a = c0492nb.f7093c.mo6a();
                c61 c61Var = (c61) (((c61) objMo6a).mo653w() ? objMo6a : null);
                return c61Var == null ? o62.f7535e : ry2Var.mo1768n(c61Var).m3521i(c61Var.mo646M(0L));
        }
    }
}
