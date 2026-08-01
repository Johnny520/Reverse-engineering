package p000;

/* JADX INFO: renamed from: gd */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0242gd {

    /* JADX INFO: renamed from: a */
    public final float f1924a;

    /* JADX INFO: renamed from: b */
    public final float f1925b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0242gd(float f, float f2, float f3) {
        this.f1924a = f;
        this.f1925b = f2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C0242gd)) {
            return false;
        }
        C0242gd c0242gd = (C0242gd) obj;
        return C0520np.m2732b(this.f1924a, c0242gd.f1924a) && C0520np.m2732b(0.0f, 0.0f) && C0520np.m2732b(0.0f, 0.0f) && C0520np.m2732b(this.f1925b, c0242gd.f1925b) && C0520np.m2732b(0.0f, 0.0f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Float.hashCode(0.0f) + AbstractC0748t1.m4143a(this.f1925b, AbstractC0748t1.m4143a(0.0f, AbstractC0748t1.m4143a(0.0f, Float.hashCode(this.f1924a) * 31, 31), 31), 31);
    }
}
