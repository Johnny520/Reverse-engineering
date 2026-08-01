package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
final class i70 extends te0 {

    /* JADX INFO: renamed from: a */
    public final l70 f2471a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public i70(l70 l70Var) {
        this.f2471a = l70Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.te0
    /* JADX INFO: renamed from: e */
    public final oe0 mo228e() {
        j70 j70Var = new j70();
        j70Var.f2767r = this.f2471a;
        return j70Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i70) && this.f2471a == ((i70) obj).f2471a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.te0
    /* JADX INFO: renamed from: f */
    public final void mo229f(oe0 oe0Var) {
        j70 j70Var = (j70) oe0Var;
        l70 l70Var = j70Var.f2767r;
        l70 l70Var2 = this.f2471a;
        if (p30.m3002l(l70Var, l70Var2) || !j70Var.f4529d.f4542q) {
            return;
        }
        l70 l70Var3 = j70Var.f2767r;
        l70Var3.m1981c();
        l70Var3.f3372b = null;
        j70Var.f2767r = l70Var2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f2471a.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "DisplayingDisappearingItemsElement(animator=" + this.f2471a + ')';
    }
}
