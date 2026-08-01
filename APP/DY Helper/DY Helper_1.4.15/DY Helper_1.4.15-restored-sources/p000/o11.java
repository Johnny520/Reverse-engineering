package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class o11 {

    /* JADX INFO: renamed from: α */
    public long[] f7866;

    /* JADX INFO: renamed from: β */
    public int[] f7867;

    /* JADX INFO: renamed from: γ */
    public int f7868;

    /* JADX INFO: renamed from: δ */
    public int f7869;

    /* JADX INFO: renamed from: ε */
    public int f7870;

    public /* synthetic */ o11() {
            r1 = this;
            r0 = 6
            r1.<init>(r0)
            return
    }

    public o11(int r2) {
            r1 = this;
            r1.<init>()
            long[] r0 = p000.tq1.f10431
            r1.f7866 = r0
            int[] r0 = p000.an0.f333
            r1.f7867 = r0
            if (r2 < 0) goto Lf
            r0 = 1
            goto L10
        Lf:
            r0 = 0
        L10:
            if (r0 == 0) goto L1a
            int r2 = p000.tq1.m5734(r2)
            r1.m4154(r2)
            return
        L1a:
            java.lang.String r1 = "Capacity must be a positive value."
            p000.C1080.m7275(r1)
            r1 = 0
            throw r1
    }

    public final boolean equals(java.lang.Object r15) {
            r14 = this;
            r0 = 1
            if (r15 != r14) goto L4
            return r0
        L4:
            boolean r1 = r15 instanceof p000.o11
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            o11 r15 = (p000.o11) r15
            int r1 = r15.f7869
            int r3 = r14.f7869
            if (r1 == r3) goto L13
            return r2
        L13:
            int[] r1 = r14.f7867
            long[] r14 = r14.f7866
            int r3 = r14.length
            int r3 = r3 + (-2)
            if (r3 < 0) goto L59
            r4 = r2
        L1d:
            r5 = r14[r4]
            long r7 = ~r5
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L54
            int r7 = r4 - r3
            int r7 = ~r7
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r2
        L37:
            if (r9 >= r7) goto L52
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.3E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L4e
            int r10 = r4 << 3
            int r10 = r10 + r9
            r10 = r1[r10]
            boolean r10 = r15.m4152(r10)
            if (r10 != 0) goto L4e
            return r2
        L4e:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L37
        L52:
            if (r7 != r8) goto L59
        L54:
            if (r4 == r3) goto L59
            int r4 = r4 + 1
            goto L1d
        L59:
            return r0
    }

    public final int hashCode() {
            r14 = this;
            int[] r0 = r14.f7867
            long[] r14 = r14.f7866
            int r1 = r14.length
            int r1 = r1 + (-2)
            r2 = 0
            if (r1 < 0) goto L4a
            r3 = r2
            r4 = r3
        Lc:
            r5 = r14[r3]
            long r7 = ~r5
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L44
            int r7 = r3 - r1
            int r7 = ~r7
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r2
        L26:
            if (r9 >= r7) goto L40
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.3E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L3c
            int r10 = r3 << 3
            int r10 = r10 + r9
            r10 = r0[r10]
            int r10 = java.lang.Integer.hashCode(r10)
            int r10 = r10 + r4
            r4 = r10
        L3c:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L26
        L40:
            if (r7 != r8) goto L43
            goto L44
        L43:
            return r4
        L44:
            if (r3 == r1) goto L49
            int r3 = r3 + 1
            goto Lc
        L49:
            return r4
        L4a:
            return r2
    }

    public final java.lang.String toString() {
            r15 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "["
            r0.append(r1)
            int[] r1 = r15.f7867
            long[] r15 = r15.f7866
            int r2 = r15.length
            int r2 = r2 + (-2)
            if (r2 < 0) goto L60
            r3 = 0
            r4 = r3
            r5 = r4
        L16:
            r6 = r15[r4]
            long r8 = ~r6
            r10 = 7
            long r8 = r8 << r10
            long r8 = r8 & r6
            r10 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r8 = r8 & r10
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 == 0) goto L5b
            int r8 = r4 - r2
            int r8 = ~r8
            int r8 = r8 >>> 31
            r9 = 8
            int r8 = 8 - r8
            r10 = r3
        L30:
            if (r10 >= r8) goto L59
            r11 = 255(0xff, double:1.26E-321)
            long r11 = r11 & r6
            r13 = 128(0x80, double:6.3E-322)
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 >= 0) goto L55
            int r11 = r4 << 3
            int r11 = r11 + r10
            r11 = r1[r11]
            r12 = -1
            if (r5 != r12) goto L49
            java.lang.String r15 = "..."
            r0.append(r15)
            goto L65
        L49:
            if (r5 == 0) goto L50
            java.lang.String r12 = ", "
            r0.append(r12)
        L50:
            r0.append(r11)
            int r5 = r5 + 1
        L55:
            long r6 = r6 >> r9
            int r10 = r10 + 1
            goto L30
        L59:
            if (r8 != r9) goto L60
        L5b:
            if (r4 == r2) goto L60
            int r4 = r4 + 1
            goto L16
        L60:
            java.lang.String r15 = "]"
            r0.append(r15)
        L65:
            java.lang.String r15 = r0.toString()
            return r15
    }

    /* JADX INFO: renamed from: α */
    public final boolean m4151(int r38) {
            r37 = this;
            r0 = r37
            r1 = r38
            int r2 = r0.f7869
            int r3 = java.lang.Integer.hashCode(r1)
            r4 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r3 = r3 * r4
            int r5 = r3 << 16
            r3 = r3 ^ r5
            int r5 = r3 >>> 7
            r3 = r3 & 127(0x7f, float:1.78E-43)
            int r6 = r0.f7868
            r7 = r5 & r6
            r9 = 0
        L1a:
            long[] r10 = r0.f7866
            int r11 = r7 >> 3
            r12 = r7 & 7
            int r12 = r12 << 3
            r13 = r10[r11]
            long r13 = r13 >>> r12
            r15 = 1
            int r11 = r11 + r15
            r10 = r10[r11]
            int r16 = 64 - r12
            long r10 = r10 << r16
            r17 = r9
            r16 = 0
            long r8 = (long) r12
            long r8 = -r8
            r12 = 63
            long r8 = r8 >> r12
            long r8 = r8 & r10
            long r8 = r8 | r13
            long r10 = (long) r3
            r12 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r18 = r10 * r12
            r20 = r12
            long r12 = r8 ^ r18
            long r18 = r12 - r20
            long r12 = ~r12
            long r12 = r18 & r12
            r18 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r12 = r12 & r18
        L50:
            r20 = 0
            int r14 = (r12 > r20 ? 1 : (r12 == r20 ? 0 : -1))
            if (r14 == 0) goto L73
            int r14 = java.lang.Long.numberOfTrailingZeros(r12)
            int r14 = r14 >> 3
            int r14 = r14 + r7
            r14 = r14 & r6
            r22 = r4
            int[] r4 = r0.f7867
            r4 = r4[r14]
            if (r4 != r1) goto L6a
            r29 = r15
            goto L28f
        L6a:
            r20 = 1
            long r20 = r12 - r20
            long r12 = r12 & r20
            r4 = r22
            goto L50
        L73:
            r22 = r4
            long r12 = ~r8
            r4 = 6
            long r12 = r12 << r4
            long r8 = r8 & r12
            long r8 = r8 & r18
            int r4 = (r8 > r20 ? 1 : (r8 == r20 ? 0 : -1))
            r8 = 8
            if (r4 == 0) goto L299
            int r3 = r0.m4153(r5)
            int r4 = r0.f7870
            r12 = 255(0xff, double:1.26E-321)
            if (r4 != 0) goto L9f
            long[] r4 = r0.f7866
            int r14 = r3 >> 3
            r20 = r4[r14]
            r4 = r3 & 7
            int r4 = r4 << 3
            long r20 = r20 >> r4
            long r20 = r20 & r12
            r23 = 254(0xfe, double:1.255E-321)
            int r4 = (r20 > r23 ? 1 : (r20 == r23 ? 0 : -1))
            if (r4 != 0) goto La9
        L9f:
            r25 = r12
            r29 = r15
            r17 = 7
            r20 = 128(0x80, double:6.3E-322)
            goto L257
        La9:
            int r3 = r0.f7868
            if (r3 <= r8) goto L1e2
            int r4 = r0.f7869
            r20 = 128(0x80, double:6.3E-322)
            long r6 = (long) r4
            r25 = 32
            long r6 = r6 * r25
            long r3 = (long) r3
            r25 = 25
            long r3 = r3 * r25
            int r3 = java.lang.Long.compareUnsigned(r6, r3)
            if (r3 > 0) goto L1db
            long[] r3 = r0.f7866
            int r4 = r0.f7868
            int[] r6 = r0.f7867
            int r7 = r4 + 7
            int r7 = r7 >> 3
            r14 = r16
        Lcd:
            if (r14 >= r7) goto Lec
            r25 = r3[r14]
            r27 = r8
            r17 = 7
            long r8 = r25 & r18
            r25 = r12
            long r12 = ~r8
            long r8 = r8 >>> r17
            long r12 = r12 + r8
            r8 = -72340172838076674(0xfefefefefefefefe, double:-5.3140103725178076E303)
            long r8 = r8 & r12
            r3[r14] = r8
            int r14 = r14 + 1
            r12 = r25
            r8 = r27
            goto Lcd
        Lec:
            r27 = r8
            r25 = r12
            r17 = 7
            int r7 = p000.AbstractC0312g7.m2252(r3)
            int r8 = r7 + (-1)
            r12 = r3[r8]
            r18 = 72057594037927935(0xffffffffffffff, double:7.291122019556397E-304)
            long r12 = r12 & r18
            r28 = -72057594037927936(0xff00000000000000, double:-5.486124068793689E303)
            long r12 = r12 | r28
            r3[r8] = r12
            r8 = r3[r16]
            r3[r7] = r8
            r7 = r16
        L10d:
            if (r7 == r4) goto L1cc
            int r8 = r7 >> 3
            r12 = r3[r8]
            r9 = r7 & 7
            int r9 = r9 << 3
            long r12 = r12 >> r9
            long r12 = r12 & r25
            int r14 = (r12 > r20 ? 1 : (r12 == r20 ? 0 : -1))
            if (r14 != 0) goto L121
        L11e:
            int r7 = r7 + 1
            goto L10d
        L121:
            int r12 = (r12 > r23 ? 1 : (r12 == r23 ? 0 : -1))
            if (r12 == 0) goto L126
            goto L11e
        L126:
            r12 = r6[r7]
            int r12 = java.lang.Integer.hashCode(r12)
            int r12 = r12 * r22
            int r13 = r12 << 16
            r12 = r12 ^ r13
            int r13 = r12 >>> 7
            int r14 = r0.m4153(r13)
            r13 = r13 & r4
            int r28 = r14 - r13
            r28 = r28 & r4
            r29 = r15
            int r15 = r28 / 8
            int r13 = r7 - r13
            r13 = r13 & r4
            int r13 = r13 / 8
            r30 = -9223372036854775808
            if (r15 != r13) goto L16c
            r12 = r12 & 127(0x7f, float:1.78E-43)
            long r12 = (long) r12
            r14 = r3[r8]
            r28 = r6
            r32 = r7
            long r6 = r25 << r9
            long r6 = ~r6
            long r6 = r6 & r14
            long r12 = r12 << r9
            long r6 = r6 | r12
            r3[r8] = r6
            int r6 = r3.length
            int r6 = r6 + (-1)
            r7 = r3[r16]
            long r7 = r7 & r18
            long r7 = r7 | r30
            r3[r6] = r7
            int r7 = r32 + 1
        L167:
            r6 = r28
            r15 = r29
            goto L10d
        L16c:
            r28 = r6
            r32 = r7
            int r6 = r14 >> 3
            r33 = r3[r6]
            r7 = r14 & 7
            int r7 = r7 << 3
            long r35 = r33 >> r7
            long r35 = r35 & r25
            int r13 = (r35 > r20 ? 1 : (r35 == r20 ? 0 : -1))
            if (r13 != 0) goto L1a4
            r12 = r12 & 127(0x7f, float:1.78E-43)
            long r12 = (long) r12
            r15 = r6
            r35 = r7
            long r6 = r25 << r35
            long r6 = ~r6
            long r6 = r33 & r6
            long r12 = r12 << r35
            long r6 = r6 | r12
            r3[r15] = r6
            r6 = r3[r8]
            long r12 = r25 << r9
            long r12 = ~r12
            long r6 = r6 & r12
            long r12 = r20 << r9
            long r6 = r6 | r12
            r3[r8] = r6
            r6 = r28[r32]
            r28[r14] = r6
            r28[r32] = r16
            r7 = r32
            goto L1be
        L1a4:
            r15 = r6
            r35 = r7
            r6 = r12 & 127(0x7f, float:1.78E-43)
            long r6 = (long) r6
            long r8 = r25 << r35
            long r8 = ~r8
            long r8 = r33 & r8
            long r6 = r6 << r35
            long r6 = r6 | r8
            r3[r15] = r6
            r6 = r28[r14]
            r7 = r28[r32]
            r28[r14] = r7
            r28[r32] = r6
            int r7 = r32 + (-1)
        L1be:
            int r6 = r3.length
            int r6 = r6 + (-1)
            r8 = r3[r16]
            long r8 = r8 & r18
            long r8 = r8 | r30
            r3[r6] = r8
            int r7 = r7 + 1
            goto L167
        L1cc:
            r29 = r15
            int r3 = r0.f7868
            int r3 = p000.tq1.m5731(r3)
            int r4 = r0.f7869
            int r3 = r3 - r4
            r0.f7870 = r3
            goto L253
        L1db:
            r25 = r12
            r29 = r15
            r17 = 7
            goto L1e5
        L1e2:
            r20 = 128(0x80, double:6.3E-322)
            goto L1db
        L1e5:
            int r3 = r0.f7868
            int r3 = p000.tq1.m5732(r3)
            long[] r4 = r0.f7866
            int[] r6 = r0.f7867
            int r7 = r0.f7868
            r0.m4154(r3)
            long[] r3 = r0.f7866
            int[] r8 = r0.f7867
            int r9 = r0.f7868
            r12 = r16
        L1fc:
            if (r12 >= r7) goto L253
            int r13 = r12 >> 3
            r13 = r4[r13]
            r15 = r12 & 7
            int r15 = r15 << 3
            long r13 = r13 >> r15
            long r13 = r13 & r25
            int r13 = (r13 > r20 ? 1 : (r13 == r20 ? 0 : -1))
            if (r13 >= 0) goto L248
            r13 = r6[r12]
            int r14 = java.lang.Integer.hashCode(r13)
            int r14 = r14 * r22
            int r15 = r14 << 16
            r14 = r14 ^ r15
            int r15 = r14 >>> 7
            int r15 = r0.m4153(r15)
            r14 = r14 & 127(0x7f, float:1.78E-43)
            r19 = r3
            r18 = r4
            long r3 = (long) r14
            int r14 = r15 >> 3
            r23 = r15 & 7
            int r23 = r23 << 3
            r27 = r19[r14]
            r30 = r3
            long r3 = r25 << r23
            long r3 = ~r3
            long r3 = r27 & r3
            long r23 = r30 << r23
            long r3 = r3 | r23
            r19[r14] = r3
            int r14 = r15 + (-7)
            r14 = r14 & r9
            r23 = r9 & 7
            int r14 = r14 + r23
            int r14 = r14 >> 3
            r19[r14] = r3
            r8[r15] = r13
            goto L24c
        L248:
            r19 = r3
            r18 = r4
        L24c:
            int r12 = r12 + 1
            r4 = r18
            r3 = r19
            goto L1fc
        L253:
            int r3 = r0.m4153(r5)
        L257:
            r14 = r3
            int r3 = r0.f7869
            int r3 = r3 + 1
            r0.f7869 = r3
            int r3 = r0.f7870
            long[] r4 = r0.f7866
            int r5 = r14 >> 3
            r6 = r4[r5]
            r8 = r14 & 7
            int r8 = r8 << 3
            long r12 = r6 >> r8
            long r12 = r12 & r25
            int r9 = (r12 > r20 ? 1 : (r12 == r20 ? 0 : -1))
            if (r9 != 0) goto L275
            r9 = r29
            goto L277
        L275:
            r9 = r16
        L277:
            int r3 = r3 - r9
            r0.f7870 = r3
            int r3 = r0.f7868
            long r12 = r25 << r8
            long r12 = ~r12
            long r6 = r6 & r12
            long r8 = r10 << r8
            long r6 = r6 | r8
            r4[r5] = r6
            int r5 = r14 + (-7)
            r5 = r5 & r3
            r3 = r3 & 7
            int r5 = r5 + r3
            int r3 = r5 >> 3
            r4[r3] = r6
        L28f:
            int[] r3 = r0.f7867
            r3[r14] = r1
            int r0 = r0.f7869
            if (r0 == r2) goto L298
            return r29
        L298:
            return r16
        L299:
            r27 = r8
            int r9 = r17 + 8
            int r7 = r7 + r9
            r7 = r7 & r6
            r4 = r22
            goto L1a
    }

    /* JADX INFO: renamed from: β */
    public final boolean m4152(int r19) {
            r18 = this;
            r0 = r18
            int r1 = java.lang.Integer.hashCode(r19)
            r2 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r1 = r1 * r2
            int r2 = r1 << 16
            r1 = r1 ^ r2
            r2 = r1 & 127(0x7f, float:1.78E-43)
            int r3 = r0.f7868
            int r1 = r1 >>> 7
            r1 = r1 & r3
            r4 = 0
            r5 = r4
        L16:
            long[] r6 = r0.f7866
            int r7 = r1 >> 3
            r8 = r1 & 7
            int r8 = r8 << 3
            r9 = r6[r7]
            long r9 = r9 >>> r8
            r11 = 1
            int r7 = r7 + r11
            r6 = r6[r7]
            int r12 = 64 - r8
            long r6 = r6 << r12
            long r12 = (long) r8
            long r12 = -r12
            r8 = 63
            long r12 = r12 >> r8
            long r6 = r6 & r12
            long r6 = r6 | r9
            long r8 = (long) r2
            r12 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r8 = r8 * r12
            long r8 = r8 ^ r6
            long r12 = r8 - r12
            long r8 = ~r8
            long r8 = r8 & r12
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r8 = r8 & r12
        L41:
            r14 = 0
            int r10 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r10 == 0) goto L5f
            int r10 = java.lang.Long.numberOfTrailingZeros(r8)
            int r10 = r10 >> 3
            int r10 = r10 + r1
            r10 = r10 & r3
            int[] r14 = r0.f7867
            r14 = r14[r10]
            r15 = r19
            if (r14 != r15) goto L58
            goto L69
        L58:
            r16 = 1
            long r16 = r8 - r16
            long r8 = r8 & r16
            goto L41
        L5f:
            long r8 = ~r6
            r10 = 6
            long r8 = r8 << r10
            long r6 = r6 & r8
            long r6 = r6 & r12
            int r6 = (r6 > r14 ? 1 : (r6 == r14 ? 0 : -1))
            if (r6 == 0) goto L6d
            r10 = -1
        L69:
            if (r10 < 0) goto L6c
            return r11
        L6c:
            return r4
        L6d:
            int r5 = r5 + 8
            int r1 = r1 + r5
            r1 = r1 & r3
            goto L16
    }

    /* JADX INFO: renamed from: γ */
    public final int m4153(int r10) {
            r9 = this;
            int r0 = r9.f7868
            r10 = r10 & r0
            r1 = 0
        L4:
            long[] r2 = r9.f7866
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

    /* JADX INFO: renamed from: δ */
    public final void m4154(int r10) {
            r9 = this;
            r0 = 0
            if (r10 <= 0) goto Ld
            int r10 = p000.tq1.m5733(r10)
            r1 = 7
            int r10 = java.lang.Math.max(r1, r10)
            goto Le
        Ld:
            r10 = r0
        Le:
            r9.f7868 = r10
            if (r10 != 0) goto L15
            long[] r0 = p000.tq1.f10431
            goto L26
        L15:
            int r1 = r10 + 15
            r1 = r1 & (-8)
            int r1 = r1 >> 3
            long[] r2 = new long[r1]
            r3 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            java.util.Arrays.fill(r2, r0, r1, r3)
            r0 = r2
        L26:
            r9.f7866 = r0
            int r1 = r10 >> 3
            r2 = r10 & 7
            int r2 = r2 << 3
            r3 = r0[r1]
            r5 = 255(0xff, double:1.26E-321)
            long r5 = r5 << r2
            long r7 = ~r5
            long r2 = r3 & r7
            long r2 = r2 | r5
            r0[r1] = r2
            int r0 = r9.f7868
            int r0 = p000.tq1.m5731(r0)
            int r1 = r9.f7869
            int r0 = r0 - r1
            r9.f7870 = r0
            int[] r10 = new int[r10]
            r9.f7867 = r10
            return
    }

    /* JADX INFO: renamed from: ε */
    public final boolean m4155(int r19) {
            r18 = this;
            r0 = r18
            int r1 = java.lang.Integer.hashCode(r19)
            r2 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r1 = r1 * r2
            int r2 = r1 << 16
            r1 = r1 ^ r2
            r2 = r1 & 127(0x7f, float:1.78E-43)
            int r3 = r0.f7868
            int r1 = r1 >>> 7
            r1 = r1 & r3
            r4 = 0
            r5 = r4
        L16:
            long[] r6 = r0.f7866
            int r7 = r1 >> 3
            r8 = r1 & 7
            int r8 = r8 << 3
            r9 = r6[r7]
            long r9 = r9 >>> r8
            r11 = 1
            int r7 = r7 + r11
            r6 = r6[r7]
            int r12 = 64 - r8
            long r6 = r6 << r12
            long r12 = (long) r8
            long r12 = -r12
            r8 = 63
            long r12 = r12 >> r8
            long r6 = r6 & r12
            long r6 = r6 | r9
            long r8 = (long) r2
            r12 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r8 = r8 * r12
            long r8 = r8 ^ r6
            long r12 = r8 - r12
            long r8 = ~r8
            long r8 = r8 & r12
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r8 = r8 & r12
        L41:
            r14 = 0
            int r10 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r10 == 0) goto L5f
            int r10 = java.lang.Long.numberOfTrailingZeros(r8)
            int r10 = r10 >> 3
            int r10 = r10 + r1
            r10 = r10 & r3
            int[] r14 = r0.f7867
            r14 = r14[r10]
            r15 = r19
            if (r14 != r15) goto L58
            goto L69
        L58:
            r16 = 1
            long r16 = r8 - r16
            long r8 = r8 & r16
            goto L41
        L5f:
            long r8 = ~r6
            r10 = 6
            long r8 = r8 << r10
            long r6 = r6 & r8
            long r6 = r6 & r12
            int r6 = (r6 > r14 ? 1 : (r6 == r14 ? 0 : -1))
            if (r6 == 0) goto L72
            r10 = -1
        L69:
            if (r10 < 0) goto L6c
            r4 = r11
        L6c:
            if (r4 == 0) goto L71
            r0.m4156(r10)
        L71:
            return r4
        L72:
            int r5 = r5 + 8
            int r1 = r1 + r5
            r1 = r1 & r3
            goto L16
    }

    /* JADX INFO: renamed from: ζ */
    public final void m4156(int r8) {
            r7 = this;
            int r0 = r7.f7869
            int r0 = r0 + (-1)
            r7.f7869 = r0
            long[] r0 = r7.f7866
            int r7 = r7.f7868
            int r1 = r8 >> 3
            r2 = r8 & 7
            int r2 = r2 << 3
            r3 = r0[r1]
            r5 = 255(0xff, double:1.26E-321)
            long r5 = r5 << r2
            long r5 = ~r5
            long r3 = r3 & r5
            r5 = 254(0xfe, double:1.255E-321)
            long r5 = r5 << r2
            long r2 = r3 | r5
            r0[r1] = r2
            int r8 = r8 + (-7)
            r8 = r8 & r7
            r7 = r7 & 7
            int r8 = r8 + r7
            int r7 = r8 >> 3
            r0[r7] = r2
            return
    }
}
