package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class in extends yf.i implements fg.p {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f16877h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f16878i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f16879j;

    public /* synthetic */ in(i0.a1 r1, wf.c r2, int r3) {
            r0 = this;
            r0.f16877h = r3
            r0.f16879j = r1
            r1 = 2
            r0.<init>(r1, r2)
            return
    }

    @Override // yf.a
    public final wf.c create(java.lang.Object r4, wf.c r5) {
            r3 = this;
            int r0 = r3.f16877h
            switch(r0) {
                case 0: goto L1b;
                case 1: goto L10;
                default: goto L5;
            }
        L5:
            wb.in r0 = new wb.in
            i0.a1 r1 = r3.f16879j
            r2 = 2
            r0.<init>(r1, r5, r2)
            r0.f16878i = r4
            return r0
        L10:
            wb.in r0 = new wb.in
            i0.a1 r1 = r3.f16879j
            r2 = 1
            r0.<init>(r1, r5, r2)
            r0.f16878i = r4
            return r0
        L1b:
            wb.in r0 = new wb.in
            i0.a1 r1 = r3.f16879j
            r2 = 0
            r0.<init>(r1, r5, r2)
            r0.f16878i = r4
            return r0
    }

    @Override // fg.p
    public final java.lang.Object invoke(java.lang.Object r2, java.lang.Object r3) {
            r1 = this;
            int r0 = r1.f16877h
            qg.t r2 = (qg.t) r2
            wf.c r3 = (wf.c) r3
            switch(r0) {
                case 0: goto L23;
                case 1: goto L16;
                default: goto L9;
            }
        L9:
            wf.c r2 = r1.create(r2, r3)
            wb.in r2 = (wb.in) r2
            sf.n r3 = sf.n.f12433a
            java.lang.Object r2 = r2.invokeSuspend(r3)
            return r2
        L16:
            wf.c r2 = r1.create(r2, r3)
            wb.in r2 = (wb.in) r2
            sf.n r3 = sf.n.f12433a
            java.lang.Object r2 = r2.invokeSuspend(r3)
            return r2
        L23:
            wf.c r2 = r1.create(r2, r3)
            wb.in r2 = (wb.in) r2
            sf.n r3 = sf.n.f12433a
            java.lang.Object r2 = r2.invokeSuspend(r3)
            return r2
    }

    @Override // yf.a
    public final java.lang.Object invokeSuspend(java.lang.Object r3) {
            r2 = this;
            int r0 = r2.f16877h
            i0.a1 r1 = r2.f16879j
            switch(r0) {
                case 0: goto L4d;
                case 1: goto L2a;
                default: goto L7;
            }
        L7:
            java.lang.Object r0 = r2.f16878i
            qg.t r0 = (qg.t) r0
            f8.i.I0(r3)
            okhttp3.OkHttpClient r3 = x8.x.f21380a     // Catch: java.lang.Throwable -> L1d
            og.k r3 = wb.ho.f16633a     // Catch: java.lang.Throwable -> L1d
            java.lang.Object r3 = r1.getValue()     // Catch: java.lang.Throwable -> L1d
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L1d
            uf.c r3 = x8.x.h(r3)     // Catch: java.lang.Throwable -> L1d
            goto L24
        L1d:
            r3 = move-exception
            sf.f r0 = new sf.f
            r0.<init>(r3)
            r3 = r0
        L24:
            sf.g r0 = new sf.g
            r0.<init>(r3)
            return r0
        L2a:
            java.lang.Object r0 = r2.f16878i
            qg.t r0 = (qg.t) r0
            f8.i.I0(r3)
            okhttp3.OkHttpClient r3 = x8.x.f21380a     // Catch: java.lang.Throwable -> L40
            og.k r3 = wb.ho.f16633a     // Catch: java.lang.Throwable -> L40
            java.lang.Object r3 = r1.getValue()     // Catch: java.lang.Throwable -> L40
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L40
            uf.c r3 = x8.x.g(r3)     // Catch: java.lang.Throwable -> L40
            goto L47
        L40:
            r3 = move-exception
            sf.f r0 = new sf.f
            r0.<init>(r3)
            r3 = r0
        L47:
            sf.g r0 = new sf.g
            r0.<init>(r3)
            return r0
        L4d:
            java.lang.Object r0 = r2.f16878i
            qg.t r0 = (qg.t) r0
            f8.i.I0(r3)
            okhttp3.OkHttpClient r3 = x8.x.f21380a     // Catch: java.lang.Throwable -> L63
            og.k r3 = wb.ho.f16633a     // Catch: java.lang.Throwable -> L63
            java.lang.Object r3 = r1.getValue()     // Catch: java.lang.Throwable -> L63
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L63
            uf.c r3 = x8.x.d(r3)     // Catch: java.lang.Throwable -> L63
            goto L6a
        L63:
            r3 = move-exception
            sf.f r0 = new sf.f
            r0.<init>(r3)
            r3 = r0
        L6a:
            sf.g r0 = new sf.g
            r0.<init>(r3)
            return r0
    }
}
