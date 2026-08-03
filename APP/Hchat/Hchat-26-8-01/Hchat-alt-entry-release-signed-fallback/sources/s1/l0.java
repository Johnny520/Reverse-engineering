package s1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class l0 extends y0.n implements s1.x, u2.c, x1.w1 {
    public final j0.b A;
    public final j0.b B;
    public final j0.b C;
    public s1.k D;
    public long E;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public java.lang.Object f12278u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public java.lang.Object f12279v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public java.lang.Object[] f12280w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public androidx.compose.ui.input.pointer.PointerInputEventHandler f12281x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public qg.e1 f12282y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public s1.k f12283z;

    public l0(java.lang.Object r1, java.lang.Object r2, java.lang.Object[] r3, androidx.compose.ui.input.pointer.PointerInputEventHandler r4) {
            r0 = this;
            r0.<init>()
            r0.f12278u = r1
            r0.f12279v = r2
            r0.f12280w = r3
            r0.f12281x = r4
            s1.k r1 = s1.h0.f12244a
            r0.f12283z = r1
            j0.b r1 = new j0.b
            r2 = 16
            s1.k0[] r3 = new s1.k0[r2]
            r1.<init>(r3)
            r0.A = r1
            r0.B = r1
            j0.b r1 = new j0.b
            s1.k0[] r2 = new s1.k0[r2]
            r1.<init>(r2)
            r0.C = r1
            r1 = 0
            r0.E = r1
            return
    }

    @Override // x1.w1
    public final void N0() {
            r0 = this;
            r0.m1()
            return
    }

    @Override // x1.w1
    public final void P(s1.k r3, s1.l r4, long r5) {
            r2 = this;
            r2.E = r5
            s1.l r5 = s1.l.f12274g
            if (r4 != r5) goto L8
            r2.f12283z = r3
        L8:
            qg.e1 r5 = r2.f12282y
            r6 = 0
            if (r5 != 0) goto L1f
            qg.t r5 = r2.Y0()
            ci.c r0 = new ci.c
            r1 = 10
            r0.<init>(r2, r6, r1)
            r1 = 1
            qg.e1 r5 = qg.v.q(r5, r6, r0, r1)
            r2.f12282y = r5
        L1f:
            r2.l1(r3, r4)
            java.lang.Object r4 = r3.f12262a
            int r5 = r4.size()
            r0 = 0
        L29:
            if (r0 >= r5) goto L3b
            java.lang.Object r1 = r4.get(r0)
            s1.t r1 = (s1.t) r1
            boolean r1 = s1.s.d(r1)
            if (r1 != 0) goto L38
            goto L3c
        L38:
            int r0 = r0 + 1
            goto L29
        L3b:
            r3 = r6
        L3c:
            r2.D = r3
            return
    }

    @Override // x1.w1
    public final void b0() {
            r27 = this;
            r0 = r27
            s1.k r1 = r0.D
            if (r1 != 0) goto L7
            goto L74
        L7:
            java.lang.Object r1 = r1.f12262a
            int r2 = r1.size()
            r3 = 0
            r4 = r3
        Lf:
            if (r4 >= r2) goto L74
            java.lang.Object r5 = r1.get(r4)
            s1.t r5 = (s1.t) r5
            boolean r5 = r5.f12294d
            if (r5 == 0) goto L71
            java.util.ArrayList r2 = new java.util.ArrayList
            int r4 = r1.size()
            r2.<init>(r4)
            int r4 = r1.size()
        L28:
            if (r3 >= r4) goto L57
            java.lang.Object r5 = r1.get(r3)
            s1.t r5 = (s1.t) r5
            long r7 = r5.f12291a
            long r11 = r5.f12293c
            long r9 = r5.f12292b
            float r14 = r5.f12295e
            boolean r6 = r5.f12294d
            int r5 = r5.f12299i
            r19 = r6
            s1.t r6 = new s1.t
            r24 = 1065353216(0x3f800000, float:1.0)
            r25 = 0
            r13 = 0
            r22 = 0
            r15 = r9
            r17 = r11
            r20 = r19
            r21 = r5
            r6.<init>(r7, r9, r11, r13, r14, r15, r17, r19, r20, r21, r22, r24, r25)
            r2.add(r6)
            int r3 = r3 + 1
            goto L28
        L57:
            s1.k r1 = new s1.k
            r3 = 0
            r1.<init>(r2, r3)
            r0.f12283z = r1
            s1.l r2 = s1.l.f12274g
            r0.l1(r1, r2)
            s1.l r2 = s1.l.f12275h
            r0.l1(r1, r2)
            s1.l r2 = s1.l.f12276i
            r0.l1(r1, r2)
            r0.D = r3
            return
        L71:
            int r4 = r4 + 1
            goto Lf
        L74:
            return
    }

    @Override // u2.c
    public final float d() {
            r1 = this;
            x1.f0 r0 = x1.k.w(r1)
            u2.c r0 = r0.E
            float r0 = r0.d()
            return r0
    }

    @Override // y0.n
    public final void d1() {
            r0 = this;
            r0.m1()
            return
    }

    public final java.lang.Object k1(fg.p r4, wf.c r5) {
            r3 = this;
            qg.g r0 = new qg.g
            wf.c r5 = fb.v0.x(r5)
            r1 = 1
            r0.<init>(r1, r5)
            r0.p()
            s1.k0 r5 = new s1.k0
            r5.<init>(r3, r0)
            j0.b r1 = r3.B
            monitor-enter(r1)
            j0.b r2 = r3.A     // Catch: java.lang.Throwable -> L3c
            r2.b(r5)     // Catch: java.lang.Throwable -> L3c
            wf.i r2 = new wf.i     // Catch: java.lang.Throwable -> L3c
            wf.c r4 = fb.v0.j(r4, r5, r5)     // Catch: java.lang.Throwable -> L3c
            wf.c r4 = fb.v0.x(r4)     // Catch: java.lang.Throwable -> L3c
            r2.<init>(r4)     // Catch: java.lang.Throwable -> L3c
            sf.n r4 = sf.n.f12433a     // Catch: java.lang.Throwable -> L3c
            r2.resumeWith(r4)     // Catch: java.lang.Throwable -> L3c
            monitor-exit(r1)
            b1.f r4 = new b1.f
            r1 = 15
            r4.<init>(r5, r1)
            r0.r(r4)
            java.lang.Object r4 = r0.o()
            return r4
        L3c:
            r4 = move-exception
            monitor-exit(r1)
            throw r4
    }

    public final void l1(s1.k r7, s1.l r8) {
            r6 = this;
            j0.b r0 = r6.B
            monitor-enter(r0)
            j0.b r1 = r6.C     // Catch: java.lang.Throwable -> L6c
            j0.b r2 = r6.A     // Catch: java.lang.Throwable -> L6c
            int r3 = r1.f6673i     // Catch: java.lang.Throwable -> L6c
            r1.c(r3, r2)     // Catch: java.lang.Throwable -> L6c
            monitor-exit(r0)
            int r0 = r8.ordinal()     // Catch: java.lang.Throwable -> L21
            r1 = 0
            if (r0 == 0) goto L43
            r2 = 1
            if (r0 == r2) goto L23
            r2 = 2
            if (r0 != r2) goto L1b
            goto L43
        L1b:
            af.d r7 = new af.d     // Catch: java.lang.Throwable -> L21
            r7.<init>()     // Catch: java.lang.Throwable -> L21
            throw r7     // Catch: java.lang.Throwable -> L21
        L21:
            r7 = move-exception
            goto L66
        L23:
            j0.b r0 = r6.C     // Catch: java.lang.Throwable -> L21
            int r3 = r0.f6673i     // Catch: java.lang.Throwable -> L21
            int r3 = r3 - r2
            java.lang.Object[] r0 = r0.f6671g     // Catch: java.lang.Throwable -> L21
            int r2 = r0.length     // Catch: java.lang.Throwable -> L21
            if (r3 >= r2) goto L60
        L2d:
            if (r3 < 0) goto L60
            r2 = r0[r3]     // Catch: java.lang.Throwable -> L21
            s1.k0 r2 = (s1.k0) r2     // Catch: java.lang.Throwable -> L21
            s1.l r4 = r2.f12271j     // Catch: java.lang.Throwable -> L21
            if (r8 != r4) goto L40
            qg.g r4 = r2.f12270i     // Catch: java.lang.Throwable -> L21
            if (r4 == 0) goto L40
            r2.f12270i = r1     // Catch: java.lang.Throwable -> L21
            r4.resumeWith(r7)     // Catch: java.lang.Throwable -> L21
        L40:
            int r3 = r3 + (-1)
            goto L2d
        L43:
            j0.b r0 = r6.C     // Catch: java.lang.Throwable -> L21
            java.lang.Object[] r2 = r0.f6671g     // Catch: java.lang.Throwable -> L21
            int r0 = r0.f6673i     // Catch: java.lang.Throwable -> L21
            r3 = 0
        L4a:
            if (r3 >= r0) goto L60
            r4 = r2[r3]     // Catch: java.lang.Throwable -> L21
            s1.k0 r4 = (s1.k0) r4     // Catch: java.lang.Throwable -> L21
            s1.l r5 = r4.f12271j     // Catch: java.lang.Throwable -> L21
            if (r8 != r5) goto L5d
            qg.g r5 = r4.f12270i     // Catch: java.lang.Throwable -> L21
            if (r5 == 0) goto L5d
            r4.f12270i = r1     // Catch: java.lang.Throwable -> L21
            r5.resumeWith(r7)     // Catch: java.lang.Throwable -> L21
        L5d:
            int r3 = r3 + 1
            goto L4a
        L60:
            j0.b r7 = r6.C
            r7.g()
            return
        L66:
            j0.b r8 = r6.C
            r8.g()
            throw r7
        L6c:
            r7 = move-exception
            monitor-exit(r0)
            throw r7
    }

    @Override // x1.i
    public final void m() {
            r0 = this;
            r0.m1()
            return
    }

    public final void m1() {
            r4 = this;
            qg.e1 r0 = r4.f12282y
            if (r0 == 0) goto L12
            s1.w r1 = new s1.w
            java.lang.String r2 = "Pointer input was reset"
            r3 = 2
            r1.<init>(r2, r3)
            r0.x(r1)
            r0 = 0
            r4.f12282y = r0
        L12:
            return
    }

    @Override // u2.c
    public final float q0() {
            r1 = this;
            x1.f0 r0 = x1.k.w(r1)
            u2.c r0 = r0.E
            float r0 = r0.q0()
            return r0
    }
}
