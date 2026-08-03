package ci;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends yf.i implements fg.p {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f1718h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f1719i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f1720j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ qg.r0 f1721k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ yf.i f1722l;

    public h(qg.r0 r1, fg.p r2, wf.c r3, int r4) {
            r0 = this;
            r0.f1718h = r4
            switch(r4) {
                case 1: goto L10;
                default: goto L5;
            }
        L5:
            r0.f1721k = r1
            yf.i r2 = (yf.i) r2
            r0.f1722l = r2
            r1 = 2
            r0.<init>(r1, r3)
            return
        L10:
            r0.f1721k = r1
            yf.i r2 = (yf.i) r2
            r0.f1722l = r2
            r1 = 2
            r0.<init>(r1, r3)
            return
    }

    @Override // yf.a
    public final wf.c create(java.lang.Object r5, wf.c r6) {
            r4 = this;
            int r0 = r4.f1718h
            switch(r0) {
                case 0: goto L12;
                default: goto L5;
            }
        L5:
            ci.h r0 = new ci.h
            yf.i r1 = r4.f1722l
            r2 = 1
            qg.r0 r3 = r4.f1721k
            r0.<init>(r3, r1, r6, r2)
            r0.f1720j = r5
            return r0
        L12:
            ci.h r0 = new ci.h
            yf.i r1 = r4.f1722l
            r2 = 0
            qg.r0 r3 = r4.f1721k
            r0.<init>(r3, r1, r6, r2)
            r0.f1720j = r5
            return r0
    }

    @Override // fg.p
    public final java.lang.Object invoke(java.lang.Object r2, java.lang.Object r3) {
            r1 = this;
            int r0 = r1.f1718h
            qg.t r2 = (qg.t) r2
            wf.c r3 = (wf.c) r3
            switch(r0) {
                case 0: goto L16;
                default: goto L9;
            }
        L9:
            wf.c r2 = r1.create(r2, r3)
            ci.h r2 = (ci.h) r2
            sf.n r3 = sf.n.f12433a
            java.lang.Object r2 = r2.invokeSuspend(r3)
            return r2
        L16:
            wf.c r2 = r1.create(r2, r3)
            ci.h r2 = (ci.h) r2
            sf.n r3 = sf.n.f12433a
            java.lang.Object r2 = r2.invokeSuspend(r3)
            return r2
    }

    @Override // yf.a
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            r5 = this;
            int r0 = r5.f1718h
            switch(r0) {
                case 0: goto L4a;
                default: goto L5;
            }
        L5:
            int r0 = r5.f1719i
            r1 = 2
            r2 = 1
            xf.a r3 = xf.a.f21579g
            if (r0 == 0) goto L24
            if (r0 == r2) goto L1c
            if (r0 != r1) goto L15
            f8.i.I0(r6)
            goto L47
        L15:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            j8.o.A(r6)
            r3 = 0
            goto L49
        L1c:
            java.lang.Object r0 = r5.f1720j
            qg.t r0 = (qg.t) r0
            f8.i.I0(r6)
            goto L39
        L24:
            f8.i.I0(r6)
            java.lang.Object r6 = r5.f1720j
            r0 = r6
            qg.t r0 = (qg.t) r0
            r5.f1720j = r0
            r5.f1719i = r2
            qg.r0 r6 = r5.f1721k
            java.lang.Object r6 = r6.g(r5)
            if (r6 != r3) goto L39
            goto L49
        L39:
            r6 = 0
            r5.f1720j = r6
            r5.f1719i = r1
            yf.i r6 = r5.f1722l
            java.lang.Object r6 = r6.invoke(r0, r5)
            if (r6 != r3) goto L47
            goto L49
        L47:
            sf.n r3 = sf.n.f12433a
        L49:
            return r3
        L4a:
            java.lang.Object r0 = r5.f1720j
            qg.t r0 = (qg.t) r0
            int r1 = r5.f1719i
            r2 = 2
            r3 = 1
            xf.a r4 = xf.a.f21579g
            if (r1 == 0) goto L69
            if (r1 == r3) goto L65
            if (r1 != r2) goto L5e
            f8.i.I0(r6)
            goto L87
        L5e:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            j8.o.A(r6)
            r4 = 0
            goto L89
        L65:
            f8.i.I0(r6)
            goto L79
        L69:
            f8.i.I0(r6)
            r5.f1720j = r0
            r5.f1719i = r3
            qg.r0 r6 = r5.f1721k
            java.lang.Object r6 = r6.g(r5)
            if (r6 != r4) goto L79
            goto L89
        L79:
            r6 = 0
            r5.f1720j = r6
            r5.f1719i = r2
            yf.i r6 = r5.f1722l
            java.lang.Object r6 = r6.invoke(r0, r5)
            if (r6 != r4) goto L87
            goto L89
        L87:
            sf.n r4 = sf.n.f12433a
        L89:
            return r4
    }
}
