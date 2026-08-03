package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class bq extends yf.i implements fg.p {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f15273h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ gb.o f15274i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f15275j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f15276k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f15277l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ qg.t f15278m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f15279n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f15280o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f15281p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f15282q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f15283r;

    public bq(gb.o r1, android.content.Context r2, i0.a1 r3, i0.a1 r4, qg.t r5, i0.a1 r6, i0.a1 r7, i0.a1 r8, i0.a1 r9, i0.a1 r10, wf.c r11) {
            r0 = this;
            r0.f15274i = r1
            r0.f15275j = r2
            r0.f15276k = r3
            r0.f15277l = r4
            r0.f15278m = r5
            r0.f15279n = r6
            r0.f15280o = r7
            r0.f15281p = r8
            r0.f15282q = r9
            r0.f15283r = r10
            r1 = 2
            r0.<init>(r1, r11)
            return
    }

    @Override // yf.a
    public final wf.c create(java.lang.Object r13, wf.c r14) {
            r12 = this;
            wb.bq r0 = new wb.bq
            i0.a1 r9 = r12.f15282q
            i0.a1 r10 = r12.f15283r
            gb.o r1 = r12.f15274i
            android.content.Context r2 = r12.f15275j
            i0.a1 r3 = r12.f15276k
            i0.a1 r4 = r12.f15277l
            qg.t r5 = r12.f15278m
            i0.a1 r6 = r12.f15279n
            i0.a1 r7 = r12.f15280o
            i0.a1 r8 = r12.f15281p
            r11 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return r0
    }

    @Override // fg.p
    public final java.lang.Object invoke(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            qg.t r1 = (qg.t) r1
            wf.c r2 = (wf.c) r2
            wf.c r1 = r0.create(r1, r2)
            wb.bq r1 = (wb.bq) r1
            sf.n r2 = sf.n.f12433a
            java.lang.Object r1 = r1.invokeSuspend(r2)
            return r1
    }

    @Override // yf.a
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            r11 = this;
            int r0 = r11.f15273h
            android.content.Context r4 = r11.f15275j
            r1 = 0
            gb.o r2 = r11.f15274i
            r3 = 1
            if (r0 == 0) goto L16
            if (r0 != r3) goto L10
            f8.i.I0(r12)
            goto L2e
        L10:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            j8.o.A(r12)
            return r1
        L16:
            f8.i.I0(r12)
            xg.e r12 = qg.c0.f11038a
            xg.d r12 = xg.d.f21615i
            wb.up r0 = new wb.up
            r5 = 3
            r0.<init>(r4, r2, r1, r5)
            r11.f15273h = r3
            java.lang.Object r12 = qg.v.x(r12, r0, r11)
            xf.a r0 = xf.a.f21579g
            if (r12 != r0) goto L2e
            return r0
        L2e:
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            r0 = r2
            i0.a1 r2 = r11.f15276k
            r2.setValue(r1)
            if (r12 == 0) goto L42
            i0.a1 r12 = r11.f15277l
            r12.setValue(r0)
            goto L54
        L42:
            gb.o r9 = r11.f15274i
            r10 = 0
            qg.t r1 = r11.f15278m
            i0.a1 r3 = r11.f15279n
            i0.a1 r5 = r11.f15280o
            i0.a1 r6 = r11.f15281p
            i0.a1 r7 = r11.f15282q
            i0.a1 r8 = r11.f15283r
            wb.y2.z1(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
        L54:
            sf.n r12 = sf.n.f12433a
            return r12
    }
}
