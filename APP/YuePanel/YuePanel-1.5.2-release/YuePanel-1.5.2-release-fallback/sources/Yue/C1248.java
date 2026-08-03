package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۥۤ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C1248 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final double f3786 = 95.047d;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final double f3787 = 100.0d;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final double f3788 = 108.883d;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final double f3789 = 0.008856d;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final double f3790 = 903.3d;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final int f3791 = 10;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final int f3792 = 1;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final java.lang.ThreadLocal<double[]> f3793 = null;

    /* JADX INFO: renamed from: Yue.ۥ۟ۥۤ۟$ۥ, reason: contains not printable characters */
    @Yue.InterfaceC5336(26)
    public static class C1249 {
        public C1249() {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static android.graphics.Color m6669(android.graphics.Color r7, android.graphics.Color r8) {
                android.graphics.ColorSpace$Model r0 = r7.getModel()
                android.graphics.ColorSpace$Model r1 = r8.getModel()
                boolean r0 = java.util.Objects.equals(r0, r1)
                if (r0 == 0) goto L62
                android.graphics.ColorSpace r0 = r8.getColorSpace()
                android.graphics.ColorSpace r1 = r7.getColorSpace()
                boolean r0 = java.util.Objects.equals(r0, r1)
                if (r0 == 0) goto L1d
                goto L25
            L1d:
                android.graphics.ColorSpace r0 = r8.getColorSpace()
                android.graphics.Color r7 = r7.convert(r0)
            L25:
                float[] r0 = r7.getComponents()
                float[] r1 = r8.getComponents()
                float r7 = r7.alpha()
                float r2 = r8.alpha()
                r3 = 1065353216(0x3f800000, float:1.0)
                float r3 = r3 - r7
                float r2 = r2 * r3
                int r3 = r8.getComponentCount()
                int r3 = r3 + (-1)
                float r4 = r7 + r2
                r1[r3] = r4
                r5 = 0
                int r5 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
                if (r5 <= 0) goto L4a
                float r7 = r7 / r4
                float r2 = r2 / r4
            L4a:
                r4 = 0
            L4b:
                if (r4 >= r3) goto L59
                r5 = r0[r4]
                float r5 = r5 * r7
                r6 = r1[r4]
                float r6 = r6 * r2
                float r5 = r5 + r6
                r1[r4] = r5
                int r4 = r4 + 1
                goto L4b
            L59:
                android.graphics.ColorSpace r7 = r8.getColorSpace()
                android.graphics.Color r7 = android.graphics.Color.valueOf(r1, r7)
                return r7
            L62:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Color models must match ("
                r1.append(r2)
                android.graphics.ColorSpace$Model r7 = r7.getModel()
                r1.append(r7)
                java.lang.String r7 = " vs. "
                r1.append(r7)
                android.graphics.ColorSpace$Model r7 = r8.getModel()
                r1.append(r7)
                java.lang.String r7 = ")"
                r1.append(r7)
                java.lang.String r7 = r1.toString()
                r0.<init>(r7)
                throw r0
        }
    }

    static {
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            Yue.C1248.f3793 = r0
            return
    }

    public C1248() {
            r0 = this;
            r0.<init>()
            return
    }

    @Yue.InterfaceC1230
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static int m6639(@Yue.InterfaceC4410 float[] r6) {
            r0 = 0
            r1 = r6[r0]
            r2 = 1
            r2 = r6[r2]
            r3 = 2
            r6 = r6[r3]
            r3 = 1073741824(0x40000000, float:2.0)
            float r4 = r6 * r3
            r5 = 1065353216(0x3f800000, float:1.0)
            float r4 = r4 - r5
            float r4 = java.lang.Math.abs(r4)
            float r4 = r5 - r4
            float r4 = r4 * r2
            r2 = 1056964608(0x3f000000, float:0.5)
            float r2 = r2 * r4
            float r6 = r6 - r2
            r2 = 1114636288(0x42700000, float:60.0)
            float r2 = r1 / r2
            float r2 = r2 % r3
            float r2 = r2 - r5
            float r2 = java.lang.Math.abs(r2)
            float r5 = r5 - r2
            float r5 = r5 * r4
            int r1 = (int) r1
            int r1 = r1 / 60
            r2 = 1132396544(0x437f0000, float:255.0)
            switch(r1) {
                case 0: goto L91;
                case 1: goto L7f;
                case 2: goto L6c;
                case 3: goto L59;
                case 4: goto L46;
                case 5: goto L33;
                case 6: goto L33;
                default: goto L2f;
            }
        L2f:
            r6 = r0
            r1 = r6
            r3 = r1
            goto La2
        L33:
            float r4 = r4 + r6
            float r4 = r4 * r2
            int r1 = java.lang.Math.round(r4)
            float r3 = r6 * r2
            int r3 = java.lang.Math.round(r3)
            float r5 = r5 + r6
            float r5 = r5 * r2
            int r6 = java.lang.Math.round(r5)
            goto La2
        L46:
            float r5 = r5 + r6
            float r5 = r5 * r2
            int r1 = java.lang.Math.round(r5)
            float r3 = r6 * r2
            int r3 = java.lang.Math.round(r3)
            float r4 = r4 + r6
            float r4 = r4 * r2
            int r6 = java.lang.Math.round(r4)
            goto La2
        L59:
            float r1 = r6 * r2
            int r1 = java.lang.Math.round(r1)
            float r5 = r5 + r6
            float r5 = r5 * r2
            int r3 = java.lang.Math.round(r5)
            float r4 = r4 + r6
            float r4 = r4 * r2
            int r6 = java.lang.Math.round(r4)
            goto La2
        L6c:
            float r1 = r6 * r2
            int r1 = java.lang.Math.round(r1)
            float r4 = r4 + r6
            float r4 = r4 * r2
            int r3 = java.lang.Math.round(r4)
            float r5 = r5 + r6
            float r5 = r5 * r2
            int r6 = java.lang.Math.round(r5)
            goto La2
        L7f:
            float r5 = r5 + r6
            float r5 = r5 * r2
            int r1 = java.lang.Math.round(r5)
            float r4 = r4 + r6
            float r4 = r4 * r2
            int r3 = java.lang.Math.round(r4)
            float r6 = r6 * r2
            int r6 = java.lang.Math.round(r6)
            goto La2
        L91:
            float r4 = r4 + r6
            float r4 = r4 * r2
            int r1 = java.lang.Math.round(r4)
            float r5 = r5 + r6
            float r5 = r5 * r2
            int r3 = java.lang.Math.round(r5)
            float r6 = r6 * r2
            int r6 = java.lang.Math.round(r6)
        La2:
            r2 = 255(0xff, float:3.57E-43)
            int r1 = m6664(r1, r0, r2)
            int r3 = m6664(r3, r0, r2)
            int r6 = m6664(r6, r0, r2)
            int r6 = android.graphics.Color.rgb(r1, r3, r6)
            return r6
    }

    @Yue.InterfaceC1230
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static int m6640(@Yue.InterfaceC2458(from = 0.0d, to = 100.0d) double r8, @Yue.InterfaceC2458(from = -128.0d, to = 127.0d) double r10, @Yue.InterfaceC2458(from = -128.0d, to = 127.0d) double r12) {
            double[] r7 = m6666()
            r0 = r8
            r2 = r10
            r4 = r12
            r6 = r7
            m6641(r0, r2, r4, r6)
            r8 = 0
            r0 = r7[r8]
            r8 = 1
            r2 = r7[r8]
            r8 = 2
            r4 = r7[r8]
            int r8 = m6646(r0, r2, r4)
            return r8
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static void m6641(@Yue.InterfaceC2458(from = 0.0d, to = 100.0d) double r19, @Yue.InterfaceC2458(from = -128.0d, to = 127.0d) double r21, @Yue.InterfaceC2458(from = -128.0d, to = 127.0d) double r23, @Yue.InterfaceC4410 double[] r25) {
            r0 = 4625196817309499392(0x4030000000000000, double:16.0)
            double r2 = r19 + r0
            r4 = 4637863191261478912(0x405d000000000000, double:116.0)
            double r2 = r2 / r4
            r6 = 4647503709213818880(0x407f400000000000, double:500.0)
            double r6 = r21 / r6
            double r6 = r6 + r2
            r8 = 4641240890982006784(0x4069000000000000, double:200.0)
            double r8 = r23 / r8
            double r8 = r2 - r8
            r10 = 4613937818241073152(0x4008000000000000, double:3.0)
            double r12 = java.lang.Math.pow(r6, r10)
            r14 = 4576258758203452558(0x3f82231832fcac8e, double:0.008856)
            int r16 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            r17 = 4651156726645941862(0x408c3a6666666666, double:903.3)
            if (r16 <= 0) goto L2a
            goto L2e
        L2a:
            double r6 = r6 * r4
            double r6 = r6 - r0
            double r12 = r6 / r17
        L2e:
            r6 = 4620692795244483847(0x401fff9da4c11507, double:7.9996247999999985)
            int r6 = (r19 > r6 ? 1 : (r19 == r6 ? 0 : -1))
            if (r6 <= 0) goto L3c
            double r2 = java.lang.Math.pow(r2, r10)
            goto L3e
        L3c:
            double r2 = r19 / r17
        L3e:
            double r6 = java.lang.Math.pow(r8, r10)
            int r10 = (r6 > r14 ? 1 : (r6 == r14 ? 0 : -1))
            if (r10 <= 0) goto L47
            goto L4b
        L47:
            double r8 = r8 * r4
            double r8 = r8 - r0
            double r6 = r8 / r17
        L4b:
            r0 = 4636388754964724318(0x4057c3020c49ba5e, double:95.047)
            double r12 = r12 * r0
            r0 = 0
            r25[r0] = r12
            r0 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r2 = r2 * r0
            r0 = 1
            r25[r0] = r2
            r0 = 4637362376909166477(0x405b3883126e978d, double:108.883)
            double r6 = r6 * r0
            r0 = 2
            r25[r0] = r6
            return
    }

    @Yue.InterfaceC1230
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static int m6642(@Yue.InterfaceC2458(from = 0.0d, to = 360.0d, toInclusive = false) float r0, @Yue.InterfaceC2458(from = 0.0d, to = Double.POSITIVE_INFINITY, toInclusive = false) float r1, @Yue.InterfaceC2458(from = 0.0d, to = 100.0d) float r2) {
            int r0 = Yue.C0924.m5276(r0, r1, r2)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static void m6643(@Yue.InterfaceC3281(from = 0, to = 255) int r7, @Yue.InterfaceC3281(from = 0, to = 255) int r8, @Yue.InterfaceC3281(from = 0, to = 255) int r9, @Yue.InterfaceC4410 float[] r10) {
            float r7 = (float) r7
            r0 = 1132396544(0x437f0000, float:255.0)
            float r7 = r7 / r0
            float r8 = (float) r8
            float r8 = r8 / r0
            float r9 = (float) r9
            float r9 = r9 / r0
            float r0 = java.lang.Math.max(r8, r9)
            float r0 = java.lang.Math.max(r7, r0)
            float r1 = java.lang.Math.min(r8, r9)
            float r1 = java.lang.Math.min(r7, r1)
            float r2 = r0 - r1
            float r3 = r0 + r1
            r4 = 1073741824(0x40000000, float:2.0)
            float r3 = r3 / r4
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r5 = 1065353216(0x3f800000, float:1.0)
            r6 = 0
            if (r1 != 0) goto L29
            r8 = r6
            r2 = r8
            goto L4a
        L29:
            int r1 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r1 != 0) goto L33
            float r8 = r8 - r9
            float r8 = r8 / r2
            r7 = 1086324736(0x40c00000, float:6.0)
            float r8 = r8 % r7
            goto L41
        L33:
            int r0 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r0 != 0) goto L3c
            float r9 = r9 - r7
            float r9 = r9 / r2
            float r8 = r9 + r4
            goto L41
        L3c:
            float r7 = r7 - r8
            float r7 = r7 / r2
            r8 = 1082130432(0x40800000, float:4.0)
            float r8 = r8 + r7
        L41:
            float r4 = r4 * r3
            float r4 = r4 - r5
            float r7 = java.lang.Math.abs(r4)
            float r7 = r5 - r7
            float r2 = r2 / r7
        L4a:
            r7 = 1114636288(0x42700000, float:60.0)
            float r8 = r8 * r7
            r7 = 1135869952(0x43b40000, float:360.0)
            float r8 = r8 % r7
            int r9 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r9 >= 0) goto L55
            float r8 = r8 + r7
        L55:
            r9 = 0
            float r7 = m6663(r8, r6, r7)
            r10[r9] = r7
            r7 = 1
            float r8 = m6663(r2, r6, r5)
            r10[r7] = r8
            r7 = 2
            float r8 = m6663(r3, r6, r5)
            r10[r7] = r8
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static void m6644(@Yue.InterfaceC3281(from = 0, to = 255) int r7, @Yue.InterfaceC3281(from = 0, to = 255) int r8, @Yue.InterfaceC3281(from = 0, to = 255) int r9, @Yue.InterfaceC4410 double[] r10) {
            m6645(r7, r8, r9, r10)
            r7 = 0
            r0 = r10[r7]
            r7 = 1
            r2 = r10[r7]
            r7 = 2
            r4 = r10[r7]
            r6 = r10
            m6647(r0, r2, r4, r6)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static void m6645(@Yue.InterfaceC3281(from = 0, to = 255) int r16, @Yue.InterfaceC3281(from = 0, to = 255) int r17, @Yue.InterfaceC3281(from = 0, to = 255) int r18, @Yue.InterfaceC4410 double[] r19) {
            r0 = r19
            int r1 = r0.length
            r2 = 3
            if (r1 != r2) goto Lb0
            r1 = r16
            double r1 = (double) r1
            r3 = 4643176031446892544(0x406fe00000000000, double:255.0)
            double r1 = r1 / r3
            r5 = 4585990280393462802(0x3fa4b5dcc63f1412, double:0.04045)
            int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            r8 = 4612586738352862003(0x4003333333333333, double:2.4)
            r10 = 4607430116779522785(0x3ff0e147ae147ae1, double:1.055)
            r12 = 4588087156379966505(0x3fac28f5c28f5c29, double:0.055)
            r14 = 4623462931452961751(0x4029d70a3d70a3d7, double:12.92)
            if (r7 >= 0) goto L30
            double r1 = r1 / r14
        L2d:
            r7 = r17
            goto L37
        L30:
            double r1 = r1 + r12
            double r1 = r1 / r10
            double r1 = java.lang.Math.pow(r1, r8)
            goto L2d
        L37:
            double r8 = (double) r7
            double r8 = r8 / r3
            int r7 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r7 >= 0) goto L41
            double r8 = r8 / r14
        L3e:
            r7 = r18
            goto L4d
        L41:
            double r8 = r8 + r12
            double r8 = r8 / r10
            r10 = 4612586738352862003(0x4003333333333333, double:2.4)
            double r8 = java.lang.Math.pow(r8, r10)
            goto L3e
        L4d:
            double r10 = (double) r7
            double r10 = r10 / r3
            int r3 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r3 >= 0) goto L55
            double r10 = r10 / r14
            goto L65
        L55:
            double r10 = r10 + r12
            r3 = 4607430116779522785(0x3ff0e147ae147ae1, double:1.055)
            double r10 = r10 / r3
            r3 = 4612586738352862003(0x4003333333333333, double:2.4)
            double r10 = java.lang.Math.pow(r10, r3)
        L65:
            r3 = 4601100757863216290(0x3fda64c2f837b4a2, double:0.4124)
            double r3 = r3 * r1
            r5 = 4600113568824896677(0x3fd6e2eb1c432ca5, double:0.3576)
            double r5 = r5 * r8
            double r3 = r3 + r5
            r5 = 4595671218152458420(0x3fc71a9fbe76c8b4, double:0.1805)
            double r5 = r5 * r10
            double r3 = r3 + r5
            r5 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r3 = r3 * r5
            r7 = 0
            r0[r7] = r3
            r3 = 4596827742536767164(0x3fcb367a0f9096bc, double:0.2126)
            double r3 = r3 * r1
            r12 = 4604617168452267173(0x3fe6e2eb1c432ca5, double:0.7152)
            double r12 = r12 * r8
            double r3 = r3 + r12
            r12 = 4589866978952703325(0x3fb27bb2fec56d5d, double:0.0722)
            double r12 = r12 * r10
            double r3 = r3 + r12
            double r3 = r3 * r5
            r7 = 1
            r0[r7] = r3
            r3 = 4581220067668151973(0x3f93c36113404ea5, double:0.0193)
            double r1 = r1 * r3
            r3 = 4593253685872485938(0x3fbe83e425aee632, double:0.1192)
            double r8 = r8 * r3
            double r1 = r1 + r8
            r3 = 4606736562436907729(0x3fee6a7ef9db22d1, double:0.9505)
            double r10 = r10 * r3
            double r1 = r1 + r10
            double r1 = r1 * r5
            r3 = 2
            r0[r3] = r1
            return
        Lb0:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "outXyz must have a length of 3."
            r0.<init>(r1)
            throw r0
    }

    @Yue.InterfaceC1230
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static int m6646(@Yue.InterfaceC2458(from = 0.0d, to = 95.047d) double r17, @Yue.InterfaceC2458(from = 0.0d, to = 100.0d) double r19, @Yue.InterfaceC2458(from = 0.0d, to = 108.883d) double r21) {
            r0 = 4614479601276245823(0x4009ecbfb15b573f, double:3.2406)
            double r0 = r0 * r17
            r2 = -4613770284334934970(0xbff8985f06f69446, double:-1.5372)
            double r2 = r2 * r19
            double r0 = r0 + r2
            r2 = -4620718437840042171(0xbfdfe90ff9724745, double:-0.4986)
            double r2 = r2 * r21
            double r0 = r0 + r2
            r2 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r0 = r0 / r2
            r4 = -4616469741951580845(0xbfef013a92a30553, double:-0.9689)
            double r4 = r4 * r17
            r6 = 4611126671353668488(0x3ffe0346dc5d6388, double:1.8758)
            double r6 = r6 * r19
            double r4 = r4 + r6
            r6 = 4586141601340942451(0x3fa53f7ced916873, double:0.0415)
            double r6 = r6 * r21
            double r4 = r4 + r6
            double r4 = r4 / r2
            r6 = 4588188037011619604(0x3fac84b5dcc63f14, double:0.0557)
            double r6 = r6 * r17
            r8 = -4626854141972371735(0xbfca1cac083126e9, double:-0.204)
            double r8 = r8 * r19
            double r6 = r6 + r8
            r8 = 4607439123978777526(0x3ff0e978d4fdf3b6, double:1.057)
            double r8 = r8 * r21
            double r6 = r6 + r8
            double r6 = r6 / r2
            r2 = 4569365555819558681(0x3f69a5c37387b719, double:0.0031308)
            int r8 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r9 = 4623462931452961751(0x4029d70a3d70a3d7, double:12.92)
            r11 = 4588087156379966505(0x3fac28f5c28f5c29, double:0.055)
            r13 = 4601177619296856747(0x3fdaaaaaaaaaaaab, double:0.4166666666666667)
            r15 = 4607430116779522785(0x3ff0e147ae147ae1, double:1.055)
            if (r8 <= 0) goto L6e
            double r0 = java.lang.Math.pow(r0, r13)
            double r0 = r0 * r15
            double r0 = r0 - r11
            goto L6f
        L6e:
            double r0 = r0 * r9
        L6f:
            int r8 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r8 <= 0) goto L7a
            double r4 = java.lang.Math.pow(r4, r13)
            double r4 = r4 * r15
            double r4 = r4 - r11
            goto L7b
        L7a:
            double r4 = r4 * r9
        L7b:
            int r2 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r2 <= 0) goto L86
            double r2 = java.lang.Math.pow(r6, r13)
            double r2 = r2 * r15
            double r2 = r2 - r11
            goto L88
        L86:
            double r2 = r6 * r9
        L88:
            r6 = 4643176031446892544(0x406fe00000000000, double:255.0)
            double r0 = r0 * r6
            long r0 = java.lang.Math.round(r0)
            int r0 = (int) r0
            r1 = 0
            r8 = 255(0xff, float:3.57E-43)
            int r0 = m6664(r0, r1, r8)
            double r4 = r4 * r6
            long r4 = java.lang.Math.round(r4)
            int r4 = (int) r4
            int r4 = m6664(r4, r1, r8)
            double r2 = r2 * r6
            long r2 = java.lang.Math.round(r2)
            int r2 = (int) r2
            int r1 = m6664(r2, r1, r8)
            int r0 = android.graphics.Color.rgb(r0, r4, r1)
            return r0
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static void m6647(@Yue.InterfaceC2458(from = 0.0d, to = 95.047d) double r4, @Yue.InterfaceC2458(from = 0.0d, to = 100.0d) double r6, @Yue.InterfaceC2458(from = 0.0d, to = 108.883d) double r8, @Yue.InterfaceC4410 double[] r10) {
            int r0 = r10.length
            r1 = 3
            if (r0 != r1) goto L40
            r0 = 4636388754964724318(0x4057c3020c49ba5e, double:95.047)
            double r4 = r4 / r0
            double r4 = m6667(r4)
            r0 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r6 = r6 / r0
            double r6 = m6667(r6)
            r0 = 4637362376909166477(0x405b3883126e978d, double:108.883)
            double r8 = r8 / r0
            double r8 = m6667(r8)
            r0 = 4637863191261478912(0x405d000000000000, double:116.0)
            double r0 = r0 * r6
            r2 = 4625196817309499392(0x4030000000000000, double:16.0)
            double r0 = r0 - r2
            r2 = 0
            double r0 = java.lang.Math.max(r2, r0)
            r2 = 0
            r10[r2] = r0
            r0 = 4647503709213818880(0x407f400000000000, double:500.0)
            double r4 = r4 - r6
            double r4 = r4 * r0
            r0 = 1
            r10[r0] = r4
            r4 = 4641240890982006784(0x4069000000000000, double:200.0)
            double r6 = r6 - r8
            double r6 = r6 * r4
            r4 = 2
            r10[r4] = r6
            return
        L40:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "outLab must have a length of 3."
            r4.<init>(r5)
            throw r4
    }

    @Yue.InterfaceC1230
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static int m6648(@Yue.InterfaceC1230 int r5, @Yue.InterfaceC1230 int r6, @Yue.InterfaceC2458(from = 0.0d, to = 1.0d) float r7) {
            r0 = 1065353216(0x3f800000, float:1.0)
            float r0 = r0 - r7
            int r1 = android.graphics.Color.alpha(r5)
            float r1 = (float) r1
            float r1 = r1 * r0
            int r2 = android.graphics.Color.alpha(r6)
            float r2 = (float) r2
            float r2 = r2 * r7
            float r1 = r1 + r2
            int r2 = android.graphics.Color.red(r5)
            float r2 = (float) r2
            float r2 = r2 * r0
            int r3 = android.graphics.Color.red(r6)
            float r3 = (float) r3
            float r3 = r3 * r7
            float r2 = r2 + r3
            int r3 = android.graphics.Color.green(r5)
            float r3 = (float) r3
            float r3 = r3 * r0
            int r4 = android.graphics.Color.green(r6)
            float r4 = (float) r4
            float r4 = r4 * r7
            float r3 = r3 + r4
            int r5 = android.graphics.Color.blue(r5)
            float r5 = (float) r5
            float r5 = r5 * r0
            int r6 = android.graphics.Color.blue(r6)
            float r6 = (float) r6
            float r6 = r6 * r7
            float r5 = r5 + r6
            int r6 = (int) r1
            int r7 = (int) r2
            int r0 = (int) r3
            int r5 = (int) r5
            int r5 = android.graphics.Color.argb(r6, r7, r0, r5)
            return r5
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static void m6649(@Yue.InterfaceC4410 float[] r4, @Yue.InterfaceC4410 float[] r5, @Yue.InterfaceC2458(from = 0.0d, to = 1.0d) float r6, @Yue.InterfaceC4410 float[] r7) {
            int r0 = r7.length
            r1 = 3
            if (r0 != r1) goto L27
            r0 = 1065353216(0x3f800000, float:1.0)
            float r0 = r0 - r6
            r1 = 0
            r2 = r4[r1]
            r3 = r5[r1]
            float r2 = m6654(r2, r3, r6)
            r7[r1] = r2
            r1 = 1
            r2 = r4[r1]
            float r2 = r2 * r0
            r3 = r5[r1]
            float r3 = r3 * r6
            float r2 = r2 + r3
            r7[r1] = r2
            r1 = 2
            r4 = r4[r1]
            float r4 = r4 * r0
            r5 = r5[r1]
            float r5 = r5 * r6
            float r4 = r4 + r5
            r7[r1] = r4
            return
        L27:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "result must have a length of 3."
            r4.<init>(r5)
            throw r4
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static void m6650(@Yue.InterfaceC4410 double[] r7, @Yue.InterfaceC4410 double[] r8, @Yue.InterfaceC2458(from = 0.0d, to = 1.0d) double r9, @Yue.InterfaceC4410 double[] r11) {
            int r0 = r11.length
            r1 = 3
            if (r0 != r1) goto L26
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r0 = r0 - r9
            r2 = 0
            r3 = r7[r2]
            double r3 = r3 * r0
            r5 = r8[r2]
            double r5 = r5 * r9
            double r3 = r3 + r5
            r11[r2] = r3
            r2 = 1
            r3 = r7[r2]
            double r3 = r3 * r0
            r5 = r8[r2]
            double r5 = r5 * r9
            double r3 = r3 + r5
            r11[r2] = r3
            r2 = 2
            r3 = r7[r2]
            double r3 = r3 * r0
            r7 = r8[r2]
            double r7 = r7 * r9
            double r3 = r3 + r7
            r11[r2] = r3
            return
        L26:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "outResult must have a length of 3."
            r7.<init>(r8)
            throw r7
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static double m6651(@Yue.InterfaceC1230 int r4, @Yue.InterfaceC1230 int r5) {
            int r0 = android.graphics.Color.alpha(r5)
            r1 = 255(0xff, float:3.57E-43)
            if (r0 != r1) goto L2b
            int r0 = android.graphics.Color.alpha(r4)
            if (r0 >= r1) goto L12
            int r4 = m6660(r4, r5)
        L12:
            double r0 = m6652(r4)
            r2 = 4587366580439587226(0x3fa999999999999a, double:0.05)
            double r0 = r0 + r2
            double r4 = m6652(r5)
            double r4 = r4 + r2
            double r2 = java.lang.Math.max(r0, r4)
            double r4 = java.lang.Math.min(r0, r4)
            double r2 = r2 / r4
            return r2
        L2b:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "background can not be translucent: #"
            r0.append(r1)
            java.lang.String r5 = java.lang.Integer.toHexString(r5)
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            r4.<init>(r5)
            throw r4
    }

    @Yue.InterfaceC2458(from = 0.0d, to = 1.0d)
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static double m6652(@Yue.InterfaceC1230 int r5) {
            double[] r0 = m6666()
            m6658(r5, r0)
            r5 = 1
            r1 = r0[r5]
            r3 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r1 = r1 / r3
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static int m6653(@Yue.InterfaceC1230 int r8, @Yue.InterfaceC1230 int r9, float r10) {
            int r0 = android.graphics.Color.alpha(r9)
            r1 = 255(0xff, float:3.57E-43)
            if (r0 != r1) goto L39
            int r0 = m6668(r8, r1)
            double r2 = m6651(r0, r9)
            double r4 = (double) r10
            int r10 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r10 >= 0) goto L17
            r8 = -1
            return r8
        L17:
            r10 = 0
            r0 = r10
        L19:
            r2 = 10
            if (r10 > r2) goto L38
            int r2 = r1 - r0
            r3 = 1
            if (r2 <= r3) goto L38
            int r2 = r0 + r1
            int r2 = r2 / 2
            int r3 = m6668(r8, r2)
            double r6 = m6651(r3, r9)
            int r3 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r3 >= 0) goto L34
            r0 = r2
            goto L35
        L34:
            r1 = r2
        L35:
            int r10 = r10 + 1
            goto L19
        L38:
            return r1
        L39:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r0 = "background can not be translucent: #"
            r10.append(r0)
            java.lang.String r9 = java.lang.Integer.toHexString(r9)
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            r8.<init>(r9)
            throw r8
    }

    @Yue.InterfaceC6959
    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static float m6654(float r2, float r3, float r4) {
            float r0 = r3 - r2
            float r0 = java.lang.Math.abs(r0)
            r1 = 1127481344(0x43340000, float:180.0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r1 = 1135869952(0x43b40000, float:360.0)
            if (r0 <= 0) goto L15
            int r0 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r0 <= 0) goto L14
            float r2 = r2 + r1
            goto L15
        L14:
            float r3 = r3 + r1
        L15:
            float r3 = r3 - r2
            float r3 = r3 * r4
            float r2 = r2 + r3
            float r2 = r2 % r1
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static void m6655(@Yue.InterfaceC1230 int r2, @Yue.InterfaceC4410 float[] r3) {
            int r0 = android.graphics.Color.red(r2)
            int r1 = android.graphics.Color.green(r2)
            int r2 = android.graphics.Color.blue(r2)
            m6643(r0, r1, r2, r3)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static void m6656(@Yue.InterfaceC1230 int r2, @Yue.InterfaceC4410 double[] r3) {
            int r0 = android.graphics.Color.red(r2)
            int r1 = android.graphics.Color.green(r2)
            int r2 = android.graphics.Color.blue(r2)
            m6644(r0, r1, r2, r3)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static void m6657(@Yue.InterfaceC1230 int r0, @Yue.InterfaceC4410 @Yue.InterfaceC5795(3) float[] r1) {
            Yue.C0924.m5275(r0, r1)
            return
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static void m6658(@Yue.InterfaceC1230 int r2, @Yue.InterfaceC4410 double[] r3) {
            int r0 = android.graphics.Color.red(r2)
            int r1 = android.graphics.Color.green(r2)
            int r2 = android.graphics.Color.blue(r2)
            m6645(r0, r1, r2, r3)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static int m6659(int r0, int r1) {
            int r1 = 255 - r1
            int r0 = 255 - r0
            int r1 = r1 * r0
            int r1 = r1 / 255
            int r0 = 255 - r1
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static int m6660(@Yue.InterfaceC1230 int r6, @Yue.InterfaceC1230 int r7) {
            int r0 = android.graphics.Color.alpha(r7)
            int r1 = android.graphics.Color.alpha(r6)
            int r2 = m6659(r1, r0)
            int r3 = android.graphics.Color.red(r6)
            int r4 = android.graphics.Color.red(r7)
            int r3 = m6662(r3, r1, r4, r0, r2)
            int r4 = android.graphics.Color.green(r6)
            int r5 = android.graphics.Color.green(r7)
            int r4 = m6662(r4, r1, r5, r0, r2)
            int r6 = android.graphics.Color.blue(r6)
            int r7 = android.graphics.Color.blue(r7)
            int r6 = m6662(r6, r1, r7, r0, r2)
            int r6 = android.graphics.Color.argb(r2, r3, r4, r6)
            return r6
    }

    @Yue.InterfaceC4410
    @Yue.InterfaceC5336(26)
    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static android.graphics.Color m6661(@Yue.InterfaceC4410 android.graphics.Color r0, @Yue.InterfaceC4410 android.graphics.Color r1) {
            android.graphics.Color r0 = Yue.C1248.C1249.m6669(r0, r1)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public static int m6662(int r0, int r1, int r2, int r3, int r4) {
            if (r4 != 0) goto L4
            r0 = 0
            return r0
        L4:
            int r0 = r0 * 255
            int r0 = r0 * r1
            int r2 = r2 * r3
            int r1 = 255 - r1
            int r2 = r2 * r1
            int r0 = r0 + r2
            int r4 = r4 * 255
            int r0 = r0 / r4
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public static float m6663(float r1, float r2, float r3) {
            int r0 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r0 >= 0) goto L5
            goto L9
        L5:
            float r2 = java.lang.Math.min(r1, r3)
        L9:
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public static int m6664(int r0, int r1, int r2) {
            if (r0 >= r1) goto L3
            goto L7
        L3:
            int r1 = java.lang.Math.min(r0, r2)
        L7:
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public static double m6665(@Yue.InterfaceC4410 double[] r9, @Yue.InterfaceC4410 double[] r10) {
            r0 = 0
            r1 = r9[r0]
            r3 = r10[r0]
            double r1 = r1 - r3
            r3 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r0 = java.lang.Math.pow(r1, r3)
            r2 = 1
            r5 = r9[r2]
            r7 = r10[r2]
            double r5 = r5 - r7
            double r5 = java.lang.Math.pow(r5, r3)
            double r0 = r0 + r5
            r2 = 2
            r5 = r9[r2]
            r9 = r10[r2]
            double r5 = r5 - r9
            double r9 = java.lang.Math.pow(r5, r3)
            double r0 = r0 + r9
            double r9 = java.lang.Math.sqrt(r0)
            return r9
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public static double[] m6666() {
            java.lang.ThreadLocal<double[]> r0 = Yue.C1248.f3793
            java.lang.Object r1 = r0.get()
            double[] r1 = (double[]) r1
            if (r1 != 0) goto L10
            r1 = 3
            double[] r1 = new double[r1]
            r0.set(r1)
        L10:
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public static double m6667(double r2) {
            r0 = 4576258758203452558(0x3f82231832fcac8e, double:0.008856)
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 <= 0) goto L13
            r0 = 4599676419421066581(0x3fd5555555555555, double:0.3333333333333333)
            double r2 = java.lang.Math.pow(r2, r0)
            goto L1f
        L13:
            r0 = 4651156726645941862(0x408c3a6666666666, double:903.3)
            double r2 = r2 * r0
            r0 = 4625196817309499392(0x4030000000000000, double:16.0)
            double r2 = r2 + r0
            r0 = 4637863191261478912(0x405d000000000000, double:116.0)
            double r2 = r2 / r0
        L1f:
            return r2
    }

    @Yue.InterfaceC1230
    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public static int m6668(@Yue.InterfaceC1230 int r1, @Yue.InterfaceC3281(from = 0, to = 255) int r2) {
            if (r2 < 0) goto Le
            r0 = 255(0xff, float:3.57E-43)
            if (r2 > r0) goto Le
            r0 = 16777215(0xffffff, float:2.3509886E-38)
            r1 = r1 & r0
            int r2 = r2 << 24
            r1 = r1 | r2
            return r1
        Le:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "alpha must be between 0 and 255."
            r1.<init>(r2)
            throw r1
    }
}
