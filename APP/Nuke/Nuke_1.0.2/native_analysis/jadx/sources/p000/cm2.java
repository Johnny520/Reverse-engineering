package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class cm2 extends yh1 {

    /* JADX INFO: renamed from: a */
    public final nl2 f1624a;

    public cm2(nl2 nl2Var) {
        this.f1624a = nl2Var;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof cm2) {
            return t11.m5086l(this.f1624a, ((cm2) obj).f1624a);
        }
        return false;
    }

    @Override // p000.yh1
    /* JADX INFO: renamed from: f */
    public final th1 mo199f() {
        il2 il2Var = new il2();
        il2Var.f4676v = this.f1624a;
        il2Var.f4677w = true;
        return il2Var;
    }

    @Override // p000.yh1
    /* JADX INFO: renamed from: g */
    public final void mo200g(th1 th1Var) {
        il2 il2Var = (il2) th1Var;
        il2Var.f4676v = this.f1624a;
        il2Var.f4677w = true;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + hk1.m2205d(this.f1624a.hashCode() * 31, 31, false);
    }
}
