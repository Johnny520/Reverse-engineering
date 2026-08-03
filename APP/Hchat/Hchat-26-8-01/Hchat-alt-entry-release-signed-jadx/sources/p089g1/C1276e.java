package p089g1;

import p012ah.C0086a;

/* JADX INFO: renamed from: g1.e */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1276e {

    /* JADX INFO: renamed from: a */
    public static final float[] f4236a;

    /* JADX INFO: renamed from: b */
    public static final float[] f4237b;

    /* JADX INFO: renamed from: c */
    public static final C1290s f4238c;

    /* JADX INFO: renamed from: d */
    public static final C1290s f4239d;

    /* JADX INFO: renamed from: e */
    public static final C1289r f4240e;

    /* JADX INFO: renamed from: f */
    public static final C1289r f4241f;

    /* JADX INFO: renamed from: g */
    public static final C1289r f4242g;

    /* JADX INFO: renamed from: h */
    public static final C1289r f4243h;

    /* JADX INFO: renamed from: i */
    public static final C1289r f4244i;

    /* JADX INFO: renamed from: j */
    public static final C1289r f4245j;

    /* JADX INFO: renamed from: k */
    public static final C1289r f4246k;

    /* JADX INFO: renamed from: l */
    public static final C1289r f4247l;

    /* JADX INFO: renamed from: m */
    public static final C1289r f4248m;

    /* JADX INFO: renamed from: n */
    public static final C1289r f4249n;

    /* JADX INFO: renamed from: o */
    public static final C1289r f4250o;

    /* JADX INFO: renamed from: p */
    public static final C1289r f4251p;

    /* JADX INFO: renamed from: q */
    public static final C1289r f4252q;

    /* JADX INFO: renamed from: r */
    public static final C1289r f4253r;

    /* JADX INFO: renamed from: s */
    public static final C1283l f4254s;

    /* JADX INFO: renamed from: t */
    public static final C1283l f4255t;

    /* JADX INFO: renamed from: u */
    public static final C1289r f4256u;

    /* JADX INFO: renamed from: v */
    public static final C1289r f4257v;

    /* JADX INFO: renamed from: w */
    public static final C1289r f4258w;

    /* JADX INFO: renamed from: x */
    public static final C1284m f4259x;

    /* JADX INFO: renamed from: y */
    public static final AbstractC1274c[] f4260y;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        float[] fArr = {0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f};
        f4236a = fArr;
        float[] fArr2 = {0.67f, 0.33f, 0.21f, 0.71f, 0.14f, 0.08f};
        f4237b = fArr2;
        float[] fArr3 = {0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f};
        C1290s c1290s = new C1290s(2.4d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d);
        C1290s c1290s2 = new C1290s(2.2d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d);
        C1290s c1290s3 = new C1290s(-3.0d, 2.0d, 2.0d, 5.591816309728916d, 0.28466892d, 0.55991073d, -0.685490157d);
        f4238c = c1290s3;
        C1290s c1290s4 = new C1290s(-2.0d, -1.555223d, 1.860454d, 0.012683313515655966d, 18.8515625d, -18.6875d, 6.277394636015326d);
        f4239d = c1290s4;
        C1291t c1291t = AbstractC1282k.f4272d;
        C1289r c1289r = new C1289r("sRGB IEC61966-2.1", fArr, c1291t, c1290s, 0);
        f4240e = c1289r;
        C1289r c1289r2 = new C1289r("sRGB IEC61966-2.1 (Linear)", fArr, c1291t, 1.0d, 0.0f, 1.0f, 1);
        f4241f = c1289r2;
        C1289r c1289r3 = new C1289r("scRGB-nl IEC 61966-2-2:2003", fArr, c1291t, null, new C0086a(28), new C0086a(29), -0.799f, 2.399f, c1290s, 2);
        f4242g = c1289r3;
        C1289r c1289r4 = new C1289r("scRGB IEC 61966-2-2:2003", fArr, c1291t, 1.0d, -0.5f, 7.499f, 3);
        f4243h = c1289r4;
        C1289r c1289r5 = new C1289r("Rec. ITU-R BT.709-5", new float[]{0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f}, c1291t, new C1290s(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d), 4);
        f4244i = c1289r5;
        C1289r c1289r6 = new C1289r("Rec. ITU-R BT.2020-1", new float[]{0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f}, c1291t, new C1290s(2.2222222222222223d, 0.9096697898662786d, 0.09033021013372146d, 0.2222222222222222d, 0.08145d), 5);
        f4245j = c1289r6;
        C1289r c1289r7 = new C1289r("SMPTE RP 431-2-2007 DCI (P3)", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, new C1291t(0.314f, 0.351f), 2.6d, 0.0f, 1.0f, 6);
        f4246k = c1289r7;
        C1289r c1289r8 = new C1289r("Display P3", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, c1291t, c1290s, 7);
        f4247l = c1289r8;
        C1289r c1289r9 = new C1289r("NTSC (1953)", fArr2, AbstractC1282k.f4269a, new C1290s(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d), 8);
        f4248m = c1289r9;
        C1289r c1289r10 = new C1289r("SMPTE-C RGB", new float[]{0.63f, 0.34f, 0.31f, 0.595f, 0.155f, 0.07f}, c1291t, new C1290s(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d), 9);
        f4249n = c1289r10;
        C1289r c1289r11 = new C1289r("Adobe RGB (1998)", new float[]{0.64f, 0.33f, 0.21f, 0.71f, 0.15f, 0.06f}, c1291t, 2.2d, 0.0f, 1.0f, 10);
        f4250o = c1289r11;
        C1289r c1289r12 = new C1289r("ROMM RGB ISO 22028-2:2013", new float[]{0.7347f, 0.2653f, 0.1596f, 0.8404f, 0.0366f, 1.0E-4f}, AbstractC1282k.f4270b, new C1290s(1.8d, 1.0d, 0.0d, 0.0625d, 0.031248d), 11);
        f4251p = c1289r12;
        C1291t c1291t2 = AbstractC1282k.f4271c;
        C1289r c1289r13 = new C1289r("SMPTE ST 2065-1:2012 ACES", new float[]{0.7347f, 0.2653f, 0.0f, 1.0f, 1.0E-4f, -0.077f}, c1291t2, 1.0d, -65504.0f, 65504.0f, 12);
        f4252q = c1289r13;
        C1289r c1289r14 = new C1289r("Academy S-2014-004 ACEScg", new float[]{0.713f, 0.293f, 0.165f, 0.83f, 0.128f, 0.044f}, c1291t2, 1.0d, -65504.0f, 65504.0f, 13);
        f4253r = c1289r14;
        C1283l c1283l = new C1283l(14, 1, AbstractC1273b.f4227b, "Generic XYZ");
        f4254s = c1283l;
        long j3 = AbstractC1273b.f4228c;
        C1283l c1283l2 = new C1283l(15, 0, j3, "Generic L*a*b*");
        f4255t = c1283l2;
        C1289r c1289r15 = new C1289r("None", fArr, c1291t, c1290s2, 16);
        f4256u = c1289r15;
        C1289r c1289r16 = new C1289r("Hybrid Log Gamma encoding", fArr3, c1291t, null, new C1275d(0), new C1275d(1), 0.0f, 1.0f, c1290s3, 17);
        f4257v = c1289r16;
        C1289r c1289r17 = new C1289r("Perceptual Quantizer encoding", fArr3, c1291t, null, new C1275d(2), new C1275d(3), 0.0f, 1.0f, c1290s4, 18);
        f4258w = c1289r17;
        C1284m c1284m = new C1284m(19, "Oklab", j3);
        f4259x = c1284m;
        f4260y = new AbstractC1274c[]{c1289r, c1289r2, c1289r3, c1289r4, c1289r5, c1289r6, c1289r7, c1289r8, c1289r9, c1289r10, c1289r11, c1289r12, c1289r13, c1289r14, c1283l, c1283l2, c1289r15, c1289r16, c1289r17, c1284m};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static double m3417a(C1290s c1290s, double d10) {
        double d11 = d10 < 0.0d ? -1.0d : 1.0d;
        double d12 = d10 * d11;
        double d13 = c1290s.f4303b;
        double d14 = c1290s.f4304c;
        double d15 = c1290s.f4305d;
        double d16 = c1290s.f4306e;
        double d17 = c1290s.f4307f;
        double d18 = d13 * d12;
        return (c1290s.f4308g + 1.0d) * d11 * (d18 <= 1.0d ? Math.pow(d18, d14) : Math.exp((d12 - d17) * d15) + d16);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static double m3418b(C1290s c1290s, double d10) {
        double d11 = d10 < 0.0d ? -1.0d : 1.0d;
        double d12 = 1.0d / c1290s.f4303b;
        double d13 = 1.0d / c1290s.f4304c;
        double d14 = 1.0d / c1290s.f4305d;
        double d15 = c1290s.f4306e;
        double d16 = c1290s.f4307f;
        double d17 = (d10 * d11) / (c1290s.f4308g + 1.0d);
        return d11 * (d17 <= 1.0d ? Math.pow(d17, d13) * d12 : (Math.log(d17 - d15) * d14) + d16);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static double m3419c(C1290s c1290s, double d10) {
        double d11 = d10 < 0.0d ? -1.0d : 1.0d;
        double d12 = d10 * d11;
        double d13 = c1290s.f4303b;
        double d14 = c1290s.f4305d;
        double dPow = (Math.pow(d12, d14) * c1290s.f4304c) + d13;
        return Math.pow((dPow >= 0.0d ? dPow : 0.0d) / ((Math.pow(d12, d14) * c1290s.f4307f) + c1290s.f4306e), c1290s.f4308g) * d11;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static double m3420d(C1290s c1290s, double d10) {
        double d11 = d10 < 0.0d ? -1.0d : 1.0d;
        double d12 = d10 * d11;
        double d13 = -c1290s.f4303b;
        double d14 = c1290s.f4306e;
        double d15 = 1.0d / c1290s.f4308g;
        return Math.pow(Math.max((Math.pow(d12, d15) * d14) + d13, 0.0d) / ((Math.pow(d12, d15) * (-c1290s.f4307f)) + c1290s.f4304c), 1.0d / c1290s.f4305d) * d11;
    }
}
