package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class qn extends yf.i implements fg.p {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public j8.h f18691h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public j8.g f18692i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f18693j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f18694k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f18695l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ j8.h f18696m;

    public qn(j8.h r1, wf.c r2) {
            r0 = this;
            r0.f18696m = r1
            r1 = 2
            r0.<init>(r1, r2)
            return
    }

    @Override // yf.a
    public final wf.c create(java.lang.Object r3, wf.c r4) {
            r2 = this;
            wb.qn r0 = new wb.qn
            j8.h r1 = r2.f18696m
            r0.<init>(r1, r4)
            r0.f18695l = r3
            return r0
    }

    @Override // fg.p
    public final java.lang.Object invoke(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            qg.t r1 = (qg.t) r1
            wf.c r2 = (wf.c) r2
            wf.c r1 = r0.create(r1, r2)
            wb.qn r1 = (wb.qn) r1
            sf.n r2 = sf.n.f12433a
            java.lang.Object r1 = r1.invokeSuspend(r2)
            return r1
    }

    @Override // yf.a
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            r7 = this;
            java.lang.Object r0 = r7.f18695l
            qg.t r0 = (qg.t) r0
            int r0 = r7.f18694k
            r1 = 1
            if (r0 == 0) goto L1f
            if (r0 != r1) goto L18
            int r0 = r7.f18693j
            j8.g r2 = r7.f18692i
            j8.h r3 = r7.f18691h
            f8.i.I0(r8)     // Catch: java.lang.Throwable -> L16
        L14:
            r8 = r2
            goto L67
        L16:
            r8 = move-exception
            goto L7b
        L18:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            j8.o.A(r8)
            r8 = 0
            return r8
        L1f:
            f8.i.I0(r8)
            j8.h r8 = r7.f18696m
            if (r8 == 0) goto L73
            h.Hchat.dexkit.DexFinder r0 = r8.f6788b     // Catch: java.lang.Throwable -> L16
            r0.resolveFavoriteApi()     // Catch: java.lang.Throwable -> L16
            boolean r0 = r8.d()     // Catch: java.lang.Throwable -> L16
            if (r0 == 0) goto L6b
            j8.g r0 = new j8.g     // Catch: java.lang.Throwable -> L16
            tf.t r2 = tf.t.f13167g     // Catch: java.lang.Throwable -> L16
            r3 = 0
            r0.<init>(r2, r3, r3)     // Catch: java.lang.Throwable -> L16
            r6 = r3
            r3 = r8
            r8 = r0
            r0 = r6
        L3d:
            r2 = 3
            if (r0 < r2) goto L41
            goto L81
        L41:
            j8.g r2 = r3.u()     // Catch: java.lang.Throwable -> L16
            java.util.List r8 = r2.f6784a     // Catch: java.lang.Throwable -> L16
            boolean r8 = r8.isEmpty()     // Catch: java.lang.Throwable -> L16
            if (r8 == 0) goto L69
            r8 = 2
            if (r0 != r8) goto L51
            goto L69
        L51:
            r8 = 0
            r7.f18695l = r8     // Catch: java.lang.Throwable -> L16
            r7.f18691h = r3     // Catch: java.lang.Throwable -> L16
            r7.f18692i = r2     // Catch: java.lang.Throwable -> L16
            r7.f18693j = r0     // Catch: java.lang.Throwable -> L16
            r7.f18694k = r1     // Catch: java.lang.Throwable -> L16
            r4 = 350(0x15e, double:1.73E-321)
            java.lang.Object r8 = qg.v.f(r4, r7)     // Catch: java.lang.Throwable -> L16
            xf.a r4 = xf.a.f21579g
            if (r8 != r4) goto L14
            return r4
        L67:
            int r0 = r0 + r1
            goto L3d
        L69:
            r8 = r2
            goto L81
        L6b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L16
            java.lang.String r0 = "收藏列表不可用"
            r8.<init>(r0)     // Catch: java.lang.Throwable -> L16
            throw r8     // Catch: java.lang.Throwable -> L16
        L73:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L16
            java.lang.String r0 = "收藏 API 未就绪"
            r8.<init>(r0)     // Catch: java.lang.Throwable -> L16
            throw r8     // Catch: java.lang.Throwable -> L16
        L7b:
            sf.f r0 = new sf.f
            r0.<init>(r8)
            r8 = r0
        L81:
            sf.g r0 = new sf.g
            r0.<init>(r8)
            return r0
    }
}
