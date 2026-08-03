package p000;

import android.graphics.Color;

/* JADX INFO: renamed from: I6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0351I6 {

    /* JADX INFO: renamed from: a */
    public final float f1178a;

    /* JADX INFO: renamed from: b */
    public final float f1179b;

    /* JADX INFO: renamed from: c */
    public final float f1180c;

    /* JADX INFO: renamed from: d */
    public final float f1181d;

    /* JADX INFO: renamed from: e */
    public final float f1182e;

    /* JADX INFO: renamed from: f */
    public final float f1183f;

    public C0351I6(float r1, float r2, float r3, float r4, float r5, float r6) {
        this.f1178a = r1;
        this.f1179b = r2;
        this.f1180c = r3;
        this.f1181d = r4;
        this.f1182e = r5;
        this.f1183f = r6;
    }

    /* JADX INFO: renamed from: a */
    public static C0351I6 m752a(int r26) {
        C0917VE r0 = C0917VE.f2864k;
        float r1 = AbstractC0628Oj.m1229L(Color.red(r26));
        float r2 = AbstractC0628Oj.m1229L(Color.green(r26));
        float r3 = AbstractC0628Oj.m1229L(Color.blue(r26));
        float[][] r4 = AbstractC0628Oj.f2010d;
        float[] r6 = r4[0];
        float r62 = (r6[2] * r3) + ((r6[1] * r2) + (r6[0] * r1));
        float[] r9 = r4[1];
        float r92 = (r9[2] * r3) + ((r9[1] * r2) + (r9[0] * r1));
        float[] r42 = r4[2];
        float r32 = (r3 * r42[2]) + ((r2 * r42[1]) + (r1 * r42[0]));
        float[][] r12 = AbstractC0628Oj.f2007a;
        float[] r22 = r12[0];
        float r23 = (r22[2] * r32) + ((r22[1] * r92) + (r22[0] * r62));
        float[] r43 = r12[1];
        float r44 = (r43[2] * r32) + ((r43[1] * r92) + (r43[0] * r62));
        float[] r13 = r12[2];
        float r33 = (r32 * r13[2]) + ((r92 * r13[1]) + (r62 * r13[0]));
        float[] r14 = r0.f2871g;
        float r63 = r0.f2873i;
        float r93 = r0.f2868d;
        float r10 = r0.f2865a;
        float r5 = r14[0] * r23;
        float r24 = r14[1] * r44;
        float r15 = r14[2] * r33;
        float r34 = r0.f2872h;
        float r45 = (float) Math.pow(((double) (Math.abs(r5) * r34)) / 100.0d, 0.42d);
        float r7 = (float) Math.pow(((double) (Math.abs(r24) * r34)) / 100.0d, 0.42d);
        float r35 = (float) Math.pow(((double) (Math.abs(r15) * r34)) / 100.0d, 0.42d);
        float r52 = ((Math.signum(r5) * 400.0f) * r45) / (r45 + 27.13f);
        float r25 = ((Math.signum(r24) * 400.0f) * r7) / (r7 + 27.13f);
        float r16 = ((Math.signum(r15) * 400.0f) * r35) / (r35 + 27.13f);
        double r36 = r16;
        float r72 = ((float) (((((double) r25) * (-12.0d)) + (((double) r52) * 11.0d)) + r36)) / 11.0f;
        float r37 = ((float) (((double) (r52 + r25)) - (r36 * 2.0d))) / 9.0f;
        float r27 = r25 * 20.0f;
        float r11 = ((21.0f * r16) + ((r52 * 20.0f) + r27)) / 20.0f;
        float r53 = (((r52 * 40.0f) + r27) + r16) / 20.0f;
        float r17 = (((float) Math.atan2(r37, r72)) * 180.0f) / 3.1415927f;
        if (r17 >= 0.0f) goto L6;
        r17 = r17 + 360.0f;
    L8:
        float r46 = (3.1415927f * r17) / 180.0f;
        float r28 = ((float) Math.pow((r53 * r0.f2866b) / r10, r0.f2874j * r93)) * 100.0f;
        Math.sqrt(r28 / 100.0f);
        float r102 = r10 + 4.0f;
        if (r17 >= 20.14d) goto L11;
        float r122 = 360.0f + r17;
    L12:
        float r54 = r37 * r37;
        float r21 = (((float) Math.pow(1.64d - Math.pow(0.29d, r0.f2870f), 0.73d)) * ((float) Math.pow((((((((float) (Math.cos(((((double) r122) * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * r0.f2869e) * r0.f2867c) * ((float) Math.sqrt(r54 + (r72 * r72)))) / (r11 + 0.305f), 0.9d))) * ((float) Math.sqrt(((double) r28) / 100.0d));
        Math.sqrt((r0 * r93) / r102);
        float r232 = (1.7f * r28) / ((0.007f * r28) + 1.0f);
        float r02 = ((float) Math.log(((r63 * r21) * 0.0228f) + 1.0f)) * 43.85965f;
        double r38 = r46;
        return new C0351I6(r17, r21, r28, r232, r02 * ((float) Math.cos(r38)), r02 * ((float) Math.sin(r38)));
    L11:
        r122 = r17;
        goto L12
    L6:
        if (r17 < 360.0f) goto L8;
        r17 = r17 - 360.0f;
        goto L8
    }

    /* JADX INFO: renamed from: b */
    public static C0351I6 m753b(float r12, float r13, float r14) {
        C0917VE r0 = C0917VE.f2864k;
        float r1 = r0.f2868d;
        Math.sqrt(((double) r12) / 100.0d);
        float r3 = r0.f2865a + 4.0f;
        float r4 = r0.f2873i * r13;
        Math.sqrt(((r13 / ((float) Math.sqrt(r1))) * r0.f2868d) / r3);
        float r9 = (1.7f * r12) / ((0.007f * r12) + 1.0f);
        float r15 = ((float) Math.log((((double) r4) * 0.0228d) + 1.0d)) * 43.85965f;
        double r2 = (3.1415927f * r14) / 180.0f;
        return new C0351I6(r14, r13, r12, r9, r15 * ((float) Math.cos(r2)), r15 * ((float) Math.sin(r2)));
    }

    /* JADX INFO: renamed from: c */
    public final int m754c(C0917VE r20) {
        float r2 = this.f1179b;
        double r3 = r2;
        float r4 = this.f1180c;
        if (r3 == 0.0d) goto L8;
        double r9 = r4;
        if (r9 == 0.0d) goto L8;
        float r22 = r2 / ((float) Math.sqrt(r9 / 100.0d));
    L9:
        float r92 = r20.f2870f;
        float r10 = r20.f2872h;
        float r23 = (float) Math.pow(((double) r22) / Math.pow(1.64d - Math.pow(0.29d, r92), 0.73d), 1.1111111111111112d);
        double r11 = (this.f1178a * 3.1415927f) / 180.0f;
        float r32 = ((float) (Math.cos(2.0d + r11) + 3.8d)) * 0.25f;
        float r93 = r20.f2865a * ((float) Math.pow(((double) r4) / 100.0d, (1.0d / ((double) r20.f2868d)) / ((double) r20.f2874j)));
        float r33 = ((r32 * 3846.1538f) * r20.f2869e) * r20.f2867c;
        float r94 = r93 / r20.f2866b;
        float r42 = (float) Math.sin(r11);
        float r7 = (float) Math.cos(r11);
        float r112 = (11.0f * r23) * r7;
        float r8 = (((0.305f + r94) * 23.0f) * r23) / (((r23 * 108.0f) * r42) + (r112 + (r33 * 23.0f)));
        float r72 = r7 * r8;
        float r82 = r8 * r42;
        float r95 = r94 * 460.0f;
        float r34 = ((288.0f * r82) + ((451.0f * r72) + r95)) / 1403.0f;
        float r43 = ((r95 - (891.0f * r72)) - (261.0f * r82)) / 1403.0f;
        float r96 = ((r95 - (r72 * 220.0f)) - (r82 * 6300.0f)) / 1403.0f;
        float r73 = 100.0f / r10;
        float r35 = (Math.signum(r34) * r73) * ((float) Math.pow((float) Math.max(0.0d, (((double) Math.abs(r34)) * 27.13d) / (400.0d - ((double) Math.abs(r34)))), 2.380952380952381d));
        float r44 = (Math.signum(r43) * r73) * ((float) Math.pow((float) Math.max(0.0d, (((double) Math.abs(r43)) * 27.13d) / (400.0d - ((double) Math.abs(r43)))), 2.380952380952381d));
        float r5 = (Math.signum(r96) * r73) * ((float) Math.pow((float) Math.max(0.0d, (((double) Math.abs(r96)) * 27.13d) / (400.0d - ((double) Math.abs(r96)))), 2.380952380952381d));
        float[] r1 = r20.f2871g;
        float r36 = r35 / r1[0];
        float r45 = r44 / r1[1];
        float r52 = r5 / r1[2];
        float[][] r12 = AbstractC0628Oj.f2008b;
        float[] r83 = r12[0];
        float r84 = (r83[2] * r52) + ((r83[1] * r45) + (r83[0] * r36));
        float[] r97 = r12[1];
        float r98 = (r97[2] * r52) + ((r97[1] * r45) + (r97[0] * r36));
        float[] r13 = r12[2];
        float r46 = (r45 * r13[1]) + (r36 * r13[0]);
        return AbstractC2797za.m5363a(r84, r98, (r52 * r13[2]) + r46);
    L8:
        r22 = 0.0f;
        goto L9
    }
}
