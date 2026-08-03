package ug;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends yf.i implements fg.p {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f13808h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f13809i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f13810j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ ug.g f13811k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ tg.e f13812l;

    public e(ug.g r2, tg.e r3, java.lang.Object r4, wf.c r5) {
            r1 = this;
            r0 = 0
            r1.f13808h = r0
            r1.f13811k = r2
            r1.f13812l = r3
            r1.f13810j = r4
            r2 = 2
            r1.<init>(r2, r5)
            return
    }

    public e(ug.g r2, tg.e r3, wf.c r4) {
            r1 = this;
            r0 = 1
            r1.f13808h = r0
            r1.f13811k = r2
            r1.f13812l = r3
            r2 = 2
            r1.<init>(r2, r4)
            return
    }

    @Override // yf.a
    public final wf.c create(java.lang.Object r4, wf.c r5) {
            r3 = this;
            int r0 = r3.f13808h
            switch(r0) {
                case 0: goto L11;
                default: goto L5;
            }
        L5:
            ug.e r0 = new ug.e
            ug.g r1 = r3.f13811k
            tg.e r2 = r3.f13812l
            r0.<init>(r1, r2, r5)
            r0.f13810j = r4
            return r0
        L11:
            ug.e r4 = new ug.e
            tg.e r0 = r3.f13812l
            java.lang.Object r1 = r3.f13810j
            ug.g r2 = r3.f13811k
            r4.<init>(r2, r0, r1, r5)
            return r4
    }

    @Override // fg.p
    public final java.lang.Object invoke(java.lang.Object r2, java.lang.Object r3) {
            r1 = this;
            int r0 = r1.f13808h
            qg.t r2 = (qg.t) r2
            wf.c r3 = (wf.c) r3
            switch(r0) {
                case 0: goto L16;
                default: goto L9;
            }
        L9:
            wf.c r2 = r1.create(r2, r3)
            ug.e r2 = (ug.e) r2
            sf.n r3 = sf.n.f12433a
            java.lang.Object r2 = r2.invokeSuspend(r3)
            return r2
        L16:
            wf.c r2 = r1.create(r2, r3)
            ug.e r2 = (ug.e) r2
            sf.n r3 = sf.n.f12433a
            java.lang.Object r2 = r2.invokeSuspend(r3)
            return r2
    }

    @Override // yf.a
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            r8 = this;
            int r0 = r8.f13808h
            switch(r0) {
                case 0: goto L3f;
                default: goto L5;
            }
        L5:
            int r0 = r8.f13809i
            r1 = 1
            if (r0 == 0) goto L17
            if (r0 != r1) goto L10
            f8.i.I0(r9)
            goto L3c
        L10:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            j8.o.A(r9)
            r9 = 0
            goto L3e
        L17:
            f8.i.I0(r9)
            java.lang.Object r9 = r8.f13810j
            r4 = r9
            qg.t r4 = (qg.t) r4
            gg.u r3 = new gg.u
            r3.<init>()
            ug.g r5 = r8.f13811k
            tg.d r9 = r5.f13821j
            k.c0 r2 = new k.c0
            tg.e r6 = r8.f13812l
            r7 = 1
            r2.<init>(r3, r4, r5, r6, r7)
            r8.f13809i = r1
            java.lang.Object r9 = r9.b(r2, r8)
            xf.a r0 = xf.a.f21579g
            if (r9 != r0) goto L3c
            r9 = r0
            goto L3e
        L3c:
            sf.n r9 = sf.n.f12433a
        L3e:
            return r9
        L3f:
            int r0 = r8.f13809i
            r1 = 1
            if (r0 == 0) goto L51
            if (r0 != r1) goto L4a
            f8.i.I0(r9)
            goto L68
        L4a:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            j8.o.A(r9)
            r9 = 0
            goto L6a
        L51:
            f8.i.I0(r9)
            ug.g r9 = r8.f13811k
            yf.i r9 = r9.f13822k
            java.lang.Object r0 = r8.f13810j
            r8.f13809i = r1
            tg.e r1 = r8.f13812l
            java.lang.Object r9 = r9.b(r1, r0, r8)
            xf.a r0 = xf.a.f21579g
            if (r9 != r0) goto L68
            r9 = r0
            goto L6a
        L68:
            sf.n r9 = sf.n.f12433a
        L6a:
            return r9
    }
}
