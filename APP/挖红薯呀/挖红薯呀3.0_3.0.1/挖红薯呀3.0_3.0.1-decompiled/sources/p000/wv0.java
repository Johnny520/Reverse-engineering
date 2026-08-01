package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class wv0 implements f10 {

    /* JADX INFO: renamed from: a */
    public final boolean f7195a;

    /* JADX INFO: renamed from: b */
    public final float f7196b;

    /* JADX INFO: renamed from: c */
    public final long f7197c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public wv0(boolean z, float f, long j) {
        this.f7195a = z;
        this.f7196b = f;
        this.f7197c = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.f10
    /* JADX INFO: renamed from: a */
    public final InterfaceC0694rm mo979a(g30 g30Var) {
        return new C0808um(g30Var, this.f7195a, this.f7196b, new C0910x1(22, this));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wv0)) {
            return false;
        }
        wv0 wv0Var = (wv0) obj;
        if (this.f7195a == wv0Var.f7195a && C0520np.m2732b(this.f7196b, wv0Var.f7196b)) {
            return C0207ff.m1094c(this.f7197c, wv0Var.f7197c);
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.f10
    public final int hashCode() {
        int iM4143a = AbstractC0748t1.m4143a(this.f7196b, Boolean.hashCode(this.f7195a) * 31, 961);
        int i = C0207ff.f1708h;
        return Long.hashCode(this.f7197c) + iM4143a;
    }
}
