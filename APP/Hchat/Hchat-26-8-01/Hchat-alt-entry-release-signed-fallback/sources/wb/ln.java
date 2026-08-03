package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class ln extends yf.i implements fg.p {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f17530h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f17531i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f17532j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f17533k;

    public /* synthetic */ ln(java.lang.String r1, java.lang.String r2, wf.c r3, int r4) {
            r0 = this;
            r0.f17530h = r4
            r0.f17532j = r1
            r0.f17533k = r2
            r1 = 2
            r0.<init>(r1, r3)
            return
    }

    @Override // yf.a
    public final wf.c create(java.lang.Object r5, wf.c r6) {
            r4 = this;
            int r0 = r4.f17530h
            switch(r0) {
                case 0: goto L12;
                default: goto L5;
            }
        L5:
            wb.ln r0 = new wb.ln
            java.lang.String r1 = r4.f17533k
            r2 = 1
            java.lang.String r3 = r4.f17532j
            r0.<init>(r3, r1, r6, r2)
            r0.f17531i = r5
            return r0
        L12:
            wb.ln r0 = new wb.ln
            java.lang.String r1 = r4.f17533k
            r2 = 0
            java.lang.String r3 = r4.f17532j
            r0.<init>(r3, r1, r6, r2)
            r0.f17531i = r5
            return r0
    }

    @Override // fg.p
    public final java.lang.Object invoke(java.lang.Object r2, java.lang.Object r3) {
            r1 = this;
            int r0 = r1.f17530h
            qg.t r2 = (qg.t) r2
            wf.c r3 = (wf.c) r3
            switch(r0) {
                case 0: goto L16;
                default: goto L9;
            }
        L9:
            wf.c r2 = r1.create(r2, r3)
            wb.ln r2 = (wb.ln) r2
            sf.n r3 = sf.n.f12433a
            java.lang.Object r2 = r2.invokeSuspend(r3)
            return r2
        L16:
            wf.c r2 = r1.create(r2, r3)
            wb.ln r2 = (wb.ln) r2
            sf.n r3 = sf.n.f12433a
            java.lang.Object r2 = r2.invokeSuspend(r3)
            return r2
    }

    @Override // yf.a
    public final java.lang.Object invokeSuspend(java.lang.Object r2) {
            r1 = this;
            int r0 = r1.f17530h
            switch(r0) {
                case 0: goto L23;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r1.f17531i
            qg.t r0 = (qg.t) r0
            f8.i.I0(r2)
            java.lang.String r2 = r1.f17532j
            java.lang.String r0 = r1.f17533k
            x8.x.q(r2, r0)     // Catch: java.lang.Throwable -> L16
            java.lang.String r2 = "短信验证码已发送"
            goto L1d
        L16:
            r2 = move-exception
            sf.f r0 = new sf.f
            r0.<init>(r2)
            r2 = r0
        L1d:
            sf.g r0 = new sf.g
            r0.<init>(r2)
            return r0
        L23:
            java.lang.Object r0 = r1.f17531i
            qg.t r0 = (qg.t) r0
            f8.i.I0(r2)
            java.lang.String r2 = r1.f17532j
            java.lang.String r0 = r1.f17533k
            java.lang.String r2 = x8.x.l(r2, r0)     // Catch: java.lang.Throwable -> L33
            goto L3a
        L33:
            r2 = move-exception
            sf.f r0 = new sf.f
            r0.<init>(r2)
            r2 = r0
        L3a:
            sf.g r0 = new sf.g
            r0.<init>(r2)
            return r0
    }
}
