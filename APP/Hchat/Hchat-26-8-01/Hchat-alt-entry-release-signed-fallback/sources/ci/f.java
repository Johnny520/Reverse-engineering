package ci;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends yf.i implements fg.q {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f1699h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public /* synthetic */ m.q1 f1700i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public /* synthetic */ long f1701j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ ci.l0 f1702k;

    public f(ci.l0 r1, wf.c r2) {
            r0 = this;
            r0.f1702k = r1
            r1 = 3
            r0.<init>(r1, r2)
            return
    }

    @Override // fg.q
    public final java.lang.Object b(java.lang.Object r4, java.lang.Object r5, java.lang.Object r6) {
            r3 = this;
            m.q1 r4 = (m.q1) r4
            e1.b r5 = (e1.b) r5
            long r0 = r5.f2294a
            wf.c r6 = (wf.c) r6
            ci.f r5 = new ci.f
            ci.l0 r2 = r3.f1702k
            r5.<init>(r2, r6)
            r5.f1700i = r4
            r5.f1701j = r0
            sf.n r4 = sf.n.f12433a
            java.lang.Object r4 = r5.invokeSuspend(r4)
            return r4
    }

    @Override // yf.a
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            r8 = this;
            m.q1 r1 = r8.f1700i
            long r2 = r8.f1701j
            int r0 = r8.f1699h
            sf.n r7 = sf.n.f12433a
            r4 = 1
            if (r0 == 0) goto L18
            if (r0 != r4) goto L11
            f8.i.I0(r9)
            return r7
        L11:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            j8.o.A(r9)
            r9 = 0
            return r9
        L18:
            f8.i.I0(r9)
            ci.l0 r5 = r8.f1702k
            boolean r9 = r5.f1747y
            if (r9 == 0) goto L3f
            r9 = 0
            r8.f1700i = r9
            r8.f1701j = r2
            r8.f1699h = r4
            n.k r4 = r5.f1745w
            xf.a r9 = xf.a.f21579g
            if (r4 == 0) goto L3b
            ci.g r0 = new ci.g
            r6 = 0
            r0.<init>(r1, r2, r4, r5, r6)
            java.lang.Object r0 = qg.v.e(r0, r8)
            if (r0 != r9) goto L3b
            goto L3c
        L3b:
            r0 = r7
        L3c:
            if (r0 != r9) goto L3f
            return r9
        L3f:
            return r7
    }
}
