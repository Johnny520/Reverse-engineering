package p217p0;

import p029F0.C0363A;

/* JADX INFO: renamed from: p0.d */
/* JADX INFO: loaded from: classes.dex */
public final class C2873d {

    /* JADX INFO: renamed from: a */
    public static final float[] f9071a;

    /* JADX INFO: renamed from: b */
    public static final float[] f9072b;

    /* JADX INFO: renamed from: c */
    public static final C2887r f9073c;

    /* JADX INFO: renamed from: d */
    public static final C2887r f9074d;

    /* JADX INFO: renamed from: e */
    public static final C2886q f9075e;

    /* JADX INFO: renamed from: f */
    public static final C2886q f9076f;

    /* JADX INFO: renamed from: g */
    public static final C2886q f9077g;

    /* JADX INFO: renamed from: h */
    public static final C2886q f9078h;

    /* JADX INFO: renamed from: i */
    public static final C2886q f9079i;

    /* JADX INFO: renamed from: j */
    public static final C2886q f9080j;

    /* JADX INFO: renamed from: k */
    public static final C2886q f9081k;

    /* JADX INFO: renamed from: l */
    public static final C2886q f9082l;

    /* JADX INFO: renamed from: m */
    public static final C2886q f9083m;

    /* JADX INFO: renamed from: n */
    public static final C2886q f9084n;

    /* JADX INFO: renamed from: o */
    public static final C2886q f9085o;

    /* JADX INFO: renamed from: p */
    public static final C2886q f9086p;

    /* JADX INFO: renamed from: q */
    public static final C2886q f9087q;

    /* JADX INFO: renamed from: r */
    public static final C2886q f9088r;

    /* JADX INFO: renamed from: s */
    public static final C2880k f9089s;

    /* JADX INFO: renamed from: t */
    public static final C2880k f9090t;

    /* JADX INFO: renamed from: u */
    public static final C2886q f9091u;

    /* JADX INFO: renamed from: v */
    public static final C2886q f9092v;

    /* JADX INFO: renamed from: w */
    public static final C2886q f9093w;

    /* JADX INFO: renamed from: x */
    public static final C2881l f9094x;

    /* JADX INFO: renamed from: y */
    public static final AbstractC2872c[] f9095y;

    static {
        float[] fArr = {0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f};
        f9071a = fArr;
        float[] fArr2 = {0.67f, 0.33f, 0.21f, 0.71f, 0.14f, 0.08f};
        f9072b = fArr2;
        float[] fArr3 = {0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f};
        C2887r c2887r = new C2887r(2.4d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d);
        C2887r c2887r2 = new C2887r(2.2d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d);
        C2887r c2887r3 = new C2887r(-3.0d, 2.0d, 2.0d, 5.591816309728916d, 0.28466892d, 0.55991073d, -0.685490157d);
        f9073c = c2887r3;
        C2887r c2887r4 = new C2887r(-2.0d, -1.555223d, 1.860454d, 0.012683313515655966d, 18.8515625d, -18.6875d, 6.277394636015326d);
        f9074d = c2887r4;
        C2888s c2888s = AbstractC2879j.f9107d;
        C2886q c2886q = new C2886q("sRGB IEC61966-2.1", fArr, c2888s, c2887r, 0);
        f9075e = c2886q;
        C2886q c2886q2 = new C2886q("sRGB IEC61966-2.1 (Linear)", fArr, c2888s, 1.0d, 0.0f, 1.0f, 1);
        f9076f = c2886q2;
        C2886q c2886q3 = new C2886q("scRGB-nl IEC 61966-2-2:2003", fArr, c2888s, null, new C0363A(14), new C0363A(15), -0.799f, 2.399f, c2887r, 2);
        f9077g = c2886q3;
        C2886q c2886q4 = new C2886q("scRGB IEC 61966-2-2:2003", fArr, c2888s, 1.0d, -0.5f, 7.499f, 3);
        f9078h = c2886q4;
        C2886q c2886q5 = new C2886q("Rec. ITU-R BT.709-5", new float[]{0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f}, c2888s, new C2887r(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d), 4);
        f9079i = c2886q5;
        C2886q c2886q6 = new C2886q("Rec. ITU-R BT.2020-1", new float[]{0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f}, c2888s, new C2887r(2.2222222222222223d, 0.9096697898662786d, 0.09033021013372146d, 0.2222222222222222d, 0.08145d), 5);
        f9080j = c2886q6;
        C2886q c2886q7 = new C2886q("SMPTE RP 431-2-2007 DCI (P3)", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, new C2888s(0.314f, 0.351f), 2.6d, 0.0f, 1.0f, 6);
        f9081k = c2886q7;
        C2886q c2886q8 = new C2886q("Display P3", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, c2888s, c2887r, 7);
        f9082l = c2886q8;
        C2886q c2886q9 = new C2886q("NTSC (1953)", fArr2, AbstractC2879j.f9104a, new C2887r(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d), 8);
        f9083m = c2886q9;
        C2886q c2886q10 = new C2886q("SMPTE-C RGB", new float[]{0.63f, 0.34f, 0.31f, 0.595f, 0.155f, 0.07f}, c2888s, new C2887r(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d), 9);
        f9084n = c2886q10;
        C2886q c2886q11 = new C2886q("Adobe RGB (1998)", new float[]{0.64f, 0.33f, 0.21f, 0.71f, 0.15f, 0.06f}, c2888s, 2.2d, 0.0f, 1.0f, 10);
        f9085o = c2886q11;
        C2886q c2886q12 = new C2886q("ROMM RGB ISO 22028-2:2013", new float[]{0.7347f, 0.2653f, 0.1596f, 0.8404f, 0.0366f, 1.0E-4f}, AbstractC2879j.f9105b, new C2887r(1.8d, 1.0d, 0.0d, 0.0625d, 0.031248d), 11);
        f9086p = c2886q12;
        C2888s c2888s2 = AbstractC2879j.f9106c;
        C2886q c2886q13 = new C2886q("SMPTE ST 2065-1:2012 ACES", new float[]{0.7347f, 0.2653f, 0.0f, 1.0f, 1.0E-4f, -0.077f}, c2888s2, 1.0d, -65504.0f, 65504.0f, 12);
        f9087q = c2886q13;
        C2886q c2886q14 = new C2886q("Academy S-2014-004 ACEScg", new float[]{0.713f, 0.293f, 0.165f, 0.83f, 0.128f, 0.044f}, c2888s2, 1.0d, -65504.0f, 65504.0f, 13);
        f9088r = c2886q14;
        C2880k c2880k = new C2880k(14, 1, AbstractC2871b.f9064b, "Generic XYZ");
        f9089s = c2880k;
        long j5 = AbstractC2871b.f9065c;
        C2880k c2880k2 = new C2880k(15, 0, j5, "Generic L*a*b*");
        f9090t = c2880k2;
        C2886q c2886q15 = new C2886q("None", fArr, c2888s, c2887r2, 16);
        f9091u = c2886q15;
        C2886q c2886q16 = new C2886q("Hybrid Log Gamma encoding", fArr3, c2888s, null, new C0363A(16), new C0363A(17), 0.0f, 1.0f, c2887r3, 17);
        f9092v = c2886q16;
        C2886q c2886q17 = new C2886q("Perceptual Quantizer encoding", fArr3, c2888s, null, new C0363A(18), new C0363A(19), 0.0f, 1.0f, c2887r4, 18);
        f9093w = c2886q17;
        C2881l c2881l = new C2881l("Oklab", j5, 19);
        f9094x = c2881l;
        f9095y = new AbstractC2872c[]{c2886q, c2886q2, c2886q3, c2886q4, c2886q5, c2886q6, c2886q7, c2886q8, c2886q9, c2886q10, c2886q11, c2886q12, c2886q13, c2886q14, c2880k, c2880k2, c2886q15, c2886q16, c2886q17, c2881l};
    }

