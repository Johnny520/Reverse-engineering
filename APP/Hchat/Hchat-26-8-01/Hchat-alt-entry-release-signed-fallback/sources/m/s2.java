package m;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class s2 extends yf.i implements fg.p {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f8361h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f8362i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ m.t1 f8363j;

    public /* synthetic */ s2(m.t1 r1, wf.c r2, int r3) {
            r0 = this;
            r0.f8361h = r3
            r0.f8363j = r1
            r1 = 2
            r0.<init>(r1, r2)
            return
    }

    @Override // yf.a
    public final wf.c create(java.lang.Object r3, wf.c r4) {
            r2 = this;
            int r3 = r2.f8361h
            switch(r3) {
                case 0: goto Le;
                default: goto L5;
            }
        L5:
            m.s2 r3 = new m.s2
            m.t1 r0 = r2.f8363j
            r1 = 1
            r3.<init>(r0, r4, r1)
            return r3
        Le:
            m.s2 r3 = new m.s2
            m.t1 r0 = r2.f8363j
            r1 = 0
            r3.<init>(r0, r4, r1)
            return r3
    }

    @Override // fg.p
    public final java.lang.Object invoke(java.lang.Object r2, java.lang.Object r3) {
            r1 = this;
            int r0 = r1.f8361h
            qg.t r2 = (qg.t) r2
            wf.c r3 = (wf.c) r3
            switch(r0) {
                case 0: goto L16;
                default: goto L9;
            }
        L9:
            wf.c r2 = r1.create(r2, r3)
            m.s2 r2 = (m.s2) r2
            sf.n r3 = sf.n.f12433a
            java.lang.Object r2 = r2.invokeSuspend(r3)
            return r2
        L16:
            wf.c r2 = r1.create(r2, r3)
            m.s2 r2 = (m.s2) r2
            sf.n r3 = sf.n.f12433a
            java.lang.Object r2 = r2.invokeSuspend(r3)
            return r2
    }

    @Override // yf.a
    public final java.lang.Object invokeSuspend(java.lang.Object r3) {
            r2 = this;
            int r0 = r2.f8361h
            switch(r0) {
                case 0: goto L2b;
                default: goto L5;
            }
        L5:
            int r0 = r2.f8362i
            r1 = 1
            if (r0 == 0) goto L17
            if (r0 != r1) goto L10
            f8.i.I0(r3)
            goto L28
        L10:
            java.lang.String r3 = "call to 'resume' before 'invoke' with coroutine"
            j8.o.A(r3)
            r3 = 0
            goto L2a
        L17:
            f8.i.I0(r3)
            r2.f8362i = r1
            m.t1 r3 = r2.f8363j
            java.lang.Object r3 = r3.j(r2)
            xf.a r0 = xf.a.f21579g
            if (r3 != r0) goto L28
            r3 = r0
            goto L2a
        L28:
            sf.n r3 = sf.n.f12433a
        L2a:
            return r3
        L2b:
            int r0 = r2.f8362i
            r1 = 1
            if (r0 == 0) goto L3d
            if (r0 != r1) goto L36
            f8.i.I0(r3)
            goto L4e
        L36:
            java.lang.String r3 = "call to 'resume' before 'invoke' with coroutine"
            j8.o.A(r3)
            r3 = 0
            goto L50
        L3d:
            f8.i.I0(r3)
            r2.f8362i = r1
            m.t1 r3 = r2.f8363j
            java.lang.Object r3 = r3.j(r2)
            xf.a r0 = xf.a.f21579g
            if (r3 != r0) goto L4e
            r3 = r0
            goto L50
        L4e:
            sf.n r3 = sf.n.f12433a
        L50:
            return r3
    }
}
