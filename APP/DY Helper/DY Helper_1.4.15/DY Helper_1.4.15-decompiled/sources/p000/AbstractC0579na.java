package p000;

/* JADX INFO: renamed from: na */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0579na {

    /* JADX INFO: renamed from: α */
    public static final java.lang.String[][] f7481 = null;

    /* JADX INFO: renamed from: β */
    public static final java.lang.String[][] f7482 = null;

    /* JADX INFO: renamed from: γ */
    public static final float[] f7483 = null;

    /* JADX INFO: renamed from: δ */
    public static final float[] f7484 = null;

    static {
            r0 = 8
            java.lang.String[][] r1 = new java.lang.String[r0][]
            r2 = 0
            r3 = r2
        L6:
            java.lang.String r4 = "LMGauss"
            r5 = 5
            r6 = 1
            if (r3 >= r0) goto L23
            java.lang.String[] r7 = new java.lang.String[r5]
            r8 = r2
        Lf:
            if (r8 >= r5) goto L1e
            int r9 = r6 << r8
            java.lang.String r10 = "_H_d"
            java.lang.String r9 = p000.AbstractC0602nx.m4125(r3, r9, r4, r10)
            r7[r8] = r9
            int r8 = r8 + 1
            goto Lf
        L1e:
            r1[r3] = r7
            int r3 = r3 + 1
            goto L6
        L23:
            p000.AbstractC0579na.f7481 = r1
            java.lang.String[][] r1 = new java.lang.String[r0][]
            r3 = r2
        L28:
            if (r3 >= r0) goto L41
            java.lang.String[] r7 = new java.lang.String[r5]
            r8 = r2
        L2d:
            if (r8 >= r5) goto L3c
            int r9 = r6 << r8
            java.lang.String r10 = "_V_d"
            java.lang.String r9 = p000.AbstractC0602nx.m4125(r3, r9, r4, r10)
            r7[r8] = r9
            int r8 = r8 + 1
            goto L2d
        L3c:
            r1[r3] = r7
            int r3 = r3 + 1
            goto L28
        L41:
            p000.AbstractC0579na.f7482 = r1
            float[] r0 = new float[r5]
            r0 = {x0054: FILL_ARRAY_DATA , data: [0, 1078047277, 1089601536, 1091567616, 1128968749} // fill-array
            p000.AbstractC0579na.f7483 = r0
            r0 = 4
            float[] r0 = new float[r0]
            r0 = {x0062: FILL_ARRAY_DATA , data: [1080241518, 1092091904, 1101004800, 1110468762} // fill-array
            p000.AbstractC0579na.f7484 = r0
            return
    }

    /* JADX INFO: renamed from: α */
    public static final int m4017(float r13, double[] r14, float[] r15, float[] r16) {
            r14.getClass()
            r15.getClass()
            r16.getClass()
            r0 = 1048576000(0x3e800000, float:0.25)
            int r0 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            r1 = 0
            if (r0 > 0) goto L11
            return r1
        L11:
            double r2 = (double) r13
            r13 = r1
        L13:
            r0 = 14
            if (r13 >= r0) goto L26
            double r4 = (double) r13
            r6 = -4620693217682128896(0xbfe0000000000000, double:-0.5)
            double r6 = r6 * r4
            double r6 = r6 * r4
            double r6 = r6 / r2
            double r4 = java.lang.Math.exp(r6)
            r14[r13] = r4
            int r13 = r13 + 1
            goto L13
        L26:
            r2 = r14[r1]
            r13 = 1
            r4 = r13
        L2a:
            if (r4 >= r0) goto L35
            r5 = r14[r4]
            r7 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r5 = r5 * r7
            double r2 = r2 + r5
            int r4 = r4 + 1
            goto L2a
        L35:
            r4 = r1
        L36:
            if (r4 >= r0) goto L40
            r5 = r14[r4]
            double r5 = r5 / r2
            r14[r4] = r5
            int r4 = r4 + 1
            goto L36
        L40:
            r2 = r14[r1]
            r4 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            double r2 = r2 * r4
            r4 = r14[r13]
            double r2 = r2 + r4
            r6 = 4517329193108106637(0x3eb0c6f7a0b5ed8d, double:1.0E-6)
            int r6 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r6 <= 0) goto L57
            double r4 = r4 / r2
            float r2 = (float) r4
            r15[r1] = r2
            r2 = r13
            goto L58
        L57:
            r2 = r1
        L58:
            r3 = 2
        L59:
            if (r3 >= r0) goto L85
            r4 = 7
            if (r2 >= r4) goto L85
            r4 = r14[r3]
            int r6 = r3 + 1
            if (r6 >= r0) goto L67
            r7 = r14[r6]
            goto L69
        L67:
            r7 = 0
        L69:
            double r9 = r4 + r7
            r11 = 4566758108544739836(0x3f60624dd2f1a9fc, double:0.002)
            int r11 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r11 < 0) goto L85
            double r11 = (double) r3
            double r4 = r4 * r11
            double r11 = (double) r6
            double r7 = r7 * r11
            double r7 = r7 + r4
            double r7 = r7 / r9
            float r4 = (float) r7
            r15[r2] = r4
            float r4 = (float) r9
            r16[r2] = r4
            int r2 = r2 + 1
            int r3 = r3 + 2
            goto L59
        L85:
            r14 = 0
            r0 = r14
        L87:
            if (r13 >= r2) goto L8f
            r3 = r16[r13]
            float r0 = r0 + r3
            int r13 = r13 + 1
            goto L87
        L8f:
            r13 = 1056964608(0x3f000000, float:0.5)
            float r13 = r13 - r0
            int r0 = (r13 > r14 ? 1 : (r13 == r14 ? 0 : -1))
            if (r0 >= 0) goto L97
            r13 = r14
        L97:
            r16[r1] = r13
        L99:
            if (r1 >= r2) goto Lac
            r13 = r16[r1]
            int r0 = (r13 > r14 ? 1 : (r13 == r14 ? 0 : -1))
            if (r0 <= 0) goto La7
            r0 = 1065353216(0x3f800000, float:1.0)
            int r13 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r13 < 0) goto La9
        La7:
            r16[r1] = r14
        La9:
            int r1 = r1 + 1
            goto L99
        Lac:
            return r2
    }
}
