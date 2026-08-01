package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class m72 {

    /* JADX INFO: renamed from: α */
    public static final /* synthetic */ int f7009 = 0;

    static {
            r0 = 2
            int[] r1 = new int[r0]
            float[] r2 = new float[r0]
            float[] r3 = new float[r0]
            float[][] r2 = new float[][]{r2, r3}
            r3 = 0
            r1 = r1[r3]
            r4 = 5
            r5 = 4
            r6 = 3
            r7 = 1
            if (r1 == 0) goto L26
            if (r1 == r7) goto L1e
            if (r1 == r0) goto L24
            if (r1 == r6) goto L24
            if (r1 == r5) goto L22
            if (r1 == r4) goto L20
        L1e:
            r1 = r7
            goto L27
        L20:
            r1 = r4
            goto L27
        L22:
            r1 = r5
            goto L27
        L24:
            r1 = r0
            goto L27
        L26:
            r1 = r6
        L27:
            r8 = r2[r3]
            r2 = r2[r7]
            int r9 = r8.length
            int r9 = r9 / r0
            int r10 = r8.length
            int r10 = r10 % r0
            int r10 = r10 + r9
            i2[] r0 = new p000.C0381i2[r10]
            r9 = r3
        L33:
            if (r9 >= r10) goto L126
            int r11 = r9 * 2
            i2 r12 = new i2
            r13 = r8[r11]
            int r14 = r11 + 1
            r15 = r8[r14]
            r11 = r2[r11]
            r14 = r2[r14]
            r3 = 4
            r12.<init>(r3)
            float r11 = r11 - r13
            float r3 = r14 - r15
            r13 = 101(0x65, float:1.42E-43)
            float[] r4 = new float[r13]
            if (r1 != r6) goto L5d
        L50:
            r22 = r0
            r21 = r1
            r23 = r7
            r24 = r8
            r20 = r9
            r7 = 0
            goto L10f
        L5d:
            float r16 = java.lang.Math.abs(r11)
            r17 = 981668463(0x3a83126f, float:0.001)
            int r16 = (r16 > r17 ? 1 : (r16 == r17 ? 0 : -1))
            if (r16 < 0) goto L50
            float r16 = java.lang.Math.abs(r3)
            int r16 = (r16 > r17 ? 1 : (r16 == r17 ? 0 : -1))
            if (r16 >= 0) goto L71
            goto L50
        L71:
            float r15 = r15 - r14
            float[] r3 = p000.kn0.f6040
            r14 = 90
            float r5 = (float) r14
            r17 = 0
            r6 = r7
            r20 = r15
            r18 = r17
            r19 = r18
        L80:
            r21 = 4636033603912859648(0x4056800000000000, double:90.0)
            r23 = r7
            r24 = r8
            double r7 = (double) r6
            double r7 = r7 * r21
            r22 = r0
            r21 = r1
            double r0 = (double) r14
            double r7 = r7 / r0
            r0 = 4580687790476533049(0x3f91df46a2529d39, double:0.017453292519943295)
            double r7 = r7 * r0
            float r0 = (float) r7
            double r0 = (double) r0
            double r7 = java.lang.Math.sin(r0)
            float r7 = (float) r7
            double r0 = java.lang.Math.cos(r0)
            float r0 = (float) r0
            float r7 = r7 * r11
            float r0 = r0 * r15
            float r1 = r7 - r19
            double r13 = (double) r1
            float r1 = r0 - r20
            r20 = r9
            double r8 = (double) r1
            double r8 = java.lang.Math.hypot(r13, r8)
            float r1 = (float) r8
            float r18 = r18 + r1
            r3[r6] = r18
            r1 = 90
            if (r6 == r1) goto Lcf
            int r6 = r6 + 1
            r14 = r1
            r19 = r7
            r9 = r20
            r1 = r21
            r7 = r23
            r8 = r24
            r13 = 101(0x65, float:1.42E-43)
            r20 = r0
            r0 = r22
            goto L80
        Lcf:
            r0 = r23
        Ld1:
            r6 = r3[r0]
            float r6 = r6 / r18
            r3[r0] = r6
            if (r0 == r1) goto Ldc
            int r0 = r0 + 1
            goto Ld1
        Ldc:
            r0 = 0
            r8 = 101(0x65, float:1.42E-43)
        Ldf:
            if (r0 >= r8) goto L10d
            float r1 = (float) r0
            r6 = 1120403456(0x42c80000, float:100.0)
            float r1 = r1 / r6
            r6 = 91
            r7 = 0
            int r6 = java.util.Arrays.binarySearch(r3, r7, r6, r1)
            if (r6 < 0) goto Lf3
            float r1 = (float) r6
            float r1 = r1 / r5
            r4[r0] = r1
            goto L10a
        Lf3:
            r9 = -1
            if (r6 != r9) goto Lf9
            r4[r0] = r17
            goto L10a
        Lf9:
            int r6 = -r6
            int r9 = r6 + (-2)
            int r6 = r6 + (-1)
            float r11 = (float) r9
            r9 = r3[r9]
            float r1 = r1 - r9
            r6 = r3[r6]
            float r6 = r6 - r9
            float r1 = r1 / r6
            float r1 = r1 + r11
            float r1 = r1 / r5
            r4[r0] = r1
        L10a:
            int r0 = r0 + 1
            goto Ldf
        L10d:
            r7 = 0
            goto L114
        L10f:
            double r0 = (double) r3
            double r3 = (double) r11
            java.lang.Math.hypot(r0, r3)
        L114:
            r22[r20] = r12
            int r9 = r20 + 1
            r3 = r7
            r1 = r21
            r0 = r22
            r7 = r23
            r8 = r24
            r4 = 5
            r5 = 4
            r6 = 3
            goto L33
        L126:
            return
    }
}
