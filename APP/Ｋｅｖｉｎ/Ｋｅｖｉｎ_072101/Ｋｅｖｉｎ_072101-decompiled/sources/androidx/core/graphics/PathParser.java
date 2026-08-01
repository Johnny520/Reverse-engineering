package androidx.core.graphics;

/* JADX INFO: loaded from: classes2.dex */
public class PathParser {
    private static final java.lang.String LOGTAG = "PathParser";

    private static class ExtractFloatResult {
        int mEndPosition;
        boolean mEndWithNegOrDot;

        ExtractFloatResult() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    public static class PathDataNode {
        public float[] mParams;
        public char mType;

        PathDataNode(char r1, float[] r2) {
                r0 = this;
                r0.<init>()
                r0.mType = r1
                r0.mParams = r2
                return
        }

        PathDataNode(androidx.core.graphics.PathParser.PathDataNode r4) {
                r3 = this;
                r3.<init>()
                char r0 = r4.mType
                r3.mType = r0
                float[] r0 = r4.mParams
                float[] r1 = r4.mParams
                int r1 = r1.length
                r2 = 0
                float[] r0 = androidx.core.graphics.PathParser.copyOfRange(r0, r2, r1)
                r3.mParams = r0
                return
        }

        private static void addCommand(android.graphics.Path r25, float[] r26, char r27, char r28, float[] r29) {
                r10 = r25
                r11 = r29
                r0 = 2
                r12 = 0
                r1 = r26[r12]
                r13 = 1
                r2 = r26[r13]
                r14 = 2
                r3 = r26[r14]
                r15 = 3
                r4 = r26[r15]
                r16 = 4
                r5 = r26[r16]
                r17 = 5
                r6 = r26[r17]
                switch(r28) {
                    case 65: goto L3c;
                    case 67: goto L38;
                    case 72: goto L34;
                    case 76: goto L30;
                    case 77: goto L30;
                    case 81: goto L2c;
                    case 83: goto L2c;
                    case 84: goto L30;
                    case 86: goto L34;
                    case 90: goto L1f;
                    case 97: goto L3c;
                    case 99: goto L38;
                    case 104: goto L34;
                    case 108: goto L30;
                    case 109: goto L30;
                    case 113: goto L2c;
                    case 115: goto L2c;
                    case 116: goto L30;
                    case 118: goto L34;
                    case 122: goto L1f;
                    default: goto L1c;
                }
            L1c:
                r18 = r0
                goto L3f
            L1f:
                r25.close()
                r1 = r5
                r2 = r6
                r3 = r5
                r4 = r6
                r10.moveTo(r1, r2)
                r18 = r0
                goto L3f
            L2c:
                r0 = 4
                r18 = r0
                goto L3f
            L30:
                r0 = 2
                r18 = r0
                goto L3f
            L34:
                r0 = 1
                r18 = r0
                goto L3f
            L38:
                r0 = 6
                r18 = r0
                goto L3f
            L3c:
                r0 = 7
                r18 = r0
            L3f:
                r0 = 0
                r9 = r27
                r8 = r0
                r7 = r1
                r19 = r3
                r20 = r4
                r21 = r5
                r22 = r6
                r6 = r2
            L4d:
                int r0 = r11.length
                if (r8 >= r0) goto L3d6
                r0 = 84
                r1 = 83
                r2 = 81
                r3 = 67
                r4 = 116(0x74, float:1.63E-43)
                r5 = 115(0x73, float:1.61E-43)
                r15 = 113(0x71, float:1.58E-43)
                r14 = 99
                r23 = 1073741824(0x40000000, float:2.0)
                r13 = 0
                switch(r28) {
                    case 65: goto L384;
                    case 67: goto L34b;
                    case 72: goto L338;
                    case 76: goto L31c;
                    case 77: goto L2e9;
                    case 81: goto L2b9;
                    case 83: goto L26d;
                    case 84: goto L238;
                    case 86: goto L220;
                    case 97: goto L1cc;
                    case 99: goto L18f;
                    case 104: goto L17d;
                    case 108: goto L161;
                    case 109: goto L12d;
                    case 113: goto Lfa;
                    case 115: goto Lae;
                    case 116: goto L7e;
                    case 118: goto L6d;
                    default: goto L66;
                }
            L66:
                r12 = r6
                r14 = r7
                r24 = r8
                r15 = r9
                goto L3cc
            L6d:
                int r0 = r8 + 0
                r0 = r11[r0]
                r10.rLineTo(r13, r0)
                int r0 = r8 + 0
                r0 = r11[r0]
                float r6 = r6 + r0
                r24 = r8
                r15 = r9
                goto L3cc
            L7e:
                r1 = 0
                r3 = 0
                if (r9 == r15) goto L88
                if (r9 == r4) goto L88
                if (r9 == r2) goto L88
                if (r9 != r0) goto L8c
            L88:
                float r1 = r7 - r19
                float r3 = r6 - r20
            L8c:
                int r0 = r8 + 0
                r0 = r11[r0]
                int r2 = r8 + 1
                r2 = r11[r2]
                r10.rQuadTo(r1, r3, r0, r2)
                float r0 = r7 + r1
                float r2 = r6 + r3
                int r4 = r8 + 0
                r4 = r11[r4]
                float r7 = r7 + r4
                int r4 = r8 + 1
                r4 = r11[r4]
                float r6 = r6 + r4
                r19 = r0
                r20 = r2
                r24 = r8
                r15 = r9
                goto L3cc
            Lae:
                r0 = 0
                r2 = 0
                if (r9 == r14) goto Lbc
                if (r9 == r5) goto Lbc
                if (r9 == r3) goto Lbc
                if (r9 != r1) goto Lb9
                goto Lbc
            Lb9:
                r13 = r0
                r14 = r2
                goto Lc2
            Lbc:
                float r0 = r7 - r19
                float r2 = r6 - r20
                r13 = r0
                r14 = r2
            Lc2:
                int r0 = r8 + 0
                r3 = r11[r0]
                int r0 = r8 + 1
                r4 = r11[r0]
                int r0 = r8 + 2
                r5 = r11[r0]
                int r0 = r8 + 3
                r15 = r11[r0]
                r0 = r25
                r1 = r13
                r2 = r14
                r12 = r6
                r6 = r15
                r0.rCubicTo(r1, r2, r3, r4, r5, r6)
                int r0 = r8 + 0
                r0 = r11[r0]
                float r0 = r0 + r7
                int r1 = r8 + 1
                r1 = r11[r1]
                float r6 = r12 + r1
                int r1 = r8 + 2
                r1 = r11[r1]
                float r7 = r7 + r1
                int r1 = r8 + 3
                r1 = r11[r1]
                float r1 = r1 + r12
                r19 = r0
                r20 = r6
                r24 = r8
                r15 = r9
                r6 = r1
                goto L3cc
            Lfa:
                r12 = r6
                int r0 = r8 + 0
                r0 = r11[r0]
                int r1 = r8 + 1
                r1 = r11[r1]
                int r2 = r8 + 2
                r2 = r11[r2]
                int r3 = r8 + 3
                r3 = r11[r3]
                r10.rQuadTo(r0, r1, r2, r3)
                int r0 = r8 + 0
                r0 = r11[r0]
                float r0 = r0 + r7
                int r1 = r8 + 1
                r1 = r11[r1]
                float r6 = r12 + r1
                int r1 = r8 + 2
                r1 = r11[r1]
                float r7 = r7 + r1
                int r1 = r8 + 3
                r1 = r11[r1]
                float r1 = r1 + r12
                r19 = r0
                r20 = r6
                r24 = r8
                r15 = r9
                r6 = r1
                goto L3cc
            L12d:
                r12 = r6
                int r0 = r8 + 0
                r0 = r11[r0]
                float r7 = r7 + r0
                int r0 = r8 + 1
                r0 = r11[r0]
                float r6 = r12 + r0
                if (r8 <= 0) goto L14b
                int r0 = r8 + 0
                r0 = r11[r0]
                int r1 = r8 + 1
                r1 = r11[r1]
                r10.rLineTo(r0, r1)
                r24 = r8
                r15 = r9
                goto L3cc
            L14b:
                int r0 = r8 + 0
                r0 = r11[r0]
                int r1 = r8 + 1
                r1 = r11[r1]
                r10.rMoveTo(r0, r1)
                r0 = r7
                r1 = r6
                r21 = r0
                r22 = r1
                r24 = r8
                r15 = r9
                goto L3cc
            L161:
                r12 = r6
                int r0 = r8 + 0
                r0 = r11[r0]
                int r1 = r8 + 1
                r1 = r11[r1]
                r10.rLineTo(r0, r1)
                int r0 = r8 + 0
                r0 = r11[r0]
                float r7 = r7 + r0
                int r0 = r8 + 1
                r0 = r11[r0]
                float r6 = r12 + r0
                r24 = r8
                r15 = r9
                goto L3cc
            L17d:
                r12 = r6
                int r0 = r8 + 0
                r0 = r11[r0]
                r10.rLineTo(r0, r13)
                int r0 = r8 + 0
                r0 = r11[r0]
                float r7 = r7 + r0
                r24 = r8
                r15 = r9
                goto L3cc
            L18f:
                r12 = r6
                int r0 = r8 + 0
                r1 = r11[r0]
                int r0 = r8 + 1
                r2 = r11[r0]
                int r0 = r8 + 2
                r3 = r11[r0]
                int r0 = r8 + 3
                r4 = r11[r0]
                int r0 = r8 + 4
                r5 = r11[r0]
                int r0 = r8 + 5
                r6 = r11[r0]
                r0 = r25
                r0.rCubicTo(r1, r2, r3, r4, r5, r6)
                int r0 = r8 + 2
                r0 = r11[r0]
                float r0 = r0 + r7
                int r1 = r8 + 3
                r1 = r11[r1]
                float r6 = r12 + r1
                int r1 = r8 + 4
                r1 = r11[r1]
                float r7 = r7 + r1
                int r1 = r8 + 5
                r1 = r11[r1]
                float r1 = r1 + r12
                r19 = r0
                r20 = r6
                r24 = r8
                r15 = r9
                r6 = r1
                goto L3cc
            L1cc:
                r12 = r6
                int r0 = r8 + 5
                r0 = r11[r0]
                float r3 = r0 + r7
                int r0 = r8 + 6
                r0 = r11[r0]
                float r4 = r0 + r12
                int r0 = r8 + 0
                r5 = r11[r0]
                int r0 = r8 + 1
                r6 = r11[r0]
                int r0 = r8 + 2
                r14 = r11[r0]
                int r0 = r8 + 3
                r0 = r11[r0]
                int r0 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
                if (r0 == 0) goto L1ef
                r15 = 1
                goto L1f0
            L1ef:
                r15 = 0
            L1f0:
                int r0 = r8 + 4
                r0 = r11[r0]
                int r0 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
                if (r0 == 0) goto L1fa
                r13 = 1
                goto L1fb
            L1fa:
                r13 = 0
            L1fb:
                r0 = r25
                r1 = r7
                r2 = r12
                r10 = r7
                r7 = r14
                r24 = r8
                r8 = r15
                r14 = r9
                r9 = r13
                drawArc(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
                int r8 = r24 + 5
                r0 = r11[r8]
                float r7 = r10 + r0
                int r8 = r24 + 6
                r0 = r11[r8]
                float r6 = r12 + r0
                r0 = r7
                r1 = r6
                r10 = r25
                r19 = r0
                r20 = r1
                r15 = r14
                goto L3cc
            L220:
                r12 = r6
                r10 = r7
                r24 = r8
                r14 = r9
                int r8 = r24 + 0
                r0 = r11[r8]
                r9 = r10
                r10 = r25
                r10.lineTo(r9, r0)
                int r8 = r24 + 0
                r0 = r11[r8]
                r6 = r0
                r7 = r9
                r15 = r14
                goto L3cc
            L238:
                r12 = r6
                r24 = r8
                r14 = r9
                r9 = r7
                r1 = r9
                r3 = r12
                if (r14 == r15) goto L247
                if (r14 == r4) goto L247
                if (r14 == r2) goto L247
                if (r14 != r0) goto L24f
            L247:
                float r7 = r9 * r23
                float r1 = r7 - r19
                float r6 = r12 * r23
                float r3 = r6 - r20
            L24f:
                int r8 = r24 + 0
                r0 = r11[r8]
                int r8 = r24 + 1
                r2 = r11[r8]
                r10.quadTo(r1, r3, r0, r2)
                r0 = r1
                r2 = r3
                int r8 = r24 + 0
                r4 = r11[r8]
                int r8 = r24 + 1
                r5 = r11[r8]
                r19 = r0
                r20 = r2
                r7 = r4
                r6 = r5
                r15 = r14
                goto L3cc
            L26d:
                r12 = r6
                r24 = r8
                r15 = r9
                r9 = r7
                r0 = r9
                r2 = r12
                if (r15 == r14) goto L280
                if (r15 == r5) goto L280
                if (r15 == r3) goto L280
                if (r15 != r1) goto L27d
                goto L280
            L27d:
                r7 = r0
                r8 = r2
                goto L28a
            L280:
                float r7 = r9 * r23
                float r0 = r7 - r19
                float r6 = r12 * r23
                float r2 = r6 - r20
                r7 = r0
                r8 = r2
            L28a:
                int r0 = r24 + 0
                r3 = r11[r0]
                int r0 = r24 + 1
                r4 = r11[r0]
                int r0 = r24 + 2
                r5 = r11[r0]
                int r0 = r24 + 3
                r6 = r11[r0]
                r0 = r25
                r1 = r7
                r2 = r8
                r0.cubicTo(r1, r2, r3, r4, r5, r6)
                int r0 = r24 + 0
                r0 = r11[r0]
                int r1 = r24 + 1
                r1 = r11[r1]
                int r2 = r24 + 2
                r2 = r11[r2]
                int r3 = r24 + 3
                r3 = r11[r3]
                r19 = r0
                r20 = r1
                r7 = r2
                r6 = r3
                goto L3cc
            L2b9:
                r12 = r6
                r24 = r8
                r15 = r9
                r9 = r7
                int r8 = r24 + 0
                r0 = r11[r8]
                int r8 = r24 + 1
                r1 = r11[r8]
                int r8 = r24 + 2
                r2 = r11[r8]
                int r8 = r24 + 3
                r3 = r11[r8]
                r10.quadTo(r0, r1, r2, r3)
                int r8 = r24 + 0
                r0 = r11[r8]
                int r8 = r24 + 1
                r1 = r11[r8]
                int r8 = r24 + 2
                r2 = r11[r8]
                int r8 = r24 + 3
                r3 = r11[r8]
                r19 = r0
                r20 = r1
                r7 = r2
                r6 = r3
                goto L3cc
            L2e9:
                r12 = r6
                r24 = r8
                r15 = r9
                r9 = r7
                int r8 = r24 + 0
                r0 = r11[r8]
                int r8 = r24 + 1
                r1 = r11[r8]
                if (r24 <= 0) goto L307
                int r8 = r24 + 0
                r2 = r11[r8]
                int r8 = r24 + 1
                r3 = r11[r8]
                r10.lineTo(r2, r3)
                r7 = r0
                r6 = r1
                goto L3cc
            L307:
                int r8 = r24 + 0
                r2 = r11[r8]
                int r8 = r24 + 1
                r3 = r11[r8]
                r10.moveTo(r2, r3)
                r2 = r0
                r3 = r1
                r7 = r0
                r6 = r1
                r21 = r2
                r22 = r3
                goto L3cc
            L31c:
                r12 = r6
                r24 = r8
                r15 = r9
                r9 = r7
                int r8 = r24 + 0
                r0 = r11[r8]
                int r8 = r24 + 1
                r1 = r11[r8]
                r10.lineTo(r0, r1)
                int r8 = r24 + 0
                r0 = r11[r8]
                int r8 = r24 + 1
                r1 = r11[r8]
                r7 = r0
                r6 = r1
                goto L3cc
            L338:
                r12 = r6
                r24 = r8
                r15 = r9
                r9 = r7
                int r8 = r24 + 0
                r0 = r11[r8]
                r10.lineTo(r0, r12)
                int r8 = r24 + 0
                r0 = r11[r8]
                r7 = r0
                goto L3cc
            L34b:
                r12 = r6
                r24 = r8
                r15 = r9
                r9 = r7
                int r8 = r24 + 0
                r1 = r11[r8]
                int r8 = r24 + 1
                r2 = r11[r8]
                int r8 = r24 + 2
                r3 = r11[r8]
                int r8 = r24 + 3
                r4 = r11[r8]
                int r8 = r24 + 4
                r5 = r11[r8]
                int r8 = r24 + 5
                r6 = r11[r8]
                r0 = r25
                r0.cubicTo(r1, r2, r3, r4, r5, r6)
                int r8 = r24 + 4
                r0 = r11[r8]
                int r8 = r24 + 5
                r1 = r11[r8]
                int r8 = r24 + 2
                r2 = r11[r8]
                int r8 = r24 + 3
                r3 = r11[r8]
                r7 = r0
                r6 = r1
                r19 = r2
                r20 = r3
                goto L3cc
            L384:
                r12 = r6
                r24 = r8
                r15 = r9
                r9 = r7
                int r8 = r24 + 5
                r3 = r11[r8]
                int r8 = r24 + 6
                r4 = r11[r8]
                int r8 = r24 + 0
                r5 = r11[r8]
                int r8 = r24 + 1
                r6 = r11[r8]
                int r8 = r24 + 2
                r7 = r11[r8]
                int r8 = r24 + 3
                r0 = r11[r8]
                int r0 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
                if (r0 == 0) goto L3a7
                r8 = 1
                goto L3a8
            L3a7:
                r8 = 0
            L3a8:
                int r0 = r24 + 4
                r0 = r11[r0]
                int r0 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
                if (r0 == 0) goto L3b2
                r13 = 1
                goto L3b3
            L3b2:
                r13 = 0
            L3b3:
                r0 = r25
                r1 = r9
                r2 = r12
                r14 = r9
                r9 = r13
                drawArc(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
                int r8 = r24 + 5
                r0 = r11[r8]
                int r8 = r24 + 6
                r1 = r11[r8]
                r2 = r0
                r3 = r1
                r7 = r0
                r6 = r1
                r19 = r2
                r20 = r3
            L3cc:
                r9 = r28
                int r8 = r24 + r18
                r12 = 0
                r13 = 1
                r14 = 2
                r15 = 3
                goto L4d
            L3d6:
                r12 = r6
                r14 = r7
                r0 = 0
                r26[r0] = r14
                r0 = 1
                r26[r0] = r12
                r0 = 2
                r26[r0] = r19
                r0 = 3
                r26[r0] = r20
                r26[r16] = r21
                r26[r17] = r22
                return
        }

        private static void arcToBezier(android.graphics.Path r62, double r63, double r65, double r67, double r69, double r71, double r73, double r75, double r77, double r79) {
                r0 = r67
                r2 = 4616189618054758400(0x4010000000000000, double:4.0)
                double r4 = r79 * r2
                r6 = 4614256656552045848(0x400921fb54442d18, double:3.141592653589793)
                double r4 = r4 / r6
                double r4 = java.lang.Math.abs(r4)
                double r4 = java.lang.Math.ceil(r4)
                int r4 = (int) r4
                r5 = r77
                double r7 = java.lang.Math.cos(r75)
                double r9 = java.lang.Math.sin(r75)
                double r11 = java.lang.Math.cos(r5)
                double r13 = java.lang.Math.sin(r5)
                double r2 = -r0
                double r2 = r2 * r7
                double r2 = r2 * r13
                double r17 = r69 * r9
                double r17 = r17 * r11
                double r2 = r2 - r17
                r17 = r2
                double r2 = -r0
                double r2 = r2 * r9
                double r2 = r2 * r13
                double r19 = r69 * r7
                double r19 = r19 * r11
                double r2 = r2 + r19
                r19 = r2
                double r2 = (double) r4
                double r2 = r79 / r2
                r21 = 0
                r23 = r5
                r15 = r21
                r5 = r71
                r21 = r17
                r17 = r73
            L4c:
                if (r15 >= r4) goto L10f
                double r27 = r23 + r2
                double r29 = java.lang.Math.sin(r27)
                double r31 = java.lang.Math.cos(r27)
                double r33 = r0 * r7
                double r33 = r33 * r31
                double r33 = r63 + r33
                double r35 = r69 * r9
                double r35 = r35 * r29
                r37 = r2
                double r2 = r33 - r35
                double r33 = r0 * r9
                double r33 = r33 * r31
                double r33 = r65 + r33
                double r35 = r69 * r7
                double r35 = r35 * r29
                r39 = r11
                double r11 = r33 + r35
                r33 = r13
                double r13 = -r0
                double r13 = r13 * r7
                double r13 = r13 * r29
                double r35 = r69 * r9
                double r35 = r35 * r31
                double r13 = r13 - r35
                r71 = r11
                double r11 = -r0
                double r11 = r11 * r9
                double r11 = r11 * r29
                double r35 = r69 * r7
                double r35 = r35 * r31
                double r11 = r11 + r35
                double r35 = r27 - r23
                r41 = 4611686018427387904(0x4000000000000000, double:2.0)
                double r35 = r35 / r41
                double r35 = java.lang.Math.tan(r35)
                double r41 = r27 - r23
                double r41 = java.lang.Math.sin(r41)
                r43 = 4613937818241073152(0x4008000000000000, double:3.0)
                double r45 = r35 * r43
                double r45 = r45 * r35
                r25 = 4616189618054758400(0x4010000000000000, double:4.0)
                double r45 = r45 + r25
                double r45 = java.lang.Math.sqrt(r45)
                r47 = 4607182418800017408(0x3ff0000000000000, double:1.0)
                double r45 = r45 - r47
                double r41 = r41 * r45
                double r41 = r41 / r43
                double r43 = r41 * r21
                double r0 = r5 + r43
                double r43 = r41 * r19
                r16 = r4
                r73 = r5
                double r4 = r17 + r43
                double r43 = r41 * r13
                r45 = r7
                double r6 = r2 - r43
                double r43 = r41 * r11
                r47 = r9
                r8 = r71
                r71 = r11
                double r10 = r8 - r43
                r12 = 0
                r43 = r15
                r15 = r62
                r15.rLineTo(r12, r12)
                float r12 = (float) r0
                r56 = r0
                float r0 = (float) r4
                float r1 = (float) r6
                r58 = r4
                float r4 = (float) r10
                float r5 = (float) r2
                r60 = r6
                float r6 = (float) r8
                r49 = r62
                r50 = r12
                r51 = r0
                r52 = r1
                r53 = r4
                r54 = r5
                r55 = r6
                r49.cubicTo(r50, r51, r52, r53, r54, r55)
                r23 = r27
                r5 = r2
                r17 = r8
                r21 = r13
                r19 = r71
                int r0 = r43 + 1
                r15 = r0
                r4 = r16
                r13 = r33
                r2 = r37
                r11 = r39
                r7 = r45
                r9 = r47
                r0 = r67
                goto L4c
            L10f:
                return
        }

        private static void drawArc(android.graphics.Path r73, float r74, float r75, float r76, float r77, float r78, float r79, float r80, boolean r81, boolean r82) {
                r10 = r74
                r11 = r75
                r12 = r76
                r13 = r77
                r14 = r78
                r15 = r79
                r9 = r82
                r8 = r80
                double r0 = (double) r8
                double r35 = java.lang.Math.toRadians(r0)
                double r37 = java.lang.Math.cos(r35)
                double r39 = java.lang.Math.sin(r35)
                double r0 = (double) r10
                double r0 = r0 * r37
                double r2 = (double) r11
                double r2 = r2 * r39
                double r0 = r0 + r2
                double r2 = (double) r14
                double r41 = r0 / r2
                float r0 = -r10
                double r0 = (double) r0
                double r0 = r0 * r39
                double r2 = (double) r11
                double r2 = r2 * r37
                double r0 = r0 + r2
                double r2 = (double) r15
                double r43 = r0 / r2
                double r0 = (double) r12
                double r0 = r0 * r37
                double r2 = (double) r13
                double r2 = r2 * r39
                double r0 = r0 + r2
                double r2 = (double) r14
                double r45 = r0 / r2
                float r0 = -r12
                double r0 = (double) r0
                double r0 = r0 * r39
                double r2 = (double) r13
                double r2 = r2 * r37
                double r0 = r0 + r2
                double r2 = (double) r15
                double r47 = r0 / r2
                double r49 = r41 - r45
                double r51 = r43 - r47
                double r0 = r41 + r45
                r2 = 4611686018427387904(0x4000000000000000, double:2.0)
                double r53 = r0 / r2
                double r0 = r43 + r47
                double r55 = r0 / r2
                double r0 = r49 * r49
                double r2 = r51 * r51
                double r6 = r0 + r2
                r0 = 0
                int r2 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
                java.lang.String r3 = "PathParser"
                if (r2 != 0) goto L69
                java.lang.String r0 = " Points are coincident"
                android.util.Log.w(r3, r0)
                return
            L69:
                r4 = 4607182418800017408(0x3ff0000000000000, double:1.0)
                double r4 = r4 / r6
                r16 = 4598175219545276416(0x3fd0000000000000, double:0.25)
                double r57 = r4 - r16
                int r2 = (r57 > r0 ? 1 : (r57 == r0 ? 0 : -1))
                if (r2 >= 0) goto Lb6
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Points are too far apart "
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.StringBuilder r0 = r0.append(r6)
                java.lang.String r0 = r0.toString()
                android.util.Log.w(r3, r0)
                double r0 = java.lang.Math.sqrt(r6)
                r2 = 4611685973391391630(0x3ffffff583a53b8e, double:1.99999)
                double r0 = r0 / r2
                float r5 = (float) r0
                float r16 = r14 * r5
                float r17 = r15 * r5
                r0 = r73
                r1 = r74
                r2 = r75
                r3 = r76
                r4 = r77
                r18 = r5
                r5 = r16
                r59 = r6
                r6 = r17
                r7 = r80
                r8 = r81
                r12 = r9
                r9 = r82
                drawArc(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
                return
            Lb6:
                r59 = r6
                r12 = r9
                double r2 = java.lang.Math.sqrt(r57)
                double r4 = r2 * r49
                double r6 = r2 * r51
                r8 = r81
                if (r8 != r12) goto Lca
                double r16 = r53 - r6
                double r18 = r55 + r4
                goto Lce
            Lca:
                double r16 = r53 + r6
                double r18 = r55 - r4
            Lce:
                double r0 = r43 - r18
                r61 = r2
                double r2 = r41 - r16
                double r0 = java.lang.Math.atan2(r0, r2)
                double r2 = r47 - r18
                r63 = r4
                double r4 = r45 - r16
                double r2 = java.lang.Math.atan2(r2, r4)
                double r4 = r2 - r0
                r20 = 0
                int r9 = (r4 > r20 ? 1 : (r4 == r20 ? 0 : -1))
                if (r9 < 0) goto Lec
                r9 = 1
                goto Led
            Lec:
                r9 = 0
            Led:
                if (r12 == r9) goto Lfd
                int r9 = (r4 > r20 ? 1 : (r4 == r20 ? 0 : -1))
                r20 = 4618760256179416344(0x401921fb54442d18, double:6.283185307179586)
                if (r9 <= 0) goto Lfb
                double r4 = r4 - r20
                goto Lfd
            Lfb:
                double r4 = r4 + r20
            Lfd:
                r65 = r2
                double r2 = (double) r14
                double r16 = r16 * r2
                double r2 = (double) r15
                double r2 = r2 * r18
                r67 = r16
                double r18 = r16 * r37
                double r20 = r2 * r39
                double r69 = r18 - r20
                r17 = r69
                double r19 = r67 * r39
                double r21 = r2 * r37
                double r2 = r19 + r21
                r19 = r2
                r71 = r2
                double r2 = (double) r14
                r21 = r2
                double r2 = (double) r15
                r23 = r2
                double r2 = (double) r10
                r25 = r2
                double r2 = (double) r11
                r27 = r2
                r16 = r73
                r29 = r35
                r31 = r0
                r33 = r4
                arcToBezier(r16, r17, r19, r21, r23, r25, r27, r29, r31, r33)
                return
        }

        public static void nodesToPath(androidx.core.graphics.PathParser.PathDataNode[] r5, android.graphics.Path r6) {
                r0 = 6
                float[] r0 = new float[r0]
                r1 = 109(0x6d, float:1.53E-43)
                r2 = 0
            L6:
                int r3 = r5.length
                if (r2 >= r3) goto L1b
                r3 = r5[r2]
                char r3 = r3.mType
                r4 = r5[r2]
                float[] r4 = r4.mParams
                addCommand(r6, r0, r1, r3, r4)
                r3 = r5[r2]
                char r1 = r3.mType
                int r2 = r2 + 1
                goto L6
            L1b:
                return
        }

        public void interpolatePathDataNode(androidx.core.graphics.PathParser.PathDataNode r5, androidx.core.graphics.PathParser.PathDataNode r6, float r7) {
                r4 = this;
                char r0 = r5.mType
                r4.mType = r0
                r0 = 0
            L5:
                float[] r1 = r5.mParams
                int r1 = r1.length
                if (r0 >= r1) goto L1f
                float[] r1 = r4.mParams
                float[] r2 = r5.mParams
                r2 = r2[r0]
                r3 = 1065353216(0x3f800000, float:1.0)
                float r3 = r3 - r7
                float r2 = r2 * r3
                float[] r3 = r6.mParams
                r3 = r3[r0]
                float r3 = r3 * r7
                float r2 = r2 + r3
                r1[r0] = r2
                int r0 = r0 + 1
                goto L5
            L1f:
                return
        }
    }

    private PathParser() {
            r0 = this;
            r0.<init>()
            return
    }

    private static void addNode(java.util.ArrayList<androidx.core.graphics.PathParser.PathDataNode> r1, char r2, float[] r3) {
            androidx.core.graphics.PathParser$PathDataNode r0 = new androidx.core.graphics.PathParser$PathDataNode
            r0.<init>(r2, r3)
            r1.add(r0)
            return
    }

    public static boolean canMorph(androidx.core.graphics.PathParser.PathDataNode[] r4, androidx.core.graphics.PathParser.PathDataNode[] r5) {
            r0 = 0
            if (r4 == 0) goto L2c
            if (r5 != 0) goto L6
            goto L2c
        L6:
            int r1 = r4.length
            int r2 = r5.length
            if (r1 == r2) goto Lb
            return r0
        Lb:
            r1 = 0
        Lc:
            int r2 = r4.length
            if (r1 >= r2) goto L2a
            r2 = r4[r1]
            char r2 = r2.mType
            r3 = r5[r1]
            char r3 = r3.mType
            if (r2 != r3) goto L29
            r2 = r4[r1]
            float[] r2 = r2.mParams
            int r2 = r2.length
            r3 = r5[r1]
            float[] r3 = r3.mParams
            int r3 = r3.length
            if (r2 == r3) goto L26
            goto L29
        L26:
            int r1 = r1 + 1
            goto Lc
        L29:
            return r0
        L2a:
            r0 = 1
            return r0
        L2c:
            return r0
    }

    static float[] copyOfRange(float[] r5, int r6, int r7) {
            if (r6 > r7) goto L1c
            int r0 = r5.length
            if (r6 < 0) goto L16
            if (r6 > r0) goto L16
            int r1 = r7 - r6
            int r2 = r0 - r6
            int r2 = java.lang.Math.min(r1, r2)
            float[] r3 = new float[r1]
            r4 = 0
            java.lang.System.arraycopy(r5, r6, r3, r4, r2)
            return r3
        L16:
            java.lang.ArrayIndexOutOfBoundsException r1 = new java.lang.ArrayIndexOutOfBoundsException
            r1.<init>()
            throw r1
        L1c:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>()
            throw r0
    }

    public static androidx.core.graphics.PathParser.PathDataNode[] createNodesFromPathData(java.lang.String r6) {
            if (r6 != 0) goto L4
            r0 = 0
            return r0
        L4:
            r0 = 0
            r1 = 1
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
        Lb:
            int r3 = r6.length()
            r4 = 0
            if (r1 >= r3) goto L34
            int r1 = nextStart(r6, r1)
            java.lang.String r3 = r6.substring(r0, r1)
            java.lang.String r3 = r3.trim()
            int r5 = r3.length()
            if (r5 <= 0) goto L2f
            float[] r5 = getFloats(r3)
            char r4 = r3.charAt(r4)
            addNode(r2, r4, r5)
        L2f:
            r0 = r1
            int r1 = r1 + 1
            goto Lb
        L34:
            int r3 = r1 - r0
            r5 = 1
            if (r3 != r5) goto L48
            int r3 = r6.length()
            if (r0 >= r3) goto L48
            char r3 = r6.charAt(r0)
            float[] r4 = new float[r4]
            addNode(r2, r3, r4)
        L48:
            int r3 = r2.size()
            androidx.core.graphics.PathParser$PathDataNode[] r3 = new androidx.core.graphics.PathParser.PathDataNode[r3]
            java.lang.Object[] r3 = r2.toArray(r3)
            androidx.core.graphics.PathParser$PathDataNode[] r3 = (androidx.core.graphics.PathParser.PathDataNode[]) r3
            return r3
    }

    public static android.graphics.Path createPathFromPathData(java.lang.String r6) {
            android.graphics.Path r0 = new android.graphics.Path
            r0.<init>()
            androidx.core.graphics.PathParser$PathDataNode[] r1 = createNodesFromPathData(r6)
            if (r1 == 0) goto L2a
            androidx.core.graphics.PathParser.PathDataNode.nodesToPath(r1, r0)     // Catch: java.lang.RuntimeException -> L10
            return r0
        L10:
            r2 = move-exception
            java.lang.RuntimeException r3 = new java.lang.RuntimeException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Error in parsing "
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.StringBuilder r4 = r4.append(r6)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4, r2)
            throw r3
        L2a:
            r2 = 0
            return r2
    }

    public static androidx.core.graphics.PathParser.PathDataNode[] deepCopyNodes(androidx.core.graphics.PathParser.PathDataNode[] r4) {
            if (r4 != 0) goto L4
            r0 = 0
            return r0
        L4:
            int r0 = r4.length
            androidx.core.graphics.PathParser$PathDataNode[] r0 = new androidx.core.graphics.PathParser.PathDataNode[r0]
            r1 = 0
        L8:
            int r2 = r4.length
            if (r1 >= r2) goto L17
            androidx.core.graphics.PathParser$PathDataNode r2 = new androidx.core.graphics.PathParser$PathDataNode
            r3 = r4[r1]
            r2.<init>(r3)
            r0[r1] = r2
            int r1 = r1 + 1
            goto L8
        L17:
            return r0
    }

    private static void extract(java.lang.String r7, int r8, androidx.core.graphics.PathParser.ExtractFloatResult r9) {
            r0 = r8
            r1 = 0
            r2 = 0
            r9.mEndWithNegOrDot = r2
            r2 = 0
            r3 = 0
        L7:
            int r4 = r7.length()
            if (r0 >= r4) goto L32
            r4 = r3
            r3 = 0
            char r5 = r7.charAt(r0)
            r6 = 1
            switch(r5) {
                case 32: goto L2a;
                case 44: goto L2a;
                case 45: goto L22;
                case 46: goto L1a;
                case 69: goto L18;
                case 101: goto L18;
                default: goto L17;
            }
        L17:
            goto L2c
        L18:
            r3 = 1
            goto L2c
        L1a:
            if (r2 != 0) goto L1e
            r2 = 1
            goto L2c
        L1e:
            r1 = 1
            r9.mEndWithNegOrDot = r6
            goto L2c
        L22:
            if (r0 == r8) goto L2c
            if (r4 != 0) goto L2c
            r1 = 1
            r9.mEndWithNegOrDot = r6
            goto L2c
        L2a:
            r1 = 1
        L2c:
            if (r1 == 0) goto L2f
            goto L32
        L2f:
            int r0 = r0 + 1
            goto L7
        L32:
            r9.mEndPosition = r0
            return
    }

    private static float[] getFloats(java.lang.String r9) {
            r0 = 0
            char r1 = r9.charAt(r0)
            r2 = 122(0x7a, float:1.71E-43)
            if (r1 == r2) goto L69
            char r1 = r9.charAt(r0)
            r2 = 90
            if (r1 != r2) goto L12
            goto L69
        L12:
            int r1 = r9.length()     // Catch: java.lang.NumberFormatException -> L49
            float[] r1 = new float[r1]     // Catch: java.lang.NumberFormatException -> L49
            r2 = 0
            r3 = 1
            r4 = 0
            androidx.core.graphics.PathParser$ExtractFloatResult r5 = new androidx.core.graphics.PathParser$ExtractFloatResult     // Catch: java.lang.NumberFormatException -> L49
            r5.<init>()     // Catch: java.lang.NumberFormatException -> L49
            int r6 = r9.length()     // Catch: java.lang.NumberFormatException -> L49
        L24:
            if (r3 >= r6) goto L44
            extract(r9, r3, r5)     // Catch: java.lang.NumberFormatException -> L49
            int r7 = r5.mEndPosition     // Catch: java.lang.NumberFormatException -> L49
            r4 = r7
            if (r3 >= r4) goto L3b
            int r7 = r2 + 1
            java.lang.String r8 = r9.substring(r3, r4)     // Catch: java.lang.NumberFormatException -> L49
            float r8 = java.lang.Float.parseFloat(r8)     // Catch: java.lang.NumberFormatException -> L49
            r1[r2] = r8     // Catch: java.lang.NumberFormatException -> L49
            r2 = r7
        L3b:
            boolean r7 = r5.mEndWithNegOrDot     // Catch: java.lang.NumberFormatException -> L49
            if (r7 == 0) goto L41
            r3 = r4
            goto L24
        L41:
            int r3 = r4 + 1
            goto L24
        L44:
            float[] r0 = copyOfRange(r1, r0, r2)     // Catch: java.lang.NumberFormatException -> L49
            return r0
        L49:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "error in parsing \""
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r9)
            java.lang.String r3 = "\""
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2, r0)
            throw r1
        L69:
            float[] r0 = new float[r0]
            return r0
    }

