package i0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class f0 extends i0.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f5874a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f5875b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f5876c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public java.util.HashSet f5877d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final f.l0 f5878e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final i0.j1 f5879f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ i0.h0 f5880g;

    public f0(i0.h0 r1, long r2, boolean r4, boolean r5, androidx.lifecycle.x r6) {
            r0 = this;
            r0.<init>()
            r0.f5880g = r1
            r0.f5874a = r2
            r0.f5875b = r4
            r0.f5876c = r5
            f.l0 r1 = f.s0.f2899a
            f.l0 r1 = new f.l0
            r1.<init>()
            r0.f5878e = r1
            s0.h r1 = s0.h.f12195j
            i0.e r2 = i0.e.f5868k
            i0.j1 r3 = new i0.j1
            r3.<init>(r1, r2)
            r0.f5879f = r3
            return
    }

    @Override // i0.o
    public final void a(i0.q r2, fg.p r3) {
            r1 = this;
            i0.h0 r0 = r1.f5880g
            i0.o r0 = r0.f5895b
            r0.a(r2, r3)
            return
    }

    @Override // i0.o
    public final f.l0 b(i0.q r2, i0.e2 r3, fg.p r4) {
            r1 = this;
            i0.h0 r0 = r1.f5880g
            i0.o r0 = r0.f5895b
            f.l0 r2 = r0.b(r2, r3, r4)
            return r2
    }

    @Override // i0.o
    public final void c() {
            r2 = this;
            i0.h0 r0 = r2.f5880g
            int r1 = r0.A
            int r1 = r1 + (-1)
            r0.A = r1
            return
    }

    @Override // i0.o
    public final boolean d() {
            r1 = this;
            i0.h0 r0 = r1.f5880g
            i0.o r0 = r0.f5895b
            boolean r0 = r0.d()
            return r0
    }

    @Override // i0.o
    public final boolean e() {
            r1 = this;
            boolean r0 = r1.f5875b
            return r0
    }

    @Override // i0.o
    public final boolean f() {
            r1 = this;
            boolean r0 = r1.f5876c
            return r0
    }

    @Override // i0.o
    public final long g() {
            r2 = this;
            long r0 = r2.f5874a
            return r0
    }

    @Override // i0.o
    public final i0.n h() {
            r1 = this;
            i0.h0 r0 = r1.f5880g
            i0.q r0 = r0.f5901h
            return r0
    }

    @Override // i0.o
    public final s0.h i() {
            r1 = this;
            i0.j1 r0 = r1.f5879f
            java.lang.Object r0 = r0.getValue()
            s0.h r0 = (s0.h) r0
            return r0
    }

    @Override // i0.o
    public final wf.g j() {
            r1 = this;
            i0.h0 r0 = r1.f5880g
            i0.o r0 = r0.f5895b
            wf.g r0 = r0.j()
            return r0
    }

    @Override // i0.o
    public final boolean k() {
            r1 = this;
            i0.h0 r0 = r1.f5880g
            i0.o r0 = r0.f5895b
            boolean r0 = r0.k()
            return r0
    }

    @Override // i0.o
    public final void l(i0.q r4) {
            r3 = this;
            i0.h0 r0 = r3.f5880g
            i0.o r1 = r0.f5895b
            i0.q r2 = r0.f5901h
            r1.l(r2)
            i0.o r0 = r0.f5895b
            r0.l(r4)
            return
    }

    @Override // i0.o
    public final i0.u0 m(i0.v0 r2) {
            r1 = this;
            i0.h0 r0 = r1.f5880g
            i0.o r0 = r0.f5895b
            i0.u0 r2 = r0.m(r2)
            return r2
    }

    @Override // i0.o
    public final f.l0 n(i0.q r2, i0.e2 r3, f.l0 r4) {
            r1 = this;
            i0.h0 r0 = r1.f5880g
            i0.o r0 = r0.f5895b
            f.l0 r2 = r0.n(r2, r3, r4)
            return r2
    }

    @Override // i0.o
    public final void o(java.util.Set r2) {
            r1 = this;
            java.util.HashSet r0 = r1.f5877d
            if (r0 != 0) goto Lb
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r1.f5877d = r0
        Lb:
            r0.add(r2)
            return
    }

    @Override // i0.o
    public final void p(i0.h0 r2) {
            r1 = this;
            f.l0 r0 = r1.f5878e
            r0.a(r2)
            return
    }

    @Override // i0.o
    public final void q(i0.r1 r2) {
            r1 = this;
            i0.h0 r0 = r1.f5880g
            i0.o r0 = r0.f5895b
            r0.q(r2)
            return
    }

    @Override // i0.o
    public final void r(i0.q r2) {
            r1 = this;
            i0.h0 r0 = r1.f5880g
            i0.o r0 = r0.f5895b
            r0.r(r2)
            return
    }

    @Override // i0.o
    public final i0.f s(d1.c0 r2) {
            r1 = this;
            i0.h0 r0 = r1.f5880g
            i0.o r0 = r0.f5895b
            i0.f r2 = r0.s(r2)
            return r2
    }

    @Override // i0.o
    public final void t() {
            r2 = this;
            i0.h0 r0 = r2.f5880g
            int r1 = r0.A
            int r1 = r1 + 1
            r0.A = r1
            return
    }

    @Override // i0.o
    public final void u(i0.h0 r4) {
            r3 = this;
            java.util.HashSet r0 = r3.f5877d
            if (r0 == 0) goto L1f
            java.util.Iterator r0 = r0.iterator()
        L8:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1f
            java.lang.Object r1 = r0.next()
            java.util.Set r1 = (java.util.Set) r1
            r4.getClass()
            x0.c r2 = r4.y()
            r1.remove(r2)
            goto L8
        L1f:
            if (r4 == 0) goto L26
            f.l0 r0 = r3.f5878e
            r0.l(r4)
        L26:
            return
    }

    @Override // i0.o
    public final void v(i0.q r2) {
            r1 = this;
            i0.h0 r0 = r1.f5880g
            i0.o r0 = r0.f5895b
            r0.v(r2)
            return
    }

    public final void w() {
            r17 = this;
            r0 = r17
            f.l0 r1 = r0.f5878e
            boolean r2 = r1.h()
            if (r2 == 0) goto L6a
            java.util.HashSet r2 = r0.f5877d
            if (r2 == 0) goto L67
            java.lang.Object[] r3 = r1.f2856b
            long[] r4 = r1.f2855a
            int r5 = r4.length
            int r5 = r5 + (-2)
            if (r5 < 0) goto L67
            r7 = 0
        L18:
            r8 = r4[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L62
            int r10 = r7 - r5
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = 0
        L32:
            if (r12 >= r10) goto L60
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L5c
            int r13 = r7 << 3
            int r13 = r13 + r12
            r13 = r3[r13]
            i0.h0 r13 = (i0.h0) r13
            java.util.Iterator r14 = r2.iterator()
        L48:
            boolean r15 = r14.hasNext()
            if (r15 == 0) goto L5c
            java.lang.Object r15 = r14.next()
            java.util.Set r15 = (java.util.Set) r15
            x0.c r6 = r13.y()
            r15.remove(r6)
            goto L48
        L5c:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L32
        L60:
            if (r10 != r11) goto L67
        L62:
            if (r7 == r5) goto L67
            int r7 = r7 + 1
            goto L18
        L67:
            r1.b()
        L6a:
            return
    }
}
