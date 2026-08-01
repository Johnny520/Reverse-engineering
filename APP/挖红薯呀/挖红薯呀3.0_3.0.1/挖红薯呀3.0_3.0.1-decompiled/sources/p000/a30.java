package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class a30 {

    /* JADX INFO: renamed from: e */
    public static final a30 f38e = new a30(0, 0, 0, 0);

    /* JADX INFO: renamed from: a */
    public final int f39a;

    /* JADX INFO: renamed from: b */
    public final int f40b;

    /* JADX INFO: renamed from: c */
    public final int f41c;

    /* JADX INFO: renamed from: d */
    public final int f42d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public a30(int i, int i2, int i3, int i4) {
        this.f39a = i;
        this.f40b = i2;
        this.f41c = i3;
        this.f42d = i4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a30)) {
            return false;
        }
        a30 a30Var = (a30) obj;
        return this.f39a == a30Var.f39a && this.f40b == a30Var.f40b && this.f41c == a30Var.f41c && this.f42d == a30Var.f42d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Integer.hashCode(this.f42d) + AbstractC0748t1.m4144b(this.f41c, AbstractC0748t1.m4144b(this.f40b, Integer.hashCode(this.f39a) * 31, 31), 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "IntRect.fromLTRB(" + this.f39a + ", " + this.f40b + ", " + this.f41c + ", " + this.f42d + ')';
    }
}
