package p000;

/* JADX INFO: renamed from: re */
/* JADX INFO: loaded from: classes.dex */
public final class C2457re {

    /* JADX INFO: renamed from: b */
    public static final C2457re f8656b = new C2457re(2);

    /* JADX INFO: renamed from: c */
    public static final C2457re f8657c = new C2457re(0);

    /* JADX INFO: renamed from: d */
    public static final C2457re f8658d;

    /* JADX INFO: renamed from: e */
    public static final C2457re f8659e;

    /* JADX INFO: renamed from: f */
    public static final C2457re f8660f;

    /* JADX INFO: renamed from: g */
    public static final C2601ut f8661g;

    /* JADX INFO: renamed from: h */
    public static final boolean f8662h;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f8663a;

    static {
        C2457re c2457re = new C2457re(1);
        f8658d = c2457re;
        f8659e = new C2457re(3);
        f8660f = c2457re;
        f8661g = C2601ut.m5116a("com.bumptech.glide.load.resource.bitmap.Downsampler.DownsampleStrategy", c2457re);
        f8662h = true;
    }

    public /* synthetic */ C2457re(int i) {
        this.f8663a = i;
    }

    /* JADX INFO: renamed from: a */
    public final int m4948a(int i, int i2, int i3, int i4) {
        switch (this.f8663a) {
            case 0:
                if (m4949b(i, i2, i3, i4) != 1.0f) {
                    break;
                }
                break;
            case 2:
                if (f8662h) {
                }
                break;
        }
        return 2;
    }

    /* JADX INFO: renamed from: b */
    public final float m4949b(int i, int i2, int i3, int i4) {
        switch (this.f8663a) {
            case 0:
                return Math.min(1.0f, f8656b.m4949b(i, i2, i3, i4));
            case 1:
                return Math.max(i3 / i, i4 / i2);
            case 2:
                if (f8662h) {
                    return Math.min(i3 / i, i4 / i2);
                }
                if (Math.max(i2 / i4, i / i3) == 0) {
                    return 1.0f;
                }
                return 1.0f / Integer.highestOneBit(r2);
            default:
                return 1.0f;
        }
    }
}
