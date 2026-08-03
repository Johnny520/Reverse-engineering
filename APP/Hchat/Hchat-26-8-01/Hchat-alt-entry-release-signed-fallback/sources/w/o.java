package w;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o implements fg.l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f14578g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f14579h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ fg.l f14580i;

    public /* synthetic */ o(fg.l r1, i0.a1 r2, int r3) {
            r0 = this;
            r0.f14578g = r3
            r0.f14580i = r1
            r0.f14579h = r2
            r0.<init>()
            return
    }

    public /* synthetic */ o(i0.a1 r1, fg.l r2, int r3) {
            r0 = this;
            r0.f14578g = r3
            r0.f14579h = r1
            r0.f14580i = r2
            r0.<init>()
            return
    }

    @Override // fg.l
    public final java.lang.Object invoke(java.lang.Object r13) {
            r12 = this;
            int r0 = r12.f14578g
            sf.n r1 = sf.n.f12433a
            i0.a1 r2 = r12.f14579h
            fg.l r3 = r12.f14580i
            switch(r0) {
                case 0: goto Lac;
                case 1: goto L92;
                case 2: goto L86;
                case 3: goto L78;
                case 4: goto L68;
                default: goto Lb;
            }
        Lb:
            java.lang.String r13 = (java.lang.String) r13
            r13.getClass()
            java.lang.Object r0 = r2.getValue()
            n2.s r0 = (n2.s) r0
            long r4 = r0.f8977b
            int r6 = i2.m0.f6359c
            r6 = 32
            long r4 = r4 >> r6
            int r4 = (int) r4
            i2.g r5 = r0.f8976a
            java.lang.String r6 = r5.f6314h
            int r6 = r6.length()
            r7 = 0
            int r4 = r9.e0.r(r4, r7, r6)
            long r8 = r0.f8977b
            r10 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r8 = r8 & r10
            int r0 = (int) r8
            java.lang.String r5 = r5.f6314h
            int r6 = r5.length()
            int r0 = r9.e0.r(r0, r7, r6)
            int r6 = java.lang.Math.min(r4, r0)
            int r0 = java.lang.Math.max(r4, r0)
            java.lang.StringBuilder r0 = og.m.C0(r5, r6, r0, r13)
            java.lang.String r0 = r0.toString()
            int r13 = r13.length()
            int r13 = r13 + r6
            n2.s r4 = new n2.s
            long r5 = i2.e0.b(r13, r13)
            r13 = 4
            r4.<init>(r13, r0, r5)
            r2.setValue(r4)
            i2.g r13 = r4.f8976a
            java.lang.String r13 = r13.f6314h
            r3.invoke(r13)
            return r1
        L68:
            n2.s r13 = (n2.s) r13
            r13.getClass()
            r2.setValue(r13)
            i2.g r13 = r13.f8976a
            java.lang.String r13 = r13.f6314h
            r3.invoke(r13)
            return r1
        L78:
            java.lang.String r13 = (java.lang.String) r13
            r13.getClass()
            r3.invoke(r13)
            java.lang.Boolean r13 = java.lang.Boolean.FALSE
            r2.setValue(r13)
            return r1
        L86:
            x8.b r13 = (x8.b) r13
            r13.getClass()
            r2.setValue(r13)
            r3.invoke(r13)
            return r1
        L92:
            e1.b r13 = (e1.b) r13
            java.lang.Object r0 = r2.getValue()
            i2.k0 r0 = (i2.k0) r0
            if (r0 == 0) goto Lab
            long r4 = r13.f2294a
            i2.o r13 = r0.f6347b
            int r13 = r13.g(r4)
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r3.invoke(r13)
        Lab:
            return r1
        Lac:
            i2.k0 r13 = (i2.k0) r13
            r2.setValue(r13)
            r3.invoke(r13)
            return r1
    }
}
