package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class z71 {

    /* JADX INFO: renamed from: a */
    public final cc2 f13765a;

    /* JADX INFO: renamed from: b */
    public final C0186f0 f13766b;

    /* JADX INFO: renamed from: c */
    public final rk1 f13767c;

    public z71(cc2 cc2Var, C0186f0 c0186f0) {
        this.f13765a = cc2Var;
        this.f13766b = c0186f0;
        long[] jArr = ed2.f2401a;
        this.f13767c = new rk1();
    }

    /* JADX INFO: renamed from: a */
    public final mn0 m6387a(int i, Object obj, Object obj2) {
        rk1 rk1Var = this.f13767c;
        y71 y71Var = (y71) rk1Var.m4505g(obj);
        int i2 = 13;
        if (y71Var != null && y71Var.f13333c == i && t11.m5086l(y71Var.f13332b, obj2)) {
            C0402kw c0402kw = y71Var.f13334d;
            if (c0402kw != null) {
                return c0402kw;
            }
            C0402kw c0402kw2 = new C0402kw(818252804, true, new C0016af(i2, y71Var.f13335e, y71Var));
            y71Var.f13334d = c0402kw2;
            return c0402kw2;
        }
        y71 y71Var2 = new y71(this, i, obj, obj2);
        rk1Var.m4511m(obj, y71Var2);
        C0402kw c0402kw3 = y71Var2.f13334d;
        if (c0402kw3 != null) {
            return c0402kw3;
        }
        C0402kw c0402kw4 = new C0402kw(818252804, true, new C0016af(i2, this, y71Var2));
        y71Var2.f13334d = c0402kw4;
        return c0402kw4;
    }

    /* JADX INFO: renamed from: b */
    public final Object m6388b(Object obj) {
        if (obj == null) {
            return null;
        }
        y71 y71Var = (y71) this.f13767c.m4505g(obj);
        if (y71Var != null) {
            return y71Var.f13332b;
        }
        t81 t81Var = (t81) this.f13766b.mo6a();
        int iM1300g = t81Var.f10610d.m1300g(obj);
        if (iM1300g != -1) {
            return t81Var.m5132b(iM1300g);
        }
        return null;
    }
}
