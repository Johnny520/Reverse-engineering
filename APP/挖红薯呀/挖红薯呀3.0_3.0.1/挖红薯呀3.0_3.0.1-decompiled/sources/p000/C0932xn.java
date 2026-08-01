package p000;

/* JADX INFO: renamed from: xn */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0932xn {

    /* JADX INFO: renamed from: a */
    public final boolean f7376a = true;

    /* JADX INFO: renamed from: b */
    public final boolean f7377b = true;

    /* JADX INFO: renamed from: c */
    public final mz0 f7378c = mz0.f4088d;

    /* JADX INFO: renamed from: d */
    public final boolean f7379d = true;

    /* JADX INFO: renamed from: e */
    public final boolean f7380e = true;

    /* JADX INFO: renamed from: f */
    public final String f7381f = "";

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0932xn)) {
            return false;
        }
        C0932xn c0932xn = (C0932xn) obj;
        return this.f7376a == c0932xn.f7376a && this.f7377b == c0932xn.f7377b && this.f7378c == c0932xn.f7378c && this.f7379d == c0932xn.f7379d && this.f7380e == c0932xn.f7380e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Boolean.hashCode(this.f7380e) + AbstractC0748t1.m4145c((this.f7378c.hashCode() + AbstractC0748t1.m4145c(Boolean.hashCode(this.f7376a) * 31, 31, this.f7377b)) * 31, 31, this.f7379d);
    }
}
