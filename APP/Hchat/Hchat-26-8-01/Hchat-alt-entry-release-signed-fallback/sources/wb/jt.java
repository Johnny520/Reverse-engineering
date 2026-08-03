package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class jt extends yf.i implements fg.p {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f17132h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f17133i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ java.util.List f17134j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ java.util.List f17135k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ r.z f17136l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f17137m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f17138n;

    public jt(java.util.List r1, java.util.List r2, r.z r3, i0.a1 r4, i0.a1 r5, wf.c r6) {
            r0 = this;
            r0.f17134j = r1
            r0.f17135k = r2
            r0.f17136l = r3
            r0.f17137m = r4
            r0.f17138n = r5
            r1 = 2
            r0.<init>(r1, r6)
            return
    }

    @Override // yf.a
    public final wf.c create(java.lang.Object r8, wf.c r9) {
            r7 = this;
            wb.jt r0 = new wb.jt
            i0.a1 r4 = r7.f17137m
            i0.a1 r5 = r7.f17138n
            java.util.List r1 = r7.f17134j
            java.util.List r2 = r7.f17135k
            r.z r3 = r7.f17136l
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
            wb.jt r1 = (wb.jt) r1
            sf.n r2 = sf.n.f12433a
            java.lang.Object r1 = r1.invokeSuspend(r2)
            return r1
    }

    @Override // yf.a
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            r8 = this;
            int r0 = r8.f17133i
            r.z r1 = r8.f17136l
            r2 = 2
            r3 = 1
            java.util.List r4 = r8.f17134j
            xf.a r5 = xf.a.f21579g
            if (r0 == 0) goto L21
            if (r0 == r3) goto L1b
            if (r0 != r2) goto L14
            f8.i.I0(r9)
            goto L76
        L14:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            j8.o.A(r9)
            r9 = 0
            return r9
        L1b:
            int r0 = r8.f17132h
            f8.i.I0(r9)
            goto L65
        L21:
            f8.i.I0(r9)
            i0.a1 r9 = r8.f17137m
            java.lang.Object r0 = r9.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            int r6 = r4.size()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r9.setValue(r6)
            java.util.List r9 = r8.f17135k
            boolean r9 = r9.isEmpty()
            if (r9 != 0) goto L76
            i0.a1 r9 = r8.f17138n
            wb.y2.Q(r9, r3)
            if (r0 < 0) goto L58
            int r9 = r4.size()
            if (r9 >= r0) goto L58
            int r9 = r4.size()
            r.z.l(r1, r9)
            goto L76
        L58:
            r8.f17132h = r0
            r8.f17133i = r3
            r6 = 80
            java.lang.Object r9 = qg.v.f(r6, r8)
            if (r9 != r5) goto L65
            goto L75
        L65:
            int r9 = r4.size()
            r8.f17132h = r0
            r8.f17133i = r2
            p4.t r0 = r.z.f11279y
            java.lang.Object r9 = r1.f(r9, r8)
            if (r9 != r5) goto L76
        L75:
            return r5
        L76:
            sf.n r9 = sf.n.f12433a
            return r9
    }
}
