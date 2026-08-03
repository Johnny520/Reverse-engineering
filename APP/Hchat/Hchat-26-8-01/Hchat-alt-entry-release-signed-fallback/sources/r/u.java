package r;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class u extends yf.i implements fg.p {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f11265h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f11266i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ r.z f11267j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f11268k;

    public u(r.z r1, int r2, wf.c r3) {
            r0 = this;
            r0.f11267j = r1
            r0.f11268k = r2
            r1 = 2
            r0.<init>(r1, r3)
            return
    }

    @Override // yf.a
    public final wf.c create(java.lang.Object r4, wf.c r5) {
            r3 = this;
            r.u r0 = new r.u
            r.z r1 = r3.f11267j
            int r2 = r3.f11268k
            r0.<init>(r1, r2, r5)
            r0.f11266i = r4
            return r0
    }

    @Override // fg.p
    public final java.lang.Object invoke(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            m.u1 r1 = (m.u1) r1
            wf.c r2 = (wf.c) r2
            wf.c r1 = r0.create(r1, r2)
            r.u r1 = (r.u) r1
            sf.n r2 = sf.n.f12433a
            java.lang.Object r1 = r1.invokeSuspend(r2)
            return r1
    }

    @Override // yf.a
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            r4 = this;
            int r0 = r4.f11265h
            r1 = 1
            if (r0 == 0) goto L12
            if (r0 != r1) goto Lb
            f8.i.I0(r5)
            goto L3a
        Lb:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            j8.o.A(r5)
            r5 = 0
            return r5
        L12:
            f8.i.I0(r5)
            java.lang.Object r5 = r4.f11266i
            m.u1 r5 = (m.u1) r5
            m.k2 r0 = new m.k2
            r2 = 1
            r.z r3 = r4.f11267j
            r0.<init>(r5, r2, r3)
            i0.j1 r5 = r3.f11285f
            java.lang.Object r5 = r5.getValue()
            r.p r5 = (r.p) r5
            u2.c r5 = r5.f11227i
            r4.f11265h = r1
            int r1 = r4.f11268k
            r2 = 100
            java.lang.Object r5 = s.r0.a(r0, r1, r2, r5, r4)
            xf.a r0 = xf.a.f21579g
            if (r5 != r0) goto L3a
            return r0
        L3a:
            sf.n r5 = sf.n.f12433a
            return r5
    }
}
