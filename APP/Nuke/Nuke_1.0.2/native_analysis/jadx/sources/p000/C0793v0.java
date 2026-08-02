package p000;

import android.view.View;
import java.util.List;
import nuke.module.wechat.p002ai.AIChatConfig;

/* JADX INFO: renamed from: v0 */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0793v0 extends tw2 implements mn0 {

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ int f11574l;

    /* JADX INFO: renamed from: m */
    public int f11575m;

    /* JADX INFO: renamed from: n */
    public Object f11576n;

    /* JADX INFO: renamed from: o */
    public Object f11577o;

    /* JADX INFO: renamed from: p */
    public Object f11578p;

    /* JADX INFO: renamed from: q */
    public /* synthetic */ Object f11579q;

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ Object f11580r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0793v0(C0548om c0548om, k03 k03Var, t91 t91Var, z03 z03Var, us1 us1Var, t00 t00Var) {
        super(2, t00Var);
        this.f11574l = 3;
        this.f11576n = c0548om;
        this.f11577o = k03Var;
        this.f11578p = t91Var;
        this.f11579q = z03Var;
        this.f11580r = us1Var;
    }

    @Override // p000.mn0
    /* JADX INFO: renamed from: g */
    public final Object mo12g(Object obj, Object obj2) throws Throwable {
        int i = this.f11574l;
        k20 k20Var = k20.f5323h;
        a83 a83Var = a83.f116a;
        switch (i) {
            case 0:
                return ((C0793v0) mo13p((t00) obj2, (j20) obj)).mo7r(a83Var);
            case 1:
                ((C0793v0) mo13p((t00) obj2, (j20) obj)).mo7r(a83Var);
                return k20Var;
            case 2:
                return ((C0793v0) mo13p((t00) obj2, (j20) obj)).mo7r(a83Var);
            case 3:
                return ((C0793v0) mo13p((t00) obj2, (j20) obj)).mo7r(a83Var);
            case 4:
                return ((C0793v0) mo13p((t00) obj2, (j20) obj)).mo7r(a83Var);
            case 5:
                return ((C0793v0) mo13p((t00) obj2, (j20) obj)).mo7r(a83Var);
            case AIChatConfig.DefaultContextRounds /* 6 */:
                ((C0793v0) mo13p((t00) obj2, (ak0) obj)).mo7r(a83Var);
                return k20Var;
            case 7:
                return ((C0793v0) mo13p((t00) obj2, (j20) obj)).mo7r(a83Var);
            default:
                return ((C0793v0) mo13p((t00) obj2, (gm2) obj)).mo7r(a83Var);
        }
    }

    @Override // p000.AbstractC0658rj
    /* JADX INFO: renamed from: p */
    public final t00 mo13p(t00 t00Var, Object obj) {
        int i = this.f11574l;
        Object obj2 = this.f11580r;
        switch (i) {
            case 0:
                return new C0793v0((xk1) this.f11577o, (String) this.f11578p, (String) this.f11579q, (String) obj2, t00Var, 0);
            case 1:
                C0793v0 c0793v0 = new C0793v0((C0233ga) this.f11577o, (in0) this.f11578p, (C0416l9) this.f11579q, (m91) obj2, t00Var, 1);
                c0793v0.f11576n = obj;
                return c0793v0;
            case 2:
                return new C0793v0((t91) this.f11577o, (xk1) this.f11576n, (o03) this.f11578p, (b03) this.f11579q, (xx0) obj2, t00Var);
            case 3:
                return new C0793v0((C0548om) this.f11576n, (k03) this.f11577o, (t91) this.f11578p, (z03) this.f11579q, (us1) obj2, t00Var);
            case 4:
                return new C0793v0((jw0) this.f11579q, (in0) obj2, t00Var);
            case 5:
                C0793v0 c0793v02 = new C0793v0((i62) this.f11578p, (h62) this.f11579q, (C0880xb) obj2, t00Var, 5);
                c0793v02.f11577o = obj;
                return c0793v02;
            case AIChatConfig.DefaultContextRounds /* 6 */:
                C0793v0 c0793v03 = new C0793v0((xm0) obj2, t00Var);
                c0793v03.f11579q = obj;
                return c0793v03;
            case 7:
                C0793v0 c0793v04 = new C0793v0((s12) this.f11577o, (qz2) this.f11578p, (C0590pr) this.f11579q, (x22) obj2, t00Var, 7);
                c0793v04.f11576n = obj;
                return c0793v04;
            default:
                C0793v0 c0793v05 = new C0793v0((d33) this.f11578p, (im2) this.f11579q, (o72) obj2, t00Var, 8);
                c0793v05.f11577o = obj;
                return c0793v05;
        }
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:52:0x01cb, B:57:0x01e6], limit reached: 328 */
    /* JADX WARN: Path cross not found for [B:57:0x01e6, B:52:0x01cb], limit reached: 328 */
    /* JADX WARN: Removed duplicated region for block: B:12:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x0302 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01dc A[Catch: all -> 0x0176, PHI: r4 r5 r7 r8
  0x01dc: PHI (r4v54 java.lang.Object) = (r4v53 java.lang.Object), (r4v58 java.lang.Object) binds: [B:53:0x01d9, B:45:0x018f] A[DONT_GENERATE, DONT_INLINE]
  0x01dc: PHI (r5v31 fq) = (r5v30 fq), (r5v35 fq) binds: [B:53:0x01d9, B:45:0x018f] A[DONT_GENERATE, DONT_INLINE]
  0x01dc: PHI (r7v30 ??) = (r7v50 ??), (r7v51 ??) binds: [B:53:0x01d9, B:45:0x018f] A[DONT_GENERATE, DONT_INLINE]
  0x01dc: PHI (r8v38 ak0) = (r8v37 ak0), (r8v42 ak0) binds: [B:53:0x01d9, B:45:0x018f] A[DONT_GENERATE, DONT_INLINE], TryCatch #7 {all -> 0x0176, blocks: (B:45:0x018f, B:55:0x01dc, B:52:0x01cb, B:57:0x01e6, B:39:0x0172), top: B:306:0x015b }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01e6 A[Catch: all -> 0x0176, TRY_LEAVE, TryCatch #7 {all -> 0x0176, blocks: (B:45:0x018f, B:55:0x01dc, B:52:0x01cb, B:57:0x01e6, B:39:0x0172), top: B:306:0x015b }] */
    /* JADX WARN: Type inference failed for: r2v10, types: [int] */
    /* JADX WARN: Type inference failed for: r2v27, types: [java.lang.Object, rl1] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v30, types: [hh1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v50 */
    /* JADX WARN: Type inference failed for: r7v51 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0082 -> B:16:0x0084). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x01e4 -> B:52:0x01cb). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:61:0x01f8 -> B:52:0x01cb). Please report as a decompilation issue!!! */
    @Override // p000.AbstractC0658rj
    /* JADX INFO: renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo7r(Object obj) throws Throwable {
        Object objM3762R;
        jw0 jw0Var;
        eo2 eo2Var;
        int andDecrement;
        in0 in0Var;
        eo2 eo2Var2;
        Object objM3762R2;
        k21 k21VarM6084B;
        ju2 ju2Var;
        jz1 jz1Var;
        jz1 jz1Var2;
        i62 i62Var;
        List listM2285D;
        C0220fy c0220fy;
        rl1 rl1Var;
        ak0 ak0Var;
        Object obj2;
        Object obj3;
        Object objM2182E;
        gm2 gm2Var;
        InterfaceC0212fq interfaceC0212fq = null;
        boolean z = false;
        boolean z2 = false;
        int i = 3;
        hh1 hh1Var = 1;
        int i2 = 1;
        t00 t00Var = null;
        switch (this.f11574l) {
            case 0:
                xk1 xk1Var = (xk1) this.f11577o;
                k20 k20Var = k20.f5323h;
                int i3 = this.f11575m;
                if (i3 == 0) {
                    fg1.m1627T(obj);
                    xk1Var.setValue(C0445m1.f6429a);
                    c60 c60Var = o90.f7590a;
                    t50 t50Var = t50.f10560j;
                    C0756u0 c0756u0 = new C0756u0((String) this.f11578p, (String) this.f11579q, (String) this.f11580r, null, 0);
                    this.f11576n = xk1Var;
                    this.f11575m = 1;
                    objM3762R = AbstractC0570p7.m3762R(t50Var, c0756u0, this);
                    if (objM3762R == k20Var) {
                        return k20Var;
                    }
                } else {
                    if (i3 != 1) {
                        C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    xk1Var = (xk1) this.f11576n;
                    fg1.m1627T(obj);
                    objM3762R = obj;
                }
                xk1Var.setValue((InterfaceC0482n1) objM3762R);
                return a83.f116a;
            case 1:
                C0416l9 c0416l9 = (C0416l9) this.f11579q;
                C0233ga c0233ga = (C0233ga) this.f11577o;
                k20 k20Var2 = k20.f5323h;
                int i4 = this.f11575m;
                try {
                    if (i4 != 0) {
                        if (i4 != 1) {
                            C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        fg1.m1627T(obj);
                        throw new C0594pv();
                    }
                    fg1.m1627T(obj);
                    j20 j20Var = (j20) this.f11576n;
                    o91 o91Var = p91.f8043a;
                    View view = c0233ga.f3371h;
                    o91Var.getClass();
                    sz0 sz0Var = new sz0(view);
                    u91 u91Var = new u91(c0233ga.f3371h, new C0342j9((m91) this.f11580r), sz0Var);
                    if (bw2.f1059a) {
                        AbstractC0570p7.m3745A(j20Var, null, new C0003a2(c0416l9, sz0Var, null, i), 3);
                    }
                    in0 in0Var2 = (in0) this.f11578p;
                    if (in0Var2 != null) {
                        in0Var2.mo5j(u91Var);
                    }
                    c0416l9.f5988c = u91Var;
                    this.f11575m = 1;
                    c0233ga.m1815a(u91Var, this);
                    return k20Var2;
                } catch (Throwable th) {
                    c0416l9.f5988c = null;
                    throw th;
                }
            case 2:
                t91 t91Var = (t91) this.f11577o;
                k20 k20Var3 = k20.f5323h;
                int i5 = this.f11575m;
                try {
                    if (i5 == 0) {
                        fg1.m1627T(obj);
                        yb2 yb2Var = new yb2(new C0793v0(new C0186f0((xk1) this.f11576n, 22), null));
                        C0433lq c0433lq = new C0433lq(t91Var, (o03) this.f11578p, (b03) this.f11579q, (xx0) this.f11580r, 1);
                        this.f11575m = 1;
                        if (yb2Var.mo1660a(c0433lq, this) == k20Var3) {
                            return k20Var3;
                        }
                    } else {
                        if (i5 != 1) {
                            C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        fg1.m1627T(obj);
                    }
                    gf1.m1901s(t91Var);
                    return a83.f116a;
                } catch (Throwable th2) {
                    gf1.m1901s(t91Var);
                    throw th2;
                }
            case 3:
                a83 a83Var = a83.f116a;
                k20 k20Var4 = k20.f5323h;
                int i6 = this.f11575m;
                if (i6 == 0) {
                    fg1.m1627T(obj);
                    C0548om c0548om = (C0548om) this.f11576n;
                    k03 k03Var = (k03) this.f11577o;
                    iz2 iz2Var = ((t91) this.f11578p).f10622a;
                    y03 y03Var = ((z03) this.f11579q).f13697a;
                    us1 us1Var = (us1) this.f11580r;
                    this.f11575m = 1;
                    int iMo2451p = us1Var.mo2451p(f13.m1496e(k03Var.f5297b));
                    Object objM3573a = c0548om.m3573a(iMo2451p < y03Var.f13266a.f12754a.f10051i.length() ? y03Var.m6202b(iMo2451p) : iMo2451p != 0 ? y03Var.m6202b(iMo2451p - 1) : new o62(0.0f, 0.0f, 1.0f, (int) (lz2.m3020a(iz2Var.f4848b, iz2Var.f4853g, iz2Var.f4854h, lz2.f6414a, 1) & 4294967295L)), this);
                    if (objM3573a != k20Var4) {
                        objM3573a = a83Var;
                    }
                    if (objM3573a == k20Var4) {
                        return k20Var4;
                    }
                } else {
                    if (i6 != 1) {
                        C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    fg1.m1627T(obj);
                }
                return a83Var;
            case 4:
                Object obj4 = a83.f116a;
                k20 k20Var5 = k20.f5323h;
                int i7 = this.f11575m;
                try {
                    if (i7 == 0) {
                        fg1.m1627T(obj);
                        jw0Var = (jw0) this.f11579q;
                        eo2Var = jw0Var.f5242e;
                        in0 in0Var3 = (in0) this.f11580r;
                        this.f11576n = eo2Var;
                        this.f11577o = jw0Var;
                        this.f11578p = in0Var3;
                        this.f11575m = 1;
                        eo2Var.getClass();
                        int i8 = eo2Var.f2136a;
                        do {
                            andDecrement = do2.f2135g.getAndDecrement(eo2Var);
                        } while (andDecrement > i8);
                        if (andDecrement <= 0) {
                            C0469mp c0469mpM4221B = qp0.m4221B(gf1.m1908z(this));
                            try {
                                if (!eo2Var.m1063a(c0469mpM4221B)) {
                                    while (true) {
                                        int andDecrement2 = do2.f2135g.getAndDecrement(eo2Var);
                                        if (andDecrement2 <= i8) {
                                            if (andDecrement2 > 0) {
                                                c0469mpM4221B.mo2510i(obj4, eo2Var.f2137b);
                                                break;
                                            } else if (eo2Var.m1063a(c0469mpM4221B)) {
                                            }
                                        }
                                    }
                                }
                                Object objM3150t = c0469mpM4221B.m3150t();
                                if (objM3150t != k20Var5) {
                                    objM3150t = obj4;
                                }
                                if (objM3150t == k20Var5) {
                                    obj4 = objM3150t;
                                }
                            } catch (Throwable th3) {
                                c0469mpM4221B.m3140D();
                                throw th3;
                            }
                        }
                        if (obj4 != k20Var5) {
                            in0Var = in0Var3;
                        }
                        return k20Var5;
                    }
                    if (i7 != 1) {
                        if (i7 != 2) {
                            C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        eo2Var2 = (eo2) this.f11576n;
                        try {
                            fg1.m1627T(obj);
                            objM3762R2 = obj;
                            eo2Var2.m1064b();
                            return objM3762R2;
                        } catch (Throwable th4) {
                            th = th4;
                            eo2Var2.m1064b();
                            throw th;
                        }
                    }
                    in0Var = (in0) this.f11578p;
                    jw0Var = (jw0) this.f11577o;
                    eo2Var = (eo2) this.f11576n;
                    fg1.m1627T(obj);
                    c20 c20Var = ((df2) jw0Var.f5238a.f12033d).f2032j;
                    ew0 ew0Var = new ew0(in0Var, null, z ? 1 : 0);
                    this.f11576n = eo2Var;
                    this.f11577o = null;
                    this.f11578p = null;
                    this.f11575m = 2;
                    objM3762R2 = AbstractC0570p7.m3762R(c20Var, ew0Var, this);
                    if (objM3762R2 != k20Var5) {
                        eo2Var2 = eo2Var;
                        eo2Var2.m1064b();
                        return objM3762R2;
                    }
                    return k20Var5;
                } catch (Throwable th5) {
                    th = th5;
                    eo2Var2 = eo2Var;
                    eo2Var2.m1064b();
                    throw th;
                }
            case 5:
                k20 k20Var6 = k20.f5323h;
                rl1 rl1Var2 = this.f11575m;
                try {
                    if (rl1Var2 == 0) {
                        fg1.m1627T(obj);
                        k21VarM6084B = xe1.m6084B(((j20) this.f11577o).mo705g());
                        i62 i62Var2 = (i62) this.f11578p;
                        synchronized (i62Var2.f4293c) {
                            Throwable th6 = i62Var2.f4295e;
                            if (th6 != null) {
                                throw th6;
                            }
                            if (((f62) i62Var2.f4311u.getValue()).compareTo(f62.f2817i) <= 0) {
                                throw new IllegalStateException("Recomposer shut down");
                            }
                            if (i62Var2.f4294d != null) {
                                throw new IllegalStateException("Recomposer already running");
                            }
                            i62Var2.f4294d = k21VarM6084B;
                            if (i62Var2.m2294y() != null) {
                                AbstractC0752tx.m5443a("called outside of runRecomposeAndApplyChanges");
                            }
                        }
                        int i9 = 14;
                        C0686s9 c0686s9 = new C0686s9(i9, (i62) this.f11578p);
                        ds2.m1121e(ds2.f2179a);
                        synchronized (ds2.f2181c) {
                            ds2.f2186h = AbstractC0142du.m1169y0(ds2.f2186h, c0686s9);
                        }
                        rl1Var2 = new rl1(c0686s9);
                        ju2 ju2Var2 = i62.f4290z;
                        i51 i51Var = ((i62) this.f11578p).f4315y;
                        do {
                            ju2Var = i62.f4290z;
                            jz1Var = (jz1) ju2Var.getValue();
                            gd3 gd3Var = gd3.f3444v;
                            zy1 zy1Var = jz1Var.f5288j;
                            if (zy1Var.containsKey(i51Var)) {
                                jz1Var2 = jz1Var;
                            } else if (jz1Var.isEmpty()) {
                                jz1Var2 = new jz1(i51Var, i51Var, zy1Var.m6516c(i51Var, new nb1(gd3Var, gd3Var)));
                            } else {
                                Object obj5 = jz1Var.f5287i;
                                Object obj6 = zy1Var.get(obj5);
                                obj6.getClass();
                                jz1Var2 = new jz1(jz1Var.f5286h, i51Var, zy1Var.m6516c(obj5, new nb1(((nb1) obj6).f7103a, i51Var)).m6516c(i51Var, new nb1(obj5, gd3Var)));
                            }
                            if (jz1Var != jz1Var2) {
                            }
                            i62Var = (i62) this.f11578p;
                            synchronized (i62Var.f4293c) {
                                listM2285D = i62Var.m2285D();
                            }
                            int size = listM2285D.size();
                            for (int i10 = 0; i10 < size; i10++) {
                                for (Object obj7 : ((C0220fy) listM2285D.get(i10)).f3181m.f9134j) {
                                    b62 b62Var = obj7 instanceof b62 ? (b62) obj7 : null;
                                    if (b62Var != null && (c0220fy = b62Var.f613a) != null) {
                                        c0220fy.m1748s(b62Var, null);
                                    }
                                }
                            }
                            C0040b2 c0040b2 = new C0040b2((h62) this.f11579q, (C0880xb) this.f11580r, (t00) null, i9);
                            this.f11577o = k21VarM6084B;
                            this.f11576n = rl1Var2;
                            this.f11575m = 1;
                            rl1Var = rl1Var2;
                            if (AbstractC0731te.m5238u(c0040b2, this) == k20Var6) {
                                return k20Var6;
                            }
                        } while (!ju2Var.m2576h(jz1Var, jz1Var2));
                        i62Var = (i62) this.f11578p;
                        synchronized (i62Var.f4293c) {
                        }
                    } else {
                        if (rl1Var2 != 1) {
                            C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        rl1 rl1Var3 = (rl1) this.f11576n;
                        k21VarM6084B = (k21) this.f11577o;
                        fg1.m1627T(obj);
                        rl1Var = rl1Var3;
                    }
                    rl1Var.m4512a();
                    i62 i62Var3 = (i62) this.f11578p;
                    synchronized (i62Var3.f4293c) {
                        try {
                            if (i62Var3.f4294d == k21VarM6084B) {
                                i62Var3.f4294d = null;
                            }
                            if (i62Var3.m2294y() != null) {
                                AbstractC0752tx.m5443a("called outside of runRecomposeAndApplyChanges");
                            }
                        } catch (Throwable th7) {
                            throw th7;
                        }
                        break;
                    }
                    ju2 ju2Var3 = i62.f4290z;
                    j51.m2438t(((i62) this.f11578p).f4315y);
                    return a83.f116a;
                } catch (Throwable th8) {
                    rl1Var2.m4512a();
                    i62 i62Var4 = (i62) this.f11578p;
                    synchronized (i62Var4.f4293c) {
                        try {
                            if (i62Var4.f4294d == k21VarM6084B) {
                                i62Var4.f4294d = null;
                            }
                            if (i62Var4.m2294y() != null) {
                                AbstractC0752tx.m5443a("called outside of runRecomposeAndApplyChanges");
                                break;
                            }
                            ju2 ju2Var4 = i62.f4290z;
                            j51.m2438t(((i62) this.f11578p).f4315y);
                            throw th8;
                        } catch (Throwable th9) {
                            throw th9;
                        }
                    }
                }
            case AIChatConfig.DefaultContextRounds /* 6 */:
                xm0 xm0Var = (xm0) this.f11580r;
                k20 k20Var7 = k20.f5323h;
                int i11 = this.f11575m;
                try {
                    if (i11 == 0) {
                        fg1.m1627T(obj);
                        ak0Var = (ak0) this.f11579q;
                        hh1Var = new hh1(13, z2 ? 1 : 0);
                        hh1Var.f4019i = new zq2();
                        C0356jn c0356jnM1630a = fg1.m1630a(1, 6, null);
                        try {
                            Object objM2182E2 = hh1Var.m2182E(c0356jnM1630a, xm0Var);
                            this.f11579q = ak0Var;
                            this.f11576n = hh1Var;
                            this.f11577o = c0356jnM1630a;
                            this.f11578p = objM2182E2;
                            this.f11575m = 1;
                            if (ak0Var.mo181m(objM2182E2, this) != k20Var7) {
                                interfaceC0212fq = c0356jnM1630a;
                                obj2 = objM2182E2;
                                obj3 = hh1Var;
                            }
                            return k20Var7;
                        } catch (Throwable th10) {
                            th = th10;
                            interfaceC0212fq = c0356jnM1630a;
                            AbstractC0696sj abstractC0696sj = (AbstractC0696sj) hh1Var.f4019i;
                            if (abstractC0696sj != null) {
                                abstractC0696sj.mo4192j(interfaceC0212fq);
                            }
                            AbstractC0696sj abstractC0696sj2 = (AbstractC0696sj) hh1Var.f4019i;
                            if (abstractC0696sj2 == null) {
                                j22.m2430b("Called dispose on a manager that has been disposed of");
                            }
                            abstractC0696sj2.mo4190e();
                            hh1Var.f4019i = null;
                            throw th;
                        }
                    }
                    if (i11 != 1) {
                        if (i11 == 2) {
                            obj2 = this.f11578p;
                            interfaceC0212fq = (InterfaceC0212fq) this.f11577o;
                            hh1 hh1Var2 = (hh1) this.f11576n;
                            ak0Var = (ak0) this.f11579q;
                            fg1.m1627T(obj);
                            hh1Var = hh1Var2;
                            objM2182E = hh1Var.m2182E(interfaceC0212fq, xm0Var);
                            obj3 = hh1Var;
                            if (!t11.m5086l(objM2182E, obj2)) {
                                this.f11579q = ak0Var;
                                this.f11576n = hh1Var;
                                this.f11577o = interfaceC0212fq;
                                this.f11578p = objM2182E;
                                this.f11575m = 3;
                                if (ak0Var.mo181m(objM2182E, this) != k20Var7) {
                                    obj2 = objM2182E;
                                    obj3 = hh1Var;
                                }
                                return k20Var7;
                            }
                        } else if (i11 != 3) {
                            C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    }
                    obj2 = this.f11578p;
                    interfaceC0212fq = (InterfaceC0212fq) this.f11577o;
                    hh1 hh1Var3 = (hh1) this.f11576n;
                    ak0Var = (ak0) this.f11579q;
                    fg1.m1627T(obj);
                    obj3 = hh1Var3;
                    this.f11579q = ak0Var;
                    this.f11576n = obj3;
                    this.f11577o = interfaceC0212fq;
                    this.f11578p = obj2;
                    this.f11575m = 2;
                    hh1Var = obj3;
                    if (interfaceC0212fq.mo1714w(this) == k20Var7) {
                        objM2182E = hh1Var.m2182E(interfaceC0212fq, xm0Var);
                        obj3 = hh1Var;
                        if (!t11.m5086l(objM2182E, obj2)) {
                        }
                        this.f11579q = ak0Var;
                        this.f11576n = obj3;
                        this.f11577o = interfaceC0212fq;
                        this.f11578p = obj2;
                        this.f11575m = 2;
                        hh1Var = obj3;
                        if (interfaceC0212fq.mo1714w(this) == k20Var7) {
                        }
                    }
                    return k20Var7;
                } catch (Throwable th11) {
                    th = th11;
                }
                break;
            case 7:
                k20 k20Var8 = k20.f5323h;
                int i12 = this.f11575m;
                if (i12 == 0) {
                    fg1.m1627T(obj);
                    j20 j20Var2 = (j20) this.f11576n;
                    s12 s12Var = (s12) this.f11577o;
                    vb0 vb0Var = new vb0(j20Var2, (qz2) this.f11578p, (C0590pr) this.f11579q, (x22) this.f11580r, null);
                    this.f11575m = 1;
                    if (sp0.m4958p(s12Var, vb0Var, this) == k20Var8) {
                        return k20Var8;
                    }
                } else {
                    if (i12 != 1) {
                        C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    fg1.m1627T(obj);
                }
                return a83.f116a;
            default:
                im2 im2Var = (im2) this.f11579q;
                o72 o72Var = (o72) this.f11580r;
                d33 d33Var = (d33) this.f11578p;
                k20 k20Var9 = k20.f5323h;
                int i13 = this.f11575m;
                if (i13 == 0) {
                    fg1.m1627T(obj);
                    gm2 gm2Var2 = (gm2) this.f11577o;
                    float fM2372i = im2Var.m2372i(im2Var.m2368e(((b33) o72Var.f7574i).f548a));
                    im2 im2Var2 = d33Var.f4711a;
                    im2Var2.m2370g(im2Var2.m2368e(gm2Var2.m1940a(im2Var2.m2371h(im2Var2.m2367d(fM2372i)), 1)));
                    gm2Var = gm2Var2;
                    if (!((b33) o72Var.f7574i).f550c) {
                    }
                } else {
                    if (i13 != 1) {
                        C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o72 o72Var2 = (o72) this.f11576n;
                    gm2 gm2Var3 = (gm2) this.f11577o;
                    fg1.m1627T(obj);
                    gm2 gm2Var4 = gm2Var3;
                    o72 o72Var3 = o72Var2;
                    Object objM5238u = obj;
                    o72Var3.f7574i = objM5238u;
                    b33 b33Var = (b33) o72Var.f7574i;
                    sz0 sz0Var2 = d33Var.f4715e;
                    long j = b33Var.f549b;
                    long j2 = b33Var.f548a;
                    ((bb2) sz0Var2.f10436i).m509a(Float.intBitsToFloat((int) (j2 >> 32)), j);
                    ((bb2) sz0Var2.f10437j).m509a(Float.intBitsToFloat((int) (j2 & 4294967295L)), j);
                    b33 b33VarM937e = d33.m937e(d33Var.f1857f);
                    if (b33VarM937e != null) {
                        sz0 sz0Var3 = d33Var.f4715e;
                        long j3 = b33VarM937e.f549b;
                        long j4 = b33VarM937e.f548a;
                        ((bb2) sz0Var3.f10436i).m509a(Float.intBitsToFloat((int) (j4 >> 32)), j3);
                        ((bb2) sz0Var3.f10437j).m509a(Float.intBitsToFloat((int) (j4 & 4294967295L)), j3);
                        o72Var.f7574i = ((b33) o72Var.f7574i).m364a(b33VarM937e);
                    }
                    float fM2372i2 = im2Var.m2372i(im2Var.m2368e(((b33) o72Var.f7574i).f548a));
                    im2 im2Var3 = d33Var.f4711a;
                    im2Var3.m2370g(im2Var3.m2368e(gm2Var4.m1940a(im2Var3.m2371h(im2Var3.m2367d(fM2372i2)), 1)));
                    i2 = 1;
                    gm2Var = gm2Var4;
                    t00Var = null;
                    if (!((b33) o72Var.f7574i).f550c) {
                        C0356jn c0356jn = d33Var.f1857f;
                        this.f11577o = gm2Var;
                        this.f11576n = o72Var;
                        this.f11575m = i2;
                        objM5238u = AbstractC0731te.m5238u(new C0003a2(c0356jn, t00Var, 18), this);
                        if (objM5238u == k20Var9) {
                            return k20Var9;
                        }
                        gm2Var4 = gm2Var;
                        o72Var3 = o72Var;
                        o72Var3.f7574i = objM5238u;
                        b33 b33Var2 = (b33) o72Var.f7574i;
                        sz0 sz0Var22 = d33Var.f4715e;
                        long j5 = b33Var2.f549b;
                        long j22 = b33Var2.f548a;
                        ((bb2) sz0Var22.f10436i).m509a(Float.intBitsToFloat((int) (j22 >> 32)), j5);
                        ((bb2) sz0Var22.f10437j).m509a(Float.intBitsToFloat((int) (j22 & 4294967295L)), j5);
                        b33 b33VarM937e2 = d33.m937e(d33Var.f1857f);
                        if (b33VarM937e2 != null) {
                        }
                        float fM2372i22 = im2Var.m2372i(im2Var.m2368e(((b33) o72Var.f7574i).f548a));
                        im2 im2Var32 = d33Var.f4711a;
                        im2Var32.m2370g(im2Var32.m2368e(gm2Var4.m1940a(im2Var32.m2371h(im2Var32.m2367d(fM2372i22)), 1)));
                        i2 = 1;
                        gm2Var = gm2Var4;
                        t00Var = null;
                        if (!((b33) o72Var.f7574i).f550c) {
                            return a83.f116a;
                        }
                    }
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0793v0(xm0 xm0Var, t00 t00Var) {
        super(2, t00Var);
        this.f11574l = 6;
        this.f11580r = xm0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0793v0(jw0 jw0Var, in0 in0Var, t00 t00Var) {
        super(2, t00Var);
        this.f11574l = 4;
        this.f11579q = jw0Var;
        this.f11580r = in0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0793v0(t91 t91Var, xk1 xk1Var, o03 o03Var, b03 b03Var, xx0 xx0Var, t00 t00Var) {
        super(2, t00Var);
        this.f11574l = 2;
        this.f11577o = t91Var;
        this.f11576n = xk1Var;
        this.f11578p = o03Var;
        this.f11579q = b03Var;
        this.f11580r = xx0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0793v0(Object obj, Object obj2, Object obj3, t00 t00Var, int i) {
        super(2, t00Var);
        this.f11574l = i;
        this.f11578p = obj;
        this.f11579q = obj2;
        this.f11580r = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0793v0(Object obj, Object obj2, Object obj3, Object obj4, t00 t00Var, int i) {
        super(2, t00Var);
        this.f11574l = i;
        this.f11577o = obj;
        this.f11578p = obj2;
        this.f11579q = obj3;
        this.f11580r = obj4;
    }
}
