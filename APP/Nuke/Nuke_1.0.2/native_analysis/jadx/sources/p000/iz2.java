package p000;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class iz2 {

    /* JADX INFO: renamed from: a */
    public final C0690sd f4847a;

    /* JADX INFO: renamed from: b */
    public final m13 f4848b;

    /* JADX INFO: renamed from: e */
    public final boolean f4851e;

    /* JADX INFO: renamed from: g */
    public final e70 f4853g;

    /* JADX INFO: renamed from: h */
    public final xl0 f4854h;

    /* JADX INFO: renamed from: j */
    public C0093cj f4856j;

    /* JADX INFO: renamed from: k */
    public d61 f4857k;

    /* JADX INFO: renamed from: c */
    public final int f4849c = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: d */
    public final int f4850d = 1;

    /* JADX INFO: renamed from: f */
    public final int f4852f = 1;

    /* JADX INFO: renamed from: i */
    public final List f4855i = be0.f819h;

    public iz2(C0690sd c0690sd, m13 m13Var, boolean z, e70 e70Var, xl0 xl0Var, int i) {
        this.f4847a = c0690sd;
        this.f4848b = m13Var;
        this.f4851e = z;
        this.f4853g = e70Var;
        this.f4854h = xl0Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m2425a(d61 d61Var) {
        C0093cj c0093cj = this.f4856j;
        if (c0093cj == null || d61Var != this.f4857k || c0093cj.mo827b()) {
            this.f4857k = d61Var;
            c0093cj = new C0093cj(this.f4847a, xe1.m6130k0(this.f4848b, d61Var), this.f4855i, this.f4853g, this.f4854h);
        }
        this.f4856j = c0093cj;
    }
}
