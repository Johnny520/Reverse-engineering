package k;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends yf.i implements fg.p {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f6947h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ k.g f6948i;

    public /* synthetic */ f(k.g r1, wf.c r2, int r3) {
            r0 = this;
            r0.f6947h = r3
            r0.f6948i = r1
            r1 = 2
            r0.<init>(r1, r2)
            return
    }

    @Override // yf.a
    public final wf.c create(java.lang.Object r3, wf.c r4) {
            r2 = this;
            int r3 = r2.f6947h
            switch(r3) {
                case 0: goto Le;
                default: goto L5;
            }
        L5:
            k.f r3 = new k.f
            k.g r0 = r2.f6948i
            r1 = 1
            r3.<init>(r0, r4, r1)
            return r3
        Le:
            k.f r3 = new k.f
            k.g r0 = r2.f6948i
            r1 = 0
            r3.<init>(r0, r4, r1)
            return r3
    }

    @Override // fg.p
    public final java.lang.Object invoke(java.lang.Object r2, java.lang.Object r3) {
            r1 = this;
            int r0 = r1.f6947h
            qg.t r2 = (qg.t) r2
            wf.c r3 = (wf.c) r3
            switch(r0) {
                case 0: goto L15;
                default: goto L9;
            }
        L9:
            wf.c r2 = r1.create(r2, r3)
            k.f r2 = (k.f) r2
            sf.n r3 = sf.n.f12433a
            r2.invokeSuspend(r3)
            return r3
        L15:
            wf.c r2 = r1.create(r2, r3)
            k.f r2 = (k.f) r2
            sf.n r3 = sf.n.f12433a
            r2.invokeSuspend(r3)
            return r3
    }

    @Override // yf.a
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            r6 = this;
            int r0 = r6.f6947h
            switch(r0) {
                case 0: goto L2b;
                default: goto L5;
            }
        L5:
            f8.i.I0(r7)
            k.g r7 = r6.f6948i
            n.h r0 = r7.J
            if (r0 == 0) goto L28
            n.i r1 = new n.i
            r1.<init>(r0)
            n.k r0 = r7.f6954w
            r2 = 0
            if (r0 == 0) goto L26
            qg.t r3 = r7.Y0()
            ci.j r4 = new ci.j
            r5 = 7
            r4.<init>(r0, r1, r2, r5)
            r0 = 3
            qg.v.q(r3, r2, r4, r0)
        L26:
            r7.J = r2
        L28:
            sf.n r7 = sf.n.f12433a
            return r7
        L2b:
            f8.i.I0(r7)
            k.g r7 = r6.f6948i
            n.h r0 = r7.J
            if (r0 != 0) goto L4e
            n.h r0 = new n.h
            r0.<init>()
            n.k r1 = r7.f6954w
            if (r1 == 0) goto L4c
            qg.t r2 = r7.Y0()
            ci.j r3 = new ci.j
            r4 = 6
            r5 = 0
            r3.<init>(r1, r0, r5, r4)
            r1 = 3
            qg.v.q(r2, r5, r3, r1)
        L4c:
            r7.J = r0
        L4e:
            sf.n r7 = sf.n.f12433a
            return r7
    }
}
