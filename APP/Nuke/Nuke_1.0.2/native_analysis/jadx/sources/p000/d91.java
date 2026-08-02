package p000;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class d91 implements bm2 {

    /* JADX INFO: renamed from: x */
    public static final dq1 f1915x;

    /* JADX INFO: renamed from: a */
    public final v50 f1916a;

    /* JADX INFO: renamed from: b */
    public boolean f1917b;

    /* JADX INFO: renamed from: c */
    public x81 f1918c;

    /* JADX INFO: renamed from: d */
    public boolean f1919d;

    /* JADX INFO: renamed from: e */
    public final C0554os f1920e;

    /* JADX INFO: renamed from: f */
    public final nx1 f1921f;

    /* JADX INFO: renamed from: g */
    public final bk1 f1922g;

    /* JADX INFO: renamed from: h */
    public float f1923h;

    /* JADX INFO: renamed from: i */
    public final e60 f1924i;

    /* JADX INFO: renamed from: j */
    public final boolean f1925j;

    /* JADX INFO: renamed from: k */
    public r61 f1926k;

    /* JADX INFO: renamed from: l */
    public final b91 f1927l;

    /* JADX INFO: renamed from: m */
    public final C0963zi f1928m;

    /* JADX INFO: renamed from: n */
    public final x71 f1929n;

    /* JADX INFO: renamed from: o */
    public final C0429lm f1930o;

    /* JADX INFO: renamed from: p */
    public final j81 f1931p;

    /* JADX INFO: renamed from: q */
    public final C0485n4 f1932q;

    /* JADX INFO: renamed from: r */
    public final g81 f1933r;

    /* JADX INFO: renamed from: s */
    public final xk1 f1934s;

    /* JADX INFO: renamed from: t */
    public final nx1 f1935t;

    /* JADX INFO: renamed from: u */
    public final nx1 f1936u;

    /* JADX INFO: renamed from: v */
    public final xk1 f1937v;

    /* JADX INFO: renamed from: w */
    public final sz0 f1938w;

    static {
        z81 z81Var = new z81(0);
        nx0 nx0Var = new nx0(12);
        lt0 lt0Var = new lt0(1, z81Var);
        xe1.m6119f(1, nx0Var);
        f1915x = new dq1(10, lt0Var, nx0Var);
    }

    public d91(int i, int i2) {
        v50 v50Var = new v50();
        v50Var.f11685a = -1;
        v50Var.f11688d = -1;
        this.f1916a = v50Var;
        C0554os c0554os = new C0554os();
        c0554os.f7821b = new kx1(i);
        c0554os.f7822c = new kx1(i2);
        c0554os.f7824e = new d81(i);
        this.f1920e = c0554os;
        x81 x81Var = f91.f2866a;
        gd3 gd3Var = gd3.f3416C;
        this.f1921f = new nx1(x81Var, gd3Var);
        this.f1922g = new bk1();
        this.f1924i = new e60(new C0792v(14, this));
        this.f1925j = true;
        this.f1927l = new b91(this);
        this.f1928m = new C0963zi();
        this.f1929n = new x71();
        this.f1930o = new C0429lm(1);
        this.f1931p = new j81(new a91(this, i));
        this.f1932q = new C0485n4(26, this);
        this.f1933r = new g81();
        a83 a83Var = a83.f116a;
        this.f1934s = new nx1(a83Var, gd3Var);
        Boolean bool = Boolean.FALSE;
        this.f1935t = op0.m3598u(bool);
        this.f1936u = op0.m3598u(bool);
        this.f1937v = new nx1(a83Var, gd3Var);
        sz0 sz0Var = new sz0(24, false);
        n43 n43Var = rg3.f9572n;
        Float fValueOf = Float.valueOf(0.0f);
        sz0Var.f10437j = new C0310id(n43Var, fValueOf, (AbstractC0494nd) n43Var.f7004a.mo5j(fValueOf), Long.MIN_VALUE, Long.MIN_VALUE, false);
        this.f1938w = sz0Var;
    }

    @Override // p000.bm2
    /* JADX INFO: renamed from: a */
    public final boolean mo567a() {
        return ((Boolean) this.f1936u.getValue()).booleanValue();
    }

    @Override // p000.bm2
    /* JADX INFO: renamed from: b */
    public final boolean mo568b() {
        return this.f1924i.mo568b();
    }

    @Override // p000.bm2
    /* JADX INFO: renamed from: c */
    public final boolean mo569c() {
        return ((Boolean) this.f1935t.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p000.bm2
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo570d(bl1 bl1Var, mn0 mn0Var, u00 u00Var) throws Throwable {
        c91 c91Var;
        if (u00Var instanceof c91) {
            c91Var = (c91) u00Var;
            int i = c91Var.f1250o;
            if ((i & Integer.MIN_VALUE) != 0) {
                c91Var.f1250o = i - Integer.MIN_VALUE;
            } else {
                c91Var = new c91(this, u00Var);
            }
        }
        Object obj = c91Var.f1248m;
        int i2 = c91Var.f1250o;
        Object obj2 = a83.f116a;
        Object obj3 = k20.f5323h;
        if (i2 == 0) {
            fg1.m1627T(obj);
            if (this.f1921f.getValue() == f91.f2866a) {
                c91Var.f1246k = bl1Var;
                c91Var.f1247l = (tw2) mn0Var;
                c91Var.f1250o = 1;
                C0963zi c0963zi = this.f1928m;
                C0291hv c0291hv = c0963zi.f13916b;
                if (c0291hv == null) {
                    c0291hv = new C0291hv(true);
                    c0291hv.m4315Q(null);
                    c0963zi.f13916b = c0291hv;
                    C0924yi c0924yi = c0963zi.f13915a;
                    if (c0924yi != null && c0924yi.f10770u) {
                        c0924yi.m6280M0();
                    }
                }
                Object objM2232g0 = c0291hv.m2232g0(c91Var);
                if (objM2232g0 != obj3) {
                    objM2232g0 = obj2;
                }
                if (objM2232g0 != obj3) {
                }
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                fg1.m1627T(obj);
                return obj2;
            }
            C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        mn0Var = (mn0) c91Var.f1247l;
        bl1Var = c91Var.f1246k;
        fg1.m1627T(obj);
        c91Var.f1246k = null;
        c91Var.f1247l = null;
        c91Var.f1250o = 2;
        return this.f1924i.mo570d(bl1Var, mn0Var, c91Var) == obj3 ? obj3 : obj2;
    }

    @Override // p000.bm2
    /* JADX INFO: renamed from: e */
    public final float mo571e(float f) {
        return this.f1924i.mo571e(f);
    }

    /* JADX INFO: renamed from: f */
    public final void m972f(x81 x81Var, boolean z, boolean z2) {
        String str;
        long j;
        vr2 vr2VarM5275B;
        in0 in0VarMo77e;
        vr2 vr2VarM5283K;
        n43 n43Var = rg3.f9572n;
        List list = x81Var.f12884k;
        int i = x81Var.f12887n;
        int i2 = x81Var.f12875b;
        y81 y81Var = x81Var.f12874a;
        this.f1931p.f4917e = list.size();
        sz0 sz0Var = this.f1938w;
        C0554os c0554os = this.f1920e;
        t00 t00Var = null;
        if (!z && this.f1917b) {
            this.f1918c = x81Var;
            vr2VarM5275B = AbstractC0738tl.m5275B();
            in0VarMo77e = vr2VarM5275B != null ? vr2VarM5275B.mo77e() : null;
            vr2VarM5283K = AbstractC0738tl.m5283K(vr2VarM5275B);
            try {
                if (((Number) ((C0310id) sz0Var.f10437j).f4561i.getValue()).floatValue() != 0.0f && y81Var != null && y81Var.f13347a == ((kx1) c0554os.f7821b).m2759g() && i2 == ((kx1) c0554os.f7822c).m2759g()) {
                    zt2 zt2Var = (zt2) sz0Var.f10436i;
                    if (zt2Var != null) {
                        zt2Var.mo1704c(null);
                    }
                    sz0Var.f10437j = new C0310id(n43Var, Float.valueOf(0.0f), null, 60);
                }
                return;
            } finally {
                AbstractC0738tl.m5292U(vr2VarM5275B, vr2VarM5283K, in0VarMo77e);
            }
        }
        if (z) {
            this.f1917b = true;
        }
        this.f1936u.setValue(Boolean.valueOf(((y81Var != null ? y81Var.f13347a : 0) == 0 && i2 == 0) ? false : true));
        this.f1935t.setValue(Boolean.valueOf(x81Var.f12876c));
        this.f1923h -= x81Var.f12877d;
        this.f1921f.setValue(x81Var);
        if (z2) {
            c0554os.getClass();
            if (!(((float) i2) >= 0.0f)) {
                nz0.m3458c("scrollOffset should be non-negative");
            }
            ((kx1) c0554os.f7822c).m2760h(i2);
        } else {
            y81 y81Var2 = (y81) AbstractC0142du.m1161q0(list);
            y81 y81Var3 = (y81) AbstractC0142du.m1167w0(list);
            if (y81Var2 != null) {
                str = "scrollOffset should be non-negative";
                j = y81Var2.f13347a;
            } else {
                str = "scrollOffset should be non-negative";
                j = -1;
            }
            tp0.m5354R("firstVisibleItem:index", j);
            tp0.m5354R("lastVisibleItem:index", y81Var3 != null ? y81Var3.f13347a : -1L);
            c0554os.getClass();
            c0554os.f7823d = y81Var != null ? y81Var.f13353g : null;
            if (c0554os.f7820a || i > 0) {
                c0554os.f7820a = true;
                if (!(((float) i2) >= 0.0f)) {
                    nz0.m3458c(str);
                }
                c0554os.m3631b(y81Var != null ? y81Var.f13347a : 0, i2);
            }
            if (this.f1925j) {
                v50 v50Var = this.f1916a;
                int i3 = v50Var.f11685a;
                boolean z3 = v50Var.f11687c;
                if (i3 != -1 && !list.isEmpty() && i3 != v50.m5622a(x81Var, z3)) {
                    v50Var.f11685a = -1;
                    i81 i81Var = v50Var.f11686b;
                    if (i81Var != null) {
                        i81Var.cancel();
                    }
                    v50Var.f11686b = null;
                }
                int i4 = v50Var.f11688d;
                if (i4 != -1 && v50Var.f11689e != 0.0f && i4 != i && !list.isEmpty()) {
                    int iM5622a = v50.m5622a(x81Var, v50Var.f11689e < 0.0f);
                    if (iM5622a >= 0 && iM5622a < i) {
                        v50Var.f11685a = iM5622a;
                        v50Var.f11686b = C0485n4.m3233B(this.f1932q, iM5622a);
                    }
                }
                v50Var.f11688d = i;
            }
        }
        if (z) {
            float f = x81Var.f12879f;
            e70 e70Var = x81Var.f12882i;
            j20 j20Var = x81Var.f12881h;
            sz0Var.getClass();
            if (f <= e70Var.mo689A(1.0f)) {
                return;
            }
            vr2VarM5275B = AbstractC0738tl.m5275B();
            in0VarMo77e = vr2VarM5275B != null ? vr2VarM5275B.mo77e() : null;
            vr2VarM5283K = AbstractC0738tl.m5283K(vr2VarM5275B);
            try {
                float fFloatValue = ((Number) ((C0310id) sz0Var.f10437j).f4561i.getValue()).floatValue();
                zt2 zt2Var2 = (zt2) sz0Var.f10436i;
                if (zt2Var2 != null) {
                    zt2Var2.mo1704c(null);
                }
                C0310id c0310id = (C0310id) sz0Var.f10437j;
                if (c0310id.f4565m) {
                    sz0Var.f10437j = s11.m4659D(c0310id, fFloatValue - f);
                } else {
                    sz0Var.f10437j = new C0310id(n43Var, Float.valueOf(-f), null, 60);
                }
                sz0Var.f10436i = AbstractC0570p7.m3745A(j20Var, null, new h50(sz0Var, t00Var, 2), 3);
            } finally {
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public final x81 m973g() {
        return (x81) this.f1921f.getValue();
    }

    /* JADX INFO: renamed from: h */
    public final void m974h(float f, x81 x81Var) {
        i81 i81Var;
        i81 i81Var2;
        if (this.f1925j) {
            boolean zIsEmpty = x81Var.f12884k.isEmpty();
            v50 v50Var = this.f1916a;
            if (!zIsEmpty) {
                boolean z = f < 0.0f;
                int iM5622a = v50.m5622a(x81Var, z);
                if (iM5622a >= 0 && iM5622a < x81Var.f12887n) {
                    if (iM5622a != v50Var.f11685a) {
                        if (v50Var.f11687c != z) {
                            v50Var.f11685a = -1;
                            i81 i81Var3 = v50Var.f11686b;
                            if (i81Var3 != null) {
                                i81Var3.cancel();
                            }
                            v50Var.f11686b = null;
                        }
                        v50Var.f11687c = z;
                        v50Var.f11685a = iM5622a;
                        v50Var.f11686b = C0485n4.m3233B(this.f1932q, iM5622a);
                    }
                    List list = x81Var.f12884k;
                    if (z) {
                        y81 y81Var = (y81) AbstractC0142du.m1166v0(list);
                        if (((y81Var.f13356j + y81Var.f13357k) + x81Var.f12890q) - x81Var.f12886m < (-f) && (i81Var2 = v50Var.f11686b) != null) {
                            i81Var2.mo2303e();
                        }
                    } else if (x81Var.f12885l - ((y81) AbstractC0142du.m1159o0(list)).f13356j < f && (i81Var = v50Var.f11686b) != null) {
                        i81Var.mo2303e();
                    }
                }
            }
            v50Var.f11689e = f;
        }
    }
}
