package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ox {
    public char a;
    public float[] b;

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

    public static void b(defpackage.ox[] r31, android.graphics.Path r32) {
            r0 = r31
            r1 = r32
            r11 = 6
            float[] r12 = new float[r11]
            r13 = 109(0x6d, float:1.53E-43)
            r14 = 0
            r2 = r13
            r15 = r14
        Lc:
            int r3 = r0.length
            if (r15 >= r3) goto L388
            r3 = r0[r15]
            char r8 = r3.a
            float[] r9 = r3.b
            r3 = r12[r14]
            r16 = 1
            r4 = r12[r16]
            r17 = 2
            r5 = r12[r17]
            r18 = 3
            r6 = r12[r18]
            r19 = 4
            r7 = r12[r19]
            r20 = 5
            r10 = r12[r20]
            switch(r8) {
                case 65: goto L45;
                case 67: goto L42;
                case 72: goto L3f;
                case 81: goto L3c;
                case 83: goto L3c;
                case 86: goto L3f;
                case 90: goto L31;
                case 97: goto L45;
                case 99: goto L42;
                case 104: goto L3f;
                case 113: goto L3c;
                case 115: goto L3c;
                case 118: goto L3f;
                case 122: goto L31;
                default: goto L2e;
            }
        L2e:
            r21 = r17
            goto L47
        L31:
            r1.close()
            r1.moveTo(r7, r10)
            r3 = r7
            r5 = r3
            r4 = r10
            r6 = r4
            goto L2e
        L3c:
            r21 = r19
            goto L47
        L3f:
            r21 = r16
            goto L47
        L42:
            r21 = r11
            goto L47
        L45:
            r21 = 7
        L47:
            r22 = r4
            r23 = r7
            r24 = r10
            r10 = r3
            r3 = r14
        L4f:
            int r4 = r9.length
            if (r3 >= r4) goto L36c
            r4 = 65
            if (r8 == r4) goto L314
            r4 = 67
            if (r8 == r4) goto L2e6
            r11 = 72
            if (r8 == r11) goto L2d2
            r11 = 81
            if (r8 == r11) goto L2ac
            r25 = r14
            r14 = 86
            if (r8 == r14) goto L29c
            r14 = 97
            if (r8 == r14) goto L24c
            r14 = 99
            if (r8 == r14) goto L21f
            r7 = 104(0x68, float:1.46E-43)
            if (r8 == r7) goto L212
            r7 = 113(0x71, float:1.58E-43)
            if (r8 == r7) goto L1f1
            r4 = 118(0x76, float:1.65E-43)
            if (r8 == r4) goto L1e5
            r4 = 76
            if (r8 == r4) goto L1d5
            r4 = 77
            if (r8 == r4) goto L1b8
            r4 = 115(0x73, float:1.61E-43)
            r14 = 83
            r29 = 1073741824(0x40000000, float:2.0)
            if (r8 == r14) goto L178
            r14 = 116(0x74, float:1.63E-43)
            r11 = 84
            if (r8 == r11) goto L147
            r11 = 108(0x6c, float:1.51E-43)
            if (r8 == r11) goto L133
            if (r8 == r13) goto L114
            if (r8 == r4) goto Ld2
            if (r8 == r14) goto La6
            r28 = r3
        L9e:
            r27 = r9
            r3 = r22
        La2:
            r22 = r8
            goto L35b
        La6:
            if (r2 == r7) goto Lb6
            if (r2 == r14) goto Lb6
            r4 = 81
            if (r2 == r4) goto Lb6
            r4 = 84
            if (r2 != r4) goto Lb3
            goto Lb6
        Lb3:
            r2 = 0
            r7 = 0
            goto Lba
        Lb6:
            float r7 = r10 - r5
            float r2 = r22 - r6
        Lba:
            r4 = r9[r3]
            int r5 = r3 + 1
            r6 = r9[r5]
            r1.rQuadTo(r7, r2, r4, r6)
            float r7 = r7 + r10
            float r2 = r22 + r2
            r4 = r9[r3]
            float r10 = r10 + r4
            r4 = r9[r5]
            float r22 = r22 + r4
            r6 = r2
            r28 = r3
            r5 = r7
            goto L9e
        Ld2:
            r7 = 99
            if (r2 == r7) goto Le4
            if (r2 == r4) goto Le4
            r4 = 67
            if (r2 == r4) goto Le4
            r4 = 83
            if (r2 != r4) goto Le1
            goto Le4
        Le1:
            r2 = 0
            r7 = 0
            goto Led
        Le4:
            float r7 = r10 - r5
            float r2 = r22 - r6
            r30 = r7
            r7 = r2
            r2 = r30
        Led:
            r4 = r9[r3]
            int r11 = r3 + 1
            r5 = r9[r11]
            int r14 = r3 + 2
            r6 = r9[r14]
            int r26 = r3 + 3
            r27 = r3
            r3 = r7
            r7 = r9[r26]
            r28 = r27
            r1.rCubicTo(r2, r3, r4, r5, r6, r7)
            r2 = r9[r28]
            float r2 = r2 + r10
            r3 = r9[r11]
            float r3 = r22 + r3
            r4 = r9[r14]
            float r10 = r10 + r4
            r4 = r9[r26]
        L10f:
            float r22 = r22 + r4
            r5 = r2
            r6 = r3
            goto L9e
        L114:
            r28 = r3
            r2 = r9[r28]
            float r10 = r10 + r2
            int r3 = r28 + 1
            r3 = r9[r3]
            float r22 = r22 + r3
            if (r28 <= 0) goto L126
            r1.rLineTo(r2, r3)
            goto L9e
        L126:
            r1.rMoveTo(r2, r3)
            r27 = r9
            r23 = r10
            r3 = r22
            r24 = r3
            goto La2
        L133:
            r28 = r3
            r2 = r9[r28]
            int r3 = r28 + 1
            r4 = r9[r3]
            r1.rLineTo(r2, r4)
            r2 = r9[r28]
            float r10 = r10 + r2
            r2 = r9[r3]
        L143:
            float r22 = r22 + r2
            goto L9e
        L147:
            r28 = r3
            if (r2 == r7) goto L159
            if (r2 == r14) goto L159
            r4 = 81
            if (r2 == r4) goto L159
            r4 = 84
            if (r2 != r4) goto L156
            goto L159
        L156:
            r2 = r22
            goto L161
        L159:
            float r10 = r10 * r29
            float r10 = r10 - r5
            float r22 = r22 * r29
            float r22 = r22 - r6
            goto L156
        L161:
            r3 = r9[r28]
            int r4 = r28 + 1
            r5 = r9[r4]
            r1.quadTo(r10, r2, r3, r5)
            r3 = r9[r28]
            r4 = r9[r4]
            r6 = r2
            r22 = r8
            r27 = r9
            r5 = r10
            r10 = r3
            r3 = r4
            goto L35b
        L178:
            r28 = r3
            r7 = 99
            if (r2 == r7) goto L18d
            if (r2 == r4) goto L18d
            r4 = 67
            if (r2 == r4) goto L18d
            r4 = 83
            if (r2 != r4) goto L189
            goto L18d
        L189:
            r2 = r10
            r3 = r22
            goto L195
        L18d:
            float r10 = r10 * r29
            float r10 = r10 - r5
            float r22 = r22 * r29
            float r22 = r22 - r6
            goto L189
        L195:
            r4 = r9[r28]
            int r10 = r28 + 1
            r5 = r9[r10]
            int r11 = r28 + 2
            r6 = r9[r11]
            int r14 = r28 + 3
            r7 = r9[r14]
            r1.cubicTo(r2, r3, r4, r5, r6, r7)
            r2 = r9[r28]
            r3 = r9[r10]
            r4 = r9[r11]
            r5 = r9[r14]
            r6 = r3
            r10 = r4
            r3 = r5
            r22 = r8
            r27 = r9
        L1b5:
            r5 = r2
            goto L35b
        L1b8:
            r28 = r3
            r2 = r9[r28]
            int r3 = r28 + 1
            r3 = r9[r3]
            if (r28 <= 0) goto L1cc
            r1.lineTo(r2, r3)
        L1c5:
            r10 = r2
        L1c6:
            r22 = r8
            r27 = r9
            goto L35b
        L1cc:
            r1.moveTo(r2, r3)
            r10 = r2
            r23 = r10
            r24 = r3
            goto L1c6
        L1d5:
            r28 = r3
            r2 = r9[r28]
            int r3 = r28 + 1
            r4 = r9[r3]
            r1.lineTo(r2, r4)
            r2 = r9[r28]
            r3 = r9[r3]
            goto L1c5
        L1e5:
            r28 = r3
            r2 = r9[r28]
            r3 = 0
            r1.rLineTo(r3, r2)
            r2 = r9[r28]
            goto L143
        L1f1:
            r28 = r3
            r2 = r9[r28]
            int r3 = r28 + 1
            r4 = r9[r3]
            int r5 = r28 + 2
            r6 = r9[r5]
            int r7 = r28 + 3
            r11 = r9[r7]
            r1.rQuadTo(r2, r4, r6, r11)
            r2 = r9[r28]
            float r2 = r2 + r10
            r3 = r9[r3]
            float r3 = r22 + r3
            r4 = r9[r5]
            float r10 = r10 + r4
            r4 = r9[r7]
            goto L10f
        L212:
            r28 = r3
            r2 = r9[r28]
            r3 = 0
            r1.rLineTo(r2, r3)
            r2 = r9[r28]
            float r10 = r10 + r2
            goto L9e
        L21f:
            r28 = r3
            r2 = r9[r28]
            int r3 = r28 + 1
            r3 = r9[r3]
            int r11 = r28 + 2
            r4 = r9[r11]
            int r14 = r28 + 3
            r5 = r9[r14]
            int r26 = r28 + 4
            r6 = r9[r26]
            int r27 = r28 + 5
            r7 = r9[r27]
            r1.rCubicTo(r2, r3, r4, r5, r6, r7)
            r1 = r9[r11]
            float r1 = r1 + r10
            r2 = r9[r14]
            float r2 = r22 + r2
            r3 = r9[r26]
            float r10 = r10 + r3
            r3 = r9[r27]
            float r22 = r22 + r3
            r5 = r1
            r6 = r2
            goto L9e
        L24c:
            r28 = r3
            int r11 = r28 + 5
            r1 = r9[r11]
            float r4 = r1 + r10
            int r14 = r28 + 6
            r1 = r9[r14]
            float r5 = r1 + r22
            r6 = r9[r28]
            int r3 = r28 + 1
            r7 = r9[r3]
            int r3 = r28 + 2
            r1 = r9[r3]
            int r3 = r28 + 3
            r2 = r9[r3]
            r26 = 0
            int r2 = (r2 > r26 ? 1 : (r2 == r26 ? 0 : -1))
            if (r2 == 0) goto L272
            r2 = r9
            r9 = r16
            goto L275
        L272:
            r2 = r9
            r9 = r25
        L275:
            int r3 = r28 + 4
            r3 = r2[r3]
            int r3 = (r3 > r26 ? 1 : (r3 == r26 ? 0 : -1))
            r27 = r2
            r2 = r10
            if (r3 == 0) goto L28a
            r10 = r16
        L282:
            r3 = r22
            r22 = r8
            r8 = r1
            r1 = r32
            goto L28d
        L28a:
            r10 = r25
            goto L282
        L28d:
            a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r4 = r27[r11]
            float r10 = r2 + r4
            r2 = r27[r14]
            float r2 = r2 + r3
            r3 = r2
            r6 = r3
            r5 = r10
            goto L35b
        L29c:
            r28 = r3
            r22 = r8
            r27 = r9
            r2 = r10
            r3 = r27[r28]
            r1.lineTo(r2, r3)
            r3 = r27[r28]
            goto L35b
        L2ac:
            r28 = r3
            r22 = r8
            r27 = r9
            r25 = r14
            r2 = r27[r28]
            int r3 = r28 + 1
            r4 = r27[r3]
            int r5 = r28 + 2
            r6 = r27[r5]
            int r7 = r28 + 3
            r8 = r27[r7]
            r1.quadTo(r2, r4, r6, r8)
            r2 = r27[r28]
            r3 = r27[r3]
            r4 = r27[r5]
            r5 = r27[r7]
            r6 = r3
            r10 = r4
            r3 = r5
            goto L1b5
        L2d2:
            r28 = r3
            r27 = r9
            r25 = r14
            r3 = r22
            r22 = r8
            r2 = r27[r28]
            r1.lineTo(r2, r3)
            r2 = r27[r28]
            r10 = r2
            goto L35b
        L2e6:
            r28 = r3
            r22 = r8
            r27 = r9
            r25 = r14
            r2 = r27[r28]
            int r3 = r28 + 1
            r3 = r27[r3]
            int r8 = r28 + 2
            r4 = r27[r8]
            int r9 = r28 + 3
            r5 = r27[r9]
            int r10 = r28 + 4
            r6 = r27[r10]
            int r11 = r28 + 5
            r7 = r27[r11]
            r1.cubicTo(r2, r3, r4, r5, r6, r7)
            r1 = r27[r10]
            r2 = r27[r11]
            r3 = r27[r8]
            r4 = r27[r9]
            r10 = r1
            r5 = r3
            r6 = r4
            r3 = r2
            goto L35b
        L314:
            r28 = r3
            r27 = r9
            r2 = r10
            r25 = r14
            r3 = r22
            r22 = r8
            int r11 = r28 + 5
            r4 = r27[r11]
            int r14 = r28 + 6
            r5 = r27[r14]
            r6 = r27[r28]
            int r1 = r28 + 1
            r7 = r27[r1]
            int r1 = r28 + 2
            r8 = r27[r1]
            int r1 = r28 + 3
            r1 = r27[r1]
            r26 = 0
            int r1 = (r1 > r26 ? 1 : (r1 == r26 ? 0 : -1))
            if (r1 == 0) goto L33e
            r9 = r16
            goto L340
        L33e:
            r9 = r25
        L340:
            int r1 = r28 + 4
            r1 = r27[r1]
            int r1 = (r1 > r26 ? 1 : (r1 == r26 ? 0 : -1))
            if (r1 == 0) goto L34d
            r10 = r16
        L34a:
            r1 = r32
            goto L350
        L34d:
            r10 = r25
            goto L34a
        L350:
            a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r1 = r27[r11]
            r2 = r27[r14]
            r5 = r1
            r10 = r5
            r3 = r2
            r6 = r3
        L35b:
            int r1 = r28 + r21
            r2 = r22
            r8 = r2
            r14 = r25
            r9 = r27
            r11 = 6
            r22 = r3
            r3 = r1
            r1 = r32
            goto L4f
        L36c:
            r2 = r10
            r25 = r14
            r3 = r22
            r12[r25] = r2
            r12[r16] = r3
            r12[r17] = r5
            r12[r18] = r6
            r12[r19] = r23
            r12[r20] = r24
            r1 = r0[r15]
            char r2 = r1.a
            int r15 = r15 + 1
            r1 = r32
            r11 = 6
            goto Lc
        L388:
            return
    }
}
