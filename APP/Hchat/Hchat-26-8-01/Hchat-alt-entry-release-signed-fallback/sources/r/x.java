package r;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class x extends yf.i implements fg.p {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f11271h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ r.z f11272i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f11273j;

    public x(r.z r2, int r3, wf.c r4) {
            r1 = this;
            r0 = 1
            r1.f11271h = r0
            r1.f11272i = r2
            r1.f11273j = r3
            r2 = 2
            r1.<init>(r2, r4)
            return
    }

    public x(r.z r2, wf.c r3) {
            r1 = this;
            r0 = 0
            r1.f11271h = r0
            r1.f11272i = r2
            r2 = 2
            r1.<init>(r2, r3)
            return
    }

    @Override // yf.a
    public final wf.c create(java.lang.Object r3, wf.c r4) {
            r2 = this;
            int r3 = r2.f11271h
            switch(r3) {
                case 0: goto Lf;
                default: goto L5;
            }
        L5:
            r.x r3 = new r.x
            r.z r0 = r2.f11272i
            int r1 = r2.f11273j
            r3.<init>(r0, r1, r4)
            return r3
        Lf:
            r.x r3 = new r.x
            r.z r0 = r2.f11272i
            r3.<init>(r0, r4)
            return r3
    }

    @Override // fg.p
    public final java.lang.Object invoke(java.lang.Object r2, java.lang.Object r3) {
            r1 = this;
            int r0 = r1.f11271h
            switch(r0) {
                case 0: goto L15;
                default: goto L5;
            }
        L5:
            m.u1 r2 = (m.u1) r2
            wf.c r3 = (wf.c) r3
            wf.c r2 = r1.create(r2, r3)
            r.x r2 = (r.x) r2
            sf.n r3 = sf.n.f12433a
            r2.invokeSuspend(r3)
            return r3
        L15:
            qg.t r2 = (qg.t) r2
            wf.c r3 = (wf.c) r3
            wf.c r2 = r1.create(r2, r3)
            r.x r2 = (r.x) r2
            sf.n r3 = sf.n.f12433a
            java.lang.Object r2 = r2.invokeSuspend(r3)
            return r2
    }

    @Override // yf.a
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            r4 = this;
            int r0 = r4.f11271h
            switch(r0) {
                case 0: goto L13;
                default: goto L5;
            }
        L5:
            f8.i.I0(r5)
            int r5 = r4.f11273j
            r0 = 1
            r.z r1 = r4.f11272i
            r1.n(r5, r0)
            sf.n r5 = sf.n.f12433a
            return r5
        L13:
            int r0 = r4.f11273j
            r1 = 1
            if (r0 == 0) goto L25
            if (r0 != r1) goto L1e
            f8.i.I0(r5)
            goto L40
        L1e:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            j8.o.A(r5)
            r5 = 0
            goto L42
        L25:
            f8.i.I0(r5)
            r.w r5 = new r.w
            r0 = 2
            r2 = 0
            r3 = 0
            r5.<init>(r0, r3, r2)
            r4.f11273j = r1
            k.d1 r0 = k.d1.f6939g
            r.z r1 = r4.f11272i
            java.lang.Object r5 = r1.b(r0, r5, r4)
            xf.a r0 = xf.a.f21579g
            if (r5 != r0) goto L40
            r5 = r0
            goto L42
        L40:
            sf.n r5 = sf.n.f12433a
        L42:
            return r5
    }
}
