package p000;

/* JADX INFO: renamed from: dl */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
final class C0134dl extends yh1 {

    /* JADX INFO: renamed from: a */
    public final in0 f2104a;

    public C0134dl(in0 in0Var) {
        this.f2104a = in0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0134dl) {
            return this.f2104a == ((C0134dl) obj).f2104a;
        }
        return false;
    }

    @Override // p000.yh1
    /* JADX INFO: renamed from: f */
    public final th1 mo199f() {
        return new C0170el(this.f2104a);
    }

    @Override // p000.yh1
    /* JADX INFO: renamed from: g */
    public final void mo200g(th1 th1Var) {
        zn1 zn1Var;
        C0170el c0170el = (C0170el) th1Var;
        in0 in0Var = this.f2104a;
        c0170el.f2483v = in0Var;
        if (c0170el.f10757h.f10770u && (zn1Var = sp0.m4927Z(c0170el, 2).f13986w) != null) {
            zn1Var.m6473r1(in0Var, true);
        }
    }

    public final int hashCode() {
        return this.f2104a.hashCode();
    }
}
