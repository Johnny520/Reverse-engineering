package i;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class s implements i.v {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f5776g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f5777h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float f5778i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final float f5779j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final float f5780k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final float f5781l;

    public s(float r25, float r26, float r27, float r28) {
            r24 = this;
            r0 = r24
            r1 = r25
            r2 = r26
            r3 = r27
            r4 = r28
            r0.<init>()
            r0.f5776g = r1
            r0.f5777h = r2
            r0.f5778i = r3
            r0.f5779j = r4
            boolean r5 = java.lang.Float.isNaN(r1)
            r6 = 0
            r7 = 1
            if (r5 != 0) goto L31
            boolean r5 = java.lang.Float.isNaN(r2)
            if (r5 != 0) goto L31
            boolean r5 = java.lang.Float.isNaN(r3)
            if (r5 != 0) goto L31
            boolean r5 = java.lang.Float.isNaN(r4)
            if (r5 != 0) goto L31
            r5 = r7
            goto L32
        L31:
            r5 = r6
        L32:
            if (r5 != 0) goto L5e
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r8 = "Parameters to CubicBezierEasing cannot be NaN. Actual parameters are: "
            r5.<init>(r8)
            r5.append(r1)
            java.lang.String r1 = ", "
            r5.append(r1)
            r5.append(r2)
            r5.append(r1)
            r5.append(r3)
            r5.append(r1)
            r5.append(r4)
            r1 = 46
            r5.append(r1)
            java.lang.String r1 = r5.toString()
            i.o0.a(r1)
        L5e:
            r1 = 5
            float[] r1 = new float[r1]
            r3 = 0
            float r5 = r2 - r3
            r8 = 1077936128(0x40400000, float:3.0)
            float r5 = r5 * r8
            float r9 = r4 - r2
            float r9 = r9 * r8
            r10 = 1065353216(0x3f800000, float:1.0)
            float r11 = r10 - r4
            float r11 = r11 * r8
            double r12 = (double) r5
            double r14 = (double) r9
            r25 = r8
            r27 = r9
            double r8 = (double) r11
            r16 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r18 = r14 * r16
            double r20 = r12 - r18
            double r20 = r20 + r8
            r22 = 0
            int r22 = (r20 > r22 ? 1 : (r20 == r22 ? 0 : -1))
            if (r22 != 0) goto L98
            int r7 = (r14 > r8 ? 1 : (r14 == r8 ? 0 : -1))
            if (r7 != 0) goto L8a
            r7 = r6
            goto Lcd
        L8a:
            double r12 = r18 - r8
            double r8 = r8 * r16
            double r18 = r18 - r8
            double r12 = r12 / r18
            float r7 = (float) r12
            int r7 = f1.c0.B(r7, r1, r6)
            goto Lcd
        L98:
            double r16 = r14 * r14
            double r8 = r8 * r12
            double r16 = r16 - r8
            double r8 = java.lang.Math.sqrt(r16)
            double r8 = -r8
            double r12 = -r12
            double r12 = r12 + r14
            double r14 = r8 + r12
            double r14 = -r14
            double r14 = r14 / r20
            float r14 = (float) r14
            int r14 = f1.c0.B(r14, r1, r6)
            double r8 = r8 - r12
            double r8 = r8 / r20
            float r8 = (float) r8
            int r8 = f1.c0.B(r8, r1, r14)
            int r8 = r8 + r14
            if (r8 <= r7) goto Lc5
            r9 = r1[r6]
            r12 = r1[r7]
            int r13 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1))
            if (r13 <= 0) goto Lc7
            r1[r6] = r12
            r1[r7] = r9
        Lc5:
            r7 = r8
            goto Lcd
        Lc7:
            int r7 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1))
            if (r7 != 0) goto Lc5
            int r7 = r8 + (-1)
        Lcd:
            float r9 = r27 - r5
            r8 = 1073741824(0x40000000, float:2.0)
            float r9 = r9 * r8
            float r11 = r11 - r27
            float r11 = r11 * r8
            float r12 = -r9
            float r11 = r11 - r9
            float r12 = r12 / r11
            int r9 = f1.c0.B(r12, r1, r7)
            int r9 = r9 + r7
            float r7 = java.lang.Math.min(r3, r10)
            float r11 = java.lang.Math.max(r3, r10)
        Le5:
            if (r6 >= r9) goto L107
            r12 = r1[r6]
            float r13 = r2 - r4
            float r13 = r13 * r25
            float r13 = r13 + r10
            float r13 = r13 - r3
            float r14 = r2 * r8
            float r14 = r4 - r14
            float r14 = r14 + r3
            float r14 = r14 * r25
            float r13 = r13 * r12
            float r13 = r13 + r14
            float r13 = r13 * r12
            float r13 = r13 + r5
            float r13 = r13 * r12
            float r13 = r13 + r3
            float r7 = java.lang.Math.min(r7, r13)
            float r11 = java.lang.Math.max(r11, r13)
            int r6 = r6 + 1
            goto Le5
        L107:
            int r1 = java.lang.Float.floatToRawIntBits(r7)
            long r1 = (long) r1
            int r3 = java.lang.Float.floatToRawIntBits(r11)
            long r3 = (long) r3
            r5 = 32
            long r1 = r1 << r5
            r6 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r3 = r3 & r6
            long r1 = r1 | r3
            long r3 = r1 >> r5
            int r3 = (int) r3
            float r3 = java.lang.Float.intBitsToFloat(r3)
            r0.f5780k = r3
            long r1 = r1 & r6
            int r1 = (int) r1
            float r1 = java.lang.Float.intBitsToFloat(r1)
            r0.f5781l = r1
            return
    }

    @Override // i.v
    public final float b(float r27) {
            r26 = this;
            r0 = r26
            r1 = r27
            r2 = 0
            int r3 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r3 <= 0) goto L291
            r3 = 1065353216(0x3f800000, float:1.0)
            int r4 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r4 >= 0) goto L291
            r4 = 872415232(0x34000000, float:1.1920929E-7)
            float r4 = java.lang.Math.max(r1, r4)
            float r5 = r2 - r4
            float r6 = r0.f5776g
            float r7 = r6 - r4
            float r8 = r0.f5778i
            float r9 = r8 - r4
            float r4 = r3 - r4
            double r10 = (double) r5
            double r12 = (double) r7
            r14 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r12 = r12 * r14
            double r12 = r10 - r12
            r16 = r2
            r17 = r3
            double r2 = (double) r9
            double r12 = r12 + r2
            r2 = 4613937818241073152(0x4008000000000000, double:3.0)
            double r12 = r12 * r2
            r18 = r2
            float r2 = r7 - r5
            double r2 = (double) r2
            double r2 = r2 * r18
            float r5 = -r5
            r20 = r14
            double r14 = (double) r5
            float r7 = r7 - r9
            r22 = r12
            double r12 = (double) r7
            double r12 = r12 * r18
            double r12 = r12 + r14
            double r4 = (double) r4
            double r12 = r12 + r4
            r4 = 0
            double r14 = r12 - r4
            double r14 = java.lang.Math.abs(r14)
            r24 = 4502148214488346440(0x3e7ad7f29abcaf48, double:1.0E-7)
            int r7 = (r14 > r24 ? 1 : (r14 == r24 ? 0 : -1))
            r9 = 1073741824(0x40000000, float:2.0)
            r14 = 898428346(0x358cedba, float:1.05E-6)
            r15 = 2143289344(0x7fc00000, float:NaN)
            if (r7 >= 0) goto Le9
            double r12 = r22 - r4
            double r12 = java.lang.Math.abs(r12)
            int r7 = (r12 > r24 ? 1 : (r12 == r24 ? 0 : -1))
            if (r7 >= 0) goto L95
            double r4 = r2 - r4
            double r4 = java.lang.Math.abs(r4)
            int r4 = (r4 > r24 ? 1 : (r4 == r24 ? 0 : -1))
            if (r4 >= 0) goto L73
            goto L238
        L73:
            double r4 = -r10
            double r4 = r4 / r2
            float r2 = (float) r4
            int r3 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
            if (r3 >= 0) goto L7b
            goto L7d
        L7b:
            r16 = r2
        L7d:
            int r3 = (r16 > r17 ? 1 : (r16 == r17 ? 0 : -1))
            if (r3 <= 0) goto L84
            r3 = r17
            goto L86
        L84:
            r3 = r16
        L86:
            float r2 = r3 - r2
            float r2 = java.lang.Math.abs(r2)
            int r2 = (r2 > r14 ? 1 : (r2 == r14 ? 0 : -1))
            if (r2 <= 0) goto L92
            goto L238
        L92:
            r15 = r3
            goto L238
        L95:
            double r4 = r2 * r2
            r12 = 4616189618054758400(0x4010000000000000, double:4.0)
            double r12 = r12 * r22
            double r12 = r12 * r10
            double r4 = r4 - r12
            double r4 = java.lang.Math.sqrt(r4)
            double r12 = r22 * r20
            double r10 = r4 - r2
            double r10 = r10 / r12
            float r7 = (float) r10
            int r10 = (r7 > r16 ? 1 : (r7 == r16 ? 0 : -1))
            if (r10 >= 0) goto Lae
            r10 = r16
            goto Laf
        Lae:
            r10 = r7
        Laf:
            int r11 = (r10 > r17 ? 1 : (r10 == r17 ? 0 : -1))
            if (r11 <= 0) goto Lb5
            r10 = r17
        Lb5:
            float r7 = r10 - r7
            float r7 = java.lang.Math.abs(r7)
            int r7 = (r7 > r14 ? 1 : (r7 == r14 ? 0 : -1))
            if (r7 <= 0) goto Lc0
            r10 = r15
        Lc0:
            boolean r7 = java.lang.Float.isNaN(r10)
            if (r7 != 0) goto Lc9
            r15 = r10
            goto L238
        Lc9:
            double r2 = -r2
            double r2 = r2 - r4
            double r2 = r2 / r12
            float r2 = (float) r2
            int r3 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
            if (r3 >= 0) goto Ld2
            goto Ld4
        Ld2:
            r16 = r2
        Ld4:
            int r3 = (r16 > r17 ? 1 : (r16 == r17 ? 0 : -1))
            if (r3 <= 0) goto Ldb
            r3 = r17
            goto Ldd
        Ldb:
            r3 = r16
        Ldd:
            float r2 = r3 - r2
            float r2 = java.lang.Math.abs(r2)
            int r2 = (r2 > r14 ? 1 : (r2 == r14 ? 0 : -1))
            if (r2 <= 0) goto L92
            goto L238
        Le9:
            double r22 = r22 / r12
            double r2 = r2 / r12
            double r10 = r10 / r12
            double r12 = r2 * r18
            double r24 = r22 * r22
            double r12 = r12 - r24
            r24 = 4621256167635550208(0x4022000000000000, double:9.0)
            double r12 = r12 / r24
            double r20 = r20 * r22
            double r20 = r20 * r22
            double r20 = r20 * r22
            double r24 = r24 * r22
            double r24 = r24 * r2
            double r20 = r20 - r24
            r2 = 4628293042053316608(0x403b000000000000, double:27.0)
            double r10 = r10 * r2
            double r10 = r10 + r20
            r2 = 4632796641680687104(0x404b000000000000, double:54.0)
            double r10 = r10 / r2
            double r2 = r10 * r10
            double r20 = r12 * r12
            double r12 = r12 * r20
            double r2 = r2 + r12
            r20 = r4
            double r4 = r22 / r18
            int r7 = (r2 > r20 ? 1 : (r2 == r20 ? 0 : -1))
            if (r7 >= 0) goto L1bf
            double r2 = -r12
            double r2 = java.lang.Math.sqrt(r2)
            double r10 = -r10
            double r10 = r10 / r2
            r12 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            int r7 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r7 >= 0) goto L128
            r10 = r12
        L128:
            r12 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r7 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r7 <= 0) goto L12f
            r10 = r12
        L12f:
            double r10 = java.lang.Math.acos(r10)
            float r2 = (float) r2
            float r2 = fb.v0.o(r2)
            float r2 = r2 * r9
            double r2 = (double) r2
            double r12 = r10 / r18
            double r12 = java.lang.Math.cos(r12)
            double r12 = r12 * r2
            double r12 = r12 - r4
            float r7 = (float) r12
            int r12 = (r7 > r16 ? 1 : (r7 == r16 ? 0 : -1))
            if (r12 >= 0) goto L14a
            r12 = r16
            goto L14b
        L14a:
            r12 = r7
        L14b:
            int r13 = (r12 > r17 ? 1 : (r12 == r17 ? 0 : -1))
            if (r13 <= 0) goto L151
            r12 = r17
        L151:
            float r7 = r12 - r7
            float r7 = java.lang.Math.abs(r7)
            int r7 = (r7 > r14 ? 1 : (r7 == r14 ? 0 : -1))
            if (r7 <= 0) goto L15c
            r12 = r15
        L15c:
            boolean r7 = java.lang.Float.isNaN(r12)
            if (r7 != 0) goto L165
        L162:
            r15 = r12
            goto L238
        L165:
            r12 = 4618760256179416344(0x401921fb54442d18, double:6.283185307179586)
            double r12 = r12 + r10
            double r12 = r12 / r18
            double r12 = java.lang.Math.cos(r12)
            double r12 = r12 * r2
            double r12 = r12 - r4
            float r7 = (float) r12
            int r12 = (r7 > r16 ? 1 : (r7 == r16 ? 0 : -1))
            if (r12 >= 0) goto L17b
            r12 = r16
            goto L17c
        L17b:
            r12 = r7
        L17c:
            int r13 = (r12 > r17 ? 1 : (r12 == r17 ? 0 : -1))
            if (r13 <= 0) goto L182
            r12 = r17
        L182:
            float r7 = r12 - r7
            float r7 = java.lang.Math.abs(r7)
            int r7 = (r7 > r14 ? 1 : (r7 == r14 ? 0 : -1))
            if (r7 <= 0) goto L18d
            r12 = r15
        L18d:
            boolean r7 = java.lang.Float.isNaN(r12)
            if (r7 != 0) goto L194
            goto L162
        L194:
            r12 = 4623263855806786840(0x402921fb54442d18, double:12.566370614359172)
            double r10 = r10 + r12
            double r10 = r10 / r18
            double r10 = java.lang.Math.cos(r10)
            double r10 = r10 * r2
            double r10 = r10 - r4
            float r2 = (float) r10
            int r3 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
            if (r3 >= 0) goto L1a8
            goto L1aa
        L1a8:
            r16 = r2
        L1aa:
            int r3 = (r16 > r17 ? 1 : (r16 == r17 ? 0 : -1))
            if (r3 <= 0) goto L1b1
            r3 = r17
            goto L1b3
        L1b1:
            r3 = r16
        L1b3:
            float r2 = r3 - r2
            float r2 = java.lang.Math.abs(r2)
            int r2 = (r2 > r14 ? 1 : (r2 == r14 ? 0 : -1))
            if (r2 <= 0) goto L92
            goto L238
        L1bf:
            if (r7 != 0) goto L209
            float r2 = (float) r10
            float r2 = fb.v0.o(r2)
            float r2 = -r2
            float r3 = r2 * r9
            float r4 = (float) r4
            float r3 = r3 - r4
            int r5 = (r3 > r16 ? 1 : (r3 == r16 ? 0 : -1))
            if (r5 >= 0) goto L1d2
            r5 = r16
            goto L1d3
        L1d2:
            r5 = r3
        L1d3:
            int r7 = (r5 > r17 ? 1 : (r5 == r17 ? 0 : -1))
            if (r7 <= 0) goto L1d9
            r5 = r17
        L1d9:
            float r3 = r5 - r3
            float r3 = java.lang.Math.abs(r3)
            int r3 = (r3 > r14 ? 1 : (r3 == r14 ? 0 : -1))
            if (r3 <= 0) goto L1e4
            r5 = r15
        L1e4:
            boolean r3 = java.lang.Float.isNaN(r5)
            if (r3 != 0) goto L1ec
            r15 = r5
            goto L238
        L1ec:
            float r2 = -r2
            float r2 = r2 - r4
            int r3 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
            if (r3 >= 0) goto L1f3
            goto L1f5
        L1f3:
            r16 = r2
        L1f5:
            int r3 = (r16 > r17 ? 1 : (r16 == r17 ? 0 : -1))
            if (r3 <= 0) goto L1fc
            r3 = r17
            goto L1fe
        L1fc:
            r3 = r16
        L1fe:
            float r2 = r3 - r2
            float r2 = java.lang.Math.abs(r2)
            int r2 = (r2 > r14 ? 1 : (r2 == r14 ? 0 : -1))
            if (r2 <= 0) goto L92
            goto L238
        L209:
            double r2 = java.lang.Math.sqrt(r2)
            double r12 = -r10
            double r12 = r12 + r2
            float r7 = (float) r12
            float r7 = fb.v0.o(r7)
            double r10 = r10 + r2
            float r2 = (float) r10
            float r2 = fb.v0.o(r2)
            float r7 = r7 - r2
            double r2 = (double) r7
            double r2 = r2 - r4
            float r2 = (float) r2
            int r3 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
            if (r3 >= 0) goto L223
            goto L225
        L223:
            r16 = r2
        L225:
            int r3 = (r16 > r17 ? 1 : (r16 == r17 ? 0 : -1))
            if (r3 <= 0) goto L22c
            r3 = r17
            goto L22e
        L22c:
            r3 = r16
        L22e:
            float r2 = r3 - r2
            float r2 = java.lang.Math.abs(r2)
            int r2 = (r2 > r14 ? 1 : (r2 == r14 ? 0 : -1))
            if (r2 <= 0) goto L92
        L238:
            boolean r2 = java.lang.Float.isNaN(r15)
            float r3 = r0.f5779j
            float r4 = r0.f5777h
            if (r2 != 0) goto L261
            r1 = 1051372203(0x3eaaaaab, float:0.33333334)
            float r2 = r4 - r3
            float r2 = r2 + r1
            float r9 = r9 * r4
            float r3 = r3 - r9
            float r2 = r2 * r15
            float r2 = r2 + r3
            float r2 = r2 * r15
            float r2 = r2 + r4
            r1 = 1077936128(0x40400000, float:3.0)
            float r2 = r2 * r1
            float r2 = r2 * r15
            float r1 = r0.f5780k
            int r3 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r3 >= 0) goto L259
            r2 = r1
        L259:
            float r1 = r0.f5781l
            int r3 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r3 <= 0) goto L260
            return r1
        L260:
            return r2
        L261:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r7 = "The cubic curve with parameters ("
            r5.<init>(r7)
            r5.append(r6)
            java.lang.String r6 = ", "
            r5.append(r6)
            r5.append(r4)
            r5.append(r6)
            r5.append(r8)
            r5.append(r6)
            r5.append(r3)
            java.lang.String r3 = ") has no solution at "
            r5.append(r3)
            r5.append(r1)
            java.lang.String r1 = r5.toString()
            r2.<init>(r1)
            throw r2
        L291:
            return r1
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof i.s
            if (r0 == 0) goto L28
            i.s r3 = (i.s) r3
            float r0 = r3.f5776g
            float r1 = r2.f5776g
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L28
            float r0 = r2.f5777h
            float r1 = r3.f5777h
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L28
            float r0 = r2.f5778i
            float r1 = r3.f5778i
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L28
            float r0 = r2.f5779j
            float r3 = r3.f5779j
            int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r3 != 0) goto L28
            r3 = 1
            return r3
        L28:
            r3 = 0
            return r3
    }

    public final int hashCode() {
            r3 = this;
            float r0 = r3.f5776g
            int r0 = java.lang.Float.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            float r2 = r3.f5777h
            int r0 = eh.a.d(r2, r0, r1)
            float r2 = r3.f5778i
            int r0 = eh.a.d(r2, r0, r1)
            float r1 = r3.f5779j
            int r1 = java.lang.Float.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "CubicBezierEasing(a="
            r0.<init>(r1)
            float r1 = r3.f5776g
            r0.append(r1)
            java.lang.String r1 = ", b="
            r0.append(r1)
            float r1 = r3.f5777h
            r0.append(r1)
            java.lang.String r1 = ", c="
            r0.append(r1)
            float r1 = r3.f5778i
            r0.append(r1)
            java.lang.String r1 = ", d="
            r0.append(r1)
            float r1 = r3.f5779j
            r2 = 41
            java.lang.String r0 = eh.a.o(r0, r1, r2)
            return r0
    }
}
