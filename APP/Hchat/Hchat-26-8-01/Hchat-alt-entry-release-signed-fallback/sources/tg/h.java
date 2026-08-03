package tg;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends yf.i implements fg.q {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f13205h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public /* synthetic */ tg.e f13206i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f13207j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ yf.i f13208k;

    public h(fg.p r1, wf.c r2) {
            r0 = this;
            yf.i r1 = (yf.i) r1
            r0.f13208k = r1
            r1 = 3
            r0.<init>(r1, r2)
            return
    }

    @Override // fg.q
    public final java.lang.Object b(java.lang.Object r3, java.lang.Object r4, java.lang.Object r5) {
            r2 = this;
            tg.e r3 = (tg.e) r3
            wf.c r5 = (wf.c) r5
            tg.h r0 = new tg.h
            yf.i r1 = r2.f13208k
            r0.<init>(r1, r5)
            r0.f13206i = r3
            r0.f13207j = r4
            sf.n r3 = sf.n.f12433a
            java.lang.Object r3 = r0.invokeSuspend(r3)
            return r3
    }

    @Override // yf.a
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            r4 = this;
            int r0 = r4.f13205h
            r1 = 2
            r2 = 1
            xf.a r3 = xf.a.f21579g
            if (r0 == 0) goto L1d
            if (r0 == r2) goto L17
            if (r0 != r1) goto L10
            f8.i.I0(r5)
            goto L3d
        L10:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            j8.o.A(r5)
            r5 = 0
            return r5
        L17:
            tg.e r0 = r4.f13206i
            f8.i.I0(r5)
            goto L31
        L1d:
            f8.i.I0(r5)
            tg.e r0 = r4.f13206i
            java.lang.Object r5 = r4.f13207j
            r4.f13206i = r0
            r4.f13205h = r2
            yf.i r2 = r4.f13208k
            java.lang.Object r5 = r2.invoke(r5, r4)
            if (r5 != r3) goto L31
            goto L3c
        L31:
            r2 = 0
            r4.f13206i = r2
            r4.f13205h = r1
            java.lang.Object r5 = r0.e(r5, r4)
            if (r5 != r3) goto L3d
        L3c:
            return r3
        L3d:
            sf.n r5 = sf.n.f12433a
            return r5
    }
}
