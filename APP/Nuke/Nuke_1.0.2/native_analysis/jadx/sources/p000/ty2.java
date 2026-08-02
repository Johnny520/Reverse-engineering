package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
final class ty2 extends yh1 {

    /* JADX INFO: renamed from: a */
    public final uz2 f11003a;

    public ty2(uz2 uz2Var) {
        this.f11003a = uz2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ty2) {
            return this.f11003a == ((ty2) obj).f11003a;
        }
        return false;
    }

    @Override // p000.yh1
    /* JADX INFO: renamed from: f */
    public final th1 mo199f() {
        return new vy2(this.f11003a);
    }

    @Override // p000.yh1
    /* JADX INFO: renamed from: g */
    public final void mo200g(th1 th1Var) {
        ((vy2) th1Var).f12228x = this.f11003a;
    }

    public final int hashCode() {
        return this.f11003a.hashCode();
    }
}
