package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class lu2 extends tw2 implements mn0 {

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ int f6330l = 0;

    /* JADX INFO: renamed from: m */
    public float f6331m;

    /* JADX INFO: renamed from: n */
    public int f6332n;

    /* JADX INFO: renamed from: o */
    public /* synthetic */ Object f6333o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ Object f6334p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lu2(C0554os c0554os, float f, InterfaceC0273hd interfaceC0273hd, t00 t00Var) {
        super(2, t00Var);
        this.f6333o = c0554os;
        this.f6331m = f;
        this.f6334p = interfaceC0273hd;
    }

    @Override // p000.mn0
    /* JADX INFO: renamed from: g */
    public final Object mo12g(Object obj, Object obj2) {
        int i = this.f6330l;
        a83 a83Var = a83.f116a;
        j20 j20Var = (j20) obj;
        t00 t00Var = (t00) obj2;
        switch (i) {
        }
        return ((lu2) mo13p(t00Var, j20Var)).mo7r(a83Var);
    }

    @Override // p000.AbstractC0658rj
    /* JADX INFO: renamed from: p */
    public final t00 mo13p(t00 t00Var, Object obj) {
        int i = this.f6330l;
        Object obj2 = this.f6334p;
        switch (i) {
            case 0:
                return new lu2((C0554os) this.f6333o, this.f6331m, (InterfaceC0273hd) obj2, t00Var);
            default:
                lu2 lu2Var = new lu2((y33) obj2, t00Var);
                lu2Var.f6333o = obj;
                return lu2Var;
        }
    }

    @Override // p000.AbstractC0658rj
    /* JADX INFO: renamed from: r */
    public final Object mo7r(Object obj) {
        final float fM5177F;
        j20 j20Var;
        int i = this.f6330l;
        a83 a83Var = a83.f116a;
        Object obj2 = this.f6334p;
        k20 k20Var = k20.f5323h;
        switch (i) {
            case 0:
                int i2 = this.f6332n;
                if (i2 == 0) {
                    fg1.m1627T(obj);
                    this.f6332n = 1;
                    if (C0689sc.m4787c((C0689sc) ((C0554os) this.f6333o).f7822c, new Float(this.f6331m), (InterfaceC0273hd) obj2, null, this, 12) == k20Var) {
                    }
                } else if (i2 != 1) {
                    C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                } else {
                    fg1.m1627T(obj);
                }
                break;
            default:
                int i3 = this.f6332n;
                if (i3 == 0) {
                    fg1.m1627T(obj);
                    j20 j20Var2 = (j20) this.f6333o;
                    fM5177F = AbstractC0731te.m5177F(j20Var2.mo705g());
                    j20Var = j20Var2;
                } else if (i3 != 1) {
                    C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                } else {
                    fM5177F = this.f6331m;
                    j20Var = (j20) this.f6333o;
                    fg1.m1627T(obj);
                }
                while (AbstractC0731te.m5188Q(j20Var)) {
                    final y33 y33Var = (y33) obj2;
                    in0 in0Var = new in0() { // from class: x33
                        @Override // p000.in0
                        /* JADX INFO: renamed from: j */
                        public final Object mo5j(Object obj3) {
                            long jLongValue = ((Long) obj3).longValue();
                            y33 y33Var2 = y33Var;
                            boolean zM6217g = y33Var2.m6217g();
                            lx1 lx1Var = y33Var2.f13295g;
                            if (!zM6217g) {
                                if (lx1Var.m2984g() == Long.MIN_VALUE) {
                                    lx1Var.m2985h(jLongValue);
                                    y33Var2.f13289a.f13499a.setValue(Boolean.TRUE);
                                }
                                long jM2984g = jLongValue - lx1Var.m2984g();
                                float f = fM5177F;
                                if (f != 0.0f) {
                                    jM2984g = gf1.m1870R(jM2984g / ((double) f));
                                }
                                if (y33Var2.f13290b == null) {
                                    y33Var2.f13294f.m2985h(jM2984g);
                                }
                                y33Var2.m6218h(jM2984g, f == 0.0f);
                            }
                            return a83.f116a;
                        }
                    };
                    this.f6333o = j20Var;
                    this.f6331m = fM5177F;
                    this.f6332n = 1;
                    a20 a20Var = this.f11029i;
                    a20Var.getClass();
                    if (qp0.m4220A(a20Var).m6080a(in0Var, this) == k20Var) {
                        break;
                    }
                }
                break;
        }
        return k20Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lu2(y33 y33Var, t00 t00Var) {
        super(2, t00Var);
        this.f6334p = y33Var;
    }
}
