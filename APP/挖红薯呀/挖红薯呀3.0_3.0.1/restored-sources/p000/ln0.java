package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class ln0 implements jn0 {

    /* JADX INFO: renamed from: a */
    public final float f3527a;

    /* JADX INFO: renamed from: b */
    public final float f3528b;

    /* JADX INFO: renamed from: c */
    public final float f3529c;

    /* JADX INFO: renamed from: d */
    public final float f3530d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ln0(float f, float f2, float f3, float f4) {
        this.f3527a = f;
        this.f3528b = f2;
        this.f3529c = f3;
        this.f3530d = f4;
        if (!((f >= 0.0f) & (f2 >= 0.0f) & (f3 >= 0.0f)) || !(f4 >= 0.0f)) {
            u10.m4244a("Padding must be non-negative");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.jn0
    /* JADX INFO: renamed from: a */
    public final float mo224a(k50 k50Var) {
        return k50Var == k50.f3015d ? this.f3527a : this.f3529c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.jn0
    /* JADX INFO: renamed from: b */
    public final float mo225b(k50 k50Var) {
        return k50Var == k50.f3015d ? this.f3529c : this.f3527a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.jn0
    /* JADX INFO: renamed from: c */
    public final float mo226c() {
        return this.f3530d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.jn0
    /* JADX INFO: renamed from: d */
    public final float mo227d() {
        return this.f3528b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (!(obj instanceof ln0)) {
            return false;
        }
        ln0 ln0Var = (ln0) obj;
        return C0520np.m2732b(this.f3527a, ln0Var.f3527a) && C0520np.m2732b(this.f3528b, ln0Var.f3528b) && C0520np.m2732b(this.f3529c, ln0Var.f3529c) && C0520np.m2732b(this.f3530d, ln0Var.f3530d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Float.hashCode(this.f3530d) + AbstractC0748t1.m4143a(this.f3529c, AbstractC0748t1.m4143a(this.f3528b, Float.hashCode(this.f3527a) * 31, 31), 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "PaddingValues(start=" + ((Object) C0520np.m2733c(this.f3527a)) + ", top=" + ((Object) C0520np.m2733c(this.f3528b)) + ", end=" + ((Object) C0520np.m2733c(this.f3529c)) + ", bottom=" + ((Object) C0520np.m2733c(this.f3530d)) + ')';
    }
}
