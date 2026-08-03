package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class lt extends yf.i implements fg.p {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f17573h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f17574i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f17575j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ java.util.List f17576k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ r.z f17577l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.util.List f17578m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f17579n;

    public lt(boolean r1, boolean r2, java.util.List r3, r.z r4, java.util.List r5, i0.a1 r6, wf.c r7) {
            r0 = this;
            r0.f17574i = r1
            r0.f17575j = r2
            r0.f17576k = r3
            r0.f17577l = r4
            r0.f17578m = r5
            r0.f17579n = r6
            r1 = 2
            r0.<init>(r1, r7)
            return
    }

    @Override // yf.a
    public final wf.c create(java.lang.Object r9, wf.c r10) {
            r8 = this;
            wb.lt r0 = new wb.lt
            java.util.List r5 = r8.f17578m
            i0.a1 r6 = r8.f17579n
            boolean r1 = r8.f17574i
            boolean r2 = r8.f17575j
            java.util.List r3 = r8.f17576k
            r.z r4 = r8.f17577l
            r7 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r0
    }

    @Override // fg.p
    public final java.lang.Object invoke(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            qg.t r1 = (qg.t) r1
            wf.c r2 = (wf.c) r2
            wf.c r1 = r0.create(r1, r2)
            wb.lt r1 = (wb.lt) r1
            sf.n r2 = sf.n.f12433a
            java.lang.Object r1 = r1.invokeSuspend(r2)
            return r1
    }

    @Override // yf.a
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            r6 = this;
            int r0 = r6.f17573h
            r1 = 2
            r2 = 1
            xf.a r3 = xf.a.f21579g
            if (r0 == 0) goto L1b
            if (r0 == r2) goto L17
            if (r0 != r1) goto L10
            f8.i.I0(r7)
            goto L51
        L10:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            j8.o.A(r7)
            r7 = 0
            return r7
        L17:
            f8.i.I0(r7)
            goto L3e
        L1b:
            f8.i.I0(r7)
            boolean r7 = r6.f17574i
            if (r7 == 0) goto L51
            boolean r7 = r6.f17575j
            if (r7 != 0) goto L51
            java.util.List r7 = r6.f17576k
            boolean r7 = r7.isEmpty()
            if (r7 != 0) goto L51
            i0.a1 r7 = r6.f17579n
            wb.y2.Q(r7, r2)
            r6.f17573h = r2
            r4 = 40
            java.lang.Object r7 = qg.v.f(r4, r6)
            if (r7 != r3) goto L3e
            goto L50
        L3e:
            java.util.List r7 = r6.f17578m
            int r7 = r7.size()
            r6.f17573h = r1
            p4.t r0 = r.z.f11279y
            r.z r0 = r6.f17577l
            java.lang.Object r7 = r0.f(r7, r6)
            if (r7 != r3) goto L51
        L50:
            return r3
        L51:
            sf.n r7 = sf.n.f12433a
            return r7
    }
}
