package xh;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class p extends yf.i implements fg.p {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f21733h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f21734i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f21735j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f21736k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ i.c f21737l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ i.c f21738m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ i.c f21739n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f21740o;

    public p(boolean r1, i0.a1 r2, i.c r3, i.c r4, i.c r5, i0.a1 r6, wf.c r7) {
            r0 = this;
            r0.f21735j = r1
            r0.f21736k = r2
            r0.f21737l = r3
            r0.f21738m = r4
            r0.f21739n = r5
            r0.f21740o = r6
            r1 = 2
            r0.<init>(r1, r7)
            return
    }

    @Override // yf.a
    public final wf.c create(java.lang.Object r9, wf.c r10) {
            r8 = this;
            xh.p r0 = new xh.p
            i.c r5 = r8.f21739n
            i0.a1 r6 = r8.f21740o
            boolean r1 = r8.f21735j
            i0.a1 r2 = r8.f21736k
            i.c r3 = r8.f21737l
            i.c r4 = r8.f21738m
            r7 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r0.f21734i = r9
            return r0
    }

    @Override // fg.p
    public final java.lang.Object invoke(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            qg.t r1 = (qg.t) r1
            wf.c r2 = (wf.c) r2
            wf.c r1 = r0.create(r1, r2)
            xh.p r1 = (xh.p) r1
            sf.n r2 = sf.n.f12433a
            java.lang.Object r1 = r1.invokeSuspend(r2)
            return r1
    }

    @Override // yf.a
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            r14 = this;
            java.lang.Object r0 = r14.f21734i
            qg.t r0 = (qg.t) r0
            int r1 = r14.f21733h
            sf.n r6 = sf.n.f12433a
            i0.a1 r7 = r14.f21736k
            r8 = 3
            r9 = 2
            r2 = 1
            i.c r10 = r14.f21739n
            i.c r11 = r14.f21738m
            r12 = 0
            xf.a r13 = xf.a.f21579g
            if (r1 == 0) goto L31
            if (r1 == r2) goto L2d
            if (r1 == r9) goto L28
            if (r1 != r8) goto L21
            f8.i.I0(r15)
            goto Laa
        L21:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            j8.o.A(r0)
            r0 = 0
            return r0
        L28:
            f8.i.I0(r15)
            goto L9f
        L2d:
            f8.i.I0(r15)
            goto L94
        L31:
            f8.i.I0(r15)
            boolean r1 = r14.f21735j
            if (r1 == 0) goto L5b
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r7.setValue(r1)
            wb.n3 r1 = new wb.n3
            r2 = 2
            r1.<init>(r11, r12, r2)
            qg.v.q(r0, r12, r1, r8)
            wb.n3 r1 = new wb.n3
            i.c r2 = r14.f21737l
            r3 = 3
            r1.<init>(r2, r12, r3)
            qg.v.q(r0, r12, r1, r8)
            wb.n3 r1 = new wb.n3
            r2 = 4
            r1.<init>(r10, r12, r2)
            qg.v.q(r0, r12, r1, r8)
            return r6
        L5b:
            java.lang.Object r1 = r7.getValue()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L68
            goto Lbc
        L68:
            wb.n3 r1 = new wb.n3
            r3 = 5
            r1.<init>(r11, r12, r3)
            qg.v.q(r0, r12, r1, r8)
            wb.n3 r1 = new wb.n3
            r3 = 6
            r1.<init>(r10, r12, r3)
            qg.v.q(r0, r12, r1, r8)
            java.lang.Float r1 = new java.lang.Float
            r0 = 0
            r1.<init>(r0)
            i.l1 r0 = sh.z.f12931c
            r14.f21734i = r12
            r14.f21733h = r2
            r2 = r0
            i.c r0 = r14.f21737l
            r3 = 0
            r5 = 12
            r4 = r14
            java.lang.Object r0 = i.c.c(r0, r1, r2, r3, r4, r5)
            if (r0 != r13) goto L94
            goto La9
        L94:
            r14.f21734i = r12
            r14.f21733h = r9
            java.lang.Object r0 = r11.f(r14)
            if (r0 != r13) goto L9f
            goto La9
        L9f:
            r14.f21734i = r12
            r14.f21733h = r8
            java.lang.Object r0 = r10.f(r14)
            if (r0 != r13) goto Laa
        La9:
            return r13
        Laa:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r7.setValue(r0)
            i0.a1 r0 = r14.f21740o
            java.lang.Object r0 = r0.getValue()
            fg.a r0 = (fg.a) r0
            if (r0 == 0) goto Lbc
            r0.invoke()
        Lbc:
            return r6
    }
}
