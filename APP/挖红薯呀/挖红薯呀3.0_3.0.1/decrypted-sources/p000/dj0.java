package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
final class dj0 extends te0 {

    /* JADX INFO: renamed from: a */
    public final aj0 f1136a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public dj0(aj0 aj0Var) {
        this.f1136a = aj0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.te0
    /* JADX INFO: renamed from: e */
    public final oe0 mo228e() {
        return new gj0(this.f1136a, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        return (obj instanceof dj0) && p30.m3002l(((dj0) obj).f1136a, this.f1136a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.te0
    /* JADX INFO: renamed from: f */
    public final void mo229f(oe0 oe0Var) {
        gj0 gj0Var = (gj0) oe0Var;
        gj0Var.f2001r = this.f1136a;
        C0948y2 c0948y2 = gj0Var.f2002s;
        if (((gj0) c0948y2.f7491d) == gj0Var) {
            c0948y2.f7491d = null;
        }
        C0948y2 c0948y22 = new C0948y2();
        gj0Var.f2002s = c0948y22;
        if (gj0Var.f4542q) {
            c0948y22.f7491d = gj0Var;
            c0948y22.f7492e = null;
            gj0Var.f2003t = null;
            c0948y22.f7493f = new C0310i7(7, gj0Var);
            c0948y22.f7494g = gj0Var.m2879k0();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f1136a.hashCode() * 31;
    }
}
