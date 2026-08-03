package a;

/* JADX INFO: renamed from: a.sc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0374sc {

    /* JADX INFO: renamed from: a.sc$a */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public char f687a;
        public final float[] b;

        public a(char r1, float[] r2) {
                r0 = this;
                r0.<init>()
                r0.f687a = r1
                r0.b = r2
                return
        }

        public a(a.C0374sc.a r2) {
                r1 = this;
                r1.<init>()
                char r0 = r2.f687a
                r1.f687a = r0
                float[] r2 = r2.b
                int r0 = r2.length
                float[] r2 = a.C0374sc.a(r2, r0)
                r1.b = r2
                return
        }

        public static void a(android.graphics.Path r54, float r55, float r56, float r57, float r58, float r59, float r60, float r61, boolean r62, boolean r63) {
                r1 = r55
                r3 = r57
                r0 = r59
                r2 = r60
                r7 = r61
                double r4 = (double) r7
                double r4 = java.lang.Math.toRadians(r4)
                double r8 = java.lang.Math.cos(r4)
                double r10 = java.lang.Math.sin(r4)
                double r12 = (double) r1
                double r14 = r12 * r8
                r6 = r56
                r16 = r4
                double r4 = (double) r6
                double r18 = r4 * r10
                double r18 = r18 + r14
                double r14 = (double) r0
                double r18 = r18 / r14
                float r0 = -r1
                double r0 = (double) r0
                double r0 = r0 * r10
                double r20 = r4 * r8
                double r20 = r20 + r0
                double r0 = (double) r2
                double r20 = r20 / r0
                r22 = r0
                double r0 = (double) r3
                double r0 = r0 * r8
                r24 = r0
                r0 = r58
                double r1 = (double) r0
                double r26 = r1 * r10
                double r26 = r26 + r24
                double r26 = r26 / r14
                float r0 = -r3
                r24 = r1
                double r0 = (double) r0
                double r0 = r0 * r10
                double r24 = r24 * r8
                double r24 = r24 + r0
                double r24 = r24 / r22
                double r0 = r18 - r26
                double r28 = r20 - r24
                double r30 = r18 + r26
                r32 = 4611686018427387904(0x4000000000000000, double:2.0)
                double r30 = r30 / r32
                double r34 = r20 + r24
                double r34 = r34 / r32
                double r36 = r0 * r0
                double r38 = r28 * r28
                r40 = r0
                double r0 = r38 + r36
                r36 = 0
                int r2 = (r0 > r36 ? 1 : (r0 == r36 ? 0 : -1))
                r38 = r2
                java.lang.String r2 = "PathParser"
                if (r38 != 0) goto L70
                java.lang.String r0 = " Points are coincident"
                android.util.Log.w(r2, r0)
                return
            L70:
                r38 = 4607182418800017408(0x3ff0000000000000, double:1.0)
                double r42 = r38 / r0
                r44 = 4598175219545276416(0x3fd0000000000000, double:0.25)
                double r42 = r42 - r44
                int r44 = (r42 > r36 ? 1 : (r42 == r36 ? 0 : -1))
                if (r44 >= 0) goto Lac
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                java.lang.String r5 = "Points are too far apart "
                r4.<init>(r5)
                r4.append(r0)
                java.lang.String r4 = r4.toString()
                android.util.Log.w(r2, r4)
                double r0 = java.lang.Math.sqrt(r0)
                r4 = 4611685973391391630(0x3ffffff583a53b8e, double:1.99999)
                double r0 = r0 / r4
                float r0 = (float) r0
                float r5 = r59 * r0
                float r0 = r0 * r60
                r1 = r55
                r4 = r58
                r8 = r62
                r9 = r63
                r2 = r6
                r6 = r0
                r0 = r54
                a(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
                return
            Lac:
                r0 = r63
                double r1 = java.lang.Math.sqrt(r42)
                double r6 = r1 * r40
                double r1 = r1 * r28
                r3 = r62
                if (r3 != r0) goto Lbf
                double r30 = r30 - r1
                double r34 = r34 + r6
                goto Lc3
            Lbf:
                double r30 = r30 + r1
                double r34 = r34 - r6
            Lc3:
                double r1 = r20 - r34
                double r6 = r18 - r30
                double r1 = java.lang.Math.atan2(r1, r6)
                double r6 = r24 - r34
                r55 = r1
                double r1 = r26 - r30
                double r1 = java.lang.Math.atan2(r6, r1)
                double r1 = r1 - r55
                int r3 = (r1 > r36 ? 1 : (r1 == r36 ? 0 : -1))
                if (r3 < 0) goto Ldd
                r7 = 1
                goto Lde
            Ldd:
                r7 = 0
            Lde:
                if (r0 == r7) goto Lec
                r18 = 4618760256179416344(0x401921fb54442d18, double:6.283185307179586)
                if (r3 <= 0) goto Lea
                double r1 = r1 - r18
                goto Lec
            Lea:
                double r1 = r1 + r18
            Lec:
                double r30 = r30 * r14
                double r34 = r34 * r22
                double r18 = r30 * r8
                double r20 = r34 * r10
                double r18 = r18 - r20
                double r30 = r30 * r10
                double r34 = r34 * r8
                double r34 = r34 + r30
                r7 = 4616189618054758400(0x4010000000000000, double:4.0)
                double r9 = r1 * r7
                r20 = 4614256656552045848(0x400921fb54442d18, double:3.141592653589793)
                double r9 = r9 / r20
                double r9 = java.lang.Math.abs(r9)
                double r9 = java.lang.Math.ceil(r9)
                int r0 = (int) r9
                double r9 = java.lang.Math.cos(r16)
                double r16 = java.lang.Math.sin(r16)
                double r20 = java.lang.Math.cos(r55)
                double r24 = java.lang.Math.sin(r55)
                r62 = r7
                double r6 = -r14
                double r26 = r6 * r9
                double r28 = r26 * r24
                double r30 = r22 * r16
                double r36 = r30 * r20
                double r28 = r28 - r36
                double r6 = r6 * r16
                double r24 = r24 * r6
                double r22 = r22 * r9
                double r20 = r20 * r22
                double r20 = r20 + r24
                r58 = r1
                double r1 = (double) r0
                double r1 = r58 / r1
                r24 = r20
                r20 = r12
                r11 = r4
                r5 = 0
                r3 = r55
            L144:
                if (r5 >= r0) goto L1df
                double r36 = r3 + r1
                double r40 = java.lang.Math.sin(r36)
                double r42 = java.lang.Math.cos(r36)
                double r44 = r14 * r9
                double r44 = r44 * r42
                double r44 = r44 + r18
                double r46 = r30 * r40
                r8 = r0
                r48 = r1
                double r0 = r44 - r46
                double r44 = r14 * r16
                double r44 = r44 * r42
                double r44 = r44 + r34
                double r46 = r22 * r40
                r55 = r3
                double r2 = r46 + r44
                double r44 = r26 * r40
                double r46 = r30 * r42
                double r44 = r44 - r46
                double r40 = r40 * r6
                double r42 = r42 * r22
                double r40 = r42 + r40
                double r42 = r36 - r55
                double r46 = r42 / r32
                double r46 = java.lang.Math.tan(r46)
                double r42 = java.lang.Math.sin(r42)
                r50 = 4613937818241073152(0x4008000000000000, double:3.0)
                double r52 = r46 * r50
                double r52 = r52 * r46
                double r52 = r52 + r62
                double r46 = java.lang.Math.sqrt(r52)
                double r46 = r46 - r38
                double r46 = r46 * r42
                double r46 = r46 / r50
                double r28 = r28 * r46
                r13 = r5
                double r4 = r28 + r20
                double r24 = r24 * r46
                double r11 = r24 + r11
                double r20 = r46 * r44
                r24 = r6
                double r6 = r0 - r20
                double r46 = r46 * r40
                r20 = r9
                r10 = r8
                double r8 = r2 - r46
                r28 = r10
                r10 = 0
                r29 = r13
                r13 = r54
                r13.rLineTo(r10, r10)
                float r4 = (float) r4
                float r5 = (float) r11
                float r6 = (float) r6
                float r7 = (float) r8
                float r8 = (float) r0
                float r9 = (float) r2
                r56 = r4
                r57 = r5
                r58 = r6
                r59 = r7
                r60 = r8
                r61 = r9
                r55 = r13
                r55.cubicTo(r56, r57, r58, r59, r60, r61)
                int r5 = r29 + 1
                r11 = r2
                r9 = r20
                r6 = r24
                r3 = r36
                r24 = r40
                r20 = r0
                r0 = r28
                r28 = r44
                r1 = r48
                goto L144
            L1df:
                return
        }

        @java.lang.Deprecated
        public static void b(a.C0374sc.a[] r33, android.graphics.Path r34) {
                r0 = r33
                r1 = r34
                r11 = 6
                float[] r12 = new float[r11]
                int r13 = r0.length
                r14 = 109(0x6d, float:1.53E-43)
                r15 = 0
                r2 = r14
                r8 = r15
            Ld:
                if (r8 >= r13) goto L3ac
                r9 = r0[r8]
                char r10 = r9.f687a
                r3 = r12[r15]
                r16 = 1
                r4 = r12[r16]
                r17 = 2
                r5 = r12[r17]
                r18 = 3
                r6 = r12[r18]
                r19 = 4
                r7 = r12[r19]
                r20 = 5
                r11 = r12[r20]
                switch(r10) {
                    case 65: goto L43;
                    case 67: goto L40;
                    case 72: goto L3d;
                    case 81: goto L3a;
                    case 83: goto L3a;
                    case 86: goto L3d;
                    case 90: goto L2f;
                    case 97: goto L43;
                    case 99: goto L40;
                    case 104: goto L3d;
                    case 113: goto L3a;
                    case 115: goto L3a;
                    case 118: goto L3d;
                    case 122: goto L2f;
                    default: goto L2c;
                }
            L2c:
                r21 = r17
                goto L45
            L2f:
                r1.close()
                r1.moveTo(r7, r11)
                r3 = r7
                r5 = r3
                r4 = r11
                r6 = r4
                goto L2c
            L3a:
                r21 = r19
                goto L45
            L3d:
                r21 = r16
                goto L45
            L40:
                r21 = 6
                goto L45
            L43:
                r21 = 7
            L45:
                r22 = r4
                r23 = r7
                r24 = r11
                r11 = r3
                r3 = r15
            L4d:
                float[] r4 = r9.b
                int r7 = r4.length
                if (r3 >= r7) goto L38b
                r7 = 65
                r25 = r15
                if (r10 == r7) goto L331
                r7 = 67
                if (r10 == r7) goto L303
                r15 = 72
                if (r10 == r15) goto L2f0
                r15 = 81
                if (r10 == r15) goto L2cb
                r7 = 86
                if (r10 == r7) goto L2b9
                r7 = 97
                if (r10 == r7) goto L269
                r7 = 99
                if (r10 == r7) goto L23a
                r7 = 104(0x68, float:1.46E-43)
                if (r10 == r7) goto L22b
                r7 = 113(0x71, float:1.58E-43)
                if (r10 == r7) goto L208
                r15 = 118(0x76, float:1.65E-43)
                if (r10 == r15) goto L1fa
                r15 = 76
                if (r10 == r15) goto L1e8
                r15 = 77
                if (r10 == r15) goto L1cc
                r15 = 115(0x73, float:1.61E-43)
                r7 = 83
                r31 = 1073741824(0x40000000, float:2.0)
                if (r10 == r7) goto L18a
                r7 = 84
                if (r10 == r7) goto L154
                r7 = 108(0x6c, float:1.51E-43)
                if (r10 == r7) goto L13e
                if (r10 == r14) goto L11d
                if (r10 == r15) goto Ld7
                r7 = 116(0x74, float:1.63E-43)
                if (r10 == r7) goto La7
                r30 = r3
            L9e:
                r14 = r9
                r2 = r11
            La0:
                r3 = r22
            La2:
                r22 = r8
            La4:
                r11 = r10
                goto L378
            La7:
                r15 = 113(0x71, float:1.58E-43)
                if (r2 == r15) goto Lb9
                if (r2 == r7) goto Lb9
                r7 = 81
                if (r2 == r7) goto Lb9
                r7 = 84
                if (r2 != r7) goto Lb6
                goto Lb9
            Lb6:
                r2 = 0
                r15 = 0
                goto Lbd
            Lb9:
                float r15 = r11 - r5
                float r2 = r22 - r6
            Lbd:
                r5 = r4[r3]
                int r6 = r3 + 1
                r7 = r4[r6]
                r1.rQuadTo(r15, r2, r5, r7)
                float r15 = r15 + r11
                float r2 = r22 + r2
                r5 = r4[r3]
                float r11 = r11 + r5
                r4 = r4[r6]
                float r22 = r22 + r4
                r6 = r2
                r30 = r3
                r14 = r9
                r2 = r11
                r5 = r15
                goto La0
            Ld7:
                r7 = 99
                if (r2 == r7) goto Lea
                if (r2 == r15) goto Lea
                r7 = 67
                if (r2 == r7) goto Lea
                r7 = 83
                if (r2 != r7) goto Le6
                goto Lea
            Le6:
                r2 = 0
                r15 = 0
            Le8:
                r5 = r4
                goto Lf2
            Lea:
                float r15 = r11 - r5
                float r2 = r22 - r6
                r5 = r15
                r15 = r2
                r2 = r5
                goto Le8
            Lf2:
                r4 = r5[r3]
                int r26 = r3 + 1
                r6 = r5
                r5 = r6[r26]
                int r27 = r3 + 2
                r7 = r6
                r6 = r7[r27]
                int r28 = r3 + 3
                r29 = r7
                r7 = r29[r28]
                r30 = r3
                r3 = r15
                r32 = r29
                r1.rCubicTo(r2, r3, r4, r5, r6, r7)
                r2 = r32[r30]
                float r2 = r2 + r11
                r3 = r32[r26]
                float r3 = r22 + r3
                r4 = r32[r27]
                float r11 = r11 + r4
                r4 = r32[r28]
            L118:
                float r22 = r22 + r4
                r5 = r2
                r6 = r3
                goto L9e
            L11d:
                r30 = r3
                r32 = r4
                r2 = r32[r30]
                float r11 = r11 + r2
                int r3 = r30 + 1
                r3 = r32[r3]
                float r22 = r22 + r3
                if (r30 <= 0) goto L131
                r1.rLineTo(r2, r3)
                goto L9e
            L131:
                r1.rMoveTo(r2, r3)
                r14 = r9
                r2 = r11
                r23 = r2
                r3 = r22
                r24 = r3
                goto La2
            L13e:
                r30 = r3
                r32 = r4
                r2 = r32[r30]
                int r3 = r30 + 1
                r4 = r32[r3]
                r1.rLineTo(r2, r4)
                r2 = r32[r30]
                float r11 = r11 + r2
                r2 = r32[r3]
            L150:
                float r22 = r22 + r2
                goto L9e
            L154:
                r30 = r3
                r32 = r4
                r15 = 113(0x71, float:1.58E-43)
                if (r2 == r15) goto L16c
                r7 = 116(0x74, float:1.63E-43)
                if (r2 == r7) goto L16c
                r7 = 81
                if (r2 == r7) goto L16c
                r7 = 84
                if (r2 != r7) goto L169
                goto L16c
            L169:
                r2 = r22
                goto L174
            L16c:
                float r11 = r11 * r31
                float r11 = r11 - r5
                float r22 = r22 * r31
                float r22 = r22 - r6
                goto L169
            L174:
                r3 = r32[r30]
                int r4 = r30 + 1
                r5 = r32[r4]
                r1.quadTo(r11, r2, r3, r5)
                r3 = r32[r30]
                r4 = r32[r4]
                r6 = r2
                r2 = r3
                r3 = r4
                r22 = r8
                r14 = r9
                r5 = r11
                goto La4
            L18a:
                r30 = r3
                r32 = r4
                r7 = 99
                if (r2 == r7) goto L1a1
                if (r2 == r15) goto L1a1
                r7 = 67
                if (r2 == r7) goto L1a1
                r7 = 83
                if (r2 != r7) goto L19d
                goto L1a1
            L19d:
                r2 = r11
                r3 = r22
                goto L1a9
            L1a1:
                float r11 = r11 * r31
                float r11 = r11 - r5
                float r22 = r22 * r31
                float r22 = r22 - r6
                goto L19d
            L1a9:
                r4 = r32[r30]
                int r11 = r30 + 1
                r5 = r32[r11]
                int r15 = r30 + 2
                r6 = r32[r15]
                int r22 = r30 + 3
                r7 = r32[r22]
                r1.cubicTo(r2, r3, r4, r5, r6, r7)
                r2 = r32[r30]
                r3 = r32[r11]
                r4 = r32[r15]
                r5 = r32[r22]
                r6 = r3
                r3 = r5
                r22 = r8
                r14 = r9
                r11 = r10
            L1c8:
                r5 = r2
                r2 = r4
                goto L378
            L1cc:
                r30 = r3
                r32 = r4
                r2 = r32[r30]
                int r3 = r30 + 1
                r3 = r32[r3]
                if (r30 <= 0) goto L1e0
                r1.lineTo(r2, r3)
            L1db:
                r22 = r8
                r14 = r9
                goto La4
            L1e0:
                r1.moveTo(r2, r3)
                r23 = r2
                r24 = r3
                goto L1db
            L1e8:
                r30 = r3
                r32 = r4
                r2 = r32[r30]
                int r3 = r30 + 1
                r4 = r32[r3]
                r1.lineTo(r2, r4)
                r2 = r32[r30]
                r3 = r32[r3]
                goto L1db
            L1fa:
                r30 = r3
                r32 = r4
                r2 = r32[r30]
                r3 = 0
                r1.rLineTo(r3, r2)
                r2 = r32[r30]
                goto L150
            L208:
                r30 = r3
                r32 = r4
                r2 = r32[r30]
                int r3 = r30 + 1
                r4 = r32[r3]
                int r5 = r30 + 2
                r6 = r32[r5]
                int r7 = r30 + 3
                r15 = r32[r7]
                r1.rQuadTo(r2, r4, r6, r15)
                r2 = r32[r30]
                float r2 = r2 + r11
                r3 = r32[r3]
                float r3 = r22 + r3
                r4 = r32[r5]
                float r11 = r11 + r4
                r4 = r32[r7]
                goto L118
            L22b:
                r30 = r3
                r32 = r4
                r2 = r32[r30]
                r3 = 0
                r1.rLineTo(r2, r3)
                r2 = r32[r30]
                float r11 = r11 + r2
                goto L9e
            L23a:
                r30 = r3
                r32 = r4
                r2 = r32[r30]
                int r3 = r30 + 1
                r3 = r32[r3]
                int r15 = r30 + 2
                r4 = r32[r15]
                int r26 = r30 + 3
                r5 = r32[r26]
                int r27 = r30 + 4
                r6 = r32[r27]
                int r28 = r30 + 5
                r7 = r32[r28]
                r1.rCubicTo(r2, r3, r4, r5, r6, r7)
                r1 = r32[r15]
                float r1 = r1 + r11
                r2 = r32[r26]
                float r2 = r22 + r2
                r3 = r32[r27]
                float r11 = r11 + r3
                r3 = r32[r28]
                float r22 = r22 + r3
                r5 = r1
                r6 = r2
                goto L9e
            L269:
                r30 = r3
                r32 = r4
                int r15 = r30 + 5
                r1 = r32[r15]
                float r4 = r1 + r11
                int r27 = r30 + 6
                r1 = r32[r27]
                float r5 = r1 + r22
                r6 = r32[r30]
                int r3 = r30 + 1
                r7 = r32[r3]
                int r3 = r30 + 2
                r1 = r32[r3]
                int r3 = r30 + 3
                r2 = r32[r3]
                r26 = 0
                int r2 = (r2 > r26 ? 1 : (r2 == r26 ? 0 : -1))
                if (r2 == 0) goto L291
                r2 = r9
                r9 = r16
                goto L294
            L291:
                r2 = r9
                r9 = r25
            L294:
                int r3 = r30 + 4
                r3 = r32[r3]
                int r3 = (r3 > r26 ? 1 : (r3 == r26 ? 0 : -1))
                r14 = r2
                r2 = r11
                r11 = r10
                if (r3 == 0) goto L2a9
                r10 = r16
            L2a1:
                r3 = r22
                r22 = r8
                r8 = r1
                r1 = r34
                goto L2ac
            L2a9:
                r10 = r25
                goto L2a1
            L2ac:
                a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
                r4 = r32[r15]
                float r2 = r2 + r4
                r4 = r32[r27]
                float r3 = r3 + r4
                r5 = r2
                r6 = r3
                goto L378
            L2b9:
                r30 = r3
                r32 = r4
                r22 = r8
                r14 = r9
                r2 = r11
                r11 = r10
                r3 = r32[r30]
                r1.lineTo(r2, r3)
                r3 = r32[r30]
                goto L378
            L2cb:
                r30 = r3
                r32 = r4
                r22 = r8
                r14 = r9
                r11 = r10
                r2 = r32[r30]
                int r3 = r30 + 1
                r4 = r32[r3]
                int r5 = r30 + 2
                r6 = r32[r5]
                int r7 = r30 + 3
                r8 = r32[r7]
                r1.quadTo(r2, r4, r6, r8)
                r2 = r32[r30]
                r3 = r32[r3]
                r4 = r32[r5]
                r5 = r32[r7]
                r6 = r3
                r3 = r5
                goto L1c8
            L2f0:
                r30 = r3
                r32 = r4
                r14 = r9
                r11 = r10
                r3 = r22
                r22 = r8
                r2 = r32[r30]
                r1.lineTo(r2, r3)
                r2 = r32[r30]
                goto L378
            L303:
                r30 = r3
                r32 = r4
                r22 = r8
                r14 = r9
                r11 = r10
                r2 = r32[r30]
                int r3 = r30 + 1
                r3 = r32[r3]
                int r8 = r30 + 2
                r4 = r32[r8]
                int r9 = r30 + 3
                r5 = r32[r9]
                int r10 = r30 + 4
                r6 = r32[r10]
                int r15 = r30 + 5
                r7 = r32[r15]
                r1.cubicTo(r2, r3, r4, r5, r6, r7)
                r1 = r32[r10]
                r2 = r32[r15]
                r3 = r32[r8]
                r4 = r32[r9]
                r5 = r3
                r6 = r4
                r3 = r2
                r2 = r1
                goto L378
            L331:
                r30 = r3
                r32 = r4
                r14 = r9
                r2 = r11
                r3 = r22
                r22 = r8
                r11 = r10
                int r15 = r30 + 5
                r4 = r32[r15]
                int r27 = r30 + 6
                r5 = r32[r27]
                r6 = r32[r30]
                int r1 = r30 + 1
                r7 = r32[r1]
                int r1 = r30 + 2
                r8 = r32[r1]
                int r1 = r30 + 3
                r1 = r32[r1]
                r26 = 0
                int r1 = (r1 > r26 ? 1 : (r1 == r26 ? 0 : -1))
                if (r1 == 0) goto L35b
                r9 = r16
                goto L35d
            L35b:
                r9 = r25
            L35d:
                int r1 = r30 + 4
                r1 = r32[r1]
                int r1 = (r1 > r26 ? 1 : (r1 == r26 ? 0 : -1))
                if (r1 == 0) goto L36a
                r10 = r16
            L367:
                r1 = r34
                goto L36d
            L36a:
                r10 = r25
                goto L367
            L36d:
                a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
                r1 = r32[r15]
                r2 = r32[r27]
                r5 = r1
                r3 = r2
                r6 = r3
                r2 = r5
            L378:
                int r1 = r30 + r21
                r10 = r11
                r9 = r14
                r8 = r22
                r15 = r25
                r14 = 109(0x6d, float:1.53E-43)
                r11 = r2
                r22 = r3
                r2 = r10
                r3 = r1
                r1 = r34
                goto L4d
            L38b:
                r14 = r9
                r2 = r11
                r25 = r15
                r3 = r22
                r22 = r8
                r12[r25] = r2
                r12[r16] = r3
                r12[r17] = r5
                r12[r18] = r6
                r12[r19] = r23
                r12[r20] = r24
                char r2 = r14.f687a
                int r8 = r22 + 1
                r1 = r34
                r15 = r25
                r11 = 6
                r14 = 109(0x6d, float:1.53E-43)
                goto Ld
            L3ac:
                return
        }
    }

    public static float[] a(float[] r2, int r3) {
            if (r3 < 0) goto L16
            int r0 = r2.length
            if (r0 < 0) goto L10
            int r0 = java.lang.Math.min(r3, r0)
            float[] r3 = new float[r3]
            r1 = 0
            java.lang.System.arraycopy(r2, r1, r3, r1, r0)
            return r3
        L10:
            java.lang.ArrayIndexOutOfBoundsException r2 = new java.lang.ArrayIndexOutOfBoundsException
            r2.<init>()
            throw r2
        L16:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            r2.<init>()
            throw r2
    }

    public static a.C0374sc.a[] b(java.lang.String r17) {
            r0 = r17
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2 = 0
            r5 = r2
            r4 = 1
        La:
            int r6 = r0.length()
            if (r4 >= r6) goto Lde
        L10:
            int r6 = r0.length()
            r7 = 69
            r8 = 101(0x65, float:1.42E-43)
            if (r4 >= r6) goto L34
            char r6 = r0.charAt(r4)
            int r9 = r6 + (-65)
            int r10 = r6 + (-90)
            int r10 = r10 * r9
            if (r10 <= 0) goto L2c
            int r9 = r6 + (-97)
            int r10 = r6 + (-122)
            int r10 = r10 * r9
            if (r10 > 0) goto L31
        L2c:
            if (r6 == r8) goto L31
            if (r6 == r7) goto L31
            goto L34
        L31:
            int r4 = r4 + 1
            goto L10
        L34:
            java.lang.String r5 = r0.substring(r5, r4)
            java.lang.String r5 = r5.trim()
            boolean r6 = r5.isEmpty()
            if (r6 != 0) goto Ld7
            char r6 = r5.charAt(r2)
            r9 = 122(0x7a, float:1.71E-43)
            if (r6 == r9) goto Lc9
            char r6 = r5.charAt(r2)
            r9 = 90
            if (r6 != r9) goto L54
            goto Lc9
        L54:
            int r6 = r5.length()     // Catch: java.lang.NumberFormatException -> Laa
            float[] r6 = new float[r6]     // Catch: java.lang.NumberFormatException -> Laa
            int r9 = r5.length()     // Catch: java.lang.NumberFormatException -> Laa
            r11 = r2
            r10 = 1
        L60:
            if (r10 >= r9) goto Lb4
            r13 = r2
            r14 = r13
            r15 = r14
            r16 = r15
            r12 = r10
        L68:
            int r3 = r5.length()     // Catch: java.lang.NumberFormatException -> Laa
            if (r12 >= r3) goto L9a
            char r3 = r5.charAt(r12)     // Catch: java.lang.NumberFormatException -> Laa
            r2 = 32
            if (r3 == r2) goto L91
            if (r3 == r7) goto L8f
            if (r3 == r8) goto L8f
            switch(r3) {
                case 44: goto L91;
                case 45: goto L88;
                case 46: goto L7e;
                default: goto L7d;
            }     // Catch: java.lang.NumberFormatException -> Laa
        L7d:
            goto L8d
        L7e:
            if (r14 != 0) goto L83
            r13 = 0
            r14 = 1
            goto L93
        L83:
            r13 = 0
            r15 = 1
            r16 = 1
            goto L93
        L88:
            if (r12 == r10) goto L8d
            if (r13 != 0) goto L8d
            goto L83
        L8d:
            r13 = 0
            goto L93
        L8f:
            r13 = 1
            goto L93
        L91:
            r13 = 0
            r15 = 1
        L93:
            if (r15 == 0) goto L96
            goto L9a
        L96:
            int r12 = r12 + 1
            r2 = 0
            goto L68
        L9a:
            if (r10 >= r12) goto Lac
            int r2 = r11 + 1
            java.lang.String r3 = r5.substring(r10, r12)     // Catch: java.lang.NumberFormatException -> Laa
            float r3 = java.lang.Float.parseFloat(r3)     // Catch: java.lang.NumberFormatException -> Laa
            r6[r11] = r3     // Catch: java.lang.NumberFormatException -> Laa
            r11 = r2
            goto Lac
        Laa:
            r0 = move-exception
            goto Lbb
        Lac:
            if (r16 == 0) goto Lb1
            r10 = r12
        Laf:
            r2 = 0
            goto L60
        Lb1:
            int r10 = r12 + 1
            goto Laf
        Lb4:
            float[] r2 = a(r6, r11)     // Catch: java.lang.NumberFormatException -> Laa
            r3 = r2
            r2 = 0
            goto Lcb
        Lbb:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "error in parsing \""
            java.lang.String r3 = "\""
            java.lang.String r2 = a.C0487z.g(r2, r5, r3)
            r1.<init>(r2, r0)
            throw r1
        Lc9:
            float[] r3 = new float[r2]
        Lcb:
            char r5 = r5.charAt(r2)
            a.sc$a r2 = new a.sc$a
            r2.<init>(r5, r3)
            r1.add(r2)
        Ld7:
            int r2 = r4 + 1
            r5 = r4
            r4 = r2
            r2 = 0
            goto La
        Lde:
            int r4 = r4 - r5
            r2 = 1
            if (r4 != r2) goto Lf8
            int r2 = r0.length()
            if (r5 >= r2) goto Lf8
            char r0 = r0.charAt(r5)
            r2 = 0
            float[] r3 = new float[r2]
            a.sc$a r4 = new a.sc$a
            r4.<init>(r0, r3)
            r1.add(r4)
            goto Lf9
        Lf8:
            r2 = 0
        Lf9:
            a.sc$a[] r0 = new a.C0374sc.a[r2]
            java.lang.Object[] r0 = r1.toArray(r0)
            a.sc$a[] r0 = (a.C0374sc.a[]) r0
            return r0
    }

    public static a.C0374sc.a[] c(a.C0374sc.a[] r4) {
            int r0 = r4.length
            a.sc$a[] r0 = new a.C0374sc.a[r0]
            r1 = 0
        L4:
            int r2 = r4.length
            if (r1 >= r2) goto L13
            a.sc$a r2 = new a.sc$a
            r3 = r4[r1]
            r2.<init>(r3)
            r0[r1] = r2
            int r1 = r1 + 1
            goto L4
        L13:
            return r0
    }
}
