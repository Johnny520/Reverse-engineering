package defpackage;

import android.graphics.Color;

/* JADX INFO: loaded from: classes.dex */
public final class f8 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;

    public f8(float r1, float r2, float r3, float r4, float r5, float r6) {
        this.a = r1;
        this.b = r2;
        this.c = r3;
        this.d = r4;
        this.e = r5;
        this.f = r6;
    }

    public static f8 a(int r26) {
        gb0 r0 = gb0.k;
        float r1 = ff.z(Color.red(r26));
        float r2 = ff.z(Color.green(r26));
        float r3 = ff.z(Color.blue(r26));
        float[][] r4 = ff.j;
        float[] r6 = r4[0];
        float r62 = (r6[2] * r3) + ((r6[1] * r2) + (r6[0] * r1));
        float[] r9 = r4[1];
        float r92 = (r9[2] * r3) + ((r9[1] * r2) + (r9[0] * r1));
        float[] r42 = r4[2];
        float[] r12 = {r62, r92, (r3 * r42[2]) + ((r2 * r42[1]) + (r1 * r42[0]))};
        float[][] r22 = ff.g;
        float r32 = r12[0];
        float[] r43 = r22[0];
        float r63 = r43[0] * r32;
        float r93 = r12[1];
        float r10 = (r43[1] * r93) + r63;
        float r13 = r12[2];
        float r44 = (r43[2] * r13) + r10;
        float[] r64 = r22[1];
        float r65 = (r64[2] * r13) + ((r64[1] * r93) + (r64[0] * r32));
        float[] r23 = r22[2];
        float r14 = (r13 * r23[2]) + ((r93 * r23[1]) + (r32 * r23[0]));
        float[] r24 = r0.g;
        float r33 = r0.i;
        float r94 = r0.d;
        float r102 = r0.a;
        float r5 = r24[0] * r44;
        float r45 = r24[1] * r65;
        float r25 = r24[2] * r14;
        float r15 = r0.h;
        float r66 = (float) Math.pow(((double) (Math.abs(r5) * r15)) / 100.0d, 0.42d);
        float r7 = (float) Math.pow(((double) (Math.abs(r45) * r15)) / 100.0d, 0.42d);
        float r16 = (float) Math.pow(((double) (Math.abs(r25) * r15)) / 100.0d, 0.42d);
        float r52 = ((Math.signum(r5) * 400.0f) * r66) / (r66 + 27.13f);
        float r46 = ((Math.signum(r45) * 400.0f) * r7) / (r7 + 27.13f);
        float r27 = ((Math.signum(r25) * 400.0f) * r16) / (r16 + 27.13f);
        double r67 = r27;
        float r17 = ((float) (((((double) r46) * (-12.0d)) + (((double) r52) * 11.0d)) + r67)) / 11.0f;
        float r68 = ((float) (((double) (r52 + r46)) - (r67 * 2.0d))) / 9.0f;
        float r47 = r46 * 20.0f;
        float r11 = ((21.0f * r27) + ((r52 * 20.0f) + r47)) / 20.0f;
        float r53 = (((r52 * 40.0f) + r47) + r27) / 20.0f;
        float r28 = (((float) Math.atan2(r68, r17)) * 180.0f) / 3.1415927f;
        if (r28 >= 0.0f) goto L6;
        r28 = r28 + 360.0f;
    L8:
        float r72 = (3.1415927f * r28) / 180.0f;
        float r48 = ((float) Math.pow((r53 * r0.b) / r102, r0.j * r94)) * 100.0f;
        Math.sqrt(r48 / 100.0f);
        float r103 = r102 + 4.0f;
        if (r28 >= 20.14d) goto L11;
        float r122 = 360.0f + r28;
    L12:
        float r21 = (((float) Math.pow(1.64d - Math.pow(0.29d, r0.f), 0.73d)) * ((float) Math.pow((((((((float) (Math.cos(((((double) r122) * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * r0.e) * r0.c) * ((float) Math.sqrt((r68 * r68) + (r17 * r17)))) / (r11 + 0.305f), 0.9d))) * ((float) Math.sqrt(((double) r48) / 100.0d));
        Math.sqrt((r0 * r94) / r103);
        float r232 = (1.7f * r48) / ((0.007f * r48) + 1.0f);
        float r02 = ((float) Math.log(((r33 * r21) * 0.0228f) + 1.0f)) * 43.85965f;
        double r54 = r72;
        return new f8(r28, r21, r48, r232, r02 * ((float) Math.cos(r54)), r02 * ((float) Math.sin(r54)));
    L11:
        r122 = r28;
        goto L12
    L6:
        if (r28 < 360.0f) goto L8;
        r28 = r28 - 360.0f;
        goto L8
    }

    public static f8 b(float r12, float r13, float r14) {
        gb0 r0 = gb0.k;
        float r1 = r0.d;
        Math.sqrt(((double) r12) / 100.0d);
        float r3 = r0.a + 4.0f;
        float r4 = r0.i * r13;
        Math.sqrt(((r13 / ((float) Math.sqrt(r1))) * r0.d) / r3);
        float r9 = (1.7f * r12) / ((0.007f * r12) + 1.0f);
        float r15 = ((float) Math.log((((double) r4) * 0.0228d) + 1.0d)) * 43.85965f;
        double r2 = (3.1415927f * r14) / 180.0f;
        return new f8(r14, r13, r12, r9, r15 * ((float) Math.cos(r2)), r15 * ((float) Math.sin(r2)));
    }

    public final int c(gb0 r20) {
        float r2 = this.b;
        double r3 = r2;
        float r4 = this.c;
        if (r3 == 0.0d) goto L8;
        double r9 = r4;
        if (r9 == 0.0d) goto L8;
        float r22 = r2 / ((float) Math.sqrt(r9 / 100.0d));
    L9:
        float r92 = r20.f;
        float r10 = r20.h;
        float r23 = (float) Math.pow(((double) r22) / Math.pow(1.64d - Math.pow(0.29d, r92), 0.73d), 1.1111111111111112d);
        double r11 = (this.a * 3.1415927f) / 180.0f;
        float r32 = ((float) (Math.cos(2.0d + r11) + 3.8d)) * 0.25f;
        float r93 = r20.a * ((float) Math.pow(((double) r4) / 100.0d, (1.0d / ((double) r20.d)) / ((double) r20.j)));
        float r33 = ((r32 * 3846.1538f) * r20.e) * r20.c;
        float r94 = r93 / r20.b;
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
        float[] r1 = r20.g;
        float r36 = r35 / r1[0];
        float r45 = r44 / r1[1];
        float r52 = r5 / r1[2];
        float[][] r12 = ff.h;
        float[] r83 = r12[0];
        float r84 = (r83[2] * r52) + ((r83[1] * r45) + (r83[0] * r36));
        float[] r97 = r12[1];
        float r98 = (r97[2] * r52) + ((r97[1] * r45) + (r97[0] * r36));
        float[] r13 = r12[2];
        float r46 = (r45 * r13[1]) + (r36 * r13[0]);
        return ib.a(r84, r98, (r52 * r13[2]) + r46);
    L8:
        r22 = 0.0f;
        goto L9
    }
}
