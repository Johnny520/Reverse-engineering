package a;

/* JADX INFO: renamed from: a.a8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0046a8 extends a.N3 {
    public float e0;
    public int f0;
    public int g0;
    public a.M3 h0;
    public int i0;

    public C0046a8() {
            r4 = this;
            r4.<init>()
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r4.e0 = r0
            r0 = -1
            r4.f0 = r0
            r4.g0 = r0
            a.M3 r0 = r4.z
            r4.h0 = r0
            r0 = 0
            r4.i0 = r0
            java.util.ArrayList<a.M3> r1 = r4.H
            r1.clear()
            java.util.ArrayList<a.M3> r1 = r4.H
            a.M3 r2 = r4.h0
            r1.add(r2)
            a.M3[] r1 = r4.G
            int r1 = r1.length
        L22:
            if (r0 >= r1) goto L2d
            a.M3[] r2 = r4.G
            a.M3 r3 = r4.h0
            r2[r0] = r3
            int r0 = r0 + 1
            goto L22
        L2d:
            return
    }

    @Override // a.N3
    public final void A(a.B9 r4) {
            r3 = this;
            a.N3 r0 = r3.K
            if (r0 != 0) goto L5
            return
        L5:
            a.M3 r0 = r3.h0
            r4.getClass()
            int r4 = a.B9.m(r0)
            int r0 = r3.i0
            r1 = 1
            r2 = 0
            if (r0 != r1) goto L25
            r3.P = r4
            r3.Q = r2
            a.N3 r4 = r3.K
            int r4 = r4.i()
            r3.v(r4)
            r3.y(r2)
            return
        L25:
            r3.P = r2
            r3.Q = r4
            a.N3 r4 = r3.K
            int r4 = r4.l()
            r3.y(r4)
            r3.v(r2)
            return
    }

    public final void B(int r4) {
            r3 = this;
            int r0 = r3.i0
            if (r0 != r4) goto L5
            goto L2c
        L5:
            r3.i0 = r4
            java.util.ArrayList<a.M3> r4 = r3.H
            r4.clear()
            int r0 = r3.i0
            r1 = 1
            if (r0 != r1) goto L16
            a.M3 r0 = r3.y
            r3.h0 = r0
            goto L1a
        L16:
            a.M3 r0 = r3.z
            r3.h0 = r0
        L1a:
            a.M3 r0 = r3.h0
            r4.add(r0)
            a.M3[] r4 = r3.G
            int r0 = r4.length
            r1 = 0
        L23:
            if (r1 >= r0) goto L2c
            a.M3 r2 = r3.h0
            r4[r1] = r2
            int r1 = r1 + 1
            goto L23
        L2c:
            return
    }

    @Override // a.N3
    public final void a(a.B9 r9) {
            r8 = this;
            a.N3 r0 = r8.K
            a.O3 r0 = (a.O3) r0
            if (r0 != 0) goto L8
            goto La9
        L8:
            a.M3$a r1 = a.M3.a.f172a
            a.M3 r1 = r0.g(r1)
            a.M3$a r2 = a.M3.a.c
            a.M3 r2 = r0.g(r2)
            a.N3 r3 = r8.K
            a.N3$a r4 = a.N3.a.b
            r5 = 1
            r6 = 0
            if (r3 == 0) goto L24
            a.N3$a[] r3 = r3.J
            r3 = r3[r6]
            if (r3 != r4) goto L24
            r3 = r5
            goto L25
        L24:
            r3 = r6
        L25:
            int r7 = r8.i0
            if (r7 != 0) goto L42
            a.M3$a r1 = a.M3.a.b
            a.M3 r1 = r0.g(r1)
            a.M3$a r2 = a.M3.a.d
            a.M3 r2 = r0.g(r2)
            a.N3 r0 = r8.K
            if (r0 == 0) goto L40
            a.N3$a[] r0 = r0.J
            r0 = r0[r5]
            if (r0 != r4) goto L40
            goto L41
        L40:
            r5 = r6
        L41:
            r3 = r5
        L42:
            int r0 = r8.f0
            r4 = 8
            r5 = -1
            r7 = 5
            if (r0 == r5) goto L63
            a.M3 r0 = r8.h0
            a.le r0 = r9.j(r0)
            a.le r1 = r9.j(r1)
            int r5 = r8.f0
            r9.e(r0, r1, r5, r4)
            if (r3 == 0) goto La9
            a.le r1 = r9.j(r2)
            r9.f(r1, r0, r6, r7)
            return
        L63:
            int r0 = r8.g0
            if (r0 == r5) goto L84
            a.M3 r0 = r8.h0
            a.le r0 = r9.j(r0)
            a.le r2 = r9.j(r2)
            int r5 = r8.g0
            int r5 = -r5
            r9.e(r0, r2, r5, r4)
            if (r3 == 0) goto La9
            a.le r1 = r9.j(r1)
            r9.f(r0, r1, r6, r7)
            r9.f(r2, r0, r6, r7)
            return
        L84:
            float r0 = r8.e0
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto La9
            a.M3 r0 = r8.h0
            a.le r0 = r9.j(r0)
            a.le r2 = r9.j(r2)
            float r3 = r8.e0
            a.K1 r4 = r9.k()
            a.K1$a r5 = r4.d
            r5.c(r0, r1)
            a.K1$a r0 = r4.d
            r0.c(r2, r3)
            r9.c(r4)
        La9:
            return
    }

    @Override // a.N3
    public final boolean b() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // a.N3
    public final a.M3 g(a.M3.a r3) {
            r2 = this;
            int r0 = r3.ordinal()
            switch(r0) {
                case 0: goto L21;
                case 1: goto Lf;
                case 2: goto L8;
                case 3: goto Lf;
                case 4: goto L8;
                case 5: goto L21;
                case 6: goto L21;
                case 7: goto L21;
                case 8: goto L21;
                default: goto L7;
            }
        L7:
            goto L17
        L8:
            int r0 = r2.i0
            if (r0 != 0) goto L17
            a.M3 r3 = r2.h0
            return r3
        Lf:
            int r0 = r2.i0
            r1 = 1
            if (r0 != r1) goto L17
            a.M3 r3 = r2.h0
            return r3
        L17:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            java.lang.String r3 = r3.name()
            r0.<init>(r3)
            throw r0
        L21:
            r3 = 0
            return r3
    }
}
