package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class c21 {

    /* JADX INFO: renamed from: α */
    public long[] f1941;

    /* JADX INFO: renamed from: β */
    public java.lang.Object[] f1942;

    /* JADX INFO: renamed from: γ */
    public int f1943;

    /* JADX INFO: renamed from: δ */
    public int f1944;

    /* JADX INFO: renamed from: ε */
    public int f1945;

    public /* synthetic */ c21() {
            r1 = this;
            r0 = 6
            r1.<init>(r0)
            return
    }

    public c21(int r2) {
            r1 = this;
            r1.<init>()
            long[] r0 = p000.tq1.f10431
            r1.f1941 = r0
            java.lang.Object[] r0 = p000.AbstractC1021yh.f12618
            r1.f1942 = r0
            if (r2 < 0) goto L15
            int r2 = p000.tq1.m5734(r2)
            r1.m1112(r2)
            return
        L15:
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
            boolean r1 = r15 instanceof p000.c21
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            c21 r15 = (p000.c21) r15
            int r1 = r15.f1944
            int r3 = r14.f1944
            if (r1 == r3) goto L13
            return r2
        L13:
            java.lang.Object[] r1 = r14.f1942
            long[] r14 = r14.f1941
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
            boolean r10 = r15.m1109(r10)
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
            r15 = this;
            int r0 = r15.f1943
            int r0 = r0 * 31
            int r1 = r15.f1944
            int r0 = r0 + r1
            java.lang.Object[] r1 = r15.f1942
            long[] r2 = r15.f1941
            int r3 = r2.length
            int r3 = r3 + (-2)
            if (r3 < 0) goto L58
            r4 = 0
            r5 = r4
        L12:
            r6 = r2[r5]
            long r8 = ~r6
            r10 = 7
            long r8 = r8 << r10
            long r8 = r8 & r6
            r10 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r8 = r8 & r10
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 == 0) goto L53
            int r8 = r5 - r3
            int r8 = ~r8
            int r8 = r8 >>> 31
            r9 = 8
            int r8 = 8 - r8
            r10 = r4
        L2c:
            if (r10 >= r8) goto L4f
            r11 = 255(0xff, double:1.26E-321)
            long r11 = r11 & r6
            r13 = 128(0x80, double:6.3E-322)
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 >= 0) goto L4b
            int r11 = r5 << 3
            int r11 = r11 + r10
            r11 = r1[r11]
            boolean r12 = p000.ln0.m3626(r11, r15)
            if (r12 != 0) goto L4b
            if (r11 == 0) goto L49
            int r11 = r11.hashCode()
            goto L4a
        L49:
            r11 = r4
        L4a:
            int r0 = r0 + r11
        L4b:
            long r6 = r6 >> r9
            int r10 = r10 + 1
            goto L2c
        L4f:
            if (r8 != r9) goto L52
            goto L53
        L52:
            return r0
        L53:
            if (r5 == r3) goto L58
            int r5 = r5 + 1
            goto L12
        L58:
            return r0
    }

    public final java.lang.String toString() {
            r17 = this;
            r0 = r17
            b0 r1 = new b0
            r2 = 17
            r1.<init>(r2, r0)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "["
            r2.<init>(r3)
            java.lang.Object[] r3 = r0.f1942
            long[] r0 = r0.f1941
            int r4 = r0.length
            int r4 = r4 + (-2)
            if (r4 < 0) goto L6c
            r5 = 0
            r6 = r5
            r7 = r6
        L1c:
            r8 = r0[r6]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L67
            int r10 = r6 - r4
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r5
        L36:
            if (r12 >= r10) goto L65
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L61
            int r13 = r6 << 3
            int r13 = r13 + r12
            r13 = r3[r13]
            r14 = -1
            if (r7 != r14) goto L4f
            java.lang.String r0 = "..."
            r2.append(r0)
            goto L71
        L4f:
            if (r7 == 0) goto L56
            java.lang.String r14 = ", "
            r2.append(r14)
        L56:
            java.lang.Object r13 = r1.invoke(r13)
            java.lang.CharSequence r13 = (java.lang.CharSequence) r13
            r2.append(r13)
            int r7 = r7 + 1
        L61:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L36
        L65:
            if (r10 != r11) goto L6c
        L67:
            if (r6 == r4) goto L6c
            int r6 = r6 + 1
            goto L1c
        L6c:
            java.lang.String r0 = "]"
            r2.append(r0)
        L71:
            java.lang.String r0 = r2.toString()
            return r0
    }

    /* JADX INFO: renamed from: α */
    public final boolean m1107(java.lang.Object r4) {
            r3 = this;
            int r0 = r3.f1944
            int r1 = r3.m1110(r4)
            java.lang.Object[] r2 = r3.f1942
            r2[r1] = r4
            int r3 = r3.f1944
            if (r3 == r0) goto L10
            r3 = 1
            return r3
        L10:
            r3 = 0
            return r3
    }

    /* JADX INFO: renamed from: β */
    public final void m1108() {
            r10 = this;
            r0 = 0
            r10.f1944 = r0
            long[] r1 = r10.f1941
            long[] r2 = p000.tq1.f10431
            if (r1 == r2) goto L25
            r2 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            p000.AbstractC0312g7.m2245(r2, r1)
            long[] r1 = r10.f1941
            int r2 = r10.f1943
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
            java.lang.Object[] r1 = r10.f1942
            r2 = 0
            int r3 = r10.f1943
            p000.AbstractC0312g7.m2244(r0, r3, r2, r1)
            int r0 = r10.f1943
            int r0 = p000.tq1.m5731(r0)
            int r1 = r10.f1944
            int r0 = r0 - r1
            r10.f1945 = r0
            return
    }

    /* JADX INFO: renamed from: γ */
    public final boolean m1109(java.lang.Object r18) {
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
            int r5 = r0.f1943
            int r3 = r3 >>> 7
            r3 = r3 & r5
            r6 = r2
        L1c:
            long[] r7 = r0.f1941
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
            java.lang.Object[] r15 = r0.f1942
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
    public final int m1110(java.lang.Object r35) {
            r34 = this;
            r0 = r34
            r1 = r35
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
            int r6 = r0.f1943
            r7 = r5 & r6
            r8 = 0
        L1c:
            long[] r9 = r0.f1941
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
            java.lang.Object[] r4 = r0.f1942
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
            if (r2 == 0) goto L28e
            int r1 = r0.m1111(r5)
            int r2 = r0.f1945
            r8 = 255(0xff, double:1.26E-321)
            if (r2 != 0) goto L9f
            long[] r2 = r0.f1941
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
            r35 = 7
            r17 = 128(0x80, double:6.3E-322)
            goto L259
        La9:
            int r1 = r0.f1943
            if (r1 <= r3) goto L1e6
            int r2 = r0.f1944
            r10 = r3
            r35 = 7
            long r3 = (long) r2
            r17 = 32
            long r3 = r3 * r17
            long r1 = (long) r1
            r17 = 25
            long r1 = r1 * r17
            int r1 = java.lang.Long.compareUnsigned(r3, r1)
            if (r1 > 0) goto L1df
            long[] r1 = r0.f1941
            int r2 = r0.f1943
            java.lang.Object[] r3 = r0.f1942
            int r4 = r2 + 7
            int r4 = r4 >> 3
            r6 = r15
            r17 = 128(0x80, double:6.3E-322)
        Lcf:
            if (r6 >= r4) goto Lee
            r23 = r1[r6]
            r25 = r8
            long r8 = r23 & r13
            r23 = r11
            r12 = r10
            long r10 = ~r8
            long r7 = r8 >>> r35
            long r10 = r10 + r7
            r7 = -72340172838076674(0xfefefefefefefefe, double:-5.3140103725178076E303)
            long r7 = r7 & r10
            r1[r6] = r7
            int r6 = r6 + 1
            r10 = r12
            r11 = r23
            r8 = r25
            goto Lcf
        Lee:
            r25 = r8
            r23 = r11
            r12 = r10
            int r4 = p000.AbstractC0312g7.m2252(r1)
            int r6 = r4 + (-1)
            r7 = r1[r6]
            r9 = 72057594037927935(0xffffffffffffff, double:7.291122019556397E-304)
            long r7 = r7 & r9
            r13 = -72057594037927936(0xff00000000000000, double:-5.486124068793689E303)
            long r7 = r7 | r13
            r1[r6] = r7
            r6 = r1[r15]
            r1[r4] = r6
            r4 = r15
        L10b:
            if (r4 == r2) goto L1d2
            int r6 = r4 >> 3
            r7 = r1[r6]
            r11 = r4 & 7
            int r11 = r11 << 3
            long r7 = r7 >> r11
            long r7 = r7 & r25
            int r13 = (r7 > r17 ? 1 : (r7 == r17 ? 0 : -1))
            if (r13 != 0) goto L11f
        L11c:
            int r4 = r4 + 1
            goto L10b
        L11f:
            int r7 = (r7 > r21 ? 1 : (r7 == r21 ? 0 : -1))
            if (r7 == 0) goto L124
            goto L11c
        L124:
            r7 = r3[r4]
            if (r7 == 0) goto L12d
            int r7 = r7.hashCode()
            goto L12e
        L12d:
            r7 = r15
        L12e:
            int r7 = r7 * r20
            int r8 = r7 << 16
            r7 = r7 ^ r8
            int r8 = r7 >>> 7
            int r13 = r0.m1111(r8)
            r8 = r8 & r2
            int r14 = r13 - r8
            r14 = r14 & r2
            int r14 = r14 / r12
            int r8 = r4 - r8
            r8 = r8 & r2
            int r8 = r8 / r12
            r27 = -9223372036854775808
            if (r14 != r8) goto L165
            r7 = r7 & 127(0x7f, float:1.78E-43)
            long r7 = (long) r7
            r13 = r1[r6]
            r29 = r9
            long r9 = r25 << r11
            long r9 = ~r9
            long r9 = r9 & r13
            long r7 = r7 << r11
            long r7 = r7 | r9
            r1[r6] = r7
            int r6 = r1.length
            int r6 = r6 + (-1)
            r7 = r1[r15]
            long r7 = r7 & r29
            long r7 = r7 | r27
            r1[r6] = r7
            int r4 = r4 + 1
            r9 = r29
            goto L10b
        L165:
            r29 = r9
            int r8 = r13 >> 3
            r9 = r1[r8]
            r14 = r13 & 7
            int r14 = r14 << 3
            long r31 = r9 >> r14
            long r31 = r31 & r25
            int r19 = (r31 > r17 ? 1 : (r31 == r17 ? 0 : -1))
            if (r19 != 0) goto L19e
            r7 = r7 & 127(0x7f, float:1.78E-43)
            r31 = r12
            r19 = r13
            long r12 = (long) r7
            r32 = r2
            r33 = r3
            long r2 = r25 << r14
            long r2 = ~r2
            long r2 = r2 & r9
            long r9 = r12 << r14
            long r2 = r2 | r9
            r1[r8] = r2
            r2 = r1[r6]
            long r7 = r25 << r11
            long r7 = ~r7
            long r2 = r2 & r7
            long r7 = r17 << r11
            long r2 = r2 | r7
            r1[r6] = r2
            r2 = r33[r4]
            r33[r19] = r2
            r2 = 0
            r33[r4] = r2
            goto L1bb
        L19e:
            r32 = r2
            r33 = r3
            r31 = r12
            r19 = r13
            r2 = r7 & 127(0x7f, float:1.78E-43)
            long r2 = (long) r2
            long r6 = r25 << r14
            long r6 = ~r6
            long r6 = r6 & r9
            long r2 = r2 << r14
            long r2 = r2 | r6
            r1[r8] = r2
            r2 = r33[r19]
            r3 = r33[r4]
            r33[r19] = r3
            r33[r4] = r2
            int r4 = r4 + (-1)
        L1bb:
            int r2 = r1.length
            int r2 = r2 + (-1)
            r6 = r1[r15]
            long r6 = r6 & r29
            long r6 = r6 | r27
            r1[r2] = r6
            int r4 = r4 + 1
            r9 = r29
            r12 = r31
            r2 = r32
            r3 = r33
            goto L10b
        L1d2:
            int r1 = r0.f1943
            int r1 = p000.tq1.m5731(r1)
            int r2 = r0.f1944
            int r1 = r1 - r2
            r0.f1945 = r1
            goto L255
        L1df:
            r25 = r8
            r23 = r11
            r17 = 128(0x80, double:6.3E-322)
            goto L1e9
        L1e6:
            r35 = 7
            goto L1df
        L1e9:
            int r1 = r0.f1943
            int r1 = p000.tq1.m5732(r1)
            long[] r2 = r0.f1941
            java.lang.Object[] r3 = r0.f1942
            int r4 = r0.f1943
            r0.m1112(r1)
            long[] r1 = r0.f1941
            java.lang.Object[] r6 = r0.f1942
            int r7 = r0.f1943
            r8 = r15
        L1ff:
            if (r8 >= r4) goto L255
            int r9 = r8 >> 3
            r9 = r2[r9]
            r11 = r8 & 7
            int r11 = r11 << 3
            long r9 = r9 >> r11
            long r9 = r9 & r25
            int r9 = (r9 > r17 ? 1 : (r9 == r17 ? 0 : -1))
            if (r9 >= 0) goto L24a
            r9 = r3[r8]
            if (r9 == 0) goto L219
            int r10 = r9.hashCode()
            goto L21a
        L219:
            r10 = r15
        L21a:
            int r10 = r10 * r20
            int r11 = r10 << 16
            r10 = r10 ^ r11
            int r11 = r10 >>> 7
            int r11 = r0.m1111(r11)
            r10 = r10 & 127(0x7f, float:1.78E-43)
            long r12 = (long) r10
            int r10 = r11 >> 3
            r14 = r11 & 7
            int r14 = r14 << 3
            r21 = r1[r10]
            r27 = r1
            r19 = r2
            long r1 = r25 << r14
            long r1 = ~r1
            long r1 = r21 & r1
            long r12 = r12 << r14
            long r1 = r1 | r12
            r27[r10] = r1
            int r10 = r11 + (-7)
            r10 = r10 & r7
            r12 = r7 & 7
            int r10 = r10 + r12
            int r10 = r10 >> 3
            r27[r10] = r1
            r6[r11] = r9
            goto L24e
        L24a:
            r27 = r1
            r19 = r2
        L24e:
            int r8 = r8 + 1
            r2 = r19
            r1 = r27
            goto L1ff
        L255:
            int r1 = r0.m1111(r5)
        L259:
            int r2 = r0.f1944
            int r2 = r2 + 1
            r0.f1944 = r2
            int r2 = r0.f1945
            long[] r3 = r0.f1941
            int r4 = r1 >> 3
            r5 = r3[r4]
            r7 = r1 & 7
            int r7 = r7 << 3
            long r8 = r5 >> r7
            long r8 = r8 & r25
            int r8 = (r8 > r17 ? 1 : (r8 == r17 ? 0 : -1))
            if (r8 != 0) goto L275
            r15 = r16
        L275:
            int r2 = r2 - r15
            r0.f1945 = r2
            int r0 = r0.f1943
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
            return r1
        L28e:
            r31 = r3
            int r8 = r8 + 8
            int r7 = r7 + r8
            r7 = r7 & r6
            r3 = r19
            r4 = r20
            goto L1c
    }

    /* JADX INFO: renamed from: ε */
    public final int m1111(int r10) {
            r9 = this;
            int r0 = r9.f1943
            r10 = r10 & r0
            r1 = 0
        L4:
            long[] r2 = r9.f1941
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
    public final void m1112(int r10) {
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
            r9.f1943 = r10
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
            r9.f1941 = r0
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
            int r0 = r9.f1943
            int r0 = p000.tq1.m5731(r0)
            int r1 = r9.f1944
            int r0 = r0 - r1
            r9.f1945 = r0
            if (r10 != 0) goto L49
            java.lang.Object[] r10 = p000.AbstractC1021yh.f12618
            goto L4b
        L49:
            java.lang.Object[] r10 = new java.lang.Object[r10]
        L4b:
            r9.f1942 = r10
            return
    }

    /* JADX INFO: renamed from: η */
    public final boolean m1113() {
            r0 = this;
            int r0 = r0.f1944
            if (r0 != 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: θ */
    public final boolean m1114() {
            r0 = this;
            int r0 = r0.f1944
            if (r0 == 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: ι */
    public final void m1115(p000.c21 r14) {
            r13 = this;
            r14.getClass()
            java.lang.Object[] r0 = r14.f1942
            long[] r14 = r14.f1941
            int r1 = r14.length
            int r1 = r1 + (-2)
            if (r1 < 0) goto L46
            r2 = 0
            r3 = r2
        Le:
            r4 = r14[r3]
            long r6 = ~r4
            r8 = 7
            long r6 = r6 << r8
            long r6 = r6 & r4
            r8 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r6 = r6 & r8
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 == 0) goto L41
            int r6 = r3 - r1
            int r6 = ~r6
            int r6 = r6 >>> 31
            r7 = 8
            int r6 = 8 - r6
            r8 = r2
        L28:
            if (r8 >= r6) goto L3f
            r9 = 255(0xff, double:1.26E-321)
            long r9 = r9 & r4
            r11 = 128(0x80, double:6.3E-322)
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 >= 0) goto L3b
            int r9 = r3 << 3
            int r9 = r9 + r8
            r9 = r0[r9]
            r13.m1116(r9)
        L3b:
            long r4 = r4 >> r7
            int r8 = r8 + 1
            goto L28
        L3f:
            if (r6 != r7) goto L46
        L41:
            if (r3 == r1) goto L46
            int r3 = r3 + 1
            goto Le
        L46:
            return
    }

    /* JADX INFO: renamed from: κ */
    public final void m1116(java.lang.Object r2) {
            r1 = this;
            int r0 = r1.m1110(r2)
            java.lang.Object[] r1 = r1.f1942
            r1[r0] = r2
            return
    }

    /* JADX INFO: renamed from: λ */
    public final boolean m1117(java.lang.Object r18) {
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
            int r5 = r0.f1943
            int r3 = r3 >>> 7
            r3 = r3 & r5
            r6 = r2
        L1c:
            long[] r7 = r0.f1941
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
            java.lang.Object[] r15 = r0.f1942
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
            if (r7 == 0) goto L79
            r11 = -1
        L70:
            if (r11 < 0) goto L73
            r2 = r12
        L73:
            if (r2 == 0) goto L78
            r0.m1118(r11)
        L78:
            return r2
        L79:
            int r6 = r6 + 8
            int r3 = r3 + r6
            r3 = r3 & r5
            goto L1c
    }

    /* JADX INFO: renamed from: μ */
    public final void m1118(int r9) {
            r8 = this;
            int r0 = r8.f1944
            int r0 = r0 + (-1)
            r8.f1944 = r0
            long[] r0 = r8.f1941
            int r1 = r8.f1943
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
            java.lang.Object[] r8 = r8.f1942
            r0 = 0
            r8[r9] = r0
            return
    }
}
