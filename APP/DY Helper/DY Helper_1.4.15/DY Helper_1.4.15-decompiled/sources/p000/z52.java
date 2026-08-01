package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class z52 {

    /* JADX INFO: renamed from: ε */
    public static final p000.z52 f12983 = null;

    /* JADX INFO: renamed from: α */
    public int f12984;

    /* JADX INFO: renamed from: β */
    public int f12985;

    /* JADX INFO: renamed from: γ */
    public final p000.rk0 f12986;

    /* JADX INFO: renamed from: δ */
    public java.lang.Object[] f12987;

    static {
            z52 r0 = new z52
            r1 = 0
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r3 = 0
            r0.<init>(r1, r1, r2, r3)
            p000.z52.f12983 = r0
            return
    }

    public z52(int r1, int r2, java.lang.Object[] r3, p000.rk0 r4) {
            r0 = this;
            r0.<init>()
            r0.f12984 = r1
            r0.f12985 = r2
            r0.f12986 = r4
            r0.f12987 = r3
            return
    }

    /* JADX INFO: renamed from: κ */
    public static p000.z52 m7091(int r11, java.lang.Object r12, java.lang.Object r13, int r14, java.lang.Object r15, java.lang.Object r16, int r17, p000.rk0 r18) {
            r5 = r16
            r0 = r17
            r7 = r18
            r1 = 30
            r8 = 0
            if (r0 <= r1) goto L15
            z52 r11 = new z52
            java.lang.Object[] r12 = new java.lang.Object[]{r12, r13, r15, r5}
            r11.<init>(r8, r8, r12, r7)
            return r11
        L15:
            int r9 = p000.i81.m2668(r11, r0)
            int r1 = p000.i81.m2668(r14, r0)
            r10 = 1
            if (r9 == r1) goto L45
            r11 = 3
            r14 = 2
            r0 = 4
            if (r9 >= r1) goto L30
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r0[r8] = r12
            r0[r10] = r13
            r0[r14] = r15
            r0[r11] = r5
            goto L3a
        L30:
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r0[r8] = r15
            r0[r10] = r5
            r0[r14] = r12
            r0[r11] = r13
        L3a:
            z52 r11 = new z52
            int r12 = r10 << r9
            int r13 = r10 << r1
            r12 = r12 | r13
            r11.<init>(r12, r8, r0, r7)
            return r11
        L45:
            int r6 = r0 + 5
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            z52 r11 = m7091(r0, r1, r2, r3, r4, r5, r6, r7)
            z52 r12 = new z52
            int r13 = r10 << r9
            java.lang.Object[] r11 = new java.lang.Object[]{r11}
            r12.<init>(r8, r13, r11, r7)
            return r12
    }

    /* JADX INFO: renamed from: α */
    public final java.lang.Object[] m7092(int r10, int r11, int r12, java.lang.Object r13, java.lang.Object r14, int r15, p000.rk0 r16) {
            r9 = this;
            java.lang.Object[] r0 = r9.f12987
            r2 = r0[r10]
            r0 = 0
            if (r2 == 0) goto Lc
            int r1 = r2.hashCode()
            goto Ld
        Lc:
            r1 = r0
        Ld:
            java.lang.Object r3 = r9.m7114(r10)
            int r7 = r15 + 5
            r4 = r12
            r5 = r13
            r6 = r14
            r8 = r16
            z52 r12 = m7091(r1, r2, r3, r4, r5, r6, r7, r8)
            int r11 = r9.m7110(r11)
            int r13 = r11 + 1
            java.lang.Object[] r9 = r9.f12987
            int r1 = r11 + (-1)
            int r2 = r9.length
            int r2 = r2 + (-1)
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 6
            p000.AbstractC0312g7.m2240(r9, r2, r0, r10, r3)
            int r0 = r10 + 2
            p000.AbstractC0312g7.m2238(r9, r2, r10, r0, r13)
            r2[r1] = r12
            int r10 = r9.length
            p000.AbstractC0312g7.m2238(r9, r2, r11, r13, r10)
            return r2
    }

    /* JADX INFO: renamed from: β */
    public final int m7093() {
            r4 = this;
            int r0 = r4.f12985
            if (r0 != 0) goto La
            java.lang.Object[] r4 = r4.f12987
            int r4 = r4.length
            int r4 = r4 / 2
            return r4
        La:
            int r0 = r4.f12984
            int r0 = java.lang.Integer.bitCount(r0)
            int r1 = r0 * 2
            java.lang.Object[] r2 = r4.f12987
            int r2 = r2.length
        L15:
            if (r1 >= r2) goto L23
            z52 r3 = r4.m7109(r1)
            int r3 = r3.m7093()
            int r0 = r0 + r3
            int r1 = r1 + 1
            goto L15
        L23:
            return r0
    }

    /* JADX INFO: renamed from: γ */
    public final boolean m7094(java.lang.Object r6) {
            r5 = this;
            java.lang.Object[] r0 = r5.f12987
            int r0 = r0.length
            r1 = 0
            xm0 r0 = p000.j81.m2893(r1, r0)
            r2 = 2
            vm0 r0 = p000.j81.m2889(r2, r0)
            int r2 = r0.f11347
            int r3 = r0.f11348
            int r0 = r0.f11349
            if (r0 <= 0) goto L17
            if (r2 <= r3) goto L1b
        L17:
            if (r0 >= 0) goto L2b
            if (r3 > r2) goto L2b
        L1b:
            java.lang.Object[] r4 = r5.f12987
            r4 = r4[r2]
            boolean r4 = p000.ln0.m3626(r6, r4)
            if (r4 == 0) goto L27
            r5 = 1
            return r5
        L27:
            if (r2 == r3) goto L2b
            int r2 = r2 + r0
            goto L1b
        L2b:
            return r1
    }

    /* JADX INFO: renamed from: δ */
    public final boolean m7095(int r3, int r4, java.lang.Object r5) {
            r2 = this;
            r0 = 1
            int r1 = p000.i81.m2668(r3, r4)
            int r0 = r0 << r1
            boolean r1 = r2.m7099(r0)
            if (r1 == 0) goto L19
            int r3 = r2.m7097(r0)
            java.lang.Object[] r2 = r2.f12987
            r2 = r2[r3]
            boolean r2 = p000.ln0.m3626(r5, r2)
            return r2
        L19:
            boolean r1 = r2.m7100(r0)
            if (r1 == 0) goto L37
            int r0 = r2.m7110(r0)
            z52 r2 = r2.m7109(r0)
            r0 = 30
            if (r4 != r0) goto L30
            boolean r2 = r2.m7094(r5)
            return r2
        L30:
            int r4 = r4 + 5
            boolean r2 = r2.m7095(r3, r4, r5)
            return r2
        L37:
            r2 = 0
            return r2
    }

    /* JADX INFO: renamed from: ε */
    public final boolean m7096(p000.z52 r6) {
            r5 = this;
            if (r5 != r6) goto L3
            goto L26
        L3:
            int r0 = r5.f12985
            int r1 = r6.f12985
            r2 = 0
            if (r0 == r1) goto Lb
            goto L22
        Lb:
            int r0 = r5.f12984
            int r1 = r6.f12984
            if (r0 == r1) goto L12
            goto L22
        L12:
            java.lang.Object[] r0 = r5.f12987
            int r0 = r0.length
            r1 = r2
        L16:
            if (r1 >= r0) goto L26
            java.lang.Object[] r3 = r5.f12987
            r3 = r3[r1]
            java.lang.Object[] r4 = r6.f12987
            r4 = r4[r1]
            if (r3 == r4) goto L23
        L22:
            return r2
        L23:
            int r1 = r1 + 1
            goto L16
        L26:
            r5 = 1
            return r5
    }

    /* JADX INFO: renamed from: ζ */
    public final int m7097(int r1) {
            r0 = this;
            int r0 = r0.f12984
            int r1 = r1 + (-1)
            r0 = r0 & r1
            int r0 = java.lang.Integer.bitCount(r0)
            int r0 = r0 * 2
            return r0
    }

    /* JADX INFO: renamed from: η */
    public final java.lang.Object m7098(int r3, int r4, java.lang.Object r5) {
            r2 = this;
            r0 = 1
            int r1 = p000.i81.m2668(r3, r4)
            int r0 = r0 << r1
            boolean r1 = r2.m7099(r0)
            if (r1 == 0) goto L1f
            int r3 = r2.m7097(r0)
            java.lang.Object[] r4 = r2.f12987
            r4 = r4[r3]
            boolean r4 = p000.ln0.m3626(r5, r4)
            if (r4 == 0) goto L66
            java.lang.Object r2 = r2.m7114(r3)
            return r2
        L1f:
            boolean r1 = r2.m7100(r0)
            if (r1 == 0) goto L66
            int r0 = r2.m7110(r0)
            z52 r2 = r2.m7109(r0)
            r0 = 30
            if (r4 != r0) goto L5f
            java.lang.Object[] r3 = r2.f12987
            int r3 = r3.length
            r4 = 0
            xm0 r3 = p000.j81.m2893(r4, r3)
            r4 = 2
            vm0 r3 = p000.j81.m2889(r4, r3)
            int r4 = r3.f11347
            int r0 = r3.f11348
            int r3 = r3.f11349
            if (r3 <= 0) goto L48
            if (r4 <= r0) goto L4c
        L48:
            if (r3 >= 0) goto L66
            if (r0 > r4) goto L66
        L4c:
            java.lang.Object[] r1 = r2.f12987
            r1 = r1[r4]
            boolean r1 = p000.ln0.m3626(r5, r1)
            if (r1 == 0) goto L5b
            java.lang.Object r2 = r2.m7114(r4)
            return r2
        L5b:
            if (r4 == r0) goto L66
            int r4 = r4 + r3
            goto L4c
        L5f:
            int r4 = r4 + 5
            java.lang.Object r2 = r2.m7098(r3, r4, r5)
            return r2
        L66:
            r2 = 0
            return r2
    }

    /* JADX INFO: renamed from: θ */
    public final boolean m7099(int r1) {
            r0 = this;
            int r0 = r0.f12984
            r0 = r0 & r1
            if (r0 == 0) goto L7
            r0 = 1
            return r0
        L7:
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: ι */
    public final boolean m7100(int r1) {
            r0 = this;
            int r0 = r0.f12985
            r0 = r0 & r1
            if (r0 == 0) goto L7
            r0 = 1
            return r0
        L7:
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: λ */
    public final p000.z52 m7101(int r4, p000.fa1 r5) {
            r3 = this;
            int r0 = r5.f3843
            int r0 = r0 + (-1)
            r5.m2078(r0)
            java.lang.Object r0 = r3.m7114(r4)
            r5.f3841 = r0
            java.lang.Object[] r0 = r3.f12987
            int r1 = r0.length
            r2 = 2
            if (r1 != r2) goto L15
            r3 = 0
            return r3
        L15:
            rk0 r1 = r3.f12986
            rk0 r2 = r5.f3839
            if (r1 != r2) goto L22
            java.lang.Object[] r4 = p000.i81.m2653(r4, r0)
            r3.f12987 = r4
            return r3
        L22:
            java.lang.Object[] r3 = p000.i81.m2653(r4, r0)
            z52 r4 = new z52
            rk0 r5 = r5.f3839
            r0 = 0
            r4.<init>(r0, r0, r3, r5)
            return r4
    }

    /* JADX INFO: renamed from: μ */
    public final p000.z52 m7102(int r11, java.lang.Object r12, java.lang.Object r13, int r14, p000.fa1 r15) {
            r10 = this;
            int r0 = p000.i81.m2668(r11, r14)
            r1 = 1
            int r4 = r1 << r0
            boolean r0 = r10.m7099(r4)
            rk0 r2 = r10.f12986
            if (r0 == 0) goto L87
            int r3 = r10.m7097(r4)
            java.lang.Object[] r0 = r10.f12987
            r0 = r0[r3]
            boolean r0 = p000.ln0.m3626(r12, r0)
            if (r0 == 0) goto L51
            java.lang.Object r11 = r10.m7114(r3)
            r15.f3841 = r11
            java.lang.Object r11 = r10.m7114(r3)
            if (r11 != r13) goto L2c
            r11 = r10
            goto L112
        L2c:
            rk0 r11 = r15.f3839
            if (r2 != r11) goto L36
            java.lang.Object[] r11 = r10.f12987
            int r3 = r3 + r1
            r11[r3] = r13
            return r10
        L36:
            int r11 = r15.f3842
            int r11 = r11 + r1
            r15.f3842 = r11
            java.lang.Object[] r11 = r10.f12987
            int r12 = r11.length
            java.lang.Object[] r11 = java.util.Arrays.copyOf(r11, r12)
            int r3 = r3 + r1
            r11[r3] = r13
            z52 r12 = new z52
            int r13 = r10.f12984
            int r10 = r10.f12985
            rk0 r14 = r15.f3839
            r12.<init>(r13, r10, r11, r14)
            return r12
        L51:
            int r0 = r15.f3843
            int r0 = r0 + r1
            r15.m2078(r0)
            rk0 r9 = r15.f3839
            if (r2 != r9) goto L71
            r2 = r10
            r5 = r11
            r6 = r12
            r7 = r13
            r8 = r14
            java.lang.Object[] r10 = r2.m7092(r3, r4, r5, r6, r7, r8, r9)
            r2.f12987 = r10
            int r10 = r2.f12984
            r10 = r10 ^ r4
            r2.f12984 = r10
            int r10 = r2.f12985
            r10 = r10 | r4
            r2.f12985 = r10
            return r2
        L71:
            r2 = r10
            r5 = r11
            r6 = r12
            r7 = r13
            r8 = r14
            java.lang.Object[] r10 = r2.m7092(r3, r4, r5, r6, r7, r8, r9)
            r11 = r2
            z52 r12 = new z52
            int r13 = r11.f12984
            r13 = r13 ^ r4
            int r11 = r11.f12985
            r11 = r11 | r4
            r12.<init>(r13, r11, r10, r9)
            return r12
        L87:
            r5 = r11
            r6 = r12
            r7 = r13
            r8 = r14
            r11 = r10
            boolean r10 = r11.m7100(r4)
            if (r10 == 0) goto L11a
            int r10 = r11.m7110(r4)
            z52 r0 = r11.m7109(r10)
            r12 = 30
            if (r8 != r12) goto L106
            java.lang.Object[] r12 = r0.f12987
            int r12 = r12.length
            r13 = 0
            xm0 r12 = p000.j81.m2893(r13, r12)
            r14 = 2
            vm0 r12 = p000.j81.m2889(r14, r12)
            int r14 = r12.f11347
            int r2 = r12.f11348
            int r12 = r12.f11349
            if (r12 <= 0) goto Lb5
            if (r14 <= r2) goto Lb9
        Lb5:
            if (r12 >= 0) goto Lf1
            if (r2 > r14) goto Lf1
        Lb9:
            java.lang.Object[] r3 = r0.f12987
            r3 = r3[r14]
            boolean r3 = p000.ln0.m3626(r6, r3)
            if (r3 == 0) goto Led
            java.lang.Object r12 = r0.m7114(r14)
            r15.f3841 = r12
            rk0 r12 = r0.f12986
            rk0 r2 = r15.f3839
            if (r12 != r2) goto Ld6
            java.lang.Object[] r12 = r0.f12987
            int r14 = r14 + r1
            r12[r14] = r7
            r14 = r0
            goto L104
        Ld6:
            int r12 = r15.f3842
            int r12 = r12 + r1
            r15.f3842 = r12
            java.lang.Object[] r12 = r0.f12987
            int r2 = r12.length
            java.lang.Object[] r12 = java.util.Arrays.copyOf(r12, r2)
            int r14 = r14 + r1
            r12[r14] = r7
            z52 r14 = new z52
            rk0 r1 = r15.f3839
            r14.<init>(r13, r13, r12, r1)
            goto L104
        Led:
            if (r14 == r2) goto Lf1
            int r14 = r14 + r12
            goto Lb9
        Lf1:
            int r12 = r15.f3843
            int r12 = r12 + r1
            r15.m2078(r12)
            java.lang.Object[] r12 = r0.f12987
            java.lang.Object[] r12 = p000.i81.m2652(r12, r13, r6, r7)
            z52 r14 = new z52
            rk0 r1 = r15.f3839
            r14.<init>(r13, r13, r12, r1)
        L104:
            r5 = r15
            goto L110
        L106:
            int r4 = r8 + 5
            r1 = r5
            r2 = r6
            r3 = r7
            r5 = r15
            z52 r14 = r0.m7102(r1, r2, r3, r4, r5)
        L110:
            if (r0 != r14) goto L113
        L112:
            return r11
        L113:
            rk0 r12 = r5.f3839
            z52 r10 = r11.m7108(r10, r14, r12)
            return r10
        L11a:
            r5 = r15
            int r10 = r5.f3843
            int r10 = r10 + r1
            r5.m2078(r10)
            rk0 r10 = r5.f3839
            int r12 = r11.m7097(r4)
            java.lang.Object[] r13 = r11.f12987
            if (r2 != r10) goto L137
            java.lang.Object[] r10 = p000.i81.m2652(r13, r12, r6, r7)
            r11.f12987 = r10
            int r10 = r11.f12984
            r10 = r10 | r4
            r11.f12984 = r10
            return r11
        L137:
            java.lang.Object[] r12 = p000.i81.m2652(r13, r12, r6, r7)
            z52 r13 = new z52
            int r14 = r11.f12984
            r14 = r14 | r4
            int r11 = r11.f12985
            r13.<init>(r14, r11, r12, r10)
            return r13
    }

    /* JADX INFO: renamed from: ν */
    public final p000.z52 m7103(p000.z52 r28, int r29, p000.C0994xr r30, p000.fa1 r31) {
            r27 = this;
            r0 = r27
            r1 = r28
            r2 = r29
            r3 = r30
            r9 = r31
            if (r0 != r1) goto L16
            int r1 = r0.m7093()
            int r2 = r3.f12255
            int r2 = r2 + r1
            r3.f12255 = r2
            return r0
        L16:
            r4 = 30
            r5 = 2
            r10 = 0
            if (r2 <= r4) goto L8c
            rk0 r2 = r9.f3839
            int r4 = r1.f12985
            java.lang.Object[] r4 = r0.f12987
            int r6 = r4.length
            java.lang.Object[] r7 = r1.f12987
            int r7 = r7.length
            int r6 = r6 + r7
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r4, r6)
            java.lang.Object[] r6 = r0.f12987
            int r6 = r6.length
            java.lang.Object[] r7 = r1.f12987
            int r7 = r7.length
            xm0 r7 = p000.j81.m2893(r10, r7)
            vm0 r5 = p000.j81.m2889(r5, r7)
            int r7 = r5.f11347
            int r8 = r5.f11348
            int r5 = r5.f11349
            if (r5 <= 0) goto L43
            if (r7 <= r8) goto L47
        L43:
            if (r5 >= 0) goto L6c
            if (r8 > r7) goto L6c
        L47:
            java.lang.Object[] r9 = r1.f12987
            r9 = r9[r7]
            boolean r9 = r0.m7094(r9)
            if (r9 != 0) goto L62
            java.lang.Object[] r9 = r1.f12987
            r11 = r9[r7]
            r4[r6] = r11
            int r11 = r6 + 1
            int r12 = r7 + 1
            r9 = r9[r12]
            r4[r11] = r9
            int r6 = r6 + 2
            goto L68
        L62:
            int r9 = r3.f12255
            int r9 = r9 + 1
            r3.f12255 = r9
        L68:
            if (r7 == r8) goto L6c
            int r7 = r7 + r5
            goto L47
        L6c:
            java.lang.Object[] r3 = r0.f12987
            int r3 = r3.length
            if (r6 != r3) goto L73
            goto L23a
        L73:
            java.lang.Object[] r0 = r1.f12987
            int r0 = r0.length
            if (r6 != r0) goto L79
            return r1
        L79:
            int r0 = r4.length
            if (r6 != r0) goto L82
            z52 r0 = new z52
            r0.<init>(r10, r10, r4, r2)
            return r0
        L82:
            z52 r0 = new z52
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r4, r6)
            r0.<init>(r10, r10, r1, r2)
            return r0
        L8c:
            int r4 = r0.f12985
            int r6 = r1.f12985
            r4 = r4 | r6
            int r6 = r0.f12984
            int r7 = r1.f12984
            r8 = r6 ^ r7
            int r11 = ~r4
            r8 = r8 & r11
            r6 = r6 & r7
            r11 = r8
        L9b:
            if (r6 == 0) goto Lbe
            int r7 = java.lang.Integer.lowestOneBit(r6)
            int r8 = r0.m7097(r7)
            java.lang.Object[] r12 = r0.f12987
            r8 = r12[r8]
            int r12 = r1.m7097(r7)
            java.lang.Object[] r13 = r1.f12987
            r12 = r13[r12]
            boolean r8 = p000.ln0.m3626(r8, r12)
            if (r8 == 0) goto Lbb
            r8 = r11 | r7
            r11 = r8
            goto Lbc
        Lbb:
            r4 = r4 | r7
        Lbc:
            r6 = r6 ^ r7
            goto L9b
        Lbe:
            r6 = r4 & r11
            if (r6 != 0) goto Lc3
            goto Lc8
        Lc3:
            java.lang.String r6 = "Check failed."
            p000.pi1.m4545(r6)
        Lc8:
            rk0 r6 = r0.f12986
            rk0 r7 = r9.f3839
            boolean r6 = p000.ln0.m3626(r6, r7)
            if (r6 == 0) goto Ldc
            int r6 = r0.f12984
            if (r6 != r11) goto Ldc
            int r6 = r0.f12985
            if (r6 != r4) goto Ldc
            r12 = r0
            goto Lef
        Ldc:
            int r6 = java.lang.Integer.bitCount(r11)
            int r6 = r6 * r5
            int r5 = java.lang.Integer.bitCount(r4)
            int r5 = r5 + r6
            java.lang.Object[] r5 = new java.lang.Object[r5]
            z52 r6 = new z52
            r7 = 0
            r6.<init>(r11, r4, r5, r7)
            r12 = r6
        Lef:
            r13 = r4
            r14 = r10
        Lf1:
            if (r13 == 0) goto L1ec
            int r15 = java.lang.Integer.lowestOneBit(r13)
            java.lang.Object[] r4 = r12.f12987
            int r5 = r4.length
            int r5 = r5 + (-1)
            int r16 = r5 - r14
            boolean r5 = r0.m7100(r15)
            if (r5 == 0) goto L165
            int r5 = r0.m7110(r15)
            z52 r5 = r0.m7109(r5)
            boolean r6 = r1.m7100(r15)
            if (r6 == 0) goto L124
            int r6 = r1.m7110(r15)
            z52 r6 = r1.m7109(r6)
            int r7 = r2 + 5
            z52 r5 = r5.m7103(r6, r7, r3, r9)
            r17 = r4
            goto L1e4
        L124:
            boolean r6 = r1.m7099(r15)
            if (r6 == 0) goto L160
            int r6 = r1.m7097(r15)
            java.lang.Object[] r7 = r1.f12987
            r7 = r7[r6]
            java.lang.Object r6 = r1.m7114(r6)
            int r8 = r9.f3843
            if (r7 == 0) goto L13f
            int r17 = r7.hashCode()
            goto L141
        L13f:
            r17 = r10
        L141:
            r18 = r8
            int r8 = r2 + 5
            r10 = r17
            r17 = r4
            r4 = r5
            r5 = r10
            r10 = r7
            r7 = r6
            r6 = r10
            r10 = r18
            z52 r5 = r4.m7102(r5, r6, r7, r8, r9)
            int r4 = r9.f3843
            if (r4 != r10) goto L1e4
            int r4 = r3.f12255
            int r4 = r4 + 1
            r3.f12255 = r4
            goto L1e4
        L160:
            r17 = r4
            r4 = r5
            goto L1e4
        L165:
            r17 = r4
            boolean r4 = r1.m7100(r15)
            if (r4 == 0) goto L1ac
            int r4 = r1.m7110(r15)
            z52 r4 = r1.m7109(r4)
            boolean r5 = r0.m7099(r15)
            if (r5 == 0) goto L199
            int r5 = r0.m7097(r15)
            java.lang.Object[] r6 = r0.f12987
            r6 = r6[r5]
            if (r6 == 0) goto L18a
            int r7 = r6.hashCode()
            goto L18b
        L18a:
            r7 = 0
        L18b:
            int r8 = r2 + 5
            boolean r7 = r4.m7095(r7, r8, r6)
            if (r7 == 0) goto L19b
            int r5 = r3.f12255
            int r5 = r5 + 1
            r3.f12255 = r5
        L199:
            r5 = r4
            goto L1e4
        L19b:
            java.lang.Object r7 = r0.m7114(r5)
            if (r6 == 0) goto L1a6
            int r5 = r6.hashCode()
            goto L1a7
        L1a6:
            r5 = 0
        L1a7:
            z52 r5 = r4.m7102(r5, r6, r7, r8, r9)
            goto L1e4
        L1ac:
            int r4 = r0.m7097(r15)
            java.lang.Object[] r5 = r0.f12987
            r20 = r5[r4]
            java.lang.Object r21 = r0.m7114(r4)
            int r4 = r1.m7097(r15)
            java.lang.Object[] r5 = r1.f12987
            r23 = r5[r4]
            java.lang.Object r24 = r1.m7114(r4)
            if (r20 == 0) goto L1cd
            int r4 = r20.hashCode()
            r19 = r4
            goto L1cf
        L1cd:
            r19 = 0
        L1cf:
            if (r23 == 0) goto L1d8
            int r4 = r23.hashCode()
            r22 = r4
            goto L1da
        L1d8:
            r22 = 0
        L1da:
            int r25 = r2 + 5
            rk0 r4 = r9.f3839
            r26 = r4
            z52 r5 = m7091(r19, r20, r21, r22, r23, r24, r25, r26)
        L1e4:
            r17[r16] = r5
            int r14 = r14 + 1
            r13 = r13 ^ r15
            r10 = 0
            goto Lf1
        L1ec:
            r10 = 0
        L1ed:
            if (r11 == 0) goto L234
            int r2 = java.lang.Integer.lowestOneBit(r11)
            int r4 = r10 * 2
            boolean r5 = r1.m7099(r2)
            if (r5 != 0) goto L210
            int r5 = r0.m7097(r2)
            java.lang.Object[] r6 = r12.f12987
            java.lang.Object[] r7 = r0.f12987
            r7 = r7[r5]
            r6[r4] = r7
            int r4 = r4 + 1
            java.lang.Object r5 = r0.m7114(r5)
            r6[r4] = r5
            goto L230
        L210:
            int r5 = r1.m7097(r2)
            java.lang.Object[] r6 = r12.f12987
            java.lang.Object[] r7 = r1.f12987
            r7 = r7[r5]
            r6[r4] = r7
            int r4 = r4 + 1
            java.lang.Object r5 = r1.m7114(r5)
            r6[r4] = r5
            boolean r4 = r0.m7099(r2)
            if (r4 == 0) goto L230
            int r4 = r3.f12255
            int r4 = r4 + 1
            r3.f12255 = r4
        L230:
            int r10 = r10 + 1
            r11 = r11 ^ r2
            goto L1ed
        L234:
            boolean r2 = r0.m7096(r12)
            if (r2 == 0) goto L23b
        L23a:
            return r0
        L23b:
            boolean r0 = r1.m7096(r12)
            if (r0 == 0) goto L242
            return r1
        L242:
            return r12
    }

    /* JADX INFO: renamed from: ξ */
    public final p000.z52 m7104(int r9, java.lang.Object r10, int r11, p000.fa1 r12) {
            r8 = this;
            r0 = 1
            int r1 = p000.i81.m2668(r9, r11)
            int r6 = r0 << r1
            boolean r0 = r8.m7099(r6)
            if (r0 == 0) goto L22
            int r9 = r8.m7097(r6)
            java.lang.Object[] r11 = r8.f12987
            r11 = r11[r9]
            boolean r10 = p000.ln0.m3626(r10, r11)
            if (r10 == 0) goto L20
            z52 r8 = r8.m7106(r9, r6, r12)
            return r8
        L20:
            r2 = r8
            goto L74
        L22:
            boolean r0 = r8.m7100(r6)
            if (r0 == 0) goto L20
            int r5 = r8.m7110(r6)
            z52 r3 = r8.m7109(r5)
            r0 = 30
            if (r11 != r0) goto L65
            java.lang.Object[] r9 = r3.f12987
            int r9 = r9.length
            r11 = 0
            xm0 r9 = p000.j81.m2893(r11, r9)
            r11 = 2
            vm0 r9 = p000.j81.m2889(r11, r9)
            int r11 = r9.f11347
            int r0 = r9.f11348
            int r9 = r9.f11349
            if (r9 <= 0) goto L4b
            if (r11 <= r0) goto L4f
        L4b:
            if (r9 >= 0) goto L62
            if (r0 > r11) goto L62
        L4f:
            java.lang.Object[] r1 = r3.f12987
            r1 = r1[r11]
            boolean r1 = p000.ln0.m3626(r10, r1)
            if (r1 == 0) goto L5e
            z52 r9 = r3.m7101(r11, r12)
            goto L63
        L5e:
            if (r11 == r0) goto L62
            int r11 = r11 + r9
            goto L4f
        L62:
            r9 = r3
        L63:
            r4 = r9
            goto L6c
        L65:
            int r11 = r11 + 5
            z52 r9 = r3.m7104(r9, r10, r11, r12)
            goto L63
        L6c:
            rk0 r7 = r12.f3839
            r2 = r8
            z52 r8 = r2.m7107(r3, r4, r5, r6, r7)
            return r8
        L74:
            return r2
    }

    /* JADX INFO: renamed from: ο */
    public final p000.z52 m7105(int r8, java.lang.Object r9, java.lang.Object r10, int r11, p000.fa1 r12) {
            r7 = this;
            r0 = 1
            int r1 = p000.i81.m2668(r8, r11)
            int r0 = r0 << r1
            boolean r1 = r7.m7099(r0)
            if (r1 == 0) goto L29
            int r8 = r7.m7097(r0)
            java.lang.Object[] r11 = r7.f12987
            r11 = r11[r8]
            boolean r9 = p000.ln0.m3626(r9, r11)
            if (r9 == 0) goto L8a
            java.lang.Object r9 = r7.m7114(r8)
            boolean r9 = p000.ln0.m3626(r10, r9)
            if (r9 == 0) goto L8a
            z52 r7 = r7.m7106(r8, r0, r12)
            return r7
        L29:
            boolean r1 = r7.m7100(r0)
            if (r1 == 0) goto L8a
            r4 = r10
            int r10 = r7.m7110(r0)
            z52 r1 = r7.m7109(r10)
            r2 = 30
            if (r11 != r2) goto L78
            java.lang.Object[] r8 = r1.f12987
            int r8 = r8.length
            r11 = 0
            xm0 r8 = p000.j81.m2893(r11, r8)
            r11 = 2
            vm0 r8 = p000.j81.m2889(r11, r8)
            int r11 = r8.f11347
            int r2 = r8.f11348
            int r8 = r8.f11349
            if (r8 <= 0) goto L53
            if (r11 <= r2) goto L57
        L53:
            if (r8 >= 0) goto L74
            if (r2 > r11) goto L74
        L57:
            java.lang.Object[] r3 = r1.f12987
            r3 = r3[r11]
            boolean r3 = p000.ln0.m3626(r9, r3)
            if (r3 == 0) goto L70
            java.lang.Object r3 = r1.m7114(r11)
            boolean r3 = p000.ln0.m3626(r4, r3)
            if (r3 == 0) goto L70
            z52 r8 = r1.m7101(r11, r12)
            goto L75
        L70:
            if (r11 == r2) goto L74
            int r11 = r11 + r8
            goto L57
        L74:
            r8 = r1
        L75:
            r6 = r12
        L76:
            r9 = r8
            goto L82
        L78:
            int r5 = r11 + 5
            r2 = r8
            r3 = r9
            r6 = r12
            z52 r8 = r1.m7105(r2, r3, r4, r5, r6)
            goto L76
        L82:
            rk0 r12 = r6.f3839
            r11 = r0
            r8 = r1
            z52 r7 = r7.m7107(r8, r9, r10, r11, r12)
        L8a:
            return r7
    }

    /* JADX INFO: renamed from: π */
    public final p000.z52 m7106(int r4, int r5, p000.fa1 r6) {
            r3 = this;
            int r0 = r6.f3843
            int r0 = r0 + (-1)
            r6.m2078(r0)
            java.lang.Object r0 = r3.m7114(r4)
            r6.f3841 = r0
            java.lang.Object[] r0 = r3.f12987
            int r1 = r0.length
            r2 = 2
            if (r1 != r2) goto L15
            r3 = 0
            return r3
        L15:
            rk0 r1 = r3.f12986
            rk0 r2 = r6.f3839
            if (r1 != r2) goto L27
            java.lang.Object[] r4 = p000.i81.m2653(r4, r0)
            r3.f12987 = r4
            int r4 = r3.f12984
            r4 = r4 ^ r5
            r3.f12984 = r4
            return r3
        L27:
            java.lang.Object[] r4 = p000.i81.m2653(r4, r0)
            z52 r0 = new z52
            int r1 = r3.f12984
            r5 = r5 ^ r1
            int r3 = r3.f12985
            rk0 r6 = r6.f3839
            r0.<init>(r5, r3, r4, r6)
            return r0
    }

    /* JADX INFO: renamed from: ρ */
    public final p000.z52 m7107(p000.z52 r3, p000.z52 r4, int r5, int r6, p000.rk0 r7) {
            r2 = this;
            rk0 r0 = r2.f12986
            if (r4 != 0) goto L29
            java.lang.Object[] r3 = r2.f12987
            int r4 = r3.length
            r1 = 1
            if (r4 != r1) goto Lc
            r2 = 0
            return r2
        Lc:
            if (r0 != r7) goto L1a
            java.lang.Object[] r3 = p000.i81.m2654(r5, r3)
            r2.f12987 = r3
            int r3 = r2.f12985
            r3 = r3 ^ r6
            r2.f12985 = r3
            return r2
        L1a:
            java.lang.Object[] r3 = p000.i81.m2654(r5, r3)
            z52 r4 = new z52
            int r5 = r2.f12984
            int r2 = r2.f12985
            r2 = r2 ^ r6
            r4.<init>(r5, r2, r3, r7)
            return r4
        L29:
            if (r0 == r7) goto L2f
            if (r3 == r4) goto L2e
            goto L2f
        L2e:
            return r2
        L2f:
            z52 r2 = r2.m7108(r5, r4, r7)
            return r2
    }

    /* JADX INFO: renamed from: σ */
    public final p000.z52 m7108(int r4, p000.z52 r5, p000.rk0 r6) {
            r3 = this;
            java.lang.Object[] r0 = r3.f12987
            int r1 = r0.length
            r2 = 1
            if (r1 != r2) goto L15
            java.lang.Object[] r1 = r5.f12987
            int r1 = r1.length
            r2 = 2
            if (r1 != r2) goto L15
            int r1 = r5.f12985
            if (r1 != 0) goto L15
            int r3 = r3.f12985
            r5.f12984 = r3
            return r5
        L15:
            rk0 r1 = r3.f12986
            if (r1 != r6) goto L1c
            r0[r4] = r5
            return r3
        L1c:
            int r1 = r0.length
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r1)
            r0[r4] = r5
            z52 r4 = new z52
            int r5 = r3.f12984
            int r3 = r3.f12985
            r4.<init>(r5, r3, r0, r6)
            return r4
    }

    /* JADX INFO: renamed from: τ */
    public final p000.z52 m7109(int r1) {
            r0 = this;
            java.lang.Object[] r0 = r0.f12987
            r0 = r0[r1]
            r0.getClass()
            z52 r0 = (p000.z52) r0
            return r0
    }

    /* JADX INFO: renamed from: υ */
    public final int m7110(int r2) {
            r1 = this;
            java.lang.Object[] r0 = r1.f12987
            int r0 = r0.length
            int r0 = r0 + (-1)
            int r1 = r1.f12985
            int r2 = r2 + (-1)
            r1 = r1 & r2
            int r1 = java.lang.Integer.bitCount(r1)
            int r0 = r0 - r1
            return r0
    }

    /* JADX INFO: renamed from: φ */
    public final p000.C0891v m7111(int r12, int r13, java.lang.Object r14, java.lang.Object r15) {
            r11 = this;
            int r0 = p000.i81.m2668(r12, r13)
            r1 = 1
            int r4 = r1 << r0
            boolean r0 = r11.m7099(r4)
            r2 = 0
            r10 = 0
            if (r0 == 0) goto L5a
            int r3 = r11.m7097(r4)
            java.lang.Object[] r0 = r11.f12987
            r0 = r0[r3]
            boolean r0 = p000.ln0.m3626(r14, r0)
            if (r0 == 0) goto L3e
            java.lang.Object r12 = r11.m7114(r3)
            if (r12 != r15) goto L25
            goto Ld1
        L25:
            java.lang.Object[] r12 = r11.f12987
            int r13 = r12.length
            java.lang.Object[] r12 = java.util.Arrays.copyOf(r12, r13)
            int r3 = r3 + r1
            r12[r3] = r15
            z52 r13 = new z52
            int r14 = r11.f12984
            int r11 = r11.f12985
            r13.<init>(r14, r11, r12, r10)
            v r11 = new v
            r11.<init>(r13, r2)
            return r11
        L3e:
            r9 = 0
            r2 = r11
            r5 = r12
            r8 = r13
            r6 = r14
            r7 = r15
            java.lang.Object[] r11 = r2.m7092(r3, r4, r5, r6, r7, r8, r9)
            r12 = r2
            z52 r13 = new z52
            int r14 = r12.f12984
            r14 = r14 ^ r4
            int r12 = r12.f12985
            r12 = r12 | r4
            r13.<init>(r14, r12, r11, r10)
            v r11 = new v
            r11.<init>(r13, r1)
            return r11
        L5a:
            r5 = r12
            r8 = r13
            r6 = r14
            r7 = r15
            r12 = r11
            boolean r11 = r12.m7100(r4)
            if (r11 == 0) goto Ldd
            int r11 = r12.m7110(r4)
            z52 r13 = r12.m7109(r11)
            r14 = 30
            if (r8 != r14) goto Lc9
            java.lang.Object[] r14 = r13.f12987
            int r14 = r14.length
            xm0 r14 = p000.j81.m2893(r2, r14)
            r15 = 2
            vm0 r14 = p000.j81.m2889(r15, r14)
            int r15 = r14.f11347
            int r0 = r14.f11348
            int r14 = r14.f11349
            if (r14 <= 0) goto L87
            if (r15 <= r0) goto L8b
        L87:
            if (r14 >= 0) goto Lb6
            if (r0 > r15) goto Lb6
        L8b:
            java.lang.Object[] r3 = r13.f12987
            r3 = r3[r15]
            boolean r3 = p000.ln0.m3626(r6, r3)
            if (r3 == 0) goto Lb2
            java.lang.Object r14 = r13.m7114(r15)
            if (r7 != r14) goto L9d
            r13 = r10
            goto Lc6
        L9d:
            java.lang.Object[] r13 = r13.f12987
            int r14 = r13.length
            java.lang.Object[] r13 = java.util.Arrays.copyOf(r13, r14)
            int r15 = r15 + r1
            r13[r15] = r7
            z52 r14 = new z52
            r14.<init>(r2, r2, r13, r10)
            v r13 = new v
            r13.<init>(r14, r2)
            goto Lc6
        Lb2:
            if (r15 == r0) goto Lb6
            int r15 = r15 + r14
            goto L8b
        Lb6:
            java.lang.Object[] r13 = r13.f12987
            java.lang.Object[] r13 = p000.i81.m2652(r13, r2, r6, r7)
            z52 r14 = new z52
            r14.<init>(r2, r2, r13, r10)
            v r13 = new v
            r13.<init>(r14, r1)
        Lc6:
            if (r13 != 0) goto Ld2
            goto Ld1
        Lc9:
            int r14 = r8 + 5
            v r13 = r13.m7111(r5, r14, r6, r7)
            if (r13 != 0) goto Ld2
        Ld1:
            return r10
        Ld2:
            java.lang.Object r14 = r13.f11045
            z52 r14 = (p000.z52) r14
            z52 r11 = r12.m7113(r11, r4, r14)
            r13.f11045 = r11
            return r13
        Ldd:
            int r11 = r12.m7097(r4)
            java.lang.Object[] r13 = r12.f12987
            java.lang.Object[] r11 = p000.i81.m2652(r13, r11, r6, r7)
            z52 r13 = new z52
            int r14 = r12.f12984
            r14 = r14 | r4
            int r12 = r12.f12985
            r13.<init>(r14, r12, r11, r10)
            v r11 = new v
            r11.<init>(r13, r1)
            return r11
    }

    /* JADX INFO: renamed from: χ */
    public final p000.z52 m7112(int r10, int r11, java.lang.Object r12) {
            r9 = this;
            int r0 = p000.i81.m2668(r10, r11)
            r1 = 1
            int r0 = r1 << r0
            boolean r2 = r9.m7099(r0)
            r3 = 2
            r4 = 0
            if (r2 == 0) goto L33
            int r10 = r9.m7097(r0)
            java.lang.Object[] r11 = r9.f12987
            r11 = r11[r10]
            boolean r11 = p000.ln0.m3626(r12, r11)
            if (r11 == 0) goto La3
            java.lang.Object[] r11 = r9.f12987
            int r12 = r11.length
            if (r12 != r3) goto L24
            goto L8d
        L24:
            java.lang.Object[] r10 = p000.i81.m2653(r10, r11)
            z52 r11 = new z52
            int r12 = r9.f12984
            r12 = r12 ^ r0
            int r9 = r9.f12985
            r11.<init>(r12, r9, r10, r4)
            return r11
        L33:
            boolean r2 = r9.m7100(r0)
            if (r2 == 0) goto La3
            int r2 = r9.m7110(r0)
            z52 r5 = r9.m7109(r2)
            r6 = 30
            if (r11 != r6) goto L80
            java.lang.Object[] r10 = r5.f12987
            int r10 = r10.length
            r11 = 0
            xm0 r10 = p000.j81.m2893(r11, r10)
            vm0 r10 = p000.j81.m2889(r3, r10)
            int r6 = r10.f11347
            int r7 = r10.f11348
            int r10 = r10.f11349
            if (r10 <= 0) goto L5b
            if (r6 <= r7) goto L5f
        L5b:
            if (r10 >= 0) goto L7e
            if (r7 > r6) goto L7e
        L5f:
            java.lang.Object[] r8 = r5.f12987
            r8 = r8[r6]
            boolean r8 = p000.ln0.m3626(r12, r8)
            if (r8 == 0) goto L7a
            java.lang.Object[] r10 = r5.f12987
            int r12 = r10.length
            if (r12 != r3) goto L70
            r12 = r4
            goto L86
        L70:
            java.lang.Object[] r10 = p000.i81.m2653(r6, r10)
            z52 r12 = new z52
            r12.<init>(r11, r11, r10, r4)
            goto L86
        L7a:
            if (r6 == r7) goto L7e
            int r6 = r6 + r10
            goto L5f
        L7e:
            r12 = r5
            goto L86
        L80:
            int r11 = r11 + 5
            z52 r12 = r5.m7112(r10, r11, r12)
        L86:
            if (r12 != 0) goto L9d
            java.lang.Object[] r10 = r9.f12987
            int r11 = r10.length
            if (r11 != r1) goto L8e
        L8d:
            return r4
        L8e:
            java.lang.Object[] r10 = p000.i81.m2654(r2, r10)
            z52 r11 = new z52
            int r12 = r9.f12984
            int r9 = r9.f12985
            r9 = r9 ^ r0
            r11.<init>(r12, r9, r10, r4)
            return r11
        L9d:
            if (r5 == r12) goto La3
            z52 r9 = r9.m7113(r2, r0, r12)
        La3:
            return r9
    }

    /* JADX INFO: renamed from: ψ */
    public final p000.z52 m7113(int r9, int r10, p000.z52 r11) {
            r8 = this;
            java.lang.Object[] r0 = r11.f12987
            int r1 = r0.length
            r2 = 2
            r3 = 0
            if (r1 != r2) goto L45
            int r1 = r11.f12985
            if (r1 != 0) goto L45
            java.lang.Object[] r1 = r8.f12987
            int r1 = r1.length
            r2 = 1
            if (r1 != r2) goto L16
            int r8 = r8.f12985
            r11.f12984 = r8
            return r11
        L16:
            int r11 = r8.m7097(r10)
            java.lang.Object[] r1 = r8.f12987
            r4 = 0
            r4 = r0[r4]
            r0 = r0[r2]
            int r5 = r1.length
            int r5 = r5 + r2
            java.lang.Object[] r5 = java.util.Arrays.copyOf(r1, r5)
            int r6 = r9 + 2
            int r7 = r9 + 1
            int r1 = r1.length
            p000.AbstractC0312g7.m2238(r5, r5, r6, r7, r1)
            int r1 = r11 + 2
            p000.AbstractC0312g7.m2238(r5, r5, r1, r11, r9)
            r5[r11] = r4
            int r11 = r11 + r2
            r5[r11] = r0
            z52 r9 = new z52
            int r11 = r8.f12984
            r11 = r11 ^ r10
            int r8 = r8.f12985
            r8 = r8 ^ r10
            r9.<init>(r11, r8, r5, r3)
            return r9
        L45:
            java.lang.Object[] r10 = r8.f12987
            int r0 = r10.length
            java.lang.Object[] r10 = java.util.Arrays.copyOf(r10, r0)
            r10[r9] = r11
            z52 r9 = new z52
            int r11 = r8.f12984
            int r8 = r8.f12985
            r9.<init>(r11, r8, r10, r3)
            return r9
    }

    /* JADX INFO: renamed from: ω */
    public final java.lang.Object m7114(int r1) {
            r0 = this;
            java.lang.Object[] r0 = r0.f12987
            int r1 = r1 + 1
            r0 = r0[r1]
            return r0
    }
}
