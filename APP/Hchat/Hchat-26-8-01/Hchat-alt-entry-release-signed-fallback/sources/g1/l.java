package g1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class l extends g1.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4106d;

    public /* synthetic */ l(int r1, int r2, long r3, java.lang.String r5) {
            r0 = this;
            r0.f4106d = r2
            r0.<init>(r1, r5, r3)
            return
    }

    @Override // g1.c
    public final float a(int r2) {
            r1 = this;
            int r0 = r1.f4106d
            switch(r0) {
                case 0: goto L8;
                default: goto L5;
            }
        L5:
            r2 = 1073741824(0x40000000, float:2.0)
            return r2
        L8:
            if (r2 != 0) goto Ld
            r2 = 1120403456(0x42c80000, float:100.0)
            goto Lf
        Ld:
            r2 = 1124073472(0x43000000, float:128.0)
        Lf:
            return r2
    }

    @Override // g1.c
    public final float b(int r2) {
            r1 = this;
            int r0 = r1.f4106d
            switch(r0) {
                case 0: goto L8;
                default: goto L5;
            }
        L5:
            r2 = -1073741824(0xffffffffc0000000, float:-2.0)
            return r2
        L8:
            if (r2 != 0) goto Lc
            r2 = 0
            goto Le
        Lc:
            r2 = -1023410176(0xffffffffc3000000, float:-128.0)
        Le:
            return r2
    }

    @Override // g1.c
    public final long d(float r5, float r6, float r7) {
            r4 = this;
            int r7 = r4.f4106d
            switch(r7) {
                case 0: goto L33;
                default: goto L5;
            }
        L5:
            r7 = -1073741824(0xffffffffc0000000, float:-2.0)
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 >= 0) goto Lc
            r5 = r7
        Lc:
            r0 = 1073741824(0x40000000, float:2.0)
            int r1 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r1 <= 0) goto L13
            r5 = r0
        L13:
            int r1 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r1 >= 0) goto L18
            r6 = r7
        L18:
            int r7 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r7 <= 0) goto L1d
            goto L1e
        L1d:
            r0 = r6
        L1e:
            int r5 = java.lang.Float.floatToRawIntBits(r5)
            long r5 = (long) r5
            int r7 = java.lang.Float.floatToRawIntBits(r0)
            long r0 = (long) r7
            r7 = 32
            long r5 = r5 << r7
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r2
            long r5 = r5 | r0
            return r5
        L33:
            r7 = 0
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 >= 0) goto L39
            r5 = r7
        L39:
            r7 = 1120403456(0x42c80000, float:100.0)
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 <= 0) goto L40
            r5 = r7
        L40:
            r7 = -1023410176(0xffffffffc3000000, float:-128.0)
            int r0 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r0 >= 0) goto L47
            r6 = r7
        L47:
            r7 = 1124073472(0x43000000, float:128.0)
            int r0 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r0 <= 0) goto L4e
            r6 = r7
        L4e:
            r7 = 1098907648(0x41800000, float:16.0)
            float r5 = r5 + r7
            r7 = 1122500608(0x42e80000, float:116.0)
            float r5 = r5 / r7
            r7 = 990057071(0x3b03126f, float:0.002)
            float r6 = r6 * r7
            float r6 = r6 + r5
            r7 = 1045683377(0x3e53dcb1, float:0.20689656)
            int r0 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            r1 = 1041055179(0x3e0d3dcb, float:0.13793103)
            r2 = 1040416807(0x3e038027, float:0.12841855)
            if (r0 <= 0) goto L6a
            float r0 = r6 * r6
            float r0 = r0 * r6
            goto L6d
        L6a:
            float r6 = r6 - r1
            float r0 = r6 * r2
        L6d:
            int r6 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r6 <= 0) goto L75
            float r6 = r5 * r5
            float r6 = r6 * r5
            goto L78
        L75:
            float r5 = r5 - r1
            float r6 = r5 * r2
        L78:
            r5 = 0
            float[] r7 = g1.k.f4105e
            r5 = r7[r5]
            float r0 = r0 * r5
            r5 = 1
            r5 = r7[r5]
            float r6 = r6 * r5
            int r5 = java.lang.Float.floatToRawIntBits(r0)
            long r0 = (long) r5
            int r5 = java.lang.Float.floatToRawIntBits(r6)
            long r5 = (long) r5
            r7 = 32
            long r0 = r0 << r7
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r5 = r5 & r2
            long r5 = r5 | r0
            return r5
    }

    @Override // g1.c
    public final float e(float r2, float r3, float r4) {
            r1 = this;
            int r3 = r1.f4106d
            switch(r3) {
                case 0: goto L14;
                default: goto L5;
            }
        L5:
            r2 = -1073741824(0xffffffffc0000000, float:-2.0)
            int r3 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r3 >= 0) goto Lc
            r4 = r2
        Lc:
            r2 = 1073741824(0x40000000, float:2.0)
            int r3 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r3 <= 0) goto L13
            r4 = r2
        L13:
            return r4
        L14:
            r3 = 0
            int r0 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r0 >= 0) goto L1a
            r2 = r3
        L1a:
            r3 = 1120403456(0x42c80000, float:100.0)
            int r0 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r0 <= 0) goto L21
            r2 = r3
        L21:
            r3 = -1023410176(0xffffffffc3000000, float:-128.0)
            int r0 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r0 >= 0) goto L28
            r4 = r3
        L28:
            r3 = 1124073472(0x43000000, float:128.0)
            int r0 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r0 <= 0) goto L2f
            r4 = r3
        L2f:
            r3 = 1098907648(0x41800000, float:16.0)
            float r2 = r2 + r3
            r3 = 1122500608(0x42e80000, float:116.0)
            float r2 = r2 / r3
            r3 = 1000593162(0x3ba3d70a, float:0.005)
            float r4 = r4 * r3
            float r2 = r2 - r4
            r3 = 1045683377(0x3e53dcb1, float:0.20689656)
            int r3 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r3 <= 0) goto L45
            float r3 = r2 * r2
            float r3 = r3 * r2
            goto L4d
        L45:
            r3 = 1041055179(0x3e0d3dcb, float:0.13793103)
            float r2 = r2 - r3
            r3 = 1040416807(0x3e038027, float:0.12841855)
            float r3 = r3 * r2
        L4d:
            float[] r2 = g1.k.f4105e
            r4 = 2
            r2 = r2[r4]
            float r3 = r3 * r2
            return r3
    }

    @Override // g1.c
    public final long f(float r7, float r8, float r9, float r10, g1.c r11) {
            r6 = this;
            int r0 = r6.f4106d
            switch(r0) {
                case 0: goto L2d;
                default: goto L5;
            }
        L5:
            r0 = -1073741824(0xffffffffc0000000, float:-2.0)
            int r1 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r1 >= 0) goto Lc
            r7 = r0
        Lc:
            r1 = 1073741824(0x40000000, float:2.0)
            int r2 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r2 <= 0) goto L13
            r7 = r1
        L13:
            int r2 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r2 >= 0) goto L18
            r8 = r0
        L18:
            int r2 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r2 <= 0) goto L1d
            r8 = r1
        L1d:
            int r2 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r2 >= 0) goto L22
            r9 = r0
        L22:
            int r0 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r0 <= 0) goto L27
            goto L28
        L27:
            r1 = r9
        L28:
            long r7 = f1.c0.b(r7, r8, r1, r10, r11)
            return r7
        L2d:
            r0 = 0
            float[] r1 = g1.k.f4105e
            r0 = r1[r0]
            float r7 = r7 / r0
            r0 = 1
            r0 = r1[r0]
            float r8 = r8 / r0
            r0 = 2
            r0 = r1[r0]
            float r9 = r9 / r0
            r0 = 1007753895(0x3c111aa7, float:0.008856452)
            int r1 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            r2 = 1041055179(0x3e0d3dcb, float:0.13793103)
            r3 = 1090072424(0x40f92f68, float:7.787037)
            if (r1 <= 0) goto L4f
            double r4 = (double) r7
            double r4 = java.lang.Math.cbrt(r4)
            float r7 = (float) r4
            goto L51
        L4f:
            float r7 = r7 * r3
            float r7 = r7 + r2
        L51:
            int r1 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r1 <= 0) goto L5c
            double r4 = (double) r8
            double r4 = java.lang.Math.cbrt(r4)
            float r8 = (float) r4
            goto L5e
        L5c:
            float r8 = r8 * r3
            float r8 = r8 + r2
        L5e:
            int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r0 <= 0) goto L69
            double r0 = (double) r9
            double r0 = java.lang.Math.cbrt(r0)
            float r9 = (float) r0
            goto L6b
        L69:
            float r9 = r9 * r3
            float r9 = r9 + r2
        L6b:
            r0 = 1122500608(0x42e80000, float:116.0)
            float r0 = r0 * r8
            r1 = 1098907648(0x41800000, float:16.0)
            float r0 = r0 - r1
            r1 = 1140457472(0x43fa0000, float:500.0)
            float r7 = r7 - r8
            float r7 = r7 * r1
            r1 = 1128792064(0x43480000, float:200.0)
            float r8 = r8 - r9
            float r8 = r8 * r1
            r9 = 0
            int r1 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r1 >= 0) goto L7f
            r0 = r9
        L7f:
            r9 = 1120403456(0x42c80000, float:100.0)
            int r1 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r1 <= 0) goto L86
            r0 = r9
        L86:
            r9 = -1023410176(0xffffffffc3000000, float:-128.0)
            int r1 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r1 >= 0) goto L8d
            r7 = r9
        L8d:
            r1 = 1124073472(0x43000000, float:128.0)
            int r2 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r2 <= 0) goto L94
            r7 = r1
        L94:
            int r2 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r2 >= 0) goto L99
            r8 = r9
        L99:
            int r9 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r9 <= 0) goto L9e
            goto L9f
        L9e:
            r1 = r8
        L9f:
            long r7 = f1.c0.b(r0, r7, r1, r10, r11)
            return r7
    }
}
