package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class rf0 extends th1 implements j61 {

    /* JADX INFO: renamed from: A */
    public xm0 f9531A;

    /* JADX INFO: renamed from: B */
    public kf0 f9532B;

    /* JADX INFO: renamed from: C */
    public long f9533C = -9223372034707292160L;

    /* JADX INFO: renamed from: D */
    public InterfaceC0644r5 f9534D;

    /* JADX INFO: renamed from: E */
    public final qf0 f9535E;

    /* JADX INFO: renamed from: v */
    public y33 f9536v;

    /* JADX INFO: renamed from: w */
    public u33 f9537w;

    /* JADX INFO: renamed from: x */
    public u33 f9538x;

    /* JADX INFO: renamed from: y */
    public sf0 f9539y;

    /* JADX INFO: renamed from: z */
    public ph0 f9540z;

    public rf0(y33 y33Var, u33 u33Var, u33 u33Var2, sf0 sf0Var, ph0 ph0Var, xm0 xm0Var, kf0 kf0Var) {
        this.f9536v = y33Var;
        this.f9537w = u33Var;
        this.f9538x = u33Var2;
        this.f9539y = sf0Var;
        this.f9540z = ph0Var;
        this.f9531A = xm0Var;
        this.f9532B = kf0Var;
        AbstractC0258gz.m2028b(0, 0, 0, 0, 15);
        this.f9535E = new qf0(this, 0);
        new qf0(this, 1);
    }

    @Override // p000.j61
    /* JADX INFO: renamed from: D */
    public final int mo2360D(kd1 kd1Var, if1 if1Var, int i) {
        return if1Var.mo2339X(i);
    }

    @Override // p000.th1
    /* JADX INFO: renamed from: E0 */
    public final void mo212E0() {
        this.f9533C = -9223372034707292160L;
    }

    /* JADX INFO: renamed from: M0 */
    public final InterfaceC0644r5 m4445M0() {
        if (this.f9536v.m6216f().m5620a(if0.f4587h, if0.f4588i)) {
            z33 z33Var = this.f9540z.f8350a;
            return null;
        }
        z33 z33Var2 = this.f9540z.f8350a;
        return null;
    }

    @Override // p000.j61
    /* JADX INFO: renamed from: U */
    public final int mo2361U(kd1 kd1Var, if1 if1Var, int i) {
        return if1Var.mo2337N(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00c2  */
    @Override // p000.j61
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final of1 mo1363e(pf1 pf1Var, if1 if1Var, long j) {
        char c;
        t33 t33VarM5462a;
        m33 m33Var;
        if (this.f9536v.m6213c() == this.f9536v.f13292d.getValue()) {
            this.f9534D = null;
        } else if (this.f9534D == null) {
            InterfaceC0644r5 interfaceC0644r5M4445M0 = m4445M0();
            if (interfaceC0644r5M4445M0 == null) {
                interfaceC0644r5M4445M0 = C0700sn.f10222j;
            }
            this.f9534D = interfaceC0644r5M4445M0;
        }
        boolean zMo699u = pf1Var.mo699u();
        ce0 ce0Var = ce0.f1492h;
        if (zMo699u) {
            sz1 sz1VarMo2340e = if1Var.mo2340e(j);
            long j2 = (((long) sz1VarMo2340e.f10438h) << 32) | (((long) sz1VarMo2340e.f10439i) & 4294967295L);
            this.f9533C = j2;
            return pf1Var.mo696j0((int) (j2 >> 32), (int) (4294967295L & j2), ce0Var, new C0487n6(sz1VarMo2340e, 3));
        }
        if (!((Boolean) this.f9531A.mo6a()).booleanValue()) {
            sz1 sz1VarMo2340e2 = if1Var.mo2340e(j);
            return pf1Var.mo696j0(sz1VarMo2340e2.f10438h, sz1VarMo2340e2.f10439i, ce0Var, new C0487n6(sz1VarMo2340e2, 4));
        }
        kf0 kf0Var = this.f9532B;
        u33 u33Var = kf0Var.f5484a;
        u33 u33Var2 = kf0Var.f5485b;
        y33 y33Var = kf0Var.f5486c;
        sf0 sf0Var = kf0Var.f5487d;
        z33 z33Var = sf0Var.f10101a;
        ph0 ph0Var = kf0Var.f5488e;
        u33 u33Var3 = kf0Var.f5489f;
        t33 t33VarM5462a2 = u33Var != null ? u33Var.m5462a(new lf0(sf0Var, ph0Var, 0), new lf0(sf0Var, ph0Var, 1)) : null;
        if (u33Var2 != null) {
            c = ' ';
            t33VarM5462a = u33Var2.m5462a(new lf0(sf0Var, ph0Var, 2), new lf0(sf0Var, ph0Var, 3));
        } else {
            c = ' ';
            t33VarM5462a = null;
        }
        if (y33Var.m6213c() == if0.f4587h) {
            cd2 cd2Var = z33Var.f13713b;
            if (cd2Var != null) {
                m33Var = new m33(cd2Var.f1489a);
            } else {
                cd2 cd2Var2 = ph0Var.f8350a.f13713b;
                m33Var = cd2Var2 != null ? new m33(cd2Var2.f1489a) : null;
            }
        } else {
            cd2 cd2Var3 = ph0Var.f8350a.f13713b;
            if (cd2Var3 != null) {
                m33Var = new m33(cd2Var3.f1489a);
            } else {
                cd2 cd2Var4 = z33Var.f13713b;
                if (cd2Var4 != null) {
                    m33Var = new m33(cd2Var4.f1489a);
                }
            }
        }
        C0161ec c0161ec = new C0161ec(t33VarM5462a2, t33VarM5462a, u33Var3 != null ? u33Var3.m5462a(C0799v6.f11757J, new C0161ec(m33Var, sf0Var, ph0Var, 3)) : null, 2);
        sz1 sz1VarMo2340e3 = if1Var.mo2340e(j);
        long j3 = (((long) sz1VarMo2340e3.f10439i) & 4294967295L) | (((long) sz1VarMo2340e3.f10438h) << c);
        long j4 = !h11.m2041a(this.f9533C, -9223372034707292160L) ? this.f9533C : j3;
        u33 u33Var4 = this.f9537w;
        t33 t33VarM5462a3 = u33Var4 != null ? u33Var4.m5462a(this.f9535E, new pf0(this, j4, 0)) : null;
        if (t33VarM5462a3 != null) {
            j3 = ((h11) t33VarM5462a3.getValue()).f3775a;
        }
        long jM2030d = AbstractC0258gz.m2030d(j, j3);
        u33 u33Var5 = this.f9538x;
        long j5 = u33Var5 != null ? ((z01) u33Var5.m5462a(C0799v6.f11758K, new pf0(this, j4, 1)).getValue()).f13695a : 0L;
        InterfaceC0644r5 interfaceC0644r5 = this.f9534D;
        return pf1Var.mo696j0((int) (jM2030d >> c), (int) (jM2030d & 4294967295L), ce0Var, new of0(sz1VarMo2340e3, z01.m6373c(interfaceC0644r5 != null ? interfaceC0644r5.mo3571a(j4, jM2030d, d61.f1885h) : 0L, 0L), j5, c0161ec));
    }

    @Override // p000.j61
    /* JADX INFO: renamed from: g */
    public final int mo2362g(kd1 kd1Var, if1 if1Var, int i) {
        return if1Var.mo2338W(i);
    }

    @Override // p000.j61
    /* JADX INFO: renamed from: p */
    public final int mo2363p(kd1 kd1Var, if1 if1Var, int i) {
        return if1Var.mo2341f(i);
    }
}
