package ci;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class k0 {
    public static final void a(i0.h0 r3, int r4) {
            r0 = 890249590(0x35102176, float:5.369287E-7)
            r3.b0(r0)
            if (r4 == 0) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            r1 = r4 & 1
            boolean r0 = r3.S(r1, r0)
            if (r0 == 0) goto L3d
            i0.m2 r0 = y1.i0.f21970f
            java.lang.Object r0 = r3.j(r0)
            android.view.View r0 = (android.view.View) r0
            android.view.ViewParent r0 = r0.getParent()
            boolean r1 = r3.h(r0)
            java.lang.Object r2 = r3.P()
            if (r1 != 0) goto L2d
            i0.e r1 = i0.l.f5952a
            if (r2 != r1) goto L37
        L2d:
            b0.d0 r2 = new b0.d0
            r1 = 8
            r2.<init>(r0, r1)
            r3.k0(r2)
        L37:
            fg.l r2 = (fg.l) r2
            i0.r.c(r0, r2, r3)
            goto L40
        L3d:
            r3.V()
        L40:
            i0.r1 r3 = r3.t()
            if (r3 == 0) goto L4d
            c9.n1 r0 = new c9.n1
            r0.<init>(r4)
            r3.f6035d = r0
        L4d:
            return
    }

    public static float b(float r8, float r9) {
            float r8 = java.lang.Math.abs(r8)
            r0 = 1065353216(0x3f800000, float:1.0)
            float r0 = java.lang.Math.min(r0, r0)
            r1 = 0
            float r0 = java.lang.Math.max(r1, r0)
            double r2 = (double) r0
            r4 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r4 = java.lang.Math.pow(r2, r4)
            double r4 = r2 - r4
            r6 = 4613937818241073152(0x4008000000000000, double:3.0)
            double r2 = java.lang.Math.pow(r2, r6)
            double r2 = r2 / r6
            double r2 = r2 + r4
            double r4 = (double) r9
            double r2 = r2 * r4
            float r9 = (float) r2
            float r9 = java.lang.Math.abs(r9)
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 > 0) goto L2c
            return r1
        L2c:
            int r0 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r0 < 0) goto L31
            r8 = r9
        L31:
            double r8 = (double) r8
            double r8 = r8 * r6
            double r8 = r4 - r8
            r0 = 4604180019048437077(0x3fe5555555555555, double:0.6666666666666666)
            double r0 = java.lang.Math.pow(r4, r0)
            double r2 = java.lang.Math.signum(r8)
            double r2 = r2 * r0
            double r8 = java.lang.Math.abs(r8)
            r0 = 4599676419421066581(0x3fd5555555555555, double:0.3333333333333333)
            double r8 = java.lang.Math.pow(r8, r0)
            double r8 = r8 * r2
            double r4 = r4 - r8
            float r8 = (float) r4
            return r8
    }

    public static y0.o c(y0.o r2, n.k r3, ci.o0 r4, boolean r5) {
            r2.getClass()
            if (r4 == 0) goto Lb
            ci.i0 r0 = new ci.i0
            r0.<init>(r3, r4, r5)
            goto L30
        Lb:
            r0 = 0
            if (r4 != 0) goto L15
            ci.i0 r4 = new ci.i0
            r4.<init>(r3, r0, r5)
            r0 = r4
            goto L30
        L15:
            y0.l r1 = y0.l.f21818a
            if (r3 == 0) goto L27
            y0.o r4 = k.v0.a(r1, r3, r4)
            ci.i0 r1 = new ci.i0
            r1.<init>(r3, r0, r5)
            y0.o r0 = r4.d(r1)
            goto L30
        L27:
            ci.j0 r3 = new ci.j0
            r3.<init>(r4, r5)
            y0.o r0 = y0.a.a(r1, r3)
        L30:
            y0.o r2 = r2.d(r0)
            return r2
    }
}
