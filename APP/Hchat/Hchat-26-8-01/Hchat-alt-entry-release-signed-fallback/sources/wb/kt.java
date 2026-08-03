package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class kt extends yf.i implements fg.p {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f17370h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f17371i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ java.util.List f17372j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ r.z f17373k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ java.util.List f17374l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f17375m;

    public kt(boolean r1, java.util.List r2, r.z r3, java.util.List r4, i0.a1 r5, wf.c r6) {
            r0 = this;
            r0.f17371i = r1
            r0.f17372j = r2
            r0.f17373k = r3
            r0.f17374l = r4
            r0.f17375m = r5
            r1 = 2
            r0.<init>(r1, r6)
            return
    }

    @Override // yf.a
    public final wf.c create(java.lang.Object r8, wf.c r9) {
            r7 = this;
            wb.kt r0 = new wb.kt
            java.util.List r4 = r7.f17374l
            i0.a1 r5 = r7.f17375m
            boolean r1 = r7.f17371i
            java.util.List r2 = r7.f17372j
            r.z r3 = r7.f17373k
            r6 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return r0
    }

    @Override // fg.p
    public final java.lang.Object invoke(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            qg.t r1 = (qg.t) r1
            wf.c r2 = (wf.c) r2
            wf.c r1 = r0.create(r1, r2)
            wb.kt r1 = (wb.kt) r1
            sf.n r2 = sf.n.f12433a
            java.lang.Object r1 = r1.invokeSuspend(r2)
            return r1
    }

    @Override // yf.a
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            r6 = this;
            int r0 = r6.f17370h
            r1 = 2
            r2 = 1
            xf.a r3 = xf.a.f21579g
            if (r0 == 0) goto L1b
            if (r0 == r2) goto L17
            if (r0 != r1) goto L10
            f8.i.I0(r7)
            goto L54
        L10:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            j8.o.A(r7)
            r7 = 0
            return r7
        L17:
            f8.i.I0(r7)
            goto L43
        L1b:
            f8.i.I0(r7)
            boolean r7 = r6.f17371i
            if (r7 == 0) goto L54
            i0.a1 r7 = r6.f17375m
            java.lang.Object r7 = r7.getValue()
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L54
            java.util.List r7 = r6.f17372j
            boolean r7 = r7.isEmpty()
            if (r7 != 0) goto L54
            r6.f17370h = r2
            r4 = 180(0xb4, double:8.9E-322)
            java.lang.Object r7 = qg.v.f(r4, r6)
            if (r7 != r3) goto L43
            goto L53
        L43:
            java.util.List r7 = r6.f17374l
            int r7 = r7.size()
            r6.f17370h = r1
            r.z r0 = r6.f17373k
            java.lang.Object r7 = r.z.m(r0, r7, r6)
            if (r7 != r3) goto L54
        L53:
            return r3
        L54:
            sf.n r7 = sf.n.f12433a
            return r7
    }
}
