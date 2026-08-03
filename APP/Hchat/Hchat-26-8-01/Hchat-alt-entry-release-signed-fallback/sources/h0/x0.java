package h0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class x0 extends yf.i implements fg.p {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f5021h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f5022i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f5023j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f5024k;

    public x0(h0.d1 r2, boolean r3, wf.c r4) {
            r1 = this;
            r0 = 0
            r1.f5021h = r0
            r1.f5024k = r2
            r1.f5023j = r3
            r2 = 2
            r1.<init>(r2, r4)
            return
    }

    public x0(i0.a1 r2, wf.c r3, boolean r4) {
            r1 = this;
            r0 = 1
            r1.f5021h = r0
            r1.f5023j = r4
            r1.f5024k = r2
            r2 = 2
            r1.<init>(r2, r3)
            return
    }

    @Override // yf.a
    public final wf.c create(java.lang.Object r3, wf.c r4) {
            r2 = this;
            int r3 = r2.f5021h
            switch(r3) {
                case 0: goto L11;
                default: goto L5;
            }
        L5:
            h0.x0 r3 = new h0.x0
            java.lang.Object r0 = r2.f5024k
            i0.a1 r0 = (i0.a1) r0
            boolean r1 = r2.f5023j
            r3.<init>(r0, r4, r1)
            return r3
        L11:
            h0.x0 r3 = new h0.x0
            java.lang.Object r0 = r2.f5024k
            h0.d1 r0 = (h0.d1) r0
            boolean r1 = r2.f5023j
            r3.<init>(r0, r1, r4)
            return r3
    }

    @Override // fg.p
    public final java.lang.Object invoke(java.lang.Object r2, java.lang.Object r3) {
            r1 = this;
            int r0 = r1.f5021h
            qg.t r2 = (qg.t) r2
            wf.c r3 = (wf.c) r3
            switch(r0) {
                case 0: goto L16;
                default: goto L9;
            }
        L9:
            wf.c r2 = r1.create(r2, r3)
            h0.x0 r2 = (h0.x0) r2
            sf.n r3 = sf.n.f12433a
            java.lang.Object r2 = r2.invokeSuspend(r3)
            return r2
        L16:
            wf.c r2 = r1.create(r2, r3)
            h0.x0 r2 = (h0.x0) r2
            sf.n r3 = sf.n.f12433a
            java.lang.Object r2 = r2.invokeSuspend(r3)
            return r2
    }

    @Override // yf.a
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            r10 = this;
            int r0 = r10.f5021h
            sf.n r1 = sf.n.f12433a
            boolean r2 = r10.f5023j
            java.lang.String r3 = "call to 'resume' before 'invoke' with coroutine"
            xf.a r4 = xf.a.f21579g
            r5 = 1
            java.lang.Object r6 = r10.f5024k
            r7 = 0
            switch(r0) {
                case 0: goto L43;
                default: goto L11;
            }
        L11:
            i0.a1 r6 = (i0.a1) r6
            int r0 = r10.f5022i
            if (r0 == 0) goto L22
            if (r0 != r5) goto L1d
            f8.i.I0(r11)
            goto L3b
        L1d:
            j8.o.A(r3)
            r1 = r7
            goto L42
        L22:
            f8.i.I0(r11)
            if (r2 == 0) goto L2f
            og.k r11 = wb.ho.f16633a
            java.lang.Boolean r11 = java.lang.Boolean.TRUE
            r6.setValue(r11)
            goto L42
        L2f:
            r10.f5022i = r5
            r2 = 110(0x6e, double:5.43E-322)
            java.lang.Object r11 = qg.v.f(r2, r10)
            if (r11 != r4) goto L3b
            r1 = r4
            goto L42
        L3b:
            og.k r11 = wb.ho.f16633a
            java.lang.Boolean r11 = java.lang.Boolean.FALSE
            r6.setValue(r11)
        L42:
            return r1
        L43:
            h0.d1 r6 = (h0.d1) r6
            int r0 = r10.f5022i
            if (r0 == 0) goto L54
            if (r0 != r5) goto L4f
            f8.i.I0(r11)
            goto La5
        L4f:
            j8.o.A(r3)
            r1 = r7
            goto La5
        L54:
            f8.i.I0(r11)
            n2.s r11 = r6.n()
            long r8 = r11.f8977b
            boolean r11 = i2.m0.c(r8)
            if (r11 != 0) goto L90
            n2.s r11 = r6.n()
            i2.g r7 = ig.a.z(r11)
            if (r2 != 0) goto L6e
            goto L90
        L6e:
            n2.s r11 = r6.n()
            long r2 = r11.f8977b
            int r11 = i2.m0.e(r2)
            n2.s r0 = r6.n()
            i2.g r0 = r0.f8976a
            long r2 = i2.e0.b(r11, r11)
            n2.s r11 = h0.d1.e(r0, r2)
            fg.l r0 = r6.f4849c
            r0.invoke(r11)
            w.h0 r11 = w.h0.f14484g
            r6.q(r11)
        L90:
            if (r7 != 0) goto L93
            goto La5
        L93:
            y1.y0 r11 = r6.f4853g
            if (r11 == 0) goto La5
            y1.x0 r0 = o.d.a(r7)
            r10.f5022i = r5
            y1.h r11 = (y1.h) r11
            r11.a(r0)
            if (r1 != r4) goto La5
            r1 = r4
        La5:
            return r1
    }
}
