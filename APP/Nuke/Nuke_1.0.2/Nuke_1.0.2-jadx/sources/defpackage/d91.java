package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class d91 implements bm2 {
    public static final dq1 x;
    public final v50 a;
    public boolean b;
    public x81 c;
    public boolean d;
    public final os e;
    public final nx1 f;
    public final bk1 g;
    public float h;
    public final e60 i;
    public final boolean j;
    public r61 k;
    public final b91 l;
    public final zi m;
    public final x71 n;
    public final lm o;
    public final j81 p;
    public final n4 q;
    public final g81 r;
    public final xk1 s;
    public final nx1 t;
    public final nx1 u;
    public final xk1 v;
    public final sz0 w;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        z81 z81Var = new z81(0);
        nx0 nx0Var = new nx0(12);
        lt0 lt0Var = new lt0(1, z81Var);
        xe1.f(1, nx0Var);
        x = new dq1(10, lt0Var, nx0Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public d91(int i, int i2) {
        v50 v50Var = new v50();
        v50Var.a = -1;
        v50Var.d = -1;
        this.a = v50Var;
        os osVar = new os();
        osVar.b = new kx1(i);
        osVar.c = new kx1(i2);
        osVar.e = new d81(i);
        this.e = osVar;
        x81 x81Var = f91.a;
        gd3 gd3Var = gd3.C;
        this.f = new nx1(x81Var, gd3Var);
        this.g = new bk1();
        this.i = new e60(new v(14, this));
        this.j = true;
        this.l = new b91(this);
        this.m = new zi();
        this.n = new x71();
        this.o = new lm(1);
        this.p = new j81(new a91(this, i));
        this.q = new n4(26, this);
        this.r = new g81();
        a83 a83Var = a83.a;
        this.s = new nx1(a83Var, gd3Var);
        Boolean bool = Boolean.FALSE;
        this.t = op0.u(bool);
        this.u = op0.u(bool);
        this.v = new nx1(a83Var, gd3Var);
        sz0 sz0Var = new sz0(24, false);
        n43 n43Var = rg3.n;
        Float fValueOf = Float.valueOf(0.0f);
        sz0Var.j = new id(n43Var, fValueOf, (nd) n43Var.a.j(fValueOf), Long.MIN_VALUE, Long.MIN_VALUE, false);
        this.w = sz0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.bm2
    public final boolean a() {
        return ((Boolean) this.u.getValue()).booleanValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.bm2
    public final boolean b() {
        return this.i.b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.bm2
    public final boolean c() {
        return ((Boolean) this.t.getValue()).booleanValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:30:0x0077 */
    /* JADX DEBUG: Multi-variable search result rejected for r9v0, resolved type: mn0 */
    /* JADX DEBUG: Multi-variable search result rejected for r9v1, resolved type: mn0 */
    /* JADX DEBUG: Multi-variable search result rejected for r9v3, resolved type: mn0 */
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
    @Override // defpackage.bm2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(bl1 bl1Var, mn0 mn0Var, u00 u00Var) throws Throwable {
        c91 c91Var;
        if (u00Var instanceof c91) {
            c91Var = (c91) u00Var;
            int i = c91Var.o;
            if ((i & Integer.MIN_VALUE) != 0) {
                c91Var.o = i - Integer.MIN_VALUE;
            } else {
                c91Var = new c91(this, u00Var);
            }
        }
        Object obj = c91Var.m;
        int i2 = c91Var.o;
        Object obj2 = a83.a;
        Object obj3 = k20.h;
        if (i2 == 0) {
            fg1.T(obj);
            if (this.f.getValue() == f91.a) {
                c91Var.k = bl1Var;
                c91Var.l = (tw2) mn0Var;
                c91Var.o = 1;
                zi ziVar = this.m;
                hv hvVar = ziVar.b;
                if (hvVar == null) {
                    hvVar = new hv(true);
                    hvVar.Q(null);
                    ziVar.b = hvVar;
                    yi yiVar = ziVar.a;
                    if (yiVar != null && yiVar.u) {
                        yiVar.M0();
                    }
                }
                Object objG0 = hvVar.g0(c91Var);
                if (objG0 != obj3) {
                    objG0 = obj2;
                }
                if (objG0 != obj3) {
                }
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                fg1.T(obj);
                return obj2;
            }
            s.l("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        mn0Var = (mn0) c91Var.l;
        bl1Var = c91Var.k;
        fg1.T(obj);
        c91Var.k = null;
        c91Var.l = null;
        c91Var.o = 2;
        return this.i.d(bl1Var, mn0Var, c91Var) == obj3 ? obj3 : obj2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.bm2
    public final float e(float f) {
        return this.i.e(f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void f(x81 x81Var, boolean z, boolean z2) {
        String str;
        long j;
        vr2 vr2VarB;
        in0 in0VarE;
        vr2 vr2VarK;
        n43 n43Var = rg3.n;
        List list = x81Var.k;
        int i = x81Var.n;
        int i2 = x81Var.b;
        y81 y81Var = x81Var.a;
        this.p.e = list.size();
        sz0 sz0Var = this.w;
        os osVar = this.e;
        t00 t00Var = null;
        if (!z && this.b) {
            this.c = x81Var;
            vr2VarB = tl.B();
            in0VarE = vr2VarB != null ? vr2VarB.e() : null;
            vr2VarK = tl.K(vr2VarB);
            try {
                if (((Number) ((id) sz0Var.j).i.getValue()).floatValue() != 0.0f && y81Var != null && y81Var.a == ((kx1) osVar.b).g() && i2 == ((kx1) osVar.c).g()) {
                    zt2 zt2Var = (zt2) sz0Var.i;
                    if (zt2Var != null) {
                        zt2Var.c(null);
                    }
                    sz0Var.j = new id(n43Var, Float.valueOf(0.0f), null, 60);
                }
                return;
            } finally {
                tl.U(vr2VarB, vr2VarK, in0VarE);
            }
        }
        if (z) {
            this.b = true;
        }
        this.u.setValue(Boolean.valueOf(((y81Var != null ? y81Var.a : 0) == 0 && i2 == 0) ? false : true));
        this.t.setValue(Boolean.valueOf(x81Var.c));
        this.h -= x81Var.d;
        this.f.setValue(x81Var);
        if (z2) {
            osVar.getClass();
            if (!(((float) i2) >= 0.0f)) {
                nz0.c("scrollOffset should be non-negative");
            }
            ((kx1) osVar.c).h(i2);
        } else {
            y81 y81Var2 = (y81) du.q0(list);
            y81 y81Var3 = (y81) du.w0(list);
            if (y81Var2 != null) {
                str = "scrollOffset should be non-negative";
                j = y81Var2.a;
            } else {
                str = "scrollOffset should be non-negative";
                j = -1;
            }
            tp0.R("firstVisibleItem:index", j);
            tp0.R("lastVisibleItem:index", y81Var3 != null ? y81Var3.a : -1L);
            osVar.getClass();
            osVar.d = y81Var != null ? y81Var.g : null;
            if (osVar.a || i > 0) {
                osVar.a = true;
                if (!(((float) i2) >= 0.0f)) {
                    nz0.c(str);
                }
                osVar.b(y81Var != null ? y81Var.a : 0, i2);
            }
            if (this.j) {
                v50 v50Var = this.a;
                int i3 = v50Var.a;
                boolean z3 = v50Var.c;
                if (i3 != -1 && !list.isEmpty() && i3 != v50.a(x81Var, z3)) {
                    v50Var.a = -1;
                    i81 i81Var = v50Var.b;
                    if (i81Var != null) {
                        i81Var.cancel();
                    }
                    v50Var.b = null;
                }
                int i4 = v50Var.d;
                if (i4 != -1 && v50Var.e != 0.0f && i4 != i && !list.isEmpty()) {
                    int iA = v50.a(x81Var, v50Var.e < 0.0f);
                    if (iA >= 0 && iA < i) {
                        v50Var.a = iA;
                        v50Var.b = n4.B(this.q, iA);
                    }
                }
                v50Var.d = i;
            }
        }
        if (z) {
            float f = x81Var.f;
            e70 e70Var = x81Var.i;
            j20 j20Var = x81Var.h;
            sz0Var.getClass();
            if (f <= e70Var.A(1.0f)) {
                return;
            }
            vr2VarB = tl.B();
            in0VarE = vr2VarB != null ? vr2VarB.e() : null;
            vr2VarK = tl.K(vr2VarB);
            try {
                float fFloatValue = ((Number) ((id) sz0Var.j).i.getValue()).floatValue();
                zt2 zt2Var2 = (zt2) sz0Var.i;
                if (zt2Var2 != null) {
                    zt2Var2.c(null);
                }
                id idVar = (id) sz0Var.j;
                if (idVar.m) {
                    sz0Var.j = s11.D(idVar, fFloatValue - f);
                } else {
                    sz0Var.j = new id(n43Var, Float.valueOf(-f), null, 60);
                }
                sz0Var.i = p7.A(j20Var, null, new h50(sz0Var, t00Var, 2), 3);
            } finally {
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final x81 g() {
        return (x81) this.f.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void h(float f, x81 x81Var) {
        i81 i81Var;
        i81 i81Var2;
        if (this.j) {
            boolean zIsEmpty = x81Var.k.isEmpty();
            v50 v50Var = this.a;
            if (!zIsEmpty) {
                boolean z = f < 0.0f;
                int iA = v50.a(x81Var, z);
                if (iA >= 0 && iA < x81Var.n) {
                    if (iA != v50Var.a) {
                        if (v50Var.c != z) {
                            v50Var.a = -1;
                            i81 i81Var3 = v50Var.b;
                            if (i81Var3 != null) {
                                i81Var3.cancel();
                            }
                            v50Var.b = null;
                        }
                        v50Var.c = z;
                        v50Var.a = iA;
                        v50Var.b = n4.B(this.q, iA);
                    }
                    List list = x81Var.k;
                    if (z) {
                        y81 y81Var = (y81) du.v0(list);
                        if (((y81Var.j + y81Var.k) + x81Var.q) - x81Var.m < (-f) && (i81Var2 = v50Var.b) != null) {
                            i81Var2.e();
                        }
                    } else if (x81Var.l - ((y81) du.o0(list)).j < f && (i81Var = v50Var.b) != null) {
                        i81Var.e();
                    }
                }
            }
            v50Var.e = f;
        }
    }
}
