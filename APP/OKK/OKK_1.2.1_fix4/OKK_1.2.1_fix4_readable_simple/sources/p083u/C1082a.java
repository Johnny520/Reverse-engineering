package p083u;

import android.graphics.Color;
import p085v.AbstractC1100a;

/* JADX INFO: renamed from: u.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1082a {

    /* JADX INFO: renamed from: a */
    public final float f4183a;

    /* JADX INFO: renamed from: b */
    public final float f4184b;

    /* JADX INFO: renamed from: c */
    public final float f4185c;

    /* JADX INFO: renamed from: d */
    public final float f4186d;

    /* JADX INFO: renamed from: e */
    public final float f4187e;

    /* JADX INFO: renamed from: f */
    public final float f4188f;

    public C1082a(float r1, float r2, float r3, float r4, float r5, float r6) {
        this.f4183a = r1;
        this.f4184b = r2;
        this.f4185c = r3;
        this.f4186d = r4;
        this.f4187e = r5;
        this.f4188f = r6;
    }

    /* JADX INFO: renamed from: a */
    public static C1082a m2565a(int r21) {
        C1095n r02 = C1095n.f4213k;
        float r1 = AbstractC1083b.m2571e(Color.red(r21));
        float r2 = AbstractC1083b.m2571e(Color.green(r21));
        float r3 = AbstractC1083b.m2571e(Color.blue(r21));
        float[][] r4 = AbstractC1083b.f4192d;
        float[] r6 = r4[0];
        float r62 = (r6[2] * r3) + ((r6[1] * r2) + (r6[0] * r1));
        float[] r9 = r4[1];
        float r92 = (r9[2] * r3) + ((r9[1] * r2) + (r9[0] * r1));
        float[] r42 = r4[2];
        float r32 = (r3 * r42[2]) + ((r2 * r42[1]) + (r1 * r42[0]));
        float[][] r12 = AbstractC1083b.f4189a;
        float[] r22 = r12[0];
        float r23 = (r22[2] * r32) + ((r22[1] * r92) + (r22[0] * r62));
        float[] r43 = r12[1];
        float r44 = (r43[2] * r32) + ((r43[1] * r92) + (r43[0] * r62));
        float[] r13 = r12[2];
        float r33 = (r32 * r13[2]) + ((r92 * r13[1]) + (r62 * r13[0]));
        float[] r14 = r02.f4220g;
        float r5 = r14[0] * r23;
        float r24 = r14[1] * r44;
        float r15 = r14[2] * r33;
        float r34 = Math.abs(r5);
        float r45 = r02.f4221h;
        float r35 = (float) Math.pow(((double) (r34 * r45)) / 100.0d, 0.42d);
        float r63 = (float) Math.pow(((double) (Math.abs(r24) * r45)) / 100.0d, 0.42d);
        float r46 = (float) Math.pow(((double) (Math.abs(r15) * r45)) / 100.0d, 0.42d);
        float r52 = ((Math.signum(r5) * 400.0f) * r35) / (r35 + 27.13f);
        float r25 = ((Math.signum(r24) * 400.0f) * r63) / (r63 + 27.13f);
        float r16 = ((Math.signum(r15) * 400.0f) * r46) / (r46 + 27.13f);
        double r36 = r16;
        float r64 = ((float) (((((double) r25) * (-12.0d)) + (((double) r52) * 11.0d)) + r36)) / 11.0f;
        float r37 = ((float) (((double) (r52 + r25)) - (r36 * 2.0d))) / 9.0f;
        float r26 = r25 * 20.0f;
        float r10 = ((21.0f * r16) + ((r52 * 20.0f) + r26)) / 20.0f;
        float r53 = (((r52 * 40.0f) + r26) + r16) / 20.0f;
        float r17 = (((float) Math.atan2(r37, r64)) * 180.0f) / 3.1415927f;
        if (r17 >= 0.0f) goto L7;
        r17 = r17 + 360.0f;
    L5:
        float r152 = r17;
        float r47 = (3.1415927f * r152) / 180.0f;
        float r54 = r53 * r02.f4215b;
        float r18 = r02.f4214a;
        float r27 = r02.f4217d;
        float r55 = ((float) Math.pow(r54 / r18, r02.f4223j * r27)) * 100.0f;
        Math.sqrt(r55 / 100.0f);
        float r19 = r18 + 4.0f;
        if (r152 >= 20.14d) goto L12;
        float r11 = 360.0f + r152;
    L13:
        float r38 = r37 * r37;
        float r162 = (((float) Math.pow(1.64d - Math.pow(0.29d, r02.f4219f), 0.73d)) * ((float) Math.pow((((((((float) (Math.cos(((((double) r11) * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * r02.f4218e) * r02.f4216c) * ((float) Math.sqrt(r38 + (r64 * r64)))) / (r10 + 0.305f), 0.9d))) * ((float) Math.sqrt(((double) r55) / 100.0d));
        float r03 = r02.f4222i * r162;
        Math.sqrt((r3 * r27) / r19);
        float r182 = (1.7f * r55) / ((0.007f * r55) + 1.0f);
        float r04 = ((float) Math.log((r03 * 0.0228f) + 1.0f)) * 43.85965f;
        double r110 = r47;
        return new C1082a(r152, r162, r55, r182, r04 * ((float) Math.cos(r110)), r04 * ((float) Math.sin(r110)));
    L12:
        r11 = r152;
        goto L13
    L7:
        if (r17 < 360.0f) goto L5;
        r17 = r17 - 360.0f;
        goto L5
    }

    /* JADX INFO: renamed from: b */
    public static C1082a m2566b(float r12, float r13, float r14) {
        C1095n r02 = C1095n.f4213k;
        float r1 = r02.f4217d;
        Math.sqrt(((double) r12) / 100.0d);
        float r3 = r02.f4214a + 4.0f;
        float r4 = r02.f4222i * r13;
        Math.sqrt(((r13 / ((float) Math.sqrt(r1))) * r02.f4217d) / r3);
        float r9 = (1.7f * r12) / ((0.007f * r12) + 1.0f);
        float r15 = ((float) Math.log((((double) r4) * 0.0228d) + 1.0d)) * 43.85965f;
        double r2 = (3.1415927f * r14) / 180.0f;
        return new C1082a(r14, r13, r12, r9, r15 * ((float) Math.cos(r2)), r15 * ((float) Math.sin(r2)));
    }

    /* JADX INFO: renamed from: c */
    public final int m2567c(C1095n r17) {
        float r2 = this.f4184b;
        double r3 = r2;
        float r4 = this.f4185c;
        if (r3 == 0.0d) goto L8;
        double r9 = r4;
        if (r9 == 0.0d) goto L8;
        float r22 = r2 / ((float) Math.sqrt(r9 / 100.0d));
    L9:
        float r23 = (float) Math.pow(((double) r22) / Math.pow(1.64d - Math.pow(0.29d, r17.f4219f), 0.73d), 1.1111111111111112d);
        double r92 = (this.f4183a * 3.1415927f) / 180.0f;
        float r32 = ((float) (Math.cos(2.0d + r92) + 3.8d)) * 0.25f;
        float r7 = r17.f4214a * ((float) Math.pow(((double) r4) / 100.0d, (1.0d / ((double) r17.f4217d)) / ((double) r17.f4223j)));
        float r33 = ((r32 * 3846.1538f) * r17.f4218e) * r17.f4216c;
        float r72 = r7 / r17.f4215b;
        float r42 = (float) Math.sin(r92);
        float r8 = (float) Math.cos(r92);
        float r10 = (11.0f * r23) * r8;
        float r93 = (((0.305f + r72) * 23.0f) * r23) / (((r23 * 108.0f) * r42) + (r10 + (r33 * 23.0f)));
        float r82 = r8 * r93;
        float r94 = r93 * r42;
        float r73 = r72 * 460.0f;
        float r34 = ((288.0f * r94) + ((451.0f * r82) + r73)) / 1403.0f;
        float r43 = ((r73 - (891.0f * r82)) - (261.0f * r94)) / 1403.0f;
        float r74 = ((r73 - (r82 * 220.0f)) - (r94 * 6300.0f)) / 1403.0f;
        float r24 = (float) Math.max(0.0d, (((double) Math.abs(r34)) * 27.13d) / (400.0d - ((double) Math.abs(r34))));
        float r35 = Math.signum(r34);
        float r83 = 100.0f / r17.f4221h;
        float r36 = (r35 * r83) * ((float) Math.pow(r24, 2.380952380952381d));
        float r44 = (Math.signum(r43) * r83) * ((float) Math.pow((float) Math.max(0.0d, (((double) Math.abs(r43)) * 27.13d) / (400.0d - ((double) Math.abs(r43)))), 2.380952380952381d));
        float r75 = (Math.signum(r74) * r83) * ((float) Math.pow((float) Math.max(0.0d, (((double) Math.abs(r74)) * 27.13d) / (400.0d - ((double) Math.abs(r74)))), 2.380952380952381d));
        float[] r1 = r17.f4220g;
        float r37 = r36 / r1[0];
        float r45 = r44 / r1[1];
        float r76 = r75 / r1[2];
        float[][] r12 = AbstractC1083b.f4190b;
        float[] r84 = r12[0];
        float r85 = (r84[2] * r76) + ((r84[1] * r45) + (r84[0] * r37));
        float[] r95 = r12[1];
        float r96 = (r95[2] * r76) + ((r95[1] * r45) + (r95[0] * r37));
        float[] r13 = r12[2];
        return AbstractC1100a.m2592a(r85, r96, (r76 * r13[2]) + ((r45 * r13[1]) + (r37 * r13[0])));
    L8:
        r22 = 0.0f;
        goto L9
    }
}
