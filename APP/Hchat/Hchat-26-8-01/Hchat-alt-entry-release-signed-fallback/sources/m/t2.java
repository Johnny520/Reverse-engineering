package m;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class t2 extends yf.h implements fg.p {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f8370g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f8371h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ qg.t f8372i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ m.t1 f8373j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ fg.l f8374k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ fg.l f8375l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ fg.q f8376m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ fg.l f8377n;

    public t2(qg.t r1, m.t1 r2, fg.l r3, fg.l r4, fg.q r5, fg.l r6, wf.c r7) {
            r0 = this;
            r0.f8372i = r1
            r0.f8373j = r2
            r0.f8374k = r3
            r0.f8375l = r4
            r0.f8376m = r5
            r0.f8377n = r6
            r0.<init>(r7)
            return
    }

    @Override // yf.a
    public final wf.c create(java.lang.Object r9, wf.c r10) {
            r8 = this;
            m.t2 r0 = new m.t2
            fg.q r5 = r8.f8376m
            fg.l r6 = r8.f8377n
            qg.t r1 = r8.f8372i
            m.t1 r2 = r8.f8373j
            fg.l r3 = r8.f8374k
            fg.l r4 = r8.f8375l
            r7 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r0.f8371h = r9
            return r0
    }

    @Override // fg.p
    public final java.lang.Object invoke(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            s1.k0 r1 = (s1.k0) r1
            wf.c r2 = (wf.c) r2
            wf.c r1 = r0.create(r1, r2)
            m.t2 r1 = (m.t2) r1
            sf.n r2 = sf.n.f12433a
            java.lang.Object r1 = r1.invokeSuspend(r2)
            return r1
    }

    @Override // yf.a
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            r10 = this;
            int r0 = r10.f8370g
            r1 = 1
            if (r0 == 0) goto L12
            if (r0 != r1) goto Lb
            f8.i.I0(r11)
            goto L32
        Lb:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            j8.o.A(r11)
            r11 = 0
            return r11
        L12:
            f8.i.I0(r11)
            java.lang.Object r11 = r10.f8371h
            r2 = r11
            s1.k0 r2 = (s1.k0) r2
            r10.f8370g = r1
            qg.t r3 = r10.f8372i
            m.t1 r4 = r10.f8373j
            fg.l r5 = r10.f8374k
            fg.l r6 = r10.f8375l
            fg.q r7 = r10.f8376m
            fg.l r8 = r10.f8377n
            r9 = r10
            java.lang.Object r11 = m.y2.g(r2, r3, r4, r5, r6, r7, r8, r9)
            xf.a r0 = xf.a.f21579g
            if (r11 != r0) goto L32
            return r0
        L32:
            sf.n r11 = sf.n.f12433a
            return r11
    }
}
