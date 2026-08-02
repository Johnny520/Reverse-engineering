package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class uy2 implements ry2 {

    /* JADX INFO: renamed from: h */
    public final long f11563h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ vy2 f11564i;

    public uy2(vy2 vy2Var, long j) {
        this.f11564i = vy2Var;
        this.f11563h = j;
    }

    @Override // p000.ry2
    /* JADX INFO: renamed from: h */
    public final long mo1767h(c61 c61Var) {
        c61 c61Var2 = (c61) this.f11564i.f12229y.getValue();
        if (c61Var2 != null) {
            return c61Var.mo651r(c61Var2, this.f11563h);
        }
        nz0.m3459d("Tried to open context menu before the anchor was placed.");
        C0676s.m4644b();
        return 0L;
    }

    @Override // p000.ry2
    /* JADX INFO: renamed from: n */
    public final o62 mo1768n(c61 c61Var) {
        return AbstractC0179eu.m1467q(mo1767h(c61Var), 0L);
    }

    @Override // p000.ry2
    /* JADX INFO: renamed from: v0 */
    public final qy2 mo1769v0() {
        return pp0.m3917o(this.f11564i);
    }
}
