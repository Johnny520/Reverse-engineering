package com.google.android.material.color.utilities;

/* JADX INFO: loaded from: classes.dex */
@Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20022})
public final class ViewingConditions {
    public static final com.google.android.material.color.utilities.ViewingConditions DEFAULT = null;
    private final double aw;
    private final double c;
    private final double fl;
    private final double flRoot;
    private final double n;
    private final double nbb;
    private final double nc;
    private final double ncb;
    private final double[] rgbD;
    private final double z;

    static {
            r0 = 4632233691727265792(0x4049000000000000, double:50.0)
            com.google.android.material.color.utilities.ViewingConditions r0 = defaultWithBackgroundLstar(r0)
            com.google.android.material.color.utilities.ViewingConditions.DEFAULT = r0
            return
    }

    private ViewingConditions(double r4, double r6, double r8, double r10, double r12, double r14, double[] r16, double r17, double r19, double r21) {
            r3 = this;
            r0 = r3
            r3.<init>()
            r1 = r4
            r0.n = r1
            r1 = r6
            r0.aw = r1
            r1 = r8
            r0.nbb = r1
            r1 = r10
            r0.ncb = r1
            r1 = r12
            r0.c = r1
            r1 = r14
            r0.nc = r1
            r1 = r16
            r0.rgbD = r1
            r1 = r17
            r0.fl = r1
            r1 = r19
            r0.flRoot = r1
            r1 = r21
            r0.z = r1
            return
    }

    public static com.google.android.material.color.utilities.ViewingConditions defaultWithBackgroundLstar(double r8) {
            double[] r0 = com.google.android.material.color.utilities.ColorUtils.whitePointD65()
            r1 = 4632233691727265792(0x4049000000000000, double:50.0)
            double r1 = com.google.android.material.color.utilities.ColorUtils.yFromLstar(r1)
            r3 = 4634156444089534796(0x404fd4bbab8b494c, double:63.66197723675813)
            double r1 = r1 * r3
            r3 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r1 = r1 / r3
            r5 = 4611686018427387904(0x4000000000000000, double:2.0)
            r7 = 0
            r3 = r8
            com.google.android.material.color.utilities.ViewingConditions r8 = make(r0, r1, r3, r5, r7)
            return r8
    }

