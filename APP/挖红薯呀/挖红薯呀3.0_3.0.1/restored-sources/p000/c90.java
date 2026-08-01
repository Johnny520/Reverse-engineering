package p000;

import android.os.Trace;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class c90 implements ez0 {

    /* JADX INFO: renamed from: x */
    public static final C0111d f738x;

    /* JADX INFO: renamed from: a */
    public final C0134dm f739a;

    /* JADX INFO: renamed from: b */
    public boolean f740b;

    /* JADX INFO: renamed from: c */
    public v80 f741c;

    /* JADX INFO: renamed from: d */
    public boolean f742d;

    /* JADX INFO: renamed from: e */
    public final C0206fe f743e;

    /* JADX INFO: renamed from: f */
    public final gp0 f744f;

    /* JADX INFO: renamed from: g */
    public final xg0 f745g;

    /* JADX INFO: renamed from: h */
    public float f746h;

    /* JADX INFO: renamed from: i */
    public final C0517nm f747i;

    /* JADX INFO: renamed from: j */
    public final boolean f748j;

    /* JADX INFO: renamed from: k */
    public b60 f749k;

    /* JADX INFO: renamed from: l */
    public final a90 f750l;

    /* JADX INFO: renamed from: m */
    public final C0542o9 f751m;

    /* JADX INFO: renamed from: n */
    public final l70 f752n;

    /* JADX INFO: renamed from: o */
    public final C0166eb f753o;

    /* JADX INFO: renamed from: p */
    public final d80 f754p;

    /* JADX INFO: renamed from: q */
    public final C0910x1 f755q;

    /* JADX INFO: renamed from: r */
    public final a80 f756r;

    /* JADX INFO: renamed from: s */
    public final oh0 f757s;

    /* JADX INFO: renamed from: t */
    public final gp0 f758t;

    /* JADX INFO: renamed from: u */
    public final gp0 f759u;

    /* JADX INFO: renamed from: v */
    public final oh0 f760v;

    /* JADX INFO: renamed from: w */
    public final C0111d f761w;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        C0717s8 c0717s8 = new C0717s8(14);
        C0621pn c0621pn = new C0621pn(26);
        C0956ya c0956ya = new C0956ya(2, c0717s8);
        s91.m4048m(1, c0621pn);
        f738x = new C0111d(19, c0956ya, c0621pn);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public c90(final int i, int i2) {
        C0134dm c0134dm = new C0134dm();
        c0134dm.f1151a = -1;
        c0134dm.f1154d = -1;
        this.f739a = c0134dm;
        C0206fe c0206fe = new C0206fe();
        c0206fe.f1697b = new dp0(i);
        c0206fe.f1698c = new dp0(i2);
        c0206fe.f1700e = new t70(i);
        this.f743e = c0206fe;
        this.f744f = new gp0(e90.f1353a, C0496n2.f4133M);
        this.f745g = new xg0();
        this.f747i = new C0517nm(new C0532o(8, this));
        this.f748j = true;
        this.f750l = new a90(this, 0);
        this.f751m = new C0542o9();
        this.f752n = new l70();
        this.f753o = new C0166eb(1);
        this.f754p = new d80(new InterfaceC0742sw(this) { // from class: z80
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // p000.InterfaceC0742sw
            public final Object invoke(Object obj) {
                b80 b80Var = (b80) obj;
                l21 l21VarM4270k = u50.m4270k();
                u50.m4283z(l21VarM4270k, u50.m4276s(l21VarM4270k), l21VarM4270k != null ? l21VarM4270k.mo809e() : null);
                int i3 = b80Var.f445a;
                if (i3 == -1) {
                    i3 = 2;
                }
                for (int i4 = 0; i4 < i3; i4++) {
                    b80Var.m325a(i + i4);
                }
                return na1.f4229a;
            }
        });
        this.f755q = new C0910x1(12, this);
        this.f756r = new a80();
        this.f757s = g60.m1210i();
        Boolean bool = Boolean.FALSE;
        this.f758t = r60.m3419u(bool);
        this.f759u = r60.m3419u(bool);
        this.f760v = g60.m1210i();
        C0111d c0111d = new C0111d(8);
        q91 q91Var = AbstractC0398kl.f3213x;
        Float fValueOf = Float.valueOf(0.0f);
        c0111d.f920f = new C0879w7(q91Var, fValueOf, (AbstractC0046b8) q91Var.f5089a.invoke(fValueOf), Long.MIN_VALUE, Long.MIN_VALUE, false);
        this.f761w = c0111d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.ez0
    /* JADX INFO: renamed from: a */
    public final boolean mo500a() {
        return ((Boolean) this.f759u.getValue()).booleanValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.ez0
    /* JADX INFO: renamed from: b */
    public final boolean mo501b() {
        return this.f747i.mo501b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.ez0
    /* JADX INFO: renamed from: c */
    public final boolean mo502c() {
        return ((Boolean) this.f758t.getValue()).booleanValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r8v0, resolved type: ww */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0067, code lost:
    
        if (r6.f747i.mo503d(r7, r8, r0) == r5) goto L23;
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
    @Override // p000.ez0
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo503d(vh0 vh0Var, InterfaceC0904ww interfaceC0904ww, AbstractC0358jk abstractC0358jk) {
        b90 b90Var;
        InterfaceC0904ww interfaceC0904ww2;
        if (abstractC0358jk instanceof b90) {
            b90Var = (b90) abstractC0358jk;
            int i = b90Var.f458k;
            if ((i & Integer.MIN_VALUE) != 0) {
                b90Var.f458k = i - Integer.MIN_VALUE;
            } else {
                b90Var = new b90(this, abstractC0358jk);
            }
        }
        Object obj = b90Var.f456i;
        int i2 = b90Var.f458k;
        Object obj2 = EnumC1007zk.f7916d;
        if (i2 == 0) {
            w60.m4891M(obj);
            interfaceC0904ww2 = interfaceC0904ww;
            if (this.f744f.getValue() == e90.f1353a) {
                b90Var.f454g = vh0Var;
                b90Var.f455h = (m51) interfaceC0904ww;
                b90Var.f458k = 1;
                interfaceC0904ww2 = interfaceC0904ww;
                if (this.f751m.m2814g(b90Var) != obj2) {
                }
                return obj2;
            }
        } else {
            if (i2 != 1) {
                if (i2 == 2) {
                    w60.m4891M(obj);
                    return na1.f4229a;
                }
                C0921xc.m5134o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            InterfaceC0904ww interfaceC0904ww3 = (InterfaceC0904ww) b90Var.f455h;
            vh0Var = b90Var.f454g;
            w60.m4891M(obj);
            interfaceC0904ww2 = interfaceC0904ww3;
        }
        b90Var.f454g = null;
        b90Var.f455h = null;
        b90Var.f458k = 2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.ez0
    /* JADX INFO: renamed from: e */
    public final float mo504e(float f) {
        return this.f747i.mo504e(f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final void m505f(v80 v80Var, boolean z, boolean z2) {
        C0111d c0111d;
        long j;
        l21 l21VarM4270k;
        InterfaceC0742sw interfaceC0742swMo809e;
        l21 l21VarM4276s;
        q91 q91Var = AbstractC0398kl.f3213x;
        List list = v80Var.f6455k;
        int i = v80Var.f6458n;
        int i2 = v80Var.f6446b;
        w80 w80Var = v80Var.f6445a;
        this.f754p.f993e = list.size();
        C0111d c0111d2 = this.f761w;
        C0206fe c0206fe = this.f743e;
        InterfaceC0322ik interfaceC0322ik = null;
        if (!z && this.f740b) {
            this.f741c = v80Var;
            l21VarM4270k = u50.m4270k();
            interfaceC0742swMo809e = l21VarM4270k != null ? l21VarM4270k.mo809e() : null;
            l21VarM4276s = u50.m4276s(l21VarM4270k);
            try {
                if (((Number) ((C0879w7) c0111d2.f920f).f7016e.getValue()).floatValue() != 0.0f && w80Var != null && w80Var.f7031a == ((dp0) c0206fe.f1697b).m720g() && i2 == ((dp0) c0206fe.f1698c).m720g()) {
                    r31 r31Var = (r31) c0111d2.f919e;
                    if (r31Var != null) {
                        r31Var.mo478a(null);
                    }
                    c0111d2.f920f = new C0879w7(q91Var, Float.valueOf(0.0f), null, 60);
                }
                return;
            } finally {
                u50.m4283z(l21VarM4270k, l21VarM4276s, interfaceC0742swMo809e);
            }
        }
        if (z) {
            this.f740b = true;
        }
        this.f759u.setValue(Boolean.valueOf(((w80Var != null ? w80Var.f7031a : 0) == 0 && i2 == 0) ? false : true));
        this.f758t.setValue(Boolean.valueOf(v80Var.f6447c));
        this.f746h -= v80Var.f6448d;
        this.f744f.setValue(v80Var);
        if (z2) {
            c0206fe.getClass();
            if (i2 < 0.0f) {
                z10.m5363c("scrollOffset should be non-negative");
            }
            ((dp0) c0206fe.f1698c).m721h(i2);
            c0111d = c0111d2;
        } else {
            w80 w80Var2 = (w80) AbstractC0960ye.m5241K(list);
            w80 w80Var3 = (w80) AbstractC0960ye.m5247Q(list);
            if (w80Var2 != null) {
                c0111d = c0111d2;
                j = w80Var2.f7031a;
            } else {
                c0111d = c0111d2;
                j = -1;
            }
            Trace.setCounter("firstVisibleItem:index", j);
            Trace.setCounter("lastVisibleItem:index", w80Var3 != null ? w80Var3.f7031a : -1L);
            c0206fe.getClass();
            c0206fe.f1699d = w80Var != null ? w80Var.f7036f : null;
            if (c0206fe.f1696a || i > 0) {
                c0206fe.f1696a = true;
                if (i2 < 0.0f) {
                    z10.m5363c("scrollOffset should be non-negative");
                }
                c0206fe.m1091b(w80Var != null ? w80Var.f7031a : 0, i2);
            }
            if (this.f748j) {
                C0134dm c0134dm = this.f739a;
                int i3 = c0134dm.f1151a;
                boolean z3 = c0134dm.f1153c;
                if (i3 != -1 && !list.isEmpty() && i3 != C0134dm.m717a(v80Var, z3)) {
                    c0134dm.f1151a = -1;
                    c80 c80Var = c0134dm.f1152b;
                    if (c80Var != null) {
                        c80Var.cancel();
                    }
                    c0134dm.f1152b = null;
                }
                int i4 = c0134dm.f1154d;
                if (i4 != -1 && c0134dm.f1155e != 0.0f && i4 != i && !list.isEmpty()) {
                    int iM717a = C0134dm.m717a(v80Var, c0134dm.f1155e < 0.0f);
                    if (iM717a >= 0 && iM717a < i) {
                        c0134dm.f1151a = iM717a;
                        c0134dm.f1152b = C0910x1.m5065t(this.f755q, iM717a);
                    }
                }
                c0134dm.f1154d = i;
            }
        }
        if (z) {
            float f = v80Var.f6450f;
            InterfaceC0968ym interfaceC0968ym = v80Var.f6453i;
            InterfaceC0966yk interfaceC0966yk = v80Var.f6452h;
            c0111d.getClass();
            if (f <= interfaceC0968ym.mo654p(1.0f)) {
                return;
            }
            l21VarM4270k = u50.m4270k();
            interfaceC0742swMo809e = l21VarM4270k != null ? l21VarM4270k.mo809e() : null;
            l21VarM4276s = u50.m4276s(l21VarM4270k);
            C0111d c0111d3 = c0111d;
            try {
                float fFloatValue = ((Number) ((C0879w7) c0111d3.f920f).f7016e.getValue()).floatValue();
                r31 r31Var2 = (r31) c0111d3.f919e;
                if (r31Var2 != null) {
                    r31Var2.mo478a(null);
                }
                C0879w7 c0879w7 = (C0879w7) c0111d3.f920f;
                if (c0879w7.f7020i) {
                    c0111d3.f920f = pf1.m3057q(c0879w7, fFloatValue - f, 0.0f, 30);
                } else {
                    c0111d3.f920f = new C0879w7(q91Var, Float.valueOf(-f), null, 60);
                }
                c0111d3.f919e = AbstractC0307i4.m1547w(interfaceC0966yk, null, new C0091cg(c0111d3, interfaceC0322ik, 3), 3);
            } finally {
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public final v80 m506g() {
        return (v80) this.f744f.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public final void m507h(float f, v80 v80Var) {
        c80 c80Var;
        c80 c80Var2;
        if (this.f748j) {
            boolean zIsEmpty = v80Var.f6455k.isEmpty();
            C0134dm c0134dm = this.f739a;
            if (!zIsEmpty) {
                boolean z = f < 0.0f;
                int iM717a = C0134dm.m717a(v80Var, z);
                if (iM717a >= 0 && iM717a < v80Var.f6458n) {
                    if (iM717a != c0134dm.f1151a) {
                        if (c0134dm.f1153c != z) {
                            c0134dm.f1151a = -1;
                            c80 c80Var3 = c0134dm.f1152b;
                            if (c80Var3 != null) {
                                c80Var3.cancel();
                            }
                            c0134dm.f1152b = null;
                        }
                        c0134dm.f1153c = z;
                        c0134dm.f1151a = iM717a;
                        c0134dm.f1152b = C0910x1.m5065t(this.f755q, iM717a);
                    }
                    List list = v80Var.f6455k;
                    if (z) {
                        w80 w80Var = (w80) AbstractC0960ye.m5246P(list);
                        if (((w80Var.f7039i + w80Var.f7040j) + v80Var.f6461q) - v80Var.f6457m < (-f) && (c80Var2 = c0134dm.f1152b) != null) {
                            c80Var2.mo363a();
                        }
                    } else if (v80Var.f6456l - ((w80) AbstractC0960ye.m5240J(list)).f7039i < f && (c80Var = c0134dm.f1152b) != null) {
                        c80Var.mo363a();
                    }
                }
            }
            c0134dm.f1155e = f;
        }
    }
}