    /* JADX INFO: renamed from: a */
    public static double m5076a(C2887r c2887r, double d5) {
        double d6 = d5 < 0.0d ? -1.0d : 1.0d;
        double d7 = d5 * d6;
        double d8 = c2887r.f9138b;
        double d9 = c2887r.f9139c;
        double d10 = c2887r.f9140d;
        double d11 = c2887r.f9141e;
        double d12 = c2887r.f9142f;
        double d13 = d8 * d7;
        return (c2887r.f9143g + 1.0d) * d6 * (d13 <= 1.0d ? Math.pow(d13, d9) : Math.exp((d7 - d12) * d10) + d11);
    }

    /* JADX INFO: renamed from: b */
    public static double m5077b(C2887r c2887r, double d5) {
        double d6 = d5 < 0.0d ? -1.0d : 1.0d;
        double d7 = 1.0d / c2887r.f9138b;
        double d8 = 1.0d / c2887r.f9139c;
        double d9 = 1.0d / c2887r.f9140d;
        double d10 = c2887r.f9141e;
        double d11 = c2887r.f9142f;
        double d12 = (d5 * d6) / (c2887r.f9143g + 1.0d);
        return d6 * (d12 <= 1.0d ? Math.pow(d12, d8) * d7 : (Math.log(d12 - d10) * d9) + d11);
    }

    /* JADX INFO: renamed from: c */
    public static double m5078c(C2887r c2887r, double d5) {
        double d6 = d5 < 0.0d ? -1.0d : 1.0d;
        double d7 = d5 * d6;
        double d8 = c2887r.f9138b;
        double d9 = c2887r.f9140d;
        double dPow = (Math.pow(d7, d9) * c2887r.f9139c) + d8;
        return Math.pow((dPow >= 0.0d ? dPow : 0.0d) / ((Math.pow(d7, d9) * c2887r.f9142f) + c2887r.f9141e), c2887r.f9143g) * d6;
    }

    /* JADX INFO: renamed from: d */
    public static double m5079d(C2887r c2887r, double d5) {
        double d6 = d5 < 0.0d ? -1.0d : 1.0d;
        double d7 = d5 * d6;
        double d8 = -c2887r.f9138b;
        double d9 = c2887r.f9141e;
        double d10 = 1.0d / c2887r.f9143g;
        return Math.pow(Math.max((Math.pow(d7, d10) * d9) + d8, 0.0d) / ((Math.pow(d7, d10) * (-c2887r.f9142f)) + c2887r.f9139c), 1.0d / c2887r.f9140d) * d6;
    }
}
