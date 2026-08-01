package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class r00 {

    /* JADX INFO: renamed from: j */
    public static int f5263j;

    /* JADX INFO: renamed from: k */
    public static final C0675r3 f5264k = new C0675r3(22);

    /* JADX INFO: renamed from: a */
    public final String f5265a;

    /* JADX INFO: renamed from: b */
    public final float f5266b;

    /* JADX INFO: renamed from: c */
    public final float f5267c;

    /* JADX INFO: renamed from: d */
    public final float f5268d;

    /* JADX INFO: renamed from: e */
    public final float f5269e;

    /* JADX INFO: renamed from: f */
    public final hb1 f5270f;

    /* JADX INFO: renamed from: g */
    public final long f5271g;

    /* JADX INFO: renamed from: h */
    public final int f5272h;

    /* JADX INFO: renamed from: i */
    public final int f5273i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public r00(String str, float f, float f2, float f3, float f4, hb1 hb1Var, long j, int i) {
        int i2;
        synchronized (f5264k) {
            i2 = f5263j;
            f5263j = i2 + 1;
        }
        this.f5265a = str;
        this.f5266b = f;
        this.f5267c = f2;
        this.f5268d = f3;
        this.f5269e = f4;
        this.f5270f = hb1Var;
        this.f5271g = j;
        this.f5272h = i;
        this.f5273i = i2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r00)) {
            return false;
        }
        r00 r00Var = (r00) obj;
        return p30.m3002l(this.f5265a, r00Var.f5265a) && C0520np.m2732b(this.f5266b, r00Var.f5266b) && C0520np.m2732b(this.f5267c, r00Var.f5267c) && this.f5268d == r00Var.f5268d && this.f5269e == r00Var.f5269e && this.f5270f.equals(r00Var.f5270f) && C0207ff.m1094c(this.f5271g, r00Var.f5271g) && this.f5272h == r00Var.f5272h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iHashCode = (this.f5270f.hashCode() + AbstractC0748t1.m4143a(this.f5269e, AbstractC0748t1.m4143a(this.f5268d, AbstractC0748t1.m4143a(this.f5267c, AbstractC0748t1.m4143a(this.f5266b, this.f5265a.hashCode() * 31, 31), 31), 31), 31)) * 31;
        int i = C0207ff.f1708h;
        return Boolean.hashCode(false) + AbstractC0748t1.m4144b(this.f5272h, AbstractC0748t1.m4146d(this.f5271g, iHashCode, 31), 31);
    }
}
