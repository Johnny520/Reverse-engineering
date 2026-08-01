package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class gb0 {
    public static final gb0 k = null;
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float[] g;
    public final float h;
    public final float i;
    public final float j;

    static {
        float[] r0 = ff.i;
        float r1 = (float) ((((double) ff.a0()) * 63.66197723675813d) / 100.0d);
        float[][] r2 = ff.g;
        float r6 = r0[0];
        float[] r7 = r2[0];
        float r8 = r7[0] * r6;
        float r10 = r0[1];
        float r11 = (r7[1] * r10) + r8;
        float r12 = r0[2];
        float r72 = (r7[2] * r12) + r11;
        float[] r112 = r2[1];
        float r113 = (r112[2] * r12) + ((r112[1] * r10) + (r112[0] * r6));
        float[] r22 = r2[2];
        float r122 = (r12 * r22[2]) + ((r10 * r22[1]) + (r6 * r22[0]));
        if (1.0f < 0.9d) goto L6;
        float r62 = 0.69f;
    L5:
        float r18 = r62;
        float r63 = (1.0f - (((float) Math.exp(((-r1) - 42.0f) / 92.0f)) * 0.2777778f)) * 1.0f;
        double r13 = r63;
        if (r13 <= 1.0d) goto L11;
        r63 = 1.0f;
    L13:
        float[] r23 = {(((100.0f / r72) * r63) + 1.0f) - r63, (((100.0f / r113) * r63) + 1.0f) - r63, (((100.0f / r122) * r63) + 1.0f) - r63};
        float r132 = 1.0f / ((5.0f * r1) + 1.0f);
        float r14 = ((r132 * r132) * r132) * r132;
        float r102 = 1.0f - r14;
        float r133 = (((0.1f * r102) * r102) * ((float) Math.cbrt(((double) r1) * 5.0d))) + (r14 * r1);
        float r142 = ff.a0() / r0[1];
        double r02 = r142;
        float r232 = ((float) Math.sqrt(r02)) + 1.48f;
        float r16 = 0.725f / ((float) Math.pow(r02, 0.2d));
        float[] r4 = {(float) Math.pow(((double) ((r23[0] * r133) * r72)) / 100.0d, 0.42d), (float) Math.pow(((double) ((r23[1] * r133) * r113)) / 100.0d, 0.42d), (float) Math.pow(((double) ((r23[2] * r133) * r122)) / 100.0d, 0.42d)};
        float r03 = r4[0];
        float r3 = (r03 * 400.0f) / (r03 + 27.13f);
        float r04 = r4[1];
        float r103 = (r04 * 400.0f) / (r04 + 27.13f);
        float r05 = r4[2];
        float[] r06 = {r3, r103, (400.0f * r05) / (r05 + 27.13f)};
        k = new gb0(r142, ((r06[2] * 0.05f) + ((r06[0] * 2.0f) + r06[1])) * r16, r16, r16, r18, 1.0f, r23, r133, (float) Math.pow(r133, 0.25d), r232);
        return;
    L11:
        if (r13 >= 0.0d) goto L13;
        r63 = 0.0f;
        goto L13
    L6:
        r62 = 0.655f;
        goto L5
    }

    public gb0(float r1, float r2, float r3, float r4, float r5, float r6, float[] r7, float r8, float r9, float r10) {
        this.f = r1;
        this.a = r2;
        this.b = r3;
        this.c = r4;
        this.d = r5;
        this.e = r6;
        this.g = r7;
        this.h = r8;
        this.i = r9;
        this.j = r10;
    }
}
