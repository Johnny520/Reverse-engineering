package com.google.android.material.color.utilities;

/* JADX INFO: loaded from: classes.dex */
@Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20022})
public final class QuantizerWsmeans {
    private static final int MAX_ITERATIONS = 10;
    private static final double MIN_MOVEMENT_DISTANCE = 3.0d;

    public static final class Distance implements java.lang.Comparable<com.google.android.material.color.utilities.QuantizerWsmeans.Distance> {
        double distance;
        int index;

        public Distance() {
                r2 = this;
                r2.<init>()
                r0 = -1
                r2.index = r0
                r0 = -4616189618054758400(0xbff0000000000000, double:-1.0)
                r2.distance = r0
                return
        }

        /* JADX INFO: renamed from: compareTo, reason: avoid collision after fix types in other method */
        public int compareTo2(com.google.android.material.color.utilities.QuantizerWsmeans.Distance r4) {
                r3 = this;
                double r0 = r3.distance
                java.lang.Double r0 = java.lang.Double.valueOf(r0)
                double r1 = r4.distance
                java.lang.Double r4 = java.lang.Double.valueOf(r1)
                int r4 = r0.compareTo(r4)
                return r4
        }

        @Override // java.lang.Comparable
        public /* bridge */ /* synthetic */ int compareTo(com.google.android.material.color.utilities.QuantizerWsmeans.Distance r1) {
                r0 = this;
                com.google.android.material.color.utilities.QuantizerWsmeans$Distance r1 = (com.google.android.material.color.utilities.QuantizerWsmeans.Distance) r1
                int r1 = r0.compareTo2(r1)
                return r1
        }
    }

