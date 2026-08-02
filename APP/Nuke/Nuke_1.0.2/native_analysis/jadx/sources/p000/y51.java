package p000;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class y51 implements a82, d20 {

    /* JADX INFO: renamed from: h */
    public final a20 f13310h;

    /* JADX INFO: renamed from: i */
    public final mn0 f13311i;

    /* JADX INFO: renamed from: j */
    public final s00 f13312j;

    /* JADX INFO: renamed from: k */
    public zt2 f13313k;

    public y51(a20 a20Var, mn0 mn0Var) {
        this.f13310h = a20Var;
        this.f13311i = mn0Var;
        this.f13312j = AbstractC0731te.m5206e(a20Var.mo14k(this));
    }

    @Override // p000.a82
    /* JADX INFO: renamed from: a */
    public final void mo109a() {
        zt2 zt2Var = this.f13313k;
        if (zt2Var != null) {
            CancellationException cancellationException = new CancellationException("Old job was still running!");
            cancellationException.initCause(null);
            zt2Var.mo1704c(cancellationException);
        }
        this.f13313k = AbstractC0570p7.m3745A(this.f13312j, null, this.f13311i, 3);
    }

    @Override // p000.a82
    /* JADX INFO: renamed from: d */
    public final void mo110d() {
        zt2 zt2Var = this.f13313k;
        if (zt2Var != null) {
            zt2Var.mo3477D(new mm0(1));
        }
        this.f13313k = null;
    }

    @Override // p000.a82
    /* JADX INFO: renamed from: f */
    public final void mo111f() {
        zt2 zt2Var = this.f13313k;
        if (zt2Var != null) {
            zt2Var.mo3477D(new mm0(1));
        }
        this.f13313k = null;
    }

    @Override // p000.y10
    public final z10 getKey() {
        return gd3.f3439q;
    }

    @Override // p000.a20
    /* JADX INFO: renamed from: k */
    public final a20 mo14k(a20 a20Var) {
        return xe1.m6120f0(this, a20Var);
    }

    @Override // p000.a20
    /* JADX INFO: renamed from: o */
    public final y10 mo15o(z10 z10Var) {
        return xe1.m6144u(this, z10Var);
    }

    @Override // p000.d20
    /* JADX INFO: renamed from: p */
    public final void mo490p(a20 a20Var, Throwable th) throws Throwable {
        C0110cy c0110cy = (C0110cy) a20Var.mo15o(C0110cy.f1773i);
        if (c0110cy != null) {
            AbstractC0691se.m4829R(th, new C0640r1(12, c0110cy, this));
        }
        d20 d20Var = (d20) this.f13310h.mo15o(gd3.f3439q);
        if (d20Var == null) {
            throw th;
        }
        d20Var.mo490p(a20Var, th);
    }

    @Override // p000.a20
    /* JADX INFO: renamed from: r */
    public final Object mo16r(mn0 mn0Var, Object obj) {
        return mn0Var.mo12g(obj, this);
    }

    @Override // p000.a20
    /* JADX INFO: renamed from: u */
    public final a20 mo17u(z10 z10Var) {
        return xe1.m6105W(this, z10Var);
    }
}
