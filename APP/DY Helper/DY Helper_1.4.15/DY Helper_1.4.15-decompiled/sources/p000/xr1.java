package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class xr1 implements p000.js1, java.lang.Iterable, p000.lo0 {

    /* JADX INFO: renamed from: ε */
    public final p000.b21 f12268;

    /* JADX INFO: renamed from: ζ */
    public p000.dx0 f12269;

    /* JADX INFO: renamed from: η */
    public boolean f12270;

    /* JADX INFO: renamed from: θ */
    public boolean f12271;

    public xr1() {
            r1 = this;
            r1.<init>()
            long[] r0 = p000.tq1.f10431
            b21 r0 = new b21
            r0.<init>()
            r1.f12268 = r0
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L24
        L3:
            boolean r0 = r3 instanceof p000.xr1
            if (r0 != 0) goto L8
            goto L22
        L8:
            xr1 r3 = (p000.xr1) r3
            b21 r0 = r3.f12268
            b21 r1 = r2.f12268
            boolean r0 = p000.ln0.m3626(r1, r0)
            if (r0 != 0) goto L15
            goto L22
        L15:
            boolean r0 = r2.f12270
            boolean r1 = r3.f12270
            if (r0 == r1) goto L1c
            goto L22
        L1c:
            boolean r2 = r2.f12271
            boolean r3 = r3.f12271
            if (r2 == r3) goto L24
        L22:
            r2 = 0
            return r2
        L24:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r3 = this;
            b21 r0 = r3.f12268
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            boolean r2 = r3.f12270
            int r0 = p000.lz1.m3678(r0, r1, r2)
            boolean r3 = r3.f12271
            int r3 = java.lang.Boolean.hashCode(r3)
            int r3 = r3 + r0
            return r3
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator iterator() {
            r2 = this;
            dx0 r0 = r2.f12269
            if (r0 != 0) goto L11
            b21 r0 = r2.f12268
            r0.getClass()
            dx0 r1 = new dx0
            r1.<init>(r0)
            r2.f12269 = r1
            r0 = r1
        L11:
            java.util.Set r2 = r0.entrySet()
            pz r2 = (p000.C0705pz) r2
            java.util.Iterator r2 = r2.iterator()
            return r2
    }

    public final java.lang.String toString() {
            r19 = this;
            r0 = r19
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            boolean r2 = r0.f12270
            java.lang.String r3 = ", "
            if (r2 == 0) goto L14
            java.lang.String r2 = "mergeDescendants=true"
            r1.append(r2)
            r2 = r3
            goto L16
        L14:
            java.lang.String r2 = ""
        L16:
            boolean r4 = r0.f12271
            if (r4 == 0) goto L23
            r1.append(r2)
            java.lang.String r2 = "isClearingSemantics=true"
            r1.append(r2)
            r2 = r3
        L23:
            b21 r4 = r0.f12268
            java.lang.Object[] r5 = r4.f1428
            java.lang.Object[] r6 = r4.f1429
            long[] r4 = r4.f1427
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
            is1 r8 = (p000.is1) r8
            r1.append(r2)
            java.lang.String r2 = r8.f5178
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
            java.lang.String r0 = p000.kn0.m3352(r0)
            r2.append(r0)
            java.lang.String r0 = "{ "
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = " }"
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            return r0
    }

    @Override // p000.js1
    /* JADX INFO: renamed from: α */
    public final void mo2579(p000.is1 r4, java.lang.Object r5) {
            r3 = this;
            boolean r0 = r5 instanceof p000.C1114
            b21 r3 = r3.f12268
            if (r0 == 0) goto L2c
            boolean r0 = r3.m691(r4)
            if (r0 == 0) goto L2c
            java.lang.Object r0 = r3.m695(r4)
            r0.getClass()
            м r0 = (p000.C1114) r0
            м r1 = new м
            м r5 = (p000.C1114) r5
            java.lang.String r2 = r5.f13446
            if (r2 != 0) goto L1f
            java.lang.String r2 = r0.f13446
        L1f:
            m80 r5 = r5.f13447
            if (r5 != 0) goto L25
            m80 r5 = r0.f13447
        L25:
            r1.<init>(r2, r5)
            r3.m701(r4, r1)
            goto L2f
        L2c:
            r3.m701(r4, r5)
        L2f:
            r4.getClass()
            return
    }

    /* JADX INFO: renamed from: β */
    public final p000.xr1 m6779() {
            r17 = this;
            r0 = r17
            xr1 r1 = new xr1
            r1.<init>()
            boolean r2 = r0.f12270
            r1.f12270 = r2
            boolean r2 = r0.f12271
            r1.f12271 = r2
            b21 r2 = r1.f12268
            r2.getClass()
            b21 r0 = r0.f12268
            r0.getClass()
            java.lang.Object[] r3 = r0.f1428
            java.lang.Object[] r4 = r0.f1429
            long[] r0 = r0.f1427
            int r5 = r0.length
            int r5 = r5 + (-2)
            if (r5 < 0) goto L60
            r6 = 0
            r7 = r6
        L26:
            r8 = r0[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L5b
            int r10 = r7 - r5
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r6
        L40:
            if (r12 >= r10) goto L59
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L55
            int r13 = r7 << 3
            int r13 = r13 + r12
            r14 = r3[r13]
            r13 = r4[r13]
            r2.m701(r14, r13)
        L55:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L40
        L59:
            if (r10 != r11) goto L60
        L5b:
            if (r7 == r5) goto L60
            int r7 = r7 + 1
            goto L26
        L60:
            return r1
    }

    /* JADX INFO: renamed from: γ */
    public final java.lang.Object m6780(p000.is1 r2) {
            r1 = this;
            b21 r1 = r1.f12268
            java.lang.Object r1 = r1.m695(r2)
            if (r1 == 0) goto L9
            return r1
        L9:
            java.lang.String r1 = "Key not present: "
            java.lang.String r0 = " - consider getOrElse or getOrNull"
            p000.C1080.m7270(r1, r2, r0)
            r1 = 0
            return r1
    }

    /* JADX INFO: renamed from: δ */
    public final void m6781(p000.xr1 r17) {
            r16 = this;
            r0 = r17
            b21 r0 = r0.f12268
            java.lang.Object[] r1 = r0.f1428
            java.lang.Object[] r2 = r0.f1429
            long[] r0 = r0.f1427
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
            is1 r12 = (p000.is1) r12
            r13 = r16
            b21 r14 = r13.f12268
            java.lang.Object r15 = r14.m695(r12)
            r12.getClass()
            e80 r4 = r12.f5179
            java.lang.Object r4 = r4.invoke(r15, r11)
            if (r4 == 0) goto L57
            r14.m701(r12, r4)
            goto L57
        L55:
            r13 = r16
        L57:
            long r6 = r6 >> r9
            int r10 = r10 + 1
            goto L2a
        L5b:
            r13 = r16
            if (r8 != r9) goto L67
            goto L62
        L60:
            r13 = r16
        L62:
            if (r5 == r3) goto L67
            int r5 = r5 + 1
            goto L10
        L67:
            return
    }
}
