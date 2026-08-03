package Yue;

/* JADX INFO: renamed from: Yue.ۥۣ۟ۧۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20022})
public class C0924 {

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final float f2674 = 0.2f;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static final float f2675 = 1.0f;

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static final float f2676 = 0.4f;

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static final float f2677 = 0.01f;

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final float f2678;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final float f2679;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final float f2680;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final float f2681;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final float f2682;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final float f2683;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public final float f2684;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final float f2685;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public final float f2686;

    public C0924(float r1, float r2, float r3, float r4, float r5, float r6, float r7, float r8, float r9) {
            r0 = this;
            r0.<init>()
            r0.f2678 = r1
            r0.f2679 = r2
            r0.f2680 = r3
            r0.f2681 = r4
            r0.f2682 = r5
            r0.f2683 = r6
            r0.f2684 = r7
            r0.f2685 = r8
            r0.f2686 = r9
            return
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static Yue.C0924 m5270(@Yue.InterfaceC2458(from = 0.0d, to = 360.0d) float r12, @Yue.InterfaceC2458(from = 0.0d, to = Double.POSITIVE_INFINITY, toInclusive = false) float r13, @Yue.InterfaceC2458(from = 0.0d, to = 100.0d) float r14) {
            r0 = 0
            r1 = 1120403456(0x42c80000, float:100.0)
            r2 = 1148846080(0x447a0000, float:1000.0)
            r3 = 0
            r5 = r0
            r4 = r3
            r3 = r2
        L9:
            float r6 = r5 - r1
            float r6 = java.lang.Math.abs(r6)
            r7 = 1008981770(0x3c23d70a, float:0.01)
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 <= 0) goto L63
            float r6 = r1 - r5
            r7 = 1073741824(0x40000000, float:2.0)
            float r6 = r6 / r7
            float r6 = r6 + r5
            Yue.ۥۣ۟ۧۢ r7 = m5273(r6, r13, r12)
            int r7 = r7.m5289()
            float r8 = Yue.C0925.m5291(r7)
            float r9 = r14 - r8
            float r9 = java.lang.Math.abs(r9)
            r10 = 1045220557(0x3e4ccccd, float:0.2)
            int r10 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            if (r10 >= 0) goto L52
            Yue.ۥۣ۟ۧۢ r7 = m5271(r7)
            float r10 = r7.m5283()
            float r11 = r7.m5281()
            Yue.ۥۣ۟ۧۢ r10 = m5273(r10, r11, r12)
            float r10 = r7.m5278(r10)
            r11 = 1065353216(0x3f800000, float:1.0)
            int r11 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r11 > 0) goto L52
            r4 = r7
            r2 = r9
            r3 = r10
        L52:
            int r7 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r7 != 0) goto L5b
            int r7 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r7 != 0) goto L5b
            goto L63
        L5b:
            int r7 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r7 >= 0) goto L61
            r5 = r6
            goto L9
        L61:
            r1 = r6
            goto L9
        L63:
            return r4
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static Yue.C0924 m5271(@Yue.InterfaceC1230 int r14) {
            r0 = 7
            float[] r0 = new float[r0]
            r1 = 3
            float[] r2 = new float[r1]
            Yue.ۥۢۥ۟۠ r3 = Yue.C6950.f24194
            m5272(r14, r3, r0, r2)
            Yue.ۥۣ۟ۧۢ r14 = new Yue.ۥۣ۟ۧۢ
            r3 = 0
            r5 = r2[r3]
            r4 = 1
            r6 = r2[r4]
            r7 = r0[r3]
            r8 = r0[r4]
            r2 = 2
            r9 = r0[r2]
            r10 = r0[r1]
            r1 = 4
            r11 = r0[r1]
            r1 = 5
            r12 = r0[r1]
            r1 = 6
            r13 = r0[r1]
            r4 = r14
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return r14
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static void m5272(@Yue.InterfaceC1230 int r19, @Yue.InterfaceC4410 Yue.C6950 r20, @Yue.InterfaceC5795(7) @Yue.InterfaceC4544 float[] r21, @Yue.InterfaceC4410 @Yue.InterfaceC5795(3) float[] r22) {
            r0 = r19
            r1 = r22
            Yue.C0925.m5295(r0, r1)
            float[][] r0 = Yue.C0925.f2687
            r2 = 0
            r3 = r1[r2]
            r4 = r0[r2]
            r5 = r4[r2]
            float r5 = r5 * r3
            r6 = 1
            r7 = r1[r6]
            r8 = r4[r6]
            float r8 = r8 * r7
            float r5 = r5 + r8
            r8 = 2
            r9 = r1[r8]
            r4 = r4[r8]
            float r4 = r4 * r9
            float r5 = r5 + r4
            r4 = r0[r6]
            r10 = r4[r2]
            float r10 = r10 * r3
            r11 = r4[r6]
            float r11 = r11 * r7
            float r10 = r10 + r11
            r4 = r4[r8]
            float r4 = r4 * r9
            float r10 = r10 + r4
            r0 = r0[r8]
            r4 = r0[r2]
            float r3 = r3 * r4
            r4 = r0[r6]
            float r7 = r7 * r4
            float r3 = r3 + r7
            r0 = r0[r8]
            float r9 = r9 * r0
            float r3 = r3 + r9
            float[] r0 = r20.m26866()
            r0 = r0[r2]
            float r0 = r0 * r5
            float[] r4 = r20.m26866()
            r4 = r4[r6]
            float r4 = r4 * r10
            float[] r5 = r20.m26866()
            r5 = r5[r8]
            float r5 = r5 * r3
            float r3 = r20.m26860()
            float r7 = java.lang.Math.abs(r0)
            float r3 = r3 * r7
            double r9 = (double) r3
            r11 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r9 = r9 / r11
            r13 = 4601237667291888353(0x3fdae147ae147ae1, double:0.42)
            double r9 = java.lang.Math.pow(r9, r13)
            float r3 = (float) r9
            float r7 = r20.m26860()
            float r9 = java.lang.Math.abs(r4)
            float r7 = r7 * r9
            double r9 = (double) r7
            double r9 = r9 / r11
            double r9 = java.lang.Math.pow(r9, r13)
            float r7 = (float) r9
            float r9 = r20.m26860()
            float r10 = java.lang.Math.abs(r5)
            float r9 = r9 * r10
            double r9 = (double) r9
            double r9 = r9 / r11
            double r9 = java.lang.Math.pow(r9, r13)
            float r9 = (float) r9
            float r0 = java.lang.Math.signum(r0)
            r10 = 1137180672(0x43c80000, float:400.0)
            float r0 = r0 * r10
            float r0 = r0 * r3
            r13 = 1104742973(0x41d90a3d, float:27.13)
            float r3 = r3 + r13
            float r0 = r0 / r3
            float r3 = java.lang.Math.signum(r4)
            float r3 = r3 * r10
            float r3 = r3 * r7
            float r7 = r7 + r13
            float r3 = r3 / r7
            float r4 = java.lang.Math.signum(r5)
            float r4 = r4 * r10
            float r4 = r4 * r9
            float r9 = r9 + r13
            float r4 = r4 / r9
            r9 = 4622382067542392832(0x4026000000000000, double:11.0)
            double r13 = (double) r0
            double r13 = r13 * r9
            r9 = -4600427019358961664(0xc028000000000000, double:-12.0)
            double r6 = (double) r3
            double r6 = r6 * r9
            double r13 = r13 + r6
            double r5 = (double) r4
            double r13 = r13 + r5
            float r7 = (float) r13
            r9 = 1093664768(0x41300000, float:11.0)
            float r7 = r7 / r9
            float r9 = r0 + r3
            double r9 = (double) r9
            r13 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r5 = r5 * r13
            double r9 = r9 - r5
            float r5 = (float) r9
            r6 = 1091567616(0x41100000, float:9.0)
            float r5 = r5 / r6
            r6 = 1101004800(0x41a00000, float:20.0)
            float r9 = r0 * r6
            float r3 = r3 * r6
            float r9 = r9 + r3
            r10 = 1101529088(0x41a80000, float:21.0)
            float r10 = r10 * r4
            float r9 = r9 + r10
            float r9 = r9 / r6
            r10 = 1109393408(0x42200000, float:40.0)
            float r0 = r0 * r10
            float r0 = r0 + r3
            float r0 = r0 + r4
            float r0 = r0 / r6
            double r3 = (double) r5
            double r11 = (double) r7
            double r3 = java.lang.Math.atan2(r3, r11)
            float r3 = (float) r3
            r4 = 1127481344(0x43340000, float:180.0)
            float r3 = r3 * r4
            r6 = 1078530011(0x40490fdb, float:3.1415927)
            float r3 = r3 / r6
            r10 = 0
            int r10 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            r11 = 1135869952(0x43b40000, float:360.0)
            if (r10 >= 0) goto Le4
            float r3 = r3 + r11
            goto Le9
        Le4:
            int r10 = (r3 > r11 ? 1 : (r3 == r11 ? 0 : -1))
            if (r10 < 0) goto Le9
            float r3 = r3 - r11
        Le9:
            float r6 = r6 * r3
            float r6 = r6 / r4
            float r4 = r20.m26863()
            float r0 = r0 * r4
            float r4 = r20.m26858()
            float r0 = r0 / r4
            r10 = r9
            double r8 = (double) r0
            float r0 = r20.m26859()
            float r12 = r20.m26867()
            float r0 = r0 * r12
            r12 = r5
            double r4 = (double) r0
            double r4 = java.lang.Math.pow(r8, r4)
            float r0 = (float) r4
            r4 = 1120403456(0x42c80000, float:100.0)
            float r0 = r0 * r4
            float r5 = r20.m26859()
            r8 = 1082130432(0x40800000, float:4.0)
            float r5 = r8 / r5
            float r4 = r0 / r4
            double r13 = (double) r4
            double r13 = java.lang.Math.sqrt(r13)
            float r4 = (float) r13
            float r5 = r5 * r4
            float r4 = r20.m26858()
            float r4 = r4 + r8
            float r5 = r5 * r4
            float r4 = r20.m26861()
            float r5 = r5 * r4
            double r13 = (double) r3
            r17 = 4626362123713081508(0x403423d70a3d70a4, double:20.14)
            int r4 = (r13 > r17 ? 1 : (r13 == r17 ? 0 : -1))
            if (r4 >= 0) goto L132
            float r11 = r11 + r3
            goto L133
        L132:
            r11 = r3
        L133:
            double r13 = (double) r11
            r17 = 4614256656552045848(0x400921fb54442d18, double:3.141592653589793)
            double r13 = r13 * r17
            r17 = 4640537203540230144(0x4066800000000000, double:180.0)
            double r13 = r13 / r17
            r15 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r13 = r13 + r15
            double r13 = java.lang.Math.cos(r13)
            r15 = 4615739258092021350(0x400e666666666666, double:3.8)
            double r13 = r13 + r15
            float r4 = (float) r13
            r9 = 1048576000(0x3e800000, float:0.25)
            float r4 = r4 * r9
            r9 = 1164993142(0x45706276, float:3846.1538)
            float r4 = r4 * r9
            float r9 = r20.m26864()
            float r4 = r4 * r9
            float r9 = r20.m26865()
            float r4 = r4 * r9
            float r7 = r7 * r7
            float r9 = r12 * r12
            float r7 = r7 + r9
            double r11 = (double) r7
            double r11 = java.lang.Math.sqrt(r11)
            float r7 = (float) r11
            float r4 = r4 * r7
            r7 = 1050421494(0x3e9c28f6, float:0.305)
            float r9 = r10 + r7
            float r4 = r4 / r9
            float r7 = r20.m26862()
            double r9 = (double) r7
            r11 = 4598895795485655695(0x3fd28f5c28f5c28f, double:0.29)
            double r9 = java.lang.Math.pow(r11, r9)
            r11 = 4610064722561534525(0x3ffa3d70a3d70a3d, double:1.64)
            double r11 = r11 - r9
            r9 = 4604750475001237340(0x3fe75c28f5c28f5c, double:0.73)
            double r9 = java.lang.Math.pow(r11, r9)
            float r7 = (float) r9
            double r9 = (double) r4
            r11 = 4606281698874543309(0x3feccccccccccccd, double:0.9)
            double r9 = java.lang.Math.pow(r9, r11)
            float r4 = (float) r9
            float r7 = r7 * r4
            double r9 = (double) r0
            r11 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r9 = r9 / r11
            double r9 = java.lang.Math.sqrt(r9)
            float r4 = (float) r9
            float r4 = r4 * r7
            float r9 = r20.m26861()
            float r9 = r9 * r4
            float r10 = r20.m26859()
            float r7 = r7 * r10
            float r10 = r20.m26858()
            float r10 = r10 + r8
            float r7 = r7 / r10
            double r7 = (double) r7
            double r7 = java.lang.Math.sqrt(r7)
            float r7 = (float) r7
            r8 = 1112014848(0x42480000, float:50.0)
            float r7 = r7 * r8
            r8 = 1071225242(0x3fd9999a, float:1.7)
            float r8 = r8 * r0
            r10 = 1004888130(0x3be56042, float:0.007)
            float r10 = r10 * r0
            r11 = 1065353216(0x3f800000, float:1.0)
            float r10 = r10 + r11
            float r8 = r8 / r10
            r10 = 1018873617(0x3cbac711, float:0.0228)
            float r10 = r10 * r9
            float r10 = r10 + r11
            double r10 = (double) r10
            double r10 = java.lang.Math.log(r10)
            float r10 = (float) r10
            r11 = 1110405192(0x422f7048, float:43.85965)
            float r10 = r10 * r11
            double r11 = (double) r6
            double r13 = java.lang.Math.cos(r11)
            float r6 = (float) r13
            float r6 = r6 * r10
            double r11 = java.lang.Math.sin(r11)
            float r11 = (float) r11
            float r10 = r10 * r11
            r1[r2] = r3
            r3 = 1
            r1[r3] = r4
            if (r21 == 0) goto L201
            r21[r2] = r0
            r21[r3] = r5
            r0 = 2
            r21[r0] = r9
            r0 = 3
            r21[r0] = r7
            r0 = 4
            r21[r0] = r8
            r0 = 5
            r21[r0] = r6
            r0 = 6
            r21[r0] = r10
        L201:
            return
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static Yue.C0924 m5273(@Yue.InterfaceC2458(from = 0.0d, to = 100.0d) float r1, @Yue.InterfaceC2458(from = 0.0d, to = Double.POSITIVE_INFINITY, toInclusive = false) float r2, @Yue.InterfaceC2458(from = 0.0d, to = 360.0d) float r3) {
            Yue.ۥۢۥ۟۠ r0 = Yue.C6950.f24194
            Yue.ۥۣ۟ۧۢ r1 = m5274(r1, r2, r3, r0)
            return r1
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static Yue.C0924 m5274(@Yue.InterfaceC2458(from = 0.0d, to = 100.0d) float r13, @Yue.InterfaceC2458(from = 0.0d, to = Double.POSITIVE_INFINITY, toInclusive = false) float r14, @Yue.InterfaceC2458(from = 0.0d, to = 360.0d) float r15, Yue.C6950 r16) {
            r3 = r13
            float r0 = r16.m26859()
            r1 = 1082130432(0x40800000, float:4.0)
            float r0 = r1 / r0
            double r4 = (double) r3
            r6 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r4 = r4 / r6
            double r6 = java.lang.Math.sqrt(r4)
            float r2 = (float) r6
            float r0 = r0 * r2
            float r2 = r16.m26858()
            float r2 = r2 + r1
            float r0 = r0 * r2
            float r2 = r16.m26861()
            float r6 = r0 * r2
            float r0 = r16.m26861()
            float r7 = r14 * r0
            double r4 = java.lang.Math.sqrt(r4)
            float r0 = (float) r4
            float r0 = r14 / r0
            float r2 = r16.m26859()
            float r0 = r0 * r2
            float r2 = r16.m26858()
            float r2 = r2 + r1
            float r0 = r0 / r2
            double r0 = (double) r0
            double r0 = java.lang.Math.sqrt(r0)
            float r0 = (float) r0
            r1 = 1112014848(0x42480000, float:50.0)
            float r8 = r0 * r1
            r0 = 1078530011(0x40490fdb, float:3.1415927)
            float r0 = r0 * r15
            r1 = 1127481344(0x43340000, float:180.0)
            float r0 = r0 / r1
            r1 = 1071225242(0x3fd9999a, float:1.7)
            float r1 = r1 * r3
            r2 = 1004888130(0x3be56042, float:0.007)
            float r2 = r2 * r3
            r4 = 1065353216(0x3f800000, float:1.0)
            float r2 = r2 + r4
            float r9 = r1 / r2
            r1 = 4582228873984682964(0x3f9758e219652bd4, double:0.0228)
            double r4 = (double) r7
            double r4 = r4 * r1
            r1 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r4 = r4 + r1
            double r1 = java.lang.Math.log(r4)
            float r1 = (float) r1
            r2 = 1110405192(0x422f7048, float:43.85965)
            float r1 = r1 * r2
            double r4 = (double) r0
            double r10 = java.lang.Math.cos(r4)
            float r0 = (float) r10
            float r10 = r1 * r0
            double r4 = java.lang.Math.sin(r4)
            float r0 = (float) r4
            float r11 = r1 * r0
            Yue.ۥۣ۟ۧۢ r12 = new Yue.ۥۣ۟ۧۢ
            r0 = r12
            r1 = r15
            r2 = r14
            r4 = r6
            r5 = r7
            r6 = r8
            r7 = r9
            r8 = r10
            r9 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return r12
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static void m5275(@Yue.InterfaceC1230 int r2, @Yue.InterfaceC4410 @Yue.InterfaceC5795(3) float[] r3) {
            Yue.ۥۢۥ۟۠ r0 = Yue.C6950.f24194
            r1 = 0
            m5272(r2, r0, r1, r3)
            r0 = 2
            float r2 = Yue.C0925.m5291(r2)
            r3[r0] = r2
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static int m5276(@Yue.InterfaceC2458(from = 0.0d, to = 360.0d) float r1, @Yue.InterfaceC2458(from = 0.0d, to = Double.POSITIVE_INFINITY, toInclusive = false) float r2, @Yue.InterfaceC2458(from = 0.0d, to = 100.0d) float r3) {
            Yue.ۥۢۥ۟۠ r0 = Yue.C6950.f24194
            int r1 = m5277(r1, r2, r3, r0)
            return r1
    }

    @Yue.InterfaceC1230
    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static int m5277(@Yue.InterfaceC2458(from = 0.0d, to = 360.0d) float r6, @Yue.InterfaceC2458(from = 0.0d, to = Double.POSITIVE_INFINITY, toInclusive = false) float r7, @Yue.InterfaceC2458(from = 0.0d, to = 100.0d) float r8, @Yue.InterfaceC4410 Yue.C6950 r9) {
            double r0 = (double) r7
            r2 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 < 0) goto L6a
            int r0 = java.lang.Math.round(r8)
            double r0 = (double) r0
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L6a
            int r0 = java.lang.Math.round(r8)
            double r0 = (double) r0
            r2 = 4636737291354636288(0x4059000000000000, double:100.0)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 < 0) goto L1e
            goto L6a
        L1e:
            r0 = 0
            int r1 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r1 >= 0) goto L25
            r6 = r0
            goto L2b
        L25:
            r1 = 1135869952(0x43b40000, float:360.0)
            float r6 = java.lang.Math.min(r1, r6)
        L2b:
            r1 = 1
            r2 = 0
            r3 = r2
            r2 = r1
            r1 = r0
            r0 = r7
        L31:
            float r4 = r1 - r7
            float r4 = java.lang.Math.abs(r4)
            r5 = 1053609165(0x3ecccccd, float:0.4)
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 < 0) goto L5e
            Yue.ۥۣ۟ۧۢ r4 = m5270(r6, r0, r8)
            r5 = 1073741824(0x40000000, float:2.0)
            if (r2 == 0) goto L53
            if (r4 == 0) goto L4d
            int r6 = r4.m5288(r9)
            return r6
        L4d:
            float r0 = r7 - r1
            float r0 = r0 / r5
            float r0 = r0 + r1
            r2 = 0
            goto L31
        L53:
            if (r4 != 0) goto L57
            r7 = r0
            goto L59
        L57:
            r1 = r0
            r3 = r4
        L59:
            float r0 = r7 - r1
            float r0 = r0 / r5
            float r0 = r0 + r1
            goto L31
        L5e:
            if (r3 != 0) goto L65
            int r6 = Yue.C0925.m5290(r8)
            return r6
        L65:
            int r6 = r3.m5288(r9)
            return r6
        L6a:
            int r6 = Yue.C0925.m5290(r8)
            return r6
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public float m5278(@Yue.InterfaceC4410 Yue.C0924 r5) {
            r4 = this;
            float r0 = r4.m5284()
            float r1 = r5.m5284()
            float r0 = r0 - r1
            float r1 = r4.m5279()
            float r2 = r5.m5279()
            float r1 = r1 - r2
            float r2 = r4.m5280()
            float r5 = r5.m5280()
            float r2 = r2 - r5
            float r0 = r0 * r0
            float r1 = r1 * r1
            float r0 = r0 + r1
            float r2 = r2 * r2
            float r0 = r0 + r2
            double r0 = (double) r0
            double r0 = java.lang.Math.sqrt(r0)
            r2 = 4603849755075763241(0x3fe428f5c28f5c29, double:0.63)
            double r0 = java.lang.Math.pow(r0, r2)
            r2 = 4609028894647239311(0x3ff68f5c28f5c28f, double:1.41)
            double r0 = r0 * r2
            float r5 = (float) r0
            return r5
    }

    @Yue.InterfaceC2458(from = Double.NEGATIVE_INFINITY, fromInclusive = false, to = Double.POSITIVE_INFINITY, toInclusive = false)
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public float m5279() {
            r1 = this;
            float r0 = r1.f2685
            return r0
    }

    @Yue.InterfaceC2458(from = Double.NEGATIVE_INFINITY, fromInclusive = false, to = Double.POSITIVE_INFINITY, toInclusive = false)
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public float m5280() {
            r1 = this;
            float r0 = r1.f2686
            return r0
    }

    @Yue.InterfaceC2458(from = 0.0d, to = Double.POSITIVE_INFINITY, toInclusive = false)
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public float m5281() {
            r1 = this;
            float r0 = r1.f2679
            return r0
    }

    @Yue.InterfaceC2458(from = 0.0d, to = 360.0d, toInclusive = false)
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public float m5282() {
            r1 = this;
            float r0 = r1.f2678
            return r0
    }

    @Yue.InterfaceC2458(from = 0.0d, to = 100.0d)
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public float m5283() {
            r1 = this;
            float r0 = r1.f2680
            return r0
    }

    @Yue.InterfaceC2458(from = 0.0d, to = 100.0d)
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public float m5284() {
            r1 = this;
            float r0 = r1.f2684
            return r0
    }

    @Yue.InterfaceC2458(from = 0.0d, to = Double.POSITIVE_INFINITY, toInclusive = false)
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public float m5285() {
            r1 = this;
            float r0 = r1.f2682
            return r0
    }

    @Yue.InterfaceC2458(from = 0.0d, to = Double.POSITIVE_INFINITY, toInclusive = false)
    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public float m5286() {
            r1 = this;
            float r0 = r1.f2681
            return r0
    }

    @Yue.InterfaceC2458(from = 0.0d, to = Double.POSITIVE_INFINITY, toInclusive = false)
    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public float m5287() {
            r1 = this;
            float r0 = r1.f2683
            return r0
    }

    @Yue.InterfaceC1230
    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public int m5288(@Yue.InterfaceC4410 Yue.C6950 r16) {
            r15 = this;
            float r0 = r15.m5281()
            double r0 = (double) r0
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r4 = 4636737291354636288(0x4059000000000000, double:100.0)
            if (r0 == 0) goto L28
            float r0 = r15.m5283()
            double r0 = (double) r0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L17
            goto L28
        L17:
            float r0 = r15.m5281()
            float r1 = r15.m5283()
            double r6 = (double) r1
            double r6 = r6 / r4
            double r6 = java.lang.Math.sqrt(r6)
            float r1 = (float) r6
            float r0 = r0 / r1
            goto L29
        L28:
            r0 = 0
        L29:
            double r0 = (double) r0
            float r6 = r16.m26862()
            double r6 = (double) r6
            r8 = 4598895795485655695(0x3fd28f5c28f5c28f, double:0.29)
            double r6 = java.lang.Math.pow(r8, r6)
            r8 = 4610064722561534525(0x3ffa3d70a3d70a3d, double:1.64)
            double r8 = r8 - r6
            r6 = 4604750475001237340(0x3fe75c28f5c28f5c, double:0.73)
            double r6 = java.lang.Math.pow(r8, r6)
            double r0 = r0 / r6
            r6 = 4607682818758614130(0x3ff1c71c71c71c72, double:1.1111111111111112)
            double r0 = java.lang.Math.pow(r0, r6)
            float r0 = (float) r0
            float r1 = r15.m5282()
            r6 = 1078530011(0x40490fdb, float:3.1415927)
            float r1 = r1 * r6
            r6 = 1127481344(0x43340000, float:180.0)
            float r1 = r1 / r6
            double r6 = (double) r1
            r8 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r8 = r8 + r6
            double r8 = java.lang.Math.cos(r8)
            r10 = 4615739258092021350(0x400e666666666666, double:3.8)
            double r8 = r8 + r10
            float r1 = (float) r8
            r8 = 1048576000(0x3e800000, float:0.25)
            float r1 = r1 * r8
            float r8 = r16.m26858()
            float r9 = r15.m5283()
            double r9 = (double) r9
            double r9 = r9 / r4
            float r4 = r16.m26859()
            double r4 = (double) r4
            r11 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r11 = r11 / r4
            float r4 = r16.m26867()
            double r4 = (double) r4
            double r11 = r11 / r4
            double r4 = java.lang.Math.pow(r9, r11)
            float r4 = (float) r4
            float r8 = r8 * r4
            r4 = 1164993142(0x45706276, float:3846.1538)
            float r1 = r1 * r4
            float r4 = r16.m26864()
            float r1 = r1 * r4
            float r4 = r16.m26865()
            float r1 = r1 * r4
            float r4 = r16.m26863()
            float r8 = r8 / r4
            double r4 = java.lang.Math.sin(r6)
            float r4 = (float) r4
            double r5 = java.lang.Math.cos(r6)
            float r5 = (float) r5
            r6 = 1050421494(0x3e9c28f6, float:0.305)
            float r6 = r6 + r8
            r7 = 1102577664(0x41b80000, float:23.0)
            float r6 = r6 * r7
            float r6 = r6 * r0
            float r1 = r1 * r7
            r7 = 1093664768(0x41300000, float:11.0)
            float r7 = r7 * r0
            float r7 = r7 * r5
            float r1 = r1 + r7
            r7 = 1121452032(0x42d80000, float:108.0)
            float r0 = r0 * r7
            float r0 = r0 * r4
            float r1 = r1 + r0
            float r6 = r6 / r1
            float r5 = r5 * r6
            float r6 = r6 * r4
            r0 = 1139146752(0x43e60000, float:460.0)
            float r8 = r8 * r0
            r0 = 1138851840(0x43e18000, float:451.0)
            float r0 = r0 * r5
            float r0 = r0 + r8
            r1 = 1133510656(0x43900000, float:288.0)
            float r1 = r1 * r6
            float r0 = r0 + r1
            r1 = 1152344064(0x44af6000, float:1403.0)
            float r0 = r0 / r1
            r4 = 1147060224(0x445ec000, float:891.0)
            float r4 = r4 * r5
            float r4 = r8 - r4
            r7 = 1132625920(0x43828000, float:261.0)
            float r7 = r7 * r6
            float r4 = r4 - r7
            float r4 = r4 / r1
            r7 = 1130102784(0x435c0000, float:220.0)
            float r5 = r5 * r7
            float r8 = r8 - r5
            r5 = 1170530304(0x45c4e000, float:6300.0)
            float r6 = r6 * r5
            float r8 = r8 - r6
            float r8 = r8 / r1
            float r1 = java.lang.Math.abs(r0)
            double r5 = (double) r1
            r9 = 4628329633800288993(0x403b2147ae147ae1, double:27.13)
            double r5 = r5 * r9
            float r1 = java.lang.Math.abs(r0)
            double r11 = (double) r1
            r13 = 4645744490609377280(0x4079000000000000, double:400.0)
            double r11 = r13 - r11
            double r5 = r5 / r11
            double r5 = java.lang.Math.max(r2, r5)
            float r1 = (float) r5
            float r0 = java.lang.Math.signum(r0)
            float r5 = r16.m26860()
            r6 = 1120403456(0x42c80000, float:100.0)
            float r5 = r6 / r5
            float r0 = r0 * r5
            double r11 = (double) r1
            r6 = 4612543846927839427(0x40030c30c30c30c3, double:2.380952380952381)
            double r11 = java.lang.Math.pow(r11, r6)
            float r5 = (float) r11
            float r0 = r0 * r5
            float r5 = java.lang.Math.abs(r4)
            double r11 = (double) r5
            double r11 = r11 * r9
            float r5 = java.lang.Math.abs(r4)
            double r9 = (double) r5
            double r9 = r13 - r9
            double r11 = r11 / r9
            double r9 = java.lang.Math.max(r2, r11)
            float r5 = (float) r9
            float r4 = java.lang.Math.signum(r4)
            float r9 = r16.m26860()
            r1 = 1120403456(0x42c80000, float:100.0)
            float r9 = r1 / r9
            float r4 = r4 * r9
            double r9 = (double) r5
            double r9 = java.lang.Math.pow(r9, r6)
            float r5 = (float) r9
            float r4 = r4 * r5
            float r5 = java.lang.Math.abs(r8)
            double r9 = (double) r5
            r11 = 4628329633800288993(0x403b2147ae147ae1, double:27.13)
            double r9 = r9 * r11
            float r5 = java.lang.Math.abs(r8)
            double r11 = (double) r5
            double r13 = r13 - r11
            double r9 = r9 / r13
            double r2 = java.lang.Math.max(r2, r9)
            float r2 = (float) r2
            float r3 = java.lang.Math.signum(r8)
            float r5 = r16.m26860()
            r1 = 1120403456(0x42c80000, float:100.0)
            float r1 = r1 / r5
            float r3 = r3 * r1
            double r1 = (double) r2
            double r1 = java.lang.Math.pow(r1, r6)
            float r1 = (float) r1
            float r3 = r3 * r1
            float[] r1 = r16.m26866()
            r2 = 0
            r1 = r1[r2]
            float r0 = r0 / r1
            float[] r1 = r16.m26866()
            r5 = 1
            r1 = r1[r5]
            float r4 = r4 / r1
            float[] r1 = r16.m26866()
            r6 = 2
            r1 = r1[r6]
            float r3 = r3 / r1
            float[][] r1 = Yue.C0925.f2688
            r7 = r1[r2]
            r8 = r7[r2]
            float r8 = r8 * r0
            r9 = r7[r5]
            float r9 = r9 * r4
            float r8 = r8 + r9
            r7 = r7[r6]
            float r7 = r7 * r3
            float r8 = r8 + r7
            r7 = r1[r5]
            r9 = r7[r2]
            float r9 = r9 * r0
            r10 = r7[r5]
            float r10 = r10 * r4
            float r9 = r9 + r10
            r7 = r7[r6]
            float r7 = r7 * r3
            float r9 = r9 + r7
            r1 = r1[r6]
            r2 = r1[r2]
            float r0 = r0 * r2
            r2 = r1[r5]
            float r4 = r4 * r2
            float r0 = r0 + r4
            r1 = r1[r6]
            float r3 = r3 * r1
            float r0 = r0 + r3
            double r1 = (double) r8
            double r3 = (double) r9
            double r5 = (double) r0
            int r0 = Yue.C1248.m6646(r1, r3, r5)
            return r0
    }

    @Yue.InterfaceC1230
    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public int m5289() {
            r1 = this;
            Yue.ۥۢۥ۟۠ r0 = Yue.C6950.f24194
            int r0 = r1.m5288(r0)
            return r0
    }
}
