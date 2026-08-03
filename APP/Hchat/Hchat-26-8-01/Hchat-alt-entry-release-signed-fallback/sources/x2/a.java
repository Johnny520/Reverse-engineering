package x2;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends g3.s {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f21101j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f21102k;

    public /* synthetic */ a(android.view.ViewGroup r1, int r2) {
            r0 = this;
            r0.f21101j = r2
            r0.f21102k = r1
            r1 = 1
            r0.<init>(r1)
            return
    }

    @Override // g3.s
    public final g3.r0 d(g3.r0 r7, java.util.List r8) {
            r6 = this;
            int r8 = r6.f21101j
            switch(r8) {
                case 0: goto L4d;
                default: goto L5;
            }
        L5:
            android.view.ViewGroup r8 = r6.f21102k
            y2.t r8 = (y2.t) r8
            boolean r0 = r8.f22255s
            if (r0 == 0) goto Le
            goto L4c
        Le:
            r0 = 0
            android.view.View r1 = r8.getChildAt(r0)
            int r2 = r1.getLeft()
            int r2 = java.lang.Math.max(r0, r2)
            int r3 = r1.getTop()
            int r3 = java.lang.Math.max(r0, r3)
            int r4 = r8.getWidth()
            int r5 = r1.getRight()
            int r4 = r4 - r5
            int r4 = java.lang.Math.max(r0, r4)
            int r8 = r8.getHeight()
            int r1 = r1.getBottom()
            int r8 = r8 - r1
            int r8 = java.lang.Math.max(r0, r8)
            if (r2 != 0) goto L46
            if (r3 != 0) goto L46
            if (r4 != 0) goto L46
            if (r8 != 0) goto L46
            goto L4c
        L46:
            g3.n0 r7 = r7.f4230a
            g3.r0 r7 = r7.n(r2, r3, r4, r8)
        L4c:
            return r7
        L4d:
            android.view.ViewGroup r8 = r6.f21102k
            x2.v r8 = (x2.v) r8
            g3.r0 r7 = r8.g(r7)
            return r7
    }

    @Override // g3.s
    public final b.e e(g3.b0 r14, b.e r15) {
            r13 = this;
            int r14 = r13.f21101j
            switch(r14) {
                case 0: goto L6a;
                default: goto L5;
            }
        L5:
            android.view.ViewGroup r14 = r13.f21102k
            y2.t r14 = (y2.t) r14
            boolean r0 = r14.f22255s
            if (r0 == 0) goto Le
            goto L69
        Le:
            r0 = 0
            android.view.View r1 = r14.getChildAt(r0)
            int r2 = r1.getLeft()
            int r2 = java.lang.Math.max(r0, r2)
            int r3 = r1.getTop()
            int r3 = java.lang.Math.max(r0, r3)
            int r4 = r14.getWidth()
            int r5 = r1.getRight()
            int r4 = r4 - r5
            int r4 = java.lang.Math.max(r0, r4)
            int r14 = r14.getHeight()
            int r1 = r1.getBottom()
            int r14 = r14 - r1
            int r14 = java.lang.Math.max(r0, r14)
            if (r2 != 0) goto L46
            if (r3 != 0) goto L46
            if (r4 != 0) goto L46
            if (r14 != 0) goto L46
            goto L69
        L46:
            b3.a r14 = b3.a.b(r2, r3, r4, r14)
            int r0 = r14.f445a
            b.e r1 = new b.e
            java.lang.Object r2 = r15.f332h
            b3.a r2 = (b3.a) r2
            int r3 = r14.f446b
            int r4 = r14.f447c
            int r14 = r14.f448d
            b3.a r2 = g3.r0.a(r2, r0, r3, r4, r14)
            java.lang.Object r15 = r15.f333i
            b3.a r15 = (b3.a) r15
            b3.a r14 = g3.r0.a(r15, r0, r3, r4, r14)
            r15 = 6
            r1.<init>(r2, r15, r14)
            r15 = r1
        L69:
            return r15
        L6a:
            android.view.ViewGroup r14 = r13.f21102k
            x2.v r14 = (x2.v) r14
            x1.f0 r14 = r14.F
            x1.b1 r14 = r14.L
            x1.r r14 = r14.f20841c
            x1.b2 r0 = r14.Y
            boolean r0 = r0.f21832t
            if (r0 != 0) goto L7c
            goto Lf4
        L7c:
            r0 = 0
            long r0 = r14.m0(r0)
            long r0 = ig.a.W(r0)
            r2 = 32
            long r3 = r0 >> r2
            int r3 = (int) r3
            r4 = 0
            if (r3 >= 0) goto L8f
            r3 = r4
        L8f:
            r5 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r5
            int r0 = (int) r0
            if (r0 >= 0) goto L99
            r0 = r4
        L99:
            v1.t r1 = v1.w.h(r14)
            long r7 = r1.F()
            long r9 = r7 >> r2
            int r1 = (int) r9
            long r7 = r7 & r5
            int r7 = (int) r7
            long r8 = r14.f13902i
            long r10 = r8 >> r2
            int r10 = (int) r10
            long r8 = r8 & r5
            int r8 = (int) r8
            float r9 = (float) r10
            float r8 = (float) r8
            int r9 = java.lang.Float.floatToRawIntBits(r9)
            long r9 = (long) r9
            int r8 = java.lang.Float.floatToRawIntBits(r8)
            long r11 = (long) r8
            long r8 = r9 << r2
            long r10 = r11 & r5
            long r8 = r8 | r10
            long r8 = r14.m0(r8)
            long r8 = ig.a.W(r8)
            long r10 = r8 >> r2
            int r14 = (int) r10
            int r1 = r1 - r14
            if (r1 >= 0) goto Lcd
            r1 = r4
        Lcd:
            long r5 = r5 & r8
            int r14 = (int) r5
            int r7 = r7 - r14
            if (r7 >= 0) goto Ld3
            goto Ld4
        Ld3:
            r4 = r7
        Ld4:
            if (r3 != 0) goto Ldd
            if (r0 != 0) goto Ldd
            if (r1 != 0) goto Ldd
            if (r4 != 0) goto Ldd
            goto Lf4
        Ldd:
            b.e r14 = new b.e
            java.lang.Object r2 = r15.f332h
            b3.a r2 = (b3.a) r2
            b3.a r2 = x2.h.f(r2, r3, r0, r1, r4)
            java.lang.Object r15 = r15.f333i
            b3.a r15 = (b3.a) r15
            b3.a r15 = x2.h.f(r15, r3, r0, r1, r4)
            r0 = 6
            r14.<init>(r2, r0, r15)
            r15 = r14
        Lf4:
            return r15
    }
}
