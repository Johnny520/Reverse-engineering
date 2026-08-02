package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class zz2 implements kz2 {

    /* JADX INFO: renamed from: b */
    public f13 f14164b;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ b03 f14166d;

    /* JADX INFO: renamed from: a */
    public boolean f14163a = true;

    /* JADX INFO: renamed from: c */
    public vm2 f14165c = gd3.f3421H;

    public zz2(b03 b03Var) {
        this.f14166d = b03Var;
    }

    @Override // p000.kz2
    /* JADX INFO: renamed from: a */
    public final void mo2776a() {
        m6521f();
    }

    @Override // p000.kz2
    /* JADX INFO: renamed from: b */
    public final void mo2777b(long j, vm2 vm2Var) {
        long j2;
        z03 z03VarM5146d;
        z03 z03VarM5146d2;
        b03 b03Var = this.f14166d;
        nx1 nx1Var = b03Var.f497r;
        if (b03Var.m347k() && ((rr0) nx1Var.getValue()) == null) {
            nx1Var.setValue(rr0.f9718j);
            b03Var.f499t = -1;
            this.f14163a = true;
            this.f14165c = vm2Var;
            b03Var.m351o();
            t91 t91Var = b03Var.f483d;
            if (t91Var == null || (z03VarM5146d2 = t91Var.m5146d()) == null || !z03VarM5146d2.m6377c(j)) {
                j2 = j;
                t91 t91Var2 = b03Var.f483d;
                if (t91Var2 != null && (z03VarM5146d = t91Var2.m5146d()) != null) {
                    int iMo2449n = b03Var.f481b.mo2449n(z03VarM5146d.m6376b(j2, true));
                    k03 k03VarM340e = b03.m340e(b03Var.m350n().f5296a, fg1.m1636i(iMo2449n, iMo2449n));
                    b03Var.m344h(false);
                    bs0 bs0Var = b03Var.f490k;
                    if (bs0Var != null) {
                        ((b02) bs0Var).m336a(0);
                    }
                    b03Var.f482c.mo5j(k03VarM340e);
                    b03Var.f502w = new f13(k03VarM340e.f5297b);
                }
                this.f14163a = false;
            } else {
                if (b03Var.m350n().f5296a.f10051i.length() == 0) {
                    return;
                }
                b03Var.m344h(false);
                long jM339c = b03.m339c(b03Var, k03.m2598a(b03Var.m350n(), null, f13.f2737b, 5), j, true, false, this.f14165c, true, new cs0(0));
                j2 = j;
                b03Var.f495p = new f13(jM339c);
                this.f14164b = new f13(jM339c);
            }
            b03Var.m353q(tr0.f10906h);
            b03Var.f494o = j2;
            b03Var.f498s.setValue(new rs1(j2));
            b03Var.f496q = 0L;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0096  */
    @Override // p000.kz2
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo2780e(long j) {
        z03 z03VarM5146d;
        long jM339c;
        b03 b03Var = this.f14166d;
        if (!b03Var.m347k() || b03Var.m350n().f5296a.f10051i.length() == 0) {
            return;
        }
        b03Var.f496q = rs1.m4612e(b03Var.f496q, j);
        t91 t91Var = b03Var.f483d;
        if (t91Var != null && (z03VarM5146d = t91Var.m5146d()) != null) {
            b03Var.f498s.setValue(new rs1(rs1.m4612e(b03Var.f494o, b03Var.f496q)));
            if (b03Var.f495p == null) {
                rs1 rs1VarM345i = b03Var.m345i();
                rs1VarM345i.getClass();
                if (z03VarM5146d.m6377c(rs1VarM345i.f9744a)) {
                    f13 f13Var = b03Var.f495p;
                    int iM6376b = f13Var != null ? (int) (f13Var.f2739a >> 32) : z03VarM5146d.m6376b(b03Var.f494o, false);
                    rs1 rs1VarM345i2 = b03Var.m345i();
                    rs1VarM345i2.getClass();
                    int iM6376b2 = z03VarM5146d.m6376b(rs1VarM345i2.f9744a, false);
                    if (b03Var.f495p == null && iM6376b == iM6376b2) {
                        return;
                    }
                    k03 k03VarM350n = b03Var.m350n();
                    rs1 rs1VarM345i3 = b03Var.m345i();
                    rs1VarM345i3.getClass();
                    jM339c = b03.m339c(b03Var, k03VarM350n, rs1VarM345i3.f9744a, false, false, this.f14165c, true, new cs0(9));
                } else {
                    int iMo2449n = b03Var.f481b.mo2449n(z03VarM5146d.m6376b(b03Var.f494o, true));
                    us1 us1Var = b03Var.f481b;
                    rs1 rs1VarM345i4 = b03Var.m345i();
                    rs1VarM345i4.getClass();
                    c80 c80Var = iMo2449n == us1Var.mo2449n(z03VarM5146d.m6376b(rs1VarM345i4.f9744a, true)) ? gd3.f3421H : gd3.f3422I;
                    k03 k03VarM350n2 = b03Var.m350n();
                    rs1 rs1VarM345i5 = b03Var.m345i();
                    rs1VarM345i5.getClass();
                    jM339c = b03.m339c(b03Var, k03VarM350n2, rs1VarM345i5.f9744a, false, false, c80Var, true, new cs0(9));
                }
                this.f14164b = new f13(jM339c);
                if (!f13.m1492a(jM339c, b03Var.f495p)) {
                    this.f14163a = false;
                }
            }
        }
        b03Var.m356t(false);
    }

    /* JADX INFO: renamed from: f */
    public final void m6521f() {
        b03 b03Var = this.f14166d;
        b03Var.f497r.setValue(null);
        b03Var.f498s.setValue(null);
        this.f14165c = gd3.f3421H;
        b03Var.m356t(true);
        f13 f13Var = this.f14164b;
        boolean zM1494c = f13.m1494c(f13Var != null ? f13Var.f2739a : b03Var.m350n().f5297b);
        b03Var.m353q(zM1494c ? tr0.f10908j : tr0.f10907i);
        t91 t91Var = b03Var.f483d;
        if (t91Var != null) {
            t91Var.f10634m.setValue(Boolean.valueOf(!zM1494c && s11.m4670O(b03Var, true)));
        }
        t91 t91Var2 = b03Var.f483d;
        if (t91Var2 != null) {
            t91Var2.f10635n.setValue(Boolean.valueOf(!zM1494c && s11.m4670O(b03Var, false)));
        }
        t91 t91Var3 = b03Var.f483d;
        if (t91Var3 != null) {
            t91Var3.f10636o.setValue(Boolean.valueOf(zM1494c && s11.m4670O(b03Var, true)));
        }
        if (this.f14163a) {
            b03.m338b(b03Var, b03Var.f495p);
        }
        b03Var.f495p = null;
    }

    @Override // p000.kz2
    public final void onCancel() {
        m6521f();
    }

    @Override // p000.kz2
    /* JADX INFO: renamed from: c */
    public final void mo2778c() {
    }

    @Override // p000.kz2
    /* JADX INFO: renamed from: d */
    public final void mo2779d() {
    }
}
