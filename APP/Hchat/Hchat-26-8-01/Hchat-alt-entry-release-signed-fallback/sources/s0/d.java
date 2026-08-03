package s0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements fg.p, fg.q, fg.r, fg.s, fg.t, fg.u, fg.v, fg.w, fg.b, fg.c, fg.e, fg.f, fg.g, fg.h, fg.i, fg.j, fg.k, fg.m, fg.n {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f12181g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f12182h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public sf.b f12183i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public i0.r1 f12184j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public java.util.ArrayList f12185k;

    public d(int r1, sf.b r2, boolean r3) {
            r0 = this;
            r0.<init>()
            r0.f12181g = r1
            r0.f12182h = r3
            r0.f12183i = r2
            return
    }

    @Override // fg.v
    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object r9, java.lang.Boolean r10, java.lang.Object r11, java.lang.Object r12, java.lang.Object r13, i0.h0 r14, java.lang.Integer r15) {
            r8 = this;
            int r7 = r15.intValue()
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            java.lang.Object r9 = r0.h(r1, r2, r3, r4, r5, r6, r7)
            return r9
    }

    @Override // fg.q
    public final /* bridge */ /* synthetic */ java.lang.Object b(java.lang.Object r1, java.lang.Object r2, java.lang.Object r3) {
            r0 = this;
            i0.h0 r2 = (i0.h0) r2
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            java.lang.Object r1 = r0.g(r1, r2, r3)
            return r1
    }

    @Override // fg.r
    public final /* bridge */ /* synthetic */ java.lang.Object c(java.lang.Object r1, java.lang.Object r2, java.lang.Object r3, java.lang.Object r4) {
            r0 = this;
            i0.h0 r3 = (i0.h0) r3
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            java.lang.Object r1 = r0.i(r1, r2, r3, r4)
            return r1
    }

    @Override // fg.s
    public final /* bridge */ /* synthetic */ java.lang.Object d(java.lang.Object r7, java.lang.Object r8, java.lang.Object r9, java.lang.Object r10, java.lang.Object r11) {
            r6 = this;
            r4 = r10
            i0.h0 r4 = (i0.h0) r4
            java.lang.Number r11 = (java.lang.Number) r11
            int r5 = r11.intValue()
            r1 = r7
            d0.b r1 = (d0.b) r1
            r0 = r6
            r2 = r8
            r3 = r9
            java.lang.Object r7 = r0.e(r1, r2, r3, r4, r5)
            return r7
    }

    public final java.lang.Object e(d0.b r10, java.lang.Object r11, java.lang.Object r12, i0.h0 r13, int r14) {
            r9 = this;
            int r0 = r9.f12181g
            r13.b0(r0)
            r9.j(r13)
            boolean r0 = r13.f(r9)
            r1 = 3
            if (r0 == 0) goto L15
            r0 = 2
            int r0 = s0.i.a(r0, r1)
            goto L1a
        L15:
            r0 = 1
            int r0 = s0.i.a(r0, r1)
        L1a:
            r0 = r0 | r14
            sf.b r1 = r9.f12183i
            r2 = 5
            gg.x.c(r2, r1)
            r3 = r1
            fg.s r3 = (fg.s) r3
            java.lang.Integer r8 = java.lang.Integer.valueOf(r0)
            r4 = r10
            r5 = r11
            r6 = r12
            r7 = r13
            java.lang.Object r10 = r3.d(r4, r5, r6, r7, r8)
            r2 = r4
            r3 = r5
            r4 = r6
            i0.r1 r11 = r7.t()
            if (r11 == 0) goto L43
            s0.c r0 = new s0.c
            r6 = 0
            r1 = r9
            r5 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r11.f6035d = r0
        L43:
            return r10
    }

    public final java.lang.Object f(i0.h0 r9, int r10) {
            r8 = this;
            int r0 = r8.f12181g
            r9.b0(r0)
            r8.j(r9)
            boolean r0 = r9.f(r8)
            r1 = 2
            r2 = 0
            if (r0 == 0) goto L15
            int r0 = s0.i.a(r1, r2)
            goto L1a
        L15:
            r0 = 1
            int r0 = s0.i.a(r0, r2)
        L1a:
            r10 = r10 | r0
            sf.b r0 = r8.f12183i
            gg.x.c(r1, r0)
            fg.p r0 = (fg.p) r0
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            java.lang.Object r10 = r0.invoke(r9, r10)
            i0.r1 r9 = r9.t()
            if (r9 == 0) goto L42
            m.d2 r0 = new m.d2
            r6 = 8
            r7 = 2
            r1 = 2
            java.lang.Class<s0.d> r3 = s0.d.class
            java.lang.String r4 = "invoke"
            java.lang.String r5 = "invoke(Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;"
            r2 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r9.f6035d = r0
        L42:
            return r10
    }

    public final java.lang.Object g(java.lang.Object r4, i0.h0 r5, int r6) {
            r3 = this;
            int r0 = r3.f12181g
            r5.b0(r0)
            r3.j(r5)
            boolean r0 = r5.f(r3)
            r1 = 1
            if (r0 == 0) goto L15
            r0 = 2
            int r0 = s0.i.a(r0, r1)
            goto L19
        L15:
            int r0 = s0.i.a(r1, r1)
        L19:
            r0 = r0 | r6
            sf.b r1 = r3.f12183i
            r2 = 3
            gg.x.c(r2, r1)
            fg.q r1 = (fg.q) r1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object r0 = r1.b(r4, r5, r0)
            i0.r1 r5 = r5.t()
            if (r5 == 0) goto L38
            i.b1 r1 = new i.b1
            r2 = 3
            r1.<init>(r3, r4, r6, r2)
            r5.f6035d = r1
        L38:
            return r0
    }

    public final java.lang.Object h(java.lang.Object r11, java.lang.Boolean r12, java.lang.Object r13, java.lang.Object r14, java.lang.Object r15, i0.h0 r16, int r17) {
            r10 = this;
            r6 = r16
            int r0 = r10.f12181g
            r6.b0(r0)
            r10.j(r6)
            boolean r0 = r6.f(r10)
            r1 = 6
            if (r0 == 0) goto L17
            r0 = 2
            int r0 = s0.i.a(r0, r1)
            goto L1c
        L17:
            r0 = 1
            int r0 = s0.i.a(r0, r1)
        L1c:
            r0 = r17 | r0
            sf.b r1 = r10.f12183i
            r2 = 8
            gg.x.c(r2, r1)
            fg.v r1 = (fg.v) r1
            java.lang.Integer r7 = java.lang.Integer.valueOf(r0)
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r0 = r1
            r1 = r11
            java.lang.Object r0 = r0.a(r1, r2, r3, r4, r5, r6, r7)
            i0.r1 r9 = r16.t()
            if (r9 == 0) goto L4a
            c9.t0 r1 = new c9.t0
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            r7 = r15
            r8 = r17
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            r9.f6035d = r1
        L4a:
            return r0
    }

    public final java.lang.Object i(java.lang.Object r8, java.lang.Object r9, i0.h0 r10, int r11) {
            r7 = this;
            int r0 = r7.f12181g
            r10.b0(r0)
            r7.j(r10)
            boolean r0 = r10.f(r7)
            r1 = 2
            if (r0 == 0) goto L14
            int r0 = s0.i.a(r1, r1)
            goto L19
        L14:
            r0 = 1
            int r0 = s0.i.a(r0, r1)
        L19:
            r0 = r0 | r11
            sf.b r1 = r7.f12183i
            r2 = 4
            gg.x.c(r2, r1)
            fg.r r1 = (fg.r) r1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object r0 = r1.c(r8, r9, r10, r0)
            i0.r1 r10 = r10.t()
            if (r10 == 0) goto L3d
            b0.r r1 = new b0.r
            r6 = 8
            r2 = r7
            r3 = r8
            r4 = r9
            r5 = r11
            r1.<init>(r2, r3, r4, r5, r6)
            r10.f6035d = r1
        L3d:
            return r0
    }

    @Override // fg.p
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            i0.h0 r1 = (i0.h0) r1
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            java.lang.Object r1 = r0.f(r1, r2)
            return r1
    }

    public final void j(i0.h0 r5) {
            r4 = this;
            boolean r0 = r4.f12182h
            if (r0 == 0) goto L4a
            i0.r1 r0 = r5.A()
            if (r0 == 0) goto L4a
            r5.getClass()
            int r5 = r0.f6033b
            r5 = r5 | 1
            r0.f6033b = r5
            i0.r1 r5 = r4.f12184j
            boolean r5 = s0.i.f(r5, r0)
            if (r5 == 0) goto L1e
            r4.f12184j = r0
            return
        L1e:
            java.util.ArrayList r5 = r4.f12185k
            if (r5 != 0) goto L2d
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r4.f12185k = r5
            r5.add(r0)
            return
        L2d:
            int r1 = r5.size()
            r2 = 0
        L32:
            if (r2 >= r1) goto L47
            java.lang.Object r3 = r5.get(r2)
            i0.r1 r3 = (i0.r1) r3
            boolean r3 = s0.i.f(r3, r0)
            if (r3 == 0) goto L44
            r5.set(r2, r0)
            return
        L44:
            int r2 = r2 + 1
            goto L32
        L47:
            r5.add(r0)
        L4a:
            return
    }
}
