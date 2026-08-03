package ci;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class o extends yf.i implements fg.p {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f1763h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public gg.t f1764i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f1765j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f1766k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f1767l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ float f1768m;

    public /* synthetic */ o(java.lang.Object r1, float r2, wf.c r3, int r4) {
            r0 = this;
            r0.f1763h = r4
            r0.f1767l = r1
            r0.f1768m = r2
            r1 = 2
            r0.<init>(r1, r3)
            return
    }

    @Override // yf.a
    public final wf.c create(java.lang.Object r5, wf.c r6) {
            r4 = this;
            int r0 = r4.f1763h
            switch(r0) {
                case 0: goto L23;
                case 1: goto L14;
                default: goto L5;
            }
        L5:
            ci.o r0 = new ci.o
            java.lang.Object r1 = r4.f1767l
            ci.e0 r1 = (ci.e0) r1
            float r2 = r4.f1768m
            r3 = 2
            r0.<init>(r1, r2, r6, r3)
            r0.f1766k = r5
            return r0
        L14:
            ci.o r0 = new ci.o
            java.lang.Object r1 = r4.f1767l
            ci.p r1 = (ci.p) r1
            float r2 = r4.f1768m
            r3 = 1
            r0.<init>(r1, r2, r6, r3)
            r0.f1766k = r5
            return r0
        L23:
            ci.o r0 = new ci.o
            java.lang.Object r1 = r4.f1767l
            ci.p r1 = (ci.p) r1
            float r2 = r4.f1768m
            r3 = 0
            r0.<init>(r1, r2, r6, r3)
            r0.f1766k = r5
            return r0
    }

    @Override // fg.p
    public final java.lang.Object invoke(java.lang.Object r2, java.lang.Object r3) {
            r1 = this;
            int r0 = r1.f1763h
            qg.t r2 = (qg.t) r2
            wf.c r3 = (wf.c) r3
            switch(r0) {
                case 0: goto L23;
                case 1: goto L16;
                default: goto L9;
            }
        L9:
            wf.c r2 = r1.create(r2, r3)
            ci.o r2 = (ci.o) r2
            sf.n r3 = sf.n.f12433a
            java.lang.Object r2 = r2.invokeSuspend(r3)
            return r2
        L16:
            wf.c r2 = r1.create(r2, r3)
            ci.o r2 = (ci.o) r2
            sf.n r3 = sf.n.f12433a
            java.lang.Object r2 = r2.invokeSuspend(r3)
            return r2
        L23:
            wf.c r2 = r1.create(r2, r3)
            ci.o r2 = (ci.o) r2
            sf.n r3 = sf.n.f12433a
            java.lang.Object r2 = r2.invokeSuspend(r3)
            return r2
    }

    @Override // yf.a
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            r9 = this;
            int r0 = r9.f1763h
            switch(r0) {
                case 0: goto L11b;
                case 1: goto L8e;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r9.f1767l
            ci.e0 r0 = (ci.e0) r0
            float r1 = r0.B
            java.lang.Object r2 = r9.f1766k
            qg.t r2 = (qg.t) r2
            int r3 = r9.f1765j
            r4 = 1
            if (r3 == 0) goto L26
            if (r3 != r4) goto L1e
            gg.t r3 = r9.f1764i
            f8.i.I0(r10)     // Catch: java.lang.Throwable -> L1c
            goto L66
        L1c:
            r10 = move-exception
            goto L70
        L1e:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            j8.o.A(r10)
            r10 = 0
            goto L8d
        L26:
            f8.i.I0(r10)
            ci.p0 r10 = r0.f1698z
            float r3 = r0.C
            float r5 = r9.f1768m
            r10.a(r3, r5)
            gg.t r10 = new gg.t
            r10.<init>()
            r5 = -1
            r10.f4563g = r5
            r3 = 0
        L3c:
            if (r3 != 0) goto L7e
            boolean r3 = qg.v.o(r2)     // Catch: java.lang.Throwable -> L1c
            if (r3 == 0) goto L7e
            c9.i r3 = new c9.i     // Catch: java.lang.Throwable -> L1c
            r5 = 9
            r3.<init>(r10, r5, r0)     // Catch: java.lang.Throwable -> L1c
            r9.f1766k = r2     // Catch: java.lang.Throwable -> L1c
            r9.f1764i = r10     // Catch: java.lang.Throwable -> L1c
            r9.f1765j = r4     // Catch: java.lang.Throwable -> L1c
            wf.g r5 = r9.getContext()     // Catch: java.lang.Throwable -> L1c
            i0.d r5 = i0.r.s(r5)     // Catch: java.lang.Throwable -> L1c
            java.lang.Object r3 = r5.d(r3, r9)     // Catch: java.lang.Throwable -> L1c
            xf.a r5 = xf.a.f21579g
            if (r3 != r5) goto L63
            r10 = r5
            goto L8d
        L63:
            r8 = r3
            r3 = r10
            r10 = r8
        L66:
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> L1c
            boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> L1c
            r8 = r3
            r3 = r10
            r10 = r8
            goto L3c
        L70:
            float r2 = r0.C
            float r2 = java.lang.Math.abs(r2)
            int r1 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r1 > 0) goto L7d
            r0.p1()
        L7d:
            throw r10
        L7e:
            float r10 = r0.C
            float r10 = java.lang.Math.abs(r10)
            int r10 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r10 > 0) goto L8b
            r0.p1()
        L8b:
            sf.n r10 = sf.n.f12433a
        L8d:
            return r10
        L8e:
            java.lang.Object r0 = r9.f1767l
            ci.p r0 = (ci.p) r0
            java.lang.Object r1 = r9.f1766k
            qg.t r1 = (qg.t) r1
            int r2 = r9.f1765j
            r3 = 0
            r4 = 1065353216(0x3f800000, float:1.0)
            r5 = 1
            if (r2 == 0) goto Lb0
            if (r2 != r5) goto La8
            gg.t r2 = r9.f1764i
            f8.i.I0(r10)     // Catch: java.lang.Throwable -> La6
            goto Lef
        La6:
            r10 = move-exception
            goto Lf9
        La8:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            j8.o.A(r10)
            r10 = 0
            goto L11a
        Lb0:
            f8.i.I0(r10)
            ci.p0 r10 = r0.f1778i
            float r2 = r0.f1771b
            float r6 = r9.f1768m
            r10.a(r2, r6)
            gg.t r10 = new gg.t
            r10.<init>()
            r6 = -1
            r10.f4563g = r6
            r2 = 0
        Lc6:
            if (r2 != 0) goto L109
            boolean r2 = qg.v.o(r1)     // Catch: java.lang.Throwable -> La6
            if (r2 == 0) goto L109
            ci.n r2 = new ci.n     // Catch: java.lang.Throwable -> La6
            r6 = 1
            r2.<init>(r10, r0, r6)     // Catch: java.lang.Throwable -> La6
            r9.f1766k = r1     // Catch: java.lang.Throwable -> La6
            r9.f1764i = r10     // Catch: java.lang.Throwable -> La6
            r9.f1765j = r5     // Catch: java.lang.Throwable -> La6
            wf.g r6 = r9.getContext()     // Catch: java.lang.Throwable -> La6
            i0.d r6 = i0.r.s(r6)     // Catch: java.lang.Throwable -> La6
            java.lang.Object r2 = r6.d(r2, r9)     // Catch: java.lang.Throwable -> La6
            xf.a r6 = xf.a.f21579g
            if (r2 != r6) goto Lec
            r10 = r6
            goto L11a
        Lec:
            r8 = r2
            r2 = r10
            r10 = r8
        Lef:
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> La6
            boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> La6
            r8 = r2
            r2 = r10
            r10 = r8
            goto Lc6
        Lf9:
            float r1 = r0.f1771b
            float r1 = java.lang.Math.abs(r1)
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 > 0) goto L108
            r0.h(r3)
            r0.f1774e = r3
        L108:
            throw r10
        L109:
            float r10 = r0.f1771b
            float r10 = java.lang.Math.abs(r10)
            int r10 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r10 > 0) goto L118
            r0.h(r3)
            r0.f1774e = r3
        L118:
            sf.n r10 = sf.n.f12433a
        L11a:
            return r10
        L11b:
            java.lang.Object r0 = r9.f1767l
            ci.p r0 = (ci.p) r0
            java.lang.Object r1 = r9.f1766k
            qg.t r1 = (qg.t) r1
            int r2 = r9.f1765j
            r3 = 0
            r4 = 1065353216(0x3f800000, float:1.0)
            r5 = 1
            if (r2 == 0) goto L13d
            if (r2 != r5) goto L135
            gg.t r2 = r9.f1764i
            f8.i.I0(r10)     // Catch: java.lang.Throwable -> L133
            goto L17c
        L133:
            r10 = move-exception
            goto L186
        L135:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            j8.o.A(r10)
            r10 = 0
            goto L1a7
        L13d:
            f8.i.I0(r10)
            ci.p0 r10 = r0.f1777h
            float r2 = r0.f1770a
            float r6 = r9.f1768m
            r10.a(r2, r6)
            gg.t r10 = new gg.t
            r10.<init>()
            r6 = -1
            r10.f4563g = r6
            r2 = 0
        L153:
            if (r2 != 0) goto L196
            boolean r2 = qg.v.o(r1)     // Catch: java.lang.Throwable -> L133
            if (r2 == 0) goto L196
            ci.n r2 = new ci.n     // Catch: java.lang.Throwable -> L133
            r6 = 0
            r2.<init>(r10, r0, r6)     // Catch: java.lang.Throwable -> L133
            r9.f1766k = r1     // Catch: java.lang.Throwable -> L133
            r9.f1764i = r10     // Catch: java.lang.Throwable -> L133
            r9.f1765j = r5     // Catch: java.lang.Throwable -> L133
            wf.g r6 = r9.getContext()     // Catch: java.lang.Throwable -> L133
            i0.d r6 = i0.r.s(r6)     // Catch: java.lang.Throwable -> L133
            java.lang.Object r2 = r6.d(r2, r9)     // Catch: java.lang.Throwable -> L133
            xf.a r6 = xf.a.f21579g
            if (r2 != r6) goto L179
            r10 = r6
            goto L1a7
        L179:
            r8 = r2
            r2 = r10
            r10 = r8
        L17c:
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> L133
            boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> L133
            r8 = r2
            r2 = r10
            r10 = r8
            goto L153
        L186:
            float r1 = r0.f1770a
            float r1 = java.lang.Math.abs(r1)
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 > 0) goto L195
            r0.g(r3)
            r0.f1773d = r3
        L195:
            throw r10
        L196:
            float r10 = r0.f1770a
            float r10 = java.lang.Math.abs(r10)
            int r10 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r10 > 0) goto L1a5
            r0.g(r3)
            r0.f1773d = r3
        L1a5:
            sf.n r10 = sf.n.f12433a
        L1a7:
            return r10
    }
}
