package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class sm0 {

    /* JADX INFO: renamed from: α */
    public long[] f9962;

    /* JADX INFO: renamed from: β */
    public int[] f9963;

    /* JADX INFO: renamed from: γ */
    public java.lang.Object[] f9964;

    /* JADX INFO: renamed from: δ */
    public int f9965;

    /* JADX INFO: renamed from: ε */
    public int f9966;

    public final boolean equals(java.lang.Object r18) {
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = 1
            if (r1 != r0) goto L8
            return r2
        L8:
            boolean r3 = r1 instanceof p000.sm0
            r4 = 0
            if (r3 != 0) goto Le
            return r4
        Le:
            sm0 r1 = (p000.sm0) r1
            int r3 = r1.f9966
            int r5 = r0.f9966
            if (r3 == r5) goto L17
            return r4
        L17:
            int[] r3 = r0.f9963
            java.lang.Object[] r5 = r0.f9964
            long[] r0 = r0.f9962
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
            java.lang.Object r13 = r1.m5525(r14)
            if (r13 != 0) goto L5d
            boolean r13 = r1.m5524(r14)
            if (r13 != 0) goto L69
        L5d:
            return r4
        L5e:
            java.lang.Object r14 = r1.m5525(r14)
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
            int[] r0 = r15.f9963
            java.lang.Object[] r1 = r15.f9964
            long[] r15 = r15.f9962
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
            int r12 = java.lang.Integer.hashCode(r12)
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
            int r1 = r0.f9966
            if (r1 != 0) goto L9
            java.lang.String r0 = "{}"
            return r0
        L9:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "{"
            r1.<init>(r2)
            int[] r2 = r0.f9963
            java.lang.Object[] r3 = r0.f9964
            long[] r4 = r0.f9962
            int r5 = r4.length
            int r5 = r5 + (-2)
            if (r5 < 0) goto L6f
            r6 = 0
            r7 = r6
            r8 = r7
        L1e:
            r9 = r4[r7]
            long r11 = ~r9
            r13 = 7
            long r11 = r11 << r13
            long r11 = r11 & r9
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r11 = r11 & r13
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 == 0) goto L6a
            int r11 = r7 - r5
            int r11 = ~r11
            int r11 = r11 >>> 31
            r12 = 8
            int r11 = 8 - r11
            r13 = r6
        L38:
            if (r13 >= r11) goto L68
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r9
            r16 = 128(0x80, double:6.3E-322)
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto L64
            int r14 = r7 << 3
            int r14 = r14 + r13
            r15 = r2[r14]
            r14 = r3[r14]
            r1.append(r15)
            java.lang.String r15 = "="
            r1.append(r15)
            if (r14 != r0) goto L56
            java.lang.String r14 = "(this)"
        L56:
            r1.append(r14)
            int r8 = r8 + 1
            int r14 = r0.f9966
            if (r8 >= r14) goto L64
            java.lang.String r14 = ", "
            r1.append(r14)
        L64:
            long r9 = r9 >> r12
            int r13 = r13 + 1
            goto L38
        L68:
            if (r11 != r12) goto L6f
        L6a:
            if (r7 == r5) goto L6f
            int r7 = r7 + 1
            goto L1e
        L6f:
            r0 = 125(0x7d, float:1.75E-43)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
    }

    /* JADX INFO: renamed from: α */
    public final boolean m5524(int r19) {
            r18 = this;
            r0 = r18
            int r1 = java.lang.Integer.hashCode(r19)
            r2 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r1 = r1 * r2
            int r2 = r1 << 16
            r1 = r1 ^ r2
            r2 = r1 & 127(0x7f, float:1.78E-43)
            int r3 = r0.f9965
            int r1 = r1 >>> 7
            r1 = r1 & r3
            r4 = 0
            r5 = r4
        L16:
            long[] r6 = r0.f9962
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
            int[] r14 = r0.f9963
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

    /* JADX INFO: renamed from: β */
    public final java.lang.Object m5525(int r14) {
            r13 = this;
            int r0 = java.lang.Integer.hashCode(r14)
            r1 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r0 = r0 * r1
            int r1 = r0 << 16
            r0 = r0 ^ r1
            r1 = r0 & 127(0x7f, float:1.78E-43)
            int r2 = r13.f9965
            int r0 = r0 >>> 7
            r0 = r0 & r2
            r3 = 0
        L13:
            long[] r4 = r13.f9962
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
            if (r12 == 0) goto L59
            int r10 = java.lang.Long.numberOfTrailingZeros(r6)
            int r10 = r10 >> 3
            int r10 = r10 + r0
            r10 = r10 & r2
            int[] r11 = r13.f9963
            r11 = r11[r10]
            if (r11 != r14) goto L53
            goto L63
        L53:
            r10 = 1
            long r10 = r6 - r10
            long r6 = r6 & r10
            goto L3e
        L59:
            long r6 = ~r4
            r12 = 6
            long r6 = r6 << r12
            long r4 = r4 & r6
            long r4 = r4 & r8
            int r4 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r4 == 0) goto L6c
            r10 = -1
        L63:
            if (r10 < 0) goto L6a
            java.lang.Object[] r13 = r13.f9964
            r13 = r13[r10]
            return r13
        L6a:
            r13 = 0
            return r13
        L6c:
            int r3 = r3 + 8
            int r0 = r0 + r3
            r0 = r0 & r2
            goto L13
    }
}
