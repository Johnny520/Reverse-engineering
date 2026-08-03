package m;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class g0 extends yf.h implements fg.p {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f8158g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f8159h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ wb.ad f8160i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ c9.w0 f8161j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ c9.w0 f8162k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ c9.q0 f8163l;

    public g0(wb.ad r1, c9.w0 r2, c9.w0 r3, c9.q0 r4, wf.c r5) {
            r0 = this;
            r0.f8160i = r1
            r0.f8161j = r2
            r0.f8162k = r3
            r0.f8163l = r4
            r0.<init>(r5)
            return
    }

    @Override // yf.a
    public final wf.c create(java.lang.Object r7, wf.c r8) {
            r6 = this;
            m.g0 r0 = new m.g0
            c9.w0 r3 = r6.f8162k
            c9.q0 r4 = r6.f8163l
            wb.ad r1 = r6.f8160i
            c9.w0 r2 = r6.f8161j
            r5 = r8
            r0.<init>(r1, r2, r3, r4, r5)
            r0.f8159h = r7
            return r0
    }

    @Override // fg.p
    public final java.lang.Object invoke(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            s1.k0 r1 = (s1.k0) r1
            wf.c r2 = (wf.c) r2
            wf.c r1 = r0.create(r1, r2)
            m.g0 r1 = (m.g0) r1
            sf.n r2 = sf.n.f12433a
            java.lang.Object r1 = r1.invokeSuspend(r2)
            return r1
    }

    @Override // yf.a
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            r8 = this;
            int r0 = r8.f8158g
            c9.w0 r1 = r8.f8162k
            r2 = 3
            r3 = 2
            r4 = 1
            xf.a r5 = xf.a.f21579g
            if (r0 == 0) goto L34
            if (r0 == r4) goto L2c
            if (r0 == r3) goto L24
            if (r0 != r2) goto L1d
            java.lang.Object r0 = r8.f8159h
            s1.k0 r0 = (s1.k0) r0
            f8.i.I0(r9)     // Catch: java.util.concurrent.CancellationException -> L1a
            goto L8e
        L1a:
            r9 = move-exception
            goto Lc1
        L1d:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            j8.o.A(r9)
            r9 = 0
            return r9
        L24:
            java.lang.Object r0 = r8.f8159h
            s1.k0 r0 = (s1.k0) r0
            f8.i.I0(r9)     // Catch: java.util.concurrent.CancellationException -> L1a
            goto L56
        L2c:
            java.lang.Object r0 = r8.f8159h
            s1.k0 r0 = (s1.k0) r0
            f8.i.I0(r9)     // Catch: java.util.concurrent.CancellationException -> L1a
            goto L47
        L34:
            f8.i.I0(r9)
            java.lang.Object r9 = r8.f8159h
            r0 = r9
            s1.k0 r0 = (s1.k0) r0
            r8.f8159h = r0     // Catch: java.util.concurrent.CancellationException -> L1a
            r8.f8158g = r4     // Catch: java.util.concurrent.CancellationException -> L1a
            java.lang.Object r9 = m.y2.b(r0, r8, r3)     // Catch: java.util.concurrent.CancellationException -> L1a
            if (r9 != r5) goto L47
            goto L8d
        L47:
            s1.t r9 = (s1.t) r9     // Catch: java.util.concurrent.CancellationException -> L1a
            long r6 = r9.f12291a     // Catch: java.util.concurrent.CancellationException -> L1a
            r8.f8159h = r0     // Catch: java.util.concurrent.CancellationException -> L1a
            r8.f8158g = r3     // Catch: java.util.concurrent.CancellationException -> L1a
            java.lang.Object r9 = m.j0.b(r0, r6, r8)     // Catch: java.util.concurrent.CancellationException -> L1a
            if (r9 != r5) goto L56
            goto L8d
        L56:
            s1.t r9 = (s1.t) r9     // Catch: java.util.concurrent.CancellationException -> L1a
            if (r9 == 0) goto Lbe
            wb.ad r3 = r8.f8160i     // Catch: java.util.concurrent.CancellationException -> L1a
            i0.a1 r4 = r3.f14980h     // Catch: java.util.concurrent.CancellationException -> L1a
            i0.a1 r6 = r3.f14981i     // Catch: java.util.concurrent.CancellationException -> L1a
            i0.a1 r3 = r3.f14982j     // Catch: java.util.concurrent.CancellationException -> L1a
            r7 = 0
            java.lang.Float r7 = java.lang.Float.valueOf(r7)     // Catch: java.util.concurrent.CancellationException -> L1a
            r4.setValue(r7)     // Catch: java.util.concurrent.CancellationException -> L1a
            java.lang.Boolean r4 = java.lang.Boolean.TRUE     // Catch: java.util.concurrent.CancellationException -> L1a
            r6.setValue(r4)     // Catch: java.util.concurrent.CancellationException -> L1a
            java.lang.Object r3 = r3.getValue()     // Catch: java.util.concurrent.CancellationException -> L1a
            fg.l r3 = (fg.l) r3     // Catch: java.util.concurrent.CancellationException -> L1a
            r3.invoke(r4)     // Catch: java.util.concurrent.CancellationException -> L1a
            long r3 = r9.f12291a     // Catch: java.util.concurrent.CancellationException -> L1a
            c9.q0 r9 = r8.f8163l     // Catch: java.util.concurrent.CancellationException -> L1a
            b0.d0 r6 = new b0.d0     // Catch: java.util.concurrent.CancellationException -> L1a
            r7 = 26
            r6.<init>(r9, r7)     // Catch: java.util.concurrent.CancellationException -> L1a
            r8.f8159h = r0     // Catch: java.util.concurrent.CancellationException -> L1a
            r8.f8158g = r2     // Catch: java.util.concurrent.CancellationException -> L1a
            java.lang.Object r9 = m.j0.d(r0, r3, r6, r8)     // Catch: java.util.concurrent.CancellationException -> L1a
            if (r9 != r5) goto L8e
        L8d:
            return r5
        L8e:
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.util.concurrent.CancellationException -> L1a
            boolean r9 = r9.booleanValue()     // Catch: java.util.concurrent.CancellationException -> L1a
            if (r9 == 0) goto Lbb
            s1.l0 r9 = r0.f12273l     // Catch: java.util.concurrent.CancellationException -> L1a
            s1.k r9 = r9.f12283z     // Catch: java.util.concurrent.CancellationException -> L1a
            java.lang.Object r9 = r9.f12262a     // Catch: java.util.concurrent.CancellationException -> L1a
            int r0 = r9.size()     // Catch: java.util.concurrent.CancellationException -> L1a
            r2 = 0
        La1:
            if (r2 >= r0) goto Lb5
            java.lang.Object r3 = r9.get(r2)     // Catch: java.util.concurrent.CancellationException -> L1a
            s1.t r3 = (s1.t) r3     // Catch: java.util.concurrent.CancellationException -> L1a
            boolean r4 = s1.s.c(r3)     // Catch: java.util.concurrent.CancellationException -> L1a
            if (r4 == 0) goto Lb2
            r3.a()     // Catch: java.util.concurrent.CancellationException -> L1a
        Lb2:
            int r2 = r2 + 1
            goto La1
        Lb5:
            c9.w0 r9 = r8.f8161j     // Catch: java.util.concurrent.CancellationException -> L1a
            r9.invoke()     // Catch: java.util.concurrent.CancellationException -> L1a
            goto Lbe
        Lbb:
            r1.invoke()     // Catch: java.util.concurrent.CancellationException -> L1a
        Lbe:
            sf.n r9 = sf.n.f12433a
            return r9
        Lc1:
            r1.invoke()
            throw r9
    }
}
