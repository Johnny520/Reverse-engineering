package f0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g implements fg.l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f2956g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ f0.i f2957h;

    public /* synthetic */ g(f0.i r1, int r2) {
            r0 = this;
            r0.f2956g = r2
            r0.f2957h = r1
            r0.<init>()
            return
    }

    public /* synthetic */ g(f0.i r1, f2.y r2) {
            r0 = this;
            r2 = 3
            r0.f2956g = r2
            r0.<init>()
            r0.f2957h = r1
            return
    }

    @Override // fg.l
    public final java.lang.Object invoke(java.lang.Object r10) {
            r9 = this;
            int r0 = r9.f2956g
            r1 = 0
            r2 = 0
            r3 = 1
            f0.i r4 = r9.f2957h
            switch(r0) {
                case 0: goto Lac;
                case 1: goto L8e;
                case 2: goto L80;
                default: goto La;
            }
        La:
            i2.g r10 = (i2.g) r10
            boolean r0 = r4.f2963z
            if (r0 != 0) goto L11
            goto L7b
        L11:
            w.q0 r0 = r4.f2962y
            n2.y r0 = r0.f14604e
            if (r0 == 0) goto L3e
            n2.h r5 = new n2.h
            r5.<init>()
            n2.a r6 = new n2.a
            r6.<init>(r10, r3)
            r10 = 2
            n2.g[] r10 = new n2.g[r10]
            r10[r2] = r5
            r10[r3] = r6
            java.util.List r10 = a.a.y0(r10)
            w.q0 r2 = r4.f2962y
            b.e r4 = r2.f14603d
            w.w r2 = r2.f14621v
            n2.s r10 = r4.l(r10)
            r0.a(r1, r10)
            r2.invoke(r10)
        L3c:
            r2 = r3
            goto L7b
        L3e:
            n2.s r0 = r4.f2961x
            i2.g r1 = r0.f8976a
            java.lang.String r1 = r1.f6314h
            long r5 = r0.f8977b
            int r0 = i2.m0.f6359c
            r0 = 32
            long r7 = r5 >> r0
            int r2 = (int) r7
            r7 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r5 = r5 & r7
            int r5 = (int) r5
            java.lang.StringBuilder r1 = og.m.C0(r1, r2, r5, r10)
            java.lang.String r1 = r1.toString()
            n2.s r2 = r4.f2961x
            long r5 = r2.f8977b
            long r5 = r5 >> r0
            int r0 = (int) r5
            java.lang.String r10 = r10.f6314h
            int r10 = r10.length()
            int r10 = r10 + r0
            long r5 = i2.e0.b(r10, r10)
            w.q0 r10 = r4.f2962y
            w.w r10 = r10.f14621v
            n2.s r0 = new n2.s
            r2 = 4
            r0.<init>(r2, r1, r5)
            r10.invoke(r0)
            goto L3c
        L7b:
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r2)
            return r10
        L80:
            i2.g r10 = (i2.g) r10
            w.q0 r0 = r4.f2962y
            java.lang.String r10 = r10.f6314h
            boolean r1 = r4.f2963z
            f0.i.n1(r0, r10, r1)
            java.lang.Boolean r10 = java.lang.Boolean.TRUE
            return r10
        L8e:
            java.util.List r10 = (java.util.List) r10
            w.q0 r0 = r4.f2962y
            w.m1 r0 = r0.d()
            if (r0 == 0) goto La7
            w.q0 r0 = r4.f2962y
            w.m1 r0 = r0.d()
            r0.getClass()
            i2.k0 r0 = r0.f14569a
            r10.add(r0)
            r2 = r3
        La7:
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r2)
            return r10
        Lac:
            z0.f r10 = (z0.f) r10
            w.q0 r0 = r4.f2962y
            i0.j1 r0 = r0.f14619t
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            r0.setValue(r2)
            w.q0 r0 = r4.f2962y
            i0.j1 r0 = r0.f14618s
            r0.setValue(r2)
            w.q0 r0 = r4.f2962y
            android.view.autofill.AutofillValue r10 = r10.f22489a
            boolean r3 = r10.isText()
            if (r3 == 0) goto Lcc
            java.lang.CharSequence r1 = r10.getTextValue()
        Lcc:
            r1.getClass()
            java.lang.String r1 = (java.lang.String) r1
            boolean r10 = r4.f2963z
            f0.i.n1(r0, r1, r10)
            return r2
    }
}
