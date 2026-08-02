package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class va0 {

    /* JADX INFO: renamed from: b */
    public static final va0 f11856b = new va0(2);

    /* JADX INFO: renamed from: c */
    public static final va0 f11857c = new va0(0);

    /* JADX INFO: renamed from: d */
    public static final va0 f11858d;

    /* JADX INFO: renamed from: e */
    public static final va0 f11859e;

    /* JADX INFO: renamed from: f */
    public static final va0 f11860f;

    /* JADX INFO: renamed from: g */
    public static final mv1 f11861g;

    /* JADX INFO: renamed from: h */
    public static final boolean f11862h;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f11863a;

    static {
        va0 va0Var = new va0(1);
        f11858d = va0Var;
        f11859e = new va0(3);
        f11860f = va0Var;
        f11861g = mv1.m3211a("com.bumptech.glide.load.resource.bitmap.Downsampler.DownsampleStrategy", va0Var);
        f11862h = true;
    }

    public /* synthetic */ va0(int i) {
        this.f11863a = i;
    }

    /* JADX INFO: renamed from: a */
    public final int m5658a(int i, int i2, int i3, int i4) {
        switch (this.f11863a) {
            case 0:
                if (m5659b(i, i2, i3, i4) == 1.0f) {
                    return 2;
                }
                return f11856b.m5658a(i, i2, i3, i4);
            case 1:
                return 2;
            case 2:
                return f11862h ? 2 : 1;
            default:
                return 2;
        }
    }

    /* JADX INFO: renamed from: b */
    public final float m5659b(int i, int i2, int i3, int i4) {
        switch (this.f11863a) {
            case 0:
                return Math.min(1.0f, f11856b.m5659b(i, i2, i3, i4));
            case 1:
                return Math.max(i3 / i, i4 / i2);
            case 2:
                if (f11862h) {
                    return Math.min(i3 / i, i4 / i2);
                }
                if (Math.max(i2 / i4, i / i3) == 0) {
                    return 1.0f;
                }
                return 1.0f / Integer.highestOneBit(r1);
            default:
                return 1.0f;
        }
    }
}
