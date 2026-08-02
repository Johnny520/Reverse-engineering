package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class sx0 {

    /* JADX INFO: renamed from: k */
    public static int f10396k;

    /* JADX INFO: renamed from: l */
    public static final C0160eb f10397l = new C0160eb(28);

    /* JADX INFO: renamed from: a */
    public final String f10398a;

    /* JADX INFO: renamed from: b */
    public final float f10399b;

    /* JADX INFO: renamed from: c */
    public final float f10400c;

    /* JADX INFO: renamed from: d */
    public final float f10401d;

    /* JADX INFO: renamed from: e */
    public final float f10402e;

    /* JADX INFO: renamed from: f */
    public final r93 f10403f;

    /* JADX INFO: renamed from: g */
    public final long f10404g;

    /* JADX INFO: renamed from: h */
    public final int f10405h;

    /* JADX INFO: renamed from: i */
    public final boolean f10406i;

    /* JADX INFO: renamed from: j */
    public final int f10407j;

    public sx0(String str, float f, float f2, float f3, float f4, r93 r93Var, long j, int i, boolean z) {
        int i2;
        synchronized (f10397l) {
            i2 = f10396k;
            f10396k = i2 + 1;
        }
        this.f10398a = str;
        this.f10399b = f;
        this.f10400c = f2;
        this.f10401d = f3;
        this.f10402e = f4;
        this.f10403f = r93Var;
        this.f10404g = j;
        this.f10405h = i;
        this.f10406i = z;
        this.f10407j = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sx0)) {
            return false;
        }
        sx0 sx0Var = (sx0) obj;
        return t11.m5086l(this.f10398a, sx0Var.f10398a) && za0.m6404b(this.f10399b, sx0Var.f10399b) && za0.m6404b(this.f10400c, sx0Var.f10400c) && this.f10401d == sx0Var.f10401d && this.f10402e == sx0Var.f10402e && this.f10403f.equals(sx0Var.f10403f) && C0363ju.m2566c(this.f10404g, sx0Var.f10404g) && this.f10405h == sx0Var.f10405h && this.f10406i == sx0Var.f10406i;
    }

    public final int hashCode() {
        int iHashCode = (this.f10403f.hashCode() + vi0.m5684c(this.f10402e, vi0.m5684c(this.f10401d, vi0.m5684c(this.f10400c, vi0.m5684c(this.f10399b, this.f10398a.hashCode() * 31, 31), 31), 31), 31)) * 31;
        int i = C0363ju.f5218h;
        return Boolean.hashCode(this.f10406i) + vi0.m5685d(this.f10405h, hk1.m2204c(iHashCode, 31, this.f10404g), 31);
    }
}
