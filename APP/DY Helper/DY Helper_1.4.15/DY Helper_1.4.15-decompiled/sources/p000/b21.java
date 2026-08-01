package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class b21 {

    /* JADX INFO: renamed from: α */
    public long[] f1427;

    /* JADX INFO: renamed from: β */
    public java.lang.Object[] f1428;

    /* JADX INFO: renamed from: γ */
    public java.lang.Object[] f1429;

    /* JADX INFO: renamed from: δ */
    public int f1430;

    /* JADX INFO: renamed from: ε */
    public int f1431;

    /* JADX INFO: renamed from: ζ */
    public int f1432;

    public /* synthetic */ b21() {
            r1 = this;
            r0 = 6
            r1.<init>(r0)
            return
    }

    public b21(int r2) {
            r1 = this;
            r1.<init>()
            long[] r0 = p000.tq1.f10431
            r1.f1427 = r0
            java.lang.Object[] r0 = p000.AbstractC1021yh.f12618
            r1.f1428 = r0
            r1.f1429 = r0
            if (r2 < 0) goto L11
            r0 = 1
            goto L12
        L11:
            r0 = 0
        L12:
            if (r0 == 0) goto L1c
            int r2 = p000.tq1.m5734(r2)
            r1.m696(r2)
            return
        L1c:
            java.lang.String r1 = "Capacity must be a positive value."
            p000.C1080.m7275(r1)
            r1 = 0
            throw r1
    }

    public final boolean equals(java.lang.Object r18) {
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = 1
            if (r1 != r0) goto L8
            return r2
        L8:
            boolean r3 = r1 instanceof p000.b21
            r4 = 0
            if (r3 != 0) goto Le
            return r4
        Le:
            b21 r1 = (p000.b21) r1
            int r3 = r1.f1431
            int r5 = r0.f1431
            if (r3 == r5) goto L17
            return r4
        L17:
            java.lang.Object[] r3 = r0.f1428
            java.lang.Object[] r5 = r0.f1429
            long[] r0 = r0.f1427
            int r6 = r0.length
            int r6 = r6 + (-2)
            if (r6 < 0) goto L74
            r7 = r4
        L23:
            r8 = r0[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L6f
            int r10 = r7 - r6
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r4
        L3d:
            if (r12 >= r10) goto L6d
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L69
            int r13 = r7 << 3
            int r13 = r13 + r12
            r14 = r3[r13]
            r13 = r5[r13]
            if (r13 != 0) goto L5e
            java.lang.Object r13 = r1.m695(r14)
            if (r13 != 0) goto L5d
            boolean r13 = r1.m691(r14)
            if (r13 != 0) goto L69
        L5d:
            return r4
        L5e:
            java.lang.Object r14 = r1.m695(r14)
            boolean r13 = r13.equals(r14)
            if (r13 != 0) goto L69
            return r4
        L69:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L3d
        L6d:
            if (r10 != r11) goto L74
        L6f:
            if (r7 == r6) goto L74
            int r7 = r7 + 1
            goto L23
        L74:
            return r2
    }

    public final int hashCode() {
            r15 = this;
            java.lang.Object[] r0 = r15.f1428
            java.lang.Object[] r1 = r15.f1429
            long[] r15 = r15.f1427
            int r2 = r15.length
            int r2 = r2 + (-2)
            r3 = 0
            if (r2 < 0) goto L5a
            r4 = r3
            r5 = r4
        Le:
            r6 = r15[r4]
            long r8 = ~r6
            r10 = 7
            long r8 = r8 << r10
            long r8 = r8 & r6
            r10 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r8 = r8 & r10
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 == 0) goto L54
            int r8 = r4 - r2
            int r8 = ~r8
            int r8 = r8 >>> 31
            r9 = 8
            int r8 = 8 - r8
            r10 = r3
        L28:
            if (r10 >= r8) goto L50
            r11 = 255(0xff, double:1.26E-321)
            long r11 = r11 & r6
            r13 = 128(0x80, double:6.3E-322)
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 >= 0) goto L4c
            int r11 = r4 << 3
            int r11 = r11 + r10
            r12 = r0[r11]
            r11 = r1[r11]
            if (r12 == 0) goto L41
            int r12 = r12.hashCode()
            goto L42
        L41:
            r12 = r3
        L42:
            if (r11 == 0) goto L49
            int r11 = r11.hashCode()
            goto L4a
        L49:
            r11 = r3
        L4a:
            r11 = r11 ^ r12
            int r5 = r5 + r11
        L4c:
            long r6 = r6 >> r9
            int r10 = r10 + 1
            goto L28
        L50:
            if (r8 != r9) goto L53
            goto L54
        L53:
            return r5
        L54:
            if (r4 == r2) goto L59
            int r4 = r4 + 1
            goto Le
        L59:
            return r5
        L5a:
            return r3
    }

    public final java.lang.String toString() {
            r18 = this;
            r0 = r18
            boolean r1 = r0.m697()
            if (r1 == 0) goto Lb
            java.lang.String r0 = "{}"
            return r0
        Lb:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "{"
            r1.<init>(r2)
            java.lang.Object[] r2 = r0.f1428
            java.lang.Object[] r3 = r0.f1429
            long[] r4 = r0.f1427
            int r5 = r4.length
            int r5 = r5 + (-2)
            if (r5 < 0) goto L77
            r6 = 0
            r7 = r6
            r8 = r7
        L20:
            r9 = r4[r7]
            long r11 = ~r9
            r13 = 7
            long r11 = r11 << r13
            long r11 = r11 & r9
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r11 = r11 & r13
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 == 0) goto L72
            int r11 = r7 - r5
            int r11 = ~r11
            int r11 = r11 >>> 31
            r12 = 8
            int r11 = 8 - r11
            r13 = r6
        L3a:
            if (r13 >= r11) goto L70
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r9
            r16 = 128(0x80, double:6.3E-322)
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto L6c
            int r14 = r7 << 3
            int r14 = r14 + r13
            r15 = r2[r14]
            r14 = r3[r14]
            java.lang.String r16 = "(this)"
            if (r15 != r0) goto L52
            r15 = r16
        L52:
            r1.append(r15)
            java.lang.String r15 = "="
            r1.append(r15)
            if (r14 != r0) goto L5e
            r14 = r16
        L5e:
            r1.append(r14)
            int r8 = r8 + 1
            int r14 = r0.f1431
            if (r8 >= r14) goto L6c
            java.lang.String r14 = ", "
            r1.append(r14)
        L6c:
            long r9 = r9 >> r12
            int r13 = r13 + 1
            goto L3a
        L70:
            if (r11 != r12) goto L77
        L72:
            if (r7 == r5) goto L77
            int r7 = r7 + 1
            goto L20
        L77:
            r0 = 125(0x7d, float:1.75E-43)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
    }

    /* JADX INFO: renamed from: α */
    public final void m689() {
            r10 = this;
            r0 = 0
            r10.f1431 = r0
            long[] r1 = r10.f1427
            long[] r2 = p000.tq1.f10431
            if (r1 == r2) goto L25
            r2 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            p000.AbstractC0312g7.m2245(r2, r1)
            long[] r1 = r10.f1427
            int r2 = r10.f1430
            int r3 = r2 >> 3
            r2 = r2 & 7
            int r2 = r2 << 3
            r4 = r1[r3]
            r6 = 255(0xff, double:1.26E-321)
            long r6 = r6 << r2
            long r8 = ~r6
            long r4 = r4 & r8
            long r4 = r4 | r6
            r1[r3] = r4
        L25:
            java.lang.Object[] r1 = r10.f1429
            int r2 = r10.f1430
            r3 = 0
            p000.AbstractC0312g7.m2244(r0, r2, r3, r1)
            java.lang.Object[] r1 = r10.f1428
            int r2 = r10.f1430
            p000.AbstractC0312g7.m2244(r0, r2, r3, r1)
            int r0 = r10.f1430
            int r0 = p000.tq1.m5731(r0)
            int r1 = r10.f1431
            int r0 = r0 - r1
            r10.f1432 = r0
            return
    }

    /* JADX INFO: renamed from: β */
    public final boolean m690(java.lang.Object r18) {
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = 0
            if (r1 == 0) goto Lc
            int r3 = r1.hashCode()
            goto Ld
        Lc:
            r3 = r2
        Ld:
            r4 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r3 = r3 * r4
            int r4 = r3 << 16
            r3 = r3 ^ r4
            r4 = r3 & 127(0x7f, float:1.78E-43)
            int r5 = r0.f1430
            int r3 = r3 >>> 7
            r3 = r3 & r5
            r6 = r2
        L1c:
            long[] r7 = r0.f1427
            int r8 = r3 >> 3
            r9 = r3 & 7
            int r9 = r9 << 3
            r10 = r7[r8]
            long r10 = r10 >>> r9
            r12 = 1
            int r8 = r8 + r12
            r7 = r7[r8]
            int r13 = 64 - r9
            long r7 = r7 << r13
            long r13 = (long) r9
            long r13 = -r13
            r9 = 63
            long r13 = r13 >> r9
            long r7 = r7 & r13
            long r7 = r7 | r10
            long r9 = (long) r4
            r13 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r9 = r9 * r13
            long r9 = r9 ^ r7
            long r13 = r9 - r13
            long r9 = ~r9
            long r9 = r9 & r13
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = r9 & r13
        L47:
            r15 = 0
            int r11 = (r9 > r15 ? 1 : (r9 == r15 ? 0 : -1))
            if (r11 == 0) goto L66
            int r11 = java.lang.Long.numberOfTrailingZeros(r9)
            int r11 = r11 >> 3
            int r11 = r11 + r3
            r11 = r11 & r5
            java.lang.Object[] r15 = r0.f1428
            r15 = r15[r11]
            boolean r15 = p000.ln0.m3626(r15, r1)
            if (r15 == 0) goto L60
            goto L70
        L60:
            r15 = 1
            long r15 = r9 - r15
            long r9 = r9 & r15
            goto L47
        L66:
            long r9 = ~r7
            r11 = 6
            long r9 = r9 << r11
            long r7 = r7 & r9
            long r7 = r7 & r13
            int r7 = (r7 > r15 ? 1 : (r7 == r15 ? 0 : -1))
            if (r7 == 0) goto L74
            r11 = -1
        L70:
            if (r11 < 0) goto L73
            return r12
        L73:
            return r2
        L74:
            int r6 = r6 + 8
            int r3 = r3 + r6
            r3 = r3 & r5
            goto L1c
    }

    /* JADX INFO: renamed from: γ */
    public final boolean m691(java.lang.Object r18) {
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = 0
            if (r1 == 0) goto Lc
            int r3 = r1.hashCode()
            goto Ld
        Lc:
            r3 = r2
        Ld:
            r4 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r3 = r3 * r4
            int r4 = r3 << 16
            r3 = r3 ^ r4
            r4 = r3 & 127(0x7f, float:1.78E-43)
            int r5 = r0.f1430
            int r3 = r3 >>> 7
            r3 = r3 & r5
            r6 = r2
        L1c:
            long[] r7 = r0.f1427
            int r8 = r3 >> 3
            r9 = r3 & 7
            int r9 = r9 << 3
            r10 = r7[r8]
            long r10 = r10 >>> r9
            r12 = 1
            int r8 = r8 + r12
            r7 = r7[r8]
            int r13 = 64 - r9
            long r7 = r7 << r13
            long r13 = (long) r9
            long r13 = -r13
            r9 = 63
            long r13 = r13 >> r9
            long r7 = r7 & r13
            long r7 = r7 | r10
            long r9 = (long) r4
            r13 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r9 = r9 * r13
            long r9 = r9 ^ r7
            long r13 = r9 - r13
            long r9 = ~r9
            long r9 = r9 & r13
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = r9 & r13
        L47:
            r15 = 0
            int r11 = (r9 > r15 ? 1 : (r9 == r15 ? 0 : -1))
            if (r11 == 0) goto L66
            int r11 = java.lang.Long.numberOfTrailingZeros(r9)
            int r11 = r11 >> 3
            int r11 = r11 + r3
            r11 = r11 & r5
            java.lang.Object[] r15 = r0.f1428
            r15 = r15[r11]
            boolean r15 = p000.ln0.m3626(r15, r1)
            if (r15 == 0) goto L60
            goto L70
        L60:
            r15 = 1
            long r15 = r9 - r15
            long r9 = r9 & r15
            goto L47
        L66:
            long r9 = ~r7
            r11 = 6
            long r9 = r9 << r11
            long r7 = r7 & r9
            long r7 = r7 & r13
            int r7 = (r7 > r15 ? 1 : (r7 == r15 ? 0 : -1))
            if (r7 == 0) goto L74
            r11 = -1
        L70:
            if (r11 < 0) goto L73
            return r12
        L73:
            return r2
        L74:
            int r6 = r6 + 8
            int r3 = r3 + r6
            r3 = r3 & r5
            goto L1c
    }

    /* JADX INFO: renamed from: δ */
    public final boolean m692(java.lang.Object r14) {
            r13 = this;
            java.lang.Object[] r0 = r13.f1429
            long[] r13 = r13.f1427
            int r1 = r13.length
            int r1 = r1 + (-2)
            r2 = 0
            if (r1 < 0) goto L48
            r3 = r2
        Lb:
            r4 = r13[r3]
            long r6 = ~r4
            r8 = 7
            long r6 = r6 << r8
            long r6 = r6 & r4
            r8 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r6 = r6 & r8
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 == 0) goto L43
            int r6 = r3 - r1
            int r6 = ~r6
            int r6 = r6 >>> 31
            r7 = 8
            int r6 = 8 - r6
            r8 = r2
        L25:
            if (r8 >= r6) goto L41
            r9 = 255(0xff, double:1.26E-321)
            long r9 = r9 & r4
            r11 = 128(0x80, double:6.3E-322)
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 >= 0) goto L3d
            int r9 = r3 << 3
            int r9 = r9 + r8
            r9 = r0[r9]
            boolean r9 = p000.ln0.m3626(r14, r9)
            if (r9 == 0) goto L3d
            r13 = 1
            return r13
        L3d:
            long r4 = r4 >> r7
            int r8 = r8 + 1
            goto L25
        L41:
            if (r6 != r7) goto L48
        L43:
            if (r3 == r1) goto L48
            int r3 = r3 + 1
            goto Lb
        L48:
            return r2
    }

    /* JADX INFO: renamed from: ε */
    public final int m693(int r10) {
            r9 = this;
            int r0 = r9.f1430
            r10 = r10 & r0
            r1 = 0
        L4:
            long[] r2 = r9.f1427
            int r3 = r10 >> 3
            r4 = r10 & 7
            int r4 = r4 << 3
            r5 = r2[r3]
            long r5 = r5 >>> r4
            int r3 = r3 + 1
            r2 = r2[r3]
            int r7 = 64 - r4
            long r2 = r2 << r7
            long r7 = (long) r4
            long r7 = -r7
            r4 = 63
            long r7 = r7 >> r4
            long r2 = r2 & r7
            long r2 = r2 | r5
            long r4 = ~r2
            r6 = 7
            long r4 = r4 << r6
            long r2 = r2 & r4
            r4 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r2 = r2 & r4
            r4 = 0
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 == 0) goto L37
            int r9 = java.lang.Long.numberOfTrailingZeros(r2)
            int r9 = r9 >> 3
            int r10 = r10 + r9
            r9 = r10 & r0
            return r9
        L37:
            int r1 = r1 + 8
            int r10 = r10 + r1
            r10 = r10 & r0
            goto L4
    }

    /* JADX INFO: renamed from: ζ */
    public final int m694(java.lang.Object r32) {
            r31 = this;
            r0 = r31
            r1 = r32
            if (r1 == 0) goto Lb
            int r3 = r1.hashCode()
            goto Lc
        Lb:
            r3 = 0
        Lc:
            r4 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r3 = r3 * r4
            int r5 = r3 << 16
            r3 = r3 ^ r5
            int r5 = r3 >>> 7
            r3 = r3 & 127(0x7f, float:1.78E-43)
            int r6 = r0.f1430
            r7 = r5 & r6
            r8 = 0
        L1c:
            long[] r9 = r0.f1427
            int r10 = r7 >> 3
            r11 = r7 & 7
            int r11 = r11 << 3
            r12 = r9[r10]
            long r12 = r12 >>> r11
            r14 = 1
            int r10 = r10 + r14
            r9 = r9[r10]
            int r15 = 64 - r11
            long r9 = r9 << r15
            r16 = r14
            long r14 = (long) r11
            long r14 = -r14
            r11 = 63
            long r14 = r14 >> r11
            long r9 = r9 & r14
            long r9 = r9 | r12
            long r11 = (long) r3
            r13 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r17 = r11 * r13
            r19 = r3
            r15 = 0
            long r2 = r9 ^ r17
            long r13 = r2 - r13
            long r2 = ~r2
            long r2 = r2 & r13
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r2 = r2 & r13
        L4e:
            r17 = 0
            int r20 = (r2 > r17 ? 1 : (r2 == r17 ? 0 : -1))
            if (r20 == 0) goto L74
            int r17 = java.lang.Long.numberOfTrailingZeros(r2)
            int r17 = r17 >> 3
            int r17 = r7 + r17
            r17 = r17 & r6
            r20 = r4
            java.lang.Object[] r4 = r0.f1428
            r4 = r4[r17]
            boolean r4 = p000.ln0.m3626(r4, r1)
            if (r4 == 0) goto L6b
            return r17
        L6b:
            r17 = 1
            long r17 = r2 - r17
            long r2 = r2 & r17
            r4 = r20
            goto L4e
        L74:
            r20 = r4
            long r2 = ~r9
            r4 = 6
            long r2 = r2 << r4
            long r2 = r2 & r9
            long r2 = r2 & r13
            int r2 = (r2 > r17 ? 1 : (r2 == r17 ? 0 : -1))
            r3 = 8
            if (r2 == 0) goto L29a
            int r1 = r0.m693(r5)
            int r2 = r0.f1432
            r8 = 255(0xff, double:1.26E-321)
            if (r2 != 0) goto L9f
            long[] r2 = r0.f1427
            int r10 = r1 >> 3
            r17 = r2[r10]
            r2 = r1 & 7
            int r2 = r2 << 3
            long r17 = r17 >> r2
            long r17 = r17 & r8
            r21 = 254(0xfe, double:1.255E-321)
            int r2 = (r17 > r21 ? 1 : (r17 == r21 ? 0 : -1))
            if (r2 != 0) goto La9
        L9f:
            r25 = r8
            r23 = r11
            r32 = 7
            r18 = 128(0x80, double:6.3E-322)
            goto L264
        La9:
            int r1 = r0.f1430
            if (r1 <= r3) goto L1e7
            int r2 = r0.f1431
            r10 = r3
            r32 = 7
            long r3 = (long) r2
            r17 = 32
            long r3 = r3 * r17
            long r1 = (long) r1
            r17 = 25
            long r1 = r1 * r17
            int r1 = java.lang.Long.compareUnsigned(r3, r1)
            if (r1 > 0) goto L1e0
            long[] r1 = r0.f1427
            int r2 = r0.f1430
            java.lang.Object[] r3 = r0.f1428
            java.lang.Object[] r4 = r0.f1429
            int r17 = r2 + 7
            r18 = 128(0x80, double:6.3E-322)
            int r6 = r17 >> 3
            r7 = r15
        Ld1:
            if (r7 >= r6) goto Lf0
            r23 = r1[r7]
            r25 = r8
            long r8 = r23 & r13
            r23 = r11
            r12 = r10
            long r10 = ~r8
            long r8 = r8 >>> r32
            long r10 = r10 + r8
            r8 = -72340172838076674(0xfefefefefefefefe, double:-5.3140103725178076E303)
            long r8 = r8 & r10
            r1[r7] = r8
            int r7 = r7 + 1
            r10 = r12
            r11 = r23
            r8 = r25
            goto Ld1
        Lf0:
            r25 = r8
            r23 = r11
            r12 = r10
            int r6 = p000.AbstractC0312g7.m2252(r1)
            int r7 = r6 + (-1)
            r8 = r1[r7]
            r10 = 72057594037927935(0xffffffffffffff, double:7.291122019556397E-304)
            long r8 = r8 & r10
            r10 = -72057594037927936(0xff00000000000000, double:-5.486124068793689E303)
            long r8 = r8 | r10
            r1[r7] = r8
            r7 = r1[r15]
            r1[r6] = r7
            r6 = r15
        L10d:
            if (r6 == r2) goto L1d3
            int r7 = r6 >> 3
            r8 = r1[r7]
            r10 = r6 & 7
            int r10 = r10 << 3
            long r8 = r8 >> r10
            long r8 = r8 & r25
            int r11 = (r8 > r18 ? 1 : (r8 == r18 ? 0 : -1))
            if (r11 != 0) goto L121
        L11e:
            int r6 = r6 + 1
            goto L10d
        L121:
            int r8 = (r8 > r21 ? 1 : (r8 == r21 ? 0 : -1))
            if (r8 == 0) goto L126
            goto L11e
        L126:
            r8 = r3[r6]
            if (r8 == 0) goto L12f
            int r8 = r8.hashCode()
            goto L130
        L12f:
            r8 = r15
        L130:
            int r8 = r8 * r20
            int r9 = r8 << 16
            r8 = r8 ^ r9
            int r9 = r8 >>> 7
            int r11 = r0.m693(r9)
            r9 = r9 & r2
            int r13 = r11 - r9
            r13 = r13 & r2
            int r13 = r13 / r12
            int r9 = r6 - r9
            r9 = r9 & r2
            int r9 = r9 / r12
            if (r13 != r9) goto L164
            r8 = r8 & 127(0x7f, float:1.78E-43)
            long r8 = (long) r8
            r13 = r1[r7]
            r17 = r12
            r27 = r13
            long r12 = r25 << r10
            long r11 = ~r12
            long r11 = r27 & r11
            long r8 = r8 << r10
            long r8 = r8 | r11
            r1[r7] = r8
            int r7 = r1.length
            int r7 = r7 + (-1)
            r8 = r1[r15]
            r1[r7] = r8
            int r6 = r6 + 1
            r12 = r17
            goto L10d
        L164:
            r17 = r12
            int r9 = r11 >> 3
            r12 = r1[r9]
            r14 = r11 & 7
            int r14 = r14 << 3
            long r27 = r12 >> r14
            long r27 = r27 & r25
            int r27 = (r27 > r18 ? 1 : (r27 == r18 ? 0 : -1))
            if (r27 != 0) goto L1a1
            r8 = r8 & 127(0x7f, float:1.78E-43)
            r27 = r2
            r28 = r3
            long r2 = (long) r8
            r29 = r2
            long r2 = r25 << r14
            long r2 = ~r2
            long r2 = r2 & r12
            long r12 = r29 << r14
            long r2 = r2 | r12
            r1[r9] = r2
            r2 = r1[r7]
            long r8 = r25 << r10
            long r8 = ~r8
            long r2 = r2 & r8
            long r8 = r18 << r10
            long r2 = r2 | r8
            r1[r7] = r2
            r2 = r28[r6]
            r28[r11] = r2
            r2 = 0
            r28[r6] = r2
            r3 = r4[r6]
            r4[r11] = r3
            r4[r6] = r2
            goto L1c2
        L1a1:
            r27 = r2
            r28 = r3
            r2 = r8 & 127(0x7f, float:1.78E-43)
            long r2 = (long) r2
            long r7 = r25 << r14
            long r7 = ~r7
            long r7 = r7 & r12
            long r2 = r2 << r14
            long r2 = r2 | r7
            r1[r9] = r2
            r2 = r28[r11]
            r3 = r28[r6]
            r28[r11] = r3
            r28[r6] = r2
            r2 = r4[r11]
            r3 = r4[r6]
            r4[r11] = r3
            r4[r6] = r2
            int r6 = r6 + (-1)
        L1c2:
            int r2 = r1.length
            int r2 = r2 + (-1)
            r7 = r1[r15]
            r1[r2] = r7
            int r6 = r6 + 1
            r12 = r17
            r2 = r27
            r3 = r28
            goto L10d
        L1d3:
            int r1 = r0.f1430
            int r1 = p000.tq1.m5731(r1)
            int r2 = r0.f1431
            int r1 = r1 - r2
            r0.f1432 = r1
            goto L260
        L1e0:
            r25 = r8
            r23 = r11
            r18 = 128(0x80, double:6.3E-322)
            goto L1ea
        L1e7:
            r32 = 7
            goto L1e0
        L1ea:
            int r1 = r0.f1430
            int r1 = p000.tq1.m5732(r1)
            long[] r2 = r0.f1427
            java.lang.Object[] r3 = r0.f1428
            java.lang.Object[] r4 = r0.f1429
            int r6 = r0.f1430
            r0.m696(r1)
            long[] r1 = r0.f1427
            java.lang.Object[] r7 = r0.f1428
            java.lang.Object[] r8 = r0.f1429
            int r9 = r0.f1430
            r10 = r15
        L204:
            if (r10 >= r6) goto L260
            int r11 = r10 >> 3
            r11 = r2[r11]
            r13 = r10 & 7
            int r13 = r13 << 3
            long r11 = r11 >> r13
            long r11 = r11 & r25
            int r11 = (r11 > r18 ? 1 : (r11 == r18 ? 0 : -1))
            if (r11 >= 0) goto L257
            r11 = r3[r10]
            if (r11 == 0) goto L21e
            int r12 = r11.hashCode()
            goto L21f
        L21e:
            r12 = r15
        L21f:
            int r12 = r12 * r20
            int r13 = r12 << 16
            r12 = r12 ^ r13
            int r13 = r12 >>> 7
            int r13 = r0.m693(r13)
            r12 = r12 & 127(0x7f, float:1.78E-43)
            r17 = r1
            r14 = r2
            long r1 = (long) r12
            int r12 = r13 >> 3
            r21 = r13 & 7
            int r21 = r21 << 3
            r27 = r17[r12]
            r29 = r1
            long r1 = r25 << r21
            long r1 = ~r1
            long r1 = r27 & r1
            long r21 = r29 << r21
            long r1 = r1 | r21
            r17[r12] = r1
            int r12 = r13 + (-7)
            r12 = r12 & r9
            r21 = r9 & 7
            int r12 = r12 + r21
            int r12 = r12 >> 3
            r17[r12] = r1
            r7[r13] = r11
            r1 = r4[r10]
            r8[r13] = r1
            goto L25a
        L257:
            r17 = r1
            r14 = r2
        L25a:
            int r10 = r10 + 1
            r2 = r14
            r1 = r17
            goto L204
        L260:
            int r1 = r0.m693(r5)
        L264:
            int r2 = r0.f1431
            int r2 = r2 + 1
            r0.f1431 = r2
            int r2 = r0.f1432
            long[] r3 = r0.f1427
            int r4 = r1 >> 3
            r5 = r3[r4]
            r7 = r1 & 7
            int r7 = r7 << 3
            long r8 = r5 >> r7
            long r8 = r8 & r25
            int r8 = (r8 > r18 ? 1 : (r8 == r18 ? 0 : -1))
            if (r8 != 0) goto L280
            r15 = r16
        L280:
            int r2 = r2 - r15
            r0.f1432 = r2
            int r0 = r0.f1430
            long r8 = r25 << r7
            long r8 = ~r8
            long r5 = r5 & r8
            long r7 = r23 << r7
            long r5 = r5 | r7
            r3[r4] = r5
            int r2 = r1 + (-7)
            r2 = r2 & r0
            r0 = r0 & 7
            int r2 = r2 + r0
            int r0 = r2 >> 3
            r3[r0] = r5
            int r0 = ~r1
            return r0
        L29a:
            r17 = r3
            int r8 = r8 + 8
            int r7 = r7 + r8
            r7 = r7 & r6
            r3 = r19
            r4 = r20
            goto L1c
    }

    /* JADX INFO: renamed from: η */
    public final java.lang.Object m695(java.lang.Object r14) {
            r13 = this;
            r0 = 0
            if (r14 == 0) goto L8
            int r1 = r14.hashCode()
            goto L9
        L8:
            r1 = r0
        L9:
            r2 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r1 = r1 * r2
            int r2 = r1 << 16
            r1 = r1 ^ r2
            r2 = r1 & 127(0x7f, float:1.78E-43)
            int r3 = r13.f1430
            int r1 = r1 >>> 7
        L16:
            r1 = r1 & r3
            long[] r4 = r13.f1427
            int r5 = r1 >> 3
            r6 = r1 & 7
            int r6 = r6 << 3
            r7 = r4[r5]
            long r7 = r7 >>> r6
            int r5 = r5 + 1
            r4 = r4[r5]
            int r9 = 64 - r6
            long r4 = r4 << r9
            long r9 = (long) r6
            long r9 = -r9
            r6 = 63
            long r9 = r9 >> r6
            long r4 = r4 & r9
            long r4 = r4 | r7
            long r6 = (long) r2
            r8 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r6 = r6 * r8
            long r6 = r6 ^ r4
            long r8 = r6 - r8
            long r6 = ~r6
            long r6 = r6 & r8
            r8 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r6 = r6 & r8
        L42:
            r10 = 0
            int r12 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r12 == 0) goto L61
            int r10 = java.lang.Long.numberOfTrailingZeros(r6)
            int r10 = r10 >> 3
            int r10 = r10 + r1
            r10 = r10 & r3
            java.lang.Object[] r11 = r13.f1428
            r11 = r11[r10]
            boolean r11 = p000.ln0.m3626(r11, r14)
            if (r11 == 0) goto L5b
            goto L6b
        L5b:
            r10 = 1
            long r10 = r6 - r10
            long r6 = r6 & r10
            goto L42
        L61:
            long r6 = ~r4
            r12 = 6
            long r6 = r6 << r12
            long r4 = r4 & r6
            long r4 = r4 & r8
            int r4 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r4 == 0) goto L74
            r10 = -1
        L6b:
            if (r10 < 0) goto L72
            java.lang.Object[] r13 = r13.f1429
            r13 = r13[r10]
            return r13
        L72:
            r13 = 0
            return r13
        L74:
            int r0 = r0 + 8
            int r1 = r1 + r0
            goto L16
    }

    /* JADX INFO: renamed from: θ */
    public final void m696(int r11) {
            r10 = this;
            java.lang.Object[] r0 = p000.AbstractC1021yh.f12618
            r1 = 0
            if (r11 <= 0) goto Lf
            int r11 = p000.tq1.m5733(r11)
            r2 = 7
            int r11 = java.lang.Math.max(r2, r11)
            goto L10
        Lf:
            r11 = r1
        L10:
            r10.f1430 = r11
            if (r11 != 0) goto L17
            long[] r1 = p000.tq1.f10431
            goto L38
        L17:
            int r2 = r11 + 15
            r2 = r2 & (-8)
            int r2 = r2 >> 3
            long[] r3 = new long[r2]
            r4 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            java.util.Arrays.fill(r3, r1, r2, r4)
            int r1 = r11 >> 3
            r2 = r11 & 7
            int r2 = r2 << 3
            r4 = r3[r1]
            r6 = 255(0xff, double:1.26E-321)
            long r6 = r6 << r2
            long r8 = ~r6
            long r4 = r4 & r8
            long r4 = r4 | r6
            r3[r1] = r4
            r1 = r3
        L38:
            r10.f1427 = r1
            int r1 = r10.f1430
            int r1 = p000.tq1.m5731(r1)
            int r2 = r10.f1431
            int r1 = r1 - r2
            r10.f1432 = r1
            if (r11 != 0) goto L49
            r1 = r0
            goto L4b
        L49:
            java.lang.Object[] r1 = new java.lang.Object[r11]
        L4b:
            r10.f1428 = r1
            if (r11 != 0) goto L50
            goto L52
        L50:
            java.lang.Object[] r0 = new java.lang.Object[r11]
        L52:
            r10.f1429 = r0
            return
    }

    /* JADX INFO: renamed from: ι */
    public final boolean m697() {
            r0 = this;
            int r0 = r0.f1431
            if (r0 != 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: κ */
    public final boolean m698() {
            r0 = this;
            int r0 = r0.f1431
            if (r0 == 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: λ */
    public final java.lang.Object m699(java.lang.Object r14) {
            r13 = this;
            r0 = 0
            if (r14 == 0) goto L8
            int r1 = r14.hashCode()
            goto L9
        L8:
            r1 = r0
        L9:
            r2 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r1 = r1 * r2
            int r2 = r1 << 16
            r1 = r1 ^ r2
            r2 = r1 & 127(0x7f, float:1.78E-43)
            int r3 = r13.f1430
            int r1 = r1 >>> 7
        L16:
            r1 = r1 & r3
            long[] r4 = r13.f1427
            int r5 = r1 >> 3
            r6 = r1 & 7
            int r6 = r6 << 3
            r7 = r4[r5]
            long r7 = r7 >>> r6
            int r5 = r5 + 1
            r4 = r4[r5]
            int r9 = 64 - r6
            long r4 = r4 << r9
            long r9 = (long) r6
            long r9 = -r9
            r6 = 63
            long r9 = r9 >> r6
            long r4 = r4 & r9
            long r4 = r4 | r7
            long r6 = (long) r2
            r8 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r6 = r6 * r8
            long r6 = r6 ^ r4
            long r8 = r6 - r8
            long r6 = ~r6
            long r6 = r6 & r8
            r8 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r6 = r6 & r8
        L42:
            r10 = 0
            int r12 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r12 == 0) goto L61
            int r10 = java.lang.Long.numberOfTrailingZeros(r6)
            int r10 = r10 >> 3
            int r10 = r10 + r1
            r10 = r10 & r3
            java.lang.Object[] r11 = r13.f1428
            r11 = r11[r10]
            boolean r11 = p000.ln0.m3626(r11, r14)
            if (r11 == 0) goto L5b
            goto L6b
        L5b:
            r10 = 1
            long r10 = r6 - r10
            long r6 = r6 & r10
            goto L42
        L61:
            long r6 = ~r4
            r12 = 6
            long r6 = r6 << r12
            long r4 = r4 & r6
            long r4 = r4 & r8
            int r4 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r4 == 0) goto L74
            r10 = -1
        L6b:
            if (r10 < 0) goto L72
            java.lang.Object r13 = r13.m700(r10)
            return r13
        L72:
            r13 = 0
            return r13
        L74:
            int r0 = r0 + 8
            int r1 = r1 + r0
            goto L16
    }

    /* JADX INFO: renamed from: μ */
    public final java.lang.Object m700(int r9) {
            r8 = this;
            int r0 = r8.f1431
            int r0 = r0 + (-1)
            r8.f1431 = r0
            long[] r0 = r8.f1427
            int r1 = r8.f1430
            int r2 = r9 >> 3
            r3 = r9 & 7
            int r3 = r3 << 3
            r4 = r0[r2]
            r6 = 255(0xff, double:1.26E-321)
            long r6 = r6 << r3
            long r6 = ~r6
            long r4 = r4 & r6
            r6 = 254(0xfe, double:1.255E-321)
            long r6 = r6 << r3
            long r3 = r4 | r6
            r0[r2] = r3
            int r2 = r9 + (-7)
            r2 = r2 & r1
            r1 = r1 & 7
            int r2 = r2 + r1
            int r1 = r2 >> 3
            r0[r1] = r3
            java.lang.Object[] r0 = r8.f1428
            r1 = 0
            r0[r9] = r1
            java.lang.Object[] r8 = r8.f1429
            r0 = r8[r9]
            r8[r9] = r1
            return r0
    }

    /* JADX INFO: renamed from: ν */
    public final void m701(java.lang.Object r3, java.lang.Object r4) {
            r2 = this;
            int r0 = r2.m694(r3)
            if (r0 >= 0) goto L7
            int r0 = ~r0
        L7:
            java.lang.Object[] r1 = r2.f1428
            r1[r0] = r3
            java.lang.Object[] r2 = r2.f1429
            r2[r0] = r4
            return
    }
}
