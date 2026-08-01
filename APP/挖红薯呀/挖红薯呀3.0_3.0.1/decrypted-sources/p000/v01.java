package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class v01 {

    /* JADX INFO: renamed from: d */
    public static final v01 f6368d = new v01(p30.m2993c(4278190080L), 0, 0.0f);

    /* JADX INFO: renamed from: a */
    public final long f6369a;

    /* JADX INFO: renamed from: b */
    public final long f6370b;

    /* JADX INFO: renamed from: c */
    public final float f6371c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public v01(long j, long j2, float f) {
        this.f6369a = j;
        this.f6370b = j2;
        this.f6371c = f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v01)) {
            return false;
        }
        v01 v01Var = (v01) obj;
        return C0207ff.m1094c(this.f6369a, v01Var.f6369a) && ok0.m2931b(this.f6370b, v01Var.f6370b) && this.f6371c == v01Var.f6371c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int i = C0207ff.f1708h;
        return Float.hashCode(this.f6371c) + AbstractC0748t1.m4146d(this.f6370b, Long.hashCode(this.f6369a) * 31, 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder("Shadow(color=");
        AbstractC0748t1.m4158p(this.f6369a, sb, ", offset=");
        sb.append((Object) ok0.m2936g(this.f6370b));
        sb.append(", blurRadius=");
        return AbstractC0748t1.m4155m(sb, this.f6371c, ')');
    }
}
