package h0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j0 implements fg.q {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f4918g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ fg.l f4919h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ fg.a f4920i;

    public /* synthetic */ j0(fg.a r2, fg.l r3) {
            r1 = this;
            r0 = 0
            r1.f4918g = r0
            r1.<init>()
            r1.f4920i = r2
            r1.f4919h = r3
            return
    }

    public /* synthetic */ j0(fg.l r2, fg.a r3) {
            r1 = this;
            r0 = 1
            r1.f4918g = r0
            r1.<init>()
            r1.f4919h = r2
            r1.f4920i = r3
            return
    }

    @Override // fg.q
    public final java.lang.Object b(java.lang.Object r10, java.lang.Object r11, java.lang.Object r12) {
            r9 = this;
            int r0 = r9.f4918g
            switch(r0) {
                case 0: goto L56;
                default: goto L5;
            }
        L5:
            th.a r10 = (th.a) r10
            r6 = r11
            i0.h0 r6 = (i0.h0) r6
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r11 = r12.intValue()
            r10.getClass()
            r10 = r11 & 17
            r12 = 16
            r0 = 1
            if (r10 == r12) goto L1c
            r10 = r0
            goto L1d
        L1c:
            r10 = 0
        L1d:
            r11 = r11 & r0
            boolean r10 = r6.S(r11, r10)
            if (r10 == 0) goto L50
            fg.l r10 = r9.f4919h
            boolean r11 = r6.f(r10)
            java.lang.Object r12 = r6.P()
            if (r11 != 0) goto L34
            i0.e r11 = i0.l.f5952a
            if (r12 != r11) goto L3d
        L34:
            c9.o0 r12 = new c9.o0
            r11 = 2
            r12.<init>(r10, r11)
            r6.k0(r12)
        L3d:
            r1 = r12
            fg.a r1 = (fg.a) r1
            r7 = 390(0x186, float:5.47E-43)
            r8 = 48
            java.lang.String r0 = "微信首页"
            java.lang.String r2 = "返回"
            fg.a r3 = r9.f4920i
            r4 = 0
            r5 = 0
            wb.ho.M(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            goto L53
        L50:
            r6.V()
        L53:
            sf.n r10 = sf.n.f12433a
            return r10
        L56:
            y0.o r10 = (y0.o) r10
            i0.h0 r11 = (i0.h0) r11
            java.lang.Integer r12 = (java.lang.Integer) r12
            r12.getClass()
            r10 = 759876635(0x2d4acc1b, float:1.1527691E-11)
            r11.a0(r10)
            java.lang.Object r10 = r11.P()
            i0.e r12 = i0.l.f5952a
            if (r10 != r12) goto L76
            fg.a r10 = r9.f4920i
            i0.x r10 = i0.r.p(r10)
            r11.k0(r10)
        L76:
            i0.l2 r10 = (i0.l2) r10
            java.lang.Object r0 = r11.P()
            if (r0 != r12) goto L9e
            i.c r0 = new i.c
            java.lang.Object r1 = r10.getValue()
            e1.b r1 = (e1.b) r1
            long r1 = r1.f2294a
            e1.b r3 = new e1.b
            r3.<init>(r1)
            i.m1 r1 = h0.m0.f4943b
            long r4 = h0.m0.f4944c
            e1.b r2 = new e1.b
            r2.<init>(r4)
            r4 = 8
            r0.<init>(r3, r1, r2, r4)
            r11.k0(r0)
        L9e:
            i.c r0 = (i.c) r0
            boolean r1 = r11.h(r0)
            java.lang.Object r2 = r11.P()
            if (r1 != 0) goto Lac
            if (r2 != r12) goto Lb6
        Lac:
            c0.m r2 = new c0.m
            r1 = 0
            r3 = 4
            r2.<init>(r10, r0, r1, r3)
            r11.k0(r2)
        Lb6:
            fg.p r2 = (fg.p) r2
            sf.n r10 = sf.n.f12433a
            i0.r.f(r2, r11, r10)
            i.l r10 = r0.f5604c
            boolean r0 = r11.f(r10)
            java.lang.Object r1 = r11.P()
            if (r0 != 0) goto Lcb
            if (r1 != r12) goto Ld4
        Lcb:
            h0.i0 r1 = new h0.i0
            r12 = 0
            r1.<init>(r10, r12)
            r11.k0(r1)
        Ld4:
            fg.a r1 = (fg.a) r1
            fg.l r10 = r9.f4919h
            java.lang.Object r10 = r10.invoke(r1)
            y0.o r10 = (y0.o) r10
            r12 = 0
            r11.p(r12)
            return r10
    }
}
