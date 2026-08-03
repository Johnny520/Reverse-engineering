package sg;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements qg.o1 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public java.lang.Object f12440g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public qg.g f12441h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ sg.c f12442i;

    public b(sg.c r1) {
            r0 = this;
            r0.<init>()
            r0.f12442i = r1
            l3.q r1 = sg.e.f12469p
            r0.f12440g = r1
            return
    }

    @Override // qg.o1
    public final void a(vg.q r2, int r3) {
            r1 = this;
            qg.g r0 = r1.f12441h
            if (r0 == 0) goto L7
            r0.a(r2, r3)
        L7:
            return
    }

    public final java.lang.Object b(yf.c r17) {
            r16 = this;
            r5 = r16
            java.lang.Object r0 = r5.f12440g
            l3.q r1 = sg.e.f12469p
            r6 = 1
            if (r0 == r1) goto Lf
            l3.q r1 = sg.e.f12465l
            if (r0 == r1) goto Lf
            goto L138
        Lf:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = sg.c.f12448m
            sg.c r7 = r5.f12442i
            java.lang.Object r0 = r0.get(r7)
            sg.k r0 = (sg.k) r0
        L19:
            r7.getClass()
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = sg.c.f12443h
            long r1 = r1.get(r7)
            boolean r1 = r7.t(r1, r6)
            if (r1 == 0) goto L38
            l3.q r0 = sg.e.f12465l
            r5.f12440g = r0
            java.lang.Throwable r0 = r7.m()
            if (r0 != 0) goto L35
            r6 = 0
            goto L138
        L35:
            int r1 = vg.r.f14358a
            throw r0
        L38:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = sg.c.f12444i
            long r3 = r1.getAndIncrement(r7)
            int r1 = sg.e.f12455b
            long r1 = (long) r1
            long r8 = r3 / r1
            long r1 = r3 % r1
            int r2 = (int) r1
            long r10 = r0.f14357c
            int r1 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r1 == 0) goto L53
            sg.k r1 = r7.l(r8, r0)
            if (r1 != 0) goto L54
            goto L19
        L53:
            r1 = r0
        L54:
            r12 = 0
            r8 = r1
            r9 = r2
            r10 = r3
            java.lang.Object r0 = r7.C(r8, r9, r10, r12)
            l3.q r8 = sg.e.f12466m
            r9 = 0
            if (r0 == r8) goto L13d
            l3.q r10 = sg.e.f12468o
            if (r0 != r10) goto L72
            long r8 = r7.r()
            int r0 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r0 >= 0) goto L70
            r1.a()
        L70:
            r0 = r1
            goto L19
        L72:
            l3.q r11 = sg.e.f12467n
            if (r0 != r11) goto L133
            sg.c r0 = r5.f12442i
            wf.c r11 = fb.v0.x(r17)
            qg.g r11 = qg.v.l(r11)
            r5.f12441h = r11     // Catch: java.lang.Throwable -> L8d
            java.lang.Object r12 = r0.C(r1, r2, r3, r5)     // Catch: java.lang.Throwable -> L8d
            if (r12 != r8) goto L90
            r5.a(r1, r2)     // Catch: java.lang.Throwable -> L8d
            goto L12a
        L8d:
            r0 = move-exception
            goto L12f
        L90:
            if (r12 != r10) goto L11f
            long r12 = r0.r()     // Catch: java.lang.Throwable -> L8d
            int r2 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            if (r2 >= 0) goto L9d
            r1.a()     // Catch: java.lang.Throwable -> L8d
        L9d:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = sg.c.f12448m     // Catch: java.lang.Throwable -> L8d
            java.lang.Object r1 = r1.get(r0)     // Catch: java.lang.Throwable -> L8d
            sg.k r1 = (sg.k) r1     // Catch: java.lang.Throwable -> L8d
        La5:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = sg.c.f12443h     // Catch: java.lang.Throwable -> L8d
            long r2 = r2.get(r0)     // Catch: java.lang.Throwable -> L8d
            boolean r2 = r0.t(r2, r6)     // Catch: java.lang.Throwable -> L8d
            if (r2 == 0) goto Ld1
            qg.g r0 = r5.f12441h     // Catch: java.lang.Throwable -> L8d
            r0.getClass()     // Catch: java.lang.Throwable -> L8d
            r5.f12441h = r9     // Catch: java.lang.Throwable -> L8d
            l3.q r1 = sg.e.f12465l     // Catch: java.lang.Throwable -> L8d
            r5.f12440g = r1     // Catch: java.lang.Throwable -> L8d
            java.lang.Throwable r1 = r7.m()     // Catch: java.lang.Throwable -> L8d
            if (r1 != 0) goto Lc8
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L8d
            r0.resumeWith(r1)     // Catch: java.lang.Throwable -> L8d
            goto L12a
        Lc8:
            sf.f r2 = new sf.f     // Catch: java.lang.Throwable -> L8d
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L8d
            r0.resumeWith(r2)     // Catch: java.lang.Throwable -> L8d
            goto L12a
        Ld1:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = sg.c.f12444i     // Catch: java.lang.Throwable -> L8d
            long r3 = r2.getAndIncrement(r0)     // Catch: java.lang.Throwable -> L8d
            int r2 = sg.e.f12455b     // Catch: java.lang.Throwable -> L8d
            long r12 = (long) r2     // Catch: java.lang.Throwable -> L8d
            long r14 = r3 / r12
            long r12 = r3 % r12
            int r2 = (int) r12     // Catch: java.lang.Throwable -> L8d
            long r12 = r1.f14357c     // Catch: java.lang.Throwable -> L8d
            int r8 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r8 == 0) goto Led
            sg.k r8 = r0.l(r14, r1)     // Catch: java.lang.Throwable -> L8d
            if (r8 != 0) goto Lec
            goto La5
        Lec:
            r1 = r8
        Led:
            java.lang.Object r8 = r0.C(r1, r2, r3, r5)     // Catch: java.lang.Throwable -> L8d
            l3.q r10 = sg.e.f12466m     // Catch: java.lang.Throwable -> L8d
            if (r8 != r10) goto Lf9
            r5.a(r1, r2)     // Catch: java.lang.Throwable -> L8d
            goto L12a
        Lf9:
            l3.q r2 = sg.e.f12468o     // Catch: java.lang.Throwable -> L8d
            if (r8 != r2) goto L109
            long r12 = r0.r()     // Catch: java.lang.Throwable -> L8d
            int r2 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            if (r2 >= 0) goto La5
            r1.a()     // Catch: java.lang.Throwable -> L8d
            goto La5
        L109:
            l3.q r0 = sg.e.f12467n     // Catch: java.lang.Throwable -> L8d
            if (r8 == r0) goto L117
            r1.a()     // Catch: java.lang.Throwable -> L8d
            r5.f12440g = r8     // Catch: java.lang.Throwable -> L8d
            r5.f12441h = r9     // Catch: java.lang.Throwable -> L8d
        L114:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L8d
            goto L127
        L117:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L8d
            java.lang.String r1 = "unexpected"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L8d
            throw r0     // Catch: java.lang.Throwable -> L8d
        L11f:
            r1.a()     // Catch: java.lang.Throwable -> L8d
            r5.f12440g = r12     // Catch: java.lang.Throwable -> L8d
            r5.f12441h = r9     // Catch: java.lang.Throwable -> L8d
            goto L114
        L127:
            r11.y(r0, r9)     // Catch: java.lang.Throwable -> L8d
        L12a:
            java.lang.Object r0 = r11.o()
            return r0
        L12f:
            r11.x()
            throw r0
        L133:
            r1.a()
            r5.f12440g = r0
        L138:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r6)
            return r0
        L13d:
            java.lang.String r0 = "unreachable"
            j8.o.A(r0)
            return r9
    }

    public final java.lang.Object c() {
            r2 = this;
            java.lang.Object r0 = r2.f12440g
            l3.q r1 = sg.e.f12469p
            if (r0 == r1) goto L16
            r2.f12440g = r1
            l3.q r1 = sg.e.f12465l
            if (r0 == r1) goto Ld
            return r0
        Ld:
            sg.c r0 = r2.f12442i
            java.lang.Throwable r0 = r0.n()
            int r1 = vg.r.f14358a
            throw r0
        L16:
            java.lang.String r0 = "`hasNext()` has not been invoked"
            j8.o.A(r0)
            r0 = 0
            return r0
    }
}
