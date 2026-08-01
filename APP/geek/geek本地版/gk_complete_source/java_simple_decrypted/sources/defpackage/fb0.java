package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class fb0 {
    public static final fb0 k = null;
    public final double a;
    public final double b;
    public final double c;
    public final double d;
    public final double e;
    public final double f;
    public final double[] g;
    public final double h;
    public final double i;
    public final double j;

    static {
        double[] r0 = a80.c;
        double r5 = (a80.J(50.0d) * 63.66197723675813d) / 100.0d;
        double r3 = Math.max(0.1d, 50.0d);
        double[][] r9 = a80.a;
        double r11 = r0[0];
        double[] r13 = r9[0];
        double r14 = r13[0] * r11;
        double r17 = r0[1];
        double r19 = (r13[1] * r17) + r14;
        double r21 = r0[2];
        double r23 = (r13[2] * r21) + r19;
        double[] r132 = r9[1];
        double r192 = (r132[2] * r21) + ((r132[1] * r17) + (r132[0] * r11));
        double[] r92 = r9[2];
        double r212 = (r21 * r92[2]) + ((r17 * r92[1]) + (r11 * r92[0]));
        double r112 = (1.0d - (Math.exp(((-r5) - 42.0d) / 92.0d) * 0.2777777777777778d)) * 1.0d;
        if (r112 >= 0.0d) goto L6;
        r112 = 0.0d;
    L8:
        double[] r113 = {(((100.0d / r23) * r112) + 1.0d) - r112, (((100.0d / r192) * r112) + 1.0d) - r112, (((100.0d / r212) * r112) + 1.0d) - r112};
        double r12 = 5.0d * r5;
        double r25 = 1.0d / (r12 + 1.0d);
        double r27 = ((r25 * r25) * r25) * r25;
        double r172 = 1.0d - r27;
        double r52 = (Math.cbrt(r12) * ((0.1d * r172) * r172)) + (r27 * r5);
        double r32 = a80.J(r3) / r0[1];
        double r43 = Math.sqrt(r32) + 1.48d;
        double r30 = 0.725d / Math.pow(r32, 0.2d);
        double[] r122 = {Math.pow(((r113[0] * r52) * r23) / 100.0d, 0.42d), Math.pow(((r113[1] * r52) * r192) / 100.0d, 0.42d), Math.pow(((r113[2] * r52) * r212) / 100.0d, 0.42d)};
        double r02 = r122[0];
        double r10 = (r02 * 400.0d) / (r02 + 27.13d);
        double r03 = r122[1];
        double r193 = (r03 * 400.0d) / (r03 + 27.13d);
        double r04 = r122[2];
        double[] r05 = {r10, r193, (400.0d * r04) / (r04 + 27.13d)};
        k = new fb0(r32, ((r05[2] * 0.05d) + ((r05[0] * 2.0d) + r05[1])) * r30, r30, r30, 0.69d, 1.0d, r113, r52, Math.pow(r52, 0.25d), r43);
        return;
    L6:
        if (r112 <= 1.0d) goto L8;
        r112 = 1.0d;
        goto L8
    }

    public fb0(double r1, double r3, double r5, double r7, double r9, double r11, double[] r13, double r14, double r16, double r18) {
        this.f = r1;
        this.a = r3;
        this.b = r5;
        this.c = r7;
        this.d = r9;
        this.e = r11;
        this.g = r13;
        this.h = r14;
        this.i = r16;
        this.j = r18;
    }
}
