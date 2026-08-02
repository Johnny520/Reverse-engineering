package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class qz0 extends zn1 {

    /* JADX INFO: renamed from: a0 */
    public static final C0611q9 f9292a0;

    /* JADX INFO: renamed from: Y */
    public final qx2 f9293Y;

    /* JADX INFO: renamed from: Z */
    public pz0 f9294Z;

    static {
        C0611q9 c0611q9M3911i = pp0.m3911i();
        int i = C0363ju.f5218h;
        c0611q9M3911i.m4095k(C0363ju.f5214d);
        c0611q9M3911i.m4101q(1.0f);
        c0611q9M3911i.m4102r(1);
        f9292a0 = c0611q9M3911i;
    }

    public qz0(r61 r61Var) {
        super(r61Var);
        qx2 qx2Var = new qx2();
        qx2Var.f10760k = 0;
        this.f9293Y = qx2Var;
        qx2Var.f10764o = this;
        this.f9294Z = r61Var.f9391o != null ? new pz0(this) : null;
    }

    @Override // p000.if1
    /* JADX INFO: renamed from: N */
    public final int mo2337N(int i) {
        sz0 sz0VarM4388t = this.f13985v.m4388t();
        nf1 nf1VarM5034G = sz0VarM4388t.m5034G();
        r61 r61Var = (r61) sz0VarM4388t.f10436i;
        return nf1VarM5034G.mo290j((zn1) r61Var.f9372M.f12034e, r61Var.m4381m(), i);
    }

    @Override // p000.zn1
    /* JADX INFO: renamed from: N0 */
    public final void mo2841N0() {
        if (this.f9294Z == null) {
            this.f9294Z = new pz0(this);
        }
    }

    @Override // p000.zn1
    /* JADX INFO: renamed from: Q0 */
    public final md1 mo2842Q0() {
        return this.f9294Z;
    }

    @Override // p000.zn1
    /* JADX INFO: renamed from: S0 */
    public final th1 mo2843S0() {
        return this.f9293Y;
    }

    @Override // p000.if1
    /* JADX INFO: renamed from: W */
    public final int mo2338W(int i) {
        sz0 sz0VarM4388t = this.f13985v.m4388t();
        nf1 nf1VarM5034G = sz0VarM4388t.m5034G();
        r61 r61Var = (r61) sz0VarM4388t.f10436i;
        return nf1VarM5034G.mo284d((zn1) r61Var.f9372M.f12034e, r61Var.m4381m(), i);
    }

    @Override // p000.if1
    /* JADX INFO: renamed from: X */
    public final int mo2339X(int i) {
        sz0 sz0VarM4388t = this.f13985v.m4388t();
        nf1 nf1VarM5034G = sz0VarM4388t.m5034G();
        r61 r61Var = (r61) sz0VarM4388t.f10436i;
        return nf1VarM5034G.mo288h((zn1) r61Var.f9372M.f12034e, r61Var.m4381m(), i);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    @Override // p000.zn1
    /* JADX INFO: renamed from: Y0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo4301Y0(xn1 xn1Var, long j, xs0 xs0Var, int i, boolean z) {
        int i2;
        boolean z2;
        r61 r61Var = this.f13985v;
        boolean z3 = false;
        if (xn1Var.mo2452r(r61Var)) {
            if (m6475t1(j)) {
                i2 = i;
                z2 = z;
            } else {
                i2 = i;
                if (i2 == 1 && (Float.floatToRawIntBits(m6446K0(j, m6451R0())) & Integer.MAX_VALUE) < 2139095040) {
                    z2 = false;
                }
            }
            z3 = true;
            if (z3) {
                return;
            }
            int i3 = xs0Var.f13157j;
            zk1 zk1VarM4392x = r61Var.m4392x();
            Object[] objArr = zk1VarM4392x.f13934h;
            int i4 = zk1VarM4392x.f13936j - 1;
            while (i4 >= 0) {
                r61 r61Var2 = (r61) objArr[i4];
                if (r61Var2.m4351I()) {
                    xn1Var.mo2448l(r61Var2, j, xs0Var, i2, z2);
                    long jM6175a = xs0Var.m6175a();
                    if (xe1.m6149z(jM6175a) < 0.0f && xe1.m6097O(jM6175a) && !xe1.m6096N(jM6175a) && !xn1Var.mo2450o(xs0Var, r61Var2)) {
                        break;
                    }
                }
                i4--;
                i2 = i;
            }
            xs0Var.f13157j = i3;
            return;
        }
        i2 = i;
        z2 = z;
        if (z3) {
        }
    }

    @Override // p000.if1
    /* JADX INFO: renamed from: e */
    public final sz1 mo2340e(long j) {
        m5047k0(j);
        r61 r61Var = this.f13985v;
        zk1 zk1VarM4393y = r61Var.m4393y();
        Object[] objArr = zk1VarM4393y.f13934h;
        int i = zk1VarM4393y.f13936j;
        for (int i2 = 0; i2 < i; i2++) {
            ((r61) objArr[i2]).f9373N.f11795p.f6624s = p61.f7987j;
        }
        m6468l1(r61Var.f9363D.mo287g(this, r61Var.m4381m(), j));
        m6460c1();
        return this;
    }

    @Override // p000.if1
    /* JADX INFO: renamed from: f */
    public final int mo2341f(int i) {
        sz0 sz0VarM4388t = this.f13985v.m4388t();
        nf1 nf1VarM5034G = sz0VarM4388t.m5034G();
        r61 r61Var = (r61) sz0VarM4388t.f10436i;
        return nf1VarM5034G.mo282b((zn1) r61Var.f9372M.f12034e, r61Var.m4381m(), i);
    }

    @Override // p000.sz1
    /* JADX INFO: renamed from: f0 */
    public final void mo2506f0(long j, float f, in0 in0Var) {
        m6465i1(j, f, in0Var);
        if (this.f5467q) {
            return;
        }
        this.f13985v.f9373N.f11795p.m3080q0();
    }

    @Override // p000.zn1
    /* JADX INFO: renamed from: h1 */
    public final void mo2844h1(InterfaceC0627qp interfaceC0627qp, pq0 pq0Var) {
        r61 r61Var = this.f13985v;
        zv1 zv1VarM5471a = u61.m5471a(r61Var);
        zk1 zk1VarM4392x = r61Var.m4392x();
        Object[] objArr = zk1VarM4392x.f13934h;
        int i = zk1VarM4392x.f13936j;
        for (int i2 = 0; i2 < i; i2++) {
            r61 r61Var2 = (r61) objArr[i2];
            if (r61Var2.m4351I()) {
                r61Var2.m4378i(interfaceC0627qp, pq0Var);
            }
        }
        if (((ViewTreeObserverOnGlobalLayoutListenerC0045b7) zv1VarM5471a).getShowLayoutBounds()) {
            long j = this.f10440j;
            interfaceC0627qp.mo1526p(0.5f, 0.5f, ((int) (j >> 32)) - 0.5f, ((int) (j & 4294967295L)) - 0.5f, f9292a0);
        }
    }

    @Override // p000.kd1
    /* JADX INFO: renamed from: m0 */
    public final int mo2610m0(du0 du0Var) {
        pz0 pz0Var = this.f9294Z;
        if (pz0Var != null) {
            return pz0Var.mo2610m0(du0Var);
        }
        mf1 mf1Var = this.f13985v.f9373N.f11795p;
        n61 n61Var = mf1Var.f6618m.f11783d;
        s61 s61Var = mf1Var.f6604D;
        if (n61Var == n61.f7018h) {
            s61Var.f9939d = true;
            if (s61Var.f9937b) {
                mf1Var.f6602B = true;
                mf1Var.f6603C = true;
            }
        } else {
            s61Var.f9940e = true;
        }
        qz0 qz0VarMo3075n = mf1Var.mo3075n();
        boolean z = qz0VarMo3075n.f5468r;
        qz0VarMo3075n.f5468r = true;
        mf1Var.mo3079q();
        qz0VarMo3075n.f5468r = z;
        Integer num = (Integer) s61Var.f9942g.get(du0Var);
        if (num != null) {
            return num.intValue();
        }
        return Integer.MIN_VALUE;
    }
}
