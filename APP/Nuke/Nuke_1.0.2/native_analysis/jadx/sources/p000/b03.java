package p000;

import android.content.ClipDescription;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class b03 {

    /* JADX INFO: renamed from: A */
    public final er2 f478A;

    /* JADX INFO: renamed from: B */
    public boolean f479B;

    /* JADX INFO: renamed from: a */
    public final w73 f480a;

    /* JADX INFO: renamed from: d */
    public t91 f483d;

    /* JADX INFO: renamed from: g */
    public xm0 f486g;

    /* JADX INFO: renamed from: h */
    public InterfaceC0668rt f487h;

    /* JADX INFO: renamed from: i */
    public j20 f488i;

    /* JADX INFO: renamed from: j */
    public p02 f489j;

    /* JADX INFO: renamed from: k */
    public bs0 f490k;

    /* JADX INFO: renamed from: l */
    public gl0 f491l;

    /* JADX INFO: renamed from: m */
    public final nx1 f492m;

    /* JADX INFO: renamed from: n */
    public final nx1 f493n;

    /* JADX INFO: renamed from: o */
    public long f494o;

    /* JADX INFO: renamed from: p */
    public f13 f495p;

    /* JADX INFO: renamed from: q */
    public long f496q;

    /* JADX INFO: renamed from: r */
    public final nx1 f497r;

    /* JADX INFO: renamed from: s */
    public final nx1 f498s;

    /* JADX INFO: renamed from: t */
    public int f499t;

    /* JADX INFO: renamed from: u */
    public k03 f500u;

    /* JADX INFO: renamed from: v */
    public er2 f501v;

    /* JADX INFO: renamed from: w */
    public f13 f502w;

    /* JADX INFO: renamed from: x */
    public final nx1 f503x;

    /* JADX INFO: renamed from: y */
    public final dq1 f504y;

    /* JADX INFO: renamed from: z */
    public final zz2 f505z;

    /* JADX INFO: renamed from: b */
    public us1 f481b = l93.f5995a;

    /* JADX INFO: renamed from: c */
    public in0 f482c = new nx0(15);

    /* JADX INFO: renamed from: e */
    public final nx1 f484e = op0.m3598u(new k03((String) null, 0, 7));

    /* JADX INFO: renamed from: f */
    public wb3 f485f = gd3.f3429P;

    public b03(w73 w73Var) {
        this.f480a = w73Var;
        Boolean bool = Boolean.TRUE;
        this.f492m = op0.m3598u(bool);
        this.f493n = op0.m3598u(bool);
        this.f494o = 0L;
        this.f496q = 0L;
        this.f497r = op0.m3598u(null);
        this.f498s = op0.m3598u(null);
        this.f499t = -1;
        this.f500u = new k03((String) null, 0L, 7);
        this.f503x = op0.m3598u(Boolean.FALSE);
        dq1 dq1Var = new dq1(16);
        dq1Var.f2148j = w23.f12277h;
        this.f504y = dq1Var;
        this.f505z = new zz2(this);
        this.f478A = new er2(this);
    }

    /* JADX INFO: renamed from: a */
    public static final ow1 m337a(b03 b03Var) {
        String str;
        f13 f13Var;
        C0690sd c0690sdM349m = b03Var.m349m();
        if (c0690sdM349m == null || (str = c0690sdM349m.f10051i) == null || (f13Var = b03Var.f502w) == null) {
            return null;
        }
        long j = f13Var.f2739a;
        return new ow1(str, new f13(fg1.m1636i(b03Var.f481b.mo2451p((int) (j >> 32)), b03Var.f481b.mo2451p((int) (j & 4294967295L)))));
    }

    /* JADX INFO: renamed from: b */
    public static final void m338b(b03 b03Var, f13 f13Var) {
        C0690sd c0690sdM349m;
        String str;
        j20 j20Var;
        if (f13Var == null) {
            return;
        }
        long j = f13Var.f2739a;
        p02 p02Var = b03Var.f489j;
        if (p02Var == null || (c0690sdM349m = b03Var.m349m()) == null || (str = c0690sdM349m.f10051i) == null) {
            return;
        }
        us1 us1Var = b03Var.f481b;
        long jM1636i = fg1.m1636i(us1Var.mo2451p((int) (j >> 32)), us1Var.mo2451p((int) (j & 4294967295L)));
        if (str.length() <= 0 || f13.m1494c(jM1636i) || (j20Var = b03Var.f488i) == null) {
            return;
        }
        AbstractC0570p7.m3745A(j20Var, null, new e00(p02Var, str, jM1636i, f13Var, b03Var, us1Var, null), 3);
    }

    /* JADX INFO: renamed from: c */
    public static final long m339c(b03 b03Var, k03 k03Var, long j, boolean z, boolean z2, vm2 vm2Var, boolean z3, cs0 cs0Var) {
        z03 z03VarM5146d;
        long j2;
        int i;
        long j3;
        long j4;
        C0690sd c0690sd;
        tm2 tm2Var;
        boolean z4;
        boolean z5;
        bs0 bs0Var;
        t91 t91Var = b03Var.f483d;
        if (t91Var == null || (z03VarM5146d = t91Var.m5146d()) == null) {
            return f13.f2737b;
        }
        us1 us1Var = b03Var.f481b;
        long j5 = k03Var.f5297b;
        C0690sd c0690sd2 = k03Var.f5296a;
        int i2 = f13.f2738c;
        long jM1636i = fg1.m1636i(us1Var.mo2451p((int) (j5 >> 32)), b03Var.f481b.mo2451p((int) (j5 & 4294967295L)));
        int iM6376b = z03VarM5146d.m6376b(j, false);
        int i3 = (z2 || z) ? iM6376b : (int) (jM1636i >> 32);
        if (!z2 || z) {
            j2 = 4294967295L;
            i = iM6376b;
        } else {
            j2 = 4294967295L;
            i = (int) (jM1636i & 4294967295L);
        }
        er2 er2Var = b03Var.f501v;
        int i4 = -1;
        if (z || er2Var == null) {
            j3 = j2;
        } else {
            j3 = j2;
            int i5 = b03Var.f499t;
            if (i5 != -1) {
                i4 = i5;
            }
        }
        y03 y03Var = z03VarM5146d.f13697a;
        if (z) {
            tm2Var = null;
            c0690sd = c0690sd2;
            j4 = j5;
        } else {
            j4 = j5;
            int i6 = (int) (jM1636i >> 32);
            c0690sd = c0690sd2;
            int i7 = (int) (jM1636i & j3);
            tm2Var = new tm2(new sm2(ci0.m787L(y03Var, i6), i6, 1L), new sm2(ci0.m787L(y03Var, i7), i7, 1L), f13.m1498g(jM1636i));
        }
        er2 er2Var2 = new er2(z2, tm2Var, new bo0(i3, i, i4, y03Var));
        if (tm2Var != null && er2Var != null && z2 == er2Var.f2576i) {
            bo0 bo0Var = (bo0) er2Var.f2578k;
            if (i3 == bo0Var.f957b && i == bo0Var.f958c) {
                return j4;
            }
        }
        b03Var.f501v = er2Var2;
        b03Var.f499t = iM6376b;
        tm2 tm2VarMo685c = vm2Var.mo685c(er2Var2);
        long jM1636i2 = fg1.m1636i(b03Var.f481b.mo2449n(tm2VarMo685c.f10849a.f10195b), b03Var.f481b.mo2449n(tm2VarMo685c.f10850b.f10195b));
        long j6 = j4;
        if (f13.m1493b(jM1636i2, j6)) {
            return j6;
        }
        boolean z6 = f13.m1498g(jM1636i2) != f13.m1498g(j6) && f13.m1493b(fg1.m1636i((int) (jM1636i2 & j3), (int) (jM1636i2 >> 32)), j6);
        boolean z7 = f13.m1494c(jM1636i2) && f13.m1494c(j6);
        if (z3 && c0690sd.f10051i.length() > 0 && !z6 && !z7 && cs0Var != null && (bs0Var = b03Var.f490k) != null) {
            ((b02) bs0Var).m336a(cs0Var.f1708a);
        }
        b03Var.f482c.mo5j(m340e(c0690sd, jM1636i2));
        b03Var.f502w = new f13(jM1636i2);
        if (!z3) {
            b03Var.m356t(!f13.m1494c(jM1636i2));
        }
        t91 t91Var2 = b03Var.f483d;
        if (t91Var2 != null) {
            t91Var2.f10638q.setValue(Boolean.valueOf(z3));
        }
        t91 t91Var3 = b03Var.f483d;
        if (t91Var3 != null) {
            t91Var3.f10634m.setValue(Boolean.valueOf(!f13.m1494c(jM1636i2) && s11.m4670O(b03Var, true)));
        }
        t91 t91Var4 = b03Var.f483d;
        if (t91Var4 != null) {
            if (f13.m1494c(jM1636i2)) {
                z4 = false;
            } else {
                z4 = false;
                if (s11.m4670O(b03Var, false)) {
                    z5 = true;
                }
                t91Var4.f10635n.setValue(Boolean.valueOf(z5));
            }
            z5 = z4;
            t91Var4.f10635n.setValue(Boolean.valueOf(z5));
        } else {
            z4 = false;
        }
        t91 t91Var5 = b03Var.f483d;
        if (t91Var5 != null) {
            t91Var5.f10636o.setValue(Boolean.valueOf((f13.m1494c(jM1636i2) && s11.m4670O(b03Var, true)) ? true : z4));
        }
        return jM1636i2;
    }

    /* JADX INFO: renamed from: e */
    public static k03 m340e(C0690sd c0690sd, long j) {
        return new k03(c0690sd, j, (f13) null);
    }

    /* JADX INFO: renamed from: d */
    public final zt2 m341d(boolean z) {
        j20 j20Var = this.f488i;
        if (j20Var != null) {
            return AbstractC0570p7.m3745A(j20Var, null, new tp1(this, z, (t00) null), 1);
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    public final void m342f() {
        j20 j20Var = this.f488i;
        if (j20Var != null) {
            AbstractC0570p7.m3745A(j20Var, null, new uz2(this, null, 1), 1);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m343g(rs1 rs1Var) {
        if (!f13.m1494c(m350n().f5297b)) {
            t91 t91Var = this.f483d;
            z03 z03VarM5146d = t91Var != null ? t91Var.m5146d() : null;
            int iM1496e = (rs1Var == null || z03VarM5146d == null) ? f13.m1496e(m350n().f5297b) : this.f481b.mo2449n(z03VarM5146d.m6376b(rs1Var.f9744a, true));
            k03 k03VarM2598a = k03.m2598a(m350n(), null, fg1.m1636i(iM1496e, iM1496e), 5);
            this.f482c.mo5j(k03VarM2598a);
            this.f502w = new f13(k03VarM2598a.f5297b);
        }
        m353q((rs1Var == null || m350n().f5296a.f10051i.length() <= 0) ? tr0.f10906h : tr0.f10908j);
        m356t(false);
    }

    /* JADX INFO: renamed from: h */
    public final void m344h(boolean z) {
        gl0 gl0Var;
        t91 t91Var = this.f483d;
        if (t91Var != null && !t91Var.m5144b() && (gl0Var = this.f491l) != null) {
            gl0.m1938a(gl0Var);
        }
        this.f500u = m350n();
        m356t(z);
        m353q(tr0.f10907i);
    }

    /* JADX INFO: renamed from: i */
    public final rs1 m345i() {
        return (rs1) this.f498s.getValue();
    }

    /* JADX INFO: renamed from: j */
    public final boolean m346j() {
        return ((Boolean) this.f492m.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: k */
    public final boolean m347k() {
        return ((Boolean) this.f493n.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: l */
    public final long m348l(boolean z) {
        z03 z03VarM5146d;
        long j;
        t91 t91Var = this.f483d;
        if (t91Var == null || (z03VarM5146d = t91Var.m5146d()) == null) {
            return 9205357640488583168L;
        }
        y03 y03Var = z03VarM5146d.f13697a;
        lj1 lj1Var = y03Var.f13267b;
        C0690sd c0690sdM349m = m349m();
        if (c0690sdM349m == null) {
            return 9205357640488583168L;
        }
        if (!t11.m5086l(c0690sdM349m.f10051i, y03Var.f13266a.f12754a.f10051i)) {
            return 9205357640488583168L;
        }
        k03 k03VarM350n = m350n();
        if (z) {
            long j2 = k03VarM350n.f5297b;
            int i = f13.f2738c;
            j = j2 >> 32;
        } else {
            long j3 = k03VarM350n.f5297b;
            int i2 = f13.f2738c;
            j = j3 & 4294967295L;
        }
        int iMo2451p = this.f481b.mo2451p((int) j);
        boolean zM1498g = f13.m1498g(m350n().f5297b);
        long j4 = y03Var.f13268c;
        int iM2917d = lj1Var.m2917d(iMo2451p);
        if (iM2917d >= lj1Var.f6151f) {
            return 9205357640488583168L;
        }
        boolean z2 = y03Var.m6201a(((!z || zM1498g) && (z || !zM1498g)) ? Math.max(iMo2451p + (-1), 0) : iMo2451p) == y03Var.m6207g(iMo2451p);
        lj1Var.m2923k(iMo2451p);
        int length = ((C0690sd) lj1Var.f6146a.f1579a).f10051i.length();
        ArrayList arrayList = lj1Var.f6153h;
        rw1 rw1Var = (rw1) arrayList.get(iMo2451p == length ? AbstractC0179eu.m1431L(arrayList) : AbstractC0179eu.m1426G(iMo2451p, arrayList));
        C0726t9 c0726t9 = rw1Var.f9775a;
        int iM4623d = rw1Var.m4623d(iMo2451p);
        w03 w03Var = c0726t9.f10616d;
        return (((long) Float.floatToRawIntBits(ci0.m778C(lj1Var.m2915b(iM2917d), 0.0f, (int) (j4 & 4294967295L)))) & 4294967295L) | (((long) Float.floatToRawIntBits(ci0.m778C(z2 ? w03Var.m5822i(iM4623d, false) : w03Var.m5823j(iM4623d, false), 0.0f, (int) (j4 >> 32)))) << 32);
    }

    /* JADX INFO: renamed from: m */
    public final C0690sd m349m() {
        t91 t91Var = this.f483d;
        if (t91Var != null) {
            return t91Var.f10622a.f4847a;
        }
        return null;
    }

    /* JADX INFO: renamed from: n */
    public final k03 m350n() {
        return (k03) this.f484e.getValue();
    }

    /* JADX INFO: renamed from: o */
    public final void m351o() {
        zt2 zt2Var;
        fz2 fz2Var = (fz2) this.f504y.f2147i;
        if (fz2Var == null || (zt2Var = fz2Var.f3201B) == null) {
            return;
        }
        zt2Var.mo1704c(null);
        fz2Var.f3201B = null;
    }

    /* JADX INFO: renamed from: p */
    public final void m352p() {
        j20 j20Var = this.f488i;
        if (j20Var != null) {
            AbstractC0570p7.m3745A(j20Var, null, new uz2(this, null, 2), 1);
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m353q(tr0 tr0Var) {
        t91 t91Var = this.f483d;
        if (t91Var != null) {
            if (t91Var.m5143a() == tr0Var) {
                t91Var = null;
            }
            if (t91Var != null) {
                t91Var.f10632k.setValue(tr0Var);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0027, code lost:
    
        if (((java.lang.Boolean) r4.f10638q.getValue()).booleanValue() == false) goto L34;
     */
    /* JADX INFO: renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m354r() {
        zy2 zy2Var;
        vr2 vr2VarM5275B = AbstractC0738tl.m5275B();
        t00 t00Var = null;
        in0 in0VarMo77e = vr2VarM5275B != null ? vr2VarM5275B.mo77e() : null;
        vr2 vr2VarM5283K = AbstractC0738tl.m5283K(vr2VarM5275B);
        try {
            if (m347k()) {
                t91 t91Var = this.f483d;
                if (t91Var != null) {
                }
                AbstractC0738tl.m5292U(vr2VarM5275B, vr2VarM5283K, in0VarMo77e);
                dq1 dq1Var = this.f504y;
                if (((w23) dq1Var.f2148j) == w23.f12277h) {
                    nz0.m3458c("ToolbarRequester is not initialized.");
                }
                fz2 fz2Var = (fz2) dq1Var.f2147i;
                if (fz2Var == null || !fz2Var.f10770u) {
                    return;
                }
                zt2 zt2Var = fz2Var.f3201B;
                if ((zt2Var == null || !zt2Var.mo1703b()) && (zy2Var = (zy2) p40.m3733p(fz2Var, az2.f457b)) != null) {
                    fz2Var.f3201B = AbstractC0570p7.m3745A(fz2Var.m5255A0(), null, new C0040b2(fz2Var, zy2Var, t00Var, 23), 1);
                }
            }
        } finally {
            AbstractC0738tl.m5292U(vr2VarM5275B, vr2VarM5283K, in0VarMo77e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m355s(u00 u00Var) {
        a03 a03Var;
        if (u00Var instanceof a03) {
            a03Var = (a03) u00Var;
            int i = a03Var.f15n;
            if ((i & Integer.MIN_VALUE) != 0) {
                a03Var.f15n = i - Integer.MIN_VALUE;
            } else {
                a03Var = new a03(this, u00Var);
            }
        }
        Object objValueOf = a03Var.f13l;
        int i2 = a03Var.f15n;
        if (i2 == 0) {
            fg1.m1627T(objValueOf);
            InterfaceC0668rt interfaceC0668rt = this.f487h;
            if (interfaceC0668rt != null) {
                a03Var.f12k = this;
                a03Var.f15n = 1;
                ClipDescription primaryClipDescription = ((C0303i6) interfaceC0668rt).f4283a.m2455a().getPrimaryClipDescription();
                objValueOf = Boolean.valueOf(primaryClipDescription != null && primaryClipDescription.hasMimeType("text/*"));
                Object obj = k20.f5323h;
                if (objValueOf == obj) {
                    return obj;
                }
            }
            return a83.f116a;
        }
        if (i2 != 1) {
            C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        this = a03Var.f12k;
        fg1.m1627T(objValueOf);
        Boolean bool = (Boolean) objValueOf;
        bool.getClass();
        this.f503x.setValue(bool);
        return a83.f116a;
    }

    /* JADX INFO: renamed from: t */
    public final void m356t(boolean z) {
        t91 t91Var = this.f483d;
        if (t91Var != null) {
            t91Var.f10633l.setValue(Boolean.valueOf(z));
        }
        if (z) {
            m354r();
        } else {
            m351o();
        }
    }
}
