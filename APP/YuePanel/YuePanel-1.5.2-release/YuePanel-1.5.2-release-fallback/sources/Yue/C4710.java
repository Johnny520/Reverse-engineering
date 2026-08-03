package Yue;

/* JADX INFO: renamed from: Yue.ۥۣۣۡۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C4710 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final java.lang.String f14943 = "PathParser";

    /* JADX INFO: renamed from: Yue.ۥۣۣۡۨ$ۥ, reason: contains not printable characters */
    public static class C4711 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public int f14944;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public boolean f14945;

        public C4711() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣۣۡۨ$ۥ۟, reason: contains not printable characters */
    public static class C4712 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        private char f14946;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        private final float[] f14947;

        public C4712(char r1, float[] r2) {
                r0 = this;
                r0.<init>()
                r0.f14946 = r1
                r0.f14947 = r2
                return
        }

        public C4712(Yue.C4710.C4712 r3) {
                r2 = this;
                r2.<init>()
                char r0 = r3.f14946
                r2.f14946 = r0
                float[] r3 = r3.f14947
                r0 = 0
                int r1 = r3.length
                float[] r3 = Yue.C4710.m18706(r3, r0, r1)
                r2.f14947 = r3
                return
        }

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static /* synthetic */ char m18717(Yue.C4710.C4712 r0) {
                char r0 = r0.f14946
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public static /* synthetic */ char m18718(Yue.C4710.C4712 r0, char r1) {
                r0.f14946 = r1
                return r1
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static /* synthetic */ float[] m18719(Yue.C4710.C4712 r0) {
                float[] r0 = r0.f14947
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public static /* synthetic */ void m18720(android.graphics.Path r0, float[] r1, char r2, char r3, float[] r4) {
                m18721(r0, r1, r2, r3, r4)
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public static void m18721(android.graphics.Path r25, float[] r26, char r27, char r28, float[] r29) {
                r10 = r25
                r11 = r28
                r12 = r29
                r13 = 0
                r0 = r26[r13]
                r14 = 1
                r1 = r26[r14]
                r15 = 2
                r2 = r26[r15]
                r16 = 3
                r3 = r26[r16]
                r17 = 4
                r4 = r26[r17]
                r18 = 5
                r5 = r26[r18]
                switch(r11) {
                    case 65: goto L36;
                    case 67: goto L32;
                    case 72: goto L2f;
                    case 76: goto L1e;
                    case 77: goto L1e;
                    case 81: goto L2c;
                    case 83: goto L2c;
                    case 84: goto L1e;
                    case 86: goto L2f;
                    case 90: goto L21;
                    case 97: goto L36;
                    case 99: goto L32;
                    case 104: goto L2f;
                    case 108: goto L1e;
                    case 109: goto L1e;
                    case 113: goto L2c;
                    case 115: goto L2c;
                    case 116: goto L1e;
                    case 118: goto L2f;
                    case 122: goto L21;
                    default: goto L1e;
                }
            L1e:
                r19 = r15
                goto L38
            L21:
                r25.close()
                r10.moveTo(r4, r5)
                r0 = r4
                r2 = r0
                r1 = r5
                r3 = r1
                goto L1e
            L2c:
                r19 = r17
                goto L38
            L2f:
                r19 = r14
                goto L38
            L32:
                r6 = 6
            L33:
                r19 = r6
                goto L38
            L36:
                r6 = 7
                goto L33
            L38:
                r9 = r0
                r8 = r1
                r20 = r4
                r21 = r5
                r7 = r13
                r0 = r27
            L41:
                int r1 = r12.length
                if (r7 >= r1) goto L2dc
                r1 = 65
                if (r11 == r1) goto L298
                r1 = 67
                if (r11 == r1) goto L26f
                r5 = 72
                if (r11 == r5) goto L263
                r5 = 81
                if (r11 == r5) goto L244
                r6 = 86
                if (r11 == r6) goto L238
                r6 = 97
                if (r11 == r6) goto L1eb
                r6 = 99
                if (r11 == r6) goto L1c3
                r15 = 104(0x68, float:1.46E-43)
                if (r11 == r15) goto L1b8
                r15 = 113(0x71, float:1.58E-43)
                if (r11 == r15) goto L19a
                r14 = 118(0x76, float:1.65E-43)
                if (r11 == r14) goto L190
                r14 = 76
                if (r11 == r14) goto L181
                r14 = 77
                if (r11 == r14) goto L16f
                r14 = 115(0x73, float:1.61E-43)
                r13 = 83
                r22 = 1073741824(0x40000000, float:2.0)
                if (r11 == r13) goto L13b
                r4 = 116(0x74, float:1.63E-43)
                r13 = 84
                if (r11 == r13) goto L118
                r1 = 108(0x6c, float:1.51E-43)
                if (r11 == r1) goto L107
                r1 = 109(0x6d, float:1.53E-43)
                if (r11 == r1) goto Lee
                if (r11 == r14) goto Lb6
                if (r11 == r4) goto L92
            L8e:
                r24 = r7
                goto L2d2
            L92:
                if (r0 == r15) goto L9e
                if (r0 == r4) goto L9e
                if (r0 == r5) goto L9e
                if (r0 != r13) goto L9b
                goto L9e
            L9b:
                r0 = 0
                r4 = 0
                goto La2
            L9e:
                float r4 = r9 - r2
                float r0 = r8 - r3
            La2:
                r1 = r12[r7]
                int r2 = r7 + 1
                r3 = r12[r2]
                r10.rQuadTo(r4, r0, r1, r3)
                float r4 = r4 + r9
                float r0 = r0 + r8
                r1 = r12[r7]
                float r9 = r9 + r1
                r1 = r12[r2]
                float r8 = r8 + r1
                r3 = r0
                r2 = r4
                goto L8e
            Lb6:
                if (r0 == r6) goto Lc6
                if (r0 == r14) goto Lc6
                r1 = 67
                if (r0 == r1) goto Lc6
                r1 = 83
                if (r0 != r1) goto Lc3
                goto Lc6
            Lc3:
                r1 = 0
                r2 = 0
                goto Lcc
            Lc6:
                float r0 = r9 - r2
                float r1 = r8 - r3
                r2 = r1
                r1 = r0
            Lcc:
                r3 = r12[r7]
                int r13 = r7 + 1
                r4 = r12[r13]
                int r14 = r7 + 2
                r5 = r12[r14]
                int r15 = r7 + 3
                r6 = r12[r15]
                r0 = r25
                r0.rCubicTo(r1, r2, r3, r4, r5, r6)
                r0 = r12[r7]
                float r0 = r0 + r9
                r1 = r12[r13]
                float r1 = r1 + r8
                r2 = r12[r14]
                float r9 = r9 + r2
                r2 = r12[r15]
            Lea:
                float r8 = r8 + r2
            Leb:
                r2 = r0
                r3 = r1
                goto L8e
            Lee:
                r0 = r12[r7]
                float r9 = r9 + r0
                int r1 = r7 + 1
                r1 = r12[r1]
                float r8 = r8 + r1
                if (r7 <= 0) goto Lfc
                r10.rLineTo(r0, r1)
                goto L8e
            Lfc:
                r10.rMoveTo(r0, r1)
            Lff:
                r24 = r7
                r21 = r8
                r20 = r9
                goto L2d2
            L107:
                r0 = r12[r7]
                int r1 = r7 + 1
                r4 = r12[r1]
                r10.rLineTo(r0, r4)
                r0 = r12[r7]
                float r9 = r9 + r0
                r0 = r12[r1]
            L115:
                float r8 = r8 + r0
                goto L8e
            L118:
                if (r0 == r15) goto L120
                if (r0 == r4) goto L120
                if (r0 == r5) goto L120
                if (r0 != r13) goto L126
            L120:
                float r9 = r9 * r22
                float r9 = r9 - r2
                float r8 = r8 * r22
                float r8 = r8 - r3
            L126:
                r0 = r12[r7]
                int r1 = r7 + 1
                r2 = r12[r1]
                r10.quadTo(r9, r8, r0, r2)
                r0 = r12[r7]
                r1 = r12[r1]
                r24 = r7
                r3 = r8
                r2 = r9
                r9 = r0
                r8 = r1
                goto L2d2
            L13b:
                if (r0 == r6) goto L14b
                if (r0 == r14) goto L14b
                r1 = 67
                if (r0 == r1) goto L14b
                r1 = 83
                if (r0 != r1) goto L148
                goto L14b
            L148:
                r2 = r8
                r1 = r9
                goto L152
            L14b:
                float r9 = r9 * r22
                float r9 = r9 - r2
                float r8 = r8 * r22
                float r8 = r8 - r3
                goto L148
            L152:
                r3 = r12[r7]
                int r8 = r7 + 1
                r4 = r12[r8]
                int r9 = r7 + 2
                r5 = r12[r9]
                int r13 = r7 + 3
                r6 = r12[r13]
                r0 = r25
                r0.cubicTo(r1, r2, r3, r4, r5, r6)
                r0 = r12[r7]
                r1 = r12[r8]
                r9 = r12[r9]
                r8 = r12[r13]
                goto Leb
            L16f:
                r9 = r12[r7]
                int r0 = r7 + 1
                r8 = r12[r0]
                if (r7 <= 0) goto L17c
                r10.lineTo(r9, r8)
                goto L8e
            L17c:
                r10.moveTo(r9, r8)
                goto Lff
            L181:
                r0 = r12[r7]
                int r1 = r7 + 1
                r4 = r12[r1]
                r10.lineTo(r0, r4)
                r9 = r12[r7]
                r8 = r12[r1]
                goto L8e
            L190:
                r0 = r12[r7]
                r1 = 0
                r10.rLineTo(r1, r0)
                r0 = r12[r7]
                goto L115
            L19a:
                r0 = r12[r7]
                int r1 = r7 + 1
                r2 = r12[r1]
                int r3 = r7 + 2
                r4 = r12[r3]
                int r5 = r7 + 3
                r6 = r12[r5]
                r10.rQuadTo(r0, r2, r4, r6)
                r0 = r12[r7]
                float r0 = r0 + r9
                r1 = r12[r1]
                float r1 = r1 + r8
                r2 = r12[r3]
                float r9 = r9 + r2
                r2 = r12[r5]
                goto Lea
            L1b8:
                r0 = r12[r7]
                r1 = 0
                r10.rLineTo(r0, r1)
                r0 = r12[r7]
                float r9 = r9 + r0
                goto L8e
            L1c3:
                r1 = r12[r7]
                int r0 = r7 + 1
                r2 = r12[r0]
                int r13 = r7 + 2
                r3 = r12[r13]
                int r14 = r7 + 3
                r4 = r12[r14]
                int r15 = r7 + 4
                r5 = r12[r15]
                int r22 = r7 + 5
                r6 = r12[r22]
                r0 = r25
                r0.rCubicTo(r1, r2, r3, r4, r5, r6)
                r0 = r12[r13]
                float r0 = r0 + r9
                r1 = r12[r14]
                float r1 = r1 + r8
                r2 = r12[r15]
                float r9 = r9 + r2
                r2 = r12[r22]
                goto Lea
            L1eb:
                int r13 = r7 + 5
                r0 = r12[r13]
                float r3 = r0 + r9
                int r14 = r7 + 6
                r0 = r12[r14]
                float r4 = r0 + r8
                r5 = r12[r7]
                int r0 = r7 + 1
                r6 = r12[r0]
                int r0 = r7 + 2
                r15 = r12[r0]
                int r0 = r7 + 3
                r0 = r12[r0]
                r1 = 0
                int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r0 == 0) goto L20d
                r22 = 1
                goto L20f
            L20d:
                r22 = 0
            L20f:
                int r0 = r7 + 4
                r0 = r12[r0]
                int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r0 == 0) goto L21a
                r23 = 1
                goto L21c
            L21a:
                r23 = 0
            L21c:
                r0 = r25
                r1 = r9
                r2 = r8
                r24 = r7
                r7 = r15
                r15 = r8
                r8 = r22
                r11 = r9
                r9 = r23
                m18723(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
                r0 = r12[r13]
                float r9 = r11 + r0
                r0 = r12[r14]
                float r8 = r15 + r0
            L234:
                r3 = r8
                r2 = r9
                goto L2d2
            L238:
                r24 = r7
                r11 = r9
                r0 = r12[r24]
                r10.lineTo(r11, r0)
                r8 = r12[r24]
                goto L2d2
            L244:
                r24 = r7
                r0 = r12[r24]
                int r7 = r24 + 1
                r1 = r12[r7]
                int r2 = r24 + 2
                r3 = r12[r2]
                int r4 = r24 + 3
                r5 = r12[r4]
                r10.quadTo(r0, r1, r3, r5)
                r0 = r12[r24]
                r1 = r12[r7]
                r9 = r12[r2]
                r8 = r12[r4]
                r2 = r0
                r3 = r1
                goto L2d2
            L263:
                r24 = r7
                r15 = r8
                r0 = r12[r24]
                r10.lineTo(r0, r15)
                r9 = r12[r24]
                goto L2d2
            L26f:
                r24 = r7
                r1 = r12[r24]
                int r7 = r24 + 1
                r2 = r12[r7]
                int r7 = r24 + 2
                r3 = r12[r7]
                int r8 = r24 + 3
                r4 = r12[r8]
                int r9 = r24 + 4
                r5 = r12[r9]
                int r11 = r24 + 5
                r6 = r12[r11]
                r0 = r25
                r0.cubicTo(r1, r2, r3, r4, r5, r6)
                r9 = r12[r9]
                r0 = r12[r11]
                r1 = r12[r7]
                r2 = r12[r8]
                r8 = r0
                r3 = r2
                r2 = r1
                goto L2d2
            L298:
                r24 = r7
                r15 = r8
                r11 = r9
                int r13 = r24 + 5
                r3 = r12[r13]
                int r14 = r24 + 6
                r4 = r12[r14]
                r5 = r12[r24]
                int r7 = r24 + 1
                r6 = r12[r7]
                int r7 = r24 + 2
                r7 = r12[r7]
                int r0 = r24 + 3
                r0 = r12[r0]
                r1 = 0
                int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r0 == 0) goto L2b9
                r8 = 1
                goto L2ba
            L2b9:
                r8 = 0
            L2ba:
                int r0 = r24 + 4
                r0 = r12[r0]
                int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r0 == 0) goto L2c4
                r9 = 1
                goto L2c5
            L2c4:
                r9 = 0
            L2c5:
                r0 = r25
                r1 = r11
                r2 = r15
                m18723(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
                r9 = r12[r13]
                r8 = r12[r14]
                goto L234
            L2d2:
                int r7 = r24 + r19
                r0 = r28
                r11 = r0
                r13 = 0
                r14 = 1
                r15 = 2
                goto L41
            L2dc:
                r15 = r8
                r11 = r9
                r0 = r13
                r26[r0] = r11
                r0 = 1
                r26[r0] = r15
                r0 = 2
                r26[r0] = r2
                r26[r16] = r3
                r26[r17] = r20
                r26[r18] = r21
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public static void m18722(android.graphics.Path r49, double r50, double r52, double r54, double r56, double r58, double r60, double r62, double r64, double r66) {
                r0 = r54
                r2 = 4616189618054758400(0x4010000000000000, double:4.0)
                double r4 = r66 * r2
                r6 = 4614256656552045848(0x400921fb54442d18, double:3.141592653589793)
                double r4 = r4 / r6
                double r4 = java.lang.Math.abs(r4)
                double r4 = java.lang.Math.ceil(r4)
                int r4 = (int) r4
                double r5 = java.lang.Math.cos(r62)
                double r7 = java.lang.Math.sin(r62)
                double r9 = java.lang.Math.cos(r64)
                double r11 = java.lang.Math.sin(r64)
                double r13 = -r0
                double r15 = r13 * r5
                double r17 = r15 * r11
                double r19 = r56 * r7
                double r21 = r19 * r9
                double r17 = r17 - r21
                double r13 = r13 * r7
                double r11 = r11 * r13
                double r21 = r56 * r5
                double r9 = r9 * r21
                double r11 = r11 + r9
                double r9 = (double) r4
                double r9 = r66 / r9
                r23 = 0
                r25 = r11
                r27 = r17
                r2 = r23
                r11 = r58
                r17 = r60
                r23 = r64
            L48:
                if (r2 >= r4) goto Le8
                double r31 = r23 + r9
                double r33 = java.lang.Math.sin(r31)
                double r35 = java.lang.Math.cos(r31)
                double r37 = r0 * r5
                double r37 = r37 * r35
                double r37 = r50 + r37
                double r39 = r19 * r33
                r41 = r4
                double r3 = r37 - r39
                double r37 = r0 * r7
                double r37 = r37 * r35
                double r37 = r52 + r37
                double r39 = r21 * r33
                double r0 = r37 + r39
                double r37 = r15 * r33
                double r39 = r19 * r35
                double r37 = r37 - r39
                double r33 = r33 * r13
                double r35 = r35 * r21
                double r33 = r33 + r35
                double r23 = r31 - r23
                r35 = 4611686018427387904(0x4000000000000000, double:2.0)
                double r35 = r23 / r35
                double r35 = java.lang.Math.tan(r35)
                double r23 = java.lang.Math.sin(r23)
                r39 = 4613937818241073152(0x4008000000000000, double:3.0)
                double r42 = r35 * r39
                double r42 = r42 * r35
                r29 = 4616189618054758400(0x4010000000000000, double:4.0)
                double r42 = r42 + r29
                double r35 = java.lang.Math.sqrt(r42)
                r42 = 4607182418800017408(0x3ff0000000000000, double:1.0)
                double r35 = r35 - r42
                double r23 = r23 * r35
                double r23 = r23 / r39
                double r27 = r27 * r23
                double r11 = r11 + r27
                double r25 = r25 * r23
                r27 = r5
                double r5 = r17 + r25
                double r17 = r23 * r37
                r62 = r7
                double r7 = r3 - r17
                double r23 = r23 * r33
                r56 = r9
                double r9 = r0 - r23
                r17 = r13
                r13 = 0
                r14 = r49
                r14.rLineTo(r13, r13)
                float r11 = (float) r11
                float r5 = (float) r5
                float r6 = (float) r7
                float r7 = (float) r9
                float r8 = (float) r3
                float r9 = (float) r0
                r42 = r49
                r43 = r11
                r44 = r5
                r45 = r6
                r46 = r7
                r47 = r8
                r48 = r9
                r42.cubicTo(r43, r44, r45, r46, r47, r48)
                int r2 = r2 + 1
                r9 = r56
                r7 = r62
                r11 = r3
                r13 = r17
                r5 = r27
                r23 = r31
                r25 = r33
                r27 = r37
                r4 = r41
                r17 = r0
                r0 = r54
                goto L48
            Le8:
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public static void m18723(android.graphics.Path r41, float r42, float r43, float r44, float r45, float r46, float r47, float r48, boolean r49, boolean r50) {
                r1 = r42
                r3 = r44
                r0 = r46
                r2 = r47
                r7 = r48
                r9 = r50
                double r4 = (double) r7
                double r19 = java.lang.Math.toRadians(r4)
                double r4 = java.lang.Math.cos(r19)
                double r10 = java.lang.Math.sin(r19)
                double r13 = (double) r1
                double r15 = r13 * r4
                r6 = r43
                r17 = r13
                double r13 = (double) r6
                double r21 = r13 * r10
                double r15 = r15 + r21
                double r6 = (double) r0
                double r15 = r15 / r6
                float r8 = -r1
                double r8 = (double) r8
                double r8 = r8 * r10
                double r21 = r13 * r4
                double r8 = r8 + r21
                r21 = r13
                double r13 = (double) r2
                double r8 = r8 / r13
                double r1 = (double) r3
                double r1 = r1 * r4
                r12 = r45
                r23 = r8
                double r8 = (double) r12
                double r25 = r8 * r10
                double r1 = r1 + r25
                double r1 = r1 / r6
                float r12 = -r3
                r25 = r6
                double r6 = (double) r12
                double r6 = r6 * r10
                double r8 = r8 * r4
                double r6 = r6 + r8
                double r6 = r6 / r13
                double r8 = r15 - r1
                double r27 = r23 - r6
                double r29 = r15 + r1
                r31 = 4611686018427387904(0x4000000000000000, double:2.0)
                double r29 = r29 / r31
                double r33 = r23 + r6
                double r33 = r33 / r31
                double r31 = r8 * r8
                double r35 = r27 * r27
                r37 = r10
                double r10 = r31 + r35
                r31 = 0
                int r12 = (r10 > r31 ? 1 : (r10 == r31 ? 0 : -1))
                java.lang.String r3 = "PathParser"
                if (r12 != 0) goto L6a
                java.lang.String r0 = " Points are coincident"
                android.util.Log.w(r3, r0)
                return
            L6a:
                r35 = 4607182418800017408(0x3ff0000000000000, double:1.0)
                double r35 = r35 / r10
                r39 = 4598175219545276416(0x3fd0000000000000, double:0.25)
                double r35 = r35 - r39
                int r12 = (r35 > r31 ? 1 : (r35 == r31 ? 0 : -1))
                if (r12 >= 0) goto Lad
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Points are too far apart "
                r1.append(r2)
                r1.append(r10)
                java.lang.String r1 = r1.toString()
                android.util.Log.w(r3, r1)
                double r1 = java.lang.Math.sqrt(r10)
                r3 = 4611685973391391630(0x3ffffff583a53b8e, double:1.99999)
                double r1 = r1 / r3
                float r1 = (float) r1
                float r5 = r0 * r1
                float r6 = r47 * r1
                r0 = r41
                r1 = r42
                r2 = r43
                r3 = r44
                r4 = r45
                r7 = r48
                r8 = r49
                r9 = r50
                m18723(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
                return
            Lad:
                double r10 = java.lang.Math.sqrt(r35)
                double r8 = r8 * r10
                double r10 = r10 * r27
                r0 = r49
                r3 = r50
                if (r0 != r3) goto Lbf
                double r29 = r29 - r10
                double r33 = r33 + r8
                goto Lc3
            Lbf:
                double r29 = r29 + r10
                double r33 = r33 - r8
            Lc3:
                double r8 = r23 - r33
                double r10 = r15 - r29
                double r23 = java.lang.Math.atan2(r8, r10)
                double r6 = r6 - r33
                double r1 = r1 - r29
                double r0 = java.lang.Math.atan2(r6, r1)
                double r0 = r0 - r23
                int r2 = (r0 > r31 ? 1 : (r0 == r31 ? 0 : -1))
                if (r2 < 0) goto Ldb
                r6 = 1
                goto Ldc
            Ldb:
                r6 = 0
            Ldc:
                if (r3 == r6) goto Le8
                r6 = 4618760256179416344(0x401921fb54442d18, double:6.283185307179586)
                if (r2 <= 0) goto Le7
                double r0 = r0 - r6
                goto Le8
            Le7:
                double r0 = r0 + r6
            Le8:
                double r29 = r29 * r25
                double r33 = r33 * r13
                double r2 = r29 * r4
                double r10 = r33 * r37
                double r7 = r2 - r10
                r2 = r25
                double r29 = r29 * r37
                double r33 = r33 * r4
                double r9 = r29 + r33
                r6 = r41
                r11 = r2
                r2 = r17
                r4 = r21
                r15 = r2
                r17 = r4
                r21 = r23
                r23 = r0
                m18722(r6, r7, r9, r11, r13, r15, r17, r19, r21, r23)
                return
        }

        @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20023})
        @java.lang.Deprecated
        /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
        public static void m18724(@Yue.InterfaceC4410 Yue.C4710.C4712[] r0, @Yue.InterfaceC4410 android.graphics.Path r1) {
                Yue.C4710.m18715(r0, r1)
                return
        }

        @Yue.InterfaceC4410
        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public float[] m18725() {
                r1 = this;
                float[] r0 = r1.f14947
                return r0
        }

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public char m18726() {
                r1 = this;
                char r0 = r1.f14946
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public void m18727(@Yue.InterfaceC4410 Yue.C4710.C4712 r5, @Yue.InterfaceC4410 Yue.C4710.C4712 r6, float r7) {
                r4 = this;
                char r0 = r5.f14946
                r4.f14946 = r0
                r0 = 0
            L5:
                float[] r1 = r5.f14947
                int r2 = r1.length
                if (r0 >= r2) goto L1d
                float[] r2 = r4.f14947
                r1 = r1[r0]
                r3 = 1065353216(0x3f800000, float:1.0)
                float r3 = r3 - r7
                float r1 = r1 * r3
                float[] r3 = r6.f14947
                r3 = r3[r0]
                float r3 = r3 * r7
                float r1 = r1 + r3
                r2[r0] = r1
                int r0 = r0 + 1
                goto L5
            L1d:
                return
        }
    }

    public C4710() {
            r0 = this;
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static void m18704(java.util.ArrayList<Yue.C4710.C4712> r1, char r2, float[] r3) {
            Yue.ۥۣۣۡۨ$ۥ۟ r0 = new Yue.ۥۣۣۡۨ$ۥ۟
            r0.<init>(r2, r3)
            r1.add(r0)
            return
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static boolean m18705(@Yue.InterfaceC4544 Yue.C4710.C4712[] r4, @Yue.InterfaceC4544 Yue.C4710.C4712[] r5) {
            r0 = 0
            if (r4 == 0) goto L34
            if (r5 != 0) goto L6
            goto L34
        L6:
            int r1 = r4.length
            int r2 = r5.length
            if (r1 == r2) goto Lb
            return r0
        Lb:
            r1 = r0
        Lc:
            int r2 = r4.length
            if (r1 >= r2) goto L32
            r2 = r4[r1]
            char r2 = Yue.C4710.C4712.m18717(r2)
            r3 = r5[r1]
            char r3 = Yue.C4710.C4712.m18717(r3)
            if (r2 != r3) goto L31
            r2 = r4[r1]
            float[] r2 = Yue.C4710.C4712.m18719(r2)
            int r2 = r2.length
            r3 = r5[r1]
            float[] r3 = Yue.C4710.C4712.m18719(r3)
            int r3 = r3.length
            if (r2 == r3) goto L2e
            goto L31
        L2e:
            int r1 = r1 + 1
            goto Lc
        L31:
            return r0
        L32:
            r4 = 1
            return r4
        L34:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static float[] m18706(float[] r2, int r3, int r4) {
            if (r3 > r4) goto L1a
            int r0 = r2.length
            if (r3 < 0) goto L14
            if (r3 > r0) goto L14
            int r4 = r4 - r3
            int r0 = r0 - r3
            int r0 = java.lang.Math.min(r4, r0)
            float[] r4 = new float[r4]
            r1 = 0
            java.lang.System.arraycopy(r2, r3, r4, r1, r0)
            return r4
        L14:
            java.lang.ArrayIndexOutOfBoundsException r2 = new java.lang.ArrayIndexOutOfBoundsException
            r2.<init>()
            throw r2
        L1a:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            r2.<init>()
            throw r2
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static Yue.C4710.C4712[] m18707(@Yue.InterfaceC4410 java.lang.String r7) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            r2 = 1
            r4 = r1
            r3 = r2
        L9:
            int r5 = r7.length()
            if (r3 >= r5) goto L32
            int r3 = m18714(r7, r3)
            java.lang.String r4 = r7.substring(r4, r3)
            java.lang.String r4 = r4.trim()
            boolean r5 = r4.isEmpty()
            if (r5 != 0) goto L2c
            float[] r5 = m18711(r4)
            char r4 = r4.charAt(r1)
            m18704(r0, r4, r5)
        L2c:
            int r4 = r3 + 1
            r6 = r4
            r4 = r3
            r3 = r6
            goto L9
        L32:
            int r3 = r3 - r4
            if (r3 != r2) goto L44
            int r2 = r7.length()
            if (r4 >= r2) goto L44
            char r7 = r7.charAt(r4)
            float[] r2 = new float[r1]
            m18704(r0, r7, r2)
        L44:
            Yue.ۥۣۣۡۨ$ۥ۟[] r7 = new Yue.C4710.C4712[r1]
            java.lang.Object[] r7 = r0.toArray(r7)
            Yue.ۥۣۣۡۨ$ۥ۟[] r7 = (Yue.C4710.C4712[]) r7
            return r7
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static android.graphics.Path m18708(@Yue.InterfaceC4410 java.lang.String r4) {
            android.graphics.Path r0 = new android.graphics.Path
            r0.<init>()
            Yue.ۥۣۣۡۨ$ۥ۟[] r1 = m18707(r4)
            Yue.C4710.C4712.m18724(r1, r0)     // Catch: java.lang.RuntimeException -> Ld
            return r0
        Ld:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Error in parsing "
            r2.append(r3)
            r2.append(r4)
            java.lang.String r4 = r2.toString()
            r1.<init>(r4, r0)
            throw r1
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static Yue.C4710.C4712[] m18709(@Yue.InterfaceC4410 Yue.C4710.C4712[] r4) {
            int r0 = r4.length
            Yue.ۥۣۣۡۨ$ۥ۟[] r0 = new Yue.C4710.C4712[r0]
            r1 = 0
        L4:
            int r2 = r4.length
            if (r1 >= r2) goto L13
            Yue.ۥۣۣۡۨ$ۥ۟ r2 = new Yue.ۥۣۣۡۨ$ۥ۟
            r3 = r4[r1]
            r2.<init>(r3)
            r0[r1] = r2
            int r1 = r1 + 1
            goto L4
        L13:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static void m18710(java.lang.String r8, int r9, Yue.C4710.C4711 r10) {
            r0 = 0
            r10.f14945 = r0
            r1 = r9
            r2 = r0
            r3 = r2
            r4 = r3
        L7:
            int r5 = r8.length()
            if (r1 >= r5) goto L3c
            char r5 = r8.charAt(r1)
            r6 = 32
            r7 = 1
            if (r5 == r6) goto L29
            r6 = 69
            if (r5 == r6) goto L35
            r6 = 101(0x65, float:1.42E-43)
            if (r5 == r6) goto L35
            switch(r5) {
                case 44: goto L29;
                case 45: goto L2c;
                case 46: goto L22;
                default: goto L21;
            }
        L21:
            goto L33
        L22:
            if (r3 != 0) goto L27
            r2 = r0
            r3 = r7
            goto L36
        L27:
            r10.f14945 = r7
        L29:
            r2 = r0
            r4 = r7
            goto L36
        L2c:
            if (r1 == r9) goto L33
            if (r2 != 0) goto L33
            r10.f14945 = r7
            goto L29
        L33:
            r2 = r0
            goto L36
        L35:
            r2 = r7
        L36:
            if (r4 == 0) goto L39
            goto L3c
        L39:
            int r1 = r1 + 1
            goto L7
        L3c:
            r10.f14944 = r1
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static float[] m18711(java.lang.String r8) {
            r0 = 0
            char r1 = r8.charAt(r0)
            r2 = 122(0x7a, float:1.71E-43)
            if (r1 == r2) goto L66
            char r1 = r8.charAt(r0)
            r2 = 90
            if (r1 != r2) goto L12
            goto L66
        L12:
            int r1 = r8.length()     // Catch: java.lang.NumberFormatException -> L3a
            float[] r1 = new float[r1]     // Catch: java.lang.NumberFormatException -> L3a
            Yue.ۥۣۣۡۨ$ۥ r2 = new Yue.ۥۣۣۡۨ$ۥ     // Catch: java.lang.NumberFormatException -> L3a
            r2.<init>()     // Catch: java.lang.NumberFormatException -> L3a
            int r3 = r8.length()     // Catch: java.lang.NumberFormatException -> L3a
            r4 = 1
            r5 = r0
        L23:
            if (r4 >= r3) goto L45
            m18710(r8, r4, r2)     // Catch: java.lang.NumberFormatException -> L3a
            int r6 = r2.f14944     // Catch: java.lang.NumberFormatException -> L3a
            if (r4 >= r6) goto L3c
            int r7 = r5 + 1
            java.lang.String r4 = r8.substring(r4, r6)     // Catch: java.lang.NumberFormatException -> L3a
            float r4 = java.lang.Float.parseFloat(r4)     // Catch: java.lang.NumberFormatException -> L3a
            r1[r5] = r4     // Catch: java.lang.NumberFormatException -> L3a
            r5 = r7
            goto L3c
        L3a:
            r0 = move-exception
            goto L4a
        L3c:
            boolean r4 = r2.f14945     // Catch: java.lang.NumberFormatException -> L3a
            if (r4 == 0) goto L42
            r4 = r6
            goto L23
        L42:
            int r4 = r6 + 1
            goto L23
        L45:
            float[] r8 = m18706(r1, r0, r5)     // Catch: java.lang.NumberFormatException -> L3a
            return r8
        L4a:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "error in parsing \""
            r2.append(r3)
            r2.append(r8)
            java.lang.String r8 = "\""
            r2.append(r8)
            java.lang.String r8 = r2.toString()
            r1.<init>(r8, r0)
            throw r1
        L66:
            float[] r8 = new float[r0]
            return r8
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static void m18712(@Yue.InterfaceC4410 Yue.C4710.C4712[] r0, float r1, @Yue.InterfaceC4410 Yue.C4710.C4712[] r2, @Yue.InterfaceC4410 Yue.C4710.C4712[] r3) {
            boolean r0 = m18713(r0, r2, r3, r1)
            if (r0 == 0) goto L7
            return
        L7:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Can't interpolate between two incompatible pathData"
            r0.<init>(r1)
            throw r0
    }

    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20023})
    @java.lang.Deprecated
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static boolean m18713(@Yue.InterfaceC4410 Yue.C4710.C4712[] r4, @Yue.InterfaceC4410 Yue.C4710.C4712[] r5, @Yue.InterfaceC4410 Yue.C4710.C4712[] r6, float r7) {
            int r0 = r4.length
            int r1 = r5.length
            if (r0 != r1) goto L21
            int r0 = r5.length
            int r1 = r6.length
            if (r0 != r1) goto L21
            boolean r0 = m18705(r5, r6)
            r1 = 0
            if (r0 != 0) goto L10
            return r1
        L10:
            int r0 = r4.length
            if (r1 >= r0) goto L1f
            r0 = r4[r1]
            r2 = r5[r1]
            r3 = r6[r1]
            r0.m18727(r2, r3, r7)
            int r1 = r1 + 1
            goto L10
        L1f:
            r4 = 1
            return r4
        L21:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "The nodes to be interpolated and resulting nodes must have the same length"
            r4.<init>(r5)
            throw r4
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static int m18714(java.lang.String r3, int r4) {
        L0:
            int r0 = r3.length()
            if (r4 >= r0) goto L24
            char r0 = r3.charAt(r4)
            int r1 = r0 + (-65)
            int r2 = r0 + (-90)
            int r1 = r1 * r2
            if (r1 <= 0) goto L18
            int r1 = r0 + (-97)
            int r2 = r0 + (-122)
            int r1 = r1 * r2
            if (r1 > 0) goto L21
        L18:
            r1 = 101(0x65, float:1.42E-43)
            if (r0 == r1) goto L21
            r1 = 69
            if (r0 == r1) goto L21
            return r4
        L21:
            int r4 = r4 + 1
            goto L0
        L24:
            return r4
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static void m18715(@Yue.InterfaceC4410 Yue.C4710.C4712[] r7, @Yue.InterfaceC4410 android.graphics.Path r8) {
            r0 = 6
            float[] r0 = new float[r0]
            int r1 = r7.length
            r2 = 109(0x6d, float:1.53E-43)
            r3 = 0
        L7:
            if (r3 >= r1) goto L1d
            r4 = r7[r3]
            char r5 = Yue.C4710.C4712.m18717(r4)
            float[] r6 = Yue.C4710.C4712.m18719(r4)
            Yue.C4710.C4712.m18720(r8, r0, r2, r5, r6)
            char r2 = Yue.C4710.C4712.m18717(r4)
            int r3 = r3 + 1
            goto L7
        L1d:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static void m18716(@Yue.InterfaceC4410 Yue.C4710.C4712[] r5, @Yue.InterfaceC4410 Yue.C4710.C4712[] r6) {
            r0 = 0
            r1 = r0
        L2:
            int r2 = r6.length
            if (r1 >= r2) goto L30
            r2 = r5[r1]
            r3 = r6[r1]
            char r3 = Yue.C4710.C4712.m18717(r3)
            Yue.C4710.C4712.m18718(r2, r3)
            r2 = r0
        L11:
            r3 = r6[r1]
            float[] r3 = Yue.C4710.C4712.m18719(r3)
            int r3 = r3.length
            if (r2 >= r3) goto L2d
            r3 = r5[r1]
            float[] r3 = Yue.C4710.C4712.m18719(r3)
            r4 = r6[r1]
            float[] r4 = Yue.C4710.C4712.m18719(r4)
            r4 = r4[r2]
            r3[r2] = r4
            int r2 = r2 + 1
            goto L11
        L2d:
            int r1 = r1 + 1
            goto L2
        L30:
            return
    }
}
