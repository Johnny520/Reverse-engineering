package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class r11 {

    /* JADX INFO: renamed from: α */
    public long[] f9196;

    /* JADX INFO: renamed from: β */
    public long[] f9197;

    /* JADX INFO: renamed from: γ */
    public java.lang.Object[] f9198;

    /* JADX INFO: renamed from: δ */
    public int f9199;

    /* JADX INFO: renamed from: ε */
    public int f9200;

    /* JADX INFO: renamed from: ζ */
    public int f9201;

    public final boolean equals(java.lang.Object r30) {
            r29 = this;
            r0 = r29
            r1 = r30
            r2 = 1
            if (r1 != r0) goto L8
            return r2
        L8:
            boolean r3 = r1 instanceof p000.r11
            r4 = 0
            if (r3 != 0) goto Le
            return r4
        Le:
            r11 r1 = (p000.r11) r1
            int r3 = r1.f9200
            int r5 = r0.f9200
            if (r3 == r5) goto L17
            return r4
        L17:
            long[] r3 = r0.f9197
            java.lang.Object[] r5 = r0.f9198
            long[] r0 = r0.f9196
            int r6 = r0.length
            int r6 = r6 + (-2)
            if (r6 < 0) goto L148
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
            if (r10 == 0) goto L134
            int r10 = r7 - r6
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r4
        L3d:
            if (r12 >= r10) goto L129
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L10f
            int r13 = r7 << 3
            int r13 = r13 + r12
            r14 = r3[r13]
            r13 = r5[r13]
            if (r13 != 0) goto Lf9
            java.lang.Object r13 = r1.m5046(r14)
            if (r13 != 0) goto Lf6
            r1.getClass()
            int r13 = java.lang.Long.hashCode(r14)
            r16 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r13 = r13 * r16
            int r16 = r13 << 16
            r13 = r13 ^ r16
            r16 = r2
            r2 = r13 & 127(0x7f, float:1.78E-43)
            r17 = r4
            int r4 = r1.f9199
            int r13 = r13 >>> 7
            r13 = r13 & r4
            r18 = 0
            r29 = r11
            r19 = r18
        L78:
            long[] r11 = r1.f9196
            int r20 = r13 >> 3
            r21 = r13 & 7
            r30 = r0
            int r0 = r21 << 3
            r21 = r11[r20]
            long r21 = r21 >>> r0
            r23 = 1
            int r20 = r20 + 1
            r24 = r11[r20]
            int r11 = 64 - r0
            long r24 = r24 << r11
            r11 = r3
            r20 = r4
            long r3 = (long) r0
            long r3 = -r3
            r0 = 63
            long r3 = r3 >> r0
            long r3 = r24 & r3
            long r3 = r21 | r3
            r21 = r8
            long r8 = (long) r2
            r24 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r8 = r8 * r24
            long r8 = r8 ^ r3
            long r24 = r8 - r24
            long r8 = ~r8
            long r8 = r24 & r8
            r24 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r8 = r8 & r24
        Lb3:
            r26 = 0
            int r0 = (r8 > r26 ? 1 : (r8 == r26 ? 0 : -1))
            if (r0 == 0) goto Ld6
            int r0 = java.lang.Long.numberOfTrailingZeros(r8)
            int r0 = r0 >> 3
            int r0 = r0 + r13
            r0 = r0 & r20
            r26 = r0
            long[] r0 = r1.f9197
            r27 = r0[r26]
            int r0 = (r27 > r14 ? 1 : (r27 == r14 ? 0 : -1))
            if (r0 != 0) goto Lcf
            r0 = r26
            goto Le1
        Lcf:
            r26 = 1
            long r26 = r8 - r26
            long r8 = r8 & r26
            goto Lb3
        Ld6:
            long r8 = ~r3
            r0 = 6
            long r8 = r8 << r0
            long r3 = r3 & r8
            long r3 = r3 & r24
            int r0 = (r3 > r26 ? 1 : (r3 == r26 ? 0 : -1))
            if (r0 == 0) goto Le8
            r0 = -1
        Le1:
            if (r0 < 0) goto Le5
            r18 = r23
        Le5:
            if (r18 != 0) goto L11a
            goto Lf8
        Le8:
            int r19 = r19 + 8
            int r13 = r13 + r19
            r13 = r13 & r20
            r0 = r30
            r3 = r11
            r4 = r20
            r8 = r21
            goto L78
        Lf6:
            r17 = r4
        Lf8:
            return r17
        Lf9:
            r30 = r0
            r16 = r2
            r17 = r4
            r21 = r8
            r29 = r11
            r11 = r3
            java.lang.Object r0 = r1.m5046(r14)
            boolean r0 = r13.equals(r0)
            if (r0 != 0) goto L11a
            return r17
        L10f:
            r30 = r0
            r16 = r2
            r17 = r4
            r21 = r8
            r29 = r11
            r11 = r3
        L11a:
            long r8 = r21 >> r29
            int r12 = r12 + 1
            r0 = r30
            r3 = r11
            r2 = r16
            r4 = r17
            r11 = r29
            goto L3d
        L129:
            r30 = r0
            r16 = r2
            r17 = r4
            r0 = r11
            r11 = r3
            if (r10 != r0) goto L14a
            goto L13b
        L134:
            r30 = r0
            r16 = r2
            r11 = r3
            r17 = r4
        L13b:
            if (r7 == r6) goto L14a
            int r7 = r7 + 1
            r0 = r30
            r3 = r11
            r2 = r16
            r4 = r17
            goto L23
        L148:
            r16 = r2
        L14a:
            return r16
    }

    public final int hashCode() {
            r15 = this;
            long[] r0 = r15.f9197
            java.lang.Object[] r1 = r15.f9198
            long[] r15 = r15.f9196
            int r2 = r15.length
            int r2 = r2 + (-2)
            r3 = 0
            if (r2 < 0) goto L56
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
            if (r8 == 0) goto L50
            int r8 = r4 - r2
            int r8 = ~r8
            int r8 = r8 >>> 31
            r9 = 8
            int r8 = 8 - r8
            r10 = r3
        L28:
            if (r10 >= r8) goto L4c
            r11 = 255(0xff, double:1.26E-321)
            long r11 = r11 & r6
            r13 = 128(0x80, double:6.3E-322)
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 >= 0) goto L48
            int r11 = r4 << 3
            int r11 = r11 + r10
            r12 = r0[r11]
            r11 = r1[r11]
            int r12 = java.lang.Long.hashCode(r12)
            if (r11 == 0) goto L45
            int r11 = r11.hashCode()
            goto L46
        L45:
            r11 = r3
        L46:
            r11 = r11 ^ r12
            int r5 = r5 + r11
        L48:
            long r6 = r6 >> r9
            int r10 = r10 + 1
            goto L28
        L4c:
            if (r8 != r9) goto L4f
            goto L50
        L4f:
            return r5
        L50:
            if (r4 == r2) goto L55
            int r4 = r4 + 1
            goto Le
        L55:
            return r5
        L56:
            return r3
    }

    public final java.lang.String toString() {
            r18 = this;
            r0 = r18
            int r1 = r0.f9200
            if (r1 != 0) goto L9
            java.lang.String r0 = "{}"
            return r0
        L9:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "{"
            r1.<init>(r2)
            long[] r2 = r0.f9197
            java.lang.Object[] r3 = r0.f9198
            long[] r4 = r0.f9196
            int r5 = r4.length
            int r5 = r5 + (-2)
            if (r5 < 0) goto L7b
            r7 = 0
            r8 = 0
        L1d:
            r9 = r4[r7]
            long r11 = ~r9
            r13 = 7
            long r11 = r11 << r13
            long r11 = r11 & r9
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r11 = r11 & r13
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 == 0) goto L75
            int r11 = r7 - r5
            int r11 = ~r11
            int r11 = r11 >>> 31
            r12 = 8
            int r11 = 8 - r11
            r13 = 0
        L37:
            if (r13 >= r11) goto L6e
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r9
            r16 = 128(0x80, double:6.3E-322)
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto L66
            int r14 = r7 << 3
            int r14 = r14 + r13
            r16 = r7
            r6 = r2[r14]
            r14 = r3[r14]
            r1.append(r6)
            java.lang.String r6 = "="
            r1.append(r6)
            if (r14 != r0) goto L57
            java.lang.String r14 = "(this)"
        L57:
            r1.append(r14)
            int r8 = r8 + 1
            int r6 = r0.f9200
            if (r8 >= r6) goto L68
            java.lang.String r6 = ", "
            r1.append(r6)
            goto L68
        L66:
            r16 = r7
        L68:
            long r9 = r9 >> r12
            int r13 = r13 + 1
            r7 = r16
            goto L37
        L6e:
            r16 = r7
            if (r11 != r12) goto L7b
            r6 = r16
            goto L76
        L75:
            r6 = r7
        L76:
            if (r6 == r5) goto L7b
            int r7 = r6 + 1
            goto L1d
        L7b:
            r0 = 125(0x7d, float:1.75E-43)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
    }

    /* JADX INFO: renamed from: α */
    public final int m5045(int r10) {
            r9 = this;
            int r0 = r9.f9199
            r10 = r10 & r0
            r1 = 0
        L4:
            long[] r2 = r9.f9196
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

    /* JADX INFO: renamed from: β */
    public final java.lang.Object m5046(long r14) {
            r13 = this;
            int r0 = java.lang.Long.hashCode(r14)
            r1 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r0 = r0 * r1
            int r1 = r0 << 16
            r0 = r0 ^ r1
            r1 = r0 & 127(0x7f, float:1.78E-43)
            int r2 = r13.f9199
            int r0 = r0 >>> 7
            r0 = r0 & r2
            r3 = 0
        L13:
            long[] r4 = r13.f9196
            int r5 = r0 >> 3
            r6 = r0 & 7
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
            long r6 = (long) r1
            r8 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r6 = r6 * r8
            long r6 = r6 ^ r4
            long r8 = r6 - r8
            long r6 = ~r6
            long r6 = r6 & r8
            r8 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r6 = r6 & r8
        L3e:
            r10 = 0
            int r12 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r12 == 0) goto L5b
            int r10 = java.lang.Long.numberOfTrailingZeros(r6)
            int r10 = r10 >> 3
            int r10 = r10 + r0
            r10 = r10 & r2
            long[] r11 = r13.f9197
            r11 = r11[r10]
            int r11 = (r11 > r14 ? 1 : (r11 == r14 ? 0 : -1))
            if (r11 != 0) goto L55
            goto L65
        L55:
            r10 = 1
            long r10 = r6 - r10
            long r6 = r6 & r10
            goto L3e
        L5b:
            long r6 = ~r4
            r12 = 6
            long r6 = r6 << r12
            long r4 = r4 & r6
            long r4 = r4 & r8
            int r4 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r4 == 0) goto L6e
            r10 = -1
        L65:
            if (r10 < 0) goto L6c
            java.lang.Object[] r13 = r13.f9198
            r13 = r13[r10]
            return r13
        L6c:
            r13 = 0
            return r13
        L6e:
            int r3 = r3 + 8
            int r0 = r0 + r3
            r0 = r0 & r2
            goto L13
    }

    /* JADX INFO: renamed from: γ */
    public final void m5047(int r10) {
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
            r9.f9199 = r10
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
            r9.f9196 = r0
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
            int r0 = r9.f9199
            int r0 = p000.tq1.m5731(r0)
            int r1 = r9.f9200
            int r0 = r0 - r1
            r9.f9201 = r0
            long[] r0 = new long[r10]
            r9.f9197 = r0
            java.lang.Object[] r10 = new java.lang.Object[r10]
            r9.f9198 = r10
            return
    }

    /* JADX INFO: renamed from: δ */
    public final void m5048(long r39, p000.v11 r41) {
            r38 = this;
            r0 = r38
            int r1 = java.lang.Long.hashCode(r39)
            r2 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r1 = r1 * r2
            int r3 = r1 << 16
            r1 = r1 ^ r3
            int r3 = r1 >>> 7
            r1 = r1 & 127(0x7f, float:1.78E-43)
            int r4 = r0.f9199
            r5 = r3 & r4
            r7 = 0
        L16:
            long[] r8 = r0.f9196
            int r9 = r5 >> 3
            r10 = r5 & 7
            int r10 = r10 << 3
            r11 = r8[r9]
            long r11 = r11 >>> r10
            r13 = 1
            int r9 = r9 + r13
            r8 = r8[r9]
            int r14 = 64 - r10
            long r8 = r8 << r14
            long r14 = (long) r10
            long r14 = -r14
            r10 = 63
            long r14 = r14 >> r10
            long r8 = r8 & r14
            long r8 = r8 | r11
            long r10 = (long) r1
            r14 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r16 = r10 * r14
            r18 = r7
            r12 = 0
            long r6 = r8 ^ r16
            long r14 = r6 - r14
            long r6 = ~r6
            long r6 = r6 & r14
            r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r6 = r6 & r14
        L46:
            r16 = 0
            int r19 = (r6 > r16 ? 1 : (r6 == r16 ? 0 : -1))
            if (r19 == 0) goto L6b
            int r16 = java.lang.Long.numberOfTrailingZeros(r6)
            int r16 = r16 >> 3
            int r16 = r5 + r16
            r16 = r16 & r4
            r19 = r2
            long[] r2 = r0.f9197
            r20 = r2[r16]
            int r2 = (r20 > r39 ? 1 : (r20 == r39 ? 0 : -1))
            if (r2 != 0) goto L62
            goto L2b5
        L62:
            r16 = 1
            long r16 = r6 - r16
            long r6 = r6 & r16
            r2 = r19
            goto L46
        L6b:
            r19 = r2
            long r6 = ~r8
            r2 = 6
            long r6 = r6 << r2
            long r6 = r6 & r8
            long r6 = r6 & r14
            int r2 = (r6 > r16 ? 1 : (r6 == r16 ? 0 : -1))
            r6 = 8
            if (r2 == 0) goto L2be
            int r1 = r0.m5045(r3)
            int r2 = r0.f9201
            r7 = 255(0xff, double:1.26E-321)
            if (r2 != 0) goto L96
            long[] r2 = r0.f9196
            int r18 = r1 >> 3
            r20 = r2[r18]
            r2 = r1 & 7
            int r2 = r2 << 3
            long r20 = r20 >> r2
            long r20 = r20 & r7
            r22 = 254(0xfe, double:1.255E-321)
            int r2 = (r20 > r22 ? 1 : (r20 == r22 ? 0 : -1))
            if (r2 != 0) goto La4
        L96:
            r25 = r7
            r29 = r10
            r27 = r12
            r18 = r13
            r20 = 128(0x80, double:6.3E-322)
            r28 = 7
            goto L27d
        La4:
            int r1 = r0.f9199
            if (r1 <= r6) goto L203
            int r2 = r0.f9200
            r20 = 128(0x80, double:6.3E-322)
            long r4 = (long) r2
            r24 = 32
            long r4 = r4 * r24
            long r1 = (long) r1
            r24 = 25
            long r1 = r1 * r24
            int r1 = java.lang.Long.compareUnsigned(r4, r1)
            if (r1 > 0) goto L1f8
            long[] r1 = r0.f9196
            int r2 = r0.f9199
            long[] r4 = r0.f9197
            java.lang.Object[] r5 = r0.f9198
            int r18 = r2 + 7
            r24 = r6
            int r6 = r18 >> 3
            r25 = r7
            r7 = r12
        Lcd:
            if (r7 >= r6) goto Lec
            r27 = r1[r7]
            r29 = r10
            r8 = 7
            long r9 = r27 & r14
            r27 = r12
            r11 = r13
            long r12 = ~r9
            long r9 = r9 >>> r8
            long r12 = r12 + r9
            r9 = -72340172838076674(0xfefefefefefefefe, double:-5.3140103725178076E303)
            long r9 = r9 & r12
            r1[r7] = r9
            int r7 = r7 + 1
            r13 = r11
            r12 = r27
            r10 = r29
            goto Lcd
        Lec:
            r29 = r10
            r27 = r12
            r11 = r13
            r8 = 7
            int r6 = p000.AbstractC0312g7.m2252(r1)
            int r7 = r6 + (-1)
            r9 = r1[r7]
            r12 = 72057594037927935(0xffffffffffffff, double:7.291122019556397E-304)
            long r9 = r9 & r12
            r14 = -72057594037927936(0xff00000000000000, double:-5.486124068793689E303)
            long r9 = r9 | r14
            r1[r7] = r9
            r9 = r1[r27]
            r1[r6] = r9
            r6 = r27
        L10b:
            if (r6 == r2) goto L1e7
            int r7 = r6 >> 3
            r9 = r1[r7]
            r14 = r6 & 7
            int r14 = r14 << 3
            long r9 = r9 >> r14
            long r9 = r9 & r25
            int r15 = (r9 > r20 ? 1 : (r9 == r20 ? 0 : -1))
            if (r15 != 0) goto L11f
        L11c:
            int r6 = r6 + 1
            goto L10b
        L11f:
            int r9 = (r9 > r22 ? 1 : (r9 == r22 ? 0 : -1))
            if (r9 == 0) goto L124
            goto L11c
        L124:
            r9 = r4[r6]
            int r9 = java.lang.Long.hashCode(r9)
            int r9 = r9 * r19
            int r10 = r9 << 16
            r9 = r9 ^ r10
            int r10 = r9 >>> 7
            int r15 = r0.m5045(r10)
            r10 = r10 & r2
            int r18 = r15 - r10
            r18 = r18 & r2
            r28 = r8
            int r8 = r18 / 8
            int r10 = r6 - r10
            r10 = r10 & r2
            int r10 = r10 / 8
            r31 = -9223372036854775808
            if (r8 != r10) goto L16a
            r8 = r9 & 127(0x7f, float:1.78E-43)
            long r8 = (long) r8
            r33 = r1[r7]
            r10 = r11
            r35 = r12
            long r11 = r25 << r14
            long r11 = ~r11
            long r11 = r33 & r11
            long r8 = r8 << r14
            long r8 = r8 | r11
            r1[r7] = r8
            int r7 = r1.length
            int r7 = r7 - r10
            r8 = r1[r27]
            long r8 = r8 & r35
            long r8 = r8 | r31
            r1[r7] = r8
            int r6 = r6 + 1
            r11 = r10
            r8 = r28
            r12 = r35
            goto L10b
        L16a:
            r10 = r11
            r35 = r12
            int r8 = r15 >> 3
            r11 = r1[r8]
            r13 = r15 & 7
            int r13 = r13 << 3
            long r33 = r11 >> r13
            long r33 = r33 & r25
            int r18 = (r33 > r20 ? 1 : (r33 == r20 ? 0 : -1))
            if (r18 != 0) goto L1aa
            r9 = r9 & 127(0x7f, float:1.78E-43)
            r18 = r10
            r33 = r11
            long r10 = (long) r9
            r12 = r4
            r37 = r5
            long r4 = r25 << r13
            long r4 = ~r4
            long r4 = r33 & r4
            long r9 = r10 << r13
            long r4 = r4 | r9
            r1[r8] = r4
            r4 = r1[r7]
            long r8 = r25 << r14
            long r8 = ~r8
            long r4 = r4 & r8
            long r8 = r20 << r14
            long r4 = r4 | r8
            r1[r7] = r4
            r4 = r12[r6]
            r12[r15] = r4
            r12[r6] = r16
            r4 = r37[r6]
            r37[r15] = r4
            r4 = 0
            r37[r6] = r4
            goto L1cf
        L1aa:
            r37 = r5
            r18 = r10
            r33 = r11
            r12 = r4
            r4 = r9 & 127(0x7f, float:1.78E-43)
            long r4 = (long) r4
            long r9 = r25 << r13
            long r9 = ~r9
            long r9 = r33 & r9
            long r4 = r4 << r13
            long r4 = r4 | r9
            r1[r8] = r4
            r4 = r12[r15]
            r7 = r12[r6]
            r12[r15] = r7
            r12[r6] = r4
            r4 = r37[r15]
            r5 = r37[r6]
            r37[r15] = r5
            r37[r6] = r4
            int r6 = r6 + (-1)
        L1cf:
            int r4 = r1.length
            int r4 = r4 + (-1)
            r7 = r1[r27]
            long r7 = r7 & r35
            long r7 = r7 | r31
            r1[r4] = r7
            int r6 = r6 + 1
            r4 = r12
            r11 = r18
            r8 = r28
            r12 = r35
            r5 = r37
            goto L10b
        L1e7:
            r28 = r8
            r18 = r11
            int r1 = r0.f9199
            int r1 = p000.tq1.m5731(r1)
            int r2 = r0.f9200
            int r1 = r1 - r2
            r0.f9201 = r1
            goto L279
        L1f8:
            r25 = r7
            r29 = r10
            r27 = r12
            r18 = r13
            r28 = 7
            goto L206
        L203:
            r20 = 128(0x80, double:6.3E-322)
            goto L1f8
        L206:
            int r1 = r0.f9199
            int r1 = p000.tq1.m5732(r1)
            long[] r2 = r0.f9196
            long[] r4 = r0.f9197
            java.lang.Object[] r5 = r0.f9198
            int r6 = r0.f9199
            r0.m5047(r1)
            long[] r1 = r0.f9196
            long[] r7 = r0.f9197
            java.lang.Object[] r8 = r0.f9198
            int r9 = r0.f9199
            r10 = r27
        L221:
            if (r10 >= r6) goto L279
            int r11 = r10 >> 3
            r11 = r2[r11]
            r13 = r10 & 7
            int r13 = r13 << 3
            long r11 = r11 >> r13
            long r11 = r11 & r25
            int r11 = (r11 > r20 ? 1 : (r11 == r20 ? 0 : -1))
            if (r11 >= 0) goto L270
            r11 = r4[r10]
            int r13 = java.lang.Long.hashCode(r11)
            int r13 = r13 * r19
            int r14 = r13 << 16
            r13 = r13 ^ r14
            int r14 = r13 >>> 7
            int r14 = r0.m5045(r14)
            r13 = r13 & 127(0x7f, float:1.78E-43)
            r16 = r1
            r15 = r2
            long r1 = (long) r13
            int r13 = r14 >> 3
            r17 = r14 & 7
            int r17 = r17 << 3
            r22 = r16[r13]
            r31 = r1
            long r1 = r25 << r17
            long r1 = ~r1
            long r1 = r22 & r1
            long r22 = r31 << r17
            long r1 = r1 | r22
            r16[r13] = r1
            int r13 = r14 + (-7)
            r13 = r13 & r9
            r17 = r9 & 7
            int r13 = r13 + r17
            int r13 = r13 >> 3
            r16[r13] = r1
            r7[r14] = r11
            r1 = r5[r10]
            r8[r14] = r1
            goto L273
        L270:
            r16 = r1
            r15 = r2
        L273:
            int r10 = r10 + 1
            r2 = r15
            r1 = r16
            goto L221
        L279:
            int r1 = r0.m5045(r3)
        L27d:
            r16 = r1
            int r1 = r0.f9200
            int r1 = r1 + 1
            r0.f9200 = r1
            int r1 = r0.f9201
            long[] r2 = r0.f9196
            int r3 = r16 >> 3
            r4 = r2[r3]
            r6 = r16 & 7
            int r6 = r6 << 3
            long r7 = r4 >> r6
            long r7 = r7 & r25
            int r7 = (r7 > r20 ? 1 : (r7 == r20 ? 0 : -1))
            if (r7 != 0) goto L29a
            goto L29c
        L29a:
            r18 = r27
        L29c:
            int r1 = r1 - r18
            r0.f9201 = r1
            int r1 = r0.f9199
            long r7 = r25 << r6
            long r7 = ~r7
            long r4 = r4 & r7
            long r6 = r29 << r6
            long r4 = r4 | r6
            r2[r3] = r4
            int r3 = r16 + (-7)
            r3 = r3 & r1
            r1 = r1 & 7
            int r3 = r3 + r1
            int r1 = r3 >> 3
            r2[r1] = r4
        L2b5:
            long[] r1 = r0.f9197
            r1[r16] = r39
            java.lang.Object[] r0 = r0.f9198
            r0[r16] = r41
            return
        L2be:
            r24 = r6
            r27 = r12
            int r7 = r18 + 8
            int r5 = r5 + r7
            r5 = r5 & r4
            r2 = r19
            goto L16
    }
}
