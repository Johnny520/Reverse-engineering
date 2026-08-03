package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class nn extends yf.i implements fg.p {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f17949h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f17950i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f17951j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f17952k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f17953l;

    public nn(boolean r1, i0.a1 r2, i0.a1 r3, i0.a1 r4, wf.c r5) {
            r0 = this;
            r0.f17950i = r1
            r0.f17951j = r2
            r0.f17952k = r3
            r0.f17953l = r4
            r1 = 2
            r0.<init>(r1, r5)
            return
    }

    @Override // yf.a
    public final wf.c create(java.lang.Object r7, wf.c r8) {
            r6 = this;
            wb.nn r0 = new wb.nn
            i0.a1 r3 = r6.f17952k
            i0.a1 r4 = r6.f17953l
            boolean r1 = r6.f17950i
            i0.a1 r2 = r6.f17951j
            r5 = r8
            r0.<init>(r1, r2, r3, r4, r5)
            return r0
    }

    @Override // fg.p
    public final java.lang.Object invoke(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            qg.t r1 = (qg.t) r1
            wf.c r2 = (wf.c) r2
            wf.c r1 = r0.create(r1, r2)
            wb.nn r1 = (wb.nn) r1
            sf.n r2 = sf.n.f12433a
            java.lang.Object r1 = r1.invokeSuspend(r2)
            return r1
    }

    @Override // yf.a
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            r4 = this;
            int r0 = r4.f17949h
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L12
            if (r0 != r2) goto Lc
            f8.i.I0(r5)
            goto L2a
        Lc:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            j8.o.A(r5)
            return r1
        L12:
            f8.i.I0(r5)
            xg.e r5 = qg.c0.f11038a
            xg.d r5 = xg.d.f21615i
            i0.v1 r0 = new i0.v1
            r3 = 2
            r0.<init>(r3, r1, r3)
            r4.f17949h = r2
            java.lang.Object r5 = qg.v.x(r5, r0, r4)
            xf.a r0 = xf.a.f21579g
            if (r5 != r0) goto L2a
            return r0
        L2a:
            sf.g r5 = (sf.g) r5
            java.lang.Object r5 = r5.f12421g
            boolean r0 = r5 instanceof sf.f
            i0.a1 r1 = r4.f17953l
            if (r0 != 0) goto L4e
            r0 = r5
            java.lang.String r0 = (java.lang.String) r0
            og.k r2 = wb.ho.f16633a
            i0.a1 r2 = r4.f17951j
            r2.setValue(r0)
            java.lang.String r0 = ""
            i0.a1 r2 = r4.f17952k
            r2.setValue(r0)
            boolean r0 = r4.f17950i
            if (r0 == 0) goto L4e
            java.lang.String r0 = "请输入图形验证码"
            r1.setValue(r0)
        L4e:
            java.lang.Throwable r5 = sf.g.b(r5)
            if (r5 == 0) goto L63
            java.lang.String r5 = r5.getMessage()
            java.lang.String r0 = "刷新图形验证码失败: "
            java.lang.String r5 = wb.en.g(r0, r5)
            og.k r0 = wb.ho.f16633a
            r1.setValue(r5)
        L63:
            sf.n r5 = sf.n.f12433a
            return r5
    }
}
