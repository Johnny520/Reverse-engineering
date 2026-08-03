package i;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class i1 extends yf.i implements fg.p {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f5689h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f5690i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f5691j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f5692k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f5693l;

    public i1(i.k1 r2, wf.c r3) {
            r1 = this;
            r0 = 0
            r1.f5689h = r0
            r1.f5693l = r2
            r2 = 2
            r1.<init>(r2, r3)
            return
    }

    public i1(xb.i r2, float r3, wf.c r4) {
            r1 = this;
            r0 = 1
            r1.f5689h = r0
            r1.f5693l = r2
            r1.f5692k = r3
            r2 = 2
            r1.<init>(r2, r4)
            return
    }

    @Override // yf.a
    public final wf.c create(java.lang.Object r4, wf.c r5) {
            r3 = this;
            int r0 = r3.f5689h
            switch(r0) {
                case 0: goto L13;
                default: goto L5;
            }
        L5:
            i.i1 r0 = new i.i1
            java.lang.Object r1 = r3.f5693l
            xb.i r1 = (xb.i) r1
            float r2 = r3.f5692k
            r0.<init>(r1, r2, r5)
            r0.f5691j = r4
            return r0
        L13:
            i.i1 r0 = new i.i1
            java.lang.Object r1 = r3.f5693l
            i.k1 r1 = (i.k1) r1
            r0.<init>(r1, r5)
            r0.f5691j = r4
            return r0
    }

    @Override // fg.p
    public final java.lang.Object invoke(java.lang.Object r2, java.lang.Object r3) {
            r1 = this;
            int r0 = r1.f5689h
            qg.t r2 = (qg.t) r2
            wf.c r3 = (wf.c) r3
            switch(r0) {
                case 0: goto L16;
                default: goto L9;
            }
        L9:
            wf.c r2 = r1.create(r2, r3)
            i.i1 r2 = (i.i1) r2
            sf.n r3 = sf.n.f12433a
            java.lang.Object r2 = r2.invokeSuspend(r3)
            return r2
        L16:
            wf.c r2 = r1.create(r2, r3)
            i.i1 r2 = (i.i1) r2
            sf.n r3 = sf.n.f12433a
            java.lang.Object r2 = r2.invokeSuspend(r3)
            return r2
    }

    @Override // yf.a
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            r6 = this;
            int r0 = r6.f5689h
            switch(r0) {
                case 0: goto L3d;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r6.f5691j
            qg.t r0 = (qg.t) r0
            int r1 = r6.f5690i
            r2 = 1
            if (r1 == 0) goto L1b
            if (r1 != r2) goto L14
            f8.i.I0(r7)
            goto L3a
        L14:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            j8.o.A(r7)
            r7 = 0
            goto L3c
        L1b:
            f8.i.I0(r7)
            java.lang.Object r7 = r6.f5693l
            xb.i r7 = (xb.i) r7
            k.h1 r1 = r7.f21497p
            xb.c r3 = new xb.c
            float r4 = r6.f5692k
            r5 = 0
            r3.<init>(r7, r4, r0, r5)
            r6.f5691j = r5
            r6.f5690i = r2
            java.lang.Object r7 = k.h1.b(r1, r3, r6)
            xf.a r0 = xf.a.f21579g
            if (r7 != r0) goto L3a
            r7 = r0
            goto L3c
        L3a:
            sf.n r7 = sf.n.f12433a
        L3c:
            return r7
        L3d:
            int r0 = r6.f5690i
            r1 = 1
            if (r0 == 0) goto L55
            if (r0 != r1) goto L4e
            float r0 = r6.f5692k
            java.lang.Object r2 = r6.f5691j
            qg.t r2 = (qg.t) r2
            f8.i.I0(r7)
            goto L65
        L4e:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            j8.o.A(r7)
            r7 = 0
            goto L8e
        L55:
            f8.i.I0(r7)
            java.lang.Object r7 = r6.f5691j
            qg.t r7 = (qg.t) r7
            wf.g r0 = r7.n()
            float r0 = i.d.n(r0)
            r2 = r7
        L65:
            boolean r7 = qg.v.o(r2)
            if (r7 == 0) goto L8c
            java.lang.Object r7 = r6.f5693l
            i.k1 r7 = (i.k1) r7
            i.h1 r3 = new i.h1
            r3.<init>(r7, r0)
            r6.f5691j = r2
            r6.f5692k = r0
            r6.f5690i = r1
            wf.g r7 = r6.getContext()
            i0.d r7 = i0.r.s(r7)
            java.lang.Object r7 = r7.d(r3, r6)
            xf.a r3 = xf.a.f21579g
            if (r7 != r3) goto L65
            r7 = r3
            goto L8e
        L8c:
            sf.n r7 = sf.n.f12433a
        L8e:
            return r7
    }
}
