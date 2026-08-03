package m;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e3 implements fg.l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f8135g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ float f8136h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f8137i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f8138j;

    public /* synthetic */ e3(float r1, java.lang.Object r2, java.lang.Object r3, int r4) {
            r0 = this;
            r0.f8135g = r4
            r0.f8136h = r1
            r0.f8137i = r2
            r0.f8138j = r3
            r0.<init>()
            return
    }

    public /* synthetic */ e3(java.lang.Object r1, float r2, java.lang.Object r3, int r4) {
            r0 = this;
            r0.f8135g = r4
            r0.f8137i = r1
            r0.f8136h = r2
            r0.f8138j = r3
            r0.<init>()
            return
    }

    @Override // fg.l
    public final java.lang.Object invoke(java.lang.Object r13) {
            r12 = this;
            int r0 = r12.f8135g
            switch(r0) {
                case 0: goto L119;
                case 1: goto Lb4;
                case 2: goto L45;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r12.f8137i
            i0.a1 r0 = (i0.a1) r0
            java.lang.Object r1 = r12.f8138j
            i.c r1 = (i.c) r1
            f1.d0 r13 = (f1.d0) r13
            r13.getClass()
            java.lang.Object r2 = r0.getValue()
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            if (r2 <= 0) goto L32
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            float r0 = (float) r0
            float r2 = r13.d()
            float r3 = r12.f8136h
            float r2 = r2 * r3
            float r2 = r2 + r0
            goto L34
        L32:
            r2 = 1140457472(0x43fa0000, float:500.0)
        L34:
            java.lang.Object r0 = r1.d()
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
            float r0 = r0 * r2
            r13.g(r0)
        L42:
            sf.n r13 = sf.n.f12433a
            return r13
        L45:
            float r0 = r12.f8136h
            java.lang.Object r1 = r12.f8137i
            r3 = r1
            f1.g r3 = (f1.g) r3
            java.lang.Object r1 = r12.f8138j
            r7 = r1
            f1.n r7 = (f1.n) r7
            r2 = r13
            x1.h0 r2 = (x1.h0) r2
            r2.e()
            h1.b r13 = r2.f20932g
            b5.c r13 = r13.f5038h
            long r10 = r13.v()
            f1.u r1 = r13.p()
            r1.e()
            java.lang.Object r1 = r13.f469a     // Catch: java.lang.Throwable -> La8
            androidx.lifecycle.x r1 = (androidx.lifecycle.x) r1     // Catch: java.lang.Throwable -> La8
            r4 = 0
            r1.c0(r0, r4)     // Catch: java.lang.Throwable -> La8
            java.lang.Object r0 = r1.f310h     // Catch: java.lang.Throwable -> La8
            b5.c r0 = (b5.c) r0     // Catch: java.lang.Throwable -> La8
            f1.u r0 = r0.p()     // Catch: java.lang.Throwable -> La8
            r4 = 0
            int r1 = (int) r4     // Catch: java.lang.Throwable -> La8
            float r4 = java.lang.Float.intBitsToFloat(r1)     // Catch: java.lang.Throwable -> La8
            float r5 = java.lang.Float.intBitsToFloat(r1)     // Catch: java.lang.Throwable -> La8
            r0.m(r4, r5)     // Catch: java.lang.Throwable -> La8
            r0.n()     // Catch: java.lang.Throwable -> La8
            float r4 = java.lang.Float.intBitsToFloat(r1)     // Catch: java.lang.Throwable -> La8
            float r4 = -r4
            float r1 = java.lang.Float.intBitsToFloat(r1)     // Catch: java.lang.Throwable -> La8
            float r1 = -r1
            r0.m(r4, r1)     // Catch: java.lang.Throwable -> La8
            r8 = 0
            r9 = 46
            r4 = 0
            r6 = 0
            h1.d.U(r2, r3, r4, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> La8
            f1.u r0 = r13.p()
            r0.p()
            r13.U(r10)
            goto L42
        La8:
            r0 = move-exception
            f1.u r1 = r13.p()
            r1.p()
            r13.U(r10)
            throw r0
        Lb4:
            java.lang.Object r0 = r12.f8137i
            gg.r r0 = (gg.r) r0
            java.lang.Object r1 = r12.f8138j
            m.k2 r1 = (m.k2) r1
            i.j r13 = (i.j) r13
            float r2 = r12.f8136h
            r3 = 0
            int r4 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r4 <= 0) goto Ld9
            i0.j1 r3 = r13.f5698e
            java.lang.Object r3 = r3.getValue()
            java.lang.Number r3 = (java.lang.Number) r3
            float r3 = r3.floatValue()
            int r4 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r4 <= 0) goto Ld6
            goto Ld7
        Ld6:
            r2 = r3
        Ld7:
            r3 = r2
            goto Lee
        Ld9:
            int r4 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r4 >= 0) goto Lee
            i0.j1 r3 = r13.f5698e
            java.lang.Object r3 = r3.getValue()
            java.lang.Number r3 = (java.lang.Number) r3
            float r3 = r3.floatValue()
            int r4 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r4 >= 0) goto Ld6
            goto Ld7
        Lee:
            float r2 = r0.f4561g
            float r2 = r3 - r2
            java.lang.Object r1 = r1.f8248b
            m.u1 r1 = (m.u1) r1
            float r1 = r1.a(r2)
            int r1 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r1 != 0) goto L10f
            i0.j1 r1 = r13.f5698e
            java.lang.Object r1 = r1.getValue()
            java.lang.Number r1 = (java.lang.Number) r1
            float r1 = r1.floatValue()
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r1 != 0) goto L10f
            goto L112
        L10f:
            r13.a()
        L112:
            float r13 = r0.f4561g
            float r13 = r13 + r2
            r0.f4561g = r13
            goto L42
        L119:
            java.lang.Object r0 = r12.f8137i
            m.g3 r0 = (m.g3) r0
            java.lang.Object r1 = r12.f8138j
            fg.l r1 = (fg.l) r1
            java.lang.Long r13 = (java.lang.Long) r13
            long r2 = r13.longValue()
            long r4 = r0.f8172b
            r6 = -9223372036854775808
            int r13 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r13 != 0) goto L131
            r0.f8172b = r2
        L131:
            i.m r7 = new i.m
            float r13 = r0.f8175e
            r7.<init>(r13)
            r4 = 0
            float r5 = r12.f8136h
            int r4 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            i.m r8 = m.g3.f8170f
            if (r4 != 0) goto L150
            i.n1 r4 = r0.f8171a
            i.m r5 = new i.m
            r5.<init>(r13)
            i.m r13 = r0.f8173c
            long r4 = r4.b(r5, r8, r13)
        L14e:
            r5 = r4
            goto L162
        L150:
            long r9 = r0.f8172b
            long r9 = r2 - r9
            float r13 = (float) r9
            float r13 = r13 / r5
            double r4 = (double) r13
            boolean r13 = java.lang.Double.isNaN(r4)
            if (r13 != 0) goto L18b
            long r4 = java.lang.Math.round(r4)
            goto L14e
        L162:
            i.n1 r4 = r0.f8171a
            i.m r9 = r0.f8173c
            i.q r13 = r4.w(r5, r7, r8, r9)
            i.m r13 = (i.m) r13
            float r13 = r13.f5728a
            i.n1 r4 = r0.f8171a
            i.m r9 = r0.f8173c
            i.q r4 = r4.n(r5, r7, r8, r9)
            i.m r4 = (i.m) r4
            r0.f8173c = r4
            r0.f8172b = r2
            float r2 = r0.f8175e
            float r2 = r2 - r13
            r0.f8175e = r13
            java.lang.Float r13 = java.lang.Float.valueOf(r2)
            r1.invoke(r13)
            sf.n r13 = sf.n.f12433a
            goto L191
        L18b:
            java.lang.String r13 = "Cannot round NaN value."
            j8.o.t(r13)
            r13 = 0
        L191:
            return r13
    }
}
