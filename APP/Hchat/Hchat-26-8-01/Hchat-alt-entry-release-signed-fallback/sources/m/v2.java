package m;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class v2 extends yf.i implements fg.p {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f8406h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f8407i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ fg.q f8408j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ m.t1 f8409k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ s1.t f8410l;

    public /* synthetic */ v2(fg.q r1, m.t1 r2, s1.t r3, wf.c r4, int r5) {
            r0 = this;
            r0.f8406h = r5
            r0.f8408j = r1
            r0.f8409k = r2
            r0.f8410l = r3
            r1 = 2
            r0.<init>(r1, r4)
            return
    }

    @Override // yf.a
    public final wf.c create(java.lang.Object r8, wf.c r9) {
            r7 = this;
            int r8 = r7.f8406h
            switch(r8) {
                case 0: goto L13;
                default: goto L5;
            }
        L5:
            m.v2 r0 = new m.v2
            s1.t r3 = r7.f8410l
            r5 = 1
            fg.q r1 = r7.f8408j
            m.t1 r2 = r7.f8409k
            r4 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            return r0
        L13:
            r4 = r9
            m.v2 r1 = new m.v2
            r5 = r4
            s1.t r4 = r7.f8410l
            r6 = 0
            fg.q r2 = r7.f8408j
            m.t1 r3 = r7.f8409k
            r1.<init>(r2, r3, r4, r5, r6)
            return r1
    }

    @Override // fg.p
    public final java.lang.Object invoke(java.lang.Object r2, java.lang.Object r3) {
            r1 = this;
            int r0 = r1.f8406h
            qg.t r2 = (qg.t) r2
            wf.c r3 = (wf.c) r3
            switch(r0) {
                case 0: goto L16;
                default: goto L9;
            }
        L9:
            wf.c r2 = r1.create(r2, r3)
            m.v2 r2 = (m.v2) r2
            sf.n r3 = sf.n.f12433a
            java.lang.Object r2 = r2.invokeSuspend(r3)
            return r2
        L16:
            wf.c r2 = r1.create(r2, r3)
            m.v2 r2 = (m.v2) r2
            sf.n r3 = sf.n.f12433a
            java.lang.Object r2 = r2.invokeSuspend(r3)
            return r2
    }

    @Override // yf.a
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            r4 = this;
            int r0 = r4.f8406h
            switch(r0) {
                case 0: goto L36;
                default: goto L5;
            }
        L5:
            int r0 = r4.f8407i
            r1 = 1
            if (r0 == 0) goto L17
            if (r0 != r1) goto L10
            f8.i.I0(r5)
            goto L33
        L10:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            j8.o.A(r5)
            r5 = 0
            goto L35
        L17:
            f8.i.I0(r5)
            s1.t r5 = r4.f8410l
            long r2 = r5.f12293c
            e1.b r5 = new e1.b
            r5.<init>(r2)
            r4.f8407i = r1
            fg.q r0 = r4.f8408j
            m.t1 r1 = r4.f8409k
            java.lang.Object r5 = r0.b(r1, r5, r4)
            xf.a r0 = xf.a.f21579g
            if (r5 != r0) goto L33
            r5 = r0
            goto L35
        L33:
            sf.n r5 = sf.n.f12433a
        L35:
            return r5
        L36:
            int r0 = r4.f8407i
            r1 = 1
            if (r0 == 0) goto L48
            if (r0 != r1) goto L41
            f8.i.I0(r5)
            goto L64
        L41:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            j8.o.A(r5)
            r5 = 0
            goto L66
        L48:
            f8.i.I0(r5)
            s1.t r5 = r4.f8410l
            long r2 = r5.f12293c
            e1.b r5 = new e1.b
            r5.<init>(r2)
            r4.f8407i = r1
            fg.q r0 = r4.f8408j
            m.t1 r1 = r4.f8409k
            java.lang.Object r5 = r0.b(r1, r5, r4)
            xf.a r0 = xf.a.f21579g
            if (r5 != r0) goto L64
            r5 = r0
            goto L66
        L64:
            sf.n r5 = sf.n.f12433a
        L66:
            return r5
    }
}
