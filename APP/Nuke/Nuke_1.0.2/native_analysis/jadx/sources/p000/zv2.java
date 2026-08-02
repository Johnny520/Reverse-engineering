package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
final class zv2 extends yh1 {

    /* JADX INFO: renamed from: a */
    public final xm0 f14115a;

    public zv2(xm0 xm0Var) {
        this.f14115a = xm0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zv2) {
            return this.f14115a == ((zv2) obj).f14115a;
        }
        return false;
    }

    @Override // p000.yh1
    /* JADX INFO: renamed from: f */
    public final th1 mo199f() {
        return new aw2(this.f14115a);
    }

    @Override // p000.yh1
    /* JADX INFO: renamed from: g */
    public final void mo200g(th1 th1Var) {
        ((aw2) th1Var).f421x = this.f14115a;
    }

    public final int hashCode() {
        return this.f14115a.hashCode();
    }
}
