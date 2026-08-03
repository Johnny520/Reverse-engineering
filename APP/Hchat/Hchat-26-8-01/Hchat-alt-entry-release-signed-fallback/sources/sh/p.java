package sh;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class p extends yf.i implements fg.p {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f12761h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f12762i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f12763j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ n.k f12764k;

    public p(boolean r1, i0.a1 r2, n.k r3, wf.c r4) {
            r0 = this;
            r0.f12762i = r1
            r0.f12763j = r2
            r0.f12764k = r3
            r1 = 2
            r0.<init>(r1, r4)
            return
    }

    public static final java.lang.Object f(i0.a1 r4, n.k r5, yf.c r6) {
            boolean r0 = r6 instanceof sh.o
            if (r0 == 0) goto L13
            r0 = r6
            sh.o r0 = (sh.o) r0
            int r1 = r0.f12754i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f12754i = r1
            goto L18
        L13:
            sh.o r0 = new sh.o
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f12753h
            int r1 = r0.f12754i
            r2 = 1
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L27
            i0.a1 r4 = r0.f12752g
            f8.i.I0(r6)
            goto L4b
        L27:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            j8.o.A(r4)
            r4 = 0
            return r4
        L2e:
            f8.i.I0(r6)
            java.lang.Object r6 = r4.getValue()
            zh.a r6 = (zh.a) r6
            if (r6 == 0) goto L4f
            zh.b r6 = new zh.b
            r6.<init>()
            r0.f12752g = r4
            r0.f12754i = r2
            java.lang.Object r5 = r5.a(r6, r0)
            xf.a r6 = xf.a.f21579g
            if (r5 != r6) goto L4b
            return r6
        L4b:
            r5 = 0
            r4.setValue(r5)
        L4f:
            sf.n r4 = sf.n.f12433a
            return r4
    }

    @Override // yf.a
    public final wf.c create(java.lang.Object r4, wf.c r5) {
            r3 = this;
            sh.p r4 = new sh.p
            i0.a1 r0 = r3.f12763j
            n.k r1 = r3.f12764k
            boolean r2 = r3.f12762i
            r4.<init>(r2, r0, r1, r5)
            return r4
    }

    @Override // fg.p
    public final java.lang.Object invoke(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            qg.t r1 = (qg.t) r1
            wf.c r2 = (wf.c) r2
            wf.c r1 = r0.create(r1, r2)
            sh.p r1 = (sh.p) r1
            sf.n r2 = sf.n.f12433a
            java.lang.Object r1 = r1.invokeSuspend(r2)
            return r1
    }

    @Override // yf.a
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            r7 = this;
            int r0 = r7.f12761h
            i0.a1 r1 = r7.f12763j
            r2 = 3
            r3 = 2
            r4 = 1
            n.k r5 = r7.f12764k
            xf.a r6 = xf.a.f21579g
            if (r0 == 0) goto L23
            if (r0 == r4) goto L1f
            if (r0 == r3) goto L1b
            if (r0 != r2) goto L14
            goto L1b
        L14:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            j8.o.A(r8)
            r8 = 0
            return r8
        L1b:
            f8.i.I0(r8)
            goto L4d
        L1f:
            f8.i.I0(r8)
            goto L33
        L23:
            f8.i.I0(r8)
            boolean r8 = r7.f12762i
            if (r8 == 0) goto L44
            r7.f12761h = r4
            java.lang.Object r8 = f(r1, r5, r7)
            if (r8 != r6) goto L33
            goto L4c
        L33:
            zh.a r8 = new zh.a
            r8.<init>()
            r1.setValue(r8)
            r7.f12761h = r3
            java.lang.Object r8 = r5.a(r8, r7)
            if (r8 != r6) goto L4d
            goto L4c
        L44:
            r7.f12761h = r2
            java.lang.Object r8 = f(r1, r5, r7)
            if (r8 != r6) goto L4d
        L4c:
            return r6
        L4d:
            sf.n r8 = sf.n.f12433a
            return r8
    }
}
