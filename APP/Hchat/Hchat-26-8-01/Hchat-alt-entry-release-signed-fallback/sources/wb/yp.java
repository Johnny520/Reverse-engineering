package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class yp extends yf.i implements fg.p {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f20450h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f20451i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f20452j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f20453k;

    public yp(android.content.Context r2, gb.o r3, boolean r4, wf.c r5) {
            r1 = this;
            r0 = 0
            r1.f20450h = r0
            r1.f20452j = r2
            r1.f20453k = r3
            r1.f20451i = r4
            r2 = 2
            r1.<init>(r2, r5)
            return
    }

    public /* synthetic */ yp(boolean r1, java.lang.Object r2, java.lang.Object r3, wf.c r4, int r5) {
            r0 = this;
            r0.f20450h = r5
            r0.f20451i = r1
            r0.f20452j = r2
            r0.f20453k = r3
            r1 = 2
            r0.<init>(r1, r4)
            return
    }

    @Override // yf.a
    public final wf.c create(java.lang.Object r8, wf.c r9) {
            r7 = this;
            int r8 = r7.f20450h
            switch(r8) {
                case 0: goto L2e;
                case 1: goto L19;
                default: goto L5;
            }
        L5:
            wb.yp r0 = new wb.yp
            java.lang.Object r8 = r7.f20452j
            r2 = r8
            i0.a1 r2 = (i0.a1) r2
            java.lang.Object r8 = r7.f20453k
            r3 = r8
            i0.a1 r3 = (i0.a1) r3
            r5 = 2
            boolean r1 = r7.f20451i
            r4 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            return r0
        L19:
            r4 = r9
            wb.yp r1 = new wb.yp
            java.lang.Object r8 = r7.f20452j
            r3 = r8
            android.content.Context r3 = (android.content.Context) r3
            java.lang.Object r8 = r7.f20453k
            gb.o r8 = (gb.o) r8
            r6 = 1
            boolean r2 = r7.f20451i
            r5 = r4
            r4 = r8
            r1.<init>(r2, r3, r4, r5, r6)
            return r1
        L2e:
            r4 = r9
            wb.yp r8 = new wb.yp
            java.lang.Object r9 = r7.f20452j
            android.content.Context r9 = (android.content.Context) r9
            java.lang.Object r0 = r7.f20453k
            gb.o r0 = (gb.o) r0
            boolean r1 = r7.f20451i
            r8.<init>(r9, r0, r1, r4)
            return r8
    }

    @Override // fg.p
    public final java.lang.Object invoke(java.lang.Object r2, java.lang.Object r3) {
            r1 = this;
            int r0 = r1.f20450h
            qg.t r2 = (qg.t) r2
            wf.c r3 = (wf.c) r3
            switch(r0) {
                case 0: goto L22;
                case 1: goto L15;
                default: goto L9;
            }
        L9:
            wf.c r2 = r1.create(r2, r3)
            wb.yp r2 = (wb.yp) r2
            sf.n r3 = sf.n.f12433a
            r2.invokeSuspend(r3)
            return r3
        L15:
            wf.c r2 = r1.create(r2, r3)
            wb.yp r2 = (wb.yp) r2
            sf.n r3 = sf.n.f12433a
            java.lang.Object r2 = r2.invokeSuspend(r3)
            return r2
        L22:
            wf.c r2 = r1.create(r2, r3)
            wb.yp r2 = (wb.yp) r2
            sf.n r3 = sf.n.f12433a
            java.lang.Object r2 = r2.invokeSuspend(r3)
            return r2
    }

    @Override // yf.a
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            r6 = this;
            int r0 = r6.f20450h
            boolean r1 = r6.f20451i
            java.lang.Object r2 = r6.f20453k
            java.lang.Object r3 = r6.f20452j
            switch(r0) {
                case 0: goto L6a;
                case 1: goto L24;
                default: goto Lb;
            }
        Lb:
            f8.i.I0(r7)
            i0.a1 r3 = (i0.a1) r3
            java.lang.Object r7 = r3.getValue()
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            if (r7 != 0) goto L21
            i0.a1 r2 = (i0.a1) r2
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r1)
            r2.setValue(r7)
        L21:
            sf.n r7 = sf.n.f12433a
            return r7
        L24:
            gb.o r2 = (gb.o) r2
            f8.i.I0(r7)
            android.content.Context r3 = (android.content.Context) r3
            java.lang.String r7 = r2.f4449a
            if (r1 == 0) goto L4a
            java.lang.Object r0 = gb.q.a(r3)     // Catch: java.lang.Throwable -> L42
            f8.i.I0(r0)     // Catch: java.lang.Throwable -> L42
            gb.s r0 = (gb.s) r0     // Catch: java.lang.Throwable -> L42
            java.lang.Object r7 = gb.b.m(r3, r7, r0)     // Catch: java.lang.Throwable -> L42
            f8.i.I0(r7)     // Catch: java.lang.Throwable -> L42
            gb.l r7 = (gb.l) r7     // Catch: java.lang.Throwable -> L42
            goto L64
        L42:
            r7 = move-exception
            sf.f r0 = new sf.f
            r0.<init>(r7)
        L48:
            r7 = r0
            goto L64
        L4a:
            java.lang.Object r0 = gb.q.a(r3)     // Catch: java.lang.Throwable -> L5d
            f8.i.I0(r0)     // Catch: java.lang.Throwable -> L5d
            gb.s r0 = (gb.s) r0     // Catch: java.lang.Throwable -> L5d
            java.lang.Object r7 = gb.b.i(r3, r7, r0)     // Catch: java.lang.Throwable -> L5d
            f8.i.I0(r7)     // Catch: java.lang.Throwable -> L5d
            gb.l r7 = (gb.l) r7     // Catch: java.lang.Throwable -> L5d
            goto L64
        L5d:
            r7 = move-exception
            sf.f r0 = new sf.f
            r0.<init>(r7)
            goto L48
        L64:
            sf.g r0 = new sf.g
            r0.<init>(r7)
            return r0
        L6a:
            f8.i.I0(r7)
            android.content.Context r3 = (android.content.Context) r3
            gb.o r2 = (gb.o) r2
            r2.getClass()
            java.lang.Object r7 = gb.k.m(r3, r2, r1)     // Catch: java.lang.Throwable -> Lae
            f8.i.I0(r7)     // Catch: java.lang.Throwable -> Lae
            gb.i r7 = (gb.i) r7     // Catch: java.lang.Throwable -> Lae
            java.util.UUID r0 = java.util.UUID.randomUUID()     // Catch: java.lang.Throwable -> Lae
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> Lae
            r0.getClass()     // Catch: java.lang.Throwable -> Lae
            java.lang.String r1 = "-"
            java.lang.String r4 = ""
            r5 = 0
            java.lang.String r0 = og.t.a0(r0, r1, r4, r5)     // Catch: java.lang.Throwable -> Lae
            okhttp3.MediaType r1 = gb.b.f4408a     // Catch: java.lang.Throwable -> Lae
            java.lang.String r1 = r2.f4449a     // Catch: java.lang.Throwable -> Lae
            java.lang.String r2 = r2.f4454f     // Catch: java.lang.Throwable -> Lae
            java.io.Serializable r0 = gb.b.k(r3, r1, r2, r0)     // Catch: java.lang.Throwable -> Lae
            boolean r1 = r0 instanceof sf.f     // Catch: java.lang.Throwable -> Lae
            if (r1 == 0) goto La0
            r0 = 0
        La0:
            java.lang.Long r0 = (java.lang.Long) r0     // Catch: java.lang.Throwable -> Lae
            java.lang.String r1 = r7.f4433a     // Catch: java.lang.Throwable -> Lae
            java.lang.String r2 = r7.f4434b     // Catch: java.lang.Throwable -> Lae
            boolean r7 = r7.f4435c     // Catch: java.lang.Throwable -> Lae
            gb.i r3 = new gb.i     // Catch: java.lang.Throwable -> Lae
            r3.<init>(r1, r2, r7, r0)     // Catch: java.lang.Throwable -> Lae
            goto Lb4
        Lae:
            r7 = move-exception
            sf.f r3 = new sf.f
            r3.<init>(r7)
        Lb4:
            sf.g r7 = new sf.g
            r7.<init>(r3)
            return r7
    }
}
