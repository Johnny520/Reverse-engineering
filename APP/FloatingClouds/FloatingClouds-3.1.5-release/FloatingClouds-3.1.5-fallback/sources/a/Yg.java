package a;

/* JADX INFO: loaded from: classes.dex */
public class Yg extends a.C0138f8 {
    public int g0;
    public int h0;
    public int i0;
    public int j0;
    public int k0;
    public int l0;
    public boolean m0;
    public int n0;
    public int o0;
    public final a.C0114e2.a p0;
    public a.C0114e2.b q0;

    public Yg() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.g0 = r0
            r1.h0 = r0
            r1.i0 = r0
            r1.j0 = r0
            r1.k0 = r0
            r1.l0 = r0
            r1.m0 = r0
            r1.n0 = r0
            r1.o0 = r0
            a.e2$a r0 = new a.e2$a
            r0.<init>()
            r1.p0 = r0
            r0 = 0
            r1.q0 = r0
            return
    }

    @Override // a.C0138f8
    public final void B() {
            r2 = this;
            r0 = 0
        L1:
            int r1 = r2.f0
            if (r0 >= r1) goto Lc
            a.N3[] r1 = r2.e0
            r1 = r1[r0]
            int r0 = r0 + 1
            goto L1
        Lc:
            return
    }

    public void C(int r1, int r2, int r3, int r4) {
            r0 = this;
            return
    }

    public final void D(a.N3 r3, a.N3.a r4, int r5, a.N3.a r6, int r7) {
            r2 = this;
        L0:
            a.e2$b r0 = r2.q0
            if (r0 != 0) goto Lf
            a.N3 r1 = r2.K
            if (r1 == 0) goto Lf
            a.O3 r1 = (a.O3) r1
            a.e2$b r0 = r1.h0
            r2.q0 = r0
            goto L0
        Lf:
            a.e2$a r1 = r2.p0
            r1.f448a = r4
            r1.b = r6
            r1.c = r5
            r1.d = r7
            androidx.constraintlayout.widget.ConstraintLayout$b r0 = (androidx.constraintlayout.widget.ConstraintLayout.b) r0
            r0.a(r3, r1)
            int r4 = r1.e
            r3.y(r4)
            int r4 = r1.f
            r3.v(r4)
            boolean r4 = r1.h
            r3.w = r4
            int r4 = r1.g
            r3.R = r4
            if (r4 <= 0) goto L34
            r4 = 1
            goto L35
        L34:
            r4 = 0
        L35:
            r3.w = r4
            return
    }
}
