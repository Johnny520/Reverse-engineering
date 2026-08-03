package w;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class o1 implements v1.n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14582a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.Object f14583b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.Object f14584c;

    public /* synthetic */ o1(java.lang.Object r1, int r2, java.lang.Object r3) {
            r0 = this;
            r0.f14582a = r2
            r0.f14583b = r1
            r0.f14584c = r3
            r0.<init>()
            return
    }

    @Override // v1.n0
    public final v1.o0 h(v1.p0 r18, java.util.List r19, long r20) {
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            int r3 = r0.f14582a
            switch(r3) {
                case 0: goto L20;
                default: goto Lb;
            }
        Lb:
            java.lang.Object r2 = r0.f14583b
            y2.x r2 = (y2.x) r2
            java.lang.Object r3 = r0.f14584c
            u2.m r3 = (u2.m) r3
            r2.setParentLayoutDirection(r3)
            y2.c r2 = y2.c.f22196j
            tf.u r3 = tf.u.f13168g
            r4 = 0
            v1.o0 r1 = r1.z(r4, r4, r3, r2)
            return r1
        L20:
            java.util.ArrayList r3 = new java.util.ArrayList
            int r4 = r2.size()
            r3.<init>(r4)
            int r4 = r2.size()
            r6 = 0
        L2e:
            if (r6 >= r4) goto L45
            java.lang.Object r7 = r2.get(r6)
            r8 = r7
            v1.m0 r8 = (v1.m0) r8
            java.lang.Object r8 = r8.X()
            boolean r8 = r8 instanceof w.p1
            if (r8 != 0) goto L42
            r3.add(r7)
        L42:
            int r6 = r6 + 1
            goto L2e
        L45:
            java.lang.Object r4 = r0.f14584c
            fg.a r4 = (fg.a) r4
            java.lang.Object r4 = r4.invoke()
            java.util.List r4 = (java.util.List) r4
            if (r4 == 0) goto Lc6
            java.util.ArrayList r7 = new java.util.ArrayList
            int r8 = r4.size()
            r7.<init>(r8)
            int r8 = r4.size()
            r9 = 0
        L5f:
            if (r9 >= r8) goto Lc2
            java.lang.Object r10 = r4.get(r9)
            e1.c r10 = (e1.c) r10
            if (r10 == 0) goto Lb3
            float r11 = r10.f2297b
            float r12 = r10.f2296a
            sf.e r13 = new sf.e
            java.lang.Object r14 = r3.get(r9)
            v1.m0 r14 = (v1.m0) r14
            float r15 = r10.f2298c
            float r15 = r15 - r12
            r16 = r7
            double r6 = (double) r15
            double r6 = java.lang.Math.floor(r6)
            float r6 = (float) r6
            int r6 = (int) r6
            float r7 = r10.f2299d
            float r7 = r7 - r11
            r15 = r6
            double r5 = (double) r7
            double r5 = java.lang.Math.floor(r5)
            float r5 = (float) r5
            int r5 = (int) r5
            r6 = 5
            r10 = 0
            long r5 = u2.b.b(r10, r15, r10, r5, r6)
            v1.b1 r5 = r14.Q(r5)
            int r6 = java.lang.Math.round(r12)
            int r7 = java.lang.Math.round(r11)
            long r11 = (long) r6
            r6 = 32
            long r11 = r11 << r6
            long r6 = (long) r7
            r14 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r6 = r6 & r14
            long r6 = r6 | r11
            u2.j r11 = new u2.j
            r11.<init>(r6)
            r13.<init>(r5, r11)
            goto Lb7
        Lb3:
            r16 = r7
            r10 = 0
            r13 = 0
        Lb7:
            r5 = r16
            if (r13 == 0) goto Lbe
            r5.add(r13)
        Lbe:
            int r9 = r9 + 1
            r7 = r5
            goto L5f
        Lc2:
            r5 = r7
            r6 = r5
        Lc4:
            r10 = 0
            goto Lc8
        Lc6:
            r6 = 0
            goto Lc4
        Lc8:
            java.util.ArrayList r3 = new java.util.ArrayList
            int r4 = r2.size()
            r3.<init>(r4)
            int r4 = r2.size()
            r5 = r10
        Ld6:
            if (r5 >= r4) goto Led
            java.lang.Object r7 = r2.get(r5)
            r8 = r7
            v1.m0 r8 = (v1.m0) r8
            java.lang.Object r8 = r8.X()
            boolean r8 = r8 instanceof w.p1
            if (r8 == 0) goto Lea
            r3.add(r7)
        Lea:
            int r5 = r5 + 1
            goto Ld6
        Led:
            java.lang.Object r2 = r0.f14583b
            fg.a r2 = (fg.a) r2
            java.util.ArrayList r2 = w.s.m(r3, r2)
            int r3 = u2.a.h(r20)
            int r4 = u2.a.g(r20)
            m.b r5 = new m.b
            r7 = 26
            r5.<init>(r6, r7, r2)
            tf.u r2 = tf.u.f13168g
            v1.o0 r1 = r1.z(r3, r4, r2, r5)
            return r1
    }
}
