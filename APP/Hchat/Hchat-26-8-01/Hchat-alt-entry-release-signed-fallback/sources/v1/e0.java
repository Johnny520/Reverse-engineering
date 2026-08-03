package v1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class e0 implements v1.o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13924a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v1.o0 f13925b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ v1.j0 f13926c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f13927d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ v1.o0 f13928e;

    public /* synthetic */ e0(v1.o0 r1, v1.j0 r2, int r3, v1.o0 r4, int r5) {
            r0 = this;
            r0.f13924a = r5
            r0.f13926c = r2
            r0.f13927d = r3
            r0.f13928e = r4
            r0.f13925b = r1
            r0.<init>()
            return
    }

    @Override // v1.o0
    public final java.util.Map e() {
            r1 = this;
            int r0 = r1.f13924a
            switch(r0) {
                case 0: goto Lc;
                default: goto L5;
            }
        L5:
            v1.o0 r0 = r1.f13925b
            java.util.Map r0 = r0.e()
            return r0
        Lc:
            v1.o0 r0 = r1.f13925b
            java.util.Map r0 = r0.e()
            return r0
    }

    @Override // v1.o0
    public final void f() {
            r19 = this;
            r0 = r19
            int r1 = r0.f13924a
            switch(r1) {
                case 0: goto L1e;
                default: goto L7;
            }
        L7:
            int r1 = r0.f13927d
            v1.j0 r2 = r0.f13926c
            r2.f13958j = r1
            v1.o0 r1 = r0.f13928e
            r1.f()
            x1.f0 r1 = r2.f13955g
            x1.f0 r1 = r1.f20896n
            if (r1 != 0) goto L1d
            int r1 = r2.f13958j
            r2.g(r1)
        L1d:
            return
        L1e:
            int r1 = r0.f13927d
            v1.j0 r2 = r0.f13926c
            r2.f13959k = r1
            v1.o0 r1 = r0.f13928e
            r1.f()
            j0.b r1 = r2.f13967s
            f.k0 r3 = r2.f13966r
            long[] r4 = r3.f2848a
            int r5 = r4.length
            int r5 = r5 + (-2)
            if (r5 < 0) goto L9d
            r7 = 0
        L35:
            r8 = r4[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L98
            int r10 = r7 - r5
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = 0
        L4f:
            if (r12 >= r10) goto L95
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L8c
            int r13 = r7 << 3
            int r13 = r13 + r12
            java.lang.Object[] r14 = r3.f2849b
            r14 = r14[r13]
            java.lang.Object[] r15 = r3.f2850c
            r15 = r15[r13]
            v1.h1 r15 = (v1.h1) r15
            int r6 = r1.i(r14)
            r17 = r11
            if (r6 < 0) goto L73
            int r11 = r2.f13959k
            if (r6 < r11) goto L8e
        L73:
            if (r6 < 0) goto L7d
            java.lang.Object[] r11 = r1.f6671g
            r18 = r11[r6]
            java.lang.Object r18 = v1.w.f14051b
            r11[r6] = r18
        L7d:
            f.k0 r6 = r2.f13964p
            boolean r6 = r6.b(r14)
            if (r6 == 0) goto L88
            r15.a()
        L88:
            r3.l(r13)
            goto L8e
        L8c:
            r17 = r11
        L8e:
            long r8 = r8 >> r17
            int r12 = r12 + 1
            r11 = r17
            goto L4f
        L95:
            r6 = r11
            if (r10 != r6) goto L9d
        L98:
            if (r7 == r5) goto L9d
            int r7 = r7 + 1
            goto L35
        L9d:
            int r1 = r2.f13958j
            r2.g(r1)
            return
    }

    @Override // v1.o0
    public final int g() {
            r1 = this;
            int r0 = r1.f13924a
            switch(r0) {
                case 0: goto Lc;
                default: goto L5;
            }
        L5:
            v1.o0 r0 = r1.f13925b
            int r0 = r0.g()
            return r0
        Lc:
            v1.o0 r0 = r1.f13925b
            int r0 = r0.g()
            return r0
    }

    @Override // v1.o0
    public final int h() {
            r1 = this;
            int r0 = r1.f13924a
            switch(r0) {
                case 0: goto Lc;
                default: goto L5;
            }
        L5:
            v1.o0 r0 = r1.f13925b
            int r0 = r0.h()
            return r0
        Lc:
            v1.o0 r0 = r1.f13925b
            int r0 = r0.h()
            return r0
    }

    @Override // v1.o0
    public final fg.l i() {
            r1 = this;
            int r0 = r1.f13924a
            switch(r0) {
                case 0: goto Lc;
                default: goto L5;
            }
        L5:
            v1.o0 r0 = r1.f13925b
            fg.l r0 = r0.i()
            return r0
        Lc:
            v1.o0 r0 = r1.f13925b
            fg.l r0 = r0.i()
            return r0
    }
}