    private QuantizerWsmeans() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.util.Map<java.lang.Integer, java.lang.Integer> quantize(int[] r25, int[] r26, int r27) {
            r0 = r25
            r1 = r26
            r2 = 1
            java.util.Random r3 = new java.util.Random
            r4 = 272008(0x42688, double:1.3439E-318)
            r3.<init>(r4)
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap
            r4.<init>()
            int r5 = r0.length
            double[][] r5 = new double[r5][]
            int r6 = r0.length
            int[] r6 = new int[r6]
            com.google.android.material.color.utilities.PointProviderLab r7 = new com.google.android.material.color.utilities.PointProviderLab
            r7.<init>()
            r9 = 0
            r10 = 0
        L1f:
            int r11 = r0.length
            if (r9 >= r11) goto L57
            r11 = r0[r9]
            java.lang.Integer r12 = java.lang.Integer.valueOf(r11)
            java.lang.Object r12 = r4.get(r12)
            java.lang.Integer r12 = (java.lang.Integer) r12
            if (r12 != 0) goto L45
            double[] r12 = r7.fromInt(r11)
            r5[r10] = r12
            r6[r10] = r11
            int r10 = r10 + r2
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r2)
            r4.put(r11, r12)
            goto L55
        L45:
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            int r12 = r12.intValue()
            int r12 = r12 + r2
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r4.put(r11, r12)
        L55:
            int r9 = r9 + r2
            goto L1f
        L57:
            int[] r0 = new int[r10]
            r9 = 0
        L5a:
            if (r9 >= r10) goto L70
            r11 = r6[r9]
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            java.lang.Object r11 = r4.get(r11)
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r11 = r11.intValue()
            r0[r9] = r11
            int r9 = r9 + r2
            goto L5a
        L70:
            r9 = r27
            int r4 = java.lang.Math.min(r9, r10)
            int r6 = r1.length
            if (r6 == 0) goto L7e
            int r6 = r1.length
            int r4 = java.lang.Math.min(r4, r6)
        L7e:
            double[][] r6 = new double[r4][]
            r9 = 0
            r11 = 0
        L82:
            int r12 = r1.length
            if (r9 >= r12) goto L90
            r12 = r1[r9]
            double[] r12 = r7.fromInt(r12)
            r6[r9] = r12
            int r11 = r11 + r2
            int r9 = r9 + r2
            goto L82
        L90:
            int r1 = r4 - r11
            if (r1 <= 0) goto L99
            r9 = 0
        L95:
            if (r9 >= r1) goto L99
            int r9 = r9 + r2
            goto L95
        L99:
            int[] r1 = new int[r10]
            r9 = 0
        L9c:
            if (r9 >= r10) goto La6
            int r11 = r3.nextInt(r4)
            r1[r9] = r11
            int r9 = r9 + r2
            goto L9c
        La6:
            int[][] r3 = new int[r4][]
            r9 = 0
        La9:
            if (r9 >= r4) goto Lb1
            int[] r11 = new int[r4]
            r3[r9] = r11
            int r9 = r9 + r2
            goto La9
        Lb1:
            com.google.android.material.color.utilities.QuantizerWsmeans$Distance[][] r9 = new com.google.android.material.color.utilities.QuantizerWsmeans.Distance[r4][]
            r11 = 0
        Lb4:
            if (r11 >= r4) goto Lca
            com.google.android.material.color.utilities.QuantizerWsmeans$Distance[] r12 = new com.google.android.material.color.utilities.QuantizerWsmeans.Distance[r4]
            r9[r11] = r12
            r12 = 0
        Lbb:
            if (r12 >= r4) goto Lc8
            r13 = r9[r11]
            com.google.android.material.color.utilities.QuantizerWsmeans$Distance r14 = new com.google.android.material.color.utilities.QuantizerWsmeans$Distance
            r14.<init>()
            r13[r12] = r14
            int r12 = r12 + r2
            goto Lbb
        Lc8:
            int r11 = r11 + r2
            goto Lb4
        Lca:
            int[] r11 = new int[r4]
            r12 = 0
        Lcd:
            r13 = 10
            if (r12 >= r13) goto L219
            r13 = 0
        Ld2:
            if (r13 >= r4) goto L11a
            int r14 = r13 + 1
            r15 = r14
        Ld7:
            if (r15 >= r4) goto Lfc
            r8 = r6[r13]
            r2 = r6[r15]
            r25 = r11
            r26 = r12
            double r11 = r7.distance(r8, r2)
            r2 = r9[r15]
            r2 = r2[r13]
            r2.distance = r11
            r2.index = r13
            r2 = r9[r13]
            r2 = r2[r15]
            r2.distance = r11
            r2.index = r15
            r2 = 1
            int r15 = r15 + r2
            r11 = r25
            r12 = r26
            goto Ld7
        Lfc:
            r25 = r11
            r26 = r12
            r8 = r9[r13]
            java.util.Arrays.sort(r8)
            r8 = 0
        L106:
            if (r8 >= r4) goto L114
            r11 = r3[r13]
            r12 = r9[r13]
            r12 = r12[r8]
            int r12 = r12.index
            r11[r8] = r12
            int r8 = r8 + r2
            goto L106
        L114:
            r11 = r25
            r12 = r26
            r13 = r14
            goto Ld2
        L11a:
            r25 = r11
            r26 = r12
            r2 = 0
            r8 = 0
        L120:
            if (r2 >= r10) goto L181
            r11 = r5[r2]
            r12 = r1[r2]
            r13 = r6[r12]
            double r13 = r7.distance(r11, r13)
            r18 = r3
            r19 = r13
            r3 = -1
            r15 = 0
        L132:
            if (r15 >= r4) goto L15b
            r21 = r9[r12]
            r22 = r9
            r9 = r21[r15]
            r21 = r10
            double r9 = r9.distance
            r23 = 4616189618054758400(0x4010000000000000, double:4.0)
            double r23 = r23 * r13
            int r9 = (r9 > r23 ? 1 : (r9 == r23 ? 0 : -1))
            if (r9 < 0) goto L147
            goto L154
        L147:
            r9 = r6[r15]
            double r9 = r7.distance(r11, r9)
            int r23 = (r9 > r19 ? 1 : (r9 == r19 ? 0 : -1))
            if (r23 >= 0) goto L154
            r19 = r9
            r3 = r15
        L154:
            r9 = 1
            int r15 = r15 + r9
            r10 = r21
            r9 = r22
            goto L132
        L15b:
            r22 = r9
            r21 = r10
            r9 = 1
            r10 = -1
            if (r3 == r10) goto L179
            double r10 = java.lang.Math.sqrt(r19)
            double r12 = java.lang.Math.sqrt(r13)
            double r10 = r10 - r12
            double r10 = java.lang.Math.abs(r10)
            r12 = 4613937818241073152(0x4008000000000000, double:3.0)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 <= 0) goto L179
            int r8 = r8 + r9
            r1[r2] = r3
        L179:
            int r2 = r2 + r9
            r3 = r18
            r10 = r21
            r9 = r22
            goto L120
        L181:
            r18 = r3
            r22 = r9
            r21 = r10
            if (r8 != 0) goto L190
            if (r26 == 0) goto L190
            r14 = 0
            r10 = r25
            goto L21b
        L190:
            double[] r2 = new double[r4]
            double[] r3 = new double[r4]
            double[] r8 = new double[r4]
            r10 = r25
            r9 = 0
            java.util.Arrays.fill(r10, r9)
            r11 = r9
        L19d:
            r13 = r21
            if (r11 >= r13) goto L1da
            r14 = r1[r11]
            r15 = r5[r11]
            r12 = r0[r11]
            r16 = r10[r14]
            int r16 = r16 + r12
            r10[r14] = r16
            r19 = r2[r14]
            r23 = r15[r9]
            r9 = r0
            r21 = r1
            double r0 = (double) r12
            double r23 = r23 * r0
            double r19 = r19 + r23
            r2[r14] = r19
            r19 = r3[r14]
            r12 = 1
            r23 = r15[r12]
            double r23 = r23 * r0
            double r19 = r19 + r23
            r3[r14] = r19
            r19 = r8[r14]
            r17 = 2
            r23 = r15[r17]
            double r23 = r23 * r0
            double r19 = r19 + r23
            r8[r14] = r19
            int r11 = r11 + r12
            r0 = r9
            r1 = r21
            r9 = 0
            r21 = r13
            goto L19d
        L1da:
            r9 = r0
            r21 = r1
            r0 = 0
        L1de:
            if (r0 >= r4) goto L209
            r1 = r10[r0]
            if (r1 != 0) goto L1f0
            r1 = 3
            double[] r1 = new double[r1]
            r1 = {x024a: FILL_ARRAY_DATA , data: [0, 0, 0} // fill-array
            r6[r0] = r1
            r11 = 1
            r12 = 2
            r14 = 0
            goto L207
        L1f0:
            r11 = r2[r0]
            double r14 = (double) r1
            double r11 = r11 / r14
            r19 = r3[r0]
            double r19 = r19 / r14
            r23 = r8[r0]
            double r23 = r23 / r14
            r1 = r6[r0]
            r14 = 0
            r1[r14] = r11
            r11 = 1
            r1[r11] = r19
            r12 = 2
            r1[r12] = r23
        L207:
            int r0 = r0 + r11
            goto L1de
        L209:
            r11 = 1
            r14 = 0
            int r12 = r26 + 1
            r0 = r9
            r2 = r11
            r3 = r18
            r1 = r21
            r9 = r22
            r11 = r10
            r10 = r13
            goto Lcd
        L219:
            r10 = r11
            r14 = 0
        L21b:
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r8 = r14
        L221:
            if (r8 >= r4) goto L248
            r1 = r10[r8]
            if (r1 != 0) goto L229
        L227:
            r1 = 1
            goto L246
        L229:
            r2 = r6[r8]
            int r2 = r7.toInt(r2)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            boolean r3 = r0.containsKey(r3)
            if (r3 == 0) goto L23a
            goto L227
        L23a:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.put(r2, r1)
            goto L227
        L246:
            int r8 = r8 + r1
            goto L221
        L248:
            return r0
    }
}
