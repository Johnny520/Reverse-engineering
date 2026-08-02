package p000;

/* JADX INFO: renamed from: im */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
final class C0318im extends yh1 {

    /* JADX INFO: renamed from: a */
    public final C0086cc f4678a;

    public C0318im(C0086cc c0086cc) {
        this.f4678a = c0086cc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0318im) {
            return this.f4678a == ((C0318im) obj).f4678a;
        }
        return false;
    }

    @Override // p000.yh1
    /* JADX INFO: renamed from: f */
    public final th1 mo199f() {
        return new C0392km(this.f4678a);
    }

    @Override // p000.yh1
    /* JADX INFO: renamed from: g */
    public final void mo200g(th1 th1Var) {
        C0392km c0392km = (C0392km) th1Var;
        C0086cc c0086cc = this.f4678a;
        c0392km.f5631v = c0086cc;
        if (c0392km.f10770u) {
            c0086cc.mo5j(c0392km.f5632w);
        }
    }

    public final int hashCode() {
        return this.f4678a.hashCode();
    }
}
