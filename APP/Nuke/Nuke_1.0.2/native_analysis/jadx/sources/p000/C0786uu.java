package p000;

/* JADX INFO: renamed from: uu */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0786uu {

    /* JADX INFO: renamed from: a */
    public static final float[] f11480a;

    /* JADX INFO: renamed from: b */
    public static final float[] f11481b;

    /* JADX INFO: renamed from: c */
    public static final l33 f11482c;

    /* JADX INFO: renamed from: d */
    public static final l33 f11483d;

    /* JADX INFO: renamed from: e */
    public static final ka2 f11484e;

    /* JADX INFO: renamed from: f */
    public static final ka2 f11485f;

    /* JADX INFO: renamed from: g */
    public static final ka2 f11486g;

    /* JADX INFO: renamed from: h */
    public static final ka2 f11487h;

    /* JADX INFO: renamed from: i */
    public static final ka2 f11488i;

    /* JADX INFO: renamed from: j */
    public static final ka2 f11489j;

    /* JADX INFO: renamed from: k */
    public static final ka2 f11490k;

    /* JADX INFO: renamed from: l */
    public static final ka2 f11491l;

    /* JADX INFO: renamed from: m */
    public static final ka2 f11492m;

    /* JADX INFO: renamed from: n */
    public static final ka2 f11493n;

    /* JADX INFO: renamed from: o */
    public static final ka2 f11494o;

    /* JADX INFO: renamed from: p */
    public static final ka2 f11495p;

    /* JADX INFO: renamed from: q */
    public static final ka2 f11496q;

    /* JADX INFO: renamed from: r */
    public static final ka2 f11497r;

    /* JADX INFO: renamed from: s */
    public static final u51 f11498s;

    /* JADX INFO: renamed from: t */
    public static final u51 f11499t;

    /* JADX INFO: renamed from: u */
    public static final ka2 f11500u;

    /* JADX INFO: renamed from: v */
    public static final ka2 f11501v;

    /* JADX INFO: renamed from: w */
    public static final ka2 f11502w;

    /* JADX INFO: renamed from: x */
    public static final ft1 f11503x;

    /* JADX INFO: renamed from: y */
    public static final AbstractC0708su[] f11504y;

    static {
        float[] fArr = {0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f};
        f11480a = fArr;
        float[] fArr2 = {0.67f, 0.33f, 0.21f, 0.71f, 0.14f, 0.08f};
        f11481b = fArr2;
        float[] fArr3 = {0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f};
        l33 l33Var = new l33(2.4d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d);
        l33 l33Var2 = new l33(2.2d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d);
        l33 l33Var3 = new l33(-3.0d, 2.0d, 2.0d, 5.591816309728916d, 0.28466892d, 0.55991073d, -0.685490157d);
        f11482c = l33Var3;
        l33 l33Var4 = new l33(-2.0d, -1.555223d, 1.860454d, 0.012683313515655966d, 18.8515625d, -18.6875d, 6.277394636015326d);
        f11483d = l33Var4;
        qd3 qd3Var = pp0.f8438g;
        ka2 ka2Var = new ka2("sRGB IEC61966-2.1", fArr, qd3Var, l33Var, 0);
        f11484e = ka2Var;
        ka2 ka2Var2 = new ka2("sRGB IEC61966-2.1 (Linear)", fArr, qd3Var, 1.0d, 0.0f, 1.0f, 1);
        f11485f = ka2Var2;
        ka2 ka2Var3 = new ka2("scRGB-nl IEC 61966-2-2:2003", fArr, qd3Var, null, new C0676s(11), new C0676s(12), -0.799f, 2.399f, l33Var, 2);
        f11486g = ka2Var3;
        ka2 ka2Var4 = new ka2("scRGB IEC 61966-2-2:2003", fArr, qd3Var, 1.0d, -0.5f, 7.499f, 3);
        f11487h = ka2Var4;
        ka2 ka2Var5 = new ka2("Rec. ITU-R BT.709-5", new float[]{0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f}, qd3Var, new l33(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d), 4);
        f11488i = ka2Var5;
        ka2 ka2Var6 = new ka2("Rec. ITU-R BT.2020-1", new float[]{0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f}, qd3Var, new l33(2.2222222222222223d, 0.9096697898662786d, 0.09033021013372146d, 0.2222222222222222d, 0.08145d), 5);
        f11489j = ka2Var6;
        ka2 ka2Var7 = new ka2("SMPTE RP 431-2-2007 DCI (P3)", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, new qd3(0.314f, 0.351f), 2.6d, 0.0f, 1.0f, 6);
        f11490k = ka2Var7;
        ka2 ka2Var8 = new ka2("Display P3", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, qd3Var, l33Var, 7);
        f11491l = ka2Var8;
        ka2 ka2Var9 = new ka2("NTSC (1953)", fArr2, pp0.f8435d, new l33(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d), 8);
        f11492m = ka2Var9;
        ka2 ka2Var10 = new ka2("SMPTE-C RGB", new float[]{0.63f, 0.34f, 0.31f, 0.595f, 0.155f, 0.07f}, qd3Var, new l33(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d), 9);
        f11493n = ka2Var10;
        ka2 ka2Var11 = new ka2("Adobe RGB (1998)", new float[]{0.64f, 0.33f, 0.21f, 0.71f, 0.15f, 0.06f}, qd3Var, 2.2d, 0.0f, 1.0f, 10);
        f11494o = ka2Var11;
        ka2 ka2Var12 = new ka2("ROMM RGB ISO 22028-2:2013", new float[]{0.7347f, 0.2653f, 0.1596f, 0.8404f, 0.0366f, 1.0E-4f}, pp0.f8436e, new l33(1.8d, 1.0d, 0.0d, 0.0625d, 0.031248d), 11);
        f11495p = ka2Var12;
        qd3 qd3Var2 = pp0.f8437f;
        ka2 ka2Var13 = new ka2("SMPTE ST 2065-1:2012 ACES", new float[]{0.7347f, 0.2653f, 0.0f, 1.0f, 1.0E-4f, -0.077f}, qd3Var2, 1.0d, -65504.0f, 65504.0f, 12);
        f11496q = ka2Var13;
        ka2 ka2Var14 = new ka2("Academy S-2014-004 ACEScg", new float[]{0.713f, 0.293f, 0.165f, 0.83f, 0.128f, 0.044f}, qd3Var2, 1.0d, -65504.0f, 65504.0f, 13);
        f11497r = ka2Var14;
        u51 u51Var = new u51(14, 1, 12884901889L, "Generic XYZ");
        f11498s = u51Var;
        u51 u51Var2 = new u51(15, 0, 12884901890L, "Generic L*a*b*");
        f11499t = u51Var2;
        ka2 ka2Var15 = new ka2("None", fArr, qd3Var, l33Var2, 16);
        f11500u = ka2Var15;
        ka2 ka2Var16 = new ka2("Hybrid Log Gamma encoding", fArr3, qd3Var, null, new C0676s(13), new C0676s(14), 0.0f, 1.0f, l33Var3, 17);
        f11501v = ka2Var16;
        ka2 ka2Var17 = new ka2("Perceptual Quantizer encoding", fArr3, qd3Var, null, new C0676s(15), new C0676s(16), 0.0f, 1.0f, l33Var4, 18);
        f11502w = ka2Var17;
        ft1 ft1Var = new ft1("Oklab", 12884901890L, 19);
        f11503x = ft1Var;
        f11504y = new AbstractC0708su[]{ka2Var, ka2Var2, ka2Var3, ka2Var4, ka2Var5, ka2Var6, ka2Var7, ka2Var8, ka2Var9, ka2Var10, ka2Var11, ka2Var12, ka2Var13, ka2Var14, u51Var, u51Var2, ka2Var15, ka2Var16, ka2Var17, ft1Var};
    }

    /* JADX INFO: renamed from: a */
    public static double m5578a(l33 l33Var, double d) {
        double d2 = d < 0.0d ? -1.0d : 1.0d;
        double d3 = d * d2;
        double d4 = l33Var.f5908b;
        double d5 = l33Var.f5909c;
        double d6 = l33Var.f5910d;
        double d7 = l33Var.f5911e;
        double d8 = l33Var.f5912f;
        double d9 = d4 * d3;
        return (l33Var.f5913g + 1.0d) * d2 * (d9 <= 1.0d ? Math.pow(d9, d5) : Math.exp((d3 - d8) * d6) + d7);
    }

    /* JADX INFO: renamed from: b */
    public static double m5579b(l33 l33Var, double d) {
        double d2 = d < 0.0d ? -1.0d : 1.0d;
        double d3 = 1.0d / l33Var.f5908b;
        double d4 = 1.0d / l33Var.f5909c;
        double d5 = 1.0d / l33Var.f5910d;
        double d6 = l33Var.f5911e;
        double d7 = l33Var.f5912f;
        double d8 = (d * d2) / (l33Var.f5913g + 1.0d);
        return d2 * (d8 <= 1.0d ? Math.pow(d8, d4) * d3 : (Math.log(d8 - d6) * d5) + d7);
    }

    /* JADX INFO: renamed from: c */
    public static double m5580c(l33 l33Var, double d) {
        double d2 = d < 0.0d ? -1.0d : 1.0d;
        double d3 = d * d2;
        double d4 = l33Var.f5908b;
        double d5 = l33Var.f5910d;
        double dPow = (Math.pow(d3, d5) * l33Var.f5909c) + d4;
        return Math.pow((dPow >= 0.0d ? dPow : 0.0d) / ((Math.pow(d3, d5) * l33Var.f5912f) + l33Var.f5911e), l33Var.f5913g) * d2;
    }

    /* JADX INFO: renamed from: d */
    public static double m5581d(l33 l33Var, double d) {
        double d2 = d < 0.0d ? -1.0d : 1.0d;
        double d3 = d * d2;
        double d4 = -l33Var.f5908b;
        double d5 = l33Var.f5911e;
        double d6 = 1.0d / l33Var.f5913g;
        return Math.pow(Math.max((Math.pow(d3, d6) * d5) + d4, 0.0d) / ((Math.pow(d3, d6) * (-l33Var.f5912f)) + l33Var.f5909c), 1.0d / l33Var.f5910d) * d2;
    }
}
