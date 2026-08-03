package p083u;

/* JADX INFO: renamed from: u.n */
/* JADX INFO: loaded from: classes.dex */
public final class C1095n {

    /* JADX INFO: renamed from: k */
    public static final C1095n f4213k = null;

    /* JADX INFO: renamed from: a */
    public final float f4214a;

    /* JADX INFO: renamed from: b */
    public final float f4215b;

    /* JADX INFO: renamed from: c */
    public final float f4216c;

    /* JADX INFO: renamed from: d */
    public final float f4217d;

    /* JADX INFO: renamed from: e */
    public final float f4218e;

    /* JADX INFO: renamed from: f */
    public final float f4219f;

    /* JADX INFO: renamed from: g */
    public final float[] f4220g;

    /* JADX INFO: renamed from: h */
    public final float f4221h;

    /* JADX INFO: renamed from: i */
    public final float f4222i;

    /* JADX INFO: renamed from: j */
    public final float f4223j;

    static {
        float[] r4 = AbstractC1083b.f4191c;
        float r5 = (float) ((((double) AbstractC1083b.m2575k()) * 63.66197723675813d) / 100.0d);
        float[][] r6 = AbstractC1083b.f4189a;
        float r9 = r4[0];
        float[] r10 = r6[0];
        float r11 = r10[0] * r9;
        float r12 = r4[1];
        float r13 = (r10[1] * r12) + r11;
        float r112 = r4[2];
        float r102 = (r10[2] * r112) + r13;
        float[] r132 = r6[1];
        float r133 = (r132[2] * r112) + ((r132[1] * r12) + (r132[0] * r9));
        float[] r62 = r6[2];
        float r113 = (r112 * r62[2]) + ((r12 * r62[1]) + (r9 * r62[0]));
        if (1.0f < 0.9d) goto L6;
        float r92 = 0.69f;
    L5:
        float r19 = r92;
        float r93 = (1.0f - (((float) Math.exp(((-r5) - 42.0f) / 92.0f)) * 0.2777778f)) * 1.0f;
        double r14 = r93;
        if (r14 <= 1.0d) goto L11;
        r93 = 1.0f;
    L13:
        float[] r94 = {(((100.0f / r102) * r93) + 1.0f) - r93, (((100.0f / r133) * r93) + 1.0f) - r93, (((100.0f / r113) * r93) + 1.0f) - r93};
        float r142 = 1.0f / ((5.0f * r5) + 1.0f);
        float r15 = ((r142 * r142) * r142) * r142;
        float r122 = 1.0f - r15;
        float r02 = (((0.1f * r122) * r122) * ((float) Math.cbrt(((double) r5) * 5.0d))) + (r15 * r5);
        float r152 = AbstractC1083b.m2575k() / r4[1];
        double r42 = r152;
        float r24 = ((float) Math.sqrt(r42)) + 1.48f;
        float r43 = 0.725f / ((float) Math.pow(r42, 0.2d));
        float[] r103 = {(float) Math.pow(((double) ((r94[0] * r02) * r102)) / 100.0d, 0.42d), (float) Math.pow(((double) ((r94[1] * r02) * r133)) / 100.0d, 0.42d), (float) Math.pow(((double) ((r94[2] * r02) * r113)) / 100.0d, 0.42d)};
        float r2 = r103[0];
        float r8 = (r2 * 400.0f) / (r2 + 27.13f);
        float r22 = r103[1];
        float r134 = (r22 * 400.0f) / (r22 + 27.13f);
        float r23 = r103[2];
        float[] r25 = {r8, r134, (400.0f * r23) / (r23 + 27.13f)};
        f4213k = new C1095n(r152, ((r25[2] * 0.05f) + ((r25[0] * 2.0f) + r25[1])) * r43, r43, r43, r19, 1.0f, r94, r02, (float) Math.pow(r02, 0.25d), r24);
        return;
    L11:
        if (r14 >= 0.0d) goto L13;
        r93 = 0.0f;
        goto L13
    L6:
        r92 = 0.655f;
        goto L5
    }

    public C1095n(float r1, float r2, float r3, float r4, float r5, float r6, float[] r7, float r8, float r9, float r10) {
        this.f4219f = r1;
        this.f4214a = r2;
        this.f4215b = r3;
        this.f4216c = r4;
        this.f4217d = r5;
        this.f4218e = r6;
        this.f4220g = r7;
        this.f4221h = r8;
        this.f4222i = r9;
        this.f4223j = r10;
    }
}
