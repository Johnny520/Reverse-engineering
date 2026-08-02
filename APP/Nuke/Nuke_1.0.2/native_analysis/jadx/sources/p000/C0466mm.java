package p000;

/* JADX INFO: renamed from: mm */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
final class C0466mm extends yh1 {

    /* JADX INFO: renamed from: a */
    public final C0548om f6719a;

    public C0466mm(C0548om c0548om) {
        this.f6719a = c0548om;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0466mm) {
            return t11.m5086l(this.f6719a, ((C0466mm) obj).f6719a);
        }
        return false;
    }

    @Override // p000.yh1
    /* JADX INFO: renamed from: f */
    public final th1 mo199f() {
        C0585pm c0585pm = new C0585pm();
        c0585pm.f8403v = this.f6719a;
        return c0585pm;
    }

    @Override // p000.yh1
    /* JADX INFO: renamed from: g */
    public final void mo200g(th1 th1Var) {
        C0585pm c0585pm = (C0585pm) th1Var;
        C0548om c0548om = c0585pm.f8403v;
        if (c0548om != null) {
            c0548om.f7729a.m6431j(c0585pm);
        }
        C0548om c0548om2 = this.f6719a;
        if (c0548om2 != null) {
            c0548om2.f7729a.m6423b(c0585pm);
        }
        c0585pm.f8403v = c0548om2;
    }

    public final int hashCode() {
        return this.f6719a.hashCode();
    }
}
