package h0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class v0 extends yf.i implements fg.l {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f5005h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ h0.d1 f5006i;

    public v0(h0.d1 r1, wf.c r2) {
            r0 = this;
            r0.f5006i = r1
            r1 = 1
            r0.<init>(r1, r2)
            return
    }

    @Override // yf.a
    public final wf.c create(wf.c r3) {
            r2 = this;
            h0.v0 r0 = new h0.v0
            h0.d1 r1 = r2.f5006i
            r0.<init>(r1, r3)
            return r0
    }

    @Override // fg.l
    public final java.lang.Object invoke(java.lang.Object r2) {
            r1 = this;
            wf.c r2 = (wf.c) r2
            wf.c r2 = r1.create(r2)
            h0.v0 r2 = (h0.v0) r2
            sf.n r0 = sf.n.f12433a
            java.lang.Object r2 = r2.invokeSuspend(r0)
            return r2
    }

    @Override // yf.a
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            r13 = this;
            int r0 = r13.f5005h
            sf.n r1 = sf.n.f12433a
            r2 = 2
            r3 = 1
            h0.d1 r4 = r13.f5006i
            xf.a r5 = xf.a.f21579g
            if (r0 == 0) goto L1f
            if (r0 == r3) goto L1b
            if (r0 != r2) goto L14
            f8.i.I0(r14)
            goto L6b
        L14:
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            j8.o.A(r14)
            r14 = 0
            return r14
        L1b:
            f8.i.I0(r14)
            goto L2b
        L1f:
            f8.i.I0(r14)
            r13.f5005h = r3
            java.lang.Object r14 = r4.s(r13)
            if (r14 != r5) goto L2b
            goto L6a
        L2b:
            sf.e r14 = h0.d1.a(r4)
            if (r14 == 0) goto L6b
            java.lang.Object r0 = r14.f12418g
            r8 = r0
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r14 = r14.f12419h
            i2.m0 r14 = (i2.m0) r14
            long r9 = r14.f6360a
            h0.p r7 = r4.f4855i
            if (r7 == 0) goto L6b
            r13.f5005h = r2
            int r14 = r8.length()
            if (r14 != 0) goto L49
            goto L4f
        L49:
            boolean r14 = i2.m0.c(r9)
            if (r14 == 0) goto L51
        L4f:
            r14 = r1
            goto L64
        L51:
            c0.i r6 = new c0.i
            r11 = 0
            r12 = 2
            r6.<init>(r7, r8, r9, r11, r12)
            wf.g r14 = r7.f4960a
            ci.e r0 = new ci.e
            r2 = 0
            r0.<init>(r7, r6, r2)
            java.lang.Object r14 = qg.v.x(r14, r0, r13)
        L64:
            if (r14 != r5) goto L67
            goto L68
        L67:
            r14 = r1
        L68:
            if (r14 != r5) goto L6b
        L6a:
            return r5
        L6b:
            r4.A = r3
            return r1
    }
}
