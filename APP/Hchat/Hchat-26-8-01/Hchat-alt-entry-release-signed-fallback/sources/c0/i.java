package c0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends yf.i implements fg.p {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f948h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f949i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ long f950j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public java.lang.Object f951k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f952l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f953m;

    public i(c0.j r2, long r3, d0.e r5, c0.h r6, wf.c r7) {
            r1 = this;
            r0 = 0
            r1.f948h = r0
            r1.f951k = r2
            r1.f950j = r3
            r1.f952l = r5
            r1.f953m = r6
            r2 = 2
            r1.<init>(r2, r7)
            return
    }

    public /* synthetic */ i(java.lang.Object r1, long r2, java.lang.Object r4, wf.c r5, int r6) {
            r0 = this;
            r0.f948h = r6
            r0.f952l = r1
            r0.f950j = r2
            r0.f953m = r4
            r1 = 2
            r0.<init>(r1, r5)
            return
    }

    public /* synthetic */ i(java.lang.Object r1, java.lang.Object r2, long r3, wf.c r5, int r6) {
            r0 = this;
            r0.f948h = r6
            r0.f952l = r1
            r0.f953m = r2
            r0.f950j = r3
            r1 = 2
            r0.<init>(r1, r5)
            return
    }

    @Override // yf.a
    public final wf.c create(java.lang.Object r10, wf.c r11) {
            r9 = this;
            int r0 = r9.f948h
            switch(r0) {
                case 0: goto L6d;
                case 1: goto L59;
                case 2: goto L43;
                case 3: goto L2f;
                case 4: goto L19;
                default: goto L5;
            }
        L5:
            c0.i r1 = new c0.i
            java.lang.Object r10 = r9.f952l
            r2 = r10
            s.t r2 = (s.t) r2
            java.lang.Object r10 = r9.f953m
            r3 = r10
            i.y r3 = (i.y) r3
            long r4 = r9.f950j
            r7 = 5
            r6 = r11
            r1.<init>(r2, r3, r4, r6, r7)
            return r1
        L19:
            r7 = r11
            c0.i r2 = new c0.i
            java.lang.Object r11 = r9.f952l
            r3 = r11
            m.o2 r3 = (m.o2) r3
            java.lang.Object r11 = r9.f953m
            r6 = r11
            gg.r r6 = (gg.r) r6
            r8 = 4
            long r4 = r9.f950j
            r2.<init>(r3, r4, r6, r7, r8)
            r2.f951k = r10
            return r2
        L2f:
            r7 = r11
            c0.i r2 = new c0.i
            java.lang.Object r10 = r9.f952l
            r3 = r10
            qg.r0 r3 = (qg.r0) r3
            java.lang.Object r10 = r9.f953m
            r6 = r10
            n.k r6 = (n.k) r6
            r8 = 3
            long r4 = r9.f950j
            r2.<init>(r3, r4, r6, r7, r8)
            return r2
        L43:
            r7 = r11
            c0.i r2 = new c0.i
            java.lang.Object r11 = r9.f952l
            r3 = r11
            h0.p r3 = (h0.p) r3
            java.lang.Object r11 = r9.f953m
            r4 = r11
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            long r5 = r9.f950j
            r8 = 2
            r2.<init>(r3, r4, r5, r7, r8)
            r2.f951k = r10
            return r2
        L59:
            r7 = r11
            c0.i r2 = new c0.i
            java.lang.Object r10 = r9.f952l
            r3 = r10
            ci.l0 r3 = (ci.l0) r3
            java.lang.Object r10 = r9.f953m
            r6 = r10
            n.k r6 = (n.k) r6
            r8 = 1
            long r4 = r9.f950j
            r2.<init>(r3, r4, r6, r7, r8)
            return r2
        L6d:
            r7 = r11
            c0.i r2 = new c0.i
            java.lang.Object r10 = r9.f951k
            r3 = r10
            c0.j r3 = (c0.j) r3
            java.lang.Object r10 = r9.f952l
            r6 = r10
            d0.e r6 = (d0.e) r6
            java.lang.Object r10 = r9.f953m
            c0.h r10 = (c0.h) r10
            long r4 = r9.f950j
            r8 = r7
            r7 = r10
            r2.<init>(r3, r4, r6, r7, r8)
            return r2
    }

    @Override // fg.p
    public final java.lang.Object invoke(java.lang.Object r2, java.lang.Object r3) {
            r1 = this;
            int r0 = r1.f948h
            switch(r0) {
                case 0: goto L5a;
                case 1: goto L49;
                case 2: goto L38;
                case 3: goto L27;
                case 4: goto L16;
                default: goto L5;
            }
        L5:
            qg.t r2 = (qg.t) r2
            wf.c r3 = (wf.c) r3
            wf.c r2 = r1.create(r2, r3)
            c0.i r2 = (c0.i) r2
            sf.n r3 = sf.n.f12433a
            java.lang.Object r2 = r2.invokeSuspend(r3)
            return r2
        L16:
            m.m2 r2 = (m.m2) r2
            wf.c r3 = (wf.c) r3
            wf.c r2 = r1.create(r2, r3)
            c0.i r2 = (c0.i) r2
            sf.n r3 = sf.n.f12433a
            java.lang.Object r2 = r2.invokeSuspend(r3)
            return r2
        L27:
            qg.t r2 = (qg.t) r2
            wf.c r3 = (wf.c) r3
            wf.c r2 = r1.create(r2, r3)
            c0.i r2 = (c0.i) r2
            sf.n r3 = sf.n.f12433a
            java.lang.Object r2 = r2.invokeSuspend(r3)
            return r2
        L38:
            android.view.textclassifier.TextClassifier r2 = (android.view.textclassifier.TextClassifier) r2
            wf.c r3 = (wf.c) r3
            wf.c r2 = r1.create(r2, r3)
            c0.i r2 = (c0.i) r2
            sf.n r3 = sf.n.f12433a
            java.lang.Object r2 = r2.invokeSuspend(r3)
            return r2
        L49:
            qg.t r2 = (qg.t) r2
            wf.c r3 = (wf.c) r3
            wf.c r2 = r1.create(r2, r3)
            c0.i r2 = (c0.i) r2
            sf.n r3 = sf.n.f12433a
            java.lang.Object r2 = r2.invokeSuspend(r3)
            return r2
        L5a:
            qg.t r2 = (qg.t) r2
            wf.c r3 = (wf.c) r3
            wf.c r2 = r1.create(r2, r3)
            c0.i r2 = (c0.i) r2
            sf.n r3 = sf.n.f12433a
            java.lang.Object r2 = r2.invokeSuspend(r3)
            return r2
    }

    @Override // yf.a
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            r14 = this;
            int r0 = r14.f948h
            r1 = 3
            long r2 = r14.f950j
            r6 = 0
            r5 = 2
            sf.n r7 = sf.n.f12433a
            java.lang.Object r8 = r14.f953m
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            xf.a r10 = xf.a.f21579g
            java.lang.Object r11 = r14.f952l
            r12 = 1
            r13 = 0
            switch(r0) {
                case 0: goto L184;
                case 1: goto L154;
                case 2: goto L12a;
                case 3: goto Ld9;
                case 4: goto La6;
                default: goto L16;
            }
        L16:
            s.t r11 = (s.t) r11
            i.c r0 = r11.f12107m
            int r1 = r14.f949i
            if (r1 == 0) goto L35
            if (r1 == r12) goto L2d
            if (r1 != r5) goto L27
            f8.i.I0(r15)     // Catch: java.util.concurrent.CancellationException -> La5
            goto L9e
        L27:
            j8.o.A(r9)
            r7 = r13
            goto La5
        L2d:
            java.lang.Object r1 = r14.f951k
            i.y r1 = (i.y) r1
            f8.i.I0(r15)     // Catch: java.util.concurrent.CancellationException -> La5
            goto L70
        L35:
            f8.i.I0(r15)
            i0.j1 r1 = r0.f5605d     // Catch: java.util.concurrent.CancellationException -> La5
            java.lang.Object r1 = r1.getValue()     // Catch: java.util.concurrent.CancellationException -> La5
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.util.concurrent.CancellationException -> La5
            boolean r1 = r1.booleanValue()     // Catch: java.util.concurrent.CancellationException -> La5
            i.y r8 = (i.y) r8
            if (r1 == 0) goto L51
            boolean r1 = r8 instanceof i.r0     // Catch: java.util.concurrent.CancellationException -> La5
            if (r1 == 0) goto L4f
            i.r0 r8 = (i.r0) r8     // Catch: java.util.concurrent.CancellationException -> La5
            goto L51
        L4f:
            i.r0 r8 = s.u.f12113a     // Catch: java.util.concurrent.CancellationException -> La5
        L51:
            r1 = r8
            i0.j1 r8 = r0.f5605d     // Catch: java.util.concurrent.CancellationException -> La5
            java.lang.Object r8 = r8.getValue()     // Catch: java.util.concurrent.CancellationException -> La5
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.util.concurrent.CancellationException -> La5
            boolean r8 = r8.booleanValue()     // Catch: java.util.concurrent.CancellationException -> La5
            if (r8 != 0) goto L75
            u2.j r8 = new u2.j     // Catch: java.util.concurrent.CancellationException -> La5
            r8.<init>(r2)     // Catch: java.util.concurrent.CancellationException -> La5
            r14.f951k = r1     // Catch: java.util.concurrent.CancellationException -> La5
            r14.f949i = r12     // Catch: java.util.concurrent.CancellationException -> La5
            java.lang.Object r8 = r0.e(r8, r14)     // Catch: java.util.concurrent.CancellationException -> La5
            if (r8 != r10) goto L70
            goto L9c
        L70:
            i.e0 r8 = r11.f12097c     // Catch: java.util.concurrent.CancellationException -> La5
            r8.invoke()     // Catch: java.util.concurrent.CancellationException -> La5
        L75:
            java.lang.Object r0 = r0.d()     // Catch: java.util.concurrent.CancellationException -> La5
            u2.j r0 = (u2.j) r0     // Catch: java.util.concurrent.CancellationException -> La5
            long r8 = r0.f13347a     // Catch: java.util.concurrent.CancellationException -> La5
            long r2 = u2.j.c(r8, r2)     // Catch: java.util.concurrent.CancellationException -> La5
            i.c r0 = r11.f12107m     // Catch: java.util.concurrent.CancellationException -> La5
            r8 = r1
            u2.j r1 = new u2.j     // Catch: java.util.concurrent.CancellationException -> La5
            r1.<init>(r2)     // Catch: java.util.concurrent.CancellationException -> La5
            eb.s0 r9 = new eb.s0     // Catch: java.util.concurrent.CancellationException -> La5
            r9.<init>(r11, r2, r12)     // Catch: java.util.concurrent.CancellationException -> La5
            r14.f951k = r13     // Catch: java.util.concurrent.CancellationException -> La5
            r14.f949i = r5     // Catch: java.util.concurrent.CancellationException -> La5
            r5 = 4
            r4 = r14
            r2 = r8
            r3 = r9
            java.lang.Object r0 = i.c.c(r0, r1, r2, r3, r4, r5)     // Catch: java.util.concurrent.CancellationException -> La5
            if (r0 != r10) goto L9e
        L9c:
            r7 = r10
            goto La5
        L9e:
            int r0 = s.t.f12094r     // Catch: java.util.concurrent.CancellationException -> La5
            r11.d(r6)     // Catch: java.util.concurrent.CancellationException -> La5
            r11.f12099e = r6     // Catch: java.util.concurrent.CancellationException -> La5
        La5:
            return r7
        La6:
            m.o2 r11 = (m.o2) r11
            int r0 = r14.f949i
            if (r0 == 0) goto Lb7
            if (r0 != r12) goto Lb2
            f8.i.I0(r15)
            goto Ld8
        Lb2:
            j8.o.A(r9)
            r7 = r13
            goto Ld8
        Lb7:
            f8.i.I0(r15)
            java.lang.Object r0 = r14.f951k
            m.m2 r0 = (m.m2) r0
            float r2 = r11.g(r2)
            gg.r r8 = (gg.r) r8
            b0.k r3 = new b0.k
            r3.<init>(r8, r11, r0, r1)
            r14.f949i = r12
            r0 = 0
            r1 = r2
            r2 = 0
            r5 = 12
            r4 = r14
            java.lang.Object r0 = i.d.e(r0, r1, r2, r3, r4, r5)
            if (r0 != r10) goto Ld8
            r7 = r10
        Ld8:
            return r7
        Ld9:
            n.k r8 = (n.k) r8
            int r0 = r14.f949i
            if (r0 == 0) goto Lfa
            if (r0 == r12) goto Lf6
            if (r0 == r5) goto Lee
            if (r0 != r1) goto Le9
            f8.i.I0(r15)
            goto L129
        Le9:
            j8.o.A(r9)
            r7 = r13
            goto L129
        Lee:
            java.lang.Object r0 = r14.f951k
            n.n r0 = (n.n) r0
            f8.i.I0(r15)
            goto L11e
        Lf6:
            f8.i.I0(r15)
            goto L108
        Lfa:
            f8.i.I0(r15)
            qg.r0 r11 = (qg.r0) r11
            r14.f949i = r12
            java.lang.Object r0 = r11.g(r14)
            if (r0 != r10) goto L108
            goto L128
        L108:
            n.m r0 = new n.m
            r0.<init>()
            n.n r2 = new n.n
            r2.<init>(r0)
            r14.f951k = r2
            r14.f949i = r5
            java.lang.Object r0 = r8.a(r0, r14)
            if (r0 != r10) goto L11d
            goto L128
        L11d:
            r0 = r2
        L11e:
            r14.f951k = r13
            r14.f949i = r1
            java.lang.Object r0 = r8.a(r0, r14)
            if (r0 != r10) goto L129
        L128:
            r7 = r10
        L129:
            return r7
        L12a:
            int r0 = r14.f949i
            if (r0 == 0) goto L139
            if (r0 != r12) goto L134
            f8.i.I0(r15)
            goto L153
        L134:
            j8.o.A(r9)
            r7 = r13
            goto L153
        L139:
            f8.i.I0(r15)
            java.lang.Object r0 = r14.f951k
            android.view.textclassifier.TextClassifier r0 = (android.view.textclassifier.TextClassifier) r0
            h0.p r11 = (h0.p) r11
            r1 = r8
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r14.f949i = r12
            long r2 = r14.f950j
            r5 = r14
            r4 = r0
            r0 = r11
            java.lang.Object r0 = h0.p.a(r0, r1, r2, r4, r5)
            if (r0 != r10) goto L153
            r7 = r10
        L153:
            return r7
        L154:
            ci.l0 r11 = (ci.l0) r11
            int r0 = r14.f949i
            if (r0 == 0) goto L16b
            if (r0 == r12) goto L16b
            if (r0 != r5) goto L166
            java.lang.Object r0 = r14.f951k
            n.m r0 = (n.m) r0
            f8.i.I0(r15)
            goto L181
        L166:
            j8.o.A(r9)
            r7 = r13
            goto L183
        L16b:
            f8.i.I0(r15)
            n.m r0 = new n.m
            r0.<init>()
            n.k r8 = (n.k) r8
            r14.f951k = r0
            r14.f949i = r5
            java.lang.Object r1 = r8.a(r0, r14)
            if (r1 != r10) goto L181
            r7 = r10
            goto L183
        L181:
            r11.B = r0
        L183:
            return r7
        L184:
            int r0 = r14.f949i
            if (r0 == 0) goto L199
            if (r0 == r12) goto L195
            if (r0 != r5) goto L190
            f8.i.I0(r15)
            goto L1c1
        L190:
            j8.o.A(r9)
            r7 = r13
            goto L1c1
        L195:
            f8.i.I0(r15)
            goto L1b4
        L199:
            f8.i.I0(r15)
            java.lang.Object r0 = r14.f951k
            c0.j r0 = (c0.j) r0
            h0.u0 r0 = r0.f954w
            if (r0 == 0) goto L1b4
            r14.f949i = r12
            h0.u0 r1 = new h0.u0
            h0.d1 r0 = r0.f5001j
            r1.<init>(r0, r14, r6)
            java.lang.Object r0 = r1.invokeSuspend(r7)
            if (r0 != r10) goto L1b4
            goto L1c0
        L1b4:
            d0.e r11 = (d0.e) r11
            c0.h r8 = (c0.h) r8
            r14.f949i = r5
            java.lang.Object r0 = r11.a(r8, r14)
            if (r0 != r10) goto L1c1
        L1c0:
            r7 = r10
        L1c1:
            return r7
    }
}
