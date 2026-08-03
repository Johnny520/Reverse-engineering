package h;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class b1 extends yf.i implements fg.p {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f4615h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f4616i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ long f4617j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f4618k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ y0.n f4619l;

    public b1(h.a1 r2, long r3, h.d1 r5, wf.c r6) {
            r1 = this;
            r0 = 0
            r1.f4615h = r0
            r1.f4618k = r2
            r1.f4617j = r3
            r1.f4619l = r5
            r2 = 2
            r1.<init>(r2, r6)
            return
    }

    public b1(m.t0 r2, long r3, wf.c r5) {
            r1 = this;
            r0 = 1
            r1.f4615h = r0
            r1.f4619l = r2
            r1.f4617j = r3
            r2 = 2
            r1.<init>(r2, r5)
            return
    }

    @Override // yf.a
    public final wf.c create(java.lang.Object r11, wf.c r12) {
            r10 = this;
            int r0 = r10.f4615h
            switch(r0) {
                case 0: goto L13;
                default: goto L5;
            }
        L5:
            h.b1 r0 = new h.b1
            y0.n r1 = r10.f4619l
            m.t0 r1 = (m.t0) r1
            long r2 = r10.f4617j
            r0.<init>(r1, r2, r12)
            r0.f4618k = r11
            return r0
        L13:
            h.b1 r4 = new h.b1
            java.lang.Object r11 = r10.f4618k
            r5 = r11
            h.a1 r5 = (h.a1) r5
            y0.n r11 = r10.f4619l
            r8 = r11
            h.d1 r8 = (h.d1) r8
            long r6 = r10.f4617j
            r9 = r12
            r4.<init>(r5, r6, r8, r9)
            return r4
    }

    @Override // fg.p
    public final java.lang.Object invoke(java.lang.Object r2, java.lang.Object r3) {
            r1 = this;
            int r0 = r1.f4615h
            qg.t r2 = (qg.t) r2
            wf.c r3 = (wf.c) r3
            switch(r0) {
                case 0: goto L16;
                default: goto L9;
            }
        L9:
            wf.c r2 = r1.create(r2, r3)
            h.b1 r2 = (h.b1) r2
            sf.n r3 = sf.n.f12433a
            java.lang.Object r2 = r2.invokeSuspend(r3)
            return r2
        L16:
            wf.c r2 = r1.create(r2, r3)
            h.b1 r2 = (h.b1) r2
            sf.n r3 = sf.n.f12433a
            java.lang.Object r2 = r2.invokeSuspend(r3)
            return r2
    }

    @Override // yf.a
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            r6 = this;
            int r0 = r6.f4615h
            switch(r0) {
                case 0: goto L3a;
                default: goto L5;
            }
        L5:
            int r0 = r6.f4616i
            r1 = 1
            if (r0 == 0) goto L17
            if (r0 != r1) goto L10
            f8.i.I0(r7)
            goto L37
        L10:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            j8.o.A(r7)
            r7 = 0
            goto L39
        L17:
            f8.i.I0(r7)
            java.lang.Object r7 = r6.f4618k
            qg.t r7 = (qg.t) r7
            y0.n r0 = r6.f4619l
            m.t0 r0 = (m.t0) r0
            fg.q r0 = r0.R
            e1.b r2 = new e1.b
            long r3 = r6.f4617j
            r2.<init>(r3)
            r6.f4616i = r1
            java.lang.Object r7 = r0.b(r7, r2, r6)
            xf.a r0 = xf.a.f21579g
            if (r7 != r0) goto L37
            r7 = r0
            goto L39
        L37:
            sf.n r7 = sf.n.f12433a
        L39:
            return r7
        L3a:
            y0.n r0 = r6.f4619l
            h.d1 r0 = (h.d1) r0
            java.lang.Object r1 = r6.f4618k
            h.a1 r1 = (h.a1) r1
            int r2 = r6.f4616i
            r3 = 1
            if (r2 == 0) goto L54
            if (r2 != r3) goto L4d
            f8.i.I0(r7)
            goto L73
        L4d:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            j8.o.A(r7)
            r7 = 0
            goto L79
        L54:
            f8.i.I0(r7)
            i.c r7 = r1.f4612a
            u2.l r1 = new u2.l
            long r4 = r6.f4617j
            r1.<init>(r4)
            i.r0 r2 = r0.f4644v
            r6.f4616i = r3
            r3 = 0
            r5 = 12
            r4 = r6
            r0 = r7
            java.lang.Object r7 = i.c.c(r0, r1, r2, r3, r4, r5)
            xf.a r0 = xf.a.f21579g
            if (r7 != r0) goto L73
            r7 = r0
            goto L79
        L73:
            i.i r7 = (i.i) r7
            i.h r7 = r7.f5687b
            sf.n r7 = sf.n.f12433a
        L79:
            return r7
    }
}
