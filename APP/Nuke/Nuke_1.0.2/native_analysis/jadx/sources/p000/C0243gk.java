package p000;

/* JADX INFO: renamed from: gk */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0243gk implements zy2 {

    /* JADX INFO: renamed from: a */
    public final C0402kw f3545a;

    /* JADX INFO: renamed from: b */
    public final gl1 f3546b = new gl1();

    /* JADX INFO: renamed from: c */
    public final nx1 f3547c = op0.m3598u(null);

    public C0243gk(C0402kw c0402kw) {
        this.f3545a = c0402kw;
    }

    @Override // p000.zy2
    /* JADX INFO: renamed from: a */
    public final Object mo1928a(ry2 ry2Var, tw2 tw2Var) {
        C0455mb c0455mb = new C0455mb(this, new C0206fk(ry2Var), null, 1);
        gl1 gl1Var = this.f3546b;
        gl1Var.getClass();
        Object objM5238u = AbstractC0731te.m5238u(new C0729tc(gl1Var, c0455mb, null, 1), tw2Var);
        return objM5238u == k20.f5323h ? objM5238u : a83.f116a;
    }

    /* JADX INFO: renamed from: b */
    public final void m1929b(final xm0 xm0Var, InterfaceC0596px interfaceC0596px, final int i) {
        final xm0 xm0Var2;
        go0 go0Var = (go0) interfaceC0596px;
        go0Var.m1967X(723898654);
        int i2 = (go0Var.m1980f(this) ? 32 : 16) | i;
        final int i3 = 0;
        final int i4 = 1;
        if (go0Var.m1958O(i2 & 1, (i2 & 19) != 18)) {
            C0206fk c0206fk = (C0206fk) this.f3547c.getValue();
            if (c0206fk == null) {
                b62 b62VarM1996r = go0Var.m1996r();
                if (b62VarM1996r != null) {
                    b62VarM1996r.f616d = new mn0(this, xm0Var, i, i3) { // from class: ek

                        /* JADX INFO: renamed from: h */
                        public final /* synthetic */ int f2461h;

                        /* JADX INFO: renamed from: i */
                        public final /* synthetic */ C0243gk f2462i;

                        /* JADX INFO: renamed from: j */
                        public final /* synthetic */ xm0 f2463j;

                        {
                            this.f2461h = i3;
                            this.f2462i = this;
                        }

                        @Override // p000.mn0
                        /* JADX INFO: renamed from: g */
                        public final Object mo12g(Object obj, Object obj2) {
                            int i5 = this.f2461h;
                            a83 a83Var = a83.f116a;
                            xm0 xm0Var3 = this.f2463j;
                            C0243gk c0243gk = this.f2462i;
                            InterfaceC0596px interfaceC0596px2 = (InterfaceC0596px) obj;
                            ((Integer) obj2).getClass();
                            switch (i5) {
                                case 0:
                                    c0243gk.m1929b(xm0Var3, interfaceC0596px2, pp0.m3902N(7));
                                    break;
                                default:
                                    c0243gk.m1929b(xm0Var3, interfaceC0596px2, pp0.m3902N(7));
                                    break;
                            }
                            return a83Var;
                        }
                    };
                    return;
                }
                return;
            }
            xm0Var2 = xm0Var;
            this.f3545a.mo2749k(c0206fk, c0206fk.f3022a, xm0Var2, go0Var, 384);
        } else {
            xm0Var2 = xm0Var;
            go0Var.m1961R();
        }
        b62 b62VarM1996r2 = go0Var.m1996r();
        if (b62VarM1996r2 != null) {
            b62VarM1996r2.f616d = new mn0(this, xm0Var2, i, i4) { // from class: ek

                /* JADX INFO: renamed from: h */
                public final /* synthetic */ int f2461h;

                /* JADX INFO: renamed from: i */
                public final /* synthetic */ C0243gk f2462i;

                /* JADX INFO: renamed from: j */
                public final /* synthetic */ xm0 f2463j;

                {
                    this.f2461h = i4;
                    this.f2462i = this;
                }

                @Override // p000.mn0
                /* JADX INFO: renamed from: g */
                public final Object mo12g(Object obj, Object obj2) {
                    int i5 = this.f2461h;
                    a83 a83Var = a83.f116a;
                    xm0 xm0Var3 = this.f2463j;
                    C0243gk c0243gk = this.f2462i;
                    InterfaceC0596px interfaceC0596px2 = (InterfaceC0596px) obj;
                    ((Integer) obj2).getClass();
                    switch (i5) {
                        case 0:
                            c0243gk.m1929b(xm0Var3, interfaceC0596px2, pp0.m3902N(7));
                            break;
                        default:
                            c0243gk.m1929b(xm0Var3, interfaceC0596px2, pp0.m3902N(7));
                            break;
                    }
                    return a83Var;
                }
            };
        }
    }
}