    public static boolean interpolatePathDataNodes(androidx.core.graphics.PathParser.PathDataNode[] r4, androidx.core.graphics.PathParser.PathDataNode[] r5, androidx.core.graphics.PathParser.PathDataNode[] r6, float r7) {
            if (r4 == 0) goto L30
            if (r5 == 0) goto L30
            if (r6 == 0) goto L30
            int r0 = r4.length
            int r1 = r5.length
            if (r0 != r1) goto L28
            int r0 = r5.length
            int r1 = r6.length
            if (r0 != r1) goto L28
            boolean r0 = canMorph(r5, r6)
            if (r0 != 0) goto L16
            r0 = 0
            return r0
        L16:
            r0 = 0
        L17:
            int r1 = r4.length
            if (r0 >= r1) goto L26
            r1 = r4[r0]
            r2 = r5[r0]
            r3 = r6[r0]
            r1.interpolatePathDataNode(r2, r3, r7)
            int r0 = r0 + 1
            goto L17
        L26:
            r0 = 1
            return r0
        L28:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "The nodes to be interpolated and resulting nodes must have the same length"
            r0.<init>(r1)
            throw r0
        L30:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "The nodes to be interpolated and resulting nodes cannot be null"
            r0.<init>(r1)
            throw r0
    }

    private static int nextStart(java.lang.String r3, int r4) {
        L1:
            int r0 = r3.length()
            if (r4 >= r0) goto L25
            char r0 = r3.charAt(r4)
            int r1 = r0 + (-65)
            int r2 = r0 + (-90)
            int r1 = r1 * r2
            if (r1 <= 0) goto L19
            int r1 = r0 + (-97)
            int r2 = r0 + (-122)
            int r1 = r1 * r2
            if (r1 > 0) goto L22
        L19:
            r1 = 101(0x65, float:1.42E-43)
            if (r0 == r1) goto L22
            r1 = 69
            if (r0 == r1) goto L22
            return r4
        L22:
            int r4 = r4 + 1
            goto L1
        L25:
            return r4
    }

    public static void updateNodes(androidx.core.graphics.PathParser.PathDataNode[] r4, androidx.core.graphics.PathParser.PathDataNode[] r5) {
            r0 = 0
        L1:
            int r1 = r5.length
            if (r0 >= r1) goto L26
            r1 = r4[r0]
            r2 = r5[r0]
            char r2 = r2.mType
            r1.mType = r2
            r1 = 0
        Ld:
            r2 = r5[r0]
            float[] r2 = r2.mParams
            int r2 = r2.length
            if (r1 >= r2) goto L23
            r2 = r4[r0]
            float[] r2 = r2.mParams
            r3 = r5[r0]
            float[] r3 = r3.mParams
            r3 = r3[r1]
            r2[r1] = r3
            int r1 = r1 + 1
            goto Ld
        L23:
            int r0 = r0 + 1
            goto L1
        L26:
            return
    }
}
