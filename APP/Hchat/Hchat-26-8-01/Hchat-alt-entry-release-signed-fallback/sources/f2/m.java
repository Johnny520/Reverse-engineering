package f2;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class m implements f2.y, java.lang.Iterable, hg.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final f.k0 f3204g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public f.t f3205h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f3206i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f3207j;

    public m() {
            r1 = this;
            r1.<init>()
            long[] r0 = f.r0.f2895a
            f.k0 r0 = new f.k0
            r0.<init>()
            r1.f3204g = r0
            return
    }

    @Override // f2.y
    public final void a(f2.x r5, java.lang.Object r6) {
            r4 = this;
            boolean r0 = r6 instanceof f2.a
            f.k0 r1 = r4.f3204g
            if (r0 == 0) goto L2c
            boolean r0 = r1.c(r5)
            if (r0 == 0) goto L2c
            java.lang.Object r0 = r1.g(r5)
            r0.getClass()
            f2.a r0 = (f2.a) r0
            f2.a r2 = new f2.a
            f2.a r6 = (f2.a) r6
            java.lang.String r3 = r6.f3137a
            if (r3 != 0) goto L1f
            java.lang.String r3 = r0.f3137a
        L1f:
            sf.b r6 = r6.f3138b
            if (r6 != 0) goto L25
            sf.b r6 = r0.f3138b
        L25:
            r2.<init>(r3, r6)
            r1.m(r5, r2)
            goto L2f
        L2c:
            r1.m(r5, r6)
        L2f:
            r5.getClass()
            return
    }

    public final f2.m c() {
            r18 = this;
            r0 = r18
            f2.m r1 = new f2.m
            r1.<init>()
            boolean r2 = r0.f3206i
            r1.f3206i = r2
            boolean r2 = r0.f3207j
            r1.f3207j = r2
            f.k0 r2 = r1.f3204g
            r2.getClass()
            f.k0 r3 = r0.f3204g
            r3.getClass()
            java.lang.Object[] r4 = r3.f2849b
            java.lang.Object[] r5 = r3.f2850c
            long[] r3 = r3.f2848a
            int r6 = r3.length
            int r6 = r6 + (-2)
            if (r6 < 0) goto L60
            r7 = 0
            r8 = r7
        L26:
            r9 = r3[r8]
            long r11 = ~r9
            r13 = 7
            long r11 = r11 << r13
            long r11 = r11 & r9
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r11 = r11 & r13
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 == 0) goto L5b
            int r11 = r8 - r6
            int r11 = ~r11
            int r11 = r11 >>> 31
            r12 = 8
            int r11 = 8 - r11
            r13 = r7
        L40:
            if (r13 >= r11) goto L59
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r9
            r16 = 128(0x80, double:6.3E-322)
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto L55
            int r14 = r8 << 3
            int r14 = r14 + r13
            r15 = r4[r14]
            r14 = r5[r14]
            r2.m(r15, r14)
        L55:
            long r9 = r9 >> r12
            int r13 = r13 + 1
            goto L40
        L59:
            if (r11 != r12) goto L60
        L5b:
            if (r8 == r6) goto L60
            int r8 = r8 + 1
            goto L26
        L60:
            return r1
    }

    public final java.lang.Object d(f2.x r4) {
            r3 = this;
            f.k0 r0 = r3.f3204g
            java.lang.Object r0 = r0.g(r4)
            if (r0 == 0) goto L9
            return r0
        L9:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Key not present: "
            r1.<init>(r2)
            r1.append(r4)
            java.lang.String r4 = " - consider getOrElse or getOrNull"
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }

    public final void e(f2.m r17) {
            r16 = this;
            r0 = r17
            f.k0 r0 = r0.f3204g
            java.lang.Object[] r1 = r0.f2849b
            java.lang.Object[] r2 = r0.f2850c
            long[] r0 = r0.f2848a
            int r3 = r0.length
            int r3 = r3 + (-2)
            if (r3 < 0) goto L67
            r5 = 0
        L10:
            r6 = r0[r5]
            long r8 = ~r6
            r10 = 7
            long r8 = r8 << r10
            long r8 = r8 & r6
            r10 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r8 = r8 & r10
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 == 0) goto L60
            int r8 = r5 - r3
            int r8 = ~r8
            int r8 = r8 >>> 31
            r9 = 8
            int r8 = 8 - r8
            r10 = 0
        L2a:
            if (r10 >= r8) goto L5b
            r11 = 255(0xff, double:1.26E-321)
            long r11 = r11 & r6
            r13 = 128(0x80, double:6.3E-322)
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 >= 0) goto L55
            int r11 = r5 << 3
            int r11 = r11 + r10
            r12 = r1[r11]
            r11 = r2[r11]
            f2.x r12 = (f2.x) r12
            r13 = r16
            f.k0 r14 = r13.f3204g
            java.lang.Object r15 = r14.g(r12)
            r12.getClass()
            fg.p r4 = r12.f3253b
            java.lang.Object r4 = r4.invoke(r15, r11)
            if (r4 == 0) goto L57
            r14.m(r12, r4)
            goto L57
        L55:
            r13 = r16
        L57:
            long r6 = r6 >> r9
            int r10 = r10 + 1
            goto L2a
        L5b:
            r13 = r16
            if (r8 != r9) goto L69
            goto L62
        L60:
            r13 = r16
        L62:
            if (r5 == r3) goto L69
            int r5 = r5 + 1
            goto L10
        L67:
            r13 = r16
        L69:
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L24
        L3:
            boolean r0 = r3 instanceof f2.m
            if (r0 != 0) goto L8
            goto L22
        L8:
            f2.m r3 = (f2.m) r3
            f.k0 r0 = r3.f3204g
            f.k0 r1 = r2.f3204g
            boolean r0 = gg.l.a(r1, r0)
            if (r0 != 0) goto L15
            goto L22
        L15:
            boolean r0 = r2.f3206i
            boolean r1 = r3.f3206i
            if (r0 == r1) goto L1c
            goto L22
        L1c:
            boolean r0 = r2.f3207j
            boolean r3 = r3.f3207j
            if (r0 == r3) goto L24
        L22:
            r3 = 0
            return r3
        L24:
            r3 = 1
            return r3
    }

    public final int hashCode() {
            r3 = this;
            f.k0 r0 = r3.f3204g
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            boolean r2 = r3.f3206i
            int r0 = eh.a.h(r0, r1, r2)
            boolean r1 = r3.f3207j
            int r1 = java.lang.Boolean.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator iterator() {
            r2 = this;
            f.t r0 = r2.f3205h
            if (r0 != 0) goto L11
            f.k0 r0 = r2.f3204g
            r0.getClass()
            f.t r1 = new f.t
            r1.<init>(r0)
            r2.f3205h = r1
            r0 = r1
        L11:
            java.util.Set r0 = r0.entrySet()
            f.h r0 = (f.h) r0
            java.util.Iterator r0 = r0.iterator()
            return r0
    }

    public final java.lang.String toString() {
            r19 = this;
            r0 = r19
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            boolean r2 = r0.f3206i
            java.lang.String r3 = ", "
            if (r2 == 0) goto L14
            java.lang.String r2 = "mergeDescendants=true"
            r1.append(r2)
            r2 = r3
            goto L16
        L14:
            java.lang.String r2 = ""
        L16:
            boolean r4 = r0.f3207j
            if (r4 == 0) goto L23
            r1.append(r2)
            java.lang.String r2 = "isClearingSemantics=true"
            r1.append(r2)
            r2 = r3
        L23:
            f.k0 r4 = r0.f3204g
            java.lang.Object[] r5 = r4.f2849b
            java.lang.Object[] r6 = r4.f2850c
            long[] r4 = r4.f2848a
            int r7 = r4.length
            int r7 = r7 + (-2)
            if (r7 < 0) goto L7d
            r9 = 0
        L31:
            r10 = r4[r9]
            long r12 = ~r10
            r14 = 7
            long r12 = r12 << r14
            long r12 = r12 & r10
            r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r12 = r12 & r14
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 == 0) goto L78
            int r12 = r9 - r7
            int r12 = ~r12
            int r12 = r12 >>> 31
            r13 = 8
            int r12 = 8 - r12
            r14 = 0
        L4b:
            if (r14 >= r12) goto L76
            r15 = 255(0xff, double:1.26E-321)
            long r15 = r15 & r10
            r17 = 128(0x80, double:6.3E-322)
            int r15 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r15 >= 0) goto L72
            int r15 = r9 << 3
            int r15 = r15 + r14
            r16 = r5[r15]
            r15 = r6[r15]
            r8 = r16
            f2.x r8 = (f2.x) r8
            r1.append(r2)
            java.lang.String r2 = r8.f3252a
            r1.append(r2)
            java.lang.String r2 = " : "
            r1.append(r2)
            r1.append(r15)
            r2 = r3
        L72:
            long r10 = r10 >> r13
            int r14 = r14 + 1
            goto L4b
        L76:
            if (r12 != r13) goto L7d
        L78:
            if (r9 == r7) goto L7d
            int r9 = r9 + 1
            goto L31
        L7d:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = y1.g0.u(r0)
            r2.append(r3)
            java.lang.String r3 = "{ "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = " }"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            return r1
    }
}
