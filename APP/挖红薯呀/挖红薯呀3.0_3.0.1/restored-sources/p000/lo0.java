package p000;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class lo0 implements ez0 {

    /* JADX INFO: renamed from: A */
    public long f3532A;

    /* JADX INFO: renamed from: B */
    public final a80 f3533B;

    /* JADX INFO: renamed from: C */
    public final oh0 f3534C;

    /* JADX INFO: renamed from: D */
    public final oh0 f3535D;

    /* JADX INFO: renamed from: E */
    public final gp0 f3536E;

    /* JADX INFO: renamed from: F */
    public final gp0 f3537F;

    /* JADX INFO: renamed from: G */
    public final gp0 f3538G;

    /* JADX INFO: renamed from: H */
    public final gp0 f3539H;

    /* JADX INFO: renamed from: a */
    public boolean f3540a;

    /* JADX INFO: renamed from: b */
    public zn0 f3541b;

    /* JADX INFO: renamed from: c */
    public final gp0 f3542c;

    /* JADX INFO: renamed from: d */
    public final co0 f3543d;

    /* JADX INFO: renamed from: e */
    public int f3544e;

    /* JADX INFO: renamed from: f */
    public int f3545f;

    /* JADX INFO: renamed from: g */
    public long f3546g;

    /* JADX INFO: renamed from: h */
    public long f3547h;

    /* JADX INFO: renamed from: i */
    public float f3548i;

    /* JADX INFO: renamed from: j */
    public float f3549j;

    /* JADX INFO: renamed from: k */
    public final C0517nm f3550k;

    /* JADX INFO: renamed from: l */
    public final boolean f3551l;

    /* JADX INFO: renamed from: m */
    public int f3552m;

    /* JADX INFO: renamed from: n */
    public c80 f3553n;

    /* JADX INFO: renamed from: o */
    public boolean f3554o;

    /* JADX INFO: renamed from: p */
    public final gp0 f3555p;

    /* JADX INFO: renamed from: q */
    public InterfaceC0968ym f3556q;

    /* JADX INFO: renamed from: r */
    public final xg0 f3557r;

    /* JADX INFO: renamed from: s */
    public final dp0 f3558s;

    /* JADX INFO: renamed from: t */
    public final dp0 f3559t;

    /* JADX INFO: renamed from: u */
    public final d80 f3560u;

    /* JADX INFO: renamed from: v */
    public final pn0 f3561v;

    /* JADX INFO: renamed from: w */
    public final C0166eb f3562w;

    /* JADX INFO: renamed from: x */
    public final C0542o9 f3563x;

    /* JADX INFO: renamed from: y */
    public final gp0 f3564y;

    /* JADX INFO: renamed from: z */
    public final a90 f3565z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r3v1, types: [go0] */
    public lo0(float f, int i) {
        double d = f;
        if (-0.5d > d || d > 0.5d) {
            z10.m5361a("currentPageOffsetFraction " + f + " is not within the range -0.5 to 0.5");
        }
        this.f3542c = r60.m3419u(new ok0(0L));
        this.f3543d = new co0(i, f, this);
        this.f3544e = i;
        this.f3546g = Long.MAX_VALUE;
        final int i2 = 0;
        this.f3550k = new C0517nm(new InterfaceC0742sw(this) { // from class: fo0

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ lo0 f1788e;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.f1788e = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX DEBUG: Failed to insert an additional move for type inference into block B:48:0x00e0 */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:40:0x00ab  */
            /* JADX WARN: Removed duplicated region for block: B:41:0x00b6  */
            /* JADX WARN: Removed duplicated region for block: B:49:0x00e2  */
            /* JADX WARN: Type inference failed for: r0v4 */
            /* JADX WARN: Type inference failed for: r0v5 */
            /* JADX WARN: Type inference failed for: r0v7 */
            /* JADX WARN: Type inference failed for: r15v1, types: [java.lang.Float] */
            /* JADX WARN: Type inference failed for: r15v2, types: [java.lang.Number] */
            /* JADX WARN: Type inference failed for: r15v3, types: [java.lang.Long] */
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
            @Override // p000.InterfaceC0742sw
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invoke(Object obj) {
                zn0 zn0Var;
                int i3 = i2;
                na1 na1Var = na1.f4229a;
                zn0 zn0Var2 = null;
                lo0 lo0Var = this.f1788e;
                switch (i3) {
                    case 0:
                        ?? ValueOf = (Float) obj;
                        float fFloatValue = ValueOf.floatValue();
                        long jM1661k = j50.m1661k(lo0Var);
                        float f2 = lo0Var.f3548i + fFloatValue;
                        long jM3459R = rd0.m3459R(f2);
                        lo0Var.f3548i = f2 - jM3459R;
                        if (Math.abs(fFloatValue) >= 1.0E-4f) {
                            long j = jM1661k + jM3459R;
                            long jM4908o = w60.m4908o(j, lo0Var.f3547h, lo0Var.f3546g);
                            ?? r0 = j != jM4908o;
                            long j2 = jM4908o - jM1661k;
                            float f3 = j2;
                            lo0Var.f3549j = f3;
                            if (Math.abs(j2) != 0) {
                                lo0Var.f3538G.setValue(Boolean.valueOf(f3 > 0.0f));
                                lo0Var.f3539H.setValue(Boolean.valueOf(f3 < 0.0f));
                            }
                            int i4 = (int) j2;
                            int i5 = -i4;
                            zn0 zn0VarM5598f = ((zn0) lo0Var.f3555p.getValue()).m5598f(i5);
                            if (zn0VarM5598f == null || (zn0Var = lo0Var.f3541b) == null) {
                                zn0Var2 = zn0VarM5598f;
                                if (zn0Var2 == null) {
                                    lo0Var.m2034h(zn0Var2, lo0Var.f3540a, true);
                                    lo0Var.f3534C.setValue(na1Var);
                                } else {
                                    co0 co0Var = lo0Var.f3543d;
                                    lo0 lo0Var2 = co0Var.f865a;
                                    cp0 cp0Var = co0Var.f867c;
                                    cp0Var.m597h(cp0Var.m596g() + (lo0Var2.m2040p() != 0 ? i4 / lo0Var2.m2040p() : 0.0f));
                                    b60 b60Var = (b60) lo0Var.f3564y.getValue();
                                    if (b60Var != null) {
                                        b60Var.m304k();
                                    }
                                }
                                if (r0 != false) {
                                    ValueOf = Long.valueOf(j2);
                                }
                                fFloatValue = ValueOf.floatValue();
                            } else {
                                zn0 zn0VarM5598f2 = zn0Var.m5598f(i5);
                                if (zn0VarM5598f2 != null) {
                                    lo0Var.f3541b = zn0VarM5598f2;
                                    zn0Var2 = zn0VarM5598f;
                                }
                                if (zn0Var2 == null) {
                                }
                                if (r0 != false) {
                                }
                                fFloatValue = ValueOf.floatValue();
                            }
                        }
                        return Float.valueOf(fFloatValue);
                    default:
                        b80 b80Var = (b80) obj;
                        l21 l21VarM4270k = u50.m4270k();
                        InterfaceC0742sw interfaceC0742swMo809e = l21VarM4270k != null ? l21VarM4270k.mo809e() : null;
                        l21 l21VarM4276s = u50.m4276s(l21VarM4270k);
                        try {
                            b80Var.m325a(lo0Var.f3544e);
                            return na1Var;
                        } finally {
                            u50.m4283z(l21VarM4270k, l21VarM4276s, interfaceC0742swMo809e);
                        }
                }
            }
        });
        final int i3 = 1;
        this.f3551l = true;
        this.f3552m = -1;
        this.f3555p = new gp0(oo0.f4600b, C0496n2.f4133M);
        this.f3556q = oo0.f4599a;
        this.f3557r = new xg0();
        this.f3558s = new dp0(-1);
        this.f3559t = new dp0(i);
        C0496n2 c0496n2 = C0496n2.f4141U;
        r60.m3410l(c0496n2, new InterfaceC0298hw(this) { // from class: go0

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ lo0 f2027e;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.f2027e = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // p000.InterfaceC0298hw
            public final Object invoke() {
                int iM720g;
                int iM2036k;
                int i4 = i2;
                lo0 lo0Var = this.f2027e;
                switch (i4) {
                    case 0:
                        return Integer.valueOf(lo0Var.f3550k.mo501b() ? lo0Var.f3559t.m720g() : lo0Var.f3543d.f866b.m720g());
                    case 1:
                        dp0 dp0Var = lo0Var.f3558s;
                        boolean zMo501b = lo0Var.f3550k.mo501b();
                        co0 co0Var = lo0Var.f3543d;
                        if (!zMo501b) {
                            iM720g = co0Var.f866b.m720g();
                        } else if (dp0Var.m720g() != -1) {
                            iM720g = dp0Var.m720g();
                        } else {
                            float fAbs = Math.abs(lo0Var.m2037l());
                            InterfaceC0968ym interfaceC0968ym = lo0Var.f3556q;
                            no0 no0Var = oo0.f4599a;
                            if (fAbs >= Math.abs(Math.min(interfaceC0968ym.mo654p(56.0f), lo0Var.m2039o() / 2.0f) / lo0Var.m2039o())) {
                                boolean zBooleanValue = ((Boolean) lo0Var.f3538G.getValue()).booleanValue();
                                int i5 = lo0Var.f3544e;
                                iM720g = zBooleanValue ? i5 + 1 : i5;
                            } else {
                                iM720g = co0Var.f866b.m720g();
                            }
                        }
                        iM2036k = lo0Var.m2036k(iM720g);
                        break;
                    default:
                        iM2036k = lo0Var.mo1941n();
                        break;
                }
                return Integer.valueOf(iM2036k);
            }
        });
        r60.m3410l(c0496n2, new InterfaceC0298hw(this) { // from class: go0

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ lo0 f2027e;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.f2027e = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // p000.InterfaceC0298hw
            public final Object invoke() {
                int iM720g;
                int iM2036k;
                int i4 = i3;
                lo0 lo0Var = this.f2027e;
                switch (i4) {
                    case 0:
                        return Integer.valueOf(lo0Var.f3550k.mo501b() ? lo0Var.f3559t.m720g() : lo0Var.f3543d.f866b.m720g());
                    case 1:
                        dp0 dp0Var = lo0Var.f3558s;
                        boolean zMo501b = lo0Var.f3550k.mo501b();
                        co0 co0Var = lo0Var.f3543d;
                        if (!zMo501b) {
                            iM720g = co0Var.f866b.m720g();
                        } else if (dp0Var.m720g() != -1) {
                            iM720g = dp0Var.m720g();
                        } else {
                            float fAbs = Math.abs(lo0Var.m2037l());
                            InterfaceC0968ym interfaceC0968ym = lo0Var.f3556q;
                            no0 no0Var = oo0.f4599a;
                            if (fAbs >= Math.abs(Math.min(interfaceC0968ym.mo654p(56.0f), lo0Var.m2039o() / 2.0f) / lo0Var.m2039o())) {
                                boolean zBooleanValue = ((Boolean) lo0Var.f3538G.getValue()).booleanValue();
                                int i5 = lo0Var.f3544e;
                                iM720g = zBooleanValue ? i5 + 1 : i5;
                            } else {
                                iM720g = co0Var.f866b.m720g();
                            }
                        }
                        iM2036k = lo0Var.m2036k(iM720g);
                        break;
                    default:
                        iM2036k = lo0Var.mo1941n();
                        break;
                }
                return Integer.valueOf(iM2036k);
            }
        });
        d80 d80Var = new d80(new InterfaceC0742sw(this) { // from class: fo0

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ lo0 f1788e;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.f1788e = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX DEBUG: Failed to insert an additional move for type inference into block B:48:0x00e0 */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:40:0x00ab  */
            /* JADX WARN: Removed duplicated region for block: B:41:0x00b6  */
            /* JADX WARN: Removed duplicated region for block: B:49:0x00e2  */
            /* JADX WARN: Type inference failed for: r0v4 */
            /* JADX WARN: Type inference failed for: r0v5 */
            /* JADX WARN: Type inference failed for: r0v7 */
            /* JADX WARN: Type inference failed for: r15v1, types: [java.lang.Float] */
            /* JADX WARN: Type inference failed for: r15v2, types: [java.lang.Number] */
            /* JADX WARN: Type inference failed for: r15v3, types: [java.lang.Long] */
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
            @Override // p000.InterfaceC0742sw
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invoke(Object obj) {
                zn0 zn0Var;
                int i32 = i3;
                na1 na1Var = na1.f4229a;
                zn0 zn0Var2 = null;
                lo0 lo0Var = this.f1788e;
                switch (i32) {
                    case 0:
                        ?? ValueOf = (Float) obj;
                        float fFloatValue = ValueOf.floatValue();
                        long jM1661k = j50.m1661k(lo0Var);
                        float f2 = lo0Var.f3548i + fFloatValue;
                        long jM3459R = rd0.m3459R(f2);
                        lo0Var.f3548i = f2 - jM3459R;
                        if (Math.abs(fFloatValue) >= 1.0E-4f) {
                            long j = jM1661k + jM3459R;
                            long jM4908o = w60.m4908o(j, lo0Var.f3547h, lo0Var.f3546g);
                            ?? r0 = j != jM4908o;
                            long j2 = jM4908o - jM1661k;
                            float f3 = j2;
                            lo0Var.f3549j = f3;
                            if (Math.abs(j2) != 0) {
                                lo0Var.f3538G.setValue(Boolean.valueOf(f3 > 0.0f));
                                lo0Var.f3539H.setValue(Boolean.valueOf(f3 < 0.0f));
                            }
                            int i4 = (int) j2;
                            int i5 = -i4;
                            zn0 zn0VarM5598f = ((zn0) lo0Var.f3555p.getValue()).m5598f(i5);
                            if (zn0VarM5598f == null || (zn0Var = lo0Var.f3541b) == null) {
                                zn0Var2 = zn0VarM5598f;
                                if (zn0Var2 == null) {
                                    lo0Var.m2034h(zn0Var2, lo0Var.f3540a, true);
                                    lo0Var.f3534C.setValue(na1Var);
                                } else {
                                    co0 co0Var = lo0Var.f3543d;
                                    lo0 lo0Var2 = co0Var.f865a;
                                    cp0 cp0Var = co0Var.f867c;
                                    cp0Var.m597h(cp0Var.m596g() + (lo0Var2.m2040p() != 0 ? i4 / lo0Var2.m2040p() : 0.0f));
                                    b60 b60Var = (b60) lo0Var.f3564y.getValue();
                                    if (b60Var != null) {
                                        b60Var.m304k();
                                    }
                                }
                                if (r0 != false) {
                                    ValueOf = Long.valueOf(j2);
                                }
                                fFloatValue = ValueOf.floatValue();
                            } else {
                                zn0 zn0VarM5598f2 = zn0Var.m5598f(i5);
                                if (zn0VarM5598f2 != null) {
                                    lo0Var.f3541b = zn0VarM5598f2;
                                    zn0Var2 = zn0VarM5598f;
                                }
                                if (zn0Var2 == null) {
                                }
                                if (r0 != false) {
                                }
                                fFloatValue = ValueOf.floatValue();
                            }
                        }
                        return Float.valueOf(fFloatValue);
                    default:
                        b80 b80Var = (b80) obj;
                        l21 l21VarM4270k = u50.m4270k();
                        InterfaceC0742sw interfaceC0742swMo809e = l21VarM4270k != null ? l21VarM4270k.mo809e() : null;
                        l21 l21VarM4276s = u50.m4276s(l21VarM4270k);
                        try {
                            b80Var.m325a(lo0Var.f3544e);
                            return na1Var;
                        } finally {
                            u50.m4283z(l21VarM4270k, l21VarM4276s, interfaceC0742swMo809e);
                        }
                }
            }
        });
        this.f3560u = d80Var;
        final int i4 = 2;
        this.f3561v = new pn0(new jo0(i2), d80Var, new InterfaceC0298hw(this) { // from class: go0

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ lo0 f2027e;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.f2027e = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // p000.InterfaceC0298hw
            public final Object invoke() {
                int iM720g;
                int iM2036k;
                int i42 = i4;
                lo0 lo0Var = this.f2027e;
                switch (i42) {
                    case 0:
                        return Integer.valueOf(lo0Var.f3550k.mo501b() ? lo0Var.f3559t.m720g() : lo0Var.f3543d.f866b.m720g());
                    case 1:
                        dp0 dp0Var = lo0Var.f3558s;
                        boolean zMo501b = lo0Var.f3550k.mo501b();
                        co0 co0Var = lo0Var.f3543d;
                        if (!zMo501b) {
                            iM720g = co0Var.f866b.m720g();
                        } else if (dp0Var.m720g() != -1) {
                            iM720g = dp0Var.m720g();
                        } else {
                            float fAbs = Math.abs(lo0Var.m2037l());
                            InterfaceC0968ym interfaceC0968ym = lo0Var.f3556q;
                            no0 no0Var = oo0.f4599a;
                            if (fAbs >= Math.abs(Math.min(interfaceC0968ym.mo654p(56.0f), lo0Var.m2039o() / 2.0f) / lo0Var.m2039o())) {
                                boolean zBooleanValue = ((Boolean) lo0Var.f3538G.getValue()).booleanValue();
                                int i5 = lo0Var.f3544e;
                                iM720g = zBooleanValue ? i5 + 1 : i5;
                            } else {
                                iM720g = co0Var.f866b.m720g();
                            }
                        }
                        iM2036k = lo0Var.m2036k(iM720g);
                        break;
                    default:
                        iM2036k = lo0Var.mo1941n();
                        break;
                }
                return Integer.valueOf(iM2036k);
            }
        });
        this.f3562w = new C0166eb(1);
        this.f3563x = new C0542o9();
        this.f3564y = r60.m3419u(null);
        this.f3565z = new a90(this, i3);
        this.f3532A = AbstractC0654qj.m3255b(0, 0, 15);
        this.f3533B = new a80();
        this.f3534C = g60.m1210i();
        this.f3535D = g60.m1210i();
        Boolean bool = Boolean.FALSE;
        this.f3536E = r60.m3419u(bool);
        this.f3537F = r60.m3419u(bool);
        this.f3538G = r60.m3419u(bool);
        this.f3539H = r60.m3419u(bool);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public static int m2031j(boolean z, zn0 zn0Var) {
        List list = zn0Var.f7937a;
        int i = zn0Var.f7944h;
        if (!z) {
            return (((ae0) AbstractC0960ye.m5240J(list)).f133a - i) - 1;
        }
        int i2 = i + 1;
        if (i2 < 0) {
            return Integer.MAX_VALUE;
        }
        return ((ae0) AbstractC0960ye.m5246P(list)).f133a + i2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r8v0, resolved type: ww */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0078, code lost:
    
        if (r9.mo503d(r7, r8, r0) == r5) goto L24;
     */
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
    /* JADX INFO: renamed from: t */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object m2032t(lo0 lo0Var, vh0 vh0Var, InterfaceC0904ww interfaceC0904ww, AbstractC0358jk abstractC0358jk) {
        ko0 ko0Var;
        InterfaceC0904ww interfaceC0904ww2;
        if (abstractC0358jk instanceof ko0) {
            ko0Var = (ko0) abstractC0358jk;
            int i = ko0Var.f3230l;
            if ((i & Integer.MIN_VALUE) != 0) {
                ko0Var.f3230l = i - Integer.MIN_VALUE;
            } else {
                ko0Var = new ko0(lo0Var, abstractC0358jk);
            }
        }
        Object obj = ko0Var.f3228j;
        int i2 = ko0Var.f3230l;
        Object obj2 = EnumC1007zk.f7916d;
        if (i2 == 0) {
            w60.m4891M(obj);
            ko0Var.f3225g = lo0Var;
            ko0Var.f3226h = vh0Var;
            ko0Var.f3227i = (m51) interfaceC0904ww;
            ko0Var.f3230l = 1;
            interfaceC0904ww2 = interfaceC0904ww;
            if (lo0Var.m2035i(ko0Var) != obj2) {
            }
            return obj2;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                C0921xc.m5134o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            lo0Var = ko0Var.f3225g;
            w60.m4891M(obj);
            lo0Var.f3558s.m721h(-1);
            return na1.f4229a;
        }
        InterfaceC0904ww interfaceC0904ww3 = (InterfaceC0904ww) ko0Var.f3227i;
        vh0Var = ko0Var.f3226h;
        lo0Var = ko0Var.f3225g;
        w60.m4891M(obj);
        interfaceC0904ww2 = interfaceC0904ww3;
        if (!lo0Var.f3550k.mo501b()) {
            lo0Var.f3559t.m721h(lo0Var.f3543d.f866b.m720g());
        }
        C0517nm c0517nm = lo0Var.f3550k;
        ko0Var.f3225g = lo0Var;
        ko0Var.f3226h = null;
        ko0Var.f3227i = null;
        ko0Var.f3230l = 2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.ez0
    /* JADX INFO: renamed from: a */
    public final boolean mo500a() {
        return ((Boolean) this.f3537F.getValue()).booleanValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.ez0
    /* JADX INFO: renamed from: b */
    public final boolean mo501b() {
        return this.f3550k.mo501b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.ez0
    /* JADX INFO: renamed from: c */
    public final boolean mo502c() {
        return ((Boolean) this.f3536E.getValue()).booleanValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.ez0
    /* JADX INFO: renamed from: d */
    public final Object mo503d(vh0 vh0Var, InterfaceC0904ww interfaceC0904ww, AbstractC0358jk abstractC0358jk) {
        return m2032t(this, vh0Var, interfaceC0904ww, abstractC0358jk);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.ez0
    /* JADX INFO: renamed from: e */
    public final float mo504e(float f) {
        return this.f3550k.mo504e(f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /* JADX INFO: renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m2033f(int i, o31 o31Var, AbstractC0358jk abstractC0358jk) {
        ho0 ho0Var;
        int i2;
        float f;
        o31 o31Var2;
        if (abstractC0358jk instanceof ho0) {
            ho0Var = (ho0) abstractC0358jk;
            int i3 = ho0Var.f2334k;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                ho0Var.f2334k = i3 - Integer.MIN_VALUE;
            } else {
                ho0Var = new ho0(this, abstractC0358jk);
            }
        }
        ho0 ho0Var2 = ho0Var;
        Object obj = ho0Var2.f2332i;
        int i4 = ho0Var2.f2334k;
        na1 na1Var = na1.f4229a;
        Object obj2 = EnumC1007zk.f7916d;
        if (i4 == 0) {
            w60.m4891M(obj);
            if ((i != this.f3543d.f866b.m720g() || m2037l() != 0.0f) && mo1941n() != 0) {
                ho0Var2.f2331h = o31Var;
                ho0Var2.f2330g = i;
                ho0Var2.f2334k = 1;
                if (m2035i(ho0Var2) != obj2) {
                    i2 = i;
                    f = 0.0f;
                    o31Var2 = o31Var;
                }
            }
        }
        if (i4 != 1) {
            if (i4 == 2) {
                w60.m4891M(obj);
                return na1Var;
            }
            C0921xc.m5134o("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        i2 = ho0Var2.f2330g;
        o31 o31Var3 = ho0Var2.f2331h;
        w60.m4891M(obj);
        f = 0.0f;
        o31Var2 = o31Var3;
        InterfaceC0904ww io0Var = new io0(this, m2036k(i2), m2040p() * f, o31Var2, null);
        ho0Var2.f2331h = null;
        ho0Var2.f2334k = 2;
        return mo503d(vh0.f6718d, io0Var, ho0Var2) == obj2 ? obj2 : na1Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0114 A[Catch: all -> 0x0120, TryCatch #0 {all -> 0x0120, blocks: (B:52:0x00b3, B:56:0x00c2, B:59:0x00cb, B:62:0x00d8, B:64:0x00e4, B:72:0x011a, B:70:0x0114, B:67:0x00fc), top: B:88:0x00b3 }] */
    /* JADX INFO: renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m2034h(zn0 zn0Var, boolean z, boolean z2) {
        List list = zn0Var.f7937a;
        int i = zn0Var.f7948l;
        ae0 ae0Var = zn0Var.f7945i;
        ae0 ae0Var2 = zn0Var.f7946j;
        float f = zn0Var.f7947k;
        this.f3560u.f993e = list.size();
        if (!z && this.f3540a) {
            this.f3541b = zn0Var;
            return;
        }
        boolean z3 = true;
        if (z) {
            this.f3540a = true;
        }
        co0 co0Var = this.f3543d;
        if (z2) {
            co0Var.f867c.m597h(f);
        } else {
            co0Var.getClass();
            co0Var.f869e = ae0Var2 != null ? ae0Var2.f136d : null;
            if (co0Var.f868d || !list.isEmpty()) {
                co0Var.f868d = true;
                int i2 = ae0Var2 != null ? ae0Var2.f133a : 0;
                co0Var.f866b.m721h(i2);
                co0Var.f870f.m4190a(i2);
                co0Var.f867c.m597h(f);
            }
            if (this.f3552m != -1 && !list.isEmpty()) {
                if (this.f3552m != m2031j(this.f3554o, zn0Var)) {
                    this.f3552m = -1;
                    c80 c80Var = this.f3553n;
                    if (c80Var != null) {
                        c80Var.cancel();
                    }
                    this.f3553n = null;
                }
            }
        }
        this.f3555p.setValue(zn0Var);
        this.f3536E.setValue(Boolean.valueOf(zn0Var.f7949m));
        if ((ae0Var != null ? ae0Var.f133a : 0) == 0 && i == 0) {
            z3 = false;
        }
        this.f3537F.setValue(Boolean.valueOf(z3));
        if (ae0Var != null) {
            this.f3544e = ae0Var.f133a;
        }
        this.f3545f = i;
        l21 l21VarM4270k = u50.m4270k();
        InterfaceC0742sw interfaceC0742swMo809e = l21VarM4270k != null ? l21VarM4270k.mo809e() : null;
        l21 l21VarM4276s = u50.m4276s(l21VarM4270k);
        try {
            if (this.f3551l && zn0Var.f7944h < mo1941n() && Math.abs(this.f3549j) > 0.5f) {
                float f2 = this.f3549j;
                if (m2038m().f7941e == um0.f6264d) {
                    if (Math.signum(f2) != Math.signum(-Float.intBitsToFloat((int) (m2041q() & 4294967295L)))) {
                        if (m2042r()) {
                        }
                    }
                    m2043s(this.f3549j, zn0Var);
                } else {
                    if (Math.signum(f2) == Math.signum(-Float.intBitsToFloat((int) (m2041q() >> 32)))) {
                    }
                    m2043s(this.f3549j, zn0Var);
                }
            }
            this.f3546g = oo0.m2938a(zn0Var, mo1941n());
            mo1941n();
            int iM5599g = (int) (zn0Var.f7941e == um0.f6265e ? zn0Var.m5599g() >> 32 : zn0Var.m5599g() & 4294967295L);
            long jM4907n = w60.m4907n(zn0Var.f7950n.m2630i(iM5599g, zn0Var.f7938b, -zn0Var.f7942f, zn0Var.f7940d), 0, iM5599g);
            long j = this.f3546g;
            if (jM4907n > j) {
                jM4907n = j;
            }
            this.f3547h = jM4907n;
        } finally {
            u50.m4283z(l21VarM4270k, l21VarM4276s, interfaceC0742swMo809e);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public final Object m2035i(AbstractC0358jk abstractC0358jk) {
        Object objM2814g;
        return (this.f3555p.getValue() == oo0.f4600b && (objM2814g = this.f3563x.m2814g(abstractC0358jk)) == EnumC1007zk.f7916d) ? objM2814g : na1.f4229a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public final int m2036k(int i) {
        if (mo1941n() > 0) {
            return w60.m4907n(i, 0, mo1941n() - 1);
        }
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public final float m2037l() {
        return this.f3543d.f867c.m596g();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public final zn0 m2038m() {
        return (zn0) this.f3555p.getValue();
    }

    /* JADX INFO: renamed from: n */
    public abstract int mo1941n();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public final int m2039o() {
        return ((zn0) this.f3555p.getValue()).f7938b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public final int m2040p() {
        return ((zn0) this.f3555p.getValue()).f7939c + m2039o();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    public final long m2041q() {
        return ((ok0) this.f3542c.getValue()).f4590a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r */
    public final boolean m2042r() {
        return ((int) Float.intBitsToFloat((int) (m2041q() >> 32))) == 0 && ((int) Float.intBitsToFloat((int) (m2041q() & 4294967295L))) == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s */
    public final void m2043s(float f, zn0 zn0Var) {
        c80 c80Var;
        c80 c80Var2;
        c80 c80Var3;
        List list = zn0Var.f7937a;
        if (this.f3551l && !list.isEmpty()) {
            boolean z = f > 0.0f;
            int iM2031j = m2031j(z, zn0Var);
            if (iM2031j < 0 || iM2031j >= mo1941n()) {
                return;
            }
            if (iM2031j != this.f3552m) {
                if (this.f3554o != z && (c80Var3 = this.f3553n) != null) {
                    c80Var3.cancel();
                }
                this.f3554o = z;
                this.f3552m = iM2031j;
                this.f3553n = this.f3560u.m660a(iM2031j, this.f3532A, true, null);
            }
            if (z) {
                if ((((ae0) AbstractC0960ye.m5246P(list)).f142j + (zn0Var.f7938b + zn0Var.f7939c)) - zn0Var.f7943g >= f || (c80Var2 = this.f3553n) == null) {
                    return;
                }
                c80Var2.mo363a();
                return;
            }
            if (zn0Var.f7942f - ((ae0) AbstractC0960ye.m5240J(list)).f142j >= (-f) || (c80Var = this.f3553n) == null) {
                return;
            }
            c80Var.mo363a();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: u */
    public final void m2044u(int i, float f, boolean z) {
        co0 co0Var = this.f3543d;
        dp0 dp0Var = co0Var.f866b;
        cp0 cp0Var = co0Var.f867c;
        if (dp0Var.m720g() != i || cp0Var.m596g() != f) {
            this.f3561v.m3144a();
        }
        co0Var.f866b.m721h(i);
        co0Var.f870f.m4190a(i);
        cp0Var.m597h(f);
        co0Var.f869e = null;
        if (!z) {
            this.f3535D.setValue(na1.f4229a);
            return;
        }
        b60 b60Var = (b60) this.f3564y.getValue();
        if (b60Var != null) {
            b60Var.m304k();
        }
    }
}
