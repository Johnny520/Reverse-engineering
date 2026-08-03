package s;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class v0 extends yf.i implements fg.p {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f12117h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ s.w0 f12118i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f12119j;

    public v0(s.w0 r1, int r2, wf.c r3) {
            r0 = this;
            r0.f12118i = r1
            r0.f12119j = r2
            r1 = 2
            r0.<init>(r1, r3)
            return
    }

    @Override // yf.a
    public final wf.c create(java.lang.Object r3, wf.c r4) {
            r2 = this;
            s.v0 r3 = new s.v0
            s.w0 r0 = r2.f12118i
            int r1 = r2.f12119j
            r3.<init>(r0, r1, r4)
            return r3
    }

    @Override // fg.p
    public final java.lang.Object invoke(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            qg.t r1 = (qg.t) r1
            wf.c r2 = (wf.c) r2
            wf.c r1 = r0.create(r1, r2)
            s.v0 r1 = (s.v0) r1
            sf.n r2 = sf.n.f12433a
            java.lang.Object r1 = r1.invokeSuspend(r2)
            return r1
    }

    @Override // yf.a
    public final java.lang.Object invokeSuspend(java.lang.Object r4) {
            r3 = this;
            int r0 = r3.f12117h
            sf.n r1 = sf.n.f12433a
            r2 = 1
            if (r0 == 0) goto L14
            if (r0 != r2) goto Ld
            f8.i.I0(r4)
            return r1
        Ld:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            j8.o.A(r4)
            r4 = 0
            return r4
        L14:
            f8.i.I0(r4)
            s.w0 r4 = r3.f12118i
            r.f r4 = r4.f12122v
            r3.f12117h = r2
            r.z r4 = r4.f11163b
            int r0 = r3.f12119j
            java.lang.Object r4 = r.z.m(r4, r0, r3)
            xf.a r0 = xf.a.f21579g
            if (r4 != r0) goto L2a
            goto L2b
        L2a:
            r4 = r1
        L2b:
            if (r4 != r0) goto L2e
            return r0
        L2e:
            return r1
    }
}
