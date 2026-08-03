package yb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends y0.n implements x1.m {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public f1.r0 f22410u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public fg.a f22411v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public i1.b f22412w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final f1.h f22413x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final f1.j f22414y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public float f22415z;

    public f(f1.r0 r1, fg.a r2) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            r0.<init>()
            r0.f22410u = r1
            r0.f22411v = r2
            f1.h r1 = f1.c0.f()
            r0.f22413x = r1
            f1.j r1 = f1.l.a()
            r0.f22414y = r1
            r1 = 2143289344(0x7fc00000, float:NaN)
            r0.f22415z = r1
            return
    }

    @Override // x1.m
    public final void B(x1.h0 r12) {
            r11 = this;
            h1.b r0 = r12.f20932g
            r12.e()
            fg.a r1 = r11.f22411v
            java.lang.Object r1 = r1.invoke()
            yb.b r1 = (yb.b) r1
            if (r1 == 0) goto Lc8
            long r2 = r1.f22399b
            i1.b r4 = r11.f22412w
            if (r4 == 0) goto Lc8
            float r5 = r1.f22398a
            float r5 = r12.x0(r5)
            r6 = 32
            long r6 = r2 >> r6
            int r6 = (int) r6
            float r6 = java.lang.Float.intBitsToFloat(r6)
            float r6 = r12.x0(r6)
            r7 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r2 & r7
            int r2 = (int) r2
            float r2 = java.lang.Float.intBitsToFloat(r2)
            float r2 = r12.x0(r2)
            f1.r0 r3 = r11.f22410u
            long r7 = r0.a()
            u2.m r9 = r12.getLayoutDirection()
            f1.c0 r3 = r3.a(r7, r9, r12)
            f1.j r7 = r11.f22414y
            r7.h()
            boolean r8 = r3 instanceof f1.k0
            if (r8 == 0) goto L57
            r8 = r3
            f1.k0 r8 = (f1.k0) r8
            e1.c r8 = r8.f3073f
            f1.j.b(r7, r8)
            goto L70
        L57:
            boolean r8 = r3 instanceof f1.l0
            if (r8 == 0) goto L64
            r8 = r3
            f1.l0 r8 = (f1.l0) r8
            e1.d r8 = r8.f3074f
            f1.j.c(r7, r8)
            goto L70
        L64:
            boolean r8 = r3 instanceof f1.j0
            if (r8 == 0) goto Lc5
            r8 = r3
            f1.j0 r8 = (f1.j0) r8
            f1.j r8 = r8.f3071f
            f1.j.a(r7, r8)
        L70:
            f1.h r8 = r11.f22413x
            long r9 = r1.f22400c
            r8.w(r9)
            float r8 = r1.f22401d
            r4.f(r8)
            int r1 = r1.f22402e
            i1.d r8 = r4.f6133a
            int r9 = r8.O()
            if (r9 != r1) goto L87
            goto L8a
        L87:
            r8.h(r1)
        L8a:
            float r1 = r11.f22415z
            int r1 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r1 != 0) goto L91
            goto La2
        L91:
            r1 = 0
            int r1 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r1 <= 0) goto L9c
            f1.r r1 = new f1.r
            r1.<init>(r5, r5)
            goto L9d
        L9c:
            r1 = 0
        L9d:
            r4.g(r1)
            r11.f22415z = r5
        La2:
            yb.e r1 = new yb.e
            r1.<init>(r11, r3, r6, r2)
            long r2 = r0.a()
            long r2 = r9.e0.p0(r2)
            r12.y(r2, r1, r4)
            b5.c r0 = r0.f5038h
            f1.u r0 = r0.p()
            r0.e()
            r0.d(r7)
            oh.h.u(r12, r4)
            r0.p()
            return
        Lc5:
            okio.a.k()
        Lc8:
            return
    }

    @Override // y0.n
    public final boolean Z0() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // y0.n
    public final void c1() {
            r4 = this;
            f1.z r0 = x1.k.u(r4)
            i1.b r0 = r0.c()
            i1.d r1 = r0.f6133a
            int r2 = r1.w()
            r3 = 1
            if (r2 != r3) goto L12
            goto L15
        L12:
            r1.J(r3)
        L15:
            r4.f22412w = r0
            return
    }

    @Override // y0.n
    public final void d1() {
            r2 = this;
            i1.b r0 = r2.f22412w
            if (r0 == 0) goto Le
            f1.z r1 = x1.k.u(r2)
            r1.a(r0)
            r0 = 0
            r2.f22412w = r0
        Le:
            return
    }
}
