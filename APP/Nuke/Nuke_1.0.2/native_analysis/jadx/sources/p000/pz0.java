package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class pz0 extends md1 {
    @Override // p000.md1
    /* JADX INFO: renamed from: I0 */
    public final void mo3062I0() {
        qd1 qd1Var = this.f6572v.f13985v.f9373N.f11796q;
        qd1Var.getClass();
        qd1Var.m4144r0();
    }

    @Override // p000.if1
    /* JADX INFO: renamed from: N */
    public final int mo2337N(int i) {
        sz0 sz0VarM4388t = this.f6572v.f13985v.m4388t();
        nf1 nf1VarM5034G = sz0VarM4388t.m5034G();
        r61 r61Var = (r61) sz0VarM4388t.f10436i;
        return nf1VarM5034G.mo290j((zn1) r61Var.f9372M.f12034e, r61Var.m4380l(), i);
    }

    @Override // p000.if1
    /* JADX INFO: renamed from: W */
    public final int mo2338W(int i) {
        sz0 sz0VarM4388t = this.f6572v.f13985v.m4388t();
        nf1 nf1VarM5034G = sz0VarM4388t.m5034G();
        r61 r61Var = (r61) sz0VarM4388t.f10436i;
        return nf1VarM5034G.mo284d((zn1) r61Var.f9372M.f12034e, r61Var.m4380l(), i);
    }

    @Override // p000.if1
    /* JADX INFO: renamed from: X */
    public final int mo2339X(int i) {
        sz0 sz0VarM4388t = this.f6572v.f13985v.m4388t();
        nf1 nf1VarM5034G = sz0VarM4388t.m5034G();
        r61 r61Var = (r61) sz0VarM4388t.f10436i;
        return nf1VarM5034G.mo288h((zn1) r61Var.f9372M.f12034e, r61Var.m4380l(), i);
    }

    @Override // p000.if1
    /* JADX INFO: renamed from: e */
    public final sz1 mo2340e(long j) {
        m5047k0(j);
        zn1 zn1Var = this.f6572v;
        zk1 zk1VarM4393y = zn1Var.f13985v.m4393y();
        Object[] objArr = zk1VarM4393y.f13934h;
        int i = zk1VarM4393y.f13936j;
        for (int i2 = 0; i2 < i; i2++) {
            qd1 qd1Var = ((r61) objArr[i2]).f9373N.f11796q;
            qd1Var.getClass();
            qd1Var.f8911q = p61.f7987j;
        }
        r61 r61Var = zn1Var.f13985v;
        md1.m3061H0(this, r61Var.f9363D.mo287g(this, r61Var.m4380l(), j));
        return this;
    }

    @Override // p000.if1
    /* JADX INFO: renamed from: f */
    public final int mo2341f(int i) {
        sz0 sz0VarM4388t = this.f6572v.f13985v.m4388t();
        nf1 nf1VarM5034G = sz0VarM4388t.m5034G();
        r61 r61Var = (r61) sz0VarM4388t.f10436i;
        return nf1VarM5034G.mo282b((zn1) r61Var.f9372M.f12034e, r61Var.m4380l(), i);
    }

    @Override // p000.kd1
    /* JADX INFO: renamed from: m0 */
    public final int mo2610m0(du0 du0Var) {
        qd1 qd1Var = this.f6572v.f13985v.f9373N.f11796q;
        qd1Var.getClass();
        v61 v61Var = qd1Var.f8907m;
        n61 n61Var = v61Var.f11783d;
        s61 s61Var = qd1Var.f8918x;
        if (n61Var == n61.f7019i) {
            s61Var.f9939d = true;
            if (s61Var.f9937b) {
                v61Var.f11785f = true;
                v61Var.f11786g = true;
            }
        } else {
            s61Var.f9940e = true;
        }
        pz0 pz0Var = qd1Var.mo3075n().f9294Z;
        if (pz0Var != null) {
            pz0Var.f5468r = true;
        }
        qd1Var.mo3079q();
        pz0 pz0Var2 = qd1Var.mo3075n().f9294Z;
        if (pz0Var2 != null) {
            pz0Var2.f5468r = false;
        }
        Integer num = (Integer) s61Var.f9942g.get(du0Var);
        int iIntValue = num != null ? num.intValue() : Integer.MIN_VALUE;
        this.f6571A.m1936g(iIntValue, du0Var);
        return iIntValue;
    }
}
