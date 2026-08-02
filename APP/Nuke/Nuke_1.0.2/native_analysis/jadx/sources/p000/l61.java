package p000;

import nuke.module.wechat.p002ai.AIChatConfig;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class l61 extends zn1 {

    /* JADX INFO: renamed from: a0 */
    public static final C0611q9 f5947a0;

    /* JADX INFO: renamed from: Y */
    public j61 f5948Y;

    /* JADX INFO: renamed from: Z */
    public k61 f5949Z;

    static {
        C0611q9 c0611q9M3911i = pp0.m3911i();
        int i = C0363ju.f5218h;
        c0611q9M3911i.m4095k(C0363ju.f5215e);
        c0611q9M3911i.m4101q(1.0f);
        c0611q9M3911i.m4102r(1);
        f5947a0 = c0611q9M3911i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public l61(r61 r61Var, j61 j61Var) {
        super(r61Var);
        this.f5948Y = j61Var;
        this.f5949Z = r61Var.f9391o != null ? new k61(this) : null;
        if ((((th1) j61Var).f10757h.f10759j & AIChatConfig.DefaultMaxTokens) == 0) {
            return;
        }
        c80.m664g();
        throw null;
    }

    @Override // p000.if1
    /* JADX INFO: renamed from: N */
    public final int mo2337N(int i) {
        j61 j61Var = this.f5948Y;
        zn1 zn1Var = this.f13986w;
        zn1Var.getClass();
        return j61Var.mo2361U(this, zn1Var, i);
    }

    @Override // p000.zn1
    /* JADX INFO: renamed from: N0 */
    public final void mo2841N0() {
        if (this.f5949Z == null) {
            this.f5949Z = new k61(this);
        }
    }

    @Override // p000.zn1
    /* JADX INFO: renamed from: Q0 */
    public final md1 mo2842Q0() {
        return this.f5949Z;
    }

    @Override // p000.zn1
    /* JADX INFO: renamed from: S0 */
    public final th1 mo2843S0() {
        return ((th1) this.f5948Y).f10757h;
    }

    @Override // p000.if1
    /* JADX INFO: renamed from: W */
    public final int mo2338W(int i) {
        j61 j61Var = this.f5948Y;
        zn1 zn1Var = this.f13986w;
        zn1Var.getClass();
        return j61Var.mo2362g(this, zn1Var, i);
    }

    @Override // p000.if1
    /* JADX INFO: renamed from: X */
    public final int mo2339X(int i) {
        j61 j61Var = this.f5948Y;
        zn1 zn1Var = this.f13986w;
        zn1Var.getClass();
        return j61Var.mo2360D(this, zn1Var, i);
    }

    @Override // p000.if1
    /* JADX INFO: renamed from: e */
    public final sz1 mo2340e(long j) {
        m5047k0(j);
        j61 j61Var = this.f5948Y;
        zn1 zn1Var = this.f13986w;
        zn1Var.getClass();
        m6468l1(j61Var.mo1363e(this, zn1Var, j));
        m6460c1();
        return this;
    }

    @Override // p000.if1
    /* JADX INFO: renamed from: f */
    public final int mo2341f(int i) {
        j61 j61Var = this.f5948Y;
        zn1 zn1Var = this.f13986w;
        zn1Var.getClass();
        return j61Var.mo2363p(this, zn1Var, i);
    }

    @Override // p000.sz1
    /* JADX INFO: renamed from: f0 */
    public final void mo2506f0(long j, float f, in0 in0Var) {
        m6465i1(j, f, in0Var);
        if (this.f5467q) {
            return;
        }
        m6461d1();
        zn1 zn1Var = this.f13986w;
        zn1Var.getClass();
        zn1Var.f5468r = this.f5468r;
        mo2630A0().mo105b();
        zn1Var.f5468r = false;
    }

    @Override // p000.zn1
    /* JADX INFO: renamed from: h1 */
    public final void mo2844h1(InterfaceC0627qp interfaceC0627qp, pq0 pq0Var) {
        zn1 zn1Var;
        zn1 zn1Var2 = this.f13986w;
        zn1Var2.getClass();
        zn1Var2.m6447L0(interfaceC0627qp, pq0Var);
        if (!((ViewTreeObserverOnGlobalLayoutListenerC0045b7) u61.m5471a(this.f13985v)).getShowLayoutBounds() || (zn1Var = this.f13986w) == null) {
            return;
        }
        if (h11.m2041a(this.f10440j, zn1Var.f10440j) && z01.m6371a(zn1Var.f13972G, 0L)) {
            return;
        }
        long j = this.f10440j;
        interfaceC0627qp.mo1526p(0.5f, 0.5f, ((int) (j >> 32)) - 0.5f, ((int) (j & 4294967295L)) - 0.5f, f5947a0);
    }

    @Override // p000.kd1
    /* JADX INFO: renamed from: m0 */
    public final int mo2610m0(du0 du0Var) {
        k61 k61Var = this.f5949Z;
        if (k61Var == null) {
            return t11.m5085k(this, du0Var);
        }
        gk1 gk1Var = k61Var.f6571A;
        int iM1933d = gk1Var.m1933d(du0Var);
        if (iM1933d >= 0) {
            return gk1Var.f3554c[iM1933d];
        }
        return Integer.MIN_VALUE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: u1 */
    public final void m2845u1(j61 j61Var) {
        if (j61Var.equals(this.f5948Y) || (((th1) j61Var).f10757h.f10759j & AIChatConfig.DefaultMaxTokens) == 0) {
            this.f5948Y = j61Var;
        } else {
            c80.m664g();
        }
    }
}
