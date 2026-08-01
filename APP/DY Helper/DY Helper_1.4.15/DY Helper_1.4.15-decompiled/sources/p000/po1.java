package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class po1 extends p000.AbstractC0432ji {

    /* JADX INFO: renamed from: σ */
    public static final p000.ql1 f8624 = null;

    /* JADX INFO: renamed from: δ */
    public final p000.nb2 f8625;

    /* JADX INFO: renamed from: ε */
    public final float f8626;

    /* JADX INFO: renamed from: ζ */
    public final float f8627;

    /* JADX INFO: renamed from: η */
    public final p000.q52 f8628;

    /* JADX INFO: renamed from: θ */
    public final float[] f8629;

    /* JADX INFO: renamed from: ι */
    public final float[] f8630;

    /* JADX INFO: renamed from: κ */
    public final float[] f8631;

    /* JADX INFO: renamed from: λ */
    public final p000.InterfaceC0224du f8632;

    /* JADX INFO: renamed from: μ */
    public final p000.oo1 f8633;

    /* JADX INFO: renamed from: ν */
    public final p000.lo1 f8634;

    /* JADX INFO: renamed from: ξ */
    public final p000.InterfaceC0224du f8635;

    /* JADX INFO: renamed from: ο */
    public final p000.oo1 f8636;

    /* JADX INFO: renamed from: π */
    public final p000.lo1 f8637;

    /* JADX INFO: renamed from: ρ */
    public final boolean f8638;

    static {
            ql1 r0 = new ql1
            r0.<init>()
            p000.po1.f8624 = r0
            return
    }

    public po1(java.lang.String r18, float[] r19, p000.nb2 r20, double r21, float r23, float r24, int r25) {
            r17 = this;
            r1 = r21
            r3 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            ql1 r3 = p000.po1.f8624
            if (r0 != 0) goto Lc
            r11 = r3
            goto L13
        Lc:
            mo1 r4 = new mo1
            r5 = 0
            r4.<init>(r1, r5)
            r11 = r4
        L13:
            if (r0 != 0) goto L17
        L15:
            r12 = r3
            goto L1e
        L17:
            mo1 r3 = new mo1
            r0 = 1
            r3.<init>(r1, r0)
            goto L15
        L1e:
            q52 r15 = new q52
            r7 = 0
            r9 = 0
            r3 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r5 = 0
            r0 = r15
            r0.<init>(r1, r3, r5, r7, r9)
            r10 = 0
            r6 = r17
            r7 = r18
            r8 = r19
            r9 = r20
            r13 = r23
            r14 = r24
            r16 = r25
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            return
    }

    public po1(java.lang.String r16, float[] r17, p000.nb2 r18, p000.q52 r19, int r20) {
            r15 = this;
            r9 = r19
            double r0 = r9.f8876
            r2 = -4609434218613702656(0xc008000000000000, double:-3.0)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto Lc
            r4 = 1
            goto Ld
        Lc:
            r4 = 0
        Ld:
            double r5 = r9.f8882
            double r7 = r9.f8881
            r10 = -4611686018427387904(0xc000000000000000, double:-2.0)
            r12 = 0
            if (r4 == 0) goto L1e
            no1 r4 = new no1
            r14 = 4
            r4.<init>(r9, r14)
            goto L3e
        L1e:
            int r4 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r4 != 0) goto L29
            no1 r4 = new no1
            r14 = 5
            r4.<init>(r9, r14)
            goto L3e
        L29:
            int r4 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
            if (r4 != 0) goto L38
            int r4 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1))
            if (r4 != 0) goto L38
            no1 r4 = new no1
            r14 = 6
            r4.<init>(r9, r14)
            goto L3e
        L38:
            no1 r4 = new no1
            r14 = 7
            r4.<init>(r9, r14)
        L3e:
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 != 0) goto L4a
            no1 r0 = new no1
            r1 = 0
            r0.<init>(r9, r1)
        L48:
            r6 = r0
            goto L6b
        L4a:
            int r0 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r0 != 0) goto L55
            no1 r0 = new no1
            r1 = 1
            r0.<init>(r9, r1)
            goto L48
        L55:
            int r0 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
            if (r0 != 0) goto L64
            int r0 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1))
            if (r0 != 0) goto L64
            no1 r0 = new no1
            r1 = 2
            r0.<init>(r9, r1)
            goto L48
        L64:
            no1 r0 = new no1
            r1 = 3
            r0.<init>(r9, r1)
            goto L48
        L6b:
            r7 = 0
            r8 = 1065353216(0x3f800000, float:1.0)
            r5 = r4
            r4 = 0
            r0 = r15
            r1 = r16
            r2 = r17
            r3 = r18
            r10 = r20
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
    }

    public po1(java.lang.String r33, float[] r34, p000.nb2 r35, float[] r36, p000.InterfaceC0224du r37, p000.InterfaceC0224du r38, float r39, float r40, p000.q52 r41, int r42) {
            r32 = this;
            r0 = r32
            r1 = r34
            r2 = r35
            r3 = r36
            r4 = r37
            r5 = r38
            r6 = r39
            r7 = r40
            r8 = r42
            long r9 = p000.AbstractC0213di.f3165
            r11 = r33
            r0.<init>(r11, r9, r8)
            r0.f8625 = r2
            r0.f8626 = r6
            r0.f8627 = r7
            r9 = r41
            r0.f8628 = r9
            r0.f8632 = r4
            oo1 r9 = new oo1
            r10 = 1
            r9.<init>(r0, r10)
            r0.f8633 = r9
            lo1 r9 = new lo1
            r11 = 0
            r9.<init>(r0, r11)
            r0.f8634 = r9
            r0.f8635 = r5
            oo1 r9 = new oo1
            r9.<init>(r0, r11)
            r0.f8636 = r9
            lo1 r9 = new lo1
            r9.<init>(r0, r10)
            r0.f8637 = r9
            int r9 = r1.length
            r12 = 9
            r13 = 6
            if (r9 == r13) goto L56
            int r9 = r1.length
            if (r9 != r12) goto L4f
            goto L56
        L4f:
            java.lang.String r0 = "The color space's primaries must be defined as an array of 6 floats in xyY or 9 floats in XYZ"
            p000.C1080.m7275(r0)
            r0 = 0
            throw r0
        L56:
            int r9 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r9 >= 0) goto L27c
            float[] r9 = new float[r13]
            int r14 = r1.length
            r15 = 8
            r16 = 7
            r17 = 2
            r18 = 3
            r19 = 4
            r20 = 5
            if (r14 != r12) goto La2
            r14 = r1[r11]
            r21 = r1[r10]
            float r22 = r14 + r21
            r23 = r1[r17]
            float r22 = r22 + r23
            float r14 = r14 / r22
            r9[r11] = r14
            float r21 = r21 / r22
            r9[r10] = r21
            r14 = r1[r18]
            r21 = r1[r19]
            float r22 = r14 + r21
            r23 = r1[r20]
            float r22 = r22 + r23
            float r14 = r14 / r22
            r9[r17] = r14
            float r21 = r21 / r22
            r9[r18] = r21
            r14 = r1[r13]
            r21 = r1[r16]
            float r22 = r14 + r21
            r1 = r1[r15]
            float r22 = r22 + r1
            float r14 = r14 / r22
            r9[r19] = r14
            float r21 = r21 / r22
            r9[r20] = r21
            goto La5
        La2:
            java.lang.System.arraycopy(r1, r11, r9, r11, r13)
        La5:
            r0.f8629 = r9
            if (r3 != 0) goto L12b
            r3 = r9[r11]
            r14 = r9[r10]
            r21 = r9[r17]
            r22 = r9[r18]
            r23 = r9[r19]
            r24 = r9[r20]
            r33 = 1065353216(0x3f800000, float:1.0)
            float r1 = r2.f7509
            r41 = r11
            float r11 = r2.f7510
            r25 = r15
            float r15 = (float) r10
            float r26 = r15 - r3
            float r26 = r26 / r14
            float r27 = r15 - r21
            float r27 = r27 / r22
            float r28 = r15 - r23
            float r28 = r28 / r24
            float r15 = r15 - r1
            float r15 = r15 / r11
            float r29 = r3 / r14
            float r30 = r21 / r22
            float r31 = r23 / r24
            float r1 = r1 / r11
            float r15 = r15 - r26
            float r30 = r30 - r29
            float r15 = r15 * r30
            float r1 = r1 - r29
            float r27 = r27 - r26
            float r11 = r1 * r27
            float r15 = r15 - r11
            float r28 = r28 - r26
            float r28 = r28 * r30
            float r31 = r31 - r29
            float r27 = r27 * r31
            float r28 = r28 - r27
            float r15 = r15 / r28
            float r31 = r31 * r15
            float r1 = r1 - r31
            float r1 = r1 / r30
            float r11 = r33 - r1
            float r11 = r11 - r15
            float r26 = r11 / r14
            float r27 = r1 / r22
            float r28 = r15 / r24
            float r29 = r26 * r3
            float r3 = r33 - r3
            float r3 = r3 - r14
            float r3 = r3 * r26
            float r14 = r27 * r21
            float r21 = r33 - r21
            float r21 = r21 - r22
            float r21 = r21 * r27
            float r22 = r28 * r23
            float r23 = r33 - r23
            float r23 = r23 - r24
            float r23 = r23 * r28
            float[] r12 = new float[r12]
            r12[r41] = r29
            r12[r10] = r11
            r12[r17] = r3
            r12[r18] = r14
            r12[r19] = r1
            r12[r20] = r21
            r12[r13] = r22
            r12[r16] = r15
            r12[r25] = r23
            r0.f8630 = r12
            goto L134
        L12b:
            r41 = r11
            r33 = 1065353216(0x3f800000, float:1.0)
            int r1 = r3.length
            if (r1 != r12) goto L267
            r0.f8630 = r3
        L134:
            float[] r1 = r0.f8630
            float[] r1 = p000.ln0.m3607(r1)
            r0.f8631 = r1
            float r1 = p000.j81.m2896(r9)
            float[] r3 = p000.C0550mi.f7136
            float[] r3 = p000.C0550mi.f7137
            float r3 = p000.j81.m2896(r3)
            float r1 = r1 / r3
            r3 = 1063675494(0x3f666666, float:0.9)
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 <= 0) goto L1e4
            float[] r1 = p000.C0550mi.f7136
            r11 = r9[r41]
            r12 = r1[r41]
            float r11 = r11 - r12
            r14 = r9[r10]
            r15 = r1[r10]
            float r14 = r14 - r15
            r16 = r9[r17]
            r21 = r1[r17]
            float r16 = r16 - r21
            r22 = r9[r18]
            r23 = r1[r18]
            float r22 = r22 - r23
            r24 = r9[r19]
            r25 = r1[r19]
            float r24 = r24 - r25
            r26 = r9[r20]
            r1 = r1[r20]
            float r26 = r26 - r1
            r34 = 0
            float[] r3 = new float[r13]
            r3[r41] = r11
            r3[r10] = r14
            r3[r17] = r16
            r3[r18] = r22
            r3[r19] = r24
            r3[r20] = r26
            r11 = r3[r41]
            r14 = r3[r10]
            float r16 = r12 - r25
            float r22 = r15 - r1
            float r22 = r22 * r11
            float r16 = r16 * r14
            float r22 = r22 - r16
            int r16 = (r22 > r34 ? 1 : (r22 == r34 ? 0 : -1))
            if (r16 < 0) goto L1e6
            float r16 = r12 - r21
            float r22 = r15 - r23
            float r16 = r16 * r14
            float r22 = r22 * r11
            float r16 = r16 - r22
            int r11 = (r16 > r34 ? 1 : (r16 == r34 ? 0 : -1))
            if (r11 >= 0) goto L1a5
            goto L1e6
        L1a5:
            r11 = r3[r17]
            r14 = r3[r18]
            float r16 = r21 - r12
            float r17 = r23 - r15
            float r17 = r17 * r11
            float r16 = r16 * r14
            float r17 = r17 - r16
            int r16 = (r17 > r34 ? 1 : (r17 == r34 ? 0 : -1))
            if (r16 < 0) goto L1e6
            float r16 = r21 - r25
            float r17 = r23 - r1
            float r16 = r16 * r14
            float r17 = r17 * r11
            float r16 = r16 - r17
            int r11 = (r16 > r34 ? 1 : (r16 == r34 ? 0 : -1))
            if (r11 >= 0) goto L1c6
            goto L1e6
        L1c6:
            r11 = r3[r19]
            r3 = r3[r20]
            float r14 = r25 - r21
            float r16 = r1 - r23
            float r16 = r16 * r11
            float r14 = r14 * r3
            float r16 = r16 - r14
            int r14 = (r16 > r34 ? 1 : (r16 == r34 ? 0 : -1))
            if (r14 < 0) goto L1e6
            float r25 = r25 - r12
            float r1 = r1 - r15
            float r25 = r25 * r3
            float r1 = r1 * r11
            float r25 = r25 - r1
            int r1 = (r25 > r34 ? 1 : (r25 == r34 ? 0 : -1))
            if (r1 < 0) goto L1e6
            goto L1e8
        L1e4:
            r34 = 0
        L1e6:
            int r1 = (r6 > r34 ? 1 : (r6 == r34 ? 0 : -1))
        L1e8:
            if (r8 != 0) goto L1ec
            goto L264
        L1ec:
            float[] r1 = p000.C0550mi.f7136
            if (r9 != r1) goto L1f1
            goto L213
        L1f1:
            r3 = r41
        L1f3:
            if (r3 >= r13) goto L213
            r8 = r9[r3]
            r11 = r1[r3]
            int r8 = java.lang.Float.compare(r8, r11)
            if (r8 == 0) goto L210
            r8 = r9[r3]
            r11 = r1[r3]
            float r8 = r8 - r11
            float r8 = java.lang.Math.abs(r8)
            r11 = 981668463(0x3a83126f, float:0.001)
            int r8 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r8 <= 0) goto L210
            goto L262
        L210:
            int r3 = r3 + 1
            goto L1f3
        L213:
            nb2 r1 = p000.AbstractC0782s1.f9647
            boolean r1 = p000.ln0.m3634(r2, r1)
            if (r1 != 0) goto L21c
            goto L262
        L21c:
            int r1 = (r6 > r34 ? 1 : (r6 == r34 ? 0 : -1))
            if (r1 != 0) goto L262
            int r1 = (r7 > r33 ? 1 : (r7 == r33 ? 0 : -1))
            if (r1 != 0) goto L262
            float[] r1 = p000.C0550mi.f7136
            po1 r1 = p000.C0550mi.f7140
            r2 = 0
        L22a:
            r6 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r6 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r6 > 0) goto L264
            du r6 = r1.f8632
            double r7 = r4.mo1800(r2)
            double r11 = r6.mo1800(r2)
            double r7 = r7 - r11
            double r6 = java.lang.Math.abs(r7)
            r8 = 4562254508917369340(0x3f50624dd2f1a9fc, double:0.001)
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 > 0) goto L262
            du r6 = r1.f8635
            double r11 = r5.mo1800(r2)
            double r6 = r6.mo1800(r2)
            double r11 = r11 - r6
            double r6 = java.lang.Math.abs(r11)
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 > 0) goto L262
            r6 = 4571171282956062736(0x3f70101010101010, double:0.00392156862745098)
            double r2 = r2 + r6
            goto L22a
        L262:
            r10 = r41
        L264:
            r0.f8638 = r10
            return
        L267:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            int r1 = r3.length
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Transform must have 9 entries! Has "
            r2.<init>(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            throw r0
        L27c:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Invalid range: min="
            r1.<init>(r2)
            r1.append(r6)
            java.lang.String r2 = ", max="
            r1.append(r2)
            r1.append(r7)
            java.lang.String r2 = "; min must be strictly < max"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    @Override // p000.AbstractC0432ji
    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 == 0) goto L67
            java.lang.Class<po1> r2 = p000.po1.class
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L10
            goto L67
        L10:
            boolean r2 = super.equals(r5)
            if (r2 != 0) goto L17
            return r1
        L17:
            po1 r5 = (p000.po1) r5
            float r2 = r5.f8626
            float r3 = r4.f8626
            int r2 = java.lang.Float.compare(r2, r3)
            if (r2 == 0) goto L24
            return r1
        L24:
            float r2 = r5.f8627
            float r3 = r4.f8627
            int r2 = java.lang.Float.compare(r2, r3)
            if (r2 == 0) goto L2f
            return r1
        L2f:
            nb2 r2 = r4.f8625
            nb2 r3 = r5.f8625
            boolean r2 = p000.ln0.m3626(r2, r3)
            if (r2 != 0) goto L3a
            return r1
        L3a:
            float[] r2 = r4.f8629
            float[] r3 = r5.f8629
            boolean r2 = java.util.Arrays.equals(r2, r3)
            if (r2 != 0) goto L45
            return r1
        L45:
            q52 r2 = r5.f8628
            q52 r3 = r4.f8628
            if (r3 == 0) goto L50
            boolean r4 = p000.ln0.m3626(r3, r2)
            return r4
        L50:
            if (r2 != 0) goto L53
            return r0
        L53:
            du r0 = r4.f8632
            du r2 = r5.f8632
            boolean r0 = p000.ln0.m3626(r0, r2)
            if (r0 != 0) goto L5e
            return r1
        L5e:
            du r4 = r4.f8635
            du r5 = r5.f8635
            boolean r4 = p000.ln0.m3626(r4, r5)
            return r4
        L67:
            return r1
    }

    @Override // p000.AbstractC0432ji
    public final int hashCode() {
            r5 = this;
            int r0 = super.hashCode()
            int r0 = r0 * 31
            nb2 r1 = r5.f8625
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            float[] r0 = r5.f8629
            int r0 = java.util.Arrays.hashCode(r0)
            int r0 = r0 + r1
            int r0 = r0 * 31
            float r1 = r5.f8626
            r2 = 0
            int r3 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            r4 = 0
            if (r3 != 0) goto L22
            r1 = r4
            goto L26
        L22:
            int r1 = java.lang.Float.floatToIntBits(r1)
        L26:
            int r0 = r0 + r1
            int r0 = r0 * 31
            float r1 = r5.f8627
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 != 0) goto L31
            r1 = r4
            goto L35
        L31:
            int r1 = java.lang.Float.floatToIntBits(r1)
        L35:
            int r0 = r0 + r1
            int r0 = r0 * 31
            q52 r1 = r5.f8628
            if (r1 == 0) goto L40
            int r4 = r1.hashCode()
        L40:
            int r0 = r0 + r4
            if (r1 != 0) goto L56
            int r0 = r0 * 31
            du r1 = r5.f8632
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            du r5 = r5.f8635
            int r5 = r5.hashCode()
            int r5 = r5 + r1
            return r5
        L56:
            return r0
    }

    @Override // p000.AbstractC0432ji
    /* JADX INFO: renamed from: α */
    public final float mo568(int r1) {
            r0 = this;
            float r0 = r0.f8627
            return r0
    }

    @Override // p000.AbstractC0432ji
    /* JADX INFO: renamed from: β */
    public final float mo569(int r1) {
            r0 = this;
            float r0 = r0.f8626
            return r0
    }

    @Override // p000.AbstractC0432ji
    /* JADX INFO: renamed from: γ */
    public final boolean mo2959() {
            r0 = this;
            boolean r0 = r0.f8638
            return r0
    }

    @Override // p000.AbstractC0432ji
    /* JADX INFO: renamed from: δ */
    public final long mo570(float r4, float r5, float r6) {
            r3 = this;
            double r0 = (double) r4
            lo1 r4 = r3.f8637
            double r0 = r4.mo1800(r0)
            float r0 = (float) r0
            double r1 = (double) r5
            double r1 = r4.mo1800(r1)
            float r5 = (float) r1
            double r1 = (double) r6
            double r1 = r4.mo1800(r1)
            float r4 = (float) r1
            float[] r3 = r3.f8630
            int r6 = r3.length
            r1 = 9
            if (r6 >= r1) goto L1e
            r3 = 0
            return r3
        L1e:
            r6 = 0
            r6 = r3[r6]
            float r6 = r6 * r0
            r1 = 3
            r1 = r3[r1]
            float r1 = r1 * r5
            float r1 = r1 + r6
            r6 = 6
            r6 = r3[r6]
            float r6 = r6 * r4
            float r6 = r6 + r1
            r1 = 1
            r1 = r3[r1]
            float r1 = r1 * r0
            r0 = 4
            r0 = r3[r0]
            float r0 = r0 * r5
            float r0 = r0 + r1
            r5 = 7
            r3 = r3[r5]
            float r3 = r3 * r4
            float r3 = r3 + r0
            int r4 = java.lang.Float.floatToRawIntBits(r6)
            long r4 = (long) r4
            int r3 = java.lang.Float.floatToRawIntBits(r3)
            long r0 = (long) r3
            r3 = 32
            long r3 = r4 << r3
            r5 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r5 = r5 & r0
            long r3 = r3 | r5
            return r3
    }

    @Override // p000.AbstractC0432ji
    /* JADX INFO: renamed from: ε */
    public final float mo571(float r4, float r5, float r6) {
            r3 = this;
            double r0 = (double) r4
            lo1 r4 = r3.f8637
            double r0 = r4.mo1800(r0)
            float r0 = (float) r0
            double r1 = (double) r5
            double r1 = r4.mo1800(r1)
            float r5 = (float) r1
            double r1 = (double) r6
            double r1 = r4.mo1800(r1)
            float r4 = (float) r1
            r6 = 2
            float[] r3 = r3.f8630
            r6 = r3[r6]
            float r6 = r6 * r0
            r0 = 5
            r0 = r3[r0]
            float r0 = r0 * r5
            float r0 = r0 + r6
            r5 = 8
            r3 = r3[r5]
            float r3 = r3 * r4
            float r3 = r3 + r0
            return r3
    }

    @Override // p000.AbstractC0432ji
    /* JADX INFO: renamed from: ζ */
    public final long mo572(float r5, float r6, float r7, float r8, p000.AbstractC0432ji r9) {
            r4 = this;
            r0 = 0
            float[] r1 = r4.f8631
            r0 = r1[r0]
            float r0 = r0 * r5
            r2 = 3
            r2 = r1[r2]
            float r2 = r2 * r6
            float r2 = r2 + r0
            r0 = 6
            r0 = r1[r0]
            float r0 = r0 * r7
            float r0 = r0 + r2
            r2 = 1
            r2 = r1[r2]
            float r2 = r2 * r5
            r3 = 4
            r3 = r1[r3]
            float r3 = r3 * r6
            float r3 = r3 + r2
            r2 = 7
            r2 = r1[r2]
            float r2 = r2 * r7
            float r2 = r2 + r3
            r3 = 2
            r3 = r1[r3]
            float r3 = r3 * r5
            r5 = 5
            r5 = r1[r5]
            float r5 = r5 * r6
            float r5 = r5 + r3
            r6 = 8
            r6 = r1[r6]
            float r6 = r6 * r7
            float r6 = r6 + r5
            double r0 = (double) r0
            lo1 r4 = r4.f8634
            double r0 = r4.mo1800(r0)
            float r5 = (float) r0
            double r0 = (double) r2
            double r0 = r4.mo1800(r0)
            float r7 = (float) r0
            double r0 = (double) r6
            double r0 = r4.mo1800(r0)
            float r4 = (float) r0
            long r4 = p000.kn0.m3358(r5, r7, r4, r8, r9)
            return r4
    }
}
