package xb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends yf.i implements fg.p {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f21457h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f21458i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ xb.i f21459j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ float f21460k;

    public /* synthetic */ a(xb.i r1, float r2, wf.c r3, int r4) {
            r0 = this;
            r0.f21457h = r4
            r0.f21459j = r1
            r0.f21460k = r2
            r1 = 2
            r0.<init>(r1, r3)
            return
    }

    @Override // yf.a
    public final wf.c create(java.lang.Object r4, wf.c r5) {
            r3 = this;
            int r4 = r3.f21457h
            switch(r4) {
                case 0: goto L1b;
                case 1: goto L10;
                default: goto L5;
            }
        L5:
            xb.a r4 = new xb.a
            float r0 = r3.f21460k
            r1 = 2
            xb.i r2 = r3.f21459j
            r4.<init>(r2, r0, r5, r1)
            return r4
        L10:
            xb.a r4 = new xb.a
            float r0 = r3.f21460k
            r1 = 1
            xb.i r2 = r3.f21459j
            r4.<init>(r2, r0, r5, r1)
            return r4
        L1b:
            xb.a r4 = new xb.a
            float r0 = r3.f21460k
            r1 = 0
            xb.i r2 = r3.f21459j
            r4.<init>(r2, r0, r5, r1)
            return r4
    }

    @Override // fg.p
    public final java.lang.Object invoke(java.lang.Object r2, java.lang.Object r3) {
            r1 = this;
            int r0 = r1.f21457h
            qg.t r2 = (qg.t) r2
            wf.c r3 = (wf.c) r3
            switch(r0) {
                case 0: goto L23;
                case 1: goto L16;
                default: goto L9;
            }
        L9:
            wf.c r2 = r1.create(r2, r3)
            xb.a r2 = (xb.a) r2
            sf.n r3 = sf.n.f12433a
            java.lang.Object r2 = r2.invokeSuspend(r3)
            return r2
        L16:
            wf.c r2 = r1.create(r2, r3)
            xb.a r2 = (xb.a) r2
            sf.n r3 = sf.n.f12433a
            java.lang.Object r2 = r2.invokeSuspend(r3)
            return r2
        L23:
            wf.c r2 = r1.create(r2, r3)
            xb.a r2 = (xb.a) r2
            sf.n r3 = sf.n.f12433a
            java.lang.Object r2 = r2.invokeSuspend(r3)
            return r2
    }

    @Override // yf.a
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            r8 = this;
            int r0 = r8.f21457h
            switch(r0) {
                case 0: goto L79;
                case 1: goto L3d;
                default: goto L5;
            }
        L5:
            int r0 = r8.f21458i
            r1 = 1
            if (r0 == 0) goto L19
            if (r0 != r1) goto L11
            f8.i.I0(r9)
            r4 = r8
            goto L3a
        L11:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            j8.o.A(r9)
            r9 = 0
            r4 = r8
            goto L3c
        L19:
            f8.i.I0(r9)
            xb.i r9 = r8.f21459j
            i.c r2 = r9.f21493l
            java.lang.Float r3 = new java.lang.Float
            float r0 = r8.f21460k
            r3.<init>(r0)
            i.r0 r4 = r9.f21488g
            r8.f21458i = r1
            r5 = 0
            r7 = 12
            r6 = r8
            java.lang.Object r9 = i.c.c(r2, r3, r4, r5, r6, r7)
            r4 = r6
            xf.a r0 = xf.a.f21579g
            if (r9 != r0) goto L3a
            r9 = r0
            goto L3c
        L3a:
            sf.n r9 = sf.n.f12433a
        L3c:
            return r9
        L3d:
            r4 = r8
            int r0 = r4.f21458i
            r1 = 1
            if (r0 == 0) goto L50
            if (r0 != r1) goto L49
            f8.i.I0(r9)
            goto L76
        L49:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            j8.o.A(r9)
            r9 = 0
            goto L78
        L50:
            f8.i.I0(r9)
            xb.i r9 = r4.f21459j
            i.c r0 = r9.f21492k
            r2 = r1
            java.lang.Float r1 = new java.lang.Float
            float r3 = r4.f21460k
            r1.<init>(r3)
            r3 = r2
            i.r0 r2 = r9.f21487f
            r5 = r3
            wb.f3 r3 = new wb.f3
            r6 = 5
            r3.<init>(r9, r6)
            r4.f21458i = r5
            r5 = 4
            java.lang.Object r9 = i.c.c(r0, r1, r2, r3, r4, r5)
            xf.a r0 = xf.a.f21579g
            if (r9 != r0) goto L76
            r9 = r0
            goto L78
        L76:
            sf.n r9 = sf.n.f12433a
        L78:
            return r9
        L79:
            r4 = r8
            int r0 = r4.f21458i
            r1 = 1
            if (r0 == 0) goto L8c
            if (r0 != r1) goto L85
            f8.i.I0(r9)
            goto Lad
        L85:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            j8.o.A(r9)
            r9 = 0
            goto Laf
        L8c:
            f8.i.I0(r9)
            xb.i r9 = r4.f21459j
            i.c r0 = r9.f21492k
            r2 = r1
            java.lang.Float r1 = new java.lang.Float
            float r3 = r4.f21460k
            r1.<init>(r3)
            i.r0 r9 = r9.f21487f
            r4.f21458i = r2
            r3 = 0
            r5 = 12
            r2 = r9
            java.lang.Object r9 = i.c.c(r0, r1, r2, r3, r4, r5)
            xf.a r0 = xf.a.f21579g
            if (r9 != r0) goto Lad
            r9 = r0
            goto Laf
        Lad:
            sf.n r9 = sf.n.f12433a
        Laf:
            return r9
    }
}
