package i0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class v1 extends yf.i implements fg.p {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f6058h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f6059i;

    public /* synthetic */ v1(int r1, wf.c r2, int r3) {
            r0 = this;
            r0.f6058h = r3
            r0.<init>(r1, r2)
            return
    }

    @Override // yf.a
    public final wf.c create(java.lang.Object r4, wf.c r5) {
            r3 = this;
            int r0 = r3.f6058h
            switch(r0) {
                case 0: goto L19;
                case 1: goto Lf;
                default: goto L5;
            }
        L5:
            i0.v1 r0 = new i0.v1
            r1 = 2
            r2 = 2
            r0.<init>(r1, r5, r2)
            r0.f6059i = r4
            return r0
        Lf:
            i0.v1 r0 = new i0.v1
            r1 = 2
            r2 = 1
            r0.<init>(r1, r5, r2)
            r0.f6059i = r4
            return r0
        L19:
            i0.v1 r0 = new i0.v1
            r1 = 2
            r2 = 0
            r0.<init>(r1, r5, r2)
            r0.f6059i = r4
            return r0
    }

    @Override // fg.p
    public final java.lang.Object invoke(java.lang.Object r2, java.lang.Object r3) {
            r1 = this;
            int r0 = r1.f6058h
            switch(r0) {
                case 0: goto L27;
                case 1: goto L16;
                default: goto L5;
            }
        L5:
            qg.t r2 = (qg.t) r2
            wf.c r3 = (wf.c) r3
            wf.c r2 = r1.create(r2, r3)
            i0.v1 r2 = (i0.v1) r2
            sf.n r3 = sf.n.f12433a
            java.lang.Object r2 = r2.invokeSuspend(r3)
            return r2
        L16:
            tg.u r2 = (tg.u) r2
            wf.c r3 = (wf.c) r3
            wf.c r2 = r1.create(r2, r3)
            i0.v1 r2 = (i0.v1) r2
            sf.n r3 = sf.n.f12433a
            java.lang.Object r2 = r2.invokeSuspend(r3)
            return r2
        L27:
            i0.u1 r2 = (i0.u1) r2
            wf.c r3 = (wf.c) r3
            wf.c r2 = r1.create(r2, r3)
            i0.v1 r2 = (i0.v1) r2
            sf.n r3 = sf.n.f12433a
            java.lang.Object r2 = r2.invokeSuspend(r3)
            return r2
    }

    @Override // yf.a
    public final java.lang.Object invokeSuspend(java.lang.Object r4) {
            r3 = this;
            int r0 = r3.f6058h
            r1 = 0
            r2 = 1
            switch(r0) {
                case 0: goto L31;
                case 1: goto L20;
                default: goto L7;
            }
        L7:
            java.lang.Object r0 = r3.f6059i
            qg.t r0 = (qg.t) r0
            f8.i.I0(r4)
            java.lang.String r4 = x8.x.e()     // Catch: java.lang.Throwable -> L13
            goto L1a
        L13:
            r4 = move-exception
            sf.f r0 = new sf.f
            r0.<init>(r4)
            r4 = r0
        L1a:
            sf.g r0 = new sf.g
            r0.<init>(r4)
            return r0
        L20:
            f8.i.I0(r4)
            java.lang.Object r4 = r3.f6059i
            tg.u r4 = (tg.u) r4
            tg.u r0 = tg.u.f13250g
            if (r4 == r0) goto L2c
            r1 = r2
        L2c:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r1)
            return r4
        L31:
            f8.i.I0(r4)
            java.lang.Object r4 = r3.f6059i
            i0.u1 r4 = (i0.u1) r4
            i0.u1 r0 = i0.u1.f6050g
            if (r4 != r0) goto L3d
            r1 = r2
        L3d:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r1)
            return r4
    }
}
