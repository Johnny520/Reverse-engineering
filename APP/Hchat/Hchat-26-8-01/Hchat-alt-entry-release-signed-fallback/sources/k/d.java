package k;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends yf.i implements fg.p {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f6930h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f6931i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ n.k f6932j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ n.m f6933k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ k.g f6934l;

    public /* synthetic */ d(n.k r1, n.m r2, k.g r3, wf.c r4, int r5) {
            r0 = this;
            r0.f6930h = r5
            r0.f6932j = r1
            r0.f6933k = r2
            r0.f6934l = r3
            r1 = 2
            r0.<init>(r1, r4)
            return
    }

    @Override // yf.a
    public final wf.c create(java.lang.Object r8, wf.c r9) {
            r7 = this;
            int r8 = r7.f6930h
            switch(r8) {
                case 0: goto L13;
                default: goto L5;
            }
        L5:
            k.d r0 = new k.d
            k.g r3 = r7.f6934l
            r5 = 1
            n.k r1 = r7.f6932j
            n.m r2 = r7.f6933k
            r4 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            return r0
        L13:
            r4 = r9
            k.d r1 = new k.d
            r5 = r4
            k.g r4 = r7.f6934l
            r6 = 0
            n.k r2 = r7.f6932j
            n.m r3 = r7.f6933k
            r1.<init>(r2, r3, r4, r5, r6)
            return r1
    }

    @Override // fg.p
    public final java.lang.Object invoke(java.lang.Object r2, java.lang.Object r3) {
            r1 = this;
            int r0 = r1.f6930h
            qg.t r2 = (qg.t) r2
            wf.c r3 = (wf.c) r3
            switch(r0) {
                case 0: goto L16;
                default: goto L9;
            }
        L9:
            wf.c r2 = r1.create(r2, r3)
            k.d r2 = (k.d) r2
            sf.n r3 = sf.n.f12433a
            java.lang.Object r2 = r2.invokeSuspend(r3)
            return r2
        L16:
            wf.c r2 = r1.create(r2, r3)
            k.d r2 = (k.d) r2
            sf.n r3 = sf.n.f12433a
            java.lang.Object r2 = r2.invokeSuspend(r3)
            return r2
    }

    @Override // yf.a
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            r7 = this;
            int r0 = r7.f6930h
            switch(r0) {
                case 0: goto L42;
                default: goto L5;
            }
        L5:
            int r0 = r7.f6931i
            n.m r1 = r7.f6933k
            r2 = 2
            r3 = 1
            xf.a r4 = xf.a.f21579g
            if (r0 == 0) goto L22
            if (r0 == r3) goto L1e
            if (r0 != r2) goto L17
            f8.i.I0(r8)
            goto L3b
        L17:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            j8.o.A(r8)
            r4 = 0
            goto L41
        L1e:
            f8.i.I0(r8)
            goto L30
        L22:
            f8.i.I0(r8)
            long r5 = k.x.f7102a
            r7.f6931i = r3
            java.lang.Object r8 = qg.v.f(r5, r7)
            if (r8 != r4) goto L30
            goto L41
        L30:
            r7.f6931i = r2
            n.k r8 = r7.f6932j
            java.lang.Object r8 = r8.a(r1, r7)
            if (r8 != r4) goto L3b
            goto L41
        L3b:
            k.g r8 = r7.f6934l
            r8.I = r1
            sf.n r4 = sf.n.f12433a
        L41:
            return r4
        L42:
            int r0 = r7.f6931i
            n.m r1 = r7.f6933k
            r2 = 2
            r3 = 1
            xf.a r4 = xf.a.f21579g
            if (r0 == 0) goto L5f
            if (r0 == r3) goto L5b
            if (r0 != r2) goto L54
            f8.i.I0(r8)
            goto L78
        L54:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            j8.o.A(r8)
            r4 = 0
            goto L7e
        L5b:
            f8.i.I0(r8)
            goto L6d
        L5f:
            f8.i.I0(r8)
            long r5 = k.x.f7102a
            r7.f6931i = r3
            java.lang.Object r8 = qg.v.f(r5, r7)
            if (r8 != r4) goto L6d
            goto L7e
        L6d:
            r7.f6931i = r2
            n.k r8 = r7.f6932j
            java.lang.Object r8 = r8.a(r1, r7)
            if (r8 != r4) goto L78
            goto L7e
        L78:
            k.g r8 = r7.f6934l
            r8.L = r1
            sf.n r4 = sf.n.f12433a
        L7e:
            return r4
    }
}
