package i;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class a0 implements i.z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f5588a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i.q0 f5589b;

    public a0(float r4, float r5, float r6) {
            r3 = this;
            r3.<init>()
            r3.f5588a = r6
            i.q0 r6 = new i.q0
            r6.<init>()
            r0 = 1065353216(0x3f800000, float:1.0)
            r6.f5748a = r0
            r1 = 4632233691727265792(0x4049000000000000, double:50.0)
            double r1 = java.lang.Math.sqrt(r1)
            r6.f5749b = r1
            r6.f5750c = r0
            r0 = 0
            int r1 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r1 >= 0) goto L22
            java.lang.String r1 = "Damping ratio must be non-negative"
            i.o0.a(r1)
        L22:
            r6.f5750c = r4
            double r1 = r6.f5749b
            double r1 = r1 * r1
            float r4 = (float) r1
            int r4 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r4 > 0) goto L31
            java.lang.String r4 = "Spring stiffness constant must be positive."
            i.o0.a(r4)
        L31:
            double r4 = (double) r5
            double r4 = java.lang.Math.sqrt(r4)
            r6.f5749b = r4
            r3.f5589b = r6
            return
    }

    @Override // i.z
    public final long b(float r33, float r34, float r35) {
            r32 = this;
            r0 = r32
            i.q0 r1 = r0.f5589b
            double r2 = r1.f5749b
            double r2 = r2 * r2
            float r2 = (float) r2
            float r1 = r1.f5750c
            float r3 = r33 - r34
            float r4 = r0.f5588a
            float r3 = r3 / r4
            float r4 = r35 / r4
            r5 = 0
            int r5 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r5 != 0) goto L1d
            r1 = 9223372036854(0x8637bd05af6, double:4.5569512622224E-311)
            goto L240
        L1d:
            double r5 = (double) r2
            double r1 = (double) r1
            double r7 = (double) r4
            double r3 = (double) r3
            r9 = 1065353216(0x3f800000, float:1.0)
            double r9 = (double) r9
            r11 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r13 = r1 * r11
            double r15 = java.lang.Math.sqrt(r5)
            double r13 = r13 * r15
            double r15 = r13 * r13
            r17 = 4616189618054758400(0x4010000000000000, double:4.0)
            double r5 = r5 * r17
            double r15 = r15 - r5
            r5 = 0
            int r17 = (r15 > r5 ? 1 : (r15 == r5 ? 0 : -1))
            if (r17 >= 0) goto L3d
            r18 = r5
            goto L41
        L3d:
            double r18 = java.lang.Math.sqrt(r15)
        L41:
            if (r17 >= 0) goto L4c
            double r15 = java.lang.Math.abs(r15)
            double r15 = java.lang.Math.sqrt(r15)
            goto L4d
        L4c:
            r15 = r5
        L4d:
            double r13 = -r13
            double r20 = r13 + r18
            r22 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            double r20 = r20 * r22
            double r15 = r15 * r22
            double r13 = r13 - r18
            double r13 = r13 * r22
            int r17 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r17 != 0) goto L66
            int r18 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r18 != 0) goto L66
            r1 = 0
            goto L240
        L66:
            if (r17 >= 0) goto L69
            double r7 = -r7
        L69:
            double r3 = java.lang.Math.abs(r3)
            r17 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r19 = (r1 > r17 ? 1 : (r1 == r17 ? 0 : -1))
            r33 = r5
            r22 = 4562254508917369340(0x3f50624dd2f1a9fc, double:0.001)
            r24 = 9218868437227405311(0x7fefffffffffffff, double:1.7976931348623157E308)
            r26 = 9218868437227405312(0x7ff0000000000000, double:Infinity)
            r28 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r19 <= 0) goto L16b
            double r1 = r20 * r3
            double r1 = r1 - r7
            double r7 = r20 - r13
            double r1 = r1 / r7
            double r3 = r3 - r1
            double r11 = r9 / r3
            double r11 = java.lang.Math.abs(r11)
            double r11 = java.lang.Math.log(r11)
            double r11 = r11 / r20
            double r15 = r9 / r1
            double r15 = java.lang.Math.abs(r15)
            double r15 = java.lang.Math.log(r15)
            r17 = r7
            double r6 = r15 / r13
            long r15 = java.lang.Double.doubleToRawLongBits(r11)
            long r15 = r15 & r28
            int r8 = (r15 > r26 ? 1 : (r15 == r26 ? 0 : -1))
            if (r8 >= 0) goto Lc0
            long r15 = java.lang.Double.doubleToRawLongBits(r6)
            long r15 = r15 & r28
            int r8 = (r15 > r26 ? 1 : (r15 == r26 ? 0 : -1))
            if (r8 >= 0) goto Lc1
            double r11 = java.lang.Math.max(r11, r6)
            goto Lc1
        Lc0:
            r11 = r6
        Lc1:
            double r6 = r3 * r20
            r15 = r6
            double r5 = -r1
            double r5 = r5 * r13
            double r6 = r15 / r5
            double r5 = java.lang.Math.log(r6)
            double r7 = r13 - r20
            double r5 = r5 / r7
            boolean r7 = java.lang.Double.isNaN(r5)
            if (r7 != 0) goto L10e
            int r7 = (r5 > r33 ? 1 : (r5 == r33 ? 0 : -1))
            if (r7 > 0) goto Lda
            goto L10e
        Lda:
            int r7 = (r5 > r33 ? 1 : (r5 == r33 ? 0 : -1))
            if (r7 <= 0) goto L100
            double r7 = r20 * r5
            double r7 = java.lang.Math.exp(r7)
            double r7 = r7 * r3
            double r5 = r5 * r13
            double r5 = java.lang.Math.exp(r5)
            double r5 = r5 * r1
            double r5 = r5 + r7
            double r5 = -r5
            int r5 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r5 >= 0) goto L100
            int r5 = (r1 > r33 ? 1 : (r1 == r33 ? 0 : -1))
            if (r5 <= 0) goto Lfc
            int r5 = (r3 > r33 ? 1 : (r3 == r33 ? 0 : -1))
            if (r5 >= 0) goto Lfc
            r5 = r33
            goto Lfd
        Lfc:
            r5 = r11
        Lfd:
            double r9 = -r9
            r11 = r5
            goto L10f
        L100:
            double r5 = r1 * r13
            double r5 = r5 * r13
            double r5 = -r5
            double r7 = r15 * r20
            double r5 = r5 / r7
            double r5 = java.lang.Math.log(r5)
            double r11 = r5 / r17
            goto L10f
        L10e:
            double r9 = -r9
        L10f:
            double r5 = r20 * r11
            double r5 = java.lang.Math.exp(r5)
            double r5 = r5 * r15
            double r7 = r1 * r13
            double r17 = r13 * r11
            double r17 = java.lang.Math.exp(r17)
            double r17 = r17 * r7
            double r17 = r17 + r5
            double r5 = java.lang.Math.abs(r17)
            r17 = 4547007122018943789(0x3f1a36e2eb1c432d, double:1.0E-4)
            int r5 = (r5 > r17 ? 1 : (r5 == r17 ? 0 : -1))
            if (r5 >= 0) goto L131
            goto L239
        L131:
            r6 = 0
        L132:
            int r5 = (r24 > r22 ? 1 : (r24 == r22 ? 0 : -1))
            if (r5 <= 0) goto L239
            r5 = 100
            if (r6 >= r5) goto L239
            int r6 = r6 + 1
            double r17 = r20 * r11
            double r24 = java.lang.Math.exp(r17)
            double r24 = r24 * r3
            double r26 = r13 * r11
            double r28 = java.lang.Math.exp(r26)
            double r28 = r28 * r1
            double r28 = r28 + r24
            double r28 = r28 + r9
            double r17 = java.lang.Math.exp(r17)
            double r17 = r17 * r15
            double r24 = java.lang.Math.exp(r26)
            double r24 = r24 * r7
            double r24 = r24 + r17
            double r28 = r28 / r24
            double r17 = r11 - r28
            double r11 = r11 - r17
            double r24 = java.lang.Math.abs(r11)
            r11 = r17
            goto L132
        L16b:
            int r1 = (r1 > r17 ? 1 : (r1 == r17 ? 0 : -1))
            if (r1 >= 0) goto L183
            double r1 = r20 * r3
            double r7 = r7 - r1
            double r7 = r7 / r15
            double r3 = r3 * r3
            double r7 = r7 * r7
            double r7 = r7 + r3
            double r1 = java.lang.Math.sqrt(r7)
            double r9 = r9 / r1
            double r1 = java.lang.Math.log(r9)
            double r11 = r1 / r20
            goto L239
        L183:
            double r1 = r20 * r3
            double r7 = r7 - r1
            double r5 = r9 / r3
            double r5 = java.lang.Math.abs(r5)
            double r5 = java.lang.Math.log(r5)
            double r5 = r5 / r20
            double r13 = r9 / r7
            double r13 = java.lang.Math.abs(r13)
            double r13 = java.lang.Math.log(r13)
            r30 = r11
            r16 = r13
            r15 = 0
        L1a1:
            r11 = 6
            if (r15 >= r11) goto L1b3
            double r16 = r16 / r20
            double r11 = java.lang.Math.abs(r16)
            double r11 = java.lang.Math.log(r11)
            double r16 = r13 - r11
            int r15 = r15 + 1
            goto L1a1
        L1b3:
            double r11 = r16 / r20
            long r13 = java.lang.Double.doubleToRawLongBits(r5)
            long r13 = r13 & r28
            int r13 = (r13 > r26 ? 1 : (r13 == r26 ? 0 : -1))
            if (r13 >= 0) goto L1ce
            long r13 = java.lang.Double.doubleToRawLongBits(r11)
            long r13 = r13 & r28
            int r13 = (r13 > r26 ? 1 : (r13 == r26 ? 0 : -1))
            if (r13 >= 0) goto L1cf
            double r5 = java.lang.Math.max(r5, r11)
            goto L1cf
        L1ce:
            r5 = r11
        L1cf:
            double r11 = r1 + r7
            double r11 = -r11
            double r13 = r20 * r7
            double r11 = r11 / r13
            double r13 = r20 * r11
            double r15 = java.lang.Math.exp(r13)
            double r15 = r15 * r3
            double r17 = r7 * r11
            double r13 = java.lang.Math.exp(r13)
            double r13 = r13 * r17
            double r13 = r13 + r15
            boolean r15 = java.lang.Double.isNaN(r11)
            if (r15 != 0) goto L203
            int r15 = (r11 > r33 ? 1 : (r11 == r33 ? 0 : -1))
            if (r15 > 0) goto L1f0
            goto L203
        L1f0:
            int r11 = (r11 > r33 ? 1 : (r11 == r33 ? 0 : -1))
            if (r11 <= 0) goto L205
            double r11 = -r13
            int r11 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r11 >= 0) goto L205
            int r11 = (r7 > r33 ? 1 : (r7 == r33 ? 0 : -1))
            if (r11 >= 0) goto L203
            int r11 = (r3 > r33 ? 1 : (r3 == r33 ? 0 : -1))
            if (r11 <= 0) goto L203
            r5 = r33
        L203:
            double r9 = -r9
            goto L20b
        L205:
            double r11 = r30 / r20
            double r5 = -r11
            double r11 = r3 / r7
            double r5 = r5 - r11
        L20b:
            r11 = r5
            r6 = 0
        L20d:
            int r5 = (r24 > r22 ? 1 : (r24 == r22 ? 0 : -1))
            if (r5 <= 0) goto L239
            r5 = 100
            if (r6 >= r5) goto L239
            int r6 = r6 + 1
            double r13 = r7 * r11
            double r13 = r13 + r3
            double r15 = r20 * r11
            double r17 = java.lang.Math.exp(r15)
            double r17 = r17 * r13
            double r17 = r17 + r9
            r13 = 1
            double r13 = (double) r13
            double r13 = r13 + r15
            double r13 = r13 * r7
            double r13 = r13 + r1
            double r15 = java.lang.Math.exp(r15)
            double r15 = r15 * r13
            double r17 = r17 / r15
            double r13 = r11 - r17
            double r11 = r11 - r13
            double r24 = java.lang.Math.abs(r11)
            r11 = r13
            goto L20d
        L239:
            r1 = 4652007308841189376(0x408f400000000000, double:1000.0)
            double r11 = r11 * r1
            long r1 = (long) r11
        L240:
            r3 = 1000000(0xf4240, double:4.940656E-318)
            long r1 = r1 * r3
            return r1
    }

    @Override // i.z
    public final float c(float r3, float r4, float r5, long r6) {
            r2 = this;
            r0 = 1000000(0xf4240, double:4.940656E-318)
            long r6 = r6 / r0
            i.q0 r0 = r2.f5589b
            r0.f5748a = r4
            long r3 = r0.a(r3, r5, r6)
            r5 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r3 = r3 & r5
            int r3 = (int) r3
            float r3 = java.lang.Float.intBitsToFloat(r3)
            return r3
    }

    @Override // i.z
    public final float d(float r1, float r2, float r3) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // i.z
    public final float e(float r3, float r4, float r5, long r6) {
            r2 = this;
            r0 = 1000000(0xf4240, double:4.940656E-318)
            long r6 = r6 / r0
            i.q0 r0 = r2.f5589b
            r0.f5748a = r4
            long r3 = r0.a(r3, r5, r6)
            r5 = 32
            long r3 = r3 >> r5
            int r3 = (int) r3
            float r3 = java.lang.Float.intBitsToFloat(r3)
            return r3
    }
}