    public static com.google.android.material.color.utilities.ViewingConditions make(double[] r44, double r45, double r47, double r49, boolean r51) {
            r0 = r45
            r2 = 3
            r3 = 4591870180066957722(0x3fb999999999999a, double:0.1)
            r5 = r47
            double r5 = java.lang.Math.max(r3, r5)
            double[][] r7 = com.google.android.material.color.utilities.Cam16.XYZ_TO_CAM16RGB
            r8 = 0
            r9 = r44[r8]
            r11 = r7[r8]
            r12 = r11[r8]
            double r12 = r12 * r9
            r14 = 1
            r15 = r44[r14]
            r17 = r11[r14]
            double r17 = r17 * r15
            double r12 = r12 + r17
            r17 = 2
            r18 = r44[r17]
            r20 = r11[r17]
            double r20 = r20 * r18
            double r12 = r12 + r20
            r11 = r7[r14]
            r20 = r11[r8]
            double r20 = r20 * r9
            r22 = r11[r14]
            double r22 = r22 * r15
            double r20 = r20 + r22
            r22 = r11[r17]
            double r22 = r22 * r18
            double r20 = r20 + r22
            r7 = r7[r17]
            r22 = r7[r8]
            double r9 = r9 * r22
            r22 = r7[r14]
            double r15 = r15 * r22
            double r9 = r9 + r15
            r15 = r7[r17]
            double r18 = r18 * r15
            double r9 = r9 + r18
            r15 = 4621819117588971520(0x4024000000000000, double:10.0)
            double r18 = r49 / r15
            r22 = 4605380978949069210(0x3fe999999999999a, double:0.8)
            double r35 = r18 + r22
            r18 = 4606281698874543309(0x3feccccccccccccd, double:0.9)
            int r7 = (r35 > r18 ? 1 : (r35 == r18 ? 0 : -1))
            if (r7 < 0) goto L77
            double r18 = r35 - r18
            double r26 = r18 * r15
            r22 = 4603489467105573601(0x3fe2e147ae147ae1, double:0.59)
            r24 = 4604390187031047700(0x3fe6147ae147ae14, double:0.69)
            double r15 = com.google.android.material.color.utilities.MathUtils.lerp(r22, r24, r26)
        L74:
            r33 = r15
            goto L8a
        L77:
            double r18 = r35 - r22
            double r26 = r18 * r15
            r22 = 4602903999154015437(0x3fe0cccccccccccd, double:0.525)
            r24 = 4603489467105573601(0x3fe2e147ae147ae1, double:0.59)
            double r15 = com.google.android.material.color.utilities.MathUtils.lerp(r22, r24, r26)
            goto L74
        L8a:
            r15 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            if (r51 == 0) goto L91
            r26 = r15
            goto Lab
        L91:
            double r3 = -r0
            r22 = 4631107791820423168(0x4045000000000000, double:42.0)
            double r3 = r3 - r22
            r22 = 4636174341401214976(0x4057000000000000, double:92.0)
            double r3 = r3 / r22
            double r3 = java.lang.Math.exp(r3)
            r22 = 4598675619503873138(0x3fd1c71c71c71c72, double:0.2777777777777778)
            double r3 = r3 * r22
            double r3 = r15 - r3
            double r3 = r3 * r35
            r26 = r3
        Lab:
            r22 = 0
            r24 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r3 = com.google.android.material.color.utilities.MathUtils.clampDouble(r22, r24, r26)
            r22 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r24 = r22 / r12
            double r24 = r24 * r3
            double r24 = r24 + r15
            double r24 = r24 - r3
            double r26 = r22 / r20
            double r26 = r26 * r3
            double r26 = r26 + r15
            double r26 = r26 - r3
            double r28 = r22 / r9
            double r28 = r28 * r3
            double r28 = r28 + r15
            double r28 = r28 - r3
            double[] r3 = new double[r2]
            r37 = r3
            r3[r8] = r24
            r3[r14] = r26
            r3[r17] = r28
            r24 = 4617315517961601024(0x4014000000000000, double:5.0)
            double r24 = r24 * r0
            double r26 = r24 + r15
            double r26 = r15 / r26
            double r28 = r26 * r26
            double r28 = r28 * r26
            double r28 = r28 * r26
            double r15 = r15 - r28
            double r28 = r28 * r0
            r0 = 4591870180066957722(0x3fb999999999999a, double:0.1)
            double r0 = r0 * r15
            double r0 = r0 * r15
            double r15 = java.lang.Math.cbrt(r24)
            double r0 = r0 * r15
            double r0 = r28 + r0
            r38 = r0
            double r4 = com.google.android.material.color.utilities.ColorUtils.yFromLstar(r5)
            r6 = r44[r14]
            double r4 = r4 / r6
            r25 = r4
            r6 = 4609344146621155246(0x3ff7ae147ae147ae, double:1.48)
            double r15 = java.lang.Math.sqrt(r4)
            double r42 = r15 + r6
            r6 = 4596373779694328218(0x3fc999999999999a, double:0.2)
            double r4 = java.lang.Math.pow(r4, r6)
            r6 = 4604705439004963635(0x3fe7333333333333, double:0.725)
            double r6 = r6 / r4
            r29 = r6
            r31 = r6
            r4 = r3[r8]
            double r4 = r4 * r0
            double r4 = r4 * r12
            double r4 = r4 / r22
            r11 = 4601237667291888353(0x3fdae147ae147ae1, double:0.42)
            double r4 = java.lang.Math.pow(r4, r11)
            r15 = r3[r14]
            double r15 = r15 * r0
            double r15 = r15 * r20
            double r14 = r15 / r22
            double r13 = java.lang.Math.pow(r14, r11)
            r15 = r3[r17]
            double r15 = r15 * r0
            double r15 = r15 * r9
            double r9 = r15 / r22
            double r9 = java.lang.Math.pow(r9, r11)
            double[] r3 = new double[r2]
            r3[r8] = r4
            r4 = 1
            r3[r4] = r13
            r3[r17] = r9
            r9 = r3[r8]
            r11 = 4645744490609377280(0x4079000000000000, double:400.0)
            double r13 = r9 * r11
            r15 = 4628329633800288993(0x403b2147ae147ae1, double:27.13)
            double r9 = r9 + r15
            double r13 = r13 / r9
            r9 = r3[r4]
            double r18 = r9 * r11
            double r9 = r9 + r15
            double r18 = r18 / r9
            r9 = r3[r17]
            double r11 = r11 * r9
            double r9 = r9 + r15
            double r11 = r11 / r9
            double[] r2 = new double[r2]
            r2[r8] = r13
            r2[r4] = r18
            r2[r17] = r11
            r9 = 4611686018427387904(0x4000000000000000, double:2.0)
            r11 = r2[r8]
            double r11 = r11 * r9
            r3 = r2[r4]
            double r11 = r11 + r3
            r3 = 4587366580439587226(0x3fa999999999999a, double:0.05)
            r8 = r2[r17]
            double r8 = r8 * r3
            double r11 = r11 + r8
            double r27 = r11 * r6
            com.google.android.material.color.utilities.ViewingConditions r2 = new com.google.android.material.color.utilities.ViewingConditions
            r24 = r2
            r3 = 4598175219545276416(0x3fd0000000000000, double:0.25)
            double r40 = java.lang.Math.pow(r0, r3)
            r24.<init>(r25, r27, r29, r31, r33, r35, r37, r38, r40, r42)
            return r2
    }

    public double getAw() {
            r2 = this;
            double r0 = r2.aw
            return r0
    }

    public double getC() {
            r2 = this;
            double r0 = r2.c
            return r0
    }

    public double getFl() {
            r2 = this;
            double r0 = r2.fl
            return r0
    }

    public double getFlRoot() {
            r2 = this;
            double r0 = r2.flRoot
            return r0
    }

    public double getN() {
            r2 = this;
            double r0 = r2.n
            return r0
    }

    public double getNbb() {
            r2 = this;
            double r0 = r2.nbb
            return r0
    }

    public double getNc() {
            r2 = this;
            double r0 = r2.nc
            return r0
    }

    public double getNcb() {
            r2 = this;
            double r0 = r2.ncb
            return r0
    }

    public double[] getRgbD() {
            r1 = this;
            double[] r0 = r1.rgbD
            return r0
    }

    public double getZ() {
            r2 = this;
            double r0 = r2.z
            return r0
    }
}
