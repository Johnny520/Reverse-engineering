package p000;

/* JADX INFO: renamed from: mj */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
final class C0463mj extends yh1 {

    /* JADX INFO: renamed from: a */
    public final long f6670a;

    /* JADX INFO: renamed from: b */
    public final float f6671b = 1.0f;

    /* JADX INFO: renamed from: c */
    public final eq2 f6672c;

    public C0463mj(long j, eq2 eq2Var) {
        this.f6670a = j;
        this.f6672c = eq2Var;
    }

    public final boolean equals(Object obj) {
        C0463mj c0463mj = obj instanceof C0463mj ? (C0463mj) obj : null;
        return c0463mj != null && C0363ju.m2566c(this.f6670a, c0463mj.f6670a) && this.f6671b == c0463mj.f6671b && t11.m5086l(this.f6672c, c0463mj.f6672c);
    }

    @Override // p000.yh1
    /* JADX INFO: renamed from: f */
    public final th1 mo199f() {
        C0500nj c0500nj = new C0500nj();
        c0500nj.f7174v = this.f6670a;
        c0500nj.f7175w = this.f6672c;
        c0500nj.f7176x = 9205357640488583168L;
        return c0500nj;
    }

    @Override // p000.yh1
    /* JADX INFO: renamed from: g */
    public final void mo200g(th1 th1Var) {
        C0500nj c0500nj = (C0500nj) th1Var;
        c0500nj.f7174v = this.f6670a;
        eq2 eq2Var = c0500nj.f7175w;
        eq2 eq2Var2 = this.f6672c;
        if (!t11.m5086l(eq2Var, eq2Var2)) {
            c0500nj.f7175w = eq2Var2;
            qp0.m4223E(c0500nj);
        }
        ci0.m788M(c0500nj);
    }

    public final int hashCode() {
        int i = C0363ju.f5218h;
        return this.f6672c.hashCode() + vi0.m5684c(this.f6671b, Long.hashCode(this.f6670a) * 961, 31);
    }
}
